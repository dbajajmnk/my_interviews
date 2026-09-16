# LangChain — 30-Second Recall

## Recall

```text
LangChain = agent API + model/tool integrations + middleware + runtime abstractions

create_agent(...)
   ↓
LangGraph runtime
   ├─ model
   ├─ tools
   ├─ middleware
   ├─ state/checkpointer
   ├─ store
   └─ streaming
```

## 30-Second Interview Answer

> LangChain is an open-source framework for building LLM and agent applications. In the current architecture, `create_agent` gives a production-oriented agent abstraction built on LangGraph. I use LangChain for model/tool integration and agent composition, middleware for context and lifecycle customization, checkpointers for thread-scoped memory, stores for cross-session memory, and LangGraph directly when I need lower-level orchestration control.

## Do Not Forget

- `create_agent` is graph-based under the hood.
- Tools are callable capabilities with typed inputs/outputs.
- Short-term memory is thread-scoped state persisted via a checkpointer.
- Long-term memory uses a store across threads/sessions.
- Runtime context is static invocation-scoped configuration/dependencies.
- Middleware is the main extension point for context engineering and lifecycle behavior.
