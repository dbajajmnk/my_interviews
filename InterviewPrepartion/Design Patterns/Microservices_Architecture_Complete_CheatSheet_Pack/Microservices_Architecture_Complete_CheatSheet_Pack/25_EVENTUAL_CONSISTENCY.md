# Eventual Consistency

## What

Different services may temporarily observe different states.

## Example

```text
Payment succeeds at t1
Order projection updates at t2
```

Between t1 and t2:

```text
views differ
```

## Design Questions

- how long can inconsistency last?
- can users tolerate it?
- how is status communicated?
- what is the reconciliation path?

## Trap

Eventual consistency is a business decision, not only a technical one.
