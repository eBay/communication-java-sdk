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

package com.ebay.communication.generated.feedback.awaiting_feedback;

import com.ebay.communication.generated.feedback.models.AwaitingFeedbackResponse;
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
 * Builds and executes requests for operations under /awaiting_feedback
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwaitingFeedbackRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AwaitingFeedbackRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AwaitingFeedbackRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/awaiting_feedback{?filter*,limit*,offset*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AwaitingFeedbackRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AwaitingFeedbackRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/awaiting_feedback{?filter*,limit*,offset*,sort*}", rawUrl);
    }
    /**
     * This method retrieves line items awaiting feedback from the user&apos;s order partner. You can refine the results using optional filter query parameters, such as item ID, username, or user role in the transaction. Sorting and pagination features help organize and navigate returned items efficiently.&lt;p&gt;For sellers, only sold items that have not yet received feedback are included. For buyers, only purchased items for which feedback is still pending are included. If the user is both a buyer and a seller, this API returns items awaiting feedback for transactions where the user acted as either. Applying filters can limit results to either buyer-only or seller-only transactions. &lt;/p&gt;&lt;p&gt;The response provides an overview of feedback yet to be left for completed transactions (as filtered) with counts for both the buyer and seller roles. It includes an array of line items, each containing the listing ID, title, and price (with currency and value). For each line item, the response offers feedback templates specifying which ratings are available.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed seller ratings are for sellers only and are created from buyer feedback.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link AwaitingFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public AwaitingFeedbackResponse get() {
        return get(null);
    }
    /**
     * This method retrieves line items awaiting feedback from the user&apos;s order partner. You can refine the results using optional filter query parameters, such as item ID, username, or user role in the transaction. Sorting and pagination features help organize and navigate returned items efficiently.&lt;p&gt;For sellers, only sold items that have not yet received feedback are included. For buyers, only purchased items for which feedback is still pending are included. If the user is both a buyer and a seller, this API returns items awaiting feedback for transactions where the user acted as either. Applying filters can limit results to either buyer-only or seller-only transactions. &lt;/p&gt;&lt;p&gt;The response provides an overview of feedback yet to be left for completed transactions (as filtered) with counts for both the buyer and seller roles. It includes an array of line items, each containing the listing ID, title, and price (with currency and value). For each line item, the response offers feedback templates specifying which ratings are available.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed seller ratings are for sellers only and are created from buyer feedback.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AwaitingFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public AwaitingFeedbackResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AwaitingFeedbackResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves line items awaiting feedback from the user&apos;s order partner. You can refine the results using optional filter query parameters, such as item ID, username, or user role in the transaction. Sorting and pagination features help organize and navigate returned items efficiently.&lt;p&gt;For sellers, only sold items that have not yet received feedback are included. For buyers, only purchased items for which feedback is still pending are included. If the user is both a buyer and a seller, this API returns items awaiting feedback for transactions where the user acted as either. Applying filters can limit results to either buyer-only or seller-only transactions. &lt;/p&gt;&lt;p&gt;The response provides an overview of feedback yet to be left for completed transactions (as filtered) with counts for both the buyer and seller roles. It includes an array of line items, each containing the listing ID, title, and price (with currency and value). For each line item, the response offers feedback templates specifying which ratings are available.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed seller ratings are for sellers only and are created from buyer feedback.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves line items awaiting feedback from the user&apos;s order partner. You can refine the results using optional filter query parameters, such as item ID, username, or user role in the transaction. Sorting and pagination features help organize and navigate returned items efficiently.&lt;p&gt;For sellers, only sold items that have not yet received feedback are included. For buyers, only purchased items for which feedback is still pending are included. If the user is both a buyer and a seller, this API returns items awaiting feedback for transactions where the user acted as either. Applying filters can limit results to either buyer-only or seller-only transactions. &lt;/p&gt;&lt;p&gt;The response provides an overview of feedback yet to be left for completed transactions (as filtered) with counts for both the buyer and seller roles. It includes an array of line items, each containing the listing ID, title, and price (with currency and value). For each line item, the response offers feedback templates specifying which ratings are available.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed seller ratings are for sellers only and are created from buyer feedback.&lt;/span&gt;&lt;/p&gt;
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
     * @return a {@link AwaitingFeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AwaitingFeedbackRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AwaitingFeedbackRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves line items awaiting feedback from the user&apos;s order partner. You can refine the results using optional filter query parameters, such as item ID, username, or user role in the transaction. Sorting and pagination features help organize and navigate returned items efficiently.&lt;p&gt;For sellers, only sold items that have not yet received feedback are included. For buyers, only purchased items for which feedback is still pending are included. If the user is both a buyer and a seller, this API returns items awaiting feedback for transactions where the user acted as either. Applying filters can limit results to either buyer-only or seller-only transactions. &lt;/p&gt;&lt;p&gt;The response provides an overview of feedback yet to be left for completed transactions (as filtered) with counts for both the buyer and seller roles. It includes an array of line items, each containing the listing ID, title, and price (with currency and value). For each line item, the response offers feedback templates specifying which ratings are available.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed seller ratings are for sellers only and are created from buyer feedback.&lt;/span&gt;&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Use this parameter to limit the response based on the specified filter parameters. Supported filter parameters include the following:&lt;br&gt;&lt;p&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;listingId&lt;/strong&gt;: Filter results by the specific listing ID&lt;/li&gt;&lt;li&gt;&lt;strong&gt;receiverName&lt;/strong&gt;: Filter results by the user&apos;s order partner name involved in the transaction&lt;/li&gt;&lt;li&gt;&lt;strong&gt;userRole&lt;/strong&gt;: Use this filter to only retrieve feedback due from the user in role as a seller or a buyer. If this filter is not used, all feedback due in both user roles is retrieved (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;Send the filter as a query parameter in a comma-separated &lt;em&gt;name&lt;/em&gt;:&lt;em&gt;value&lt;/em&gt; list. For example: &lt;br&gt;&lt;code&gt;filter=listingId:123,receiverName:user,userRole:BUYER&lt;/code&gt;&lt;p&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * This parameter sets the maximum number of line items to return per page of data.&lt;br&gt;&lt;p&gt;Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. For example, with offset set to &lt;code&gt;20&lt;/code&gt; and limit set to &lt;code&gt;10&lt;/code&gt;, the call retrieves entries 21 through 30 from the result set.&lt;/p&gt;&lt;p&gt;Although this field is optional, if omitted, the default value of &lt;code&gt;10&lt;/code&gt; is used.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The &lt;strong&gt;limit&lt;/strong&gt; value is subject to the following rules:&lt;ul&gt;&lt;li&gt;If a value greater than &lt;code&gt;25&lt;/code&gt; is submitted, the system automatically defaults to a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;25&lt;/code&gt;.&lt;/li&gt;&lt;li&gt;If a value of &lt;code&gt;0&lt;/code&gt; or a negative number is submitted, the system automatically defaults to a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;.&lt;/li&gt;&lt;li&gt;If this parameter is omitted, the system defaults to a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Default: &lt;/strong&gt;10&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Maximum: &lt;/strong&gt;25&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Use this parameter to specify the number of items to skip in the result set. This is used with the &lt;code&gt;limit&lt;/code&gt; field to control the pagination of the output. For example:&lt;br&gt;&lt;ul&gt;&lt;li&gt;If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;0&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1-10 from the list of line items returned.&lt;/li&gt;&lt;li&gt;If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11-20 from the list of line items returned.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This feature employs a zero-based list, where the first line item in the list has an offset of 0.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;If this parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt;, which returns the first page of records.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Default:&lt;/strong&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Use this parameter to configure the order of the returned listings. The time is based on when the buyer paid for the line item. Acceptable values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;END_TIME_ASC:&lt;/strong&gt; Sorts listings by end time from oldest to newest&lt;/li&gt;&lt;li&gt;&lt;strong&gt;END_TIME_DESC:&lt;/strong&gt; Sorts listings by end time from newest to oldest (default)&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;If this parameter is omitted, its value defaults to &lt;strong&gt;END_TIME_DESC&lt;/strong&gt;.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Default: &lt;/strong&gt;&lt;code&gt;END_TIME_DESC&lt;/code&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("sort", sort);
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
