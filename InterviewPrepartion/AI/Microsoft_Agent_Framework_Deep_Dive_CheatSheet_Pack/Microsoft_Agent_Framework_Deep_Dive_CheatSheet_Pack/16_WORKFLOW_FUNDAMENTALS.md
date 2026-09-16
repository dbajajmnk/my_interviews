# Workflow Fundamentals

## Definition

Workflows provide explicit, inspectable execution paths for coordinating code, agents, state, events, and human input.

## Graph Model

```text
Executor A
    │
   edge
    ▼
Executor B
    │
 condition
   /     \
  ▼       ▼
 C         D
```

## APIs

All current SDKs support graph-based workflows.

Python also has an experimental functional workflow API using native Python control flow.

## When to Prefer Workflow

Use workflows when:
- order must be explicit;
- branching must be deterministic;
- multiple components coordinate;
- checkpoints/recovery matter;
- HITL must be modeled.
