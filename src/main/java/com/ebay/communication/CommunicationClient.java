package com.ebay.communication;

import com.ebay.communication.clients.graphql.DynamicGraphQLClient;
import com.ebay.communication.clients.rest.FeedbackClient;
import com.ebay.communication.clients.rest.MessageClient;
import com.ebay.communication.clients.rest.NegotiationClient;
import com.ebay.communication.clients.rest.NotificationClient;
import com.ebay.communication.configuration.CommunicationConfiguration;
import com.ebay.communication.configuration.KiotaAuthProvider;
import com.ebay.communication.generated.feedback.FeedbackApiClient;
import com.ebay.communication.generated.message.MessageApiClient;
import com.ebay.communication.generated.negotiation.NegotiationApiClient;
import com.ebay.communication.generated.notification.NotificationApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;

/**
 * Main facade for the Communication SDK.
 * Provides unified access to Feedback, Message, Notification, and Negotiation APIs plus GraphQL.
 *
 * <pre>{@code
 * var config = new CommunicationConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new CommunicationClient(config)) {
 *     var conversations = sdk.message.getConversationsAsync(null).join();
 *     System.out.println(conversations);
 * }
 * }</pre>
 */
public final class CommunicationClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final FeedbackClient feedback;
    public final MessageClient message;
    public final NotificationClient notification;
    public final NegotiationClient negotiation;
    public final DynamicGraphQLClient graphQL;

    public CommunicationClient(CommunicationConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Feedback API client
        var feedbackAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        feedbackAdapter.setBaseUrl(config.getFeedbackBaseUrl());
        this.feedback = new FeedbackClient(new FeedbackApiClient(feedbackAdapter), config);

        // Message API client
        var messageAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        messageAdapter.setBaseUrl(config.getMessageBaseUrl());
        this.message = new MessageClient(new MessageApiClient(messageAdapter), config);

        // Notification API client
        var notificationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        notificationAdapter.setBaseUrl(config.getNotificationBaseUrl());
        this.notification = new NotificationClient(new NotificationApiClient(notificationAdapter), config);

        // Negotiation API client
        var negotiationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        negotiationAdapter.setBaseUrl(config.getNegotiationBaseUrl());
        this.negotiation = new NegotiationClient(new NegotiationApiClient(negotiationAdapter), config);

        // GraphQL client
        this.graphQL = new DynamicGraphQLClient(sharedHttpClient, config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
