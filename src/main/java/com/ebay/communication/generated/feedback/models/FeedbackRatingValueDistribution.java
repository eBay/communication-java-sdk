package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides field for an array listing the distribution values of the feedback ratings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRatingValueDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An integer representing the number of occurrences for a specific feedback rating &lt;b&gt;value&lt;/b&gt;. For example, for the &lt;code&gt;POSITIVE&lt;/code&gt; &lt;b&gt;value&lt;/b&gt;, a &lt;code&gt;3&lt;/code&gt; returned as the &lt;b&gt;count&lt;/b&gt; represents three positive ratings were returned.
     */
    private Integer count;
    /**
     * A string indicating the specific feedback rating value. Supported values include: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, &lt;code&gt;4&lt;/code&gt;, and &lt;code&gt;5&lt;/code&gt;.
     */
    private String value;
    /**
     * Instantiates a new {@link FeedbackRatingValueDistribution} and sets the default values.
     */
    public FeedbackRatingValueDistribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackRatingValueDistribution}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackRatingValueDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackRatingValueDistribution();
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
     * Gets the count property value. An integer representing the number of occurrences for a specific feedback rating &lt;b&gt;value&lt;/b&gt;. For example, for the &lt;code&gt;POSITIVE&lt;/code&gt; &lt;b&gt;value&lt;/b&gt;, a &lt;code&gt;3&lt;/code&gt; returned as the &lt;b&gt;count&lt;/b&gt; represents three positive ratings were returned.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. A string indicating the specific feedback rating value. Supported values include: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, &lt;code&gt;4&lt;/code&gt;, and &lt;code&gt;5&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the count property value. An integer representing the number of occurrences for a specific feedback rating &lt;b&gt;value&lt;/b&gt;. For example, for the &lt;code&gt;POSITIVE&lt;/code&gt; &lt;b&gt;value&lt;/b&gt;, a &lt;code&gt;3&lt;/code&gt; returned as the &lt;b&gt;count&lt;/b&gt; represents three positive ratings were returned.
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the value property value. A string indicating the specific feedback rating value. Supported values include: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, &lt;code&gt;4&lt;/code&gt;, and &lt;code&gt;5&lt;/code&gt;.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
