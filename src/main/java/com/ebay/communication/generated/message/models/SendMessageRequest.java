package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the request payload of the &lt;b&gt;sendMessage&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendMessageRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field specifies the unique identifier of the conversation in which to send the message.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.&lt;br&gt;&lt;br&gt;This field is required if sending a message in an existing conversation.
     */
    private String conversationId;
    /**
     * This boolean indicates whether a copy of the message should be emailed to the sender.&lt;br&gt;&lt;br&gt;If this boolean is input as &lt;code&gt;true&lt;/code&gt;, a copy of the message will be emailed to the sender.
     */
    private Boolean emailCopyToSender;
    /**
     * This array lists the individual forms of media, if any, to be attached to the message.&lt;br&gt;&lt;br&gt;Up to five individual forms of media may be be sent per message. If more than five are specified in this array, an error will occur and the call will fail.
     */
    private java.util.List<MessageMedia> messageMedia;
    /**
     * The text of the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 2000 characters
     */
    private String messageText;
    /**
     * This field specifies the eBay username of the entity for which to send the message.&lt;br&gt;&lt;br&gt;This field is required if starting a new conversation with another eBay user.
     */
    private String otherPartyUsername;
    /**
     * This type specifies the reference type and associated reference ID associated with a message.
     */
    private Reference reference;
    /**
     * Instantiates a new {@link SendMessageRequest} and sets the default values.
     */
    public SendMessageRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendMessageRequest}
     */
    @jakarta.annotation.Nonnull
    public static SendMessageRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendMessageRequest();
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
     * Gets the conversationId property value. This field specifies the unique identifier of the conversation in which to send the message.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.&lt;br&gt;&lt;br&gt;This field is required if sending a message in an existing conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the emailCopyToSender property value. This boolean indicates whether a copy of the message should be emailed to the sender.&lt;br&gt;&lt;br&gt;If this boolean is input as &lt;code&gt;true&lt;/code&gt;, a copy of the message will be emailed to the sender.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailCopyToSender() {
        return this.emailCopyToSender;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("emailCopyToSender", (n) -> { this.setEmailCopyToSender(n.getBooleanValue()); });
        deserializerMap.put("messageMedia", (n) -> { this.setMessageMedia(n.getCollectionOfObjectValues(MessageMedia::createFromDiscriminatorValue)); });
        deserializerMap.put("messageText", (n) -> { this.setMessageText(n.getStringValue()); });
        deserializerMap.put("otherPartyUsername", (n) -> { this.setOtherPartyUsername(n.getStringValue()); });
        deserializerMap.put("reference", (n) -> { this.setReference(n.getObjectValue(Reference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messageMedia property value. This array lists the individual forms of media, if any, to be attached to the message.&lt;br&gt;&lt;br&gt;Up to five individual forms of media may be be sent per message. If more than five are specified in this array, an error will occur and the call will fail.
     * @return a {@link java.util.List<MessageMedia>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageMedia> getMessageMedia() {
        return this.messageMedia;
    }
    /**
     * Gets the messageText property value. The text of the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 2000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageText() {
        return this.messageText;
    }
    /**
     * Gets the otherPartyUsername property value. This field specifies the eBay username of the entity for which to send the message.&lt;br&gt;&lt;br&gt;This field is required if starting a new conversation with another eBay user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOtherPartyUsername() {
        return this.otherPartyUsername;
    }
    /**
     * Gets the reference property value. This type specifies the reference type and associated reference ID associated with a message.
     * @return a {@link Reference}
     */
    @jakarta.annotation.Nullable
    public Reference getReference() {
        return this.reference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeBooleanValue("emailCopyToSender", this.getEmailCopyToSender());
        writer.writeCollectionOfObjectValues("messageMedia", this.getMessageMedia());
        writer.writeStringValue("messageText", this.getMessageText());
        writer.writeStringValue("otherPartyUsername", this.getOtherPartyUsername());
        writer.writeObjectValue("reference", this.getReference());
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
     * Sets the conversationId property value. This field specifies the unique identifier of the conversation in which to send the message.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.&lt;br&gt;&lt;br&gt;This field is required if sending a message in an existing conversation.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the emailCopyToSender property value. This boolean indicates whether a copy of the message should be emailed to the sender.&lt;br&gt;&lt;br&gt;If this boolean is input as &lt;code&gt;true&lt;/code&gt;, a copy of the message will be emailed to the sender.
     * @param value Value to set for the emailCopyToSender property.
     */
    public void setEmailCopyToSender(@jakarta.annotation.Nullable final Boolean value) {
        this.emailCopyToSender = value;
    }
    /**
     * Sets the messageMedia property value. This array lists the individual forms of media, if any, to be attached to the message.&lt;br&gt;&lt;br&gt;Up to five individual forms of media may be be sent per message. If more than five are specified in this array, an error will occur and the call will fail.
     * @param value Value to set for the messageMedia property.
     */
    public void setMessageMedia(@jakarta.annotation.Nullable final java.util.List<MessageMedia> value) {
        this.messageMedia = value;
    }
    /**
     * Sets the messageText property value. The text of the message.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 2000 characters
     * @param value Value to set for the messageText property.
     */
    public void setMessageText(@jakarta.annotation.Nullable final String value) {
        this.messageText = value;
    }
    /**
     * Sets the otherPartyUsername property value. This field specifies the eBay username of the entity for which to send the message.&lt;br&gt;&lt;br&gt;This field is required if starting a new conversation with another eBay user.
     * @param value Value to set for the otherPartyUsername property.
     */
    public void setOtherPartyUsername(@jakarta.annotation.Nullable final String value) {
        this.otherPartyUsername = value;
    }
    /**
     * Sets the reference property value. This type specifies the reference type and associated reference ID associated with a message.
     * @param value Value to set for the reference property.
     */
    public void setReference(@jakarta.annotation.Nullable final Reference value) {
        this.reference = value;
    }
}
