# Distributed Locking

## Use Carefully

Needed when multiple nodes must coordinate exclusive work.

## Risks

- clock issues
- split brain
- lock expiry
- fencing
- network partitions

## Prefer

When possible:

```text
idempotency
database constraints
single-writer design
partition ownership
```

## Trap

A distributed lock without fencing can still allow stale owners to write.
