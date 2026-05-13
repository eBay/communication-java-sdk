package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides fields for available values for use in a particular rating, and whether the value is enabled.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRatingAcceptableValue implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If &lt;code&gt;true&lt;/code&gt;, this boolean indicates that this value is enabled and selectable.
     */
    private Boolean enabled;
    /**
     * The value that can be selected for feedback. For most &lt;b&gt;ratingType&lt;/b&gt; values, this is &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating. For &lt;b&gt;ratingType&lt;/b&gt; of &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, this can be &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, and &lt;code&gt;NEUTRAL&lt;/code&gt;. These are the same values as used with the &lt;b&gt;leaveFeedback&lt;/b&gt; methods.
     */
    private String value;
    /**
     * This field provides information about the corresponding &lt;b&gt;value&lt;/b&gt;.
     */
    private String valueLabel;
    /**
     * Instantiates a new {@link FeedbackRatingAcceptableValue} and sets the default values.
     */
    public FeedbackRatingAcceptableValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackRatingAcceptableValue}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackRatingAcceptableValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackRatingAcceptableValue();
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
     * Gets the enabled property value. If &lt;code&gt;true&lt;/code&gt;, this boolean indicates that this value is enabled and selectable.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("valueLabel", (n) -> { this.setValueLabel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value that can be selected for feedback. For most &lt;b&gt;ratingType&lt;/b&gt; values, this is &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating. For &lt;b&gt;ratingType&lt;/b&gt; of &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, this can be &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, and &lt;code&gt;NEUTRAL&lt;/code&gt;. These are the same values as used with the &lt;b&gt;leaveFeedback&lt;/b&gt; methods.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Gets the valueLabel property value. This field provides information about the corresponding &lt;b&gt;value&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValueLabel() {
        return this.valueLabel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("value", this.getValue());
        writer.writeStringValue("valueLabel", this.getValueLabel());
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
     * Sets the enabled property value. If &lt;code&gt;true&lt;/code&gt;, this boolean indicates that this value is enabled and selectable.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the value property value. The value that can be selected for feedback. For most &lt;b&gt;ratingType&lt;/b&gt; values, this is &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating. For &lt;b&gt;ratingType&lt;/b&gt; of &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, this can be &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, and &lt;code&gt;NEUTRAL&lt;/code&gt;. These are the same values as used with the &lt;b&gt;leaveFeedback&lt;/b&gt; methods.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
    /**
     * Sets the valueLabel property value. This field provides information about the corresponding &lt;b&gt;value&lt;/b&gt;.
     * @param value Value to set for the valueLabel property.
     */
    public void setValueLabel(@jakarta.annotation.Nullable final String value) {
        this.valueLabel = value;
    }
}
