package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides fields for specific aspects of the seller&apos;s performance.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerRating implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enumerated value of the category being rated, such as delivery timeliness (&lt;code&gt;ON_TIME_DELIVERY&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:KeyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String key;
    /**
     * The value assigned for the selected category. Use a value of &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with the &lt;code&gt;1&lt;/code&gt; being the lowest rating and &lt;code&gt;5&lt;/code&gt; being the highest.
     */
    private String value;
    /**
     * Instantiates a new {@link SellerRating} and sets the default values.
     */
    public SellerRating() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerRating}
     */
    @jakarta.annotation.Nonnull
    public static SellerRating createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerRating();
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
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The enumerated value of the category being rated, such as delivery timeliness (&lt;code&gt;ON_TIME_DELIVERY&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:KeyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the value property value. The value assigned for the selected category. Use a value of &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with the &lt;code&gt;1&lt;/code&gt; being the lowest rating and &lt;code&gt;5&lt;/code&gt; being the highest.
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
        writer.writeStringValue("key", this.getKey());
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
     * Sets the key property value. The enumerated value of the category being rated, such as delivery timeliness (&lt;code&gt;ON_TIME_DELIVERY&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/api:KeyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the value property value. The value assigned for the selected category. Use a value of &lt;code&gt;1&lt;/code&gt; through &lt;code&gt;5&lt;/code&gt;, with the &lt;code&gt;1&lt;/code&gt; being the lowest rating and &lt;code&gt;5&lt;/code&gt; being the highest.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
