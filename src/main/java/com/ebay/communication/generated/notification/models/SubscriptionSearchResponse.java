package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes the details of the subscription search response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionSearchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The path to the call URI that produced the current page of results.
     */
    private String href;
    /**
     * The value of the limit parameter submitted in the request, which is the maximum number of items to return per page, from the result set. A result set is the complete set of results returned by the method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;20&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 20
     */
    private Integer limit;
    /**
     * The URL to access the next set of results. This field includes a &lt;strong&gt;continuation_token&lt;/strong&gt;. No &lt;b&gt;prev&lt;/b&gt; field is returned, but this value is persistent during the session so that you can use it to return to the next page.&lt;br&gt;&lt;br&gt;This field is not returned if fewer records than specified by the &lt;strong&gt;limit&lt;/strong&gt; field are returned.
     */
    private String next;
    /**
     * The subscriptions that match the search criteria.
     */
    private java.util.List<Subscription> subscriptions;
    /**
     * The total number of matches for the search criteria.
     */
    private Integer total;
    /**
     * Instantiates a new {@link SubscriptionSearchResponse} and sets the default values.
     */
    public SubscriptionSearchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubscriptionSearchResponse}
     */
    @jakarta.annotation.Nonnull
    public static SubscriptionSearchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionSearchResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The path to the call URI that produced the current page of results.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The value of the limit parameter submitted in the request, which is the maximum number of items to return per page, from the result set. A result set is the complete set of results returned by the method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;20&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 20
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The URL to access the next set of results. This field includes a &lt;strong&gt;continuation_token&lt;/strong&gt;. No &lt;b&gt;prev&lt;/b&gt; field is returned, but this value is persistent during the session so that you can use it to return to the next page.&lt;br&gt;&lt;br&gt;This field is not returned if fewer records than specified by the &lt;strong&gt;limit&lt;/strong&gt; field are returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the subscriptions property value. The subscriptions that match the search criteria.
     * @return a {@link java.util.List<Subscription>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }
    /**
     * Gets the total property value. The total number of matches for the search criteria.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. The path to the call URI that produced the current page of results.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The value of the limit parameter submitted in the request, which is the maximum number of items to return per page, from the result set. A result set is the complete set of results returned by the method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Though this parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;20&lt;/code&gt; if omitted.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 20
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The URL to access the next set of results. This field includes a &lt;strong&gt;continuation_token&lt;/strong&gt;. No &lt;b&gt;prev&lt;/b&gt; field is returned, but this value is persistent during the session so that you can use it to return to the next page.&lt;br&gt;&lt;br&gt;This field is not returned if fewer records than specified by the &lt;strong&gt;limit&lt;/strong&gt; field are returned.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the subscriptions property value. The subscriptions that match the search criteria.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<Subscription> value) {
        this.subscriptions = value;
    }
    /**
     * Sets the total property value. The total number of matches for the search criteria.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
