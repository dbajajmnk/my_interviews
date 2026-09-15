# Semantic Lock

## Intent
Mark an entity as being in an intermediate business state so conflicting operations are prevented.

Example:
```text
Order status = PENDING_PAYMENT
```

## Use
Long-running sagas.

## Trap
This is a business lock/state, not necessarily a DB lock.
