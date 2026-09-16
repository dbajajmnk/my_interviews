# State and Short-Term Memory

## Definition

Short-term memory is thread-scoped and stored as part of agent state.

## Persistence

A checkpointer persists state so a conversation/thread can resume later.

## Mental Model

```text
thread_id
   ↓
Checkpointer
   ↓
Agent State
   ├─ messages
   ├─ tool results
   └─ custom fields
```

## Production

Use a durable database-backed checkpointer rather than an in-memory one for production workloads.

## Key Distinction

**State/checkpointer = thread-level short-term memory.**
