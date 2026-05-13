package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines fields for user feedback collection, including acceptable values, a default preselection value, and an early feedback message. It also provides fields to enable the template, and limits and options for freetext character, multi-value rating, and other similar features.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRatingTemplateType implements AdditionalDataHolder, Parsable {
    /**
     * This array contains a list of available values for use in a particular rating, and whether the value is enabled. Provided if &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;RANGE&lt;/code&gt; or &lt;code&gt;PREDEFINED&lt;/code&gt;.&lt;p&gt;The following is an example of a predefined list:&lt;pre&gt;[&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;POSITIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Positive&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEUTRAL&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Neutral&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEGATIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Negative&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  }&lt;/br&gt;]&lt;/pre&gt;For other examples, see the &lt;a href=&quot;/develop/guides-v2/communications/sell-communications-guide#using-rating-templates&quot;  target=&quot;_blank&quot;&gt;Using rating templates&lt;/a&gt;.
     */
    private java.util.List<FeedbackRatingAcceptableValue> acceptableValues;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default value preselected for the rating, if set.
     */
    private String defaultValue;
    /**
     * For eligible sellers, a message may be shown requiring a wait period before you can leave neutral or negative feedback.
     */
    private String earlyFeedbackMessage;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the corresponding feedback rating template is enabled for the user to provide feedback for this line item. This value will generally be &lt;code&gt;true&lt;/code&gt; when the user role is a buyer, but &lt;code&gt;false&lt;/code&gt; when the user role is a seller because buyers do not have Detailed Seller Ratings (DSRs).
     */
    private Boolean enabled;
    /**
     * The maximum number of characters allowed to be used for a rating that uses free text. It is only applicable for a rating whose &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;FREETEXT&lt;/code&gt;. &lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;500&lt;/p&gt;
     */
    private Integer maximumCharactersAllowed;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, multiple values can be specified for the rating.
     */
    private Boolean multiValueRating;
    /**
     * This enumerated value indicates the type of rating that is tracked for the seller. All of the metadata returned under each node for the &lt;b&gt;ratingTemplates&lt;/b&gt; array will apply to this rating type. For example, the value &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating is for the overall transaction experience. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ratingKey;
    /**
     * This field provides more details about and/or provides guidance on the corresponding rating type. For example, the rating label of &lt;b&gt;Rate this transaction&lt;/b&gt; describes the feedback for the user to enter for an &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; &lt;b&gt;ratingKey&lt;/b&gt;.
     */
    private String ratingLabel;
    /**
     * This enumerated value indicates the type of data used to provide the specific feedback rating.&lt;br&gt;&lt;p&gt;If set to &lt;code&gt;PREDEFINED&lt;/code&gt; or &lt;code&gt;RANGE&lt;/code&gt;, is returned here, more information on the supported values will be returned under the &lt;b&gt;acceptableValues&lt;/b&gt; array. If &lt;code&gt;FREETEXT&lt;/code&gt; is returned here, the maximum number of characters supported can be seen in the &lt;b&gt;maximumCharactersAllowed&lt;/b&gt; field.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingValueTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ratingValueType;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this rating type is required when leaving feedback.
     */
    private Boolean required;
    /**
     * Instantiates a new {@link FeedbackRatingTemplateType} and sets the default values.
     */
    public FeedbackRatingTemplateType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackRatingTemplateType}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackRatingTemplateType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackRatingTemplateType();
    }
    /**
     * Gets the acceptableValues property value. This array contains a list of available values for use in a particular rating, and whether the value is enabled. Provided if &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;RANGE&lt;/code&gt; or &lt;code&gt;PREDEFINED&lt;/code&gt;.&lt;p&gt;The following is an example of a predefined list:&lt;pre&gt;[&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;POSITIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Positive&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEUTRAL&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Neutral&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEGATIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Negative&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  }&lt;/br&gt;]&lt;/pre&gt;For other examples, see the &lt;a href=&quot;/develop/guides-v2/communications/sell-communications-guide#using-rating-templates&quot;  target=&quot;_blank&quot;&gt;Using rating templates&lt;/a&gt;.
     * @return a {@link java.util.List<FeedbackRatingAcceptableValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackRatingAcceptableValue> getAcceptableValues() {
        return this.acceptableValues;
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
     * Gets the defaultValue property value. The default value preselected for the rating, if set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the earlyFeedbackMessage property value. For eligible sellers, a message may be shown requiring a wait period before you can leave neutral or negative feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEarlyFeedbackMessage() {
        return this.earlyFeedbackMessage;
    }
    /**
     * Gets the enabled property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the corresponding feedback rating template is enabled for the user to provide feedback for this line item. This value will generally be &lt;code&gt;true&lt;/code&gt; when the user role is a buyer, but &lt;code&gt;false&lt;/code&gt; when the user role is a seller because buyers do not have Detailed Seller Ratings (DSRs).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("acceptableValues", (n) -> { this.setAcceptableValues(n.getCollectionOfObjectValues(FeedbackRatingAcceptableValue::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("earlyFeedbackMessage", (n) -> { this.setEarlyFeedbackMessage(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("maximumCharactersAllowed", (n) -> { this.setMaximumCharactersAllowed(n.getIntegerValue()); });
        deserializerMap.put("multiValueRating", (n) -> { this.setMultiValueRating(n.getBooleanValue()); });
        deserializerMap.put("ratingKey", (n) -> { this.setRatingKey(n.getStringValue()); });
        deserializerMap.put("ratingLabel", (n) -> { this.setRatingLabel(n.getStringValue()); });
        deserializerMap.put("ratingValueType", (n) -> { this.setRatingValueType(n.getStringValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCharactersAllowed property value. The maximum number of characters allowed to be used for a rating that uses free text. It is only applicable for a rating whose &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;FREETEXT&lt;/code&gt;. &lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;500&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCharactersAllowed() {
        return this.maximumCharactersAllowed;
    }
    /**
     * Gets the multiValueRating property value. If returned as &lt;code&gt;true&lt;/code&gt;, multiple values can be specified for the rating.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMultiValueRating() {
        return this.multiValueRating;
    }
    /**
     * Gets the ratingKey property value. This enumerated value indicates the type of rating that is tracked for the seller. All of the metadata returned under each node for the &lt;b&gt;ratingTemplates&lt;/b&gt; array will apply to this rating type. For example, the value &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating is for the overall transaction experience. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRatingKey() {
        return this.ratingKey;
    }
    /**
     * Gets the ratingLabel property value. This field provides more details about and/or provides guidance on the corresponding rating type. For example, the rating label of &lt;b&gt;Rate this transaction&lt;/b&gt; describes the feedback for the user to enter for an &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; &lt;b&gt;ratingKey&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRatingLabel() {
        return this.ratingLabel;
    }
    /**
     * Gets the ratingValueType property value. This enumerated value indicates the type of data used to provide the specific feedback rating.&lt;br&gt;&lt;p&gt;If set to &lt;code&gt;PREDEFINED&lt;/code&gt; or &lt;code&gt;RANGE&lt;/code&gt;, is returned here, more information on the supported values will be returned under the &lt;b&gt;acceptableValues&lt;/b&gt; array. If &lt;code&gt;FREETEXT&lt;/code&gt; is returned here, the maximum number of characters supported can be seen in the &lt;b&gt;maximumCharactersAllowed&lt;/b&gt; field.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingValueTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRatingValueType() {
        return this.ratingValueType;
    }
    /**
     * Gets the required property value. If returned as &lt;code&gt;true&lt;/code&gt;, this rating type is required when leaving feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("acceptableValues", this.getAcceptableValues());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeStringValue("earlyFeedbackMessage", this.getEarlyFeedbackMessage());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeIntegerValue("maximumCharactersAllowed", this.getMaximumCharactersAllowed());
        writer.writeBooleanValue("multiValueRating", this.getMultiValueRating());
        writer.writeStringValue("ratingKey", this.getRatingKey());
        writer.writeStringValue("ratingLabel", this.getRatingLabel());
        writer.writeStringValue("ratingValueType", this.getRatingValueType());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptableValues property value. This array contains a list of available values for use in a particular rating, and whether the value is enabled. Provided if &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;RANGE&lt;/code&gt; or &lt;code&gt;PREDEFINED&lt;/code&gt;.&lt;p&gt;The following is an example of a predefined list:&lt;pre&gt;[&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;POSITIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Positive&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEUTRAL&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Neutral&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  },&lt;br&gt;  {&lt;br&gt;    &quot;value&quot;: &quot;NEGATIVE&quot;,&lt;br&gt;    &quot;valueLabel&quot;: &quot;Negative&quot;,&lt;br&gt;    &quot;enabled&quot;: true&lt;br&gt;  }&lt;/br&gt;]&lt;/pre&gt;For other examples, see the &lt;a href=&quot;/develop/guides-v2/communications/sell-communications-guide#using-rating-templates&quot;  target=&quot;_blank&quot;&gt;Using rating templates&lt;/a&gt;.
     * @param value Value to set for the acceptableValues property.
     */
    public void setAcceptableValues(@jakarta.annotation.Nullable final java.util.List<FeedbackRatingAcceptableValue> value) {
        this.acceptableValues = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultValue property value. The default value preselected for the rating, if set.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the earlyFeedbackMessage property value. For eligible sellers, a message may be shown requiring a wait period before you can leave neutral or negative feedback.
     * @param value Value to set for the earlyFeedbackMessage property.
     */
    public void setEarlyFeedbackMessage(@jakarta.annotation.Nullable final String value) {
        this.earlyFeedbackMessage = value;
    }
    /**
     * Sets the enabled property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the corresponding feedback rating template is enabled for the user to provide feedback for this line item. This value will generally be &lt;code&gt;true&lt;/code&gt; when the user role is a buyer, but &lt;code&gt;false&lt;/code&gt; when the user role is a seller because buyers do not have Detailed Seller Ratings (DSRs).
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the maximumCharactersAllowed property value. The maximum number of characters allowed to be used for a rating that uses free text. It is only applicable for a rating whose &lt;b&gt;ratingValueType&lt;/b&gt; is &lt;code&gt;FREETEXT&lt;/code&gt;. &lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;500&lt;/p&gt;
     * @param value Value to set for the maximumCharactersAllowed property.
     */
    public void setMaximumCharactersAllowed(@jakarta.annotation.Nullable final Integer value) {
        this.maximumCharactersAllowed = value;
    }
    /**
     * Sets the multiValueRating property value. If returned as &lt;code&gt;true&lt;/code&gt;, multiple values can be specified for the rating.
     * @param value Value to set for the multiValueRating property.
     */
    public void setMultiValueRating(@jakarta.annotation.Nullable final Boolean value) {
        this.multiValueRating = value;
    }
    /**
     * Sets the ratingKey property value. This enumerated value indicates the type of rating that is tracked for the seller. All of the metadata returned under each node for the &lt;b&gt;ratingTemplates&lt;/b&gt; array will apply to this rating type. For example, the value &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating is for the overall transaction experience. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ratingKey property.
     */
    public void setRatingKey(@jakarta.annotation.Nullable final String value) {
        this.ratingKey = value;
    }
    /**
     * Sets the ratingLabel property value. This field provides more details about and/or provides guidance on the corresponding rating type. For example, the rating label of &lt;b&gt;Rate this transaction&lt;/b&gt; describes the feedback for the user to enter for an &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; &lt;b&gt;ratingKey&lt;/b&gt;.
     * @param value Value to set for the ratingLabel property.
     */
    public void setRatingLabel(@jakarta.annotation.Nullable final String value) {
        this.ratingLabel = value;
    }
    /**
     * Sets the ratingValueType property value. This enumerated value indicates the type of data used to provide the specific feedback rating.&lt;br&gt;&lt;p&gt;If set to &lt;code&gt;PREDEFINED&lt;/code&gt; or &lt;code&gt;RANGE&lt;/code&gt;, is returned here, more information on the supported values will be returned under the &lt;b&gt;acceptableValues&lt;/b&gt; array. If &lt;code&gt;FREETEXT&lt;/code&gt; is returned here, the maximum number of characters supported can be seen in the &lt;b&gt;maximumCharactersAllowed&lt;/b&gt; field.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingValueTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ratingValueType property.
     */
    public void setRatingValueType(@jakarta.annotation.Nullable final String value) {
        this.ratingValueType = value;
    }
    /**
     * Sets the required property value. If returned as &lt;code&gt;true&lt;/code&gt;, this rating type is required when leaving feedback.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.required = value;
    }
}
