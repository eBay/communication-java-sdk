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

package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides fields that descrbes timing associated with the comment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommentCommentPeriod implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unit of time for the &lt;strong&gt;value&lt;/strong&gt;. Supported values: &lt;code&gt;DAY&lt;/code&gt; or &lt;code&gt;YEAR&lt;/code&gt;.
     */
    private String unit;
    /**
     * Value of the time period expressed in the period contained in the &lt;strong&gt;unit&lt;/strong&gt;. Supported values are &lt;code&gt;30&lt;/code&gt;, &lt;code&gt;60&lt;/code&gt;, or &lt;code&gt;365&lt;/code&gt;. &lt;p&gt;See the &lt;strong&gt;commentPeriod&lt;/strong&gt; container for more information.&lt;/p&gt;
     */
    private Integer value;
    /**
     * Instantiates a new {@link CommentCommentPeriod} and sets the default values.
     */
    public CommentCommentPeriod() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CommentCommentPeriod}
     */
    @jakarta.annotation.Nonnull
    public static CommentCommentPeriod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommentCommentPeriod();
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
     * Gets the unit property value. Unit of time for the &lt;strong&gt;value&lt;/strong&gt;. Supported values: &lt;code&gt;DAY&lt;/code&gt; or &lt;code&gt;YEAR&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. Value of the time period expressed in the period contained in the &lt;strong&gt;unit&lt;/strong&gt;. Supported values are &lt;code&gt;30&lt;/code&gt;, &lt;code&gt;60&lt;/code&gt;, or &lt;code&gt;365&lt;/code&gt;. &lt;p&gt;See the &lt;strong&gt;commentPeriod&lt;/strong&gt; container for more information.&lt;/p&gt;
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
     * Sets the unit property value. Unit of time for the &lt;strong&gt;value&lt;/strong&gt;. Supported values: &lt;code&gt;DAY&lt;/code&gt; or &lt;code&gt;YEAR&lt;/code&gt;.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. Value of the time period expressed in the period contained in the &lt;strong&gt;unit&lt;/strong&gt;. Supported values are &lt;code&gt;30&lt;/code&gt;, &lt;code&gt;60&lt;/code&gt;, or &lt;code&gt;365&lt;/code&gt;. &lt;p&gt;See the &lt;strong&gt;commentPeriod&lt;/strong&gt; container for more information.&lt;/p&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
