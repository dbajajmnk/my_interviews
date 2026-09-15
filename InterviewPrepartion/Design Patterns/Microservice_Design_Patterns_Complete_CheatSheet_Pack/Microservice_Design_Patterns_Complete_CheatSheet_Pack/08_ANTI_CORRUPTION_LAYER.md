# Anti-Corruption Layer

## Intent
Protect a new domain model from legacy/external semantics.

## Visual
```text
New Service
 ↓
ACL / Translator
 ↓
Legacy System
```

## Use
- legacy migration
- third-party integration
- mismatched domain models

## Trap
ACL is translation/isolation—not a new centralized business layer.
