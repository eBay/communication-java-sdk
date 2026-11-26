# ChangeLog

## 0.3.0 (11/26/2026)

### Breaking changes

- The Negotiation API moved to the Offers and Leads SDK, where it has the same operations.

- The following clients were removed:
  - `NegotiationClient`
- The following members were removed from `CommunicationClient`:
  - `negotiation`

### Added

- Local mock servers: a base URL may use plain `http` when its host is a loopback host (`127.0.0.1`, `::1` or `localhost`) that you also pass in `allowedHosts`, for example `List.of("127.0.0.1")`. Every other host still requires `https`. `CommunicationConfiguration.LOOPBACK_HOSTS` lists the loopback hosts.

### Changed

- Updated the `feedback` OpenAPI document to the latest definitions.
- `CommunicationConfiguration.isTrustedUrl` and the auth provider apply the same rule.
- Hosts are compared lowercased and without IPv6 brackets, so `[::1]` and `::1` match.
- A rejected base URL now says whether the scheme or the host is not trusted.

## 0.2.3 (10/28/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.3 to 2.22.4 to fix CVE-2026-110879 (GHSA-m8xf-2cr7-77ph), a critical `PolymorphicTypeValidator` bypass via generic type arguments that allows arbitrary class instantiation.

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Removed members

- `CommunicationClient.graphQL`.

#### Changed signatures

`FeedbackClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getFeedbackAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String feedbackId, String feedbackType, String filter, String limit, String listingId, String offset, String orderLineItemId, String sort, String transactionId, String userId, String accessToken, RequestOptions requestOptions)` |
| `getFeedbackRatingSummaryAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String filter, String userId, String accessToken, RequestOptions requestOptions)` |
| `getItemsAwaitingFeedbackAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions)` |

`MessageClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getConversationAsync` | `(String conversationId, String accessToken, RequestOptions requestOptions)` | `(String conversationId, String conversationType, String limit, String offset, String accessToken, RequestOptions requestOptions)` |
| `getConversationsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String conversationStatus, String conversationType, String endTime, String limit, String offset, String otherPartyUsername, String referenceId, String referenceType, String startTime, String accessToken, RequestOptions requestOptions)` |

`NegotiationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `findEligibleItemsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(Integer limit, Integer offset, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `sendOfferToInterestedBuyersAsync` | `(CreateOffersRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateOffersRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

`NotificationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getDestinationsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |
| `getSubscriptionsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |
| `getTopicsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |