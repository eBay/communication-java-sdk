// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.communication.clients.rest;

import com.ebay.communication.configuration.CommunicationConfiguration;
import com.ebay.communication.configuration.RequestOptions;
import com.ebay.communication.configuration.TokenContext;
import com.ebay.communication.generated.notification.NotificationApiClient;
import com.ebay.communication.generated.notification.models.*;
import com.ebay.communication.generated.notification.destination.DestinationPostResponse;
import com.ebay.communication.generated.notification.subscription.SubscriptionPostResponse;
import com.ebay.communication.generated.notification.subscription.item.filter.FilterPostResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Notification API.
 * Provides methods to manage notification subscriptions, destinations, and topics.
 */
public final class NotificationClient {
    private final NotificationApiClient kiota;
    private final CommunicationConfiguration config;

    public NotificationClient(NotificationApiClient kiota, CommunicationConfiguration config) {
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

    // Config operations
    public CompletableFuture<Config> getConfigAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.config().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateConfigAsync(Config body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.config().put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    // Destination operations
    public CompletableFuture<DestinationPostResponse> createDestinationAsync(
            DestinationRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.destination().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Destination> getDestinationAsync(
            String destinationId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("destinationId", destinationId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.destination().byDestination_id(destinationId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<DestinationSearchResponse> getDestinationsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.destination().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateDestinationAsync(
            String destinationId, DestinationRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("destinationId", destinationId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.destination().byDestination_id(destinationId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteDestinationAsync(
            String destinationId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("destinationId", destinationId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.destination().byDestination_id(destinationId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    // Subscription operations
    public CompletableFuture<SubscriptionPostResponse> createSubscriptionAsync(
            CreateSubscriptionRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Subscription> getSubscriptionAsync(
            String subscriptionId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().bySubscription_id(subscriptionId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SubscriptionSearchResponse> getSubscriptionsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateSubscriptionAsync(
            String subscriptionId, UpdateSubscriptionRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteSubscriptionAsync(
            String subscriptionId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> enableSubscriptionAsync(
            String subscriptionId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).enable().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> disableSubscriptionAsync(
            String subscriptionId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).disable().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> testSubscriptionAsync(
            String subscriptionId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).test().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    // Subscription filter operations
    public CompletableFuture<FilterPostResponse> createSubscriptionFilterAsync(
            String subscriptionId, CreateSubscriptionFilterRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().bySubscription_id(subscriptionId).filter().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SubscriptionFilter> getSubscriptionFilterAsync(
            String subscriptionId, String filterId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        Params.requireValid("filterId", filterId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().bySubscription_id(subscriptionId).filter().byFilter_id(filterId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteSubscriptionFilterAsync(
            String subscriptionId, String filterId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("subscriptionId", subscriptionId);
        Params.requireValid("filterId", filterId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.subscription().bySubscription_id(subscriptionId).filter().byFilter_id(filterId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    // Topic operations
    public CompletableFuture<Topic> getTopicAsync(
            String topicId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("topicId", topicId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.topic().byTopic_id(topicId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<TopicSearchResponse> getTopicsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.topic().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    // Public key operation
    public CompletableFuture<PublicKey> getPublicKeyAsync(
            String publicKeyId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("publicKeyId", publicKeyId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.publicKey().byPublic_key_id(publicKeyId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
