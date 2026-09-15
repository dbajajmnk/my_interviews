# Backend for Frontend (BFF)

## What

A dedicated backend tailored to a client type.

```text
Web App → Web BFF
Mobile  → Mobile BFF
Partner → Partner BFF
```

## Why

Different clients need different:

```text
payloads
aggregation
security
latency behavior
```

## Trap

Do not duplicate core domain logic across BFFs.
