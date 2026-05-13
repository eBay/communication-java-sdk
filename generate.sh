#!/usr/bin/env bash
set -euo pipefail

echo "Regenerating REST clients via Kiota..."

# Feedback API
kiota generate -l java \
  -d specs/commerce_feedback_v1_beta_oas3.yaml \
  -c FeedbackApiClient \
  -n com.ebay.communication.generated.feedback \
  -o src/main/java/com/ebay/communication/generated/feedback \
  --ebc --co

# Message API
kiota generate -l java \
  -d specs/commerce_message_v1_oas3.yaml \
  -c MessageApiClient \
  -n com.ebay.communication.generated.message \
  -o src/main/java/com/ebay/communication/generated/message \
  --ebc --co

# Notification API
kiota generate -l java \
  -d specs/commerce_notification_v1_oas3.yaml \
  -c NotificationApiClient \
  -n com.ebay.communication.generated.notification \
  -o src/main/java/com/ebay/communication/generated/notification \
  --ebc --co

# Negotiation API
kiota generate -l java \
  -d specs/sell_negotiation_v1_oas3.yaml \
  -c NegotiationApiClient \
  -n com.ebay.communication.generated.negotiation \
  -o src/main/java/com/ebay/communication/generated/negotiation \
  --ebc --co

echo "Done. Run './gradlew build' to compile."
