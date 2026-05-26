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

package com.ebay.communication.generated.message.bulk_update_conversation;

import com.ebay.communication.generated.message.models.BulkUpdateConversationsRequest;
import com.ebay.communication.generated.message.models.BulkUpdateConversationsResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /bulk_update_conversation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdateConversationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpdateConversationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateConversationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_conversation", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpdateConversationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateConversationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_conversation", rawUrl);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; of up to 10 conversations.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt;, existing &lt;b&gt;conversationType&lt;/b&gt;, and updated &lt;b&gt;conversationStatus&lt;/b&gt; for each conversation to modify are required in the &lt;b&gt;conversations&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the &lt;b&gt;conversationType&lt;/b&gt; field is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;If the updates were successful, the &lt;b&gt;conversationId&lt;/b&gt; of each conversation will be returned with an associated &lt;b&gt;updateStatus&lt;/b&gt; value of &lt;code&gt;SUCCESSFUL&lt;/code&gt;.
     * @param body This type defines the request body of the &lt;b&gt;bulkUpdateConversation&lt;/b&gt; method.
     * @return a {@link BulkUpdateConversationsResponse}
     */
    @jakarta.annotation.Nullable
    public BulkUpdateConversationsResponse post(@jakarta.annotation.Nonnull final BulkUpdateConversationsRequest body) {
        return post(body, null);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; of up to 10 conversations.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt;, existing &lt;b&gt;conversationType&lt;/b&gt;, and updated &lt;b&gt;conversationStatus&lt;/b&gt; for each conversation to modify are required in the &lt;b&gt;conversations&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the &lt;b&gt;conversationType&lt;/b&gt; field is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;If the updates were successful, the &lt;b&gt;conversationId&lt;/b&gt; of each conversation will be returned with an associated &lt;b&gt;updateStatus&lt;/b&gt; value of &lt;code&gt;SUCCESSFUL&lt;/code&gt;.
     * @param body This type defines the request body of the &lt;b&gt;bulkUpdateConversation&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkUpdateConversationsResponse}
     */
    @jakarta.annotation.Nullable
    public BulkUpdateConversationsResponse post(@jakarta.annotation.Nonnull final BulkUpdateConversationsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkUpdateConversationsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; of up to 10 conversations.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt;, existing &lt;b&gt;conversationType&lt;/b&gt;, and updated &lt;b&gt;conversationStatus&lt;/b&gt; for each conversation to modify are required in the &lt;b&gt;conversations&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the &lt;b&gt;conversationType&lt;/b&gt; field is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;If the updates were successful, the &lt;b&gt;conversationId&lt;/b&gt; of each conversation will be returned with an associated &lt;b&gt;updateStatus&lt;/b&gt; value of &lt;code&gt;SUCCESSFUL&lt;/code&gt;.
     * @param body This type defines the request body of the &lt;b&gt;bulkUpdateConversation&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateConversationsRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; of up to 10 conversations.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt;, existing &lt;b&gt;conversationType&lt;/b&gt;, and updated &lt;b&gt;conversationStatus&lt;/b&gt; for each conversation to modify are required in the &lt;b&gt;conversations&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the &lt;b&gt;conversationType&lt;/b&gt; field is required for each conversation being updated.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;If the updates were successful, the &lt;b&gt;conversationId&lt;/b&gt; of each conversation will be returned with an associated &lt;b&gt;updateStatus&lt;/b&gt; value of &lt;code&gt;SUCCESSFUL&lt;/code&gt;.
     * @param body This type defines the request body of the &lt;b&gt;bulkUpdateConversation&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateConversationsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BulkUpdateConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateConversationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpdateConversationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
