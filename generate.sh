#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

echo "Generating Communication Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/communication/generated

echo "Generating FeedbackApiClient..."
kiota generate -l java -d specs/openapi/feedback.json \
  -c FeedbackApiClient -n com.ebay.communication.generated.feedback \
  -o src/main/java/com/ebay/communication/generated/feedback --ebc --co

echo "Generating MessageApiClient..."
kiota generate -l java -d specs/openapi/message.json \
  -c MessageApiClient -n com.ebay.communication.generated.message \
  -o src/main/java/com/ebay/communication/generated/message --ebc --co

echo "Generating NegotiationApiClient..."
kiota generate -l java -d specs/openapi/negotiation.json \
  -c NegotiationApiClient -n com.ebay.communication.generated.negotiation \
  -o src/main/java/com/ebay/communication/generated/negotiation --ebc --co

echo "Generating NotificationApiClient..."
kiota generate -l java -d specs/openapi/notification.json \
  -c NotificationApiClient -n com.ebay.communication.generated.notification \
  -o src/main/java/com/ebay/communication/generated/notification --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
