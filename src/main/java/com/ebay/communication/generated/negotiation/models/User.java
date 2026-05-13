package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type identifies an eBay user&lt;!-- by either their &lt;b&gt;maskedUsername&lt;/b&gt; or their full &lt;b&gt;username&lt;/b&gt;--&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class User implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The masked user name is a user name that has certain characters hidden for privacy of the user.&lt;!-- This field is populated only when the full user name cannot be used.--&gt;
     */
    private String maskedUsername;
    /**
     * Instantiates a new {@link User} and sets the default values.
     */
    public User() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link User}
     */
    @jakarta.annotation.Nonnull
    public static User createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new User();
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
        deserializerMap.put("maskedUsername", (n) -> { this.setMaskedUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maskedUsername property value. The masked user name is a user name that has certain characters hidden for privacy of the user.&lt;!-- This field is populated only when the full user name cannot be used.--&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaskedUsername() {
        return this.maskedUsername;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("maskedUsername", this.getMaskedUsername());
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
     * Sets the maskedUsername property value. The masked user name is a user name that has certain characters hidden for privacy of the user.&lt;!-- This field is populated only when the full user name cannot be used.--&gt;
     * @param value Value to set for the maskedUsername property.
     */
    public void setMaskedUsername(@jakarta.annotation.Nullable final String value) {
        this.maskedUsername = value;
    }
}
