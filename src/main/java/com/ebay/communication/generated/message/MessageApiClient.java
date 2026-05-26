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

package com.ebay.communication.generated.message;

import com.ebay.communication.generated.message.bulk_update_conversation.BulkUpdateConversationRequestBuilder;
import com.ebay.communication.generated.message.conversation.ConversationRequestBuilder;
import com.ebay.communication.generated.message.send_message.SendMessageRequestBuilder;
import com.ebay.communication.generated.message.update_conversation.UpdateConversationRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageApiClient extends BaseRequestBuilder {
    /**
     * The bulk_update_conversation property
     * @return a {@link BulkUpdateConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateConversationRequestBuilder bulkUpdateConversation() {
        return new BulkUpdateConversationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The conversation property
     * @return a {@link ConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationRequestBuilder conversation() {
        return new ConversationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The send_message property
     * @return a {@link SendMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMessageRequestBuilder sendMessage() {
        return new SendMessageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_conversation property
     * @return a {@link UpdateConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateConversationRequestBuilder updateConversation() {
        return new UpdateConversationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MessageApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessageApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
