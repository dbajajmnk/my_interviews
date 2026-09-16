# Resilience Patterns for Agent SDKs

## Core Patterns

- Retry
- Timeout
- Circuit Breaker
- Bulkhead
- Fallback
- Idempotency
- Rate Limiter

## Example

```text
Agent Runtime
  ↓
Timeout
  ↓
Retry
  ↓
Circuit Breaker
  ↓
Model Provider
```

## Caution

Order matters. Blind retry around a non-idempotent tool can duplicate side effects.

## Interview Rule

> Retry transient reads freely within limits; retry writes only when idempotency is guaranteed.
