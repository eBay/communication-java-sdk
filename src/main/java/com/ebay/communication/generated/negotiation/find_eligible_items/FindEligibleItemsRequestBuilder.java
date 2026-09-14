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

package com.ebay.communication.generated.negotiation.find_eligible_items;

import com.ebay.communication.generated.negotiation.models.PagedEligibleItemCollection;
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
 * Builds and executes requests for operations under /find_eligible_items
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindEligibleItemsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FindEligibleItemsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindEligibleItemsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/find_eligible_items{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FindEligibleItemsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindEligibleItemsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/find_eligible_items{?limit*,offset*}", rawUrl);
    }
    /**
     * This method evaluates a seller&apos;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer.  &lt;br&gt;&lt;br&gt;A listing ID is returned only when one or more buyers have shown an &quot;interest&quot; in the listing.  &lt;br&gt;&lt;br&gt;If any buyers have shown interest in a listing, the seller can initiate a &quot;negotiation&quot; with them by calling &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/sendOfferToInterestedBuyers&quot;&gt;sendOfferToInterestedBuyers&lt;/a&gt;, which sends all interested buyers a message that offers the listing at a discount.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @return a {@link PagedEligibleItemCollection}
     */
    @jakarta.annotation.Nullable
    public PagedEligibleItemCollection get() {
        return get(null);
    }
    /**
     * This method evaluates a seller&apos;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer.  &lt;br&gt;&lt;br&gt;A listing ID is returned only when one or more buyers have shown an &quot;interest&quot; in the listing.  &lt;br&gt;&lt;br&gt;If any buyers have shown interest in a listing, the seller can initiate a &quot;negotiation&quot; with them by calling &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/sendOfferToInterestedBuyers&quot;&gt;sendOfferToInterestedBuyers&lt;/a&gt;, which sends all interested buyers a message that offers the listing at a discount.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedEligibleItemCollection}
     */
    @jakarta.annotation.Nullable
    public PagedEligibleItemCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PagedEligibleItemCollection::createFromDiscriminatorValue);
    }
    /**
     * This method evaluates a seller&apos;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer.  &lt;br&gt;&lt;br&gt;A listing ID is returned only when one or more buyers have shown an &quot;interest&quot; in the listing.  &lt;br&gt;&lt;br&gt;If any buyers have shown interest in a listing, the seller can initiate a &quot;negotiation&quot; with them by calling &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/sendOfferToInterestedBuyers&quot;&gt;sendOfferToInterestedBuyers&lt;/a&gt;, which sends all interested buyers a message that offers the listing at a discount.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method evaluates a seller&apos;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer.  &lt;br&gt;&lt;br&gt;A listing ID is returned only when one or more buyers have shown an &quot;interest&quot; in the listing.  &lt;br&gt;&lt;br&gt;If any buyers have shown interest in a listing, the seller can initiate a &quot;negotiation&quot; with them by calling &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/sendOfferToInterestedBuyers&quot;&gt;sendOfferToInterestedBuyers&lt;/a&gt;, which sends all interested buyers a message that offers the listing at a discount.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FindEligibleItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindEligibleItemsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FindEligibleItemsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method evaluates a seller&apos;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer.  &lt;br&gt;&lt;br&gt;A listing ID is returned only when one or more buyers have shown an &quot;interest&quot; in the listing.  &lt;br&gt;&lt;br&gt;If any buyers have shown interest in a listing, the seller can initiate a &quot;negotiation&quot; with them by calling &lt;a href=&quot;/api-docs/sell/negotiation/resources/offer/methods/sendOfferToInterestedBuyers&quot;&gt;sendOfferToInterestedBuyers&lt;/a&gt;, which sends all interested buyers a message that offers the listing at a discount.  &lt;br&gt;&lt;br&gt;For details about how to create seller offers to buyers, see &lt;a href=&quot;/api-docs/sell/static/marketing/offers-to-buyers.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Sending offers to buyers&lt;/a&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the maximum number of items to return from the result set on a page in the paginated response.&lt;br&gt;&lt;br&gt;&lt;b&gt;Minimum:&lt;/b&gt; 1&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 200&lt;br&gt;&lt;br&gt;&lt;b&gt;Default: &lt;/b&gt;10
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * This query parameter specifies the number of results to skip in the result set before returning the first result in the paginated response.  &lt;br&gt;&lt;br&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 results from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
}
