# Eventual Consistency

## Intent
Accept temporary divergence between distributed components.

```text
Payment succeeds at t1
Order read model updates at t2
```

## Design
Define acceptable inconsistency window.

## Trap
Eventual consistency is a business UX decision as much as a technical one.
