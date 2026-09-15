# Idempotent Consumer

## Intent
Repeated delivery produces the same business result.

## Example
Payment command uses:
```text
paymentRequestId
```

Repeated command:
```text
same result
no second charge
```

## Essential With
At-least-once delivery and retry.

## Trap
Idempotency must cover side effects, not only database insert logic.
