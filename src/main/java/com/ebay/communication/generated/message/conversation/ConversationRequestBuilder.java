package com.ebay.communication.generated.message.conversation;

import com.ebay.communication.generated.message.conversation.item.WithConversationItemRequestBuilder;
import com.ebay.communication.generated.message.models.GetAllMyConversationsResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /conversation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.communication.generated.message.conversation.item collection
     * @param conversation_id This path parameters specifies the unique identifier of the conversation that is to be retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/message/resources/conversation/methods/getConversations&quot; target=&quot;_blank&quot;&gt;getConversations&lt;/a&gt; method to retrieve conversation ID values.
     * @return a {@link WithConversationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConversationItemRequestBuilder byConversation_id(@jakarta.annotation.Nonnull final String conversation_id) {
        Objects.requireNonNull(conversation_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversation_id", conversation_id);
        return new WithConversationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConversationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversation?conversation_type={conversation_type}{&conversation_status*,end_time*,limit*,offset*,other_party_username*,reference_id*,reference_type*,start_time*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ConversationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversation?conversation_type={conversation_type}{&conversation_status*,end_time*,limit*,offset*,other_party_username*,reference_id*,reference_type*,start_time*}", rawUrl);
    }
    /**
     * This method can be used to retrieve one or more conversations associated with a user.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversation_type&lt;/b&gt; query parameter is required when using this method to specify if the retrieved conversations are from eBay or from members.&lt;br&gt;&lt;br&gt;The result set can also optionally be filtered by conversation status, reference, username, and/or time range. The &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters can be used to paginate the result set and control how many conversations are returned in the response.
     * @return a {@link GetAllMyConversationsResponse}
     */
    @jakarta.annotation.Nullable
    public GetAllMyConversationsResponse get() {
        return get(null);
    }
    /**
     * This method can be used to retrieve one or more conversations associated with a user.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversation_type&lt;/b&gt; query parameter is required when using this method to specify if the retrieved conversations are from eBay or from members.&lt;br&gt;&lt;br&gt;The result set can also optionally be filtered by conversation status, reference, username, and/or time range. The &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters can be used to paginate the result set and control how many conversations are returned in the response.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAllMyConversationsResponse}
     */
    @jakarta.annotation.Nullable
    public GetAllMyConversationsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetAllMyConversationsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to retrieve one or more conversations associated with a user.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversation_type&lt;/b&gt; query parameter is required when using this method to specify if the retrieved conversations are from eBay or from members.&lt;br&gt;&lt;br&gt;The result set can also optionally be filtered by conversation status, reference, username, and/or time range. The &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters can be used to paginate the result set and control how many conversations are returned in the response.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method can be used to retrieve one or more conversations associated with a user.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversation_type&lt;/b&gt; query parameter is required when using this method to specify if the retrieved conversations are from eBay or from members.&lt;br&gt;&lt;br&gt;The result set can also optionally be filtered by conversation status, reference, username, and/or time range. The &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters can be used to paginate the result set and control how many conversations are returned in the response.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConversationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method can be used to retrieve one or more conversations associated with a user.&lt;br&gt;&lt;br&gt;The &lt;b&gt;conversation_type&lt;/b&gt; query parameter is required when using this method to specify if the retrieved conversations are from eBay or from members.&lt;br&gt;&lt;br&gt;The result set can also optionally be filtered by conversation status, reference, username, and/or time range. The &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters can be used to paginate the result set and control how many conversations are returned in the response.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the status of the conversations being retrieved. Only conversations in the specified status will be returned.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DELETE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;READ&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;UNREAD&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String conversationStatus;
        /**
         * This query parameter specifies the type of the conversations being retrieved. Only conversations of the specified type will be returned.&lt;br&gt;&lt;br&gt;This parameter is always required when using this method.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FROM_EBAY&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FROM_MEMBERS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String conversationType;
        /**
         * This query parameter specifies the end time (in ISO 8601 format) for which to stop retrieving conversations.&lt;br&gt;&lt;br&gt;For example, if set to &lt;code&gt;2024-11-06T10:00:00.000Z&lt;/code&gt;, only messages sent before this time will be retrieved.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; yyyy-MM-ddThh:mm.ss.sssZ&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this parameter is only available if the &lt;b&gt;conversation_type&lt;/b&gt; of the conversation is &lt;code&gt;FROM_MEMBERS&lt;/code&gt;.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String endTime;
        /**
         * The maximum number of entries that can be returned on each page of the paginated response.&lt;br&gt;&lt;br&gt;Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves entries 11 through 20 from the result set.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If this parameter is omitted, the default value is used.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 25&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 50
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of reports to skip in the result set before returning the first entry in the paginated response.&lt;br&gt;&lt;br&gt;Use this parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;0&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the first page of the response will contain the first 10 entries from the complete list retrieved by the call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If this parameter is omitted, the default value is used.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This query parameter specifies the user name (login name) of an eBay user for which to retrieve conversations.&lt;br&gt;&lt;br&gt;If this filter is used, only conversation(s) from the other eBay user specified through this parameter will be returned. 
         */
        @jakarta.annotation.Nullable
        public String otherPartyUsername;
        /**
         * This query parameter specifies the unique identifier of the reference (specified by the corresponding &lt;b&gt;reference_type&lt;/b&gt; value) associated with the conversation. Only conversations associated with the specified reference ID will be returned.&lt;br&gt;&lt;br&gt;For example, in the case of a &lt;code&gt;LISTING&lt;/code&gt; reference, this value will be the item ID value of the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If this query parameter is used, the &lt;b&gt;reference_type&lt;/b&gt; parameter must also be used to specify the type of reference this ID is associated with.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String referenceId;
        /**
         * This query parameter specifies the type of reference associated with a conversation.&lt;br&gt;&lt;br&gt;The reference type is used to specify what the conversation is in reference to. For example, a value of &lt;code&gt;LISTING&lt;/code&gt; specifies that the conversation is associated with a specific listing. The item ID associated with this listing can then be specified through the &lt;b&gt;reference_id&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;Currently, only the &lt;code&gt;LISTING&lt;/code&gt; reference type is supported.
         */
        @jakarta.annotation.Nullable
        public String referenceType;
        /**
         * This query parameter specifies the start time (in ISO 8601 format) for which to start retrieving conversations.&lt;br&gt;&lt;br&gt;For example, if set to &lt;code&gt;2024-11-06T10:00:00.000Z&lt;/code&gt;, only messages sent after this time will be retrieved.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; yyyy-MM-ddThh:mm.ss.sssZ&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this parameter is only available if the &lt;b&gt;conversation_type&lt;/b&gt; of the conversation is &lt;code&gt;FROM_MEMBERS&lt;/code&gt;.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String startTime;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("conversation_status", conversationStatus);
            allQueryParams.put("conversation_type", conversationType);
            allQueryParams.put("end_time", endTime);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("other_party_username", otherPartyUsername);
            allQueryParams.put("reference_id", referenceId);
            allQueryParams.put("reference_type", referenceType);
            allQueryParams.put("start_time", startTime);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
