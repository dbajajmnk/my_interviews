# Error Boundaries / Failure Isolation

## Desired Behavior

```text
Shell
 ├── Header ✓
 ├── Catalog ✗ → fallback
 └── Cart ✓
```

## Patterns

- framework error boundary
- runtime load fallback
- remote timeout
- graceful degraded UI
- retry only safe asset loads

## Rule

One MFE failure should not blank the whole page whenever feasible.
