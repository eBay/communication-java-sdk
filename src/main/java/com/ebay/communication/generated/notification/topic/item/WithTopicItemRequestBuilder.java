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

package com.ebay.communication.generated.notification.topic.item;

import com.ebay.communication.generated.notification.models.Topic;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /topic/{topic_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTopicItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithTopicItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/topic/{topic_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTopicItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/topic/{topic_id}", rawUrl);
    }
    /**
     * This method allows applications to retrieve details for the specified topic. This information includes supported schema versions, formats, and other metadata for the topic.&lt;br&gt;&lt;br&gt;Applications can subscribe to any of the topics for a supported schema version and format, limited by the authorization scopes required to subscribe to the topic.&lt;br&gt;&lt;br&gt;A topic specifies the type of information to be received and the data types associated with an event. An event occurs in the eBay system, such as when a user requests deletion or revokes access for an application. An event is an instance of an event type (topic).&lt;br&gt;&lt;br&gt;Specify the topic to retrieve using the &lt;b&gt;topic_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopics&quot;&gt;getTopics&lt;/a&gt; method to find a topic if you do not know the topic ID.&lt;/span&gt;
     * @return a {@link Topic}
     */
    @jakarta.annotation.Nullable
    public Topic get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve details for the specified topic. This information includes supported schema versions, formats, and other metadata for the topic.&lt;br&gt;&lt;br&gt;Applications can subscribe to any of the topics for a supported schema version and format, limited by the authorization scopes required to subscribe to the topic.&lt;br&gt;&lt;br&gt;A topic specifies the type of information to be received and the data types associated with an event. An event occurs in the eBay system, such as when a user requests deletion or revokes access for an application. An event is an instance of an event type (topic).&lt;br&gt;&lt;br&gt;Specify the topic to retrieve using the &lt;b&gt;topic_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopics&quot;&gt;getTopics&lt;/a&gt; method to find a topic if you do not know the topic ID.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Topic}
     */
    @jakarta.annotation.Nullable
    public Topic get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Topic::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to retrieve details for the specified topic. This information includes supported schema versions, formats, and other metadata for the topic.&lt;br&gt;&lt;br&gt;Applications can subscribe to any of the topics for a supported schema version and format, limited by the authorization scopes required to subscribe to the topic.&lt;br&gt;&lt;br&gt;A topic specifies the type of information to be received and the data types associated with an event. An event occurs in the eBay system, such as when a user requests deletion or revokes access for an application. An event is an instance of an event type (topic).&lt;br&gt;&lt;br&gt;Specify the topic to retrieve using the &lt;b&gt;topic_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopics&quot;&gt;getTopics&lt;/a&gt; method to find a topic if you do not know the topic ID.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve details for the specified topic. This information includes supported schema versions, formats, and other metadata for the topic.&lt;br&gt;&lt;br&gt;Applications can subscribe to any of the topics for a supported schema version and format, limited by the authorization scopes required to subscribe to the topic.&lt;br&gt;&lt;br&gt;A topic specifies the type of information to be received and the data types associated with an event. An event occurs in the eBay system, such as when a user requests deletion or revokes access for an application. An event is an instance of an event type (topic).&lt;br&gt;&lt;br&gt;Specify the topic to retrieve using the &lt;b&gt;topic_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Use the &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopics&quot;&gt;getTopics&lt;/a&gt; method to find a topic if you do not know the topic ID.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithTopicItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTopicItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTopicItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
