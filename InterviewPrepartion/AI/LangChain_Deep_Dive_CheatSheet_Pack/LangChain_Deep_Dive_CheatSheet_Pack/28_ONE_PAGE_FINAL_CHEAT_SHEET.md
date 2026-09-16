# LangChain — One-Page Final Cheat Sheet

## Formula

```text
LangChain Agent =
create_agent
+ Model
+ Tools
+ Middleware
+ State/Checkpointer
+ Store
+ Runtime Context
+ Structured Output
+ Streaming
```

## Key Distinctions

- LangChain = high-level framework
- LangGraph = low-level orchestration/runtime
- LangSmith = trace/evaluate/monitor
- State = mutable short-term thread data
- Checkpointer = state persistence
- Store = cross-thread long-term memory
- Runtime Context = static invocation dependencies/config
- Tool = callable capability
- Middleware = lifecycle/context extension point

## Production Rules

1. Do not hard-code provider assumptions.
2. Validate tool inputs.
3. Keep auth/authz outside the model.
4. Use durable checkpointers in production.
5. Separate short-term state from long-term memory.
6. Control context size.
7. Prefer structured output for downstream systems.
8. Stream progress for long-running agents.
9. Trace model/tool/retrieval steps.
10. Use LangGraph directly when orchestration complexity requires it.

## 30-Second Answer

> LangChain gives me a high-level agent framework over LangGraph. I use `create_agent` for the execution loop, tools for actions, middleware for lifecycle and context engineering, checkpointers for thread-scoped short-term memory, stores for cross-session memory, structured output for typed results, and LangSmith or equivalent telemetry for tracing and evaluation.
