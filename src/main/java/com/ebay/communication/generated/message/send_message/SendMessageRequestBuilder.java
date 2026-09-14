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

package com.ebay.communication.generated.message.send_message;

import com.ebay.communication.generated.message.models.SendMessageRequest;
import com.ebay.communication.generated.message.models.SendMessageResponse;
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
 * Builds and executes requests for operations under /send_message
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendMessageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SendMessageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendMessageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/send_message", pathParameters);
    }
    /**
     * Instantiates a new {@link SendMessageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendMessageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/send_message", rawUrl);
    }
    /**
     * This method can be used to start a conversation with another user or send a message in an existing conversation with another user based on the information provided in the request.&lt;br&gt;&lt;br&gt;To send a message, one of the &lt;strong&gt;conversationId&lt;/strong&gt; or &lt;strong&gt;otherPartyUsername&lt;/strong&gt; request fields is required. The &lt;strong&gt;conversationId&lt;/strong&gt; must be used when sending a message in an existing conversation and specifies the conversation for which to send the message. For a new conversation, the &lt;strong&gt;otherPartyUsername&lt;/strong&gt; field must be used to send the message to a specific user. In addition, the &lt;strong&gt;messageText&lt;/strong&gt; field is required as it contains the body text of the message.&lt;br&gt;&lt;br&gt;Optionally, media (such as images or documents) can be attached to the message using the &lt;strong&gt;messageMedia&lt;/strong&gt; container. The &lt;strong&gt;reference&lt;/strong&gt; container can also be used to associate a message with a listing.
     * @param body This type defines the request payload of the &lt;strong&gt;sendMessage&lt;/strong&gt; method.
     * @return a {@link SendMessageResponse}
     */
    @jakarta.annotation.Nullable
    public SendMessageResponse post(@jakarta.annotation.Nonnull final SendMessageRequest body) {
        return post(body, null);
    }
    /**
     * This method can be used to start a conversation with another user or send a message in an existing conversation with another user based on the information provided in the request.&lt;br&gt;&lt;br&gt;To send a message, one of the &lt;strong&gt;conversationId&lt;/strong&gt; or &lt;strong&gt;otherPartyUsername&lt;/strong&gt; request fields is required. The &lt;strong&gt;conversationId&lt;/strong&gt; must be used when sending a message in an existing conversation and specifies the conversation for which to send the message. For a new conversation, the &lt;strong&gt;otherPartyUsername&lt;/strong&gt; field must be used to send the message to a specific user. In addition, the &lt;strong&gt;messageText&lt;/strong&gt; field is required as it contains the body text of the message.&lt;br&gt;&lt;br&gt;Optionally, media (such as images or documents) can be attached to the message using the &lt;strong&gt;messageMedia&lt;/strong&gt; container. The &lt;strong&gt;reference&lt;/strong&gt; container can also be used to associate a message with a listing.
     * @param body This type defines the request payload of the &lt;strong&gt;sendMessage&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SendMessageResponse}
     */
    @jakarta.annotation.Nullable
    public SendMessageResponse post(@jakarta.annotation.Nonnull final SendMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SendMessageResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to start a conversation with another user or send a message in an existing conversation with another user based on the information provided in the request.&lt;br&gt;&lt;br&gt;To send a message, one of the &lt;strong&gt;conversationId&lt;/strong&gt; or &lt;strong&gt;otherPartyUsername&lt;/strong&gt; request fields is required. The &lt;strong&gt;conversationId&lt;/strong&gt; must be used when sending a message in an existing conversation and specifies the conversation for which to send the message. For a new conversation, the &lt;strong&gt;otherPartyUsername&lt;/strong&gt; field must be used to send the message to a specific user. In addition, the &lt;strong&gt;messageText&lt;/strong&gt; field is required as it contains the body text of the message.&lt;br&gt;&lt;br&gt;Optionally, media (such as images or documents) can be attached to the message using the &lt;strong&gt;messageMedia&lt;/strong&gt; container. The &lt;strong&gt;reference&lt;/strong&gt; container can also be used to associate a message with a listing.
     * @param body This type defines the request payload of the &lt;strong&gt;sendMessage&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendMessageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used to start a conversation with another user or send a message in an existing conversation with another user based on the information provided in the request.&lt;br&gt;&lt;br&gt;To send a message, one of the &lt;strong&gt;conversationId&lt;/strong&gt; or &lt;strong&gt;otherPartyUsername&lt;/strong&gt; request fields is required. The &lt;strong&gt;conversationId&lt;/strong&gt; must be used when sending a message in an existing conversation and specifies the conversation for which to send the message. For a new conversation, the &lt;strong&gt;otherPartyUsername&lt;/strong&gt; field must be used to send the message to a specific user. In addition, the &lt;strong&gt;messageText&lt;/strong&gt; field is required as it contains the body text of the message.&lt;br&gt;&lt;br&gt;Optionally, media (such as images or documents) can be attached to the message using the &lt;strong&gt;messageMedia&lt;/strong&gt; container. The &lt;strong&gt;reference&lt;/strong&gt; container can also be used to associate a message with a listing.
     * @param body This type defines the request payload of the &lt;strong&gt;sendMessage&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SendMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMessageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SendMessageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
