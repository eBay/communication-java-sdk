package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains information about the destination.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Destination implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A type that contains information about the delivery configuration.
     */
    private DeliveryConfig deliveryConfig;
    /**
     * The unique identifier for the destination.
     */
    private String destinationId;
    /**
     * The name associated with this destination.
     */
    private String name;
    /**
     * The status for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;MARKED_DOWN&lt;/b&gt; value is set by eBay systems and cannot be used in a create or update call by applications.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DISABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;MARKED_DOWN&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:DestinationStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * Instantiates a new {@link Destination} and sets the default values.
     */
    public Destination() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Destination}
     */
    @jakarta.annotation.Nonnull
    public static Destination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Destination();
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
     * Gets the deliveryConfig property value. A type that contains information about the delivery configuration.
     * @return a {@link DeliveryConfig}
     */
    @jakarta.annotation.Nullable
    public DeliveryConfig getDeliveryConfig() {
        return this.deliveryConfig;
    }
    /**
     * Gets the destinationId property value. The unique identifier for the destination.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deliveryConfig", (n) -> { this.setDeliveryConfig(n.getObjectValue(DeliveryConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationId", (n) -> { this.setDestinationId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name associated with this destination.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the status property value. The status for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;MARKED_DOWN&lt;/b&gt; value is set by eBay systems and cannot be used in a create or update call by applications.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DISABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;MARKED_DOWN&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:DestinationStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        writer.writeObjectValue("deliveryConfig", this.getDeliveryConfig());
        writer.writeStringValue("destinationId", this.getDestinationId());
        writer.writeStringValue("name", this.getName());
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
     * Sets the deliveryConfig property value. A type that contains information about the delivery configuration.
     * @param value Value to set for the deliveryConfig property.
     */
    public void setDeliveryConfig(@jakarta.annotation.Nullable final DeliveryConfig value) {
        this.deliveryConfig = value;
    }
    /**
     * Sets the destinationId property value. The unique identifier for the destination.
     * @param value Value to set for the destinationId property.
     */
    public void setDestinationId(@jakarta.annotation.Nullable final String value) {
        this.destinationId = value;
    }
    /**
     * Sets the name property value. The name associated with this destination.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the status property value. The status for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;MARKED_DOWN&lt;/b&gt; value is set by eBay systems and cannot be used in a create or update call by applications.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DISABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;MARKED_DOWN&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:DestinationStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
