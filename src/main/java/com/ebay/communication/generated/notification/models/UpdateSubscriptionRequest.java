package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes the details of the update subscription request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateSubscriptionRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;b&gt;getDestinations&lt;/b&gt; to retrieve destination IDs.
     */
    private String destinationId;
    /**
     * A type that describes the details of the subscription payload.
     */
    private SubscriptionPayloadDetail payload;
    /**
     * Set the status of the subscription being updated to ENABLED or DISABLED. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * Instantiates a new {@link UpdateSubscriptionRequest} and sets the default values.
     */
    public UpdateSubscriptionRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateSubscriptionRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateSubscriptionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateSubscriptionRequest();
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
     * Gets the destinationId property value. The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;b&gt;getDestinations&lt;/b&gt; to retrieve destination IDs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationId() {
        return this.destinationId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("destinationId", (n) -> { this.setDestinationId(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(SubscriptionPayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. A type that describes the details of the subscription payload.
     * @return a {@link SubscriptionPayloadDetail}
     */
    @jakarta.annotation.Nullable
    public SubscriptionPayloadDetail getPayload() {
        return this.payload;
    }
    /**
     * Gets the status property value. Set the status of the subscription being updated to ENABLED or DISABLED. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationId", this.getDestinationId());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the destinationId property value. The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;b&gt;getDestinations&lt;/b&gt; to retrieve destination IDs.
     * @param value Value to set for the destinationId property.
     */
    public void setDestinationId(@jakarta.annotation.Nullable final String value) {
        this.destinationId = value;
    }
    /**
     * Sets the payload property value. A type that describes the details of the subscription payload.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final SubscriptionPayloadDetail value) {
        this.payload = value;
    }
    /**
     * Sets the status property value. Set the status of the subscription being updated to ENABLED or DISABLED. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
