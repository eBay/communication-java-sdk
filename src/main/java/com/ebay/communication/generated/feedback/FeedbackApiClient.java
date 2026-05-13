package com.ebay.communication.generated.feedback;

import com.ebay.communication.generated.feedback.awaiting_feedback.AwaitingFeedbackRequestBuilder;
import com.ebay.communication.generated.feedback.feedback_rating_summary.FeedbackRatingSummaryRequestBuilder;
import com.ebay.communication.generated.feedback.feedback.FeedbackRequestBuilder;
import com.ebay.communication.generated.feedback.respond_to_feedback.RespondToFeedbackRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackApiClient extends BaseRequestBuilder {
    /**
     * The awaiting_feedback property
     * @return a {@link AwaitingFeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AwaitingFeedbackRequestBuilder awaitingFeedback() {
        return new AwaitingFeedbackRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The feedback property
     * @return a {@link FeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedbackRequestBuilder feedback() {
        return new FeedbackRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The feedback_rating_summary property
     * @return a {@link FeedbackRatingSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedbackRatingSummaryRequestBuilder feedbackRatingSummary() {
        return new FeedbackRatingSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The respond_to_feedback property
     * @return a {@link RespondToFeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RespondToFeedbackRequestBuilder respondToFeedback() {
        return new RespondToFeedbackRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FeedbackApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedbackApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
