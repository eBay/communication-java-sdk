package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the conversations to be updated.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkConversation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field indicates the unique identifier of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.
     */
    private String conversationId;
    /**
     * This field indicates the status for which to update the associated conversation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DELETE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;READ&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;UNREAD&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String conversationStatus;
    /**
     * This field specifies the existing type of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This value &lt;b&gt;cannot&lt;/b&gt; be updated using this method, but is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FROM_MEMBERS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FROM_EBAY&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String conversationType;
    /**
     * Instantiates a new {@link BulkConversation} and sets the default values.
     */
    public BulkConversation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkConversation}
     */
    @jakarta.annotation.Nonnull
    public static BulkConversation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkConversation();
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
     * Gets the conversationId property value. This field indicates the unique identifier of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the conversationStatus property value. This field indicates the status for which to update the associated conversation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DELETE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;READ&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;UNREAD&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationStatus() {
        return this.conversationStatus;
    }
    /**
     * Gets the conversationType property value. This field specifies the existing type of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This value &lt;b&gt;cannot&lt;/b&gt; be updated using this method, but is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FROM_MEMBERS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FROM_EBAY&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationType() {
        return this.conversationType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("conversationStatus", (n) -> { this.setConversationStatus(n.getStringValue()); });
        deserializerMap.put("conversationType", (n) -> { this.setConversationType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("conversationStatus", this.getConversationStatus());
        writer.writeStringValue("conversationType", this.getConversationType());
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
     * Sets the conversationId property value. This field indicates the unique identifier of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the conversationStatus property value. This field indicates the status for which to update the associated conversation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DELETE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;READ&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;UNREAD&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the conversationStatus property.
     */
    public void setConversationStatus(@jakarta.annotation.Nullable final String value) {
        this.conversationStatus = value;
    }
    /**
     * Sets the conversationType property value. This field specifies the existing type of the conversation that is to be updated.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This value &lt;b&gt;cannot&lt;/b&gt; be updated using this method, but is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FROM_MEMBERS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FROM_EBAY&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the conversationType property.
     */
    public void setConversationType(@jakarta.annotation.Nullable final String value) {
        this.conversationType = value;
    }
}
