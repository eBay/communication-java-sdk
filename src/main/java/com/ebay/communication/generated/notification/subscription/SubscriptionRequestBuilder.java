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

package com.ebay.communication.generated.notification.subscription;

import com.ebay.communication.generated.notification.models.CreateSubscriptionRequest;
import com.ebay.communication.generated.notification.models.Error;
import com.ebay.communication.generated.notification.models.SubscriptionSearchResponse;
import com.ebay.communication.generated.notification.subscription.item.WithSubscriptionItemRequestBuilder;
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
 * Builds and executes requests for operations under /subscription
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.communication.generated.notification.subscription.item collection
     * @param subscription_id The unique identifier of the subscription to retrieve. Use &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-getsubscriptions&quot;&gt;getSubscriptions&lt;/a&gt; to retrieve subscription IDs.
     * @return a {@link WithSubscriptionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSubscriptionItemRequestBuilder bySubscription_id(@jakarta.annotation.Nonnull final String subscription_id) {
        Objects.requireNonNull(subscription_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription_id", subscription_id);
        return new WithSubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubscriptionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription{?continuation_token*,limit*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SubscriptionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription{?continuation_token*,limit*}", rawUrl);
    }
    /**
     * This method allows applications to retrieve a list of all subscriptions. The list returned is a paginated collection of subscription resources.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @return a {@link SubscriptionSearchResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionSearchResponse get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve a list of all subscriptions. The list returned is a paginated collection of subscription resources.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscriptionSearchResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionSearchResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscriptionSearchResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to create a subscription for a topic and supported schema version. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;Each application and topic-schema pairing to a subscription should have a 1:1 cardinality.&lt;br&gt;&lt;br&gt;You can create the subscription in disabled mode, test it (see the &lt;b&gt;test&lt;/b&gt; method), and when everything is ready, you can enable the subscription (see the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt; method).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If an application is not authorized to subscribe to a topic, for example, if your authorization does not include the list of scopes required for the topic, an error code of 195011 is returned.&lt;/span&gt;
     * @param body The create subscription request.
     * @return a {@link SubscriptionPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionPostResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body) {
        return post(body, null);
    }
    /**
     * This method allows applications to create a subscription for a topic and supported schema version. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;Each application and topic-schema pairing to a subscription should have a 1:1 cardinality.&lt;br&gt;&lt;br&gt;You can create the subscription in disabled mode, test it (see the &lt;b&gt;test&lt;/b&gt; method), and when everything is ready, you can enable the subscription (see the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt; method).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If an application is not authorized to subscribe to a topic, for example, if your authorization does not include the list of scopes required for the topic, an error code of 195011 is returned.&lt;/span&gt;
     * @param body The create subscription request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscriptionPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionPostResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscriptionPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to retrieve a list of all subscriptions. The list returned is a paginated collection of subscription resources.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve a list of all subscriptions. The list returned is a paginated collection of subscription resources.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
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
     * This method allows applications to create a subscription for a topic and supported schema version. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;Each application and topic-schema pairing to a subscription should have a 1:1 cardinality.&lt;br&gt;&lt;br&gt;You can create the subscription in disabled mode, test it (see the &lt;b&gt;test&lt;/b&gt; method), and when everything is ready, you can enable the subscription (see the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt; method).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If an application is not authorized to subscribe to a topic, for example, if your authorization does not include the list of scopes required for the topic, an error code of 195011 is returned.&lt;/span&gt;
     * @param body The create subscription request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows applications to create a subscription for a topic and supported schema version. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;Each application and topic-schema pairing to a subscription should have a 1:1 cardinality.&lt;br&gt;&lt;br&gt;You can create the subscription in disabled mode, test it (see the &lt;b&gt;test&lt;/b&gt; method), and when everything is ready, you can enable the subscription (see the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt; method).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If an application is not authorized to subscribe to a topic, for example, if your authorization does not include the list of scopes required for the topic, an error code of 195011 is returned.&lt;/span&gt;
     * @param body The create subscription request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubscriptionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method allows applications to retrieve a list of all subscriptions. The list returned is a paginated collection of subscription resources.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This string value can be used to return the next page in the result set. The string to use here is returned in the next field of the current page of results.
         */
        @jakarta.annotation.Nullable
        public String continuationToken;
        /**
         * The maximum number of subscriptions to return per page from the result set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min:&lt;/b&gt; 10&lt;br&gt;&lt;br&gt;&lt;b&gt;Max:&lt;/b&gt; 100&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 20
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
