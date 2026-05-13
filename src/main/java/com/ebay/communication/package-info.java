/**
 * Communication SDK for eBay - unified access to Feedback, Message, Notification, and Negotiation APIs.
 *
 * <h2>Quick Start</h2>
 * <pre>{@code
 * var config = new CommunicationConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new CommunicationClient(config)) {
 *     // Get conversations
 *     var conversations = sdk.message.getConversationsAsync(null).join();
 *
 *     // Get feedback
 *     var feedback = sdk.feedback.getFeedbackAsync(null).join();
 *
 *     // Create notification subscription
 *     var subscription = sdk.notification.createSubscriptionAsync(request, null).join();
 * }
 * }</pre>
 *
 * @see com.ebay.communication.CommunicationClient
 * @see com.ebay.communication.configuration.CommunicationConfiguration
 */
package com.ebay.communication;
