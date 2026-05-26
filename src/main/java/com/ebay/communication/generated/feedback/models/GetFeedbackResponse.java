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
 * This type defines the fields for the &lt;b&gt;getFeedback&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFeedbackResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains a list of feedback entries that meet the specified criteria.
     */
    private java.util.List<FeedbackDetail> feedbackEntries;
    /**
     * This type provides pagination information for the returned line items.
     */
    private Pagination pagination;
    /**
     * Instantiates a new {@link GetFeedbackResponse} and sets the default values.
     */
    public GetFeedbackResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetFeedbackResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetFeedbackResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetFeedbackResponse();
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
     * Gets the feedbackEntries property value. This array contains a list of feedback entries that meet the specified criteria.
     * @return a {@link java.util.List<FeedbackDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackDetail> getFeedbackEntries() {
        return this.feedbackEntries;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("feedbackEntries", (n) -> { this.setFeedbackEntries(n.getCollectionOfObjectValues(FeedbackDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("pagination", (n) -> { this.setPagination(n.getObjectValue(Pagination::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pagination property value. This type provides pagination information for the returned line items.
     * @return a {@link Pagination}
     */
    @jakarta.annotation.Nullable
    public Pagination getPagination() {
        return this.pagination;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("feedbackEntries", this.getFeedbackEntries());
        writer.writeObjectValue("pagination", this.getPagination());
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
     * Sets the feedbackEntries property value. This array contains a list of feedback entries that meet the specified criteria.
     * @param value Value to set for the feedbackEntries property.
     */
    public void setFeedbackEntries(@jakarta.annotation.Nullable final java.util.List<FeedbackDetail> value) {
        this.feedbackEntries = value;
    }
    /**
     * Sets the pagination property value. This type provides pagination information for the returned line items.
     * @param value Value to set for the pagination property.
     */
    public void setPagination(@jakarta.annotation.Nullable final Pagination value) {
        this.pagination = value;
    }
}
