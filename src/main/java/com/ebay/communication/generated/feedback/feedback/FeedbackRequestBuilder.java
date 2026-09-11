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

package com.ebay.communication.generated.feedback.feedback;

import com.ebay.communication.generated.feedback.models.GetFeedbackResponse;
import com.ebay.communication.generated.feedback.models.LeaveFeedbackRequest;
import com.ebay.communication.generated.feedback.models.LeaveFeedbackResponse;
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
 * Builds and executes requests for operations under /feedback
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FeedbackRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedbackRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback{?feedback_id*,filter*,limit*,listing_id*,offset*,order_line_item_id*,sort*,transaction_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedbackRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedbackRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback{?feedback_id*,filter*,limit*,listing_id*,offset*,order_line_item_id*,sort*,transaction_id*}", rawUrl);
    }
    /**
     * This method enables users to retrieve feedback for any specified user ID and feedback type (sent or received). You can refine the results using optional query parameters such as its feedback ID, listing ID, or order line item ID, or applying one or more filters.&lt;p&gt;Applying filters can narrow results using criteria such as comment type, photos, or topics identified through AI-based analysis. When filtering for feedback with photos (&lt;code&gt;filterImage:true&lt;/code&gt;), only entries with images (entries that include image URLs) are returned. Additionally, feedback can be refined for the number of days to look back, the role of the user providing the feedback, and whether to include automated feedback entries left by eBay.&lt;/p&gt;&lt;p&gt;Sorting and pagination features help organize and navigate returned items efficiently.&lt;/p&gt;&lt;p&gt;Returned data includes feedback details (such as comment text and type), feedback ratings (covering criteria like overall experience, and for sellers item description, shipping time, and communication), role and attributes of the feedback giver, line item and transaction summaries, images, and any available topics. See &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot; &gt;filter&lt;/a&gt; for additional information. Privacy is safeguarded by restricting the amount of detail visible to users, depending on their context. When accessing another user&apos;s feedback without logging in, buyer names are masked and seller names are shown. Logged-in users viewing their own feedback see all names, while those viewing other users&apos; feedback will encounter some masking.&lt;/p&gt;
     * @return a {@link GetFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public GetFeedbackResponse get() {
        return get(null);
    }
    /**
     * This method enables users to retrieve feedback for any specified user ID and feedback type (sent or received). You can refine the results using optional query parameters such as its feedback ID, listing ID, or order line item ID, or applying one or more filters.&lt;p&gt;Applying filters can narrow results using criteria such as comment type, photos, or topics identified through AI-based analysis. When filtering for feedback with photos (&lt;code&gt;filterImage:true&lt;/code&gt;), only entries with images (entries that include image URLs) are returned. Additionally, feedback can be refined for the number of days to look back, the role of the user providing the feedback, and whether to include automated feedback entries left by eBay.&lt;/p&gt;&lt;p&gt;Sorting and pagination features help organize and navigate returned items efficiently.&lt;/p&gt;&lt;p&gt;Returned data includes feedback details (such as comment text and type), feedback ratings (covering criteria like overall experience, and for sellers item description, shipping time, and communication), role and attributes of the feedback giver, line item and transaction summaries, images, and any available topics. See &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot; &gt;filter&lt;/a&gt; for additional information. Privacy is safeguarded by restricting the amount of detail visible to users, depending on their context. When accessing another user&apos;s feedback without logging in, buyer names are masked and seller names are shown. Logged-in users viewing their own feedback see all names, while those viewing other users&apos; feedback will encounter some masking.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public GetFeedbackResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetFeedbackResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates and submits feedback to the user&apos;s order partner for a line item in the order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows users to provide detailed information about the transaction, including the feedback rating, comments, and seller delivery. You can also add images to your feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A seller can only provide a comment for a buyer, but a buyer can provide a comment plus provides ratings on a number of metrics for a seller.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;When leaving feedback, keep the following in mind:&lt;ul&gt;&lt;li&gt;Your feedback score is not affected when you leave feedback&lt;/li&gt;&lt;li&gt;Feedback can only be revised once after it is submitted&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call to this method returns a feedback ID, which is a unique identifier for the newly created feedback and allows for reference and tracking. &lt;/p&gt;
     * @param body This type provides fields available to leave feedback in the &lt;b&gt;leaveFeedback&lt;/b&gt; request.
     * @return a {@link LeaveFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public LeaveFeedbackResponse post(@jakarta.annotation.Nonnull final LeaveFeedbackRequest body) {
        return post(body, null);
    }
    /**
     * This method creates and submits feedback to the user&apos;s order partner for a line item in the order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows users to provide detailed information about the transaction, including the feedback rating, comments, and seller delivery. You can also add images to your feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A seller can only provide a comment for a buyer, but a buyer can provide a comment plus provides ratings on a number of metrics for a seller.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;When leaving feedback, keep the following in mind:&lt;ul&gt;&lt;li&gt;Your feedback score is not affected when you leave feedback&lt;/li&gt;&lt;li&gt;Feedback can only be revised once after it is submitted&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call to this method returns a feedback ID, which is a unique identifier for the newly created feedback and allows for reference and tracking. &lt;/p&gt;
     * @param body This type provides fields available to leave feedback in the &lt;b&gt;leaveFeedback&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LeaveFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public LeaveFeedbackResponse post(@jakarta.annotation.Nonnull final LeaveFeedbackRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, LeaveFeedbackResponse::createFromDiscriminatorValue);
    }
    /**
     * This method enables users to retrieve feedback for any specified user ID and feedback type (sent or received). You can refine the results using optional query parameters such as its feedback ID, listing ID, or order line item ID, or applying one or more filters.&lt;p&gt;Applying filters can narrow results using criteria such as comment type, photos, or topics identified through AI-based analysis. When filtering for feedback with photos (&lt;code&gt;filterImage:true&lt;/code&gt;), only entries with images (entries that include image URLs) are returned. Additionally, feedback can be refined for the number of days to look back, the role of the user providing the feedback, and whether to include automated feedback entries left by eBay.&lt;/p&gt;&lt;p&gt;Sorting and pagination features help organize and navigate returned items efficiently.&lt;/p&gt;&lt;p&gt;Returned data includes feedback details (such as comment text and type), feedback ratings (covering criteria like overall experience, and for sellers item description, shipping time, and communication), role and attributes of the feedback giver, line item and transaction summaries, images, and any available topics. See &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot; &gt;filter&lt;/a&gt; for additional information. Privacy is safeguarded by restricting the amount of detail visible to users, depending on their context. When accessing another user&apos;s feedback without logging in, buyer names are masked and seller names are shown. Logged-in users viewing their own feedback see all names, while those viewing other users&apos; feedback will encounter some masking.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method enables users to retrieve feedback for any specified user ID and feedback type (sent or received). You can refine the results using optional query parameters such as its feedback ID, listing ID, or order line item ID, or applying one or more filters.&lt;p&gt;Applying filters can narrow results using criteria such as comment type, photos, or topics identified through AI-based analysis. When filtering for feedback with photos (&lt;code&gt;filterImage:true&lt;/code&gt;), only entries with images (entries that include image URLs) are returned. Additionally, feedback can be refined for the number of days to look back, the role of the user providing the feedback, and whether to include automated feedback entries left by eBay.&lt;/p&gt;&lt;p&gt;Sorting and pagination features help organize and navigate returned items efficiently.&lt;/p&gt;&lt;p&gt;Returned data includes feedback details (such as comment text and type), feedback ratings (covering criteria like overall experience, and for sellers item description, shipping time, and communication), role and attributes of the feedback giver, line item and transaction summaries, images, and any available topics. See &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot; &gt;filter&lt;/a&gt; for additional information. Privacy is safeguarded by restricting the amount of detail visible to users, depending on their context. When accessing another user&apos;s feedback without logging in, buyer names are masked and seller names are shown. Logged-in users viewing their own feedback see all names, while those viewing other users&apos; feedback will encounter some masking.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, "{+baseurl}/feedback?feedback_type={feedback_type}&user_id={user_id}{&feedback_id*,filter*,limit*,listing_id*,offset*,order_line_item_id*,sort*,transaction_id*}", pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method creates and submits feedback to the user&apos;s order partner for a line item in the order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows users to provide detailed information about the transaction, including the feedback rating, comments, and seller delivery. You can also add images to your feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A seller can only provide a comment for a buyer, but a buyer can provide a comment plus provides ratings on a number of metrics for a seller.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;When leaving feedback, keep the following in mind:&lt;ul&gt;&lt;li&gt;Your feedback score is not affected when you leave feedback&lt;/li&gt;&lt;li&gt;Feedback can only be revised once after it is submitted&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call to this method returns a feedback ID, which is a unique identifier for the newly created feedback and allows for reference and tracking. &lt;/p&gt;
     * @param body This type provides fields available to leave feedback in the &lt;b&gt;leaveFeedback&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeaveFeedbackRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates and submits feedback to the user&apos;s order partner for a line item in the order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows users to provide detailed information about the transaction, including the feedback rating, comments, and seller delivery. You can also add images to your feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A seller can only provide a comment for a buyer, but a buyer can provide a comment plus provides ratings on a number of metrics for a seller.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;When leaving feedback, keep the following in mind:&lt;ul&gt;&lt;li&gt;Your feedback score is not affected when you leave feedback&lt;/li&gt;&lt;li&gt;Feedback can only be revised once after it is submitted&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call to this method returns a feedback ID, which is a unique identifier for the newly created feedback and allows for reference and tracking. &lt;/p&gt;
     * @param body This type provides fields available to leave feedback in the &lt;b&gt;leaveFeedback&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeaveFeedbackRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedbackRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FeedbackRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method enables users to retrieve feedback for any specified user ID and feedback type (sent or received). You can refine the results using optional query parameters such as its feedback ID, listing ID, or order line item ID, or applying one or more filters.&lt;p&gt;Applying filters can narrow results using criteria such as comment type, photos, or topics identified through AI-based analysis. When filtering for feedback with photos (&lt;code&gt;filterImage:true&lt;/code&gt;), only entries with images (entries that include image URLs) are returned. Additionally, feedback can be refined for the number of days to look back, the role of the user providing the feedback, and whether to include automated feedback entries left by eBay.&lt;/p&gt;&lt;p&gt;Sorting and pagination features help organize and navigate returned items efficiently.&lt;/p&gt;&lt;p&gt;Returned data includes feedback details (such as comment text and type), feedback ratings (covering criteria like overall experience, and for sellers item description, shipping time, and communication), role and attributes of the feedback giver, line item and transaction summaries, images, and any available topics. See &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot; &gt;filter&lt;/a&gt; for additional information. Privacy is safeguarded by restricting the amount of detail visible to users, depending on their context. When accessing another user&apos;s feedback without logging in, buyer names are masked and seller names are shown. Logged-in users viewing their own feedback see all names, while those viewing other users&apos; feedback will encounter some masking.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Use this field to only return a specific feedback record by its feedback ID. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If this query parameter is used, no other filters will be applicable.&lt;/span&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String feedbackId;
        /**
         * Use this field to specify the type of feedback records to return. Acceptable values: &lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;FEEDBACK_RECEIVED&lt;/b&gt;: Retrieve feedback received by the specified user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;FEEDBACK_SENT&lt;/b&gt;: Retrieve feedback sent by the specified user.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;If not specified, both feedback received and feedback left for the user shall be retrieved.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;When using &lt;b&gt;FEEDBACK_SENT&lt;/b&gt;, it is recommended to also filter &lt;b&gt;feedback_id&lt;/b&gt; to target results accurately.&lt;/span&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String feedbackType;
        /**
         * Use this parameter to limit the response based on the specified filter parameters as follows: &lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;commentType&lt;/b&gt;: Return only feedback with the set type of comments. Comment types available: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, or &lt;code&gt;NEGATIVE&lt;/code&gt; &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only provide positive feedback.&lt;/span&gt;&lt;/p&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;filterImage&lt;/b&gt;: Return feedback dependent on if images are included. Filter values available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;true&lt;/code&gt;: Return only feedback with images&lt;/li&gt;&lt;li&gt;&lt;code&gt;false&lt;/code&gt;: Return feedback with or without images&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;topics&lt;/b&gt;: Use AI to generate items returned that are associated to the set topic. For example, if you set &lt;code&gt;topics:shipping&lt;/code&gt;, only feedback comments about shipping are returned. Topics available: &lt;code&gt;shipping&lt;/code&gt;, &lt;code&gt;service&lt;/code&gt;, &lt;code&gt;packaging&lt;/code&gt;, &lt;code&gt;description&lt;/code&gt;, &lt;code&gt;seller-satisfaction&lt;/code&gt;, &lt;code&gt;overall-satisfaction&lt;/code&gt;, &lt;code&gt;refund&lt;/code&gt;, &lt;code&gt;inventory&lt;/code&gt;, &lt;code&gt;customer loyalty&lt;/code&gt;, &lt;code&gt;seller-other&lt;/code&gt;, &lt;code&gt;quality&lt;/code&gt;, &lt;code&gt;price&lt;/code&gt;, &lt;code&gt;condition&lt;/code&gt;, &lt;code&gt;fit&lt;/code&gt;, &lt;code&gt;appearance&lt;/code&gt;, &lt;code&gt;dimensions&lt;/code&gt;, &lt;code&gt;usage&lt;/code&gt;, &lt;code&gt;product-satisfaction&lt;/code&gt;, &lt;code&gt;product-other&lt;/code&gt;, &lt;code&gt;extras&lt;/code&gt;&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/guides-v2/communications/sell-communications-guide#retrieve-ai-filtered-items&quot; target=&quot;_blank&quot;&gt;Retrieve AI-filtered feedback&lt;/a&gt; for an example.&lt;/li&gt;&lt;li&gt;&lt;b&gt;period&lt;/b&gt;: Filter results by the number of days to look back for feedback. If not set, lifetime results are returned. Supported values available: &lt;code&gt;7&lt;/code&gt;, &lt;code&gt;30&lt;/code&gt;, &lt;code&gt;90&lt;/code&gt;, &lt;code&gt;180&lt;/code&gt;, or &lt;code&gt;365&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;role&lt;/b&gt;: Filter results by the role of the user providing feedback. Roles available: &lt;code&gt;BUYER &lt;/code&gt;or &lt;code&gt;SELLER&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;showAutomatedFeedback&lt;/b&gt;: Filter results to include automated feedback left by eBay  entries. For sellers with less than a 10 feedback score, an automated feedback message on behalf of eBay is returned.&lt;ul&gt;&lt;li&gt;&lt;code&gt;true&lt;/code&gt;: Return automated feedback including both user and eBay generated feedback&lt;/li&gt;&lt;li&gt;&lt;code&gt;false&lt;/code&gt;: Do not return eBay&apos;s automatic feedback for seller in response (default)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;Send the filter as a query parameter in a comma-separated &lt;em&gt;name&lt;/em&gt;:&lt;em&gt;value&lt;/em&gt; list. For example:  &lt;br&gt;&lt;br&gt;&lt;code&gt;filter=commentType:POSITIVE,filterImage:true,topics:fit,period:30,role:SELLER,showAutomatedFeedback:true&lt;/code&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Use this parameter to set the maximum number of items to return per page of data.&lt;br&gt;&lt;p&gt;Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. For example, with offset set to &lt;code&gt;20&lt;/code&gt; and limit set to &lt;code&gt;10&lt;/code&gt;, the call retrieves entries 21 through 30 from the result set.&lt;/p&gt;&lt;p&gt; Although this field is optional, if omitted the default value of &lt;code&gt;25&lt;/code&gt; is used.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;25&lt;/p&gt;&lt;p&gt;&lt;b&gt;Minimum: &lt;/b&gt;25&lt;/p&gt;&lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;200&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Use this field to limit feedback entries to those associated with a specified listing.
         */
        @jakarta.annotation.Nullable
        public String listingId;
        /**
         * Use this field to specify the number of line items to skip in the result set. This is used with the &lt;code&gt;limit&lt;/code&gt; field to control the pagination of the output. For example:&lt;br&gt;&lt;ul&gt;&lt;li&gt;If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;0&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1-10 from the list of line items returned&lt;/li&gt;&lt;li&gt;If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11-20 from the list of line items returned.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This feature employs a zero-based list, where the first line item in the list has an offset of 0.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;If this parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt; which returns the first page of records.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Use this field to retrieve specific feedback entries related to an order line item ID. A maximum of two entries may be retrieved: feedback left by the buyer and feedback left by the seller. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If this query parameter is set, no other filters will be applicable.&lt;/span&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String orderLineItemId;
        /**
         * Use this parameter to configure the order of the returned items. The time is based on when the buyer paid for the line item. Acceptable values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;RELEVANCE&lt;/b&gt;: Sorts items by relevance (default). This sort takes into account any available factors such as a comment score, comment type (positive, negative, neutral), how long ago the comment was left, or the length of the comment&lt;/li&gt;&lt;li&gt;&lt;b&gt;TIME&lt;/b&gt;: Sorts items by end time from newest to oldest.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;If this parameter is omitted, its value defaults to &lt;b&gt;RELEVANCE&lt;/b&gt;.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;&lt;code&gt;RELEVANCE&lt;/code&gt;&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Use this field to limit feedback entries to those associated with the specified transaction ID.
         */
        @jakarta.annotation.Nullable
        public String transactionId;
        /**
         * Use this field to specify the unique identifier user ID (eBay username of the user) of the account for which feedback is being retrieved.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Both usernames and public user IDs will be accepted in this field. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
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
            allQueryParams.put("feedback_id", feedbackId);
            allQueryParams.put("feedback_type", feedbackType);
            allQueryParams.put("filter", filter);
            allQueryParams.put("limit", limit);
            allQueryParams.put("listing_id", listingId);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_line_item_id", orderLineItemId);
            allQueryParams.put("sort", sort);
            allQueryParams.put("transaction_id", transactionId);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
