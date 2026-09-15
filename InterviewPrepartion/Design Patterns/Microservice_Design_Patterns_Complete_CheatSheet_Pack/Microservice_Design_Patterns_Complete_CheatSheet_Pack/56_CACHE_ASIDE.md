# Cache-Aside

## Pattern
```text
Read cache
 ├── hit → return
 └── miss → DB → cache → return
```

## Trap
Invalidation and stale data are the hard parts.
