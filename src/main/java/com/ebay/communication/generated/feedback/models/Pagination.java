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
 * This type provides pagination information for the returned line items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Pagination implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This value indicates the number of feedback entries on the current response page.
     */
    private Integer count;
    /**
     * The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request. This is the maximum number of line items, as filtered, awaiting feedback to return per page from the result set. This field indicates the number of line items returned per page of data. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If this is the last or only page of the result set, the page may contain fewer line items than the &lt;b&gt;limit&lt;/b&gt; value. &lt;/span&gt;&lt;/p&gt;&lt;p&gt;If a &lt;b&gt;limit&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;25&lt;/code&gt;, returning up to 25 line items on each page.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;25&lt;/p&gt;
     */
    private Integer limit;
    /**
     * The relative URI for the next page of results starting with the resource name. This URI is returned if there is an additional page of results in the result set.
     */
    private String next;
    /**
     * The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request. This field indicates how many results were skipped in the response. If an &lt;b&gt;offset&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;0&lt;/code&gt;, returning the first page of results.&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;0&lt;/p&gt;
     */
    private Integer offset;
    /**
     * The relative URI for the previous page of results starting with the resource name. This URI is returned if there is a previous page of results in the result set.&lt;/p&gt;
     */
    private String prev;
    /**
     * The total number of line items available that match the filter criteria. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the total value exceeds the limit value, there are multiple pages of results.&lt;/span&gt;&lt;/p&gt;
     */
    private Integer total;
    /**
     * Instantiates a new {@link Pagination} and sets the default values.
     */
    public Pagination() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Pagination}
     */
    @jakarta.annotation.Nonnull
    public static Pagination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Pagination();
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
     * Gets the count property value. This value indicates the number of feedback entries on the current response page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request. This is the maximum number of line items, as filtered, awaiting feedback to return per page from the result set. This field indicates the number of line items returned per page of data. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If this is the last or only page of the result set, the page may contain fewer line items than the &lt;b&gt;limit&lt;/b&gt; value. &lt;/span&gt;&lt;/p&gt;&lt;p&gt;If a &lt;b&gt;limit&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;25&lt;/code&gt;, returning up to 25 line items on each page.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;25&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The relative URI for the next page of results starting with the resource name. This URI is returned if there is an additional page of results in the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request. This field indicates how many results were skipped in the response. If an &lt;b&gt;offset&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;0&lt;/code&gt;, returning the first page of results.&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;0&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the prev property value. The relative URI for the previous page of results starting with the resource name. This URI is returned if there is a previous page of results in the result set.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. The total number of line items available that match the filter criteria. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the total value exceeds the limit value, there are multiple pages of results.&lt;/span&gt;&lt;/p&gt;
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
        writer.writeIntegerValue("count", this.getCount());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("prev", this.getPrev());
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
     * Sets the count property value. This value indicates the number of feedback entries on the current response page.
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the limit property value. The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request. This is the maximum number of line items, as filtered, awaiting feedback to return per page from the result set. This field indicates the number of line items returned per page of data. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If this is the last or only page of the result set, the page may contain fewer line items than the &lt;b&gt;limit&lt;/b&gt; value. &lt;/span&gt;&lt;/p&gt;&lt;p&gt;If a &lt;b&gt;limit&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;25&lt;/code&gt;, returning up to 25 line items on each page.&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;25&lt;/p&gt;
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The relative URI for the next page of results starting with the resource name. This URI is returned if there is an additional page of results in the result set.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request. This field indicates how many results were skipped in the response. If an &lt;b&gt;offset&lt;/b&gt; parameter was not included in the request, this value will default to &lt;code&gt;0&lt;/code&gt;, returning the first page of results.&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;0&lt;/p&gt;
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the prev property value. The relative URI for the previous page of results starting with the resource name. This URI is returned if there is a previous page of results in the result set.&lt;/p&gt;
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. The total number of line items available that match the filter criteria. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the total value exceeds the limit value, there are multiple pages of results.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
