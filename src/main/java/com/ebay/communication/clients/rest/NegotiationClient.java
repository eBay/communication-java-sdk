package com.ebay.communication.clients.rest;

import com.ebay.communication.configuration.CommunicationConfiguration;
import com.ebay.communication.configuration.RequestOptions;
import com.ebay.communication.configuration.TokenContext;
import com.ebay.communication.generated.negotiation.NegotiationApiClient;
import com.ebay.communication.generated.negotiation.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Negotiation API.
 * Provides methods to send promotional offers to interested buyers.
 */
public final class NegotiationClient {
    private final NegotiationApiClient kiota;
    private final CommunicationConfiguration config;

    public NegotiationClient(NegotiationApiClient kiota, CommunicationConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    /**
     * Find items eligible for sending offers to interested buyers.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<PagedEligibleItemCollection> findEligibleItemsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.findEligibleItems().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Send an offer to interested buyers for a specific item.
     * @param body The offer details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<SendOfferToInterestedBuyersCollectionResponse> sendOfferToInterestedBuyersAsync(
            CreateOffersRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sendOfferToInterestedBuyers().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }
}
