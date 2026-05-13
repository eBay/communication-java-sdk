package com.ebay.communication.generated.notification.config;

import com.ebay.communication.generated.notification.models.Config;
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
 * Builds and executes requests for operations under /config
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConfigRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/config", pathParameters);
    }
    /**
     * Instantiates a new {@link ConfigRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/config", rawUrl);
    }
    /**
     * This method allows applications to retrieve a previously created configuration.
     * @return a {@link Config}
     */
    @jakarta.annotation.Nullable
    public Config get() {
        return get(null);
    }
    /**
     * This method allows applications to retrieve a previously created configuration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Config}
     */
    @jakarta.annotation.Nullable
    public Config get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Config::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to create a new configuration or update an existing configuration. This app-level configuration allows developers to set up alerts.
     * @param body The type that defines the fields for the &lt;b&gt;alertEmail&lt;/b&gt; field.
     */
    public void put(@jakarta.annotation.Nonnull final Config body) {
        put(body, null);
    }
    /**
     * This method allows applications to create a new configuration or update an existing configuration. This app-level configuration allows developers to set up alerts.
     * @param body The type that defines the fields for the &lt;b&gt;alertEmail&lt;/b&gt; field.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final Config body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows applications to retrieve a previously created configuration.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to retrieve a previously created configuration.
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
     * This method allows applications to create a new configuration or update an existing configuration. This app-level configuration allows developers to set up alerts.
     * @param body The type that defines the fields for the &lt;b&gt;alertEmail&lt;/b&gt; field.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Config body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method allows applications to create a new configuration or update an existing configuration. This app-level configuration allows developers to set up alerts.
     * @param body The type that defines the fields for the &lt;b&gt;alertEmail&lt;/b&gt; field.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Config body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ConfigRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfigRequestBuilder(rawUrl, requestAdapter);
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
