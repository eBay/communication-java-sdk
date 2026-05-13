package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response payload of the &lt;b&gt;sendMessage&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendMessageResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date, in ISO 8601 format, the message was sent.
     */
    private String createdDate;
    /**
     * The message text.
     */
    private String messageBody;
    /**
     * The unique identifier of the message.
     */
    private String messageId;
    /**
     * This array will be returned if the user attached one or more images or documents to the message.
     */
    private java.util.List<MessageMedia> messageMedia;
    /**
     * The read status of the message.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the message has been read by the recipient.
     */
    private Boolean readStatus;
    /**
     * The eBay username of the recipient.
     */
    private String recipientUserName;
    /**
     * The eBay username of the sender.
     */
    private String senderUserName;
    /**
     * The subject line of the message.
     */
    private String subject;
    /**
     * Instantiates a new {@link SendMessageResponse} and sets the default values.
     */
    public SendMessageResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendMessageResponse}
     */
    @jakarta.annotation.Nonnull
    public static SendMessageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendMessageResponse();
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
     * Gets the createdDate property value. The date, in ISO 8601 format, the message was sent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("createdDate", (n) -> { this.setCreatedDate(n.getStringValue()); });
        deserializerMap.put("messageBody", (n) -> { this.setMessageBody(n.getStringValue()); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("messageMedia", (n) -> { this.setMessageMedia(n.getCollectionOfObjectValues(MessageMedia::createFromDiscriminatorValue)); });
        deserializerMap.put("readStatus", (n) -> { this.setReadStatus(n.getBooleanValue()); });
        deserializerMap.put("recipientUserName", (n) -> { this.setRecipientUserName(n.getStringValue()); });
        deserializerMap.put("senderUserName", (n) -> { this.setSenderUserName(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageBody property value. The message text.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageBody() {
        return this.messageBody;
    }
    /**
     * Gets the messageId property value. The unique identifier of the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * Gets the messageMedia property value. This array will be returned if the user attached one or more images or documents to the message.
     * @return a {@link java.util.List<MessageMedia>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageMedia> getMessageMedia() {
        return this.messageMedia;
    }
    /**
     * Gets the readStatus property value. The read status of the message.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the message has been read by the recipient.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReadStatus() {
        return this.readStatus;
    }
    /**
     * Gets the recipientUserName property value. The eBay username of the recipient.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientUserName() {
        return this.recipientUserName;
    }
    /**
     * Gets the senderUserName property value. The eBay username of the sender.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderUserName() {
        return this.senderUserName;
    }
    /**
     * Gets the subject property value. The subject line of the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("createdDate", this.getCreatedDate());
        writer.writeStringValue("messageBody", this.getMessageBody());
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeCollectionOfObjectValues("messageMedia", this.getMessageMedia());
        writer.writeBooleanValue("readStatus", this.getReadStatus());
        writer.writeStringValue("recipientUserName", this.getRecipientUserName());
        writer.writeStringValue("senderUserName", this.getSenderUserName());
        writer.writeStringValue("subject", this.getSubject());
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
     * Sets the createdDate property value. The date, in ISO 8601 format, the message was sent.
     * @param value Value to set for the createdDate property.
     */
    public void setCreatedDate(@jakarta.annotation.Nullable final String value) {
        this.createdDate = value;
    }
    /**
     * Sets the messageBody property value. The message text.
     * @param value Value to set for the messageBody property.
     */
    public void setMessageBody(@jakarta.annotation.Nullable final String value) {
        this.messageBody = value;
    }
    /**
     * Sets the messageId property value. The unique identifier of the message.
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.messageId = value;
    }
    /**
     * Sets the messageMedia property value. This array will be returned if the user attached one or more images or documents to the message.
     * @param value Value to set for the messageMedia property.
     */
    public void setMessageMedia(@jakarta.annotation.Nullable final java.util.List<MessageMedia> value) {
        this.messageMedia = value;
    }
    /**
     * Sets the readStatus property value. The read status of the message.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the message has been read by the recipient.
     * @param value Value to set for the readStatus property.
     */
    public void setReadStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.readStatus = value;
    }
    /**
     * Sets the recipientUserName property value. The eBay username of the recipient.
     * @param value Value to set for the recipientUserName property.
     */
    public void setRecipientUserName(@jakarta.annotation.Nullable final String value) {
        this.recipientUserName = value;
    }
    /**
     * Sets the senderUserName property value. The eBay username of the sender.
     * @param value Value to set for the senderUserName property.
     */
    public void setSenderUserName(@jakarta.annotation.Nullable final String value) {
        this.senderUserName = value;
    }
    /**
     * Sets the subject property value. The subject line of the message.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
