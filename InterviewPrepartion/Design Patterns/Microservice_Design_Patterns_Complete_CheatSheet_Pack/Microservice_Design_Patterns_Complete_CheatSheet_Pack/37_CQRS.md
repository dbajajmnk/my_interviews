# CQRS

## Intent
Separate write and read models.

```text
Commands → Write Model → Write DB
                         ↓ events
Queries  → Read Model  → Read DB
```

## Good
Complex domains / read-heavy systems.

## Cost
More infrastructure and eventual consistency.

## Trap
CQRS does not require Event Sourcing.
