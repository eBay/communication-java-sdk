package com.ebay.communication.generated.notification.subscription.item.enable;

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
 * Builds and executes requests for operations under /subscription/{subscription_id}/enable
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnableRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EnableRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnableRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/enable", pathParameters);
    }
    /**
     * Instantiates a new {@link EnableRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnableRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscription/{subscription_id}/enable", rawUrl);
    }
    /**
     * This method allows applications to enable a disabled subscription. To pause (or disable) an enabled subscription, call &lt;strong&gt;disableSubscription&lt;/strong&gt;.
     */
    public void post() {
        post(null);
    }
    /**
     * This method allows applications to enable a disabled subscription. To pause (or disable) an enabled subscription, call &lt;strong&gt;disableSubscription&lt;/strong&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows applications to enable a disabled subscription. To pause (or disable) an enabled subscription, call &lt;strong&gt;disableSubscription&lt;/strong&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method allows applications to enable a disabled subscription. To pause (or disable) an enabled subscription, call &lt;strong&gt;disableSubscription&lt;/strong&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EnableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EnableRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
