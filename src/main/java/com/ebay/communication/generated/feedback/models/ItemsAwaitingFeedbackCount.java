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
 * This type returns the number of line items awaiting feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemsAwaitingFeedbackCount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of line items for which feedback is pending from the user in the buyer role.
     */
    private Integer asBuyer;
    /**
     * The number of line items for which feedback is pending from the user in the seller role.
     */
    private Integer asSeller;
    /**
     * Instantiates a new {@link ItemsAwaitingFeedbackCount} and sets the default values.
     */
    public ItemsAwaitingFeedbackCount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemsAwaitingFeedbackCount}
     */
    @jakarta.annotation.Nonnull
    public static ItemsAwaitingFeedbackCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemsAwaitingFeedbackCount();
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
     * Gets the asBuyer property value. The number of line items for which feedback is pending from the user in the buyer role.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAsBuyer() {
        return this.asBuyer;
    }
    /**
     * Gets the asSeller property value. The number of line items for which feedback is pending from the user in the seller role.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAsSeller() {
        return this.asSeller;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("asBuyer", (n) -> { this.setAsBuyer(n.getIntegerValue()); });
        deserializerMap.put("asSeller", (n) -> { this.setAsSeller(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("asBuyer", this.getAsBuyer());
        writer.writeIntegerValue("asSeller", this.getAsSeller());
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
     * Sets the asBuyer property value. The number of line items for which feedback is pending from the user in the buyer role.
     * @param value Value to set for the asBuyer property.
     */
    public void setAsBuyer(@jakarta.annotation.Nullable final Integer value) {
        this.asBuyer = value;
    }
    /**
     * Sets the asSeller property value. The number of line items for which feedback is pending from the user in the seller role.
     * @param value Value to set for the asSeller property.
     */
    public void setAsSeller(@jakarta.annotation.Nullable final Integer value) {
        this.asSeller = value;
    }
}
