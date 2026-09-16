# Context, State, and Memory Contracts

## RunContext

RunContext may carry:
- run ID;
- user/tenant identity;
- deadline;
- locale;
- trace context;
- request metadata.

## State Contract

StateStore tracks execution state.

Possible operations:
```text
load(runId)
save(runId, state)
checkpoint(runId)
resume(runId)
```

## Memory Contract

MemoryProvider should be separate from StateStore.

Possible operations:
```text
recall(query)
remember(item)
forget(key)
```

## Why Separation Matters

State is operational execution data.

Memory is retained knowledge/context with different:
- retention;
- privacy;
- lifecycle;
- security;
- relevance rules.
