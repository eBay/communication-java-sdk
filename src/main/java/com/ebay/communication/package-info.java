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
