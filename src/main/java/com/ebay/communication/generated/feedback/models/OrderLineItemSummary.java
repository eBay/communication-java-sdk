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
 * This type provides fields for a summary of the line item related to feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderLineItemSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field provides the unique identifier for the listing associated with the feedback entry. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     */
    private String listingId;
    /**
     * This container provides the sale price of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     */
    private ListingPrice listingPrice;
    /**
     * This field contains the title of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     */
    private String listingTitle;
    /**
     * This array describes order line attributes including names and values of a transaction.
     */
    private java.util.List<OrderLineItemAttribute> orderLineItemAttributes;
    /**
     * The unique identifier of the line item for this feedback. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     */
    private String orderLineItemId;
    /**
     * This container indicates if the time since the item was bought on eBay is less than, more than, or equal to 90 days
     */
    private TransactionPeriod transactionPeriod;
    /**
     * Instantiates a new {@link OrderLineItemSummary} and sets the default values.
     */
    public OrderLineItemSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderLineItemSummary}
     */
    @jakarta.annotation.Nonnull
    public static OrderLineItemSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderLineItemSummary();
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
        deserializerMap.put("orderLineItemAttributes", (n) -> { this.setOrderLineItemAttributes(n.getCollectionOfObjectValues(OrderLineItemAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("orderLineItemId", (n) -> { this.setOrderLineItemId(n.getStringValue()); });
        deserializerMap.put("transactionPeriod", (n) -> { this.setTransactionPeriod(n.getObjectValue(TransactionPeriod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. This field provides the unique identifier for the listing associated with the feedback entry. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the listingPrice property value. This container provides the sale price of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @return a {@link ListingPrice}
     */
    @jakarta.annotation.Nullable
    public ListingPrice getListingPrice() {
        return this.listingPrice;
    }
    /**
     * Gets the listingTitle property value. This field contains the title of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingTitle() {
        return this.listingTitle;
    }
    /**
     * Gets the orderLineItemAttributes property value. This array describes order line attributes including names and values of a transaction.
     * @return a {@link java.util.List<OrderLineItemAttribute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderLineItemAttribute> getOrderLineItemAttributes() {
        return this.orderLineItemAttributes;
    }
    /**
     * Gets the orderLineItemId property value. The unique identifier of the line item for this feedback. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderLineItemId() {
        return this.orderLineItemId;
    }
    /**
     * Gets the transactionPeriod property value. This container indicates if the time since the item was bought on eBay is less than, more than, or equal to 90 days
     * @return a {@link TransactionPeriod}
     */
    @jakarta.annotation.Nullable
    public TransactionPeriod getTransactionPeriod() {
        return this.transactionPeriod;
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
        writer.writeCollectionOfObjectValues("orderLineItemAttributes", this.getOrderLineItemAttributes());
        writer.writeStringValue("orderLineItemId", this.getOrderLineItemId());
        writer.writeObjectValue("transactionPeriod", this.getTransactionPeriod());
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
     * Sets the listingId property value. This field provides the unique identifier for the listing associated with the feedback entry. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the listingPrice property value. This container provides the sale price of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @param value Value to set for the listingPrice property.
     */
    public void setListingPrice(@jakarta.annotation.Nullable final ListingPrice value) {
        this.listingPrice = value;
    }
    /**
     * Sets the listingTitle property value. This field contains the title of the listing. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @param value Value to set for the listingTitle property.
     */
    public void setListingTitle(@jakarta.annotation.Nullable final String value) {
        this.listingTitle = value;
    }
    /**
     * Sets the orderLineItemAttributes property value. This array describes order line attributes including names and values of a transaction.
     * @param value Value to set for the orderLineItemAttributes property.
     */
    public void setOrderLineItemAttributes(@jakarta.annotation.Nullable final java.util.List<OrderLineItemAttribute> value) {
        this.orderLineItemAttributes = value;
    }
    /**
     * Sets the orderLineItemId property value. The unique identifier of the line item for this feedback. It is conditionally returned based on the authorization flow and user context. See &lt;strong&gt;orderLineItemSummary&lt;/strong&gt; for details on when this field is included.
     * @param value Value to set for the orderLineItemId property.
     */
    public void setOrderLineItemId(@jakarta.annotation.Nullable final String value) {
        this.orderLineItemId = value;
    }
    /**
     * Sets the transactionPeriod property value. This container indicates if the time since the item was bought on eBay is less than, more than, or equal to 90 days
     * @param value Value to set for the transactionPeriod property.
     */
    public void setTransactionPeriod(@jakarta.annotation.Nullable final TransactionPeriod value) {
        this.transactionPeriod = value;
    }
}
