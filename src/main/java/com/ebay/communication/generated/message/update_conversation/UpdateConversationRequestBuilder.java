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

package com.ebay.communication.generated.message.update_conversation;

import com.ebay.communication.generated.message.models.UpdateConversationRequest;
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
 * Builds and executes requests for operations under /update_conversation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateConversationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateConversationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateConversationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/update_conversation", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateConversationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateConversationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/update_conversation", rawUrl);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; or the &lt;b&gt;read&lt;/b&gt; status of a specified conversation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one of these statuses can be updated at a time using this method. If both fields are included, only the &lt;b&gt;read&lt;/b&gt; status of the specified conversation will be updated and the &lt;b&gt;conversationStatus&lt;/b&gt; field will be ignored.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt; of the conversation to modify, as well as the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation are required as part of the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation to be updated is required in the request payload. If this value is not provided, an error will occur.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;To update a conversation&apos;s status (for example, updating an &lt;code&gt;ACTIVE&lt;/code&gt; conversation to &lt;code&gt;ARCHIVE&lt;/code&gt;), include the &lt;b&gt;conversationStatus&lt;/b&gt; field in the request with the updated value. To update a conversation&apos;s read status (for example, updating an &lt;code&gt;UNREAD&lt;/code&gt; conversation to &lt;code&gt;READ&lt;/code&gt;), include the &lt;b&gt;read&lt;/b&gt; boolean in the request with the updated value.
     * @param body This type defines the request payload of the &lt;b&gt;updateConversation&lt;/b&gt; method.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateConversationRequest body) {
        post(body, null);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; or the &lt;b&gt;read&lt;/b&gt; status of a specified conversation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one of these statuses can be updated at a time using this method. If both fields are included, only the &lt;b&gt;read&lt;/b&gt; status of the specified conversation will be updated and the &lt;b&gt;conversationStatus&lt;/b&gt; field will be ignored.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt; of the conversation to modify, as well as the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation are required as part of the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation to be updated is required in the request payload. If this value is not provided, an error will occur.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;To update a conversation&apos;s status (for example, updating an &lt;code&gt;ACTIVE&lt;/code&gt; conversation to &lt;code&gt;ARCHIVE&lt;/code&gt;), include the &lt;b&gt;conversationStatus&lt;/b&gt; field in the request with the updated value. To update a conversation&apos;s read status (for example, updating an &lt;code&gt;UNREAD&lt;/code&gt; conversation to &lt;code&gt;READ&lt;/code&gt;), include the &lt;b&gt;read&lt;/b&gt; boolean in the request with the updated value.
     * @param body This type defines the request payload of the &lt;b&gt;updateConversation&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateConversationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; or the &lt;b&gt;read&lt;/b&gt; status of a specified conversation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one of these statuses can be updated at a time using this method. If both fields are included, only the &lt;b&gt;read&lt;/b&gt; status of the specified conversation will be updated and the &lt;b&gt;conversationStatus&lt;/b&gt; field will be ignored.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt; of the conversation to modify, as well as the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation are required as part of the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation to be updated is required in the request payload. If this value is not provided, an error will occur.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;To update a conversation&apos;s status (for example, updating an &lt;code&gt;ACTIVE&lt;/code&gt; conversation to &lt;code&gt;ARCHIVE&lt;/code&gt;), include the &lt;b&gt;conversationStatus&lt;/b&gt; field in the request with the updated value. To update a conversation&apos;s read status (for example, updating an &lt;code&gt;UNREAD&lt;/code&gt; conversation to &lt;code&gt;READ&lt;/code&gt;), include the &lt;b&gt;read&lt;/b&gt; boolean in the request with the updated value.
     * @param body This type defines the request payload of the &lt;b&gt;updateConversation&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateConversationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used to update the &lt;b&gt;conversationStatus&lt;/b&gt; or the &lt;b&gt;read&lt;/b&gt; status of a specified conversation.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only one of these statuses can be updated at a time using this method. If both fields are included, only the &lt;b&gt;read&lt;/b&gt; status of the specified conversation will be updated and the &lt;b&gt;conversationStatus&lt;/b&gt; field will be ignored.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;conversationId&lt;/b&gt; of the conversation to modify, as well as the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation are required as part of the request payload.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Though it cannot be updated, the existing &lt;b&gt;conversationType&lt;/b&gt; of the specified conversation to be updated is required in the request payload. If this value is not provided, an error will occur.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;To update a conversation&apos;s status (for example, updating an &lt;code&gt;ACTIVE&lt;/code&gt; conversation to &lt;code&gt;ARCHIVE&lt;/code&gt;), include the &lt;b&gt;conversationStatus&lt;/b&gt; field in the request with the updated value. To update a conversation&apos;s read status (for example, updating an &lt;code&gt;UNREAD&lt;/code&gt; conversation to &lt;code&gt;READ&lt;/code&gt;), include the &lt;b&gt;read&lt;/b&gt; boolean in the request with the updated value.
     * @param body This type defines the request payload of the &lt;b&gt;updateConversation&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateConversationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateConversationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateConversationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
