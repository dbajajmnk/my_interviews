# Bulkhead

## Analogy

A ship uses compartments so one leak does not sink everything.

## Software

Separate resource pools:

```text
Payment calls → Pool A
Search calls  → Pool B
```

## Goal

Failure isolation.

## Trap

Too many bulkheads increase complexity and waste capacity.
