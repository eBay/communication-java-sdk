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
 * This type provides subject-based fields derived from feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Topic implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The main topic (or category) detected in the comment. See the available &lt;b&gt;topics&lt;/b&gt; in &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot;&gt;filter&lt;/a&gt;.
     */
    private String coarseTopic;
    /**
     * &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Fine topics are not currently  supported.&lt;/span&gt;&lt;/p&gt;A more specific detail or subtopic related to the coarse topic. 
     */
    private String fineTopic;
    /**
     * This array lists any text snippets, phrases, or examples, from the feedback that supports the detected topic.
     */
    private java.util.List<String> highlightedTexts;
    /**
     * This field indicates a classification of the feedback, whether the feedback is &lt;code&gt;Positive&lt;/code&gt;, &lt;code&gt;Negative&lt;/code&gt;, or &lt;code&gt;Neutral&lt;/code&gt;.
     */
    private String sentiment;
    /**
     * Instantiates a new {@link Topic} and sets the default values.
     */
    public Topic() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Topic}
     */
    @jakarta.annotation.Nonnull
    public static Topic createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Topic();
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
     * Gets the coarseTopic property value. The main topic (or category) detected in the comment. See the available &lt;b&gt;topics&lt;/b&gt; in &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot;&gt;filter&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoarseTopic() {
        return this.coarseTopic;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("coarseTopic", (n) -> { this.setCoarseTopic(n.getStringValue()); });
        deserializerMap.put("fineTopic", (n) -> { this.setFineTopic(n.getStringValue()); });
        deserializerMap.put("highlightedTexts", (n) -> { this.setHighlightedTexts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sentiment", (n) -> { this.setSentiment(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fineTopic property value. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Fine topics are not currently  supported.&lt;/span&gt;&lt;/p&gt;A more specific detail or subtopic related to the coarse topic. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFineTopic() {
        return this.fineTopic;
    }
    /**
     * Gets the highlightedTexts property value. This array lists any text snippets, phrases, or examples, from the feedback that supports the detected topic.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHighlightedTexts() {
        return this.highlightedTexts;
    }
    /**
     * Gets the sentiment property value. This field indicates a classification of the feedback, whether the feedback is &lt;code&gt;Positive&lt;/code&gt;, &lt;code&gt;Negative&lt;/code&gt;, or &lt;code&gt;Neutral&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentiment() {
        return this.sentiment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("coarseTopic", this.getCoarseTopic());
        writer.writeStringValue("fineTopic", this.getFineTopic());
        writer.writeCollectionOfPrimitiveValues("highlightedTexts", this.getHighlightedTexts());
        writer.writeStringValue("sentiment", this.getSentiment());
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
     * Sets the coarseTopic property value. The main topic (or category) detected in the comment. See the available &lt;b&gt;topics&lt;/b&gt; in &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#uri.filter&quot;&gt;filter&lt;/a&gt;.
     * @param value Value to set for the coarseTopic property.
     */
    public void setCoarseTopic(@jakarta.annotation.Nullable final String value) {
        this.coarseTopic = value;
    }
    /**
     * Sets the fineTopic property value. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Fine topics are not currently  supported.&lt;/span&gt;&lt;/p&gt;A more specific detail or subtopic related to the coarse topic. 
     * @param value Value to set for the fineTopic property.
     */
    public void setFineTopic(@jakarta.annotation.Nullable final String value) {
        this.fineTopic = value;
    }
    /**
     * Sets the highlightedTexts property value. This array lists any text snippets, phrases, or examples, from the feedback that supports the detected topic.
     * @param value Value to set for the highlightedTexts property.
     */
    public void setHighlightedTexts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.highlightedTexts = value;
    }
    /**
     * Sets the sentiment property value. This field indicates a classification of the feedback, whether the feedback is &lt;code&gt;Positive&lt;/code&gt;, &lt;code&gt;Negative&lt;/code&gt;, or &lt;code&gt;Neutral&lt;/code&gt;.
     * @param value Value to set for the sentiment property.
     */
    public void setSentiment(@jakarta.annotation.Nullable final String value) {
        this.sentiment = value;
    }
}
