package com.ebay.communication.generated.notification.destination.item;

import com.ebay.communication.generated.notification.models.Destination;
import com.ebay.communication.generated.notification.models.DestinationRequest;
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
 * Builds and executes requests for operations under /destination/{destination_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithDestinationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithDestinationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDestinationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/destination/{destination_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithDestinationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDestinationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/destination/{destination_id}", rawUrl);
    }
    /**
     * This method provides applications a way to delete a destination.&lt;br&gt;&lt;br&gt;The same destination ID can be used by many destinations.&lt;br&gt;&lt;br&gt;Trying to delete an active destination results in an error. You can disable a subscription, and when the destination is no longer in use, you can delete it.
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method provides applications a way to delete a destination.&lt;br&gt;&lt;br&gt;The same destination ID can be used by many destinations.&lt;br&gt;&lt;br&gt;Trying to delete an active destination results in an error. You can disable a subscription, and when the destination is no longer in use, you can delete it.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows applications to fetch the details for a destination. The details include the destination name, status, and configuration, including the endpoint and verification token.
     * @return a {@link Destination}
     */
    @jakarta.annotation.Nullable
    public Destination get() {
        return get(null);
    }
    /**
     * This method allows applications to fetch the details for a destination. The details include the destination name, status, and configuration, including the endpoint and verification token.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Destination}
     */
    @jakarta.annotation.Nullable
    public Destination get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Destination::createFromDiscriminatorValue);
    }
    /**
     * This method allows applications to update a destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     */
    public void put(@jakarta.annotation.Nonnull final DestinationRequest body) {
        put(body, null);
    }
    /**
     * This method allows applications to update a destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final DestinationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method provides applications a way to delete a destination.&lt;br&gt;&lt;br&gt;The same destination ID can be used by many destinations.&lt;br&gt;&lt;br&gt;Trying to delete an active destination results in an error. You can disable a subscription, and when the destination is no longer in use, you can delete it.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method provides applications a way to delete a destination.&lt;br&gt;&lt;br&gt;The same destination ID can be used by many destinations.&lt;br&gt;&lt;br&gt;Trying to delete an active destination results in an error. You can disable a subscription, and when the destination is no longer in use, you can delete it.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * This method allows applications to fetch the details for a destination. The details include the destination name, status, and configuration, including the endpoint and verification token.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows applications to fetch the details for a destination. The details include the destination name, status, and configuration, including the endpoint and verification token.
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
     * This method allows applications to update a destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final DestinationRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method allows applications to update a destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The destination should be created and ready to respond with the expected &lt;b&gt;challengeResponse&lt;/b&gt; for the endpoint to be registered successfully. Refer to the &lt;a href=&quot;/api-docs/commerce/notification/overview.html&quot;&gt;Notification API overview&lt;/a&gt; for more information.&lt;/span&gt;
     * @param body A type that contains information about the destination request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final DestinationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithDestinationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithDestinationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithDestinationItemRequestBuilder(rawUrl, requestAdapter);
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
