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

package com.ebay.communication.generated.notification.destination;

import com.ebay.communication.generated.notification.destination.item.WithDestinationItemRequestBuilder;
import com.ebay.communication.generated.notification.models.DestinationRequest;
import com.ebay.communication.generated.notification.models.DestinationSearchResponse;
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
 * Builds and executes requests for operations under /destination
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DestinationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.communication.generated.notification.destination.item collection
     * @param destination_id The unique identifier of the destination to retrieve. Use &lt;b&gt;getDestinations&lt;/b&gt; to retrieve destination IDs.
     * @return a {@link WithDestinationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithDestinationItemRequestBuilder byDestination_id(@jakarta.annotation.Nonnull final String destination_id) {
        Objects.requireNonNull(destination_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("destination_id", destination_id);
        return new WithDestinationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DestinationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DestinationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/destination{?continuation_token*,limit*}", pathParameters);
    }
    /**
     * Instantiates a new {@link DestinationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DestinationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/destination{?continuation_token*,limit*}", rawUrl);
    }
    /**
     * This method allows applications to retrieve a paginated collection of destination resources and related details. The details include the destination names, statuses, and configurations, including the endpoints and verification tokens.
     * @return a {@link DestinationSearchResponse}
     */
    @jakarta.annotation.Nullable
    public DestinationSearchResponse get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve a paginated collection of destination resources and related details. The details include the destination names, statuses, and configurations, including the endpoints and verification tokens.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DestinationSearchResponse}
     */
    @jakarta.annotation.Nullable
    public DestinationSearchResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DestinationSearchResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to create a destination. A destination is an endpoint that receives HTTP push notifications.&lt;br&gt;&lt;br&gt;A single destination for all topics is valid, as is individual destinations for each topic.&lt;br&gt;&lt;br&gt;To update a destination, use the &lt;strong&gt;updateDestination&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;The destination created will need to be referenced while creating or updating a subscription to a topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @return a {@link DestinationPostResponse}
     */
    @jakarta.annotation.Nullable
    public DestinationPostResponse post(@jakarta.annotation.Nonnull final DestinationRequest body) {
        return post(body, null);
    }
    /**
     * This method allows applications to create a destination. A destination is an endpoint that receives HTTP push notifications.&lt;br&gt;&lt;br&gt;A single destination for all topics is valid, as is individual destinations for each topic.&lt;br&gt;&lt;br&gt;To update a destination, use the &lt;strong&gt;updateDestination&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;The destination created will need to be referenced while creating or updating a subscription to a topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DestinationPostResponse}
     */
    @jakarta.annotation.Nullable
    public DestinationPostResponse post(@jakarta.annotation.Nonnull final DestinationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DestinationPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to retrieve a paginated collection of destination resources and related details. The details include the destination names, statuses, and configurations, including the endpoints and verification tokens.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve a paginated collection of destination resources and related details. The details include the destination names, statuses, and configurations, including the endpoints and verification tokens.
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
     * This method allows applications to create a destination. A destination is an endpoint that receives HTTP push notifications.&lt;br&gt;&lt;br&gt;A single destination for all topics is valid, as is individual destinations for each topic.&lt;br&gt;&lt;br&gt;To update a destination, use the &lt;strong&gt;updateDestination&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;The destination created will need to be referenced while creating or updating a subscription to a topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DestinationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows applications to create a destination. A destination is an endpoint that receives HTTP push notifications.&lt;br&gt;&lt;br&gt;A single destination for all topics is valid, as is individual destinations for each topic.&lt;br&gt;&lt;br&gt;To update a destination, use the &lt;strong&gt;updateDestination&lt;/strong&gt; call.&lt;br&gt;&lt;br&gt;The destination created will need to be referenced while creating or updating a subscription to a topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DestinationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DestinationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DestinationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DestinationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method allows applications to retrieve a paginated collection of destination resources and related details. The details include the destination names, statuses, and configurations, including the endpoints and verification tokens.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This string value can be used to return the next page in the result set. The string to use here is returned in the &lt;b&gt;next&lt;/b&gt; field of the current page of results.
         */
        @jakarta.annotation.Nullable
        public String continuationToken;
        /**
         * The maximum number of destinations to return per page from the result set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min:&lt;/b&gt; 10&lt;br&gt;&lt;br&gt;&lt;b&gt;Max:&lt;/b&gt; 100&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 20
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("continuation_token", continuationToken);
            allQueryParams.put("limit", limit);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
