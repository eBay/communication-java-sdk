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

package com.ebay.communication.generated.negotiation.send_offer_to_interested_buyers;

import com.ebay.communication.generated.negotiation.models.CreateOffersRequest;
import com.ebay.communication.generated.negotiation.models.SendOfferToInterestedBuyersCollectionResponse;
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
 * Builds and executes requests for operations under /send_offer_to_interested_buyers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendOfferToInterestedBuyersRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SendOfferToInterestedBuyersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendOfferToInterestedBuyersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/send_offer_to_interested_buyers", pathParameters);
    }
    /**
     * Instantiates a new {@link SendOfferToInterestedBuyersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendOfferToInterestedBuyersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/send_offer_to_interested_buyers", rawUrl);
    }
    /**
     * This method sends eligible buyers offers to purchase items in a listing at a discount.  &lt;br&gt;&lt;br&gt;When a buyer has shown &lt;i&gt;interest&lt;/i&gt; in a listing, they become &quot;eligible&quot; to receive a seller-initiated offer to purchase the item(s).  &lt;br&gt;&lt;br&gt;Sellers use &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/findEligibleItems&quot;&gt;findEligibleItems&lt;/a&gt; to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (&lt;b&gt;sendOfferToInterestedBuyers&lt;/b&gt;) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @param body This complex type contains the fields needed to create an offer to a buyer that is initiated by the seller.
     * @return a {@link SendOfferToInterestedBuyersCollectionResponse}
     */
    @jakarta.annotation.Nullable
    public SendOfferToInterestedBuyersCollectionResponse post(@jakarta.annotation.Nonnull final CreateOffersRequest body) {
        return post(body, null);
    }
    /**
     * This method sends eligible buyers offers to purchase items in a listing at a discount.  &lt;br&gt;&lt;br&gt;When a buyer has shown &lt;i&gt;interest&lt;/i&gt; in a listing, they become &quot;eligible&quot; to receive a seller-initiated offer to purchase the item(s).  &lt;br&gt;&lt;br&gt;Sellers use &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/findEligibleItems&quot;&gt;findEligibleItems&lt;/a&gt; to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (&lt;b&gt;sendOfferToInterestedBuyers&lt;/b&gt;) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @param body This complex type contains the fields needed to create an offer to a buyer that is initiated by the seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SendOfferToInterestedBuyersCollectionResponse}
     */
    @jakarta.annotation.Nullable
    public SendOfferToInterestedBuyersCollectionResponse post(@jakarta.annotation.Nonnull final CreateOffersRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SendOfferToInterestedBuyersCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method sends eligible buyers offers to purchase items in a listing at a discount.  &lt;br&gt;&lt;br&gt;When a buyer has shown &lt;i&gt;interest&lt;/i&gt; in a listing, they become &quot;eligible&quot; to receive a seller-initiated offer to purchase the item(s).  &lt;br&gt;&lt;br&gt;Sellers use &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/findEligibleItems&quot;&gt;findEligibleItems&lt;/a&gt; to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (&lt;b&gt;sendOfferToInterestedBuyers&lt;/b&gt;) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @param body This complex type contains the fields needed to create an offer to a buyer that is initiated by the seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateOffersRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method sends eligible buyers offers to purchase items in a listing at a discount.  &lt;br&gt;&lt;br&gt;When a buyer has shown &lt;i&gt;interest&lt;/i&gt; in a listing, they become &quot;eligible&quot; to receive a seller-initiated offer to purchase the item(s).  &lt;br&gt;&lt;br&gt;Sellers use &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/findEligibleItems&quot;&gt;findEligibleItems&lt;/a&gt; to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (&lt;b&gt;sendOfferToInterestedBuyers&lt;/b&gt;) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @param body This complex type contains the fields needed to create an offer to a buyer that is initiated by the seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateOffersRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SendOfferToInterestedBuyersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendOfferToInterestedBuyersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SendOfferToInterestedBuyersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
