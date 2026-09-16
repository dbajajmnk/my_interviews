# Retry and Resilience Contracts

## SDK Responsibility

Define where retries happen:
- provider adapter;
- tool adapter;
- caller.

## Avoid

Nested retries at multiple layers causing retry storms.

## Rule

Expose retryable classification, not hidden unlimited retries.
