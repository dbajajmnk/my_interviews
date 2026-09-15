# HTTP Client Cheat Sheet

## Common Choices
- `RestClient` for synchronous fluent calls
- `WebClient` for reactive/non-blocking calls
- interface-based HTTP service clients where appropriate

## Resilience Checklist
Timeout, retry policy, authentication, connection reuse, correlation, metrics, tracing, error mapping, idempotency.

## Rule
Always configure realistic outbound timeouts.

## Trap
Blind retries can amplify outages. Retry only transient, safe/idempotent operations with controlled backoff.
