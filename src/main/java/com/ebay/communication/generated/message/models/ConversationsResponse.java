package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides the updated information for a conversation that has been modified.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the conversation.
     */
    private String conversationId;
    /**
     * The update status of the conversation, such as &lt;code&gt;SUCCESS&lt;/code&gt; or &lt;code&gt;FAILURE&lt;/code&gt;.
     */
    private String updateStatus;
    /**
     * Instantiates a new {@link ConversationsResponse} and sets the default values.
     */
    public ConversationsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConversationsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ConversationsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationsResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("updateStatus", (n) -> { this.setUpdateStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the updateStatus property value. The update status of the conversation, such as &lt;code&gt;SUCCESS&lt;/code&gt; or &lt;code&gt;FAILURE&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdateStatus() {
        return this.updateStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("updateStatus", this.getUpdateStatus());
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
     * Sets the updateStatus property value. The update status of the conversation, such as &lt;code&gt;SUCCESS&lt;/code&gt; or &lt;code&gt;FAILURE&lt;/code&gt;.
     * @param value Value to set for the updateStatus property.
     */
    public void setUpdateStatus(@jakarta.annotation.Nullable final String value) {
        this.updateStatus = value;
    }
}
