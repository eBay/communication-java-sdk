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

package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that defines an offer that a seller makes to eligible buyers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Offer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.
     */
    private Boolean allowCounterOffer;
    /**
     * This complex type identifies an eBay user&lt;!-- by either their &lt;b&gt;maskedUsername&lt;/b&gt; or their full &lt;b&gt;username&lt;/b&gt;--&gt;.
     */
    private User buyer;
    /**
     * The date and time when the seller&apos;s offer was created.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String creationDate;
    /**
     * The eBay &lt;b&gt;UserName&lt;/b&gt; of the user (seller) who initiated the offer.
     */
    private String initiatedBy;
    /**
     * The date and time when the offer was last modified.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;http://www.iso.org/iso/home/standards/iso8601.htm&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.
     */
    private String lastModifiedDate;
    /**
     * A seller-defined message related to the offer being made. This message is sent to the list of &quot;interested&quot; buyers along with the offer message from eBay.
     */
    private String message;
    /**
     * A complex type that specifies a period of time using a specified time-measurement unit.
     */
    private TimeDuration offerDuration;
    /**
     * The list of items associated with the offer. &lt;br&gt;&lt;br&gt;Currently, the offer list is restricted to a single offer.
     */
    private java.util.List<OfferedItem> offeredItems;
    /**
     * A unique eBay-assigned identifier for the offer.
     */
    private String offerId;
    /**
     * The current state, or status, of an offer.  &lt;br&gt;&lt;br&gt;Status states include &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;COUNTERED&lt;/code&gt;, &lt;code&gt;ACCEPTED&lt;/code&gt;, and &lt;code&gt;DECLINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String offerStatus;
    /**
     * The type of offer being made. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String offerType;
    /**
     * A unique, eBay-assigned ID for the revision of the offer.
     */
    private String revision;
    /**
     * Instantiates a new {@link Offer} and sets the default values.
     */
    public Offer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Offer}
     */
    @jakarta.annotation.Nonnull
    public static Offer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Offer();
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
     * Gets the allowCounterOffer property value. If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCounterOffer() {
        return this.allowCounterOffer;
    }
    /**
     * Gets the buyer property value. This complex type identifies an eBay user&lt;!-- by either their &lt;b&gt;maskedUsername&lt;/b&gt; or their full &lt;b&gt;username&lt;/b&gt;--&gt;.
     * @return a {@link User}
     */
    @jakarta.annotation.Nullable
    public User getBuyer() {
        return this.buyer;
    }
    /**
     * Gets the creationDate property value. The date and time when the seller&apos;s offer was created.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("allowCounterOffer", (n) -> { this.setAllowCounterOffer(n.getBooleanValue()); });
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("offerDuration", (n) -> { this.setOfferDuration(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("offeredItems", (n) -> { this.setOfferedItems(n.getCollectionOfObjectValues(OfferedItem::createFromDiscriminatorValue)); });
        deserializerMap.put("offerId", (n) -> { this.setOfferId(n.getStringValue()); });
        deserializerMap.put("offerStatus", (n) -> { this.setOfferStatus(n.getStringValue()); });
        deserializerMap.put("offerType", (n) -> { this.setOfferType(n.getStringValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The eBay &lt;b&gt;UserName&lt;/b&gt; of the user (seller) who initiated the offer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Gets the lastModifiedDate property value. The date and time when the offer was last modified.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;http://www.iso.org/iso/home/standards/iso8601.htm&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Gets the message property value. A seller-defined message related to the offer being made. This message is sent to the list of &quot;interested&quot; buyers along with the offer message from eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the offerDuration property value. A complex type that specifies a period of time using a specified time-measurement unit.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getOfferDuration() {
        return this.offerDuration;
    }
    /**
     * Gets the offeredItems property value. The list of items associated with the offer. &lt;br&gt;&lt;br&gt;Currently, the offer list is restricted to a single offer.
     * @return a {@link java.util.List<OfferedItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferedItem> getOfferedItems() {
        return this.offeredItems;
    }
    /**
     * Gets the offerId property value. A unique eBay-assigned identifier for the offer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferId() {
        return this.offerId;
    }
    /**
     * Gets the offerStatus property value. The current state, or status, of an offer.  &lt;br&gt;&lt;br&gt;Status states include &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;COUNTERED&lt;/code&gt;, &lt;code&gt;ACCEPTED&lt;/code&gt;, and &lt;code&gt;DECLINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferStatus() {
        return this.offerStatus;
    }
    /**
     * Gets the offerType property value. The type of offer being made. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferType() {
        return this.offerType;
    }
    /**
     * Gets the revision property value. A unique, eBay-assigned ID for the revision of the offer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.revision;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCounterOffer", this.getAllowCounterOffer());
        writer.writeObjectValue("buyer", this.getBuyer());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("lastModifiedDate", this.getLastModifiedDate());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("offerDuration", this.getOfferDuration());
        writer.writeCollectionOfObjectValues("offeredItems", this.getOfferedItems());
        writer.writeStringValue("offerId", this.getOfferId());
        writer.writeStringValue("offerStatus", this.getOfferStatus());
        writer.writeStringValue("offerType", this.getOfferType());
        writer.writeStringValue("revision", this.getRevision());
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
     * Sets the allowCounterOffer property value. If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.
     * @param value Value to set for the allowCounterOffer property.
     */
    public void setAllowCounterOffer(@jakarta.annotation.Nullable final Boolean value) {
        this.allowCounterOffer = value;
    }
    /**
     * Sets the buyer property value. This complex type identifies an eBay user&lt;!-- by either their &lt;b&gt;maskedUsername&lt;/b&gt; or their full &lt;b&gt;username&lt;/b&gt;--&gt;.
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final User value) {
        this.buyer = value;
    }
    /**
     * Sets the creationDate property value. The date and time when the seller&apos;s offer was created.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the initiatedBy property value. The eBay &lt;b&gt;UserName&lt;/b&gt; of the user (seller) who initiated the offer.
     * @param value Value to set for the initiatedBy property.
     */
    public void setInitiatedBy(@jakarta.annotation.Nullable final String value) {
        this.initiatedBy = value;
    }
    /**
     * Sets the lastModifiedDate property value. The date and time when the offer was last modified.  &lt;br&gt;&lt;br&gt;The returned timestamp is formatted as an &lt;a href=&quot;http://www.iso.org/iso/home/standards/iso8601.htm&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.
     * @param value Value to set for the lastModifiedDate property.
     */
    public void setLastModifiedDate(@jakarta.annotation.Nullable final String value) {
        this.lastModifiedDate = value;
    }
    /**
     * Sets the message property value. A seller-defined message related to the offer being made. This message is sent to the list of &quot;interested&quot; buyers along with the offer message from eBay.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the offerDuration property value. A complex type that specifies a period of time using a specified time-measurement unit.
     * @param value Value to set for the offerDuration property.
     */
    public void setOfferDuration(@jakarta.annotation.Nullable final TimeDuration value) {
        this.offerDuration = value;
    }
    /**
     * Sets the offeredItems property value. The list of items associated with the offer. &lt;br&gt;&lt;br&gt;Currently, the offer list is restricted to a single offer.
     * @param value Value to set for the offeredItems property.
     */
    public void setOfferedItems(@jakarta.annotation.Nullable final java.util.List<OfferedItem> value) {
        this.offeredItems = value;
    }
    /**
     * Sets the offerId property value. A unique eBay-assigned identifier for the offer.
     * @param value Value to set for the offerId property.
     */
    public void setOfferId(@jakarta.annotation.Nullable final String value) {
        this.offerId = value;
    }
    /**
     * Sets the offerStatus property value. The current state, or status, of an offer.  &lt;br&gt;&lt;br&gt;Status states include &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;COUNTERED&lt;/code&gt;, &lt;code&gt;ACCEPTED&lt;/code&gt;, and &lt;code&gt;DECLINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the offerStatus property.
     */
    public void setOfferStatus(@jakarta.annotation.Nullable final String value) {
        this.offerStatus = value;
    }
    /**
     * Sets the offerType property value. The type of offer being made. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the offerType property.
     */
    public void setOfferType(@jakarta.annotation.Nullable final String value) {
        this.offerType = value;
    }
    /**
     * Sets the revision property value. A unique, eBay-assigned ID for the revision of the offer.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.revision = value;
    }
}
