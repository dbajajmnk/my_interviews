# Strangler Fig Pattern

## Goal

Incrementally replace a monolith.

```text
Client
  ↓
Router / Gateway
  ├── old capability → Monolith
  └── migrated capability → New Service
```

Over time:

```text
Monolith shrinks
Services grow
```

## Benefits

- gradual migration
- lower risk
- continuous delivery

## Trap

Do not create permanent duplicated business logic.
