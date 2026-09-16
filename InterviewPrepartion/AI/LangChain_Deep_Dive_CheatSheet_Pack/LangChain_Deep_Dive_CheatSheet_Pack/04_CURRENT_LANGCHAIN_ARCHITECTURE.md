# Current LangChain Architecture

## Architecture

```text
User / API
   │
   ▼
LangChain create_agent
   │
   ▼
LangGraph Runtime
   ├─ Model Node
   ├─ Tool Node
   ├─ Middleware Hooks
   ├─ Agent State
   ├─ Checkpointer
   ├─ Store
   └─ Streaming
```

## Three Context Sources

A useful current distinction:

1. **Runtime Context** — static per-invocation configuration/dependencies.
2. **State** — mutable thread-scoped short-term memory.
3. **Store** — long-term memory across threads/sessions.

## Why This Matters

Many older LangChain answers focus mostly on Chains and prompt pipelines.

For current agent interviews, emphasize **agents + runtime + middleware + context engineering + state/store**.
