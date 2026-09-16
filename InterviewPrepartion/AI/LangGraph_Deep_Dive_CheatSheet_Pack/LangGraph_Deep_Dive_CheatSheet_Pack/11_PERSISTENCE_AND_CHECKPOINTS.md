# Persistence and Checkpoints

## What

A checkpoint is a snapshot of graph state at a point in execution.

## Why

Checkpointing enables:
- resume;
- human-in-the-loop;
- state history;
- fault recovery;
- time travel;
- durable execution.

## Thread

A sequence of checkpoints is associated with a `thread_id`.

## Conceptual Example

```text
thread_id = customer-123

checkpoint 1
checkpoint 2
checkpoint 3
```

## Production Rule

Use durable checkpoint storage for production. In-memory savers are useful for development/tests.
