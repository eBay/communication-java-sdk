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
 * This type provides the details of the feedback comment left by the user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Comment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container indicates the timing of a feedback comment based on when it was left. It is only returned if a comment was provided. Possible values are 30 days, 90 days, 180 days, 365 days, or 5 years: &lt;br&gt;&lt;ul&gt;&lt;li&gt;Less than 30 days: 30 DAY&lt;/li&gt; &lt;li&gt;Over 30 but less than 90 days: 90 DAY&lt;/li&gt; &lt;li&gt;Over 90 but less than 180 days: 180 DAY&lt;/li&gt; &lt;li&gt;Over 180 but less than 365 days: 365 DAY&lt;/li&gt; &lt;li&gt;More than 365 days: 5 YEAR&lt;/li&gt;&lt;/ul&gt;
     */
    private CommentCommentPeriod commentPeriod;
    /**
     * The text of the feedback comment, follow-up, or reply. HTML formatting and personal information (for example, phone numbers) are not allowed. This field is returned if a comment was provided for the feedback entry. If the comment was removed due to eBay policy, this field will contain &apos;&lt;code&gt;--&lt;/code&gt;&apos; and the &lt;strong&gt;commentTextRemovedPerPolicy&lt;/strong&gt; field will return &lt;code&gt;true&lt;/code&gt;.
     */
    private String commentText;
    /**
     * If &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback follow-up or reply comment text was removed per eBay policy.  This field is only returned when a &lt;strong&gt;followupComment&lt;/strong&gt; container is returned.
     */
    private Boolean commentTextRemovedPerPolicy;
    /**
     * This enumerated value indicates the state of the feedback (for example, &lt;code&gt;ENTERED&lt;/code&gt;). This can be the state of the feedback comment, the follow-up comment, or the reply comment.
     */
    private FeedbackCommentStateEnum state;
    /**
     * Instantiates a new {@link Comment} and sets the default values.
     */
    public Comment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Comment}
     */
    @jakarta.annotation.Nonnull
    public static Comment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Comment();
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
     * Gets the commentPeriod property value. This container indicates the timing of a feedback comment based on when it was left. It is only returned if a comment was provided. Possible values are 30 days, 90 days, 180 days, 365 days, or 5 years: &lt;br&gt;&lt;ul&gt;&lt;li&gt;Less than 30 days: 30 DAY&lt;/li&gt; &lt;li&gt;Over 30 but less than 90 days: 90 DAY&lt;/li&gt; &lt;li&gt;Over 90 but less than 180 days: 180 DAY&lt;/li&gt; &lt;li&gt;Over 180 but less than 365 days: 365 DAY&lt;/li&gt; &lt;li&gt;More than 365 days: 5 YEAR&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link CommentCommentPeriod}
     */
    @jakarta.annotation.Nullable
    public CommentCommentPeriod getCommentPeriod() {
        return this.commentPeriod;
    }
    /**
     * Gets the commentText property value. The text of the feedback comment, follow-up, or reply. HTML formatting and personal information (for example, phone numbers) are not allowed. This field is returned if a comment was provided for the feedback entry. If the comment was removed due to eBay policy, this field will contain &apos;&lt;code&gt;--&lt;/code&gt;&apos; and the &lt;strong&gt;commentTextRemovedPerPolicy&lt;/strong&gt; field will return &lt;code&gt;true&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommentText() {
        return this.commentText;
    }
    /**
     * Gets the commentTextRemovedPerPolicy property value. If &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback follow-up or reply comment text was removed per eBay policy.  This field is only returned when a &lt;strong&gt;followupComment&lt;/strong&gt; container is returned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCommentTextRemovedPerPolicy() {
        return this.commentTextRemovedPerPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("commentPeriod", (n) -> { this.setCommentPeriod(n.getObjectValue(CommentCommentPeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("commentText", (n) -> { this.setCommentText(n.getStringValue()); });
        deserializerMap.put("commentTextRemovedPerPolicy", (n) -> { this.setCommentTextRemovedPerPolicy(n.getBooleanValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(FeedbackCommentStateEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. This enumerated value indicates the state of the feedback (for example, &lt;code&gt;ENTERED&lt;/code&gt;). This can be the state of the feedback comment, the follow-up comment, or the reply comment.
     * @return a {@link FeedbackCommentStateEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackCommentStateEnum getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("commentPeriod", this.getCommentPeriod());
        writer.writeStringValue("commentText", this.getCommentText());
        writer.writeBooleanValue("commentTextRemovedPerPolicy", this.getCommentTextRemovedPerPolicy());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the commentPeriod property value. This container indicates the timing of a feedback comment based on when it was left. It is only returned if a comment was provided. Possible values are 30 days, 90 days, 180 days, 365 days, or 5 years: &lt;br&gt;&lt;ul&gt;&lt;li&gt;Less than 30 days: 30 DAY&lt;/li&gt; &lt;li&gt;Over 30 but less than 90 days: 90 DAY&lt;/li&gt; &lt;li&gt;Over 90 but less than 180 days: 180 DAY&lt;/li&gt; &lt;li&gt;Over 180 but less than 365 days: 365 DAY&lt;/li&gt; &lt;li&gt;More than 365 days: 5 YEAR&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the commentPeriod property.
     */
    public void setCommentPeriod(@jakarta.annotation.Nullable final CommentCommentPeriod value) {
        this.commentPeriod = value;
    }
    /**
     * Sets the commentText property value. The text of the feedback comment, follow-up, or reply. HTML formatting and personal information (for example, phone numbers) are not allowed. This field is returned if a comment was provided for the feedback entry. If the comment was removed due to eBay policy, this field will contain &apos;&lt;code&gt;--&lt;/code&gt;&apos; and the &lt;strong&gt;commentTextRemovedPerPolicy&lt;/strong&gt; field will return &lt;code&gt;true&lt;/code&gt;.
     * @param value Value to set for the commentText property.
     */
    public void setCommentText(@jakarta.annotation.Nullable final String value) {
        this.commentText = value;
    }
    /**
     * Sets the commentTextRemovedPerPolicy property value. If &lt;code&gt;true&lt;/code&gt;, this boolean indicates the feedback follow-up or reply comment text was removed per eBay policy.  This field is only returned when a &lt;strong&gt;followupComment&lt;/strong&gt; container is returned.
     * @param value Value to set for the commentTextRemovedPerPolicy property.
     */
    public void setCommentTextRemovedPerPolicy(@jakarta.annotation.Nullable final Boolean value) {
        this.commentTextRemovedPerPolicy = value;
    }
    /**
     * Sets the state property value. This enumerated value indicates the state of the feedback (for example, &lt;code&gt;ENTERED&lt;/code&gt;). This can be the state of the feedback comment, the follow-up comment, or the reply comment.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final FeedbackCommentStateEnum value) {
        this.state = value;
    }
}
