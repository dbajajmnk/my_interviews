# API / Event Versioning

## Prefer

Backward-compatible evolution.

Examples:

```text
add optional field
add new endpoint
introduce new event version
```

## Avoid

Breaking every consumer with coordinated upgrades.

## Events

Treat event schemas as long-lived public contracts.

## Trap

Internal services still need compatibility discipline.
