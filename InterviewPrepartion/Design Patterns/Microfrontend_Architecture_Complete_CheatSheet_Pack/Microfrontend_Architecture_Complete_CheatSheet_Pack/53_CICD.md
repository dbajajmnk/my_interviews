# CI/CD

## Per MFE

```text
Commit
 ↓
Lint
 ↓
Unit / Component
 ↓
Security
 ↓
Contract
 ↓
Build
 ↓
Publish immutable asset
 ↓
Integration check
 ↓
Promote mapping/manifest
```

## Principle

Independent deployment should not require rebuilding unrelated MFEs.

## Trap

One central release train defeats a major microfrontend benefit.
