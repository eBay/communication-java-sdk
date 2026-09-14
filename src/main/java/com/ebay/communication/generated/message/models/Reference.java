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

package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the reference type and associated reference ID associated with a message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Reference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This value indicates the reference ID associated with the corresponding &lt;strong&gt;referenceType&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;For example, in the case of a &lt;code&gt;LISTING&lt;/code&gt; reference type, this value will be the item ID value of the listing.
     */
    private String referenceId;
    /**
     * This value indicates the reference type to associate with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;strong&gt;referenceId&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;Currently, only the &lt;code&gt;LISTING&lt;/code&gt; reference type is supported.
     */
    private String referenceType;
    /**
     * Instantiates a new {@link Reference} and sets the default values.
     */
    public Reference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Reference}
     */
    @jakarta.annotation.Nonnull
    public static Reference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Reference();
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
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("referenceType", (n) -> { this.setReferenceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the referenceId property value. This value indicates the reference ID associated with the corresponding &lt;strong&gt;referenceType&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;For example, in the case of a &lt;code&gt;LISTING&lt;/code&gt; reference type, this value will be the item ID value of the listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.referenceId;
    }
    /**
     * Gets the referenceType property value. This value indicates the reference type to associate with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;strong&gt;referenceId&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;Currently, only the &lt;code&gt;LISTING&lt;/code&gt; reference type is supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceType() {
        return this.referenceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeStringValue("referenceType", this.getReferenceType());
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
     * Sets the referenceId property value. This value indicates the reference ID associated with the corresponding &lt;strong&gt;referenceType&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;For example, in the case of a &lt;code&gt;LISTING&lt;/code&gt; reference type, this value will be the item ID value of the listing.
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.referenceId = value;
    }
    /**
     * Sets the referenceType property value. This value indicates the reference type to associate with the conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing will then be returned in the &lt;strong&gt;referenceId&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;Currently, only the &lt;code&gt;LISTING&lt;/code&gt; reference type is supported.
     * @param value Value to set for the referenceType property.
     */
    public void setReferenceType(@jakarta.annotation.Nullable final String value) {
        this.referenceType = value;
    }
}
