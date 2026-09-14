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

public final class FeedbackClient {
    private final FeedbackApiClient kiota;
    private final CommunicationConfiguration config;

    public FeedbackClient(FeedbackApiClient kiota, CommunicationConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<AwaitingFeedbackResponse> getItemsAwaitingFeedbackAsync(
            String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.awaitingFeedback().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (sort != null) config.queryParameters.sort = sort;
            });
        }));
    }

    public CompletableFuture<GetFeedbackResponse> getFeedbackAsync(
            String feedbackId, String feedbackType, String filter, String limit, String listingId, String offset, String orderLineItemId, String sort, String transactionId, String userId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedback().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (feedbackId != null) config.queryParameters.feedbackId = feedbackId;
                if (feedbackType != null) config.queryParameters.feedbackType = feedbackType;
                if (filter != null) config.queryParameters.filter = filter;
                if (limit != null) config.queryParameters.limit = limit;
                if (listingId != null) config.queryParameters.listingId = listingId;
                if (offset != null) config.queryParameters.offset = offset;
                if (orderLineItemId != null) config.queryParameters.orderLineItemId = orderLineItemId;
                if (sort != null) config.queryParameters.sort = sort;
                if (transactionId != null) config.queryParameters.transactionId = transactionId;
                if (userId != null) config.queryParameters.userId = userId;
            });
        }));
    }

    public CompletableFuture<LeaveFeedbackResponse> leaveFeedbackAsync(
            LeaveFeedbackRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedback().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetFeedbackRatingSummaryResponse> getFeedbackRatingSummaryAsync(
            String filter, String userId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.feedbackRatingSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (userId != null) config.queryParameters.userId = userId;
            });
        }));
    }

    public CompletableFuture<Object> respondToFeedbackAsync(
            RespondToFeedbackRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.respondToFeedback().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
