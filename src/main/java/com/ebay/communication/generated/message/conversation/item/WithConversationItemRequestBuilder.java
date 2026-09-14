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

package com.ebay.communication.generated.message.conversation.item;

import com.ebay.communication.generated.message.models.GetMessagesByConversationIdResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /conversation/{conversation_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithConversationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithConversationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConversationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversation/{conversation_id}?conversation_type={conversation_type}{&limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithConversationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConversationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversation/{conversation_id}?conversation_type={conversation_type}{&limit*,offset*}", rawUrl);
    }
    /**
     * This method can be used to retrieve messages within a specific conversation.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conversation_id&lt;/strong&gt; of the conversation for which to retrieve messages is required as a path parameter and the &lt;strong&gt;conversation_type&lt;/strong&gt; of the conversation is required as a query parameter.
     * @return a {@link GetMessagesByConversationIdResponse}
     */
    @jakarta.annotation.Nullable
    public GetMessagesByConversationIdResponse get() {
        return get(null);
    }
    /**
     * This method can be used to retrieve messages within a specific conversation.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conversation_id&lt;/strong&gt; of the conversation for which to retrieve messages is required as a path parameter and the &lt;strong&gt;conversation_type&lt;/strong&gt; of the conversation is required as a query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetMessagesByConversationIdResponse}
     */
    @jakarta.annotation.Nullable
    public GetMessagesByConversationIdResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetMessagesByConversationIdResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to retrieve messages within a specific conversation.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conversation_id&lt;/strong&gt; of the conversation for which to retrieve messages is required as a path parameter and the &lt;strong&gt;conversation_type&lt;/strong&gt; of the conversation is required as a query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method can be used to retrieve messages within a specific conversation.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conversation_id&lt;/strong&gt; of the conversation for which to retrieve messages is required as a path parameter and the &lt;strong&gt;conversation_type&lt;/strong&gt; of the conversation is required as a query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithConversationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConversationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithConversationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method can be used to retrieve messages within a specific conversation.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;conversation_id&lt;/strong&gt; of the conversation for which to retrieve messages is required as a path parameter and the &lt;strong&gt;conversation_type&lt;/strong&gt; of the conversation is required as a query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the type of the conversation being retrieved.&lt;br&gt;&lt;br&gt;This parameter is always required when using this method.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Valid values:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FROM_EBAY&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FROM_MEMBERS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String conversationType;
        /**
         * The maximum number of entries that can be returned on each page of the paginated response.&lt;br&gt;&lt;br&gt;Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves entries 11 through 20 from the result set.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If this parameter is omitted, the default value is used.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; 25&lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum:&lt;/strong&gt; 50
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of reports to skip in the result set before returning the first entry in the paginated response.&lt;br&gt;&lt;br&gt;Use this parameter in conjunction with the &lt;strong&gt;limit&lt;/strong&gt; parameter to control the pagination of the output. For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to &lt;code&gt;0&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is set to &lt;code&gt;10&lt;/code&gt;, the first page of the response will contain the first 10 entries from the complete list retrieved by the call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If this parameter is omitted, the default value is used.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("conversation_type", conversationType);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
