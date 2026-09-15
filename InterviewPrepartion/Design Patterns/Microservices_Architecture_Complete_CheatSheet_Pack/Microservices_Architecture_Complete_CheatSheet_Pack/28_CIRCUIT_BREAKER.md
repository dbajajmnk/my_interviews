# Circuit Breaker

## States

```text
CLOSED
  ↓ failures
OPEN
  ↓ cooldown
HALF-OPEN
  ↓ success/failure
CLOSED / OPEN
```

## Why

Stops repeatedly calling a failing dependency.

## Benefits

- fail fast
- protect threads/resources
- allow dependency recovery

## Trap

Circuit breaker does not replace timeout.
