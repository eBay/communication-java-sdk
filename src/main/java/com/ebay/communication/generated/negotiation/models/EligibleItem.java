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
 * A listing that is eligible for a seller-initiated offer to a buyer.  &lt;br&gt;&lt;br&gt;Listings are identified by a &lt;b&gt;listingId&lt;/b&gt; value that is generated and assigned by eBay when a seller lists an item using the Trading API.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; The Negotiation API does not currently support listings that are managed with the Inventory API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EligibleItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique eBay-assigned ID for an eBay listing.  &lt;br&gt;&lt;br&gt;A &lt;b&gt;listingId&lt;/b&gt; is assigned by eBay when a seller creates a listing with the Trading API.
     */
    private String listingId;
    /**
     * Instantiates a new {@link EligibleItem} and sets the default values.
     */
    public EligibleItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EligibleItem}
     */
    @jakarta.annotation.Nonnull
    public static EligibleItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EligibleItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique eBay-assigned ID for an eBay listing.  &lt;br&gt;&lt;br&gt;A &lt;b&gt;listingId&lt;/b&gt; is assigned by eBay when a seller creates a listing with the Trading API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingId", this.getListingId());
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
     * Sets the listingId property value. The unique eBay-assigned ID for an eBay listing.  &lt;br&gt;&lt;br&gt;A &lt;b&gt;listingId&lt;/b&gt; is assigned by eBay when a seller creates a listing with the Trading API.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
}
