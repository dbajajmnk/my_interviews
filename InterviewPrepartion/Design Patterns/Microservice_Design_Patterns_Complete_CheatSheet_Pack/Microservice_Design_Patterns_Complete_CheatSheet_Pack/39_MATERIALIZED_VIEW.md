# Materialized View

## Intent
Precompute read-optimized data.

```text
Events/Data
 ↓
Projection
 ↓
Materialized View
 ↓
Fast Query
```

## Good
Dashboards, reporting, joins across services.

## Trap
View freshness and rebuild strategy matter.
