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
 * The type that defines the fields for the &lt;b&gt;alertEmail&lt;/b&gt; field.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Config implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to add or modify an email address that will be used for Notification API alerts associated with the application. &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-config-getconfig&quot;&gt;getConfig&lt;/a&gt; can be used to get the email address currently being used for alerts.
     */
    private String alertEmail;
    /**
     * Instantiates a new {@link Config} and sets the default values.
     */
    public Config() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Config}
     */
    @jakarta.annotation.Nonnull
    public static Config createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Config();
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
     * Gets the alertEmail property value. This field is used to add or modify an email address that will be used for Notification API alerts associated with the application. &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-config-getconfig&quot;&gt;getConfig&lt;/a&gt; can be used to get the email address currently being used for alerts.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertEmail() {
        return this.alertEmail;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("alertEmail", (n) -> { this.setAlertEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alertEmail", this.getAlertEmail());
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
     * Sets the alertEmail property value. This field is used to add or modify an email address that will be used for Notification API alerts associated with the application. &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-config-getconfig&quot;&gt;getConfig&lt;/a&gt; can be used to get the email address currently being used for alerts.
     * @param value Value to set for the alertEmail property.
     */
    public void setAlertEmail(@jakarta.annotation.Nullable final String value) {
        this.alertEmail = value;
    }
}
