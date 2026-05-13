package com.ebay.communication.generated.negotiation;

import com.ebay.communication.generated.negotiation.find_eligible_items.FindEligibleItemsRequestBuilder;
import com.ebay.communication.generated.negotiation.send_offer_to_interested_buyers.SendOfferToInterestedBuyersRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NegotiationApiClient extends BaseRequestBuilder {
    /**
     * The find_eligible_items property
     * @return a {@link FindEligibleItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindEligibleItemsRequestBuilder findEligibleItems() {
        return new FindEligibleItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The send_offer_to_interested_buyers property
     * @return a {@link SendOfferToInterestedBuyersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendOfferToInterestedBuyersRequestBuilder sendOfferToInterestedBuyers() {
        return new SendOfferToInterestedBuyersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link NegotiationApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NegotiationApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
