package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the type of message media sent when sending a message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageMedia implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the media attached to the message.
     */
    private String mediaName;
    /**
     * The type of media attached to the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;IMAGE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PDF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DOC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TXT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String mediaType;
    /**
     * The URL of the self-hosted media attached to the message. URLs must use the &quot;HTTPS&quot; protocol.
     */
    private String mediaUrl;
    /**
     * Instantiates a new {@link MessageMedia} and sets the default values.
     */
    public MessageMedia() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MessageMedia}
     */
    @jakarta.annotation.Nonnull
    public static MessageMedia createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageMedia();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("mediaName", (n) -> { this.setMediaName(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("mediaUrl", (n) -> { this.setMediaUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaName property value. The name of the media attached to the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaName() {
        return this.mediaName;
    }
    /**
     * Gets the mediaType property value. The type of media attached to the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;IMAGE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PDF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DOC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TXT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
    }
    /**
     * Gets the mediaUrl property value. The URL of the self-hosted media attached to the message. URLs must use the &quot;HTTPS&quot; protocol.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaUrl() {
        return this.mediaUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("mediaName", this.getMediaName());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeStringValue("mediaUrl", this.getMediaUrl());
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
     * Sets the mediaName property value. The name of the media attached to the message.
     * @param value Value to set for the mediaName property.
     */
    public void setMediaName(@jakarta.annotation.Nullable final String value) {
        this.mediaName = value;
    }
    /**
     * Sets the mediaType property value. The type of media attached to the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;IMAGE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PDF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DOC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TXT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.mediaType = value;
    }
    /**
     * Sets the mediaUrl property value. The URL of the self-hosted media attached to the message. URLs must use the &quot;HTTPS&quot; protocol.
     * @param value Value to set for the mediaUrl property.
     */
    public void setMediaUrl(@jakarta.annotation.Nullable final String value) {
        this.mediaUrl = value;
    }
}
