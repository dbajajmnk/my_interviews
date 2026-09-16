# Error Model, Retry, and Timeouts

## Normalized Errors

Expose SDK-level exceptions such as:
- AuthenticationError
- AuthorizationError
- ValidationError
- ProviderError
- ToolError
- TimeoutError
- RateLimitError
- PolicyDeniedError

## Why Normalize

Applications should not need provider-specific catch blocks everywhere.

## Retry Rules

Retry only transient failures:
- rate limits;
- temporary provider errors;
- network instability.

Do not automatically retry:
- invalid input;
- authorization failure;
- destructive actions without idempotency.

## Backoff

Use bounded exponential backoff + jitter and expose retry metadata in telemetry.
