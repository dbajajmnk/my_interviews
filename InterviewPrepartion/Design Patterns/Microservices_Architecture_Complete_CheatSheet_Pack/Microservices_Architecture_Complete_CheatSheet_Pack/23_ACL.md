# Anti-Corruption Layer

## What

Protects a new domain model from legacy/external models.

```text
New Service
  ↓
ACL / Adapter
  ↓
Legacy System
```

## Responsibilities

- translation
- mapping
- protocol adaptation
- semantic isolation

## Trap

An ACL should isolate external semantics, not become a giant integration platform.
