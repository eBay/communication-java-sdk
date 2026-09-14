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
 * This type contains the details for each line item awaiting feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwaitingFeedback implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the unique identifier for the listing associated with the line item. It is used to reference the specific listing that is awaiting feedback.
     */
    private String listingId;
    /**
     * This container shows the sale price of the listing.
     */
    private ListingPrice listingPrice;
    /**
     * The title of the listing.
     */
    private String listingTitle;
    /**
     * The unique identifier for the eBay order line item associated with the listing. It is used to pinpoint the exact line item awaiting feedback.
     */
    private String orderLineItemId;
    /**
     * This array contains a list of available values for use in a particular rating as well as whether the value is enabled. This is dependent on what seller ratings the buyer&apos;s order partner qualifies.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Rating templates should only be returned to the user in their role as a buyer; only sellers have Detailed Seller Ratings (DSRs). &lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use the metadata returned here when leaving DSR ratings through the &lt;strong&gt;leaveFeedback&lt;/strong&gt; method. The key field in this container is the &lt;strong&gt;ratingKey&lt;/strong&gt; field. See &lt;strong&gt;FeedbackRatingTypeEnum&lt;/strong&gt; for its values. The other metadata returned in this container apply to each &lt;strong&gt;ratingKey&lt;/strong&gt; value that is returned.&lt;/p&gt;
     */
    private java.util.List<FeedbackRatingTemplateType> ratingTemplates;
    /**
     * The unique identifier of the sales transaction.
     */
    private String transactionId;
    /**
     * Instantiates a new {@link AwaitingFeedback} and sets the default values.
     */
    public AwaitingFeedback() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwaitingFeedback}
     */
    @jakarta.annotation.Nonnull
    public static AwaitingFeedback createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwaitingFeedback();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("listingPrice", (n) -> { this.setListingPrice(n.getObjectValue(ListingPrice::createFromDiscriminatorValue)); });
        deserializerMap.put("listingTitle", (n) -> { this.setListingTitle(n.getStringValue()); });
        deserializerMap.put("orderLineItemId", (n) -> { this.setOrderLineItemId(n.getStringValue()); });
        deserializerMap.put("ratingTemplates", (n) -> { this.setRatingTemplates(n.getCollectionOfObjectValues(FeedbackRatingTemplateType::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. This is the unique identifier for the listing associated with the line item. It is used to reference the specific listing that is awaiting feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the listingPrice property value. This container shows the sale price of the listing.
     * @return a {@link ListingPrice}
     */
    @jakarta.annotation.Nullable
    public ListingPrice getListingPrice() {
        return this.listingPrice;
    }
    /**
     * Gets the listingTitle property value. The title of the listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingTitle() {
        return this.listingTitle;
    }
    /**
     * Gets the orderLineItemId property value. The unique identifier for the eBay order line item associated with the listing. It is used to pinpoint the exact line item awaiting feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderLineItemId() {
        return this.orderLineItemId;
    }
    /**
     * Gets the ratingTemplates property value. This array contains a list of available values for use in a particular rating as well as whether the value is enabled. This is dependent on what seller ratings the buyer&apos;s order partner qualifies.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Rating templates should only be returned to the user in their role as a buyer; only sellers have Detailed Seller Ratings (DSRs). &lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use the metadata returned here when leaving DSR ratings through the &lt;strong&gt;leaveFeedback&lt;/strong&gt; method. The key field in this container is the &lt;strong&gt;ratingKey&lt;/strong&gt; field. See &lt;strong&gt;FeedbackRatingTypeEnum&lt;/strong&gt; for its values. The other metadata returned in this container apply to each &lt;strong&gt;ratingKey&lt;/strong&gt; value that is returned.&lt;/p&gt;
     * @return a {@link java.util.List<FeedbackRatingTemplateType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackRatingTemplateType> getRatingTemplates() {
        return this.ratingTemplates;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the sales transaction.
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
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeObjectValue("listingPrice", this.getListingPrice());
        writer.writeStringValue("listingTitle", this.getListingTitle());
        writer.writeStringValue("orderLineItemId", this.getOrderLineItemId());
        writer.writeCollectionOfObjectValues("ratingTemplates", this.getRatingTemplates());
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
     * Sets the listingId property value. This is the unique identifier for the listing associated with the line item. It is used to reference the specific listing that is awaiting feedback.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the listingPrice property value. This container shows the sale price of the listing.
     * @param value Value to set for the listingPrice property.
     */
    public void setListingPrice(@jakarta.annotation.Nullable final ListingPrice value) {
        this.listingPrice = value;
    }
    /**
     * Sets the listingTitle property value. The title of the listing.
     * @param value Value to set for the listingTitle property.
     */
    public void setListingTitle(@jakarta.annotation.Nullable final String value) {
        this.listingTitle = value;
    }
    /**
     * Sets the orderLineItemId property value. The unique identifier for the eBay order line item associated with the listing. It is used to pinpoint the exact line item awaiting feedback.
     * @param value Value to set for the orderLineItemId property.
     */
    public void setOrderLineItemId(@jakarta.annotation.Nullable final String value) {
        this.orderLineItemId = value;
    }
    /**
     * Sets the ratingTemplates property value. This array contains a list of available values for use in a particular rating as well as whether the value is enabled. This is dependent on what seller ratings the buyer&apos;s order partner qualifies.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Rating templates should only be returned to the user in their role as a buyer; only sellers have Detailed Seller Ratings (DSRs). &lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use the metadata returned here when leaving DSR ratings through the &lt;strong&gt;leaveFeedback&lt;/strong&gt; method. The key field in this container is the &lt;strong&gt;ratingKey&lt;/strong&gt; field. See &lt;strong&gt;FeedbackRatingTypeEnum&lt;/strong&gt; for its values. The other metadata returned in this container apply to each &lt;strong&gt;ratingKey&lt;/strong&gt; value that is returned.&lt;/p&gt;
     * @param value Value to set for the ratingTemplates property.
     */
    public void setRatingTemplates(@jakarta.annotation.Nullable final java.util.List<FeedbackRatingTemplateType> value) {
        this.ratingTemplates = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the sales transaction.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
}
