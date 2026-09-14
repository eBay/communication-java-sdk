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
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class MessageClient {
    private final MessageApiClient kiota;
    private final CommunicationConfiguration config;

    public MessageClient(MessageApiClient kiota, CommunicationConfiguration config) {
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

    public CompletableFuture<BulkUpdateConversationsResponse> bulkUpdateConversationAsync(
            BulkUpdateConversationsRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkUpdateConversation().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetMessagesByConversationIdResponse> getConversationAsync(
            String conversationId, String conversationType, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.conversation().byConversation_id(Params.requireValid("conversationId", conversationId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (conversationType != null) config.queryParameters.conversationType = conversationType;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetAllMyConversationsResponse> getConversationsAsync(
            String conversationStatus, String conversationType, String endTime, String limit, String offset, String otherPartyUsername, String referenceId, String referenceType, String startTime, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.conversation().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (conversationStatus != null) config.queryParameters.conversationStatus = conversationStatus;
                if (conversationType != null) config.queryParameters.conversationType = conversationType;
                if (endTime != null) config.queryParameters.endTime = endTime;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (otherPartyUsername != null) config.queryParameters.otherPartyUsername = otherPartyUsername;
                if (referenceId != null) config.queryParameters.referenceId = referenceId;
                if (referenceType != null) config.queryParameters.referenceType = referenceType;
                if (startTime != null) config.queryParameters.startTime = startTime;
            });
        }));
    }

    public CompletableFuture<SendMessageResponse> sendMessageAsync(
            SendMessageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sendMessage().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

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
}
