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
     * This enumerated type lists the three-letter &lt;a href=&quot;http://www.iso.org/iso/home/standards/currency_codes.htm&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; codes representing the supported world currencies.
     */
    private CurrencyCodeEnum currency;
    /**
     * The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; For listings on the following marketplaces, a comma (&lt;code&gt;,&lt;/code&gt;) must be used as the decimal separator:&lt;br&gt;&lt;ul&gt;&lt;li&gt;France&lt;/li&gt;&lt;li&gt;Canada (French Language)&lt;/li&gt;&lt;li&gt;Germany&lt;/li&gt;&lt;li&gt;Italy&lt;/li&gt;&lt;li&gt;Spain&lt;/li&gt;&lt;/ul&gt;All other sites should use a period (&lt;code&gt;.&lt;/code&gt;) as the decimal separator. If the incorrect decimal separator is used, the decimal point will be ignored.&lt;/p&gt;&lt;/div&gt;
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
     * Gets the currency property value. This enumerated type lists the three-letter &lt;a href=&quot;http://www.iso.org/iso/home/standards/currency_codes.htm&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; codes representing the supported world currencies.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; For listings on the following marketplaces, a comma (&lt;code&gt;,&lt;/code&gt;) must be used as the decimal separator:&lt;br&gt;&lt;ul&gt;&lt;li&gt;France&lt;/li&gt;&lt;li&gt;Canada (French Language)&lt;/li&gt;&lt;li&gt;Germany&lt;/li&gt;&lt;li&gt;Italy&lt;/li&gt;&lt;li&gt;Spain&lt;/li&gt;&lt;/ul&gt;All other sites should use a period (&lt;code&gt;.&lt;/code&gt;) as the decimal separator. If the incorrect decimal separator is used, the decimal point will be ignored.&lt;/p&gt;&lt;/div&gt;
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
        writer.writeEnumValue("currency", this.getCurrency());
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
     * Sets the currency property value. This enumerated type lists the three-letter &lt;a href=&quot;http://www.iso.org/iso/home/standards/currency_codes.htm&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; codes representing the supported world currencies.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; For listings on the following marketplaces, a comma (&lt;code&gt;,&lt;/code&gt;) must be used as the decimal separator:&lt;br&gt;&lt;ul&gt;&lt;li&gt;France&lt;/li&gt;&lt;li&gt;Canada (French Language)&lt;/li&gt;&lt;li&gt;Germany&lt;/li&gt;&lt;li&gt;Italy&lt;/li&gt;&lt;li&gt;Spain&lt;/li&gt;&lt;/ul&gt;All other sites should use a period (&lt;code&gt;.&lt;/code&gt;) as the decimal separator. If the incorrect decimal separator is used, the decimal point will be ignored.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
