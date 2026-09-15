# Versioned Event

## Intent
Evolve event schema without breaking consumers.

## Strategies
```text
additive fields
schema version
new event type/version
upcasters
consumer compatibility
```

## Trap
Events are public contracts once multiple services depend on them.
