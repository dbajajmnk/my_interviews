# Compensating Transaction

## Intent
Undo/neutralize effects of a previously completed local transaction.

Example:
```text
Charge card
 ↓ later failure
Refund card
```

## Important
Compensation may not restore identical original state.

## Related
Saga.
