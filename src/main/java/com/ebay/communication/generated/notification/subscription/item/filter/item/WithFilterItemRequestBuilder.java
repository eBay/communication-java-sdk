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

package com.ebay.communication.generated.notification.subscription.item.filter.item;

import com.ebay.communication.generated.notification.models.Error;
import com.ebay.communication.generated.notification.models.SubscriptionFilter;
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
 * Builds and executes requests for operations under /subscription/{subscription_id}/filter/{filter_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithFilterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithFilterItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFilterItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/filter/{filter_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithFilterItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFilterItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/filter/{filter_id}", rawUrl);
    }
    /**
     * This method allows applications to disable the active filter on a subscription, so that a new subscription filter may be added.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Subscription filters in &lt;code&gt;PENDING&lt;/code&gt; status can not be disabled. However, a new filter can be created instead with the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-createsubscriptionfilter&quot;&gt;createSubscriptionFilter&lt;/a&gt;  method and this new filter will override the &lt;code&gt;PENDING&lt;/code&gt; filter.&lt;/span&gt;
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method allows applications to disable the active filter on a subscription, so that a new subscription filter may be added.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Subscription filters in &lt;code&gt;PENDING&lt;/code&gt; status can not be disabled. However, a new filter can be created instead with the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-createsubscriptionfilter&quot;&gt;createSubscriptionFilter&lt;/a&gt;  method and this new filter will override the &lt;code&gt;PENDING&lt;/code&gt; filter.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method allows applications to retrieve the filter details for the specified subscription filter.&lt;br&gt;&lt;br&gt;Specify the subscription filter to retrieve by using the &lt;strong&gt;subscription_id&lt;/strong&gt; and the &lt;strong&gt;filter_id&lt;/strong&gt; associated with the subscription filter. The &lt;strong&gt;filter_id&lt;/strong&gt; can be found in the response body for the &lt;strong&gt;getSubscription&lt;/strong&gt; method, if there is a filter applied on the subscription.&lt;br&gt;&lt;br&gt;Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.
     * @return a {@link SubscriptionFilter}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionFilter get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve the filter details for the specified subscription filter.&lt;br&gt;&lt;br&gt;Specify the subscription filter to retrieve by using the &lt;strong&gt;subscription_id&lt;/strong&gt; and the &lt;strong&gt;filter_id&lt;/strong&gt; associated with the subscription filter. The &lt;strong&gt;filter_id&lt;/strong&gt; can be found in the response body for the &lt;strong&gt;getSubscription&lt;/strong&gt; method, if there is a filter applied on the subscription.&lt;br&gt;&lt;br&gt;Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscriptionFilter}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SubscriptionFilter get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscriptionFilter::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to disable the active filter on a subscription, so that a new subscription filter may be added.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Subscription filters in &lt;code&gt;PENDING&lt;/code&gt; status can not be disabled. However, a new filter can be created instead with the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-createsubscriptionfilter&quot;&gt;createSubscriptionFilter&lt;/a&gt;  method and this new filter will override the &lt;code&gt;PENDING&lt;/code&gt; filter.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method allows applications to disable the active filter on a subscription, so that a new subscription filter may be added.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Subscription filters in &lt;code&gt;PENDING&lt;/code&gt; status can not be disabled. However, a new filter can be created instead with the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-createsubscriptionfilter&quot;&gt;createSubscriptionFilter&lt;/a&gt;  method and this new filter will override the &lt;code&gt;PENDING&lt;/code&gt; filter.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method allows applications to retrieve the filter details for the specified subscription filter.&lt;br&gt;&lt;br&gt;Specify the subscription filter to retrieve by using the &lt;strong&gt;subscription_id&lt;/strong&gt; and the &lt;strong&gt;filter_id&lt;/strong&gt; associated with the subscription filter. The &lt;strong&gt;filter_id&lt;/strong&gt; can be found in the response body for the &lt;strong&gt;getSubscription&lt;/strong&gt; method, if there is a filter applied on the subscription.&lt;br&gt;&lt;br&gt;Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve the filter details for the specified subscription filter.&lt;br&gt;&lt;br&gt;Specify the subscription filter to retrieve by using the &lt;strong&gt;subscription_id&lt;/strong&gt; and the &lt;strong&gt;filter_id&lt;/strong&gt; associated with the subscription filter. The &lt;strong&gt;filter_id&lt;/strong&gt; can be found in the response body for the &lt;strong&gt;getSubscription&lt;/strong&gt; method, if there is a filter applied on the subscription.&lt;br&gt;&lt;br&gt;Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.
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
     * @return a {@link WithFilterItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFilterItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithFilterItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
