package com.ebay.communication.generated.notification.public_key.item;

import com.ebay.communication.generated.notification.models.PublicKey;
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
 * Builds and executes requests for operations under /public_key/{public_key_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPublicKeyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPublicKeyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPublicKeyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public_key/{public_key_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPublicKeyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPublicKeyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public_key/{public_key_id}", rawUrl);
    }
    /**
     * This method allows users to retrieve a public key using a specified key ID. The public key that is returned in the response payload is used to process and validate eBay notifications.&lt;br&gt;&lt;br&gt;The public key ID, which is a required request parameter for this method, is retrieved from the Base64-encoded &lt;b&gt;X-EBAY-SIGNATURE&lt;/b&gt; header that is included in the eBay notification.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The retrieved public key value should be cached for a temporary  but reasonable  amount of time (e.g., one-hour is recommended.) This key should not be requested for every notification since doing so can result in exceeding &lt;a href=&quot;/develop/apis/api-call-limits&quot; target=&quot;_blank&quot;&gt;API call limits&lt;/a&gt; if a large number of notification requests is received.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more details about how to process eBay push notifications and validate notification message payloads, see the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link PublicKey}
     */
    @jakarta.annotation.Nullable
    public PublicKey get() {
        return get(null);
    }
    /**
     * This method allows users to retrieve a public key using a specified key ID. The public key that is returned in the response payload is used to process and validate eBay notifications.&lt;br&gt;&lt;br&gt;The public key ID, which is a required request parameter for this method, is retrieved from the Base64-encoded &lt;b&gt;X-EBAY-SIGNATURE&lt;/b&gt; header that is included in the eBay notification.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The retrieved public key value should be cached for a temporary  but reasonable  amount of time (e.g., one-hour is recommended.) This key should not be requested for every notification since doing so can result in exceeding &lt;a href=&quot;/develop/apis/api-call-limits&quot; target=&quot;_blank&quot;&gt;API call limits&lt;/a&gt; if a large number of notification requests is received.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more details about how to process eBay push notifications and validate notification message payloads, see the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt;.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PublicKey}
     */
    @jakarta.annotation.Nullable
    public PublicKey get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PublicKey::createFromDiscriminatorValue);
    }
    /**
     * This method allows users to retrieve a public key using a specified key ID. The public key that is returned in the response payload is used to process and validate eBay notifications.&lt;br&gt;&lt;br&gt;The public key ID, which is a required request parameter for this method, is retrieved from the Base64-encoded &lt;b&gt;X-EBAY-SIGNATURE&lt;/b&gt; header that is included in the eBay notification.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The retrieved public key value should be cached for a temporary  but reasonable  amount of time (e.g., one-hour is recommended.) This key should not be requested for every notification since doing so can result in exceeding &lt;a href=&quot;/develop/apis/api-call-limits&quot; target=&quot;_blank&quot;&gt;API call limits&lt;/a&gt; if a large number of notification requests is received.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more details about how to process eBay push notifications and validate notification message payloads, see the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows users to retrieve a public key using a specified key ID. The public key that is returned in the response payload is used to process and validate eBay notifications.&lt;br&gt;&lt;br&gt;The public key ID, which is a required request parameter for this method, is retrieved from the Base64-encoded &lt;b&gt;X-EBAY-SIGNATURE&lt;/b&gt; header that is included in the eBay notification.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The retrieved public key value should be cached for a temporary  but reasonable  amount of time (e.g., one-hour is recommended.) This key should not be requested for every notification since doing so can result in exceeding &lt;a href=&quot;/develop/apis/api-call-limits&quot; target=&quot;_blank&quot;&gt;API call limits&lt;/a&gt; if a large number of notification requests is received.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more details about how to process eBay push notifications and validate notification message payloads, see the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt;.&lt;/span&gt;
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
     * @return a {@link WithPublicKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPublicKeyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPublicKeyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
