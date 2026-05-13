package com.ebay.communication.clients.graphql;

import com.ebay.communication.configuration.CommunicationConfiguration;
import com.ebay.communication.configuration.TokenContext;
import com.ebay.communication.exceptions.GraphQLException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import okhttp3.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Dynamic GraphQL client for executing arbitrary GraphQL queries.
 * Returns raw JsonNode for flexible response handling.
 */
public final class DynamicGraphQLClient {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final OkHttpClient http;
    private final CommunicationConfiguration config;

    public DynamicGraphQLClient(OkHttpClient http, CommunicationConfiguration config) {
        this.http = http;
        this.config = config;
    }

    /**
     * Execute a GraphQL query or mutation.
     * @param query The GraphQL query string.
     * @param variables The variables object (or null).
     * @param accessToken Per-call token; overrides config fallback.
     * @return The GraphQL response as JsonNode.
     * @throws GraphQLException if the response contains errors.
     */
    public JsonNode execute(String query, Object variables, String accessToken) {
        String token = accessToken != null ? accessToken
            : TokenContext.CURRENT.get() != null ? TokenContext.CURRENT.get()
            : config.getAccessToken();
        if (token == null) {
            throw new IllegalStateException(
                "No access token. Pass accessToken or set CommunicationConfiguration.accessToken.");
        }

        ObjectNode body = MAPPER.createObjectNode();
        body.put("query", query);
        if (variables != null) {
            body.set("variables", MAPPER.valueToTree(variables));
        }

        try {
            Request request = new Request.Builder()
                .url(config.getGraphQLBaseUrl())
                .addHeader("Authorization", "Bearer " + token)
                .post(RequestBody.create(MAPPER.writeValueAsBytes(body), JSON))
                .build();

            try (Response resp = http.newCall(request).execute()) {
                if (!resp.isSuccessful()) {
                    throw new GraphQLException(List.of("HTTP " + resp.code() + ": " + resp.message()));
                }

                JsonNode root = MAPPER.readTree(resp.body().bytes());
                JsonNode errors = root.get("errors");
                if (errors != null && errors.isArray() && !errors.isEmpty()) {
                    List<String> msgs = new ArrayList<>();
                    errors.forEach(e -> msgs.add(e.path("message").asText()));
                    throw new GraphQLException(msgs);
                }
                return root;
            }
        } catch (IOException e) {
            throw new RuntimeException("GraphQL request failed", e);
        }
    }
}
