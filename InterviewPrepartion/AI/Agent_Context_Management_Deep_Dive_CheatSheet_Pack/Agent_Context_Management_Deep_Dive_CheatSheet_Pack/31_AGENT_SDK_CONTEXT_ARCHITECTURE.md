# Agent SDK — Context Architecture

## Recommended Interfaces

```text
RunContext
ContextBuilder
ConversationStore
StateStore
MemoryStore
Retriever
ContextPolicy
ContextReducer
ContextRedactor
```

## Pipeline

```text
Sources
 ↓
ContextBuilder
 ↓
Policy/filter
 ↓
Ranking
 ↓
Reduction
 ↓
Redaction
 ↓
ModelContext
```

## Developer Experience

SDK consumers should be able to:
- pass typed runtime context;
- plug custom memory/retrieval;
- inspect what context was selected;
- test context assembly deterministically.

## Rule

Keep local runtime context and model-visible context as separate types/contracts.
