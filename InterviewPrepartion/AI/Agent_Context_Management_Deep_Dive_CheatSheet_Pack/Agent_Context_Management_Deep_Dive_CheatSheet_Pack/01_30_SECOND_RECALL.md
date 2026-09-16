# Agent Context Management — 30-Second Recall

## Recall

```text
Context =
what the model/runtime needs now

State =
what is changing during execution

Session =
conversation continuity

Memory =
what should survive for future use

Retrieval =
external knowledge brought in on demand

Runtime Context =
trusted app data/dependencies not automatically sent to model
```

## 30-Second Interview Answer

> I separate context into layers. Runtime context carries trusted application dependencies and identity; conversation state tracks the current thread; short-term memory preserves working context; long-term memory stores selected durable information; retrieval injects relevant external knowledge; and the context builder decides what the model actually sees for each call. I manage token budget, freshness, provenance, privacy, and tenant isolation before sending anything to the model.

## Do Not Forget

- More context is not always better.
- Runtime context may be local-only.
- State is not automatically memory.
- RAG is not the same as memory.
- Context should be relevant, fresh, authorized, and bounded.
- Secrets should not be placed in model-visible context.
