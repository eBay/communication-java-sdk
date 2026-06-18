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
import com.ebay.communication.generated.message.MessageApiClient;
import com.ebay.communication.generated.message.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Message API (M2M - Member to Member).
 * Provides methods to manage conversations and send messages between eBay members.
 */
public final class MessageClient {
    private final MessageApiClient kiota;
    private final CommunicationConfiguration config;

    public MessageClient(MessageApiClient kiota, CommunicationConfiguration config) {
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
     * Get a specific conversation by ID.
     * @param conversationId The conversation ID.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<GetMessagesByConversationIdResponse> getConversationAsync(
            String conversationId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("conversationId", conversationId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.conversation().byConversation_id(conversationId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get conversations for the authenticated user.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<GetAllMyConversationsResponse> getConversationsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.conversation().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Send a message in a conversation.
     * @param body The message details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<SendMessageResponse> sendMessageAsync(
            SendMessageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sendMessage().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Update a conversation (e.g., mark as read).
     * @param body The update details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<Void> updateConversationAsync(
            UpdateConversationRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.updateConversation().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    /**
     * Bulk update conversations.
     * @param body The bulk update details.
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional request options for custom headers.
     */
    public CompletableFuture<BulkUpdateConversationsResponse> bulkUpdateConversationAsync(
            BulkUpdateConversationsRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkUpdateConversation().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
