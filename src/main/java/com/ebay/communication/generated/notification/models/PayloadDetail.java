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

package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes the details about a topic&apos;s payload.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayloadDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The supported delivery protocols.
     */
    private ProtocolEnum deliveryProtocol;
    /**
     * A deprecation indicator.
     */
    private Boolean deprecated;
    /**
     * The supported format. Presently, &lt;code&gt;JSON&lt;/code&gt; is the only supported format.
     */
    private java.util.List<FormatTypeEnum> format;
    /**
     * The supported schema version.
     */
    private String schemaVersion;
    /**
     * Instantiates a new {@link PayloadDetail} and sets the default values.
     */
    public PayloadDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PayloadDetail}
     */
    @jakarta.annotation.Nonnull
    public static PayloadDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadDetail();
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
     * Gets the deliveryProtocol property value. The supported delivery protocols.
     * @return a {@link ProtocolEnum}
     */
    @jakarta.annotation.Nullable
    public ProtocolEnum getDeliveryProtocol() {
        return this.deliveryProtocol;
    }
    /**
     * Gets the deprecated property value. A deprecation indicator.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeprecated() {
        return this.deprecated;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deliveryProtocol", (n) -> { this.setDeliveryProtocol(n.getEnumValue(ProtocolEnum::forValue)); });
        deserializerMap.put("deprecated", (n) -> { this.setDeprecated(n.getBooleanValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getCollectionOfEnumValues(FormatTypeEnum::forValue)); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The supported format. Presently, &lt;code&gt;JSON&lt;/code&gt; is the only supported format.
     * @return a {@link java.util.List<FormatTypeEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FormatTypeEnum> getFormat() {
        return this.format;
    }
    /**
     * Gets the schemaVersion property value. The supported schema version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deliveryProtocol", this.getDeliveryProtocol());
        writer.writeBooleanValue("deprecated", this.getDeprecated());
        writer.writeCollectionOfEnumValues("format", this.getFormat());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
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
     * Sets the deliveryProtocol property value. The supported delivery protocols.
     * @param value Value to set for the deliveryProtocol property.
     */
    public void setDeliveryProtocol(@jakarta.annotation.Nullable final ProtocolEnum value) {
        this.deliveryProtocol = value;
    }
    /**
     * Sets the deprecated property value. A deprecation indicator.
     * @param value Value to set for the deprecated property.
     */
    public void setDeprecated(@jakarta.annotation.Nullable final Boolean value) {
        this.deprecated = value;
    }
    /**
     * Sets the format property value. The supported format. Presently, &lt;code&gt;JSON&lt;/code&gt; is the only supported format.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final java.util.List<FormatTypeEnum> value) {
        this.format = value;
    }
    /**
     * Sets the schemaVersion property value. The supported schema version.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.schemaVersion = value;
    }
}
