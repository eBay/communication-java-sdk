package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides fields for the time period on which the feedback summary is calculated.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Period implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unit of the period&apos;s &lt;b&gt;value&lt;/b&gt;. Supported value: &lt;code&gt;DAY&lt;/code&gt;.
     */
    private String unit;
    /**
     * The value for the feedback period, specified in units of &lt;b&gt;unit&lt;/b&gt;. Supported value: &lt;code&gt;90&lt;/code&gt;.
     */
    private Integer value;
    /**
     * Instantiates a new {@link Period} and sets the default values.
     */
    public Period() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Period}
     */
    @jakarta.annotation.Nonnull
    public static Period createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Period();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the unit property value. The unit of the period&apos;s &lt;b&gt;value&lt;/b&gt;. Supported value: &lt;code&gt;DAY&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. The value for the feedback period, specified in units of &lt;b&gt;unit&lt;/b&gt;. Supported value: &lt;code&gt;90&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("unit", this.getUnit());
        writer.writeIntegerValue("value", this.getValue());
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
     * Sets the unit property value. The unit of the period&apos;s &lt;b&gt;value&lt;/b&gt;. Supported value: &lt;code&gt;DAY&lt;/code&gt;.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. The value for the feedback period, specified in units of &lt;b&gt;unit&lt;/b&gt;. Supported value: &lt;code&gt;90&lt;/code&gt;.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
