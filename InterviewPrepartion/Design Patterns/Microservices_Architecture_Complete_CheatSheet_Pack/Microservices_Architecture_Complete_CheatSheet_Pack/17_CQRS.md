# CQRS

## What

Command Query Responsibility Segregation.

Separate:

```text
Write Model
and
Read Model
```

## Visual

```text
Command → Write Service → Write DB
                      ↓ events
Query   → Read Service  → Read DB / Projection
```

## Why

- read/write scaling differences
- optimized read models
- complex domains
- event-driven integration

## Cost

- eventual consistency
- more infrastructure
- model synchronization

## Trap

CQRS does not require Event Sourcing.
