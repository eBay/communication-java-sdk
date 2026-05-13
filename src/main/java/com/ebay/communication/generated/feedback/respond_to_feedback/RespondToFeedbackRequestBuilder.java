package com.ebay.communication.generated.feedback.respond_to_feedback;

import com.ebay.communication.generated.feedback.models.RespondToFeedbackRequest;
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
 * Builds and executes requests for operations under /respond_to_feedback
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RespondToFeedbackRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RespondToFeedbackRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RespondToFeedbackRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/respond_to_feedback", pathParameters);
    }
    /**
     * Instantiates a new {@link RespondToFeedbackRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RespondToFeedbackRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/respond_to_feedback", rawUrl);
    }
    /**
     * This method allows users to respond to feedback provided by the order partner for a specific line item in an order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows the user to provide additional context or address the order partner&apos;s feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback response must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;You can only use this method if feedback has been provided by the order partner and you have not yet responded to it. &lt;/p&gt; &lt;p&gt;When responding to feedback, your feedback score is not affected when you respond to feedback.&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call returns an HTTP status of &lt;b&gt;200 Success&lt;/b&gt;.&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt;respondToFeedback&lt;/b&gt; request.
     * @return a {@link RespondToFeedbackPostResponse}
     */
    @jakarta.annotation.Nullable
    public RespondToFeedbackPostResponse post(@jakarta.annotation.Nonnull final RespondToFeedbackRequest body) {
        return post(body, null);
    }
    /**
     * This method allows users to respond to feedback provided by the order partner for a specific line item in an order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows the user to provide additional context or address the order partner&apos;s feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback response must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;You can only use this method if feedback has been provided by the order partner and you have not yet responded to it. &lt;/p&gt; &lt;p&gt;When responding to feedback, your feedback score is not affected when you respond to feedback.&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call returns an HTTP status of &lt;b&gt;200 Success&lt;/b&gt;.&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt;respondToFeedback&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RespondToFeedbackPostResponse}
     */
    @jakarta.annotation.Nullable
    public RespondToFeedbackPostResponse post(@jakarta.annotation.Nonnull final RespondToFeedbackRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, RespondToFeedbackPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows users to respond to feedback provided by the order partner for a specific line item in an order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows the user to provide additional context or address the order partner&apos;s feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback response must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;You can only use this method if feedback has been provided by the order partner and you have not yet responded to it. &lt;/p&gt; &lt;p&gt;When responding to feedback, your feedback score is not affected when you respond to feedback.&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call returns an HTTP status of &lt;b&gt;200 Success&lt;/b&gt;.&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt;respondToFeedback&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RespondToFeedbackRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows users to respond to feedback provided by the order partner for a specific line item in an order. For each order, the order partner is the other participant in the transaction, either the buyer or seller, depending on the eBay user associated with the user token. This method allows the user to provide additional context or address the order partner&apos;s feedback.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The feedback response must adhere to community guidelines and be relevant to the transaction.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;You can only use this method if feedback has been provided by the order partner and you have not yet responded to it. &lt;/p&gt; &lt;p&gt;When responding to feedback, your feedback score is not affected when you respond to feedback.&lt;/p&gt;&lt;p&gt;For additional information on leaving feedback, see the following:&lt;ul&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/buying/leaving-feedback-sellers/leaving-feedback-sellers?id=4007&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for sellers&lt;/a&gt;&lt;/li&gt;&lt;li&gt;&lt;a href=&quot;https://www.ebay.com/help/selling/leaving-feedback-buyers/leaving-feedback-buyers?id=4078&quot;  target=&quot;_blank&quot;&gt;Leaving feedback for buyers&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;p&gt;A successful call returns an HTTP status of &lt;b&gt;200 Success&lt;/b&gt;.&lt;/p&gt;
     * @param body The type that defines the fields for the &lt;b&gt;respondToFeedback&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RespondToFeedbackRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RespondToFeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RespondToFeedbackRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RespondToFeedbackRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
