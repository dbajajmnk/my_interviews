# Adapter Pattern

## Intent
Convert one interface/protocol into another.

```text
Service
 ↓
Adapter
 ↓
Legacy / Vendor API
```

## Use
Protocol/schema mismatch.

## Trap
Adapter should not absorb unrelated business logic.
