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

package com.ebay.communication.generated.notification;

import com.ebay.communication.generated.notification.config.ConfigRequestBuilder;
import com.ebay.communication.generated.notification.destination.DestinationRequestBuilder;
import com.ebay.communication.generated.notification.public_key.PublicKeyRequestBuilder;
import com.ebay.communication.generated.notification.subscription.SubscriptionRequestBuilder;
import com.ebay.communication.generated.notification.topic.TopicRequestBuilder;
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
public class NotificationApiClient extends BaseRequestBuilder {
    /**
     * The config property
     * @return a {@link ConfigRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The destination property
     * @return a {@link DestinationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DestinationRequestBuilder destination() {
        return new DestinationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The public_key property
     * @return a {@link PublicKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublicKeyRequestBuilder publicKey() {
        return new PublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subscription property
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder subscription() {
        return new SubscriptionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The topic property
     * @return a {@link TopicRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TopicRequestBuilder topic() {
        return new TopicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link NotificationApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
