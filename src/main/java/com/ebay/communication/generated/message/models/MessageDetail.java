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

package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the message details for a conversation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date,  in ISO 8601 format, the message was received.
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
     * This array returns a list, if applicable, of media attached to the message.
     */
    private java.util.List<MessageMedia> messageMedia;
    /**
     * This boolean indicates if the message has been viewed by the recipient.&lt;br&gt;&lt;br&gt;If this boolean is returned as &lt;code&gt;true&lt;/code&gt;, the message has been read. If this boolean is returned as &lt;code&gt;false&lt;/code&gt;, the message has not been read.
     */
    private Boolean readStatus;
    /**
     * The eBay username of the message recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private String recipientUsername;
    /**
     * The eBay username of the message sender.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private String senderUsername;
    /**
     * The subject line of the message.
     */
    private String subject;
    /**
     * Instantiates a new {@link MessageDetail} and sets the default values.
     */
    public MessageDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MessageDetail}
     */
    @jakarta.annotation.Nonnull
    public static MessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageDetail();
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
     * Gets the createdDate property value. The date,  in ISO 8601 format, the message was received.
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
        deserializerMap.put("recipientUsername", (n) -> { this.setRecipientUsername(n.getStringValue()); });
        deserializerMap.put("senderUsername", (n) -> { this.setSenderUsername(n.getStringValue()); });
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
     * Gets the messageMedia property value. This array returns a list, if applicable, of media attached to the message.
     * @return a {@link java.util.List<MessageMedia>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageMedia> getMessageMedia() {
        return this.messageMedia;
    }
    /**
     * Gets the readStatus property value. This boolean indicates if the message has been viewed by the recipient.&lt;br&gt;&lt;br&gt;If this boolean is returned as &lt;code&gt;true&lt;/code&gt;, the message has been read. If this boolean is returned as &lt;code&gt;false&lt;/code&gt;, the message has not been read.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReadStatus() {
        return this.readStatus;
    }
    /**
     * Gets the recipientUsername property value. The eBay username of the message recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientUsername() {
        return this.recipientUsername;
    }
    /**
     * Gets the senderUsername property value. The eBay username of the message sender.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderUsername() {
        return this.senderUsername;
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
        writer.writeStringValue("recipientUsername", this.getRecipientUsername());
        writer.writeStringValue("senderUsername", this.getSenderUsername());
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
     * Sets the createdDate property value. The date,  in ISO 8601 format, the message was received.
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
     * Sets the messageMedia property value. This array returns a list, if applicable, of media attached to the message.
     * @param value Value to set for the messageMedia property.
     */
    public void setMessageMedia(@jakarta.annotation.Nullable final java.util.List<MessageMedia> value) {
        this.messageMedia = value;
    }
    /**
     * Sets the readStatus property value. This boolean indicates if the message has been viewed by the recipient.&lt;br&gt;&lt;br&gt;If this boolean is returned as &lt;code&gt;true&lt;/code&gt;, the message has been read. If this boolean is returned as &lt;code&gt;false&lt;/code&gt;, the message has not been read.
     * @param value Value to set for the readStatus property.
     */
    public void setReadStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.readStatus = value;
    }
    /**
     * Sets the recipientUsername property value. The eBay username of the message recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the recipientUsername property.
     */
    public void setRecipientUsername(@jakarta.annotation.Nullable final String value) {
        this.recipientUsername = value;
    }
    /**
     * Sets the senderUsername property value. The eBay username of the message sender.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the senderUsername property.
     */
    public void setSenderUsername(@jakarta.annotation.Nullable final String value) {
        this.senderUsername = value;
    }
    /**
     * Sets the subject property value. The subject line of the message.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
