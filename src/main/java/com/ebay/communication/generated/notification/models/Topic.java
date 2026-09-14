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
 * A type that describes the details of the topic.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Topic implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authorization scopes required to subscribe to this topic.
     */
    private java.util.List<String> authorizationScopes;
    /**
     * The business context associated with this topic.
     */
    private ContextEnum context;
    /**
     * The description of the topic.
     */
    private String description;
    /**
     * The indicator of whether this topic is filterable or not.
     */
    private Boolean filterable;
    /**
     * The scope of this topic.
     */
    private ScopeEnum scope;
    /**
     * The status of this topic.
     */
    private StatusEnum status;
    /**
     * The supported payloads for this topic.
     */
    private java.util.List<PayloadDetail> supportedPayloads;
    /**
     * The unique identifier for the topic.
     */
    private String topicId;
    /**
     * Instantiates a new {@link Topic} and sets the default values.
     */
    public Topic() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Topic}
     */
    @jakarta.annotation.Nonnull
    public static Topic createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Topic();
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
     * Gets the authorizationScopes property value. The authorization scopes required to subscribe to this topic.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAuthorizationScopes() {
        return this.authorizationScopes;
    }
    /**
     * Gets the context property value. The business context associated with this topic.
     * @return a {@link ContextEnum}
     */
    @jakarta.annotation.Nullable
    public ContextEnum getContext() {
        return this.context;
    }
    /**
     * Gets the description property value. The description of the topic.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("authorizationScopes", (n) -> { this.setAuthorizationScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("context", (n) -> { this.setContext(n.getEnumValue(ContextEnum::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("filterable", (n) -> { this.setFilterable(n.getBooleanValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumValue(ScopeEnum::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(StatusEnum::forValue)); });
        deserializerMap.put("supportedPayloads", (n) -> { this.setSupportedPayloads(n.getCollectionOfObjectValues(PayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("topicId", (n) -> { this.setTopicId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterable property value. The indicator of whether this topic is filterable or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFilterable() {
        return this.filterable;
    }
    /**
     * Gets the scope property value. The scope of this topic.
     * @return a {@link ScopeEnum}
     */
    @jakarta.annotation.Nullable
    public ScopeEnum getScope() {
        return this.scope;
    }
    /**
     * Gets the status property value. The status of this topic.
     * @return a {@link StatusEnum}
     */
    @jakarta.annotation.Nullable
    public StatusEnum getStatus() {
        return this.status;
    }
    /**
     * Gets the supportedPayloads property value. The supported payloads for this topic.
     * @return a {@link java.util.List<PayloadDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PayloadDetail> getSupportedPayloads() {
        return this.supportedPayloads;
    }
    /**
     * Gets the topicId property value. The unique identifier for the topic.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTopicId() {
        return this.topicId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("authorizationScopes", this.getAuthorizationScopes());
        writer.writeEnumValue("context", this.getContext());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("filterable", this.getFilterable());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("supportedPayloads", this.getSupportedPayloads());
        writer.writeStringValue("topicId", this.getTopicId());
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
     * Sets the authorizationScopes property value. The authorization scopes required to subscribe to this topic.
     * @param value Value to set for the authorizationScopes property.
     */
    public void setAuthorizationScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.authorizationScopes = value;
    }
    /**
     * Sets the context property value. The business context associated with this topic.
     * @param value Value to set for the context property.
     */
    public void setContext(@jakarta.annotation.Nullable final ContextEnum value) {
        this.context = value;
    }
    /**
     * Sets the description property value. The description of the topic.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the filterable property value. The indicator of whether this topic is filterable or not.
     * @param value Value to set for the filterable property.
     */
    public void setFilterable(@jakarta.annotation.Nullable final Boolean value) {
        this.filterable = value;
    }
    /**
     * Sets the scope property value. The scope of this topic.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final ScopeEnum value) {
        this.scope = value;
    }
    /**
     * Sets the status property value. The status of this topic.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final StatusEnum value) {
        this.status = value;
    }
    /**
     * Sets the supportedPayloads property value. The supported payloads for this topic.
     * @param value Value to set for the supportedPayloads property.
     */
    public void setSupportedPayloads(@jakarta.annotation.Nullable final java.util.List<PayloadDetail> value) {
        this.supportedPayloads = value;
    }
    /**
     * Sets the topicId property value. The unique identifier for the topic.
     * @param value Value to set for the topicId property.
     */
    public void setTopicId(@jakarta.annotation.Nullable final String value) {
        this.topicId = value;
    }
}
