#!/usr/bin/env bash
set -euo pipefail

echo "Regenerating REST clients via Kiota..."

# Feedback API
kiota generate -l java \
  -d specs/openapi/feedback.yaml \
  -c FeedbackApiClient \
  -n com.ebay.communication.generated.feedback \
  -o src/main/java/com/ebay/communication/generated/feedback \
  --ebc --co

# Message API
kiota generate -l java \
  -d specs/openapi/message.yaml \
  -c MessageApiClient \
  -n com.ebay.communication.generated.message \
  -o src/main/java/com/ebay/communication/generated/message \
  --ebc --co

# Notification API
kiota generate -l java \
  -d specs/openapi/notification.yaml \
  -c NotificationApiClient \
  -n com.ebay.communication.generated.notification \
  -o src/main/java/com/ebay/communication/generated/notification \
  --ebc --co

# Negotiation API
kiota generate -l java \
  -d specs/openapi/negotiation.yaml \
  -c NegotiationApiClient \
  -n com.ebay.communication.generated.negotiation \
  -o src/main/java/com/ebay/communication/generated/negotiation \
  --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Done. Run './gradlew build' to compile."
