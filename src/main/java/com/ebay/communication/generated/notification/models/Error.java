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

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that can be returned in an error.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Error extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifies the type of error.
     */
    private String category;
    /**
     * Name for the primary system where the error occurred. This is relevant for application errors.
     */
    private String domain;
    /**
     * A unique number to identify the error.
     */
    private Integer errorId;
    /**
     * An array of request elements most closely associated to the error.
     */
    private java.util.List<String> inputRefIds;
    /**
     * A more detailed explanation of the error.
     */
    private String longMessage;
    /**
     * Information on how to correct the problem, in the end user&apos;s terms and language where applicable.
     */
    private String message;
    /**
     * An array of request elements most closely associated to the error.
     */
    private java.util.List<String> outputRefIds;
    /**
     * An array of name/value pairs that describe details the error condition. These are useful when multiple errors are returned.
     */
    private java.util.List<ErrorParameter> parameters;
    /**
     * Further helps indicate which subsystem the error is coming from. System subcategories include: Initialization, Serialization, Security, Monitoring, Rate Limiting, etc.
     */
    private String subdomain;
    /**
     * Instantiates a new {@link Error} and sets the default values.
     */
    public Error() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Error}
     */
    @jakarta.annotation.Nonnull
    public static Error createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Error();
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
     * Gets the category property value. Identifies the type of error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the domain property value. Name for the primary system where the error occurred. This is relevant for application errors.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the errorId property value. A unique number to identify the error.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorId() {
        return this.errorId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("errorId", (n) -> { this.setErrorId(n.getIntegerValue()); });
        deserializerMap.put("inputRefIds", (n) -> { this.setInputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("longMessage", (n) -> { this.setLongMessage(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("outputRefIds", (n) -> { this.setOutputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(ErrorParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("subdomain", (n) -> { this.setSubdomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inputRefIds property value. An array of request elements most closely associated to the error.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputRefIds() {
        return this.inputRefIds;
    }
    /**
     * Gets the longMessage property value. A more detailed explanation of the error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongMessage() {
        return this.longMessage;
    }
    /**
     * The primary error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Gets the message property value. Information on how to correct the problem, in the end user&apos;s terms and language where applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageEscaped() {
        return this.message;
    }
    /**
     * Gets the outputRefIds property value. An array of request elements most closely associated to the error.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputRefIds() {
        return this.outputRefIds;
    }
    /**
     * Gets the parameters property value. An array of name/value pairs that describe details the error condition. These are useful when multiple errors are returned.
     * @return a {@link java.util.List<ErrorParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorParameter> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the subdomain property value. Further helps indicate which subsystem the error is coming from. System subcategories include: Initialization, Serialization, Security, Monitoring, Rate Limiting, etc.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubdomain() {
        return this.subdomain;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeIntegerValue("errorId", this.getErrorId());
        writer.writeCollectionOfPrimitiveValues("inputRefIds", this.getInputRefIds());
        writer.writeStringValue("longMessage", this.getLongMessage());
        writer.writeStringValue("message", this.getMessageEscaped());
        writer.writeCollectionOfPrimitiveValues("outputRefIds", this.getOutputRefIds());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeStringValue("subdomain", this.getSubdomain());
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
     * Sets the category property value. Identifies the type of error.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the domain property value. Name for the primary system where the error occurred. This is relevant for application errors.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the errorId property value. A unique number to identify the error.
     * @param value Value to set for the errorId property.
     */
    public void setErrorId(@jakarta.annotation.Nullable final Integer value) {
        this.errorId = value;
    }
    /**
     * Sets the inputRefIds property value. An array of request elements most closely associated to the error.
     * @param value Value to set for the inputRefIds property.
     */
    public void setInputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inputRefIds = value;
    }
    /**
     * Sets the longMessage property value. A more detailed explanation of the error.
     * @param value Value to set for the longMessage property.
     */
    public void setLongMessage(@jakarta.annotation.Nullable final String value) {
        this.longMessage = value;
    }
    /**
     * Sets the message property value. Information on how to correct the problem, in the end user&apos;s terms and language where applicable.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the outputRefIds property value. An array of request elements most closely associated to the error.
     * @param value Value to set for the outputRefIds property.
     */
    public void setOutputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.outputRefIds = value;
    }
    /**
     * Sets the parameters property value. An array of name/value pairs that describe details the error condition. These are useful when multiple errors are returned.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<ErrorParameter> value) {
        this.parameters = value;
    }
    /**
     * Sets the subdomain property value. Further helps indicate which subsystem the error is coming from. System subcategories include: Initialization, Serialization, Security, Monitoring, Rate Limiting, etc.
     * @param value Value to set for the subdomain property.
     */
    public void setSubdomain(@jakarta.annotation.Nullable final String value) {
        this.subdomain = value;
    }
}
