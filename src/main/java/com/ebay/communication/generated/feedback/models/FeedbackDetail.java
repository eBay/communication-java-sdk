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

package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides attributes for returned feedback entries.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If the returned value is &lt;code&gt;true&lt;/code&gt;, feedback was generated and added automatically by eBay. If a seller has a feedback score 10 or less, eBay automatically leaves feedback. The buyer can choose to override the eBay feedback and leave feedback of their own. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed Seller Ratings (DSRs) are not provided by eBay, only a predefined comment and a positive rating.&lt;/span&gt;&lt;/p&gt;
     */
    private Boolean automatedFeedback;
    /**
     * This enumerated value indicates the type of feedback: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only leave positive feedback for buyers.&lt;/span&gt;&lt;/p&gt;
     */
    private FeedbackRatingValuesEnum commentType;
    /**
     * This boolean indicates whether the feedback is eligible for revision. If returned as &lt;code&gt;true&lt;/code&gt;, it means the feedback can be modified. Feedback that is older than 30 days or has already been revised once cannot be erased or further revised.
     */
    private Boolean eligibleForRevision;
    /**
     * This container provides the feedback comment left by a user when submitting feedback for a seller or buyer.
     */
    private Comment feedbackComment;
    /**
     * The timestamp when the feedback was submitted.
     */
    private String feedbackEnteredDate;
    /**
     * This container represents the duration since feedback was entered, expressed as a numeric value and a unit of time in days.
     */
    private FeedbackEnteredPeriod feedbackEnteredPeriod;
    /**
     * The unique identifier of the feedback entry.
     */
    private String feedbackId;
    /**
     * This array contains a list of ratings attached to feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This array only applies to buyers feedback for sellers (sellers can only give positive feedback to buyers).&lt;/span&gt;&lt;/p&gt;
     */
    private java.util.List<FeedbackRating> feedbackRatings;
    /**
     * The feedback receiver&apos;s feedback score after receiving this specific feedback.
     */
    private Integer feedbackScore;
    /**
     * This enumerated value indicates the current state of the feedback entry (for example, &lt;code&gt;ENTERED&lt;/code&gt;).
     */
    private FeedbackStateEnum feedbackState;
    /**
     * This container provides the details of any follow-up comment left. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     */
    private Comment followupComment;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the feedback entry has one or more images attached. If &lt;code&gt;false&lt;/code&gt;, there are no images attached.
     */
    private Boolean hasImages;
    /**
     * This array contains the list of attached images.
     */
    private java.util.List<Image> images;
    /**
     * This container provides a summary of the line item associated with the feedback entry. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Certain fields within this container are returned only when the request uses the &lt;strong&gt;Authorization code grant flow&lt;/strong&gt; (user access token) and the &lt;strong&gt;user_id&lt;/strong&gt; matches the authenticated user. These fields are not returned when accessing a different &lt;strong&gt;user_id&lt;/strong&gt; or when using the &lt;strong&gt;Client credentials grant flow&lt;/strong&gt; (application access token). See &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; for details on the flows and required permissions.&lt;/span&gt;&lt;/p&gt;
     */
    private OrderLineItemSummary orderLineItemSummary;
    /**
     * This container details the attributes of the user who provided the feedback.
     */
    private ProviderUserDetail providerUserDetail;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback reply was given by the seller before the follow-up comment was given by the buyer.
     */
    private Boolean repliedBeforeFollowup;
    /**
     * This container provides the details of any reply to the feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     */
    private Comment replyComment;
    /**
     * This array provides descriptions of AI-generated insights related to a feedback entry for the specified &lt;strong&gt;filter&lt;/strong&gt; topic. The feedback provided is considered relevant to the requested &lt;strong&gt;topic&lt;/strong&gt;. For example, when using the request parameter filter of &lt;code&gt;topics:product-satisfaction&lt;/code&gt;, the returned array might be: &lt;p&gt;&lt;pre&gt;{&lt;br&gt;  &quot;coarseTopic&quot; : &quot;product-satisfaction&quot;,&lt;br&gt;  &quot;highlightedTexts&quot; : [&lt;br&gt;    &quot;This machine is amazing&quot;,&lt;br&gt;    &quot;Very happy with this purchase&quot;&lt;br&gt;    ],&lt;br&gt;  &quot;sentiment&quot; : &quot;Positive&quot;&lt;br&gt;}&lt;/pre&gt;&lt;/p&gt;&lt;p&gt;If no topics exist for that feedback, an empty array is returned.&lt;/p&gt;
     */
    private java.util.List<Topic> topics;
    /**
     * Instantiates a new {@link FeedbackDetail} and sets the default values.
     */
    public FeedbackDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackDetail}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the automatedFeedback property value. If the returned value is &lt;code&gt;true&lt;/code&gt;, feedback was generated and added automatically by eBay. If a seller has a feedback score 10 or less, eBay automatically leaves feedback. The buyer can choose to override the eBay feedback and leave feedback of their own. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed Seller Ratings (DSRs) are not provided by eBay, only a predefined comment and a positive rating.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomatedFeedback() {
        return this.automatedFeedback;
    }
    /**
     * Gets the commentType property value. This enumerated value indicates the type of feedback: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only leave positive feedback for buyers.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link FeedbackRatingValuesEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackRatingValuesEnum getCommentType() {
        return this.commentType;
    }
    /**
     * Gets the eligibleForRevision property value. This boolean indicates whether the feedback is eligible for revision. If returned as &lt;code&gt;true&lt;/code&gt;, it means the feedback can be modified. Feedback that is older than 30 days or has already been revised once cannot be erased or further revised.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEligibleForRevision() {
        return this.eligibleForRevision;
    }
    /**
     * Gets the feedbackComment property value. This container provides the feedback comment left by a user when submitting feedback for a seller or buyer.
     * @return a {@link Comment}
     */
    @jakarta.annotation.Nullable
    public Comment getFeedbackComment() {
        return this.feedbackComment;
    }
    /**
     * Gets the feedbackEnteredDate property value. The timestamp when the feedback was submitted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedbackEnteredDate() {
        return this.feedbackEnteredDate;
    }
    /**
     * Gets the feedbackEnteredPeriod property value. This container represents the duration since feedback was entered, expressed as a numeric value and a unit of time in days.
     * @return a {@link FeedbackEnteredPeriod}
     */
    @jakarta.annotation.Nullable
    public FeedbackEnteredPeriod getFeedbackEnteredPeriod() {
        return this.feedbackEnteredPeriod;
    }
    /**
     * Gets the feedbackId property value. The unique identifier of the feedback entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedbackId() {
        return this.feedbackId;
    }
    /**
     * Gets the feedbackRatings property value. This array contains a list of ratings attached to feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This array only applies to buyers feedback for sellers (sellers can only give positive feedback to buyers).&lt;/span&gt;&lt;/p&gt;
     * @return a {@link java.util.List<FeedbackRating>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackRating> getFeedbackRatings() {
        return this.feedbackRatings;
    }
    /**
     * Gets the feedbackScore property value. The feedback receiver&apos;s feedback score after receiving this specific feedback.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFeedbackScore() {
        return this.feedbackScore;
    }
    /**
     * Gets the feedbackState property value. This enumerated value indicates the current state of the feedback entry (for example, &lt;code&gt;ENTERED&lt;/code&gt;).
     * @return a {@link FeedbackStateEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackStateEnum getFeedbackState() {
        return this.feedbackState;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("automatedFeedback", (n) -> { this.setAutomatedFeedback(n.getBooleanValue()); });
        deserializerMap.put("commentType", (n) -> { this.setCommentType(n.getEnumValue(FeedbackRatingValuesEnum::forValue)); });
        deserializerMap.put("eligibleForRevision", (n) -> { this.setEligibleForRevision(n.getBooleanValue()); });
        deserializerMap.put("feedbackComment", (n) -> { this.setFeedbackComment(n.getObjectValue(Comment::createFromDiscriminatorValue)); });
        deserializerMap.put("feedbackEnteredDate", (n) -> { this.setFeedbackEnteredDate(n.getStringValue()); });
        deserializerMap.put("feedbackEnteredPeriod", (n) -> { this.setFeedbackEnteredPeriod(n.getObjectValue(FeedbackEnteredPeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("feedbackId", (n) -> { this.setFeedbackId(n.getStringValue()); });
        deserializerMap.put("feedbackRatings", (n) -> { this.setFeedbackRatings(n.getCollectionOfObjectValues(FeedbackRating::createFromDiscriminatorValue)); });
        deserializerMap.put("feedbackScore", (n) -> { this.setFeedbackScore(n.getIntegerValue()); });
        deserializerMap.put("feedbackState", (n) -> { this.setFeedbackState(n.getEnumValue(FeedbackStateEnum::forValue)); });
        deserializerMap.put("followupComment", (n) -> { this.setFollowupComment(n.getObjectValue(Comment::createFromDiscriminatorValue)); });
        deserializerMap.put("hasImages", (n) -> { this.setHasImages(n.getBooleanValue()); });
        deserializerMap.put("images", (n) -> { this.setImages(n.getCollectionOfObjectValues(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("orderLineItemSummary", (n) -> { this.setOrderLineItemSummary(n.getObjectValue(OrderLineItemSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("providerUserDetail", (n) -> { this.setProviderUserDetail(n.getObjectValue(ProviderUserDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("repliedBeforeFollowup", (n) -> { this.setRepliedBeforeFollowup(n.getBooleanValue()); });
        deserializerMap.put("replyComment", (n) -> { this.setReplyComment(n.getObjectValue(Comment::createFromDiscriminatorValue)); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfObjectValues(Topic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the followupComment property value. This container provides the details of any follow-up comment left. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Comment}
     */
    @jakarta.annotation.Nullable
    public Comment getFollowupComment() {
        return this.followupComment;
    }
    /**
     * Gets the hasImages property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the feedback entry has one or more images attached. If &lt;code&gt;false&lt;/code&gt;, there are no images attached.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasImages() {
        return this.hasImages;
    }
    /**
     * Gets the images property value. This array contains the list of attached images.
     * @return a {@link java.util.List<Image>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Image> getImages() {
        return this.images;
    }
    /**
     * Gets the orderLineItemSummary property value. This container provides a summary of the line item associated with the feedback entry. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Certain fields within this container are returned only when the request uses the &lt;strong&gt;Authorization code grant flow&lt;/strong&gt; (user access token) and the &lt;strong&gt;user_id&lt;/strong&gt; matches the authenticated user. These fields are not returned when accessing a different &lt;strong&gt;user_id&lt;/strong&gt; or when using the &lt;strong&gt;Client credentials grant flow&lt;/strong&gt; (application access token). See &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; for details on the flows and required permissions.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link OrderLineItemSummary}
     */
    @jakarta.annotation.Nullable
    public OrderLineItemSummary getOrderLineItemSummary() {
        return this.orderLineItemSummary;
    }
    /**
     * Gets the providerUserDetail property value. This container details the attributes of the user who provided the feedback.
     * @return a {@link ProviderUserDetail}
     */
    @jakarta.annotation.Nullable
    public ProviderUserDetail getProviderUserDetail() {
        return this.providerUserDetail;
    }
    /**
     * Gets the repliedBeforeFollowup property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback reply was given by the seller before the follow-up comment was given by the buyer.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRepliedBeforeFollowup() {
        return this.repliedBeforeFollowup;
    }
    /**
     * Gets the replyComment property value. This container provides the details of any reply to the feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Comment}
     */
    @jakarta.annotation.Nullable
    public Comment getReplyComment() {
        return this.replyComment;
    }
    /**
     * Gets the topics property value. This array provides descriptions of AI-generated insights related to a feedback entry for the specified &lt;strong&gt;filter&lt;/strong&gt; topic. The feedback provided is considered relevant to the requested &lt;strong&gt;topic&lt;/strong&gt;. For example, when using the request parameter filter of &lt;code&gt;topics:product-satisfaction&lt;/code&gt;, the returned array might be: &lt;p&gt;&lt;pre&gt;{&lt;br&gt;  &quot;coarseTopic&quot; : &quot;product-satisfaction&quot;,&lt;br&gt;  &quot;highlightedTexts&quot; : [&lt;br&gt;    &quot;This machine is amazing&quot;,&lt;br&gt;    &quot;Very happy with this purchase&quot;&lt;br&gt;    ],&lt;br&gt;  &quot;sentiment&quot; : &quot;Positive&quot;&lt;br&gt;}&lt;/pre&gt;&lt;/p&gt;&lt;p&gt;If no topics exist for that feedback, an empty array is returned.&lt;/p&gt;
     * @return a {@link java.util.List<Topic>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Topic> getTopics() {
        return this.topics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("automatedFeedback", this.getAutomatedFeedback());
        writer.writeEnumValue("commentType", this.getCommentType());
        writer.writeBooleanValue("eligibleForRevision", this.getEligibleForRevision());
        writer.writeObjectValue("feedbackComment", this.getFeedbackComment());
        writer.writeStringValue("feedbackEnteredDate", this.getFeedbackEnteredDate());
        writer.writeObjectValue("feedbackEnteredPeriod", this.getFeedbackEnteredPeriod());
        writer.writeStringValue("feedbackId", this.getFeedbackId());
        writer.writeCollectionOfObjectValues("feedbackRatings", this.getFeedbackRatings());
        writer.writeIntegerValue("feedbackScore", this.getFeedbackScore());
        writer.writeEnumValue("feedbackState", this.getFeedbackState());
        writer.writeObjectValue("followupComment", this.getFollowupComment());
        writer.writeBooleanValue("hasImages", this.getHasImages());
        writer.writeCollectionOfObjectValues("images", this.getImages());
        writer.writeObjectValue("orderLineItemSummary", this.getOrderLineItemSummary());
        writer.writeObjectValue("providerUserDetail", this.getProviderUserDetail());
        writer.writeBooleanValue("repliedBeforeFollowup", this.getRepliedBeforeFollowup());
        writer.writeObjectValue("replyComment", this.getReplyComment());
        writer.writeCollectionOfObjectValues("topics", this.getTopics());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automatedFeedback property value. If the returned value is &lt;code&gt;true&lt;/code&gt;, feedback was generated and added automatically by eBay. If a seller has a feedback score 10 or less, eBay automatically leaves feedback. The buyer can choose to override the eBay feedback and leave feedback of their own. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Detailed Seller Ratings (DSRs) are not provided by eBay, only a predefined comment and a positive rating.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the automatedFeedback property.
     */
    public void setAutomatedFeedback(@jakarta.annotation.Nullable final Boolean value) {
        this.automatedFeedback = value;
    }
    /**
     * Sets the commentType property value. This enumerated value indicates the type of feedback: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only leave positive feedback for buyers.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the commentType property.
     */
    public void setCommentType(@jakarta.annotation.Nullable final FeedbackRatingValuesEnum value) {
        this.commentType = value;
    }
    /**
     * Sets the eligibleForRevision property value. This boolean indicates whether the feedback is eligible for revision. If returned as &lt;code&gt;true&lt;/code&gt;, it means the feedback can be modified. Feedback that is older than 30 days or has already been revised once cannot be erased or further revised.
     * @param value Value to set for the eligibleForRevision property.
     */
    public void setEligibleForRevision(@jakarta.annotation.Nullable final Boolean value) {
        this.eligibleForRevision = value;
    }
    /**
     * Sets the feedbackComment property value. This container provides the feedback comment left by a user when submitting feedback for a seller or buyer.
     * @param value Value to set for the feedbackComment property.
     */
    public void setFeedbackComment(@jakarta.annotation.Nullable final Comment value) {
        this.feedbackComment = value;
    }
    /**
     * Sets the feedbackEnteredDate property value. The timestamp when the feedback was submitted.
     * @param value Value to set for the feedbackEnteredDate property.
     */
    public void setFeedbackEnteredDate(@jakarta.annotation.Nullable final String value) {
        this.feedbackEnteredDate = value;
    }
    /**
     * Sets the feedbackEnteredPeriod property value. This container represents the duration since feedback was entered, expressed as a numeric value and a unit of time in days.
     * @param value Value to set for the feedbackEnteredPeriod property.
     */
    public void setFeedbackEnteredPeriod(@jakarta.annotation.Nullable final FeedbackEnteredPeriod value) {
        this.feedbackEnteredPeriod = value;
    }
    /**
     * Sets the feedbackId property value. The unique identifier of the feedback entry.
     * @param value Value to set for the feedbackId property.
     */
    public void setFeedbackId(@jakarta.annotation.Nullable final String value) {
        this.feedbackId = value;
    }
    /**
     * Sets the feedbackRatings property value. This array contains a list of ratings attached to feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This array only applies to buyers feedback for sellers (sellers can only give positive feedback to buyers).&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the feedbackRatings property.
     */
    public void setFeedbackRatings(@jakarta.annotation.Nullable final java.util.List<FeedbackRating> value) {
        this.feedbackRatings = value;
    }
    /**
     * Sets the feedbackScore property value. The feedback receiver&apos;s feedback score after receiving this specific feedback.
     * @param value Value to set for the feedbackScore property.
     */
    public void setFeedbackScore(@jakarta.annotation.Nullable final Integer value) {
        this.feedbackScore = value;
    }
    /**
     * Sets the feedbackState property value. This enumerated value indicates the current state of the feedback entry (for example, &lt;code&gt;ENTERED&lt;/code&gt;).
     * @param value Value to set for the feedbackState property.
     */
    public void setFeedbackState(@jakarta.annotation.Nullable final FeedbackStateEnum value) {
        this.feedbackState = value;
    }
    /**
     * Sets the followupComment property value. This container provides the details of any follow-up comment left. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the followupComment property.
     */
    public void setFollowupComment(@jakarta.annotation.Nullable final Comment value) {
        this.followupComment = value;
    }
    /**
     * Sets the hasImages property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the feedback entry has one or more images attached. If &lt;code&gt;false&lt;/code&gt;, there are no images attached.
     * @param value Value to set for the hasImages property.
     */
    public void setHasImages(@jakarta.annotation.Nullable final Boolean value) {
        this.hasImages = value;
    }
    /**
     * Sets the images property value. This array contains the list of attached images.
     * @param value Value to set for the images property.
     */
    public void setImages(@jakarta.annotation.Nullable final java.util.List<Image> value) {
        this.images = value;
    }
    /**
     * Sets the orderLineItemSummary property value. This container provides a summary of the line item associated with the feedback entry. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Certain fields within this container are returned only when the request uses the &lt;strong&gt;Authorization code grant flow&lt;/strong&gt; (user access token) and the &lt;strong&gt;user_id&lt;/strong&gt; matches the authenticated user. These fields are not returned when accessing a different &lt;strong&gt;user_id&lt;/strong&gt; or when using the &lt;strong&gt;Client credentials grant flow&lt;/strong&gt; (application access token). See &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; for details on the flows and required permissions.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the orderLineItemSummary property.
     */
    public void setOrderLineItemSummary(@jakarta.annotation.Nullable final OrderLineItemSummary value) {
        this.orderLineItemSummary = value;
    }
    /**
     * Sets the providerUserDetail property value. This container details the attributes of the user who provided the feedback.
     * @param value Value to set for the providerUserDetail property.
     */
    public void setProviderUserDetail(@jakarta.annotation.Nullable final ProviderUserDetail value) {
        this.providerUserDetail = value;
    }
    /**
     * Sets the repliedBeforeFollowup property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback reply was given by the seller before the follow-up comment was given by the buyer.
     * @param value Value to set for the repliedBeforeFollowup property.
     */
    public void setRepliedBeforeFollowup(@jakarta.annotation.Nullable final Boolean value) {
        this.repliedBeforeFollowup = value;
    }
    /**
     * Sets the replyComment property value. This container provides the details of any reply to the feedback.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A buyer leaves follow-up comments and a seller leaves reply comments.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the replyComment property.
     */
    public void setReplyComment(@jakarta.annotation.Nullable final Comment value) {
        this.replyComment = value;
    }
    /**
     * Sets the topics property value. This array provides descriptions of AI-generated insights related to a feedback entry for the specified &lt;strong&gt;filter&lt;/strong&gt; topic. The feedback provided is considered relevant to the requested &lt;strong&gt;topic&lt;/strong&gt;. For example, when using the request parameter filter of &lt;code&gt;topics:product-satisfaction&lt;/code&gt;, the returned array might be: &lt;p&gt;&lt;pre&gt;{&lt;br&gt;  &quot;coarseTopic&quot; : &quot;product-satisfaction&quot;,&lt;br&gt;  &quot;highlightedTexts&quot; : [&lt;br&gt;    &quot;This machine is amazing&quot;,&lt;br&gt;    &quot;Very happy with this purchase&quot;&lt;br&gt;    ],&lt;br&gt;  &quot;sentiment&quot; : &quot;Positive&quot;&lt;br&gt;}&lt;/pre&gt;&lt;/p&gt;&lt;p&gt;If no topics exist for that feedback, an empty array is returned.&lt;/p&gt;
     * @param value Value to set for the topics property.
     */
    public void setTopics(@jakarta.annotation.Nullable final java.util.List<Topic> value) {
        this.topics = value;
    }
}
