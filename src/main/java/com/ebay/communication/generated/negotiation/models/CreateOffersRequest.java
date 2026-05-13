package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type contains the fields needed to create an offer to a buyer that is initiated by the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateOffersRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, you must set this field to &lt;code&gt;false&lt;/code&gt;; counter-offers are not supported in this release.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     */
    private Boolean allowCounterOffer;
    /**
     * A seller-defined message related to the offer being made.  &lt;br&gt;&lt;br&gt;This message is sent to the list of &quot;interested&quot; buyers.  &lt;br&gt;&lt;br&gt;To increase the conversion rate of the offers a seller makes to buyers, eBay recommends you always add a customized message to your offers.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 2,000 characters
     */
    private String message;
    /**
     * A complex type that specifies a period of time using a specified time-measurement unit.
     */
    private TimeDuration offerDuration;
    /**
     * An array of objects where each object contains the details of an offer and the ID of the listing on which the offer is being made.  &lt;br&gt;&lt;br&gt;Note that the service does not currently support the creation of multiple offers with a single call to &lt;b&gt;sendOfferToInterestedBuyer&lt;/b&gt;. With this, each request can target only one listing at a time and you must populate this array with a single element that contains the details of one offer.
     */
    private java.util.List<OfferedItem> offeredItems;
    /**
     * Instantiates a new {@link CreateOffersRequest} and sets the default values.
     */
    public CreateOffersRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateOffersRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateOffersRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateOffersRequest();
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
     * Gets the allowCounterOffer property value. If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, you must set this field to &lt;code&gt;false&lt;/code&gt;; counter-offers are not supported in this release.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCounterOffer() {
        return this.allowCounterOffer;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowCounterOffer", (n) -> { this.setAllowCounterOffer(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("offerDuration", (n) -> { this.setOfferDuration(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("offeredItems", (n) -> { this.setOfferedItems(n.getCollectionOfObjectValues(OfferedItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. A seller-defined message related to the offer being made.  &lt;br&gt;&lt;br&gt;This message is sent to the list of &quot;interested&quot; buyers.  &lt;br&gt;&lt;br&gt;To increase the conversion rate of the offers a seller makes to buyers, eBay recommends you always add a customized message to your offers.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 2,000 characters
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
     * Gets the offeredItems property value. An array of objects where each object contains the details of an offer and the ID of the listing on which the offer is being made.  &lt;br&gt;&lt;br&gt;Note that the service does not currently support the creation of multiple offers with a single call to &lt;b&gt;sendOfferToInterestedBuyer&lt;/b&gt;. With this, each request can target only one listing at a time and you must populate this array with a single element that contains the details of one offer.
     * @return a {@link java.util.List<OfferedItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferedItem> getOfferedItems() {
        return this.offeredItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCounterOffer", this.getAllowCounterOffer());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("offerDuration", this.getOfferDuration());
        writer.writeCollectionOfObjectValues("offeredItems", this.getOfferedItems());
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
     * Sets the allowCounterOffer property value. If set to &lt;code&gt;true&lt;/code&gt;, the buyer is allowed to make a counter-offer to the seller&apos;s offer.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, you must set this field to &lt;code&gt;false&lt;/code&gt;; counter-offers are not supported in this release.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @param value Value to set for the allowCounterOffer property.
     */
    public void setAllowCounterOffer(@jakarta.annotation.Nullable final Boolean value) {
        this.allowCounterOffer = value;
    }
    /**
     * Sets the message property value. A seller-defined message related to the offer being made.  &lt;br&gt;&lt;br&gt;This message is sent to the list of &quot;interested&quot; buyers.  &lt;br&gt;&lt;br&gt;To increase the conversion rate of the offers a seller makes to buyers, eBay recommends you always add a customized message to your offers.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 2,000 characters
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
     * Sets the offeredItems property value. An array of objects where each object contains the details of an offer and the ID of the listing on which the offer is being made.  &lt;br&gt;&lt;br&gt;Note that the service does not currently support the creation of multiple offers with a single call to &lt;b&gt;sendOfferToInterestedBuyer&lt;/b&gt;. With this, each request can target only one listing at a time and you must populate this array with a single element that contains the details of one offer.
     * @param value Value to set for the offeredItems property.
     */
    public void setOfferedItems(@jakarta.annotation.Nullable final java.util.List<OfferedItem> value) {
        this.offeredItems = value;
    }
}
