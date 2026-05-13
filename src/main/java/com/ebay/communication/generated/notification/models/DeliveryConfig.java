package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains information about the delivery configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The endpoint for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided endpoint URL should use the HTTPS protocol, and it should not contain an internal IP address or &lt;code&gt;localhost&lt;/code&gt; in its path.&lt;/span&gt;
     */
    private String endpoint;
    /**
     * The verification token associated with this endpoint.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided verification token must be between 32 and 80 characters. Allowed characters include alphanumeric characters, underscores (&lt;code&gt;_&lt;/code&gt;), and hyphens (&lt;code&gt;-&lt;/code&gt;); no other characters are allowed.&lt;/span&gt;
     */
    private String verificationToken;
    /**
     * Instantiates a new {@link DeliveryConfig} and sets the default values.
     */
    public DeliveryConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeliveryConfig}
     */
    @jakarta.annotation.Nonnull
    public static DeliveryConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryConfig();
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
     * Gets the endpoint property value. The endpoint for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided endpoint URL should use the HTTPS protocol, and it should not contain an internal IP address or &lt;code&gt;localhost&lt;/code&gt; in its path.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("verificationToken", (n) -> { this.setVerificationToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the verificationToken property value. The verification token associated with this endpoint.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided verification token must be between 32 and 80 characters. Allowed characters include alphanumeric characters, underscores (&lt;code&gt;_&lt;/code&gt;), and hyphens (&lt;code&gt;-&lt;/code&gt;); no other characters are allowed.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerificationToken() {
        return this.verificationToken;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("endpoint", this.getEndpoint());
        writer.writeStringValue("verificationToken", this.getVerificationToken());
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
     * Sets the endpoint property value. The endpoint for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided endpoint URL should use the HTTPS protocol, and it should not contain an internal IP address or &lt;code&gt;localhost&lt;/code&gt; in its path.&lt;/span&gt;
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.endpoint = value;
    }
    /**
     * Sets the verificationToken property value. The verification token associated with this endpoint.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The provided verification token must be between 32 and 80 characters. Allowed characters include alphanumeric characters, underscores (&lt;code&gt;_&lt;/code&gt;), and hyphens (&lt;code&gt;-&lt;/code&gt;); no other characters are allowed.&lt;/span&gt;
     * @param value Value to set for the verificationToken property.
     */
    public void setVerificationToken(@jakarta.annotation.Nullable final String value) {
        this.verificationToken = value;
    }
}
