package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides the details of the user who provided the feedback of a &lt;b&gt;getFeedback&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProviderUserDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This integer indicates the feedback score of the feedback provider at the time of providing this specific feedback.
     */
    private Integer feedbackScore;
    /**
     * This enumerated value provides the visual star representation of the feedback score (for example, &lt;code&gt;YELLOW_STAR&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackStarTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String feedbackStar;
    /**
     * This enumerated value indicates the user&apos;s role in the transaction (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String role;
    /**
     * This array lists additional attributes that relate to the user (such as verification status).
     */
    private java.util.List<ProviderUserDetailUserAttributes> userAttributes;
    /**
     * This field indicates the unique identifier of the user who gave the feedback.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Select developers will not receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private String userId;
    /**
     * Instantiates a new {@link ProviderUserDetail} and sets the default values.
     */
    public ProviderUserDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProviderUserDetail}
     */
    @jakarta.annotation.Nonnull
    public static ProviderUserDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProviderUserDetail();
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
     * Gets the feedbackScore property value. This integer indicates the feedback score of the feedback provider at the time of providing this specific feedback.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFeedbackScore() {
        return this.feedbackScore;
    }
    /**
     * Gets the feedbackStar property value. This enumerated value provides the visual star representation of the feedback score (for example, &lt;code&gt;YELLOW_STAR&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackStarTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedbackStar() {
        return this.feedbackStar;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("feedbackScore", (n) -> { this.setFeedbackScore(n.getIntegerValue()); });
        deserializerMap.put("feedbackStar", (n) -> { this.setFeedbackStar(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("userAttributes", (n) -> { this.setUserAttributes(n.getCollectionOfObjectValues(ProviderUserDetailUserAttributes::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. This enumerated value indicates the user&apos;s role in the transaction (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the userAttributes property value. This array lists additional attributes that relate to the user (such as verification status).
     * @return a {@link java.util.List<ProviderUserDetailUserAttributes>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProviderUserDetailUserAttributes> getUserAttributes() {
        return this.userAttributes;
    }
    /**
     * Gets the userId property value. This field indicates the unique identifier of the user who gave the feedback.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Select developers will not receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("feedbackScore", this.getFeedbackScore());
        writer.writeStringValue("feedbackStar", this.getFeedbackStar());
        writer.writeStringValue("role", this.getRole());
        writer.writeCollectionOfObjectValues("userAttributes", this.getUserAttributes());
        writer.writeStringValue("userId", this.getUserId());
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
     * Sets the feedbackScore property value. This integer indicates the feedback score of the feedback provider at the time of providing this specific feedback.
     * @param value Value to set for the feedbackScore property.
     */
    public void setFeedbackScore(@jakarta.annotation.Nullable final Integer value) {
        this.feedbackScore = value;
    }
    /**
     * Sets the feedbackStar property value. This enumerated value provides the visual star representation of the feedback score (for example, &lt;code&gt;YELLOW_STAR&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackStarTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the feedbackStar property.
     */
    public void setFeedbackStar(@jakarta.annotation.Nullable final String value) {
        this.feedbackStar = value;
    }
    /**
     * Sets the role property value. This enumerated value indicates the user&apos;s role in the transaction (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the userAttributes property value. This array lists additional attributes that relate to the user (such as verification status).
     * @param value Value to set for the userAttributes property.
     */
    public void setUserAttributes(@jakarta.annotation.Nullable final java.util.List<ProviderUserDetailUserAttributes> value) {
        this.userAttributes = value;
    }
    /**
     * Sets the userId property value. This field indicates the unique identifier of the user who gave the feedback.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Select developers will not receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
