package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The response object returned from a &lt;b&gt;SendOfferToInterestedBuyers&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendOfferToInterestedBuyersCollectionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The &lt;b&gt;offers&lt;/b&gt; container returns a list of the offers sent to buyers who have shown an interest in listings included in the offer.
     */
    private java.util.List<Offer> offers;
    /**
     * Instantiates a new {@link SendOfferToInterestedBuyersCollectionResponse} and sets the default values.
     */
    public SendOfferToInterestedBuyersCollectionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendOfferToInterestedBuyersCollectionResponse}
     */
    @jakarta.annotation.Nonnull
    public static SendOfferToInterestedBuyersCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendOfferToInterestedBuyersCollectionResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("offers", (n) -> { this.setOffers(n.getCollectionOfObjectValues(Offer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offers property value. The &lt;b&gt;offers&lt;/b&gt; container returns a list of the offers sent to buyers who have shown an interest in listings included in the offer.
     * @return a {@link java.util.List<Offer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Offer> getOffers() {
        return this.offers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("offers", this.getOffers());
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
     * Sets the offers property value. The &lt;b&gt;offers&lt;/b&gt; container returns a list of the offers sent to buyers who have shown an interest in listings included in the offer.
     * @param value Value to set for the offers property.
     */
    public void setOffers(@jakarta.annotation.Nullable final java.util.List<Offer> value) {
        this.offers = value;
    }
}
