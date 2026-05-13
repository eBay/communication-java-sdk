package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the &lt;b&gt;respondToFeedback&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RespondToFeedbackRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Use this field to provide the unique identifier for the feedback being responded to, used to specify the feedback entry associated with the feedback response. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.feedbackId&quot;  target=&quot;_blank&quot;&gt;feedbackId&lt;/a&gt; field).
     */
    private String feedbackId;
    /**
     * Use this field to provide the identifier of the user who provided the original feedback. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.providerUserDetail.userId&quot;  target=&quot;_blank&quot;&gt;userId&lt;/a&gt; field).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Both usernames and public user IDs will be accepted in this field. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private String recipientUserId;
    /**
     * Use this field to provide the text content of the response. This field is used to provide additional context or address the feedback given by the order partner. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 500 characters.
     */
    private String responseText;
    /**
     * Set this enumerated value to describe the type of response being submitted (for example, a &lt;code&gt;REPLY&lt;/code&gt; or a &lt;code&gt;FOLLOW_UP&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:ResponseTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String responseType;
    /**
     * Instantiates a new {@link RespondToFeedbackRequest} and sets the default values.
     */
    public RespondToFeedbackRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RespondToFeedbackRequest}
     */
    @jakarta.annotation.Nonnull
    public static RespondToFeedbackRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RespondToFeedbackRequest();
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
     * Gets the feedbackId property value. Use this field to provide the unique identifier for the feedback being responded to, used to specify the feedback entry associated with the feedback response. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.feedbackId&quot;  target=&quot;_blank&quot;&gt;feedbackId&lt;/a&gt; field).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedbackId() {
        return this.feedbackId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("feedbackId", (n) -> { this.setFeedbackId(n.getStringValue()); });
        deserializerMap.put("recipientUserId", (n) -> { this.setRecipientUserId(n.getStringValue()); });
        deserializerMap.put("responseText", (n) -> { this.setResponseText(n.getStringValue()); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientUserId property value. Use this field to provide the identifier of the user who provided the original feedback. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.providerUserDetail.userId&quot;  target=&quot;_blank&quot;&gt;userId&lt;/a&gt; field).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Both usernames and public user IDs will be accepted in this field. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientUserId() {
        return this.recipientUserId;
    }
    /**
     * Gets the responseText property value. Use this field to provide the text content of the response. This field is used to provide additional context or address the feedback given by the order partner. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 500 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponseText() {
        return this.responseText;
    }
    /**
     * Gets the responseType property value. Set this enumerated value to describe the type of response being submitted (for example, a &lt;code&gt;REPLY&lt;/code&gt; or a &lt;code&gt;FOLLOW_UP&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:ResponseTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponseType() {
        return this.responseType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("feedbackId", this.getFeedbackId());
        writer.writeStringValue("recipientUserId", this.getRecipientUserId());
        writer.writeStringValue("responseText", this.getResponseText());
        writer.writeStringValue("responseType", this.getResponseType());
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
     * Sets the feedbackId property value. Use this field to provide the unique identifier for the feedback being responded to, used to specify the feedback entry associated with the feedback response. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.feedbackId&quot;  target=&quot;_blank&quot;&gt;feedbackId&lt;/a&gt; field).
     * @param value Value to set for the feedbackId property.
     */
    public void setFeedbackId(@jakarta.annotation.Nullable final String value) {
        this.feedbackId = value;
    }
    /**
     * Sets the recipientUserId property value. Use this field to provide the identifier of the user who provided the original feedback. This value can be returned using the &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback&quot;  target=&quot;_blank&quot;&gt;getFeedback&lt;/a&gt; method (&lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.providerUserDetail.userId&quot;  target=&quot;_blank&quot;&gt;userId&lt;/a&gt; field).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Both usernames and public user IDs will be accepted in this field. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the recipientUserId property.
     */
    public void setRecipientUserId(@jakarta.annotation.Nullable final String value) {
        this.recipientUserId = value;
    }
    /**
     * Sets the responseText property value. Use this field to provide the text content of the response. This field is used to provide additional context or address the feedback given by the order partner. No HTML formatting or personal information (such as phone numbers) is permitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 500 characters.
     * @param value Value to set for the responseText property.
     */
    public void setResponseText(@jakarta.annotation.Nullable final String value) {
        this.responseText = value;
    }
    /**
     * Sets the responseType property value. Set this enumerated value to describe the type of response being submitted (for example, a &lt;code&gt;REPLY&lt;/code&gt; or a &lt;code&gt;FOLLOW_UP&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:ResponseTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the responseType property.
     */
    public void setResponseType(@jakarta.annotation.Nullable final String value) {
        this.responseType = value;
    }
}
