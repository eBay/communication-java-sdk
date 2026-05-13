package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that describes the value of a monetary amount as represented by a global currency.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Amount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The base currency applied to the &lt;b&gt;value&lt;/b&gt; field to establish a monetary amount.  &lt;br&gt;&lt;br&gt;The currency is represented as a 3-letter &lt;a href=&quot;http://www.currency-iso.org/en/home/tables/table-a1.html&quot; title=&quot;www.currency-iso.org&quot; target=&quot;_blank&quot;&gt;ISO4217&lt;/a&gt; currency code. For example, the code for the Canadian Dollar is &lt;code&gt;CAD&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/bas:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String currency;
    /**
     * The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
     */
    private String value;
    /**
     * Instantiates a new {@link Amount} and sets the default values.
     */
    public Amount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nonnull
    public static Amount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Amount();
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
     * Gets the currency property value. The base currency applied to the &lt;b&gt;value&lt;/b&gt; field to establish a monetary amount.  &lt;br&gt;&lt;br&gt;The currency is represented as a 3-letter &lt;a href=&quot;http://www.currency-iso.org/en/home/tables/table-a1.html&quot; title=&quot;www.currency-iso.org&quot; target=&quot;_blank&quot;&gt;ISO4217&lt;/a&gt; currency code. For example, the code for the Canadian Dollar is &lt;code&gt;CAD&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/bas:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
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
        writer.writeStringValue("currency", this.getCurrency());
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
     * Sets the currency property value. The base currency applied to the &lt;b&gt;value&lt;/b&gt; field to establish a monetary amount.  &lt;br&gt;&lt;br&gt;The currency is represented as a 3-letter &lt;a href=&quot;http://www.currency-iso.org/en/home/tables/table-a1.html&quot; title=&quot;www.currency-iso.org&quot; target=&quot;_blank&quot;&gt;ISO4217&lt;/a&gt; currency code. For example, the code for the Canadian Dollar is &lt;code&gt;CAD&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/negotiation/types/bas:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
