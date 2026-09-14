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

package com.ebay.communication.generated.feedback.feedback_rating_summary;

import com.ebay.communication.generated.feedback.models.GetFeedbackRatingSummaryResponse;
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
 * Builds and executes requests for operations under /feedback_rating_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRatingSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FeedbackRatingSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedbackRatingSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback_rating_summary?filter={filter}&user_id={user_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedbackRatingSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedbackRatingSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback_rating_summary?filter={filter}&user_id={user_id}", rawUrl);
    }
    /**
     * This method provides a detailed overview of feedback ratings associated with a user in the eBay marketplace. Specify a user ID and apply filters to retrieve summarized feedback data categorized by rating types and user roles. These returned metrics are aggregated, which offers insight into user experiences and performance. &lt;p class=&quot;msgbox_tipInDiv&quot; &gt;&lt;div class=&quot;msgbox_tip&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #478415;&quot;&gt;Tip:&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; You can use this method to help sellers and buyers understand their marketplace reputation and identify areas for improvement.&lt;/div&gt;&lt;/p&gt;&lt;p&gt;Returned data provides a summary of feedback ratings for a user by rating type (such as overall experience, communication, or delivery timeliness) for both buyer and seller roles. Each type of rating includes aggregated metrics like averages, counts, unique feedback givers, and the percentage of positive ratings (excluding neutrals). The response also details the distribution of specific rating values, their frequency, and time period (with period units like days or months) over which these metrics were calculated.&lt;/p&gt;
     * @return a {@link GetFeedbackRatingSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public GetFeedbackRatingSummaryResponse get() {
        return get(null);
    }
    /**
     * This method provides a detailed overview of feedback ratings associated with a user in the eBay marketplace. Specify a user ID and apply filters to retrieve summarized feedback data categorized by rating types and user roles. These returned metrics are aggregated, which offers insight into user experiences and performance. &lt;p class=&quot;msgbox_tipInDiv&quot; &gt;&lt;div class=&quot;msgbox_tip&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #478415;&quot;&gt;Tip:&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; You can use this method to help sellers and buyers understand their marketplace reputation and identify areas for improvement.&lt;/div&gt;&lt;/p&gt;&lt;p&gt;Returned data provides a summary of feedback ratings for a user by rating type (such as overall experience, communication, or delivery timeliness) for both buyer and seller roles. Each type of rating includes aggregated metrics like averages, counts, unique feedback givers, and the percentage of positive ratings (excluding neutrals). The response also details the distribution of specific rating values, their frequency, and time period (with period units like days or months) over which these metrics were calculated.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetFeedbackRatingSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public GetFeedbackRatingSummaryResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetFeedbackRatingSummaryResponse::createFromDiscriminatorValue);
    }
    /**
     * This method provides a detailed overview of feedback ratings associated with a user in the eBay marketplace. Specify a user ID and apply filters to retrieve summarized feedback data categorized by rating types and user roles. These returned metrics are aggregated, which offers insight into user experiences and performance. &lt;p class=&quot;msgbox_tipInDiv&quot; &gt;&lt;div class=&quot;msgbox_tip&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #478415;&quot;&gt;Tip:&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; You can use this method to help sellers and buyers understand their marketplace reputation and identify areas for improvement.&lt;/div&gt;&lt;/p&gt;&lt;p&gt;Returned data provides a summary of feedback ratings for a user by rating type (such as overall experience, communication, or delivery timeliness) for both buyer and seller roles. Each type of rating includes aggregated metrics like averages, counts, unique feedback givers, and the percentage of positive ratings (excluding neutrals). The response also details the distribution of specific rating values, their frequency, and time period (with period units like days or months) over which these metrics were calculated.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method provides a detailed overview of feedback ratings associated with a user in the eBay marketplace. Specify a user ID and apply filters to retrieve summarized feedback data categorized by rating types and user roles. These returned metrics are aggregated, which offers insight into user experiences and performance. &lt;p class=&quot;msgbox_tipInDiv&quot; &gt;&lt;div class=&quot;msgbox_tip&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #478415;&quot;&gt;Tip:&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; You can use this method to help sellers and buyers understand their marketplace reputation and identify areas for improvement.&lt;/div&gt;&lt;/p&gt;&lt;p&gt;Returned data provides a summary of feedback ratings for a user by rating type (such as overall experience, communication, or delivery timeliness) for both buyer and seller roles. Each type of rating includes aggregated metrics like averages, counts, unique feedback givers, and the percentage of positive ratings (excluding neutrals). The response also details the distribution of specific rating values, their frequency, and time period (with period units like days or months) over which these metrics were calculated.&lt;/p&gt;
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
     * @return a {@link FeedbackRatingSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedbackRatingSummaryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FeedbackRatingSummaryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method provides a detailed overview of feedback ratings associated with a user in the eBay marketplace. Specify a user ID and apply filters to retrieve summarized feedback data categorized by rating types and user roles. These returned metrics are aggregated, which offers insight into user experiences and performance. &lt;p class=&quot;msgbox_tipInDiv&quot; &gt;&lt;div class=&quot;msgbox_tip&quot;&gt;&lt;span&gt;&lt;strong&gt;&lt;span style=&quot;color: #478415;&quot;&gt;Tip:&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt; You can use this method to help sellers and buyers understand their marketplace reputation and identify areas for improvement.&lt;/div&gt;&lt;/p&gt;&lt;p&gt;Returned data provides a summary of feedback ratings for a user by rating type (such as overall experience, communication, or delivery timeliness) for both buyer and seller roles. Each type of rating includes aggregated metrics like averages, counts, unique feedback givers, and the percentage of positive ratings (excluding neutrals). The response also details the distribution of specific rating values, their frequency, and time period (with period units like days or months) over which these metrics were calculated.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Use this parameter to limit the response based on specified filter values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;strong&gt;ratingType&lt;/strong&gt;: Specifies the type of rating being summarized and returned &lt;strong&gt;(Required)&lt;/strong&gt;. Available values include &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, &lt;code&gt;OVERALL_EXPERIENCE_COMMENT&lt;/code&gt;, &lt;code&gt;ON_TIME_DELIVERY&lt;/code&gt;, &lt;code&gt;DSR_ITEM_AS_DESCRIBED&lt;/code&gt;, &lt;code&gt;DSR_COMMUNICATION&lt;/code&gt;, &lt;code&gt;DSR_SHIPPING_CHARGES&lt;/code&gt;, &lt;code&gt;DSR_SHIPPING_TIME&lt;/code&gt;, and &lt;code&gt;ITEM_RATING&lt;/code&gt;.&lt;br&gt;See &lt;strong&gt;FeedbackRatingTypeEnum&lt;/strong&gt; for descriptions of values. &lt;/li&gt;&lt;li&gt;&lt;strong&gt;excludeRepeatFeedback&lt;/strong&gt;: Set to &lt;code&gt;true&lt;/code&gt; to exclude repeat feedback.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;lookbackPeriodInDays&lt;/strong&gt;: Limit the response to a previous period of days. Available values include &lt;code&gt;7&lt;/code&gt;, &lt;code&gt;30&lt;/code&gt;, &lt;code&gt;90&lt;/code&gt;, &lt;code&gt;180&lt;/code&gt;, or &lt;code&gt;365&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;You can send the filter as a query parameter, either with the required &lt;strong&gt;ratingType&lt;/strong&gt; only, or combining the filter values with a comma-separated &lt;em&gt;name&lt;/em&gt;&lt;strong&gt;:&lt;/strong&gt;&lt;em&gt;value&lt;/em&gt; list. For example:&lt;/p&gt;&lt;p&gt;&lt;code&gt;filter=ratingType:OVERALL_EXPERIENCE,excludeRepeatFeedback:true,period:365&lt;/code&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Use this parameter to specify the unique identifier (the eBay username associated with the account) for the eBay user whose feedback summary is being retrieved.
         */
        @jakarta.annotation.Nullable
        public String userId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
            allQueryParams.put("user_id", userId);
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
