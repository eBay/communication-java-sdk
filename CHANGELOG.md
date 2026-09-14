# ChangeLog

## 2.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `NegotiationClient`:
  - `findEligibleItemsAsync`: `(String, String, String, String, RequestOptions)` → `(Integer, Integer, String, String, RequestOptions)`

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following members were removed from `CommunicationClient`:
  - `graphQL`
- The following operations changed signature on `FeedbackClient`:
  - `getFeedbackAsync`: `(String, RequestOptions)` → `(String, String, String, String, String, String, String, String, String, String, String, RequestOptions)`
  - `getFeedbackRatingSummaryAsync`: `(String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getItemsAwaitingFeedbackAsync`: `(String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
- The following operations changed signature on `MessageClient`:
  - `getConversationAsync`: `(String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getConversationsAsync`: `(String, RequestOptions)` → `(String, String, String, String, String, String, String, String, String, String, RequestOptions)`
- The following operations changed signature on `NegotiationClient`:
  - `findEligibleItemsAsync`: `(String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `sendOfferToInterestedBuyersAsync`: `(CreateOffersRequest, String, RequestOptions)` → `(CreateOffersRequest, String, String, RequestOptions)`
- The following operations changed signature on `NotificationClient`:
  - `getDestinationsAsync`: `(String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getSubscriptionsAsync`: `(String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getTopicsAsync`: `(String, RequestOptions)` → `(String, String, String, RequestOptions)`
