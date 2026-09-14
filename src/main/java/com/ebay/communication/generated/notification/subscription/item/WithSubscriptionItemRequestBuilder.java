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

package com.ebay.communication.generated.notification.subscription.item;

import com.ebay.communication.generated.notification.models.Error;
import com.ebay.communication.generated.notification.models.Subscription;
import com.ebay.communication.generated.notification.models.UpdateSubscriptionRequest;
import com.ebay.communication.generated.notification.subscription.item.disable.DisableRequestBuilder;
import com.ebay.communication.generated.notification.subscription.item.enable.EnableRequestBuilder;
import com.ebay.communication.generated.notification.subscription.item.filter.FilterRequestBuilder;
import com.ebay.communication.generated.notification.subscription.item.test.TestRequestBuilder;
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
 * Builds and executes requests for operations under /subscription/{subscription_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSubscriptionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The disable property
     * @return a {@link DisableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The enable property
     * @return a {@link EnableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableRequestBuilder enable() {
        return new EnableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The filter property
     * @return a {@link FilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterRequestBuilder filter() {
        return new FilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The test property
     * @return a {@link TestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TestRequestBuilder test() {
        return new TestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithSubscriptionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubscriptionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSubscriptionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubscriptionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}", rawUrl);
    }
    /**
     * This method allows applications to delete a subscription. Subscriptions can be deleted regardless of status.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method allows applications to delete a subscription. Subscriptions can be deleted regardless of status.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method allows applications to retrieve subscription details for the specified subscription.&lt;br&gt;&lt;br&gt;Specify the subscription to retrieve using the &lt;strong&gt;subscription_id&lt;/strong&gt;. Use the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-getsubscriptions&quot;&gt;getSubscriptions&lt;/a&gt; method to browse all subscriptions if you do not know the &lt;strong&gt;subscription_id&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @return a {@link Subscription}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Subscription get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve subscription details for the specified subscription.&lt;br&gt;&lt;br&gt;Specify the subscription to retrieve using the &lt;strong&gt;subscription_id&lt;/strong&gt;. Use the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-getsubscriptions&quot;&gt;getSubscriptions&lt;/a&gt; method to browse all subscriptions if you do not know the &lt;strong&gt;subscription_id&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Subscription}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Subscription get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Subscription::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to update a subscription. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This call returns an error if an application is not authorized to subscribe to a topic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;You can pause and restart a subscription. See the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-disablesubscription&quot;&gt;disableSubscription&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt;methods.
     * @param body The create subscription request.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateSubscriptionRequest body) {
        put(body, null);
    }
    /**
     * This method allows applications to update a subscription. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This call returns an error if an application is not authorized to subscribe to a topic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;You can pause and restart a subscription. See the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-disablesubscription&quot;&gt;disableSubscription&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt;methods.
     * @param body The create subscription request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method allows applications to delete a subscription. Subscriptions can be deleted regardless of status.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method allows applications to delete a subscription. Subscriptions can be deleted regardless of status.
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
     * This method allows applications to retrieve subscription details for the specified subscription.&lt;br&gt;&lt;br&gt;Specify the subscription to retrieve using the &lt;strong&gt;subscription_id&lt;/strong&gt;. Use the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-getsubscriptions&quot;&gt;getSubscriptions&lt;/a&gt; method to browse all subscriptions if you do not know the &lt;strong&gt;subscription_id&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve subscription details for the specified subscription.&lt;br&gt;&lt;br&gt;Specify the subscription to retrieve using the &lt;strong&gt;subscription_id&lt;/strong&gt;. Use the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-getsubscriptions&quot;&gt;getSubscriptions&lt;/a&gt; method to browse all subscriptions if you do not know the &lt;strong&gt;subscription_id&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.
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
     * This method allows applications to update a subscription. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This call returns an error if an application is not authorized to subscribe to a topic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;You can pause and restart a subscription. See the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-disablesubscription&quot;&gt;disableSubscription&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt;methods.
     * @param body The create subscription request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateSubscriptionRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method allows applications to update a subscription. Subscriptions allow applications to express interest in notifications and keep receiving the information relevant to their business.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This call returns an error if an application is not authorized to subscribe to a topic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;You can pause and restart a subscription. See the &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-disablesubscription&quot;&gt;disableSubscription&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-subscription-enablesubscription&quot;&gt;enableSubscription&lt;/a&gt;methods.
     * @param body The create subscription request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithSubscriptionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSubscriptionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSubscriptionItemRequestBuilder(rawUrl, requestAdapter);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
