package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes the details of the subscription payload.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionPayloadDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The supported delivery protocol of the notification topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;HTTPS&lt;/code&gt; is currently the only supported delivery protocol of all notification topics. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:ProtocolEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String deliveryProtocol;
    /**
     * The supported data format of the payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; JSON is currently the only supported format for all notification topics.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:FormatTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String format;
    /**
     * The supported schema version for the notification topic. See the &lt;b&gt;supportedPayloads.schemaVersion&lt;/b&gt; field for the topic in &lt;b&gt;getTopics&lt;/b&gt; or &lt;b&gt;getTopic&lt;/b&gt; response.
     */
    private String schemaVersion;
    /**
     * Instantiates a new {@link SubscriptionPayloadDetail} and sets the default values.
     */
    public SubscriptionPayloadDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubscriptionPayloadDetail}
     */
    @jakarta.annotation.Nonnull
    public static SubscriptionPayloadDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionPayloadDetail();
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
     * Gets the deliveryProtocol property value. The supported delivery protocol of the notification topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;HTTPS&lt;/code&gt; is currently the only supported delivery protocol of all notification topics. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:ProtocolEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeliveryProtocol() {
        return this.deliveryProtocol;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deliveryProtocol", (n) -> { this.setDeliveryProtocol(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The supported data format of the payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; JSON is currently the only supported format for all notification topics.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:FormatTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the schemaVersion property value. The supported schema version for the notification topic. See the &lt;b&gt;supportedPayloads.schemaVersion&lt;/b&gt; field for the topic in &lt;b&gt;getTopics&lt;/b&gt; or &lt;b&gt;getTopic&lt;/b&gt; response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deliveryProtocol", this.getDeliveryProtocol());
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
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
     * Sets the deliveryProtocol property value. The supported delivery protocol of the notification topic.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;HTTPS&lt;/code&gt; is currently the only supported delivery protocol of all notification topics. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:ProtocolEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the deliveryProtocol property.
     */
    public void setDeliveryProtocol(@jakarta.annotation.Nullable final String value) {
        this.deliveryProtocol = value;
    }
    /**
     * Sets the format property value. The supported data format of the payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; JSON is currently the only supported format for all notification topics.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:FormatTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the schemaVersion property value. The supported schema version for the notification topic. See the &lt;b&gt;supportedPayloads.schemaVersion&lt;/b&gt; field for the topic in &lt;b&gt;getTopics&lt;/b&gt; or &lt;b&gt;getTopic&lt;/b&gt; response.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
}
