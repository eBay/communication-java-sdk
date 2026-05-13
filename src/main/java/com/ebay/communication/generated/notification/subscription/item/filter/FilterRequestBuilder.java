package com.ebay.communication.generated.notification.subscription.item.filter;

import com.ebay.communication.generated.notification.models.CreateSubscriptionFilterRequest;
import com.ebay.communication.generated.notification.subscription.item.filter.item.WithFilterItemRequestBuilder;
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
 * Builds and executes requests for operations under /subscription/{subscription_id}/filter
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilterRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.communication.generated.notification.subscription.item.filter.item collection
     * @param filter_id The unique identifier of the subscription filter.  Filter ID values, if configured for a subscription, will be shown in the &lt;b&gt;subscriptions.filterId&lt;/b&gt; field in &lt;b&gt;getSubscription&lt;/b&gt; and &lt;b&gt;getSubscription&lt;/b&gt; responses. The filter ID value is also returned in the Location response header when a filter is created with &lt;b&gt;createSubscriptionFilter&lt;/b&gt;.
     * @return a {@link WithFilterItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFilterItemRequestBuilder byFilter_id(@jakarta.annotation.Nonnull final String filter_id) {
        Objects.requireNonNull(filter_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("filter_id", filter_id);
        return new WithFilterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FilterRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilterRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/filter", pathParameters);
    }
    /**
     * Instantiates a new {@link FilterRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilterRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/filter", rawUrl);
    }
    /**
     * This method allows applications to create a filter for a subscription. Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;filterSchema&lt;/strong&gt; value must be a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications. The user does not need to provide &lt;code&gt;$schema&lt;/code&gt; and &lt;code&gt;$id&lt;/code&gt; definitions.&lt;br&gt;&lt;br&gt;When a filter is first created, it is not immediately active on the subscription. If the request has a valid JSON body, the successful call returns the HTTP status code &lt;b&gt;201&amp;nbsp;Created&lt;/b&gt;. Newly created filters are in &lt;code&gt;PENDING&lt;/code&gt; status until they are reviewed. If a filter is valid, it will move from &lt;code&gt;PENDING&lt;/code&gt; status to &lt;code&gt;ENABLED&lt;/code&gt; status. You can find the status of a filter using the &lt;a href=&quot;/api-docs/commerce/notification/resources/subscription/methods/getSubscriptionFilter&quot;&gt;getSubscriptionFilter&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/commerce/notification/overview.html#create-filter&quot; target=&quot;_blank&quot;&gt;Creating a subscription filter for a topic&lt;/a&gt; for additional information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one filter can be in &lt;strong&gt;ENABLED&lt;/strong&gt; (which means active) status on a subscription at a time. If an &lt;strong&gt;ENABLED&lt;/strong&gt; filter is overwritten by a new call to &lt;strong&gt;CREATE&lt;/strong&gt; a filter for the subscription, it stays in &lt;strong&gt;ENABLED&lt;/strong&gt; status until the new &lt;strong&gt;PENDING&lt;/strong&gt; filter becomes the &lt;strong&gt;ENABLED&lt;/strong&gt; filter, and the existing filter then becomes &lt;strong&gt;DISABLED&lt;/strong&gt;.&lt;/span&gt;
     * @param body The request body
     * @return a {@link FilterPostResponse}
     */
    @jakarta.annotation.Nullable
    public FilterPostResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionFilterRequest body) {
        return post(body, null);
    }
    /**
     * This method allows applications to create a filter for a subscription. Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;filterSchema&lt;/strong&gt; value must be a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications. The user does not need to provide &lt;code&gt;$schema&lt;/code&gt; and &lt;code&gt;$id&lt;/code&gt; definitions.&lt;br&gt;&lt;br&gt;When a filter is first created, it is not immediately active on the subscription. If the request has a valid JSON body, the successful call returns the HTTP status code &lt;b&gt;201&amp;nbsp;Created&lt;/b&gt;. Newly created filters are in &lt;code&gt;PENDING&lt;/code&gt; status until they are reviewed. If a filter is valid, it will move from &lt;code&gt;PENDING&lt;/code&gt; status to &lt;code&gt;ENABLED&lt;/code&gt; status. You can find the status of a filter using the &lt;a href=&quot;/api-docs/commerce/notification/resources/subscription/methods/getSubscriptionFilter&quot;&gt;getSubscriptionFilter&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/commerce/notification/overview.html#create-filter&quot; target=&quot;_blank&quot;&gt;Creating a subscription filter for a topic&lt;/a&gt; for additional information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one filter can be in &lt;strong&gt;ENABLED&lt;/strong&gt; (which means active) status on a subscription at a time. If an &lt;strong&gt;ENABLED&lt;/strong&gt; filter is overwritten by a new call to &lt;strong&gt;CREATE&lt;/strong&gt; a filter for the subscription, it stays in &lt;strong&gt;ENABLED&lt;/strong&gt; status until the new &lt;strong&gt;PENDING&lt;/strong&gt; filter becomes the &lt;strong&gt;ENABLED&lt;/strong&gt; filter, and the existing filter then becomes &lt;strong&gt;DISABLED&lt;/strong&gt;.&lt;/span&gt;
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FilterPostResponse}
     */
    @jakarta.annotation.Nullable
    public FilterPostResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionFilterRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FilterPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to create a filter for a subscription. Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;filterSchema&lt;/strong&gt; value must be a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications. The user does not need to provide &lt;code&gt;$schema&lt;/code&gt; and &lt;code&gt;$id&lt;/code&gt; definitions.&lt;br&gt;&lt;br&gt;When a filter is first created, it is not immediately active on the subscription. If the request has a valid JSON body, the successful call returns the HTTP status code &lt;b&gt;201&amp;nbsp;Created&lt;/b&gt;. Newly created filters are in &lt;code&gt;PENDING&lt;/code&gt; status until they are reviewed. If a filter is valid, it will move from &lt;code&gt;PENDING&lt;/code&gt; status to &lt;code&gt;ENABLED&lt;/code&gt; status. You can find the status of a filter using the &lt;a href=&quot;/api-docs/commerce/notification/resources/subscription/methods/getSubscriptionFilter&quot;&gt;getSubscriptionFilter&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/commerce/notification/overview.html#create-filter&quot; target=&quot;_blank&quot;&gt;Creating a subscription filter for a topic&lt;/a&gt; for additional information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one filter can be in &lt;strong&gt;ENABLED&lt;/strong&gt; (which means active) status on a subscription at a time. If an &lt;strong&gt;ENABLED&lt;/strong&gt; filter is overwritten by a new call to &lt;strong&gt;CREATE&lt;/strong&gt; a filter for the subscription, it stays in &lt;strong&gt;ENABLED&lt;/strong&gt; status until the new &lt;strong&gt;PENDING&lt;/strong&gt; filter becomes the &lt;strong&gt;ENABLED&lt;/strong&gt; filter, and the existing filter then becomes &lt;strong&gt;DISABLED&lt;/strong&gt;.&lt;/span&gt;
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionFilterRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows applications to create a filter for a subscription. Filters allow applications to only be sent notifications that match a provided criteria. Notifications that do not match this criteria will not be sent to the destination.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;filterSchema&lt;/strong&gt; value must be a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications. The user does not need to provide &lt;code&gt;$schema&lt;/code&gt; and &lt;code&gt;$id&lt;/code&gt; definitions.&lt;br&gt;&lt;br&gt;When a filter is first created, it is not immediately active on the subscription. If the request has a valid JSON body, the successful call returns the HTTP status code &lt;b&gt;201&amp;nbsp;Created&lt;/b&gt;. Newly created filters are in &lt;code&gt;PENDING&lt;/code&gt; status until they are reviewed. If a filter is valid, it will move from &lt;code&gt;PENDING&lt;/code&gt; status to &lt;code&gt;ENABLED&lt;/code&gt; status. You can find the status of a filter using the &lt;a href=&quot;/api-docs/commerce/notification/resources/subscription/methods/getSubscriptionFilter&quot;&gt;getSubscriptionFilter&lt;/a&gt; method. See &lt;a href=&quot;/api-docs/commerce/notification/overview.html#create-filter&quot; target=&quot;_blank&quot;&gt;Creating a subscription filter for a topic&lt;/a&gt; for additional information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one filter can be in &lt;strong&gt;ENABLED&lt;/strong&gt; (which means active) status on a subscription at a time. If an &lt;strong&gt;ENABLED&lt;/strong&gt; filter is overwritten by a new call to &lt;strong&gt;CREATE&lt;/strong&gt; a filter for the subscription, it stays in &lt;strong&gt;ENABLED&lt;/strong&gt; status until the new &lt;strong&gt;PENDING&lt;/strong&gt; filter becomes the &lt;strong&gt;ENABLED&lt;/strong&gt; filter, and the existing filter then becomes &lt;strong&gt;DISABLED&lt;/strong&gt;.&lt;/span&gt;
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionFilterRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FilterRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
