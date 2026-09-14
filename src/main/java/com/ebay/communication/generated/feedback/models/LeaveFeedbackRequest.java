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
 * This type provides fields available to leave feedback in the &lt;strong&gt;leaveFeedback&lt;/strong&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeaveFeedbackRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Use this field to provide the feedback left by the user, describing their experience with the line item of the transaction. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;p&gt;&lt;strong&gt;Maximum length:&lt;/strong&gt; 500 characters&lt;/p&gt;
     */
    private String commentText;
    /**
     * Set this enumerated value to indicate the overall rating of the transaction: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, or &lt;code&gt;NEGATIVE&lt;/code&gt;.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only provide positive feedback.&lt;/span&gt;&lt;/p&gt;
     */
    private FeedbackRatingValuesEnum commentType;
    /**
     * Use this array to optionally list up to 5 images attached to the feedback.
     */
    private java.util.List<Image> images;
    /**
     * Use this field to provide the listing ID related to the transaction.
     */
    private String listingId;
    /**
     * Use this field to provide the unique identifier of the line item for this feedback.
     */
    private String orderLineItemId;
    /**
     * Use this array to list ratings for specific aspects of the seller&apos;s performance.
     */
    private java.util.List<SellerRating> sellerRatings;
    /**
     * Use this field to provide the unique identifier of the transaction for this feedback.
     */
    private String transactionId;
    /**
     * Instantiates a new {@link LeaveFeedbackRequest} and sets the default values.
     */
    public LeaveFeedbackRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeaveFeedbackRequest}
     */
    @jakarta.annotation.Nonnull
    public static LeaveFeedbackRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeaveFeedbackRequest();
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
     * Gets the commentText property value. Use this field to provide the feedback left by the user, describing their experience with the line item of the transaction. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;p&gt;&lt;strong&gt;Maximum length:&lt;/strong&gt; 500 characters&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommentText() {
        return this.commentText;
    }
    /**
     * Gets the commentType property value. Set this enumerated value to indicate the overall rating of the transaction: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, or &lt;code&gt;NEGATIVE&lt;/code&gt;.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only provide positive feedback.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link FeedbackRatingValuesEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackRatingValuesEnum getCommentType() {
        return this.commentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("commentText", (n) -> { this.setCommentText(n.getStringValue()); });
        deserializerMap.put("commentType", (n) -> { this.setCommentType(n.getEnumValue(FeedbackRatingValuesEnum::forValue)); });
        deserializerMap.put("images", (n) -> { this.setImages(n.getCollectionOfObjectValues(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("orderLineItemId", (n) -> { this.setOrderLineItemId(n.getStringValue()); });
        deserializerMap.put("sellerRatings", (n) -> { this.setSellerRatings(n.getCollectionOfObjectValues(SellerRating::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the images property value. Use this array to optionally list up to 5 images attached to the feedback.
     * @return a {@link java.util.List<Image>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Image> getImages() {
        return this.images;
    }
    /**
     * Gets the listingId property value. Use this field to provide the listing ID related to the transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the orderLineItemId property value. Use this field to provide the unique identifier of the line item for this feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderLineItemId() {
        return this.orderLineItemId;
    }
    /**
     * Gets the sellerRatings property value. Use this array to list ratings for specific aspects of the seller&apos;s performance.
     * @return a {@link java.util.List<SellerRating>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SellerRating> getSellerRatings() {
        return this.sellerRatings;
    }
    /**
     * Gets the transactionId property value. Use this field to provide the unique identifier of the transaction for this feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("commentText", this.getCommentText());
        writer.writeEnumValue("commentType", this.getCommentType());
        writer.writeCollectionOfObjectValues("images", this.getImages());
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeStringValue("orderLineItemId", this.getOrderLineItemId());
        writer.writeCollectionOfObjectValues("sellerRatings", this.getSellerRatings());
        writer.writeStringValue("transactionId", this.getTransactionId());
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
     * Sets the commentText property value. Use this field to provide the feedback left by the user, describing their experience with the line item of the transaction. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;p&gt;&lt;strong&gt;Maximum length:&lt;/strong&gt; 500 characters&lt;/p&gt;
     * @param value Value to set for the commentText property.
     */
    public void setCommentText(@jakarta.annotation.Nullable final String value) {
        this.commentText = value;
    }
    /**
     * Sets the commentType property value. Set this enumerated value to indicate the overall rating of the transaction: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, or &lt;code&gt;NEGATIVE&lt;/code&gt;.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only provide positive feedback.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the commentType property.
     */
    public void setCommentType(@jakarta.annotation.Nullable final FeedbackRatingValuesEnum value) {
        this.commentType = value;
    }
    /**
     * Sets the images property value. Use this array to optionally list up to 5 images attached to the feedback.
     * @param value Value to set for the images property.
     */
    public void setImages(@jakarta.annotation.Nullable final java.util.List<Image> value) {
        this.images = value;
    }
    /**
     * Sets the listingId property value. Use this field to provide the listing ID related to the transaction.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the orderLineItemId property value. Use this field to provide the unique identifier of the line item for this feedback.
     * @param value Value to set for the orderLineItemId property.
     */
    public void setOrderLineItemId(@jakarta.annotation.Nullable final String value) {
        this.orderLineItemId = value;
    }
    /**
     * Sets the sellerRatings property value. Use this array to list ratings for specific aspects of the seller&apos;s performance.
     * @param value Value to set for the sellerRatings property.
     */
    public void setSellerRatings(@jakarta.annotation.Nullable final java.util.List<SellerRating> value) {
        this.sellerRatings = value;
    }
    /**
     * Sets the transactionId property value. Use this field to provide the unique identifier of the transaction for this feedback.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
}
