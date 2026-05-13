package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the public key for a unique key ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublicKey implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The algorithm associated with the public key that is returned, such as Elliptic Curve Digital Signature Algorithm (ECDSA).
     */
    private String algorithm;
    /**
     * The digest associated with the public key that is returned, such as Secure Hash Algorithm 1 (SHA1).
     */
    private String digest;
    /**
     * The public key that is returned for the specified key ID.&lt;br&gt;&lt;br&gt;This value is used to validate the eBay push notification message payload.
     */
    private String key;
    /**
     * Instantiates a new {@link PublicKey} and sets the default values.
     */
    public PublicKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PublicKey}
     */
    @jakarta.annotation.Nonnull
    public static PublicKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicKey();
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
     * Gets the algorithm property value. The algorithm associated with the public key that is returned, such as Elliptic Curve Digital Signature Algorithm (ECDSA).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Gets the digest property value. The digest associated with the public key that is returned, such as Secure Hash Algorithm 1 (SHA1).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDigest() {
        return this.digest;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("algorithm", (n) -> { this.setAlgorithm(n.getStringValue()); });
        deserializerMap.put("digest", (n) -> { this.setDigest(n.getStringValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The public key that is returned for the specified key ID.&lt;br&gt;&lt;br&gt;This value is used to validate the eBay push notification message payload.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("algorithm", this.getAlgorithm());
        writer.writeStringValue("digest", this.getDigest());
        writer.writeStringValue("key", this.getKey());
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
     * Sets the algorithm property value. The algorithm associated with the public key that is returned, such as Elliptic Curve Digital Signature Algorithm (ECDSA).
     * @param value Value to set for the algorithm property.
     */
    public void setAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.algorithm = value;
    }
    /**
     * Sets the digest property value. The digest associated with the public key that is returned, such as Secure Hash Algorithm 1 (SHA1).
     * @param value Value to set for the digest property.
     */
    public void setDigest(@jakarta.annotation.Nullable final String value) {
        this.digest = value;
    }
    /**
     * Sets the key property value. The public key that is returned for the specified key ID.&lt;br&gt;&lt;br&gt;This value is used to validate the eBay push notification message payload.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
}
