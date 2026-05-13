package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the details of a conversation, such as its ID, status, type, and latest message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the conversation.
     */
    private String conversationId;
    /**
     * This value indicates the current status of the conversation, such as &lt;code&gt;ACTIVE&lt;/code&gt; or &lt;code&gt;ARCHIVE&lt;/code&gt;.
     */
    private String conversationStatus;
    /**
     * The title of the conversation.
     */
    private String conversationTitle;
    /**
     * This value indicates the type of the conversation, such as &lt;code&gt;FROM_EBAY&lt;/code&gt; or &lt;code&gt;FROM_MEMBERS&lt;/code&gt;.
     */
    private String conversationType;
    /**
     * This value indicates the date, in ISO 8601 format, the conversation was created.
     */
    private String createdDate;
    /**
     * This type defines message details for a conversation.
     */
    private MessageDetail latestMessage;
    /**
     * This value indicates the reference ID associated with the corresponding &lt;b&gt;referenceType&lt;/b&gt; value.&lt;br&gt;&lt;br&gt;In the case of a &lt;code&gt;LISTING&lt;/code&gt; &lt;b&gt;referenceType&lt;/b&gt;, this value will be the item ID value of the associated listing.
     */
    private String referenceId;
    /**
     * This value indicates the reference type, if applicable, associated with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;b&gt;referenceId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;Currently, only &lt;code&gt;LISTING&lt;/code&gt; will be returned.
     */
    private String referenceType;
    /**
     * This value indicates the amount of unread messages in the conversation.
     */
    private Integer unreadCount;
    /**
     * Instantiates a new {@link ConversationDetail} and sets the default values.
     */
    public ConversationDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConversationDetail}
     */
    @jakarta.annotation.Nonnull
    public static ConversationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationDetail();
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
     * Gets the conversationId property value. The unique identifier of the conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the conversationStatus property value. This value indicates the current status of the conversation, such as &lt;code&gt;ACTIVE&lt;/code&gt; or &lt;code&gt;ARCHIVE&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationStatus() {
        return this.conversationStatus;
    }
    /**
     * Gets the conversationTitle property value. The title of the conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationTitle() {
        return this.conversationTitle;
    }
    /**
     * Gets the conversationType property value. This value indicates the type of the conversation, such as &lt;code&gt;FROM_EBAY&lt;/code&gt; or &lt;code&gt;FROM_MEMBERS&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationType() {
        return this.conversationType;
    }
    /**
     * Gets the createdDate property value. This value indicates the date, in ISO 8601 format, the conversation was created.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("conversationStatus", (n) -> { this.setConversationStatus(n.getStringValue()); });
        deserializerMap.put("conversationTitle", (n) -> { this.setConversationTitle(n.getStringValue()); });
        deserializerMap.put("conversationType", (n) -> { this.setConversationType(n.getStringValue()); });
        deserializerMap.put("createdDate", (n) -> { this.setCreatedDate(n.getStringValue()); });
        deserializerMap.put("latestMessage", (n) -> { this.setLatestMessage(n.getObjectValue(MessageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("referenceType", (n) -> { this.setReferenceType(n.getStringValue()); });
        deserializerMap.put("unreadCount", (n) -> { this.setUnreadCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestMessage property value. This type defines message details for a conversation.
     * @return a {@link MessageDetail}
     */
    @jakarta.annotation.Nullable
    public MessageDetail getLatestMessage() {
        return this.latestMessage;
    }
    /**
     * Gets the referenceId property value. This value indicates the reference ID associated with the corresponding &lt;b&gt;referenceType&lt;/b&gt; value.&lt;br&gt;&lt;br&gt;In the case of a &lt;code&gt;LISTING&lt;/code&gt; &lt;b&gt;referenceType&lt;/b&gt;, this value will be the item ID value of the associated listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.referenceId;
    }
    /**
     * Gets the referenceType property value. This value indicates the reference type, if applicable, associated with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;b&gt;referenceId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;Currently, only &lt;code&gt;LISTING&lt;/code&gt; will be returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceType() {
        return this.referenceType;
    }
    /**
     * Gets the unreadCount property value. This value indicates the amount of unread messages in the conversation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnreadCount() {
        return this.unreadCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("conversationStatus", this.getConversationStatus());
        writer.writeStringValue("conversationTitle", this.getConversationTitle());
        writer.writeStringValue("conversationType", this.getConversationType());
        writer.writeStringValue("createdDate", this.getCreatedDate());
        writer.writeObjectValue("latestMessage", this.getLatestMessage());
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeStringValue("referenceType", this.getReferenceType());
        writer.writeIntegerValue("unreadCount", this.getUnreadCount());
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
     * Sets the conversationId property value. The unique identifier of the conversation.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the conversationStatus property value. This value indicates the current status of the conversation, such as &lt;code&gt;ACTIVE&lt;/code&gt; or &lt;code&gt;ARCHIVE&lt;/code&gt;.
     * @param value Value to set for the conversationStatus property.
     */
    public void setConversationStatus(@jakarta.annotation.Nullable final String value) {
        this.conversationStatus = value;
    }
    /**
     * Sets the conversationTitle property value. The title of the conversation.
     * @param value Value to set for the conversationTitle property.
     */
    public void setConversationTitle(@jakarta.annotation.Nullable final String value) {
        this.conversationTitle = value;
    }
    /**
     * Sets the conversationType property value. This value indicates the type of the conversation, such as &lt;code&gt;FROM_EBAY&lt;/code&gt; or &lt;code&gt;FROM_MEMBERS&lt;/code&gt;.
     * @param value Value to set for the conversationType property.
     */
    public void setConversationType(@jakarta.annotation.Nullable final String value) {
        this.conversationType = value;
    }
    /**
     * Sets the createdDate property value. This value indicates the date, in ISO 8601 format, the conversation was created.
     * @param value Value to set for the createdDate property.
     */
    public void setCreatedDate(@jakarta.annotation.Nullable final String value) {
        this.createdDate = value;
    }
    /**
     * Sets the latestMessage property value. This type defines message details for a conversation.
     * @param value Value to set for the latestMessage property.
     */
    public void setLatestMessage(@jakarta.annotation.Nullable final MessageDetail value) {
        this.latestMessage = value;
    }
    /**
     * Sets the referenceId property value. This value indicates the reference ID associated with the corresponding &lt;b&gt;referenceType&lt;/b&gt; value.&lt;br&gt;&lt;br&gt;In the case of a &lt;code&gt;LISTING&lt;/code&gt; &lt;b&gt;referenceType&lt;/b&gt;, this value will be the item ID value of the associated listing.
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.referenceId = value;
    }
    /**
     * Sets the referenceType property value. This value indicates the reference type, if applicable, associated with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;b&gt;referenceId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;Currently, only &lt;code&gt;LISTING&lt;/code&gt; will be returned.
     * @param value Value to set for the referenceType property.
     */
    public void setReferenceType(@jakarta.annotation.Nullable final String value) {
        this.referenceType = value;
    }
    /**
     * Sets the unreadCount property value. This value indicates the amount of unread messages in the conversation.
     * @param value Value to set for the unreadCount property.
     */
    public void setUnreadCount(@jakarta.annotation.Nullable final Integer value) {
        this.unreadCount = value;
    }
}
