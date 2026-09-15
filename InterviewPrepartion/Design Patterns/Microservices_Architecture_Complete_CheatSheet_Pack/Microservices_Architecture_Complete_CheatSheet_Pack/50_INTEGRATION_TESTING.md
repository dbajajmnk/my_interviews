# Integration Testing

## Test Real Boundaries

Examples:

```text
database
broker
cache
HTTP client
schema
serialization
```

## Prefer

Ephemeral realistic dependencies where practical.

## Trap

Mocking every dependency can hide real integration failures.
