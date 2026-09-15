# Dependency Versioning

## Problem

MFEs may load different versions of:

```text
React
Angular
router
design system
auth utility
```

## Strategies

```text
singleton shared dependency
compatible range
import-map pinning
federated shared config
independent duplicate copy
```

## Rule

Choose one ownership model per dependency class.

## Trap

"Shared" dependency can become a runtime breaking contract.
