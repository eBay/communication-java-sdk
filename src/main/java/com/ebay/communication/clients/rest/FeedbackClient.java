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
import com.ebay.communication.generated.feedback.FeedbackApiClient;
import com.ebay.communication.generated.feedback.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Feedback API.
 * Provides methods to manage seller feedback and ratings.
 */
public final class FeedbackClient {
    private final FeedbackApiClient kiota;
    private final CommunicationConfiguration config;

    public FeedbackClient(FeedbackApiClient kiota, CommunicationConfiguration config) {
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
     * Get feedback entries for the authenticated user.
     * @param accessToken Per-call token; overrides config fallback. Pass null to use config token.
     * @param requestOptions Optional request options for custom headers (e.g., marketplace ID).
     */
    public CompletableFuture<GetFeedbackResponse> getFeedbackAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedback().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get feedback rating summary for the authenticated user.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<GetFeedbackRatingSummaryResponse> getFeedbackRatingSummaryAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedbackRatingSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get items awaiting feedback.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<AwaitingFeedbackResponse> getItemsAwaitingFeedbackAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.awaitingFeedback().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Leave feedback for a transaction.
     * @param body The feedback details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<LeaveFeedbackResponse> leaveFeedbackAsync(
            LeaveFeedbackRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedback().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Respond to feedback.
     * @param body The response details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<Void> respondToFeedbackAsync(
            RespondToFeedbackRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.respondToFeedback().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }
}
