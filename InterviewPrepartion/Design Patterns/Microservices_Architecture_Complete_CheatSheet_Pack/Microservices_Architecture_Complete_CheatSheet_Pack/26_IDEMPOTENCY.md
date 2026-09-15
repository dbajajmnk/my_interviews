# Idempotency

## Definition

Repeating the same operation does not create additional unintended effects.

## Example

```text
POST payment with Idempotency-Key
```

Same key:

```text
same business result
```

## Needed For

- retries
- message redelivery
- network uncertainty
- payment/order APIs

## Trap

HTTP method semantics alone do not guarantee your implementation is idempotent.
