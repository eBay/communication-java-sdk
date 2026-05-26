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
 * This type defines the metadata, such as successes and failures, associated with a bulk conversation status update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationsMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The total amount of conversations being updated.
     */
    private Integer totalConversationsCount;
    /**
     * The number of conversations in which the specified update failed.
     */
    private Integer updateFailureCount;
    /**
     * The number of conversations in which the specified update succeeded.
     */
    private Integer updateSuccessCount;
    /**
     * Instantiates a new {@link ConversationsMetadata} and sets the default values.
     */
    public ConversationsMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConversationsMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ConversationsMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationsMetadata();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("totalConversationsCount", (n) -> { this.setTotalConversationsCount(n.getIntegerValue()); });
        deserializerMap.put("updateFailureCount", (n) -> { this.setUpdateFailureCount(n.getIntegerValue()); });
        deserializerMap.put("updateSuccessCount", (n) -> { this.setUpdateSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalConversationsCount property value. The total amount of conversations being updated.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalConversationsCount() {
        return this.totalConversationsCount;
    }
    /**
     * Gets the updateFailureCount property value. The number of conversations in which the specified update failed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpdateFailureCount() {
        return this.updateFailureCount;
    }
    /**
     * Gets the updateSuccessCount property value. The number of conversations in which the specified update succeeded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpdateSuccessCount() {
        return this.updateSuccessCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("totalConversationsCount", this.getTotalConversationsCount());
        writer.writeIntegerValue("updateFailureCount", this.getUpdateFailureCount());
        writer.writeIntegerValue("updateSuccessCount", this.getUpdateSuccessCount());
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
     * Sets the totalConversationsCount property value. The total amount of conversations being updated.
     * @param value Value to set for the totalConversationsCount property.
     */
    public void setTotalConversationsCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalConversationsCount = value;
    }
    /**
     * Sets the updateFailureCount property value. The number of conversations in which the specified update failed.
     * @param value Value to set for the updateFailureCount property.
     */
    public void setUpdateFailureCount(@jakarta.annotation.Nullable final Integer value) {
        this.updateFailureCount = value;
    }
    /**
     * Sets the updateSuccessCount property value. The number of conversations in which the specified update succeeded.
     * @param value Value to set for the updateSuccessCount property.
     */
    public void setUpdateSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.updateSuccessCount = value;
    }
}
