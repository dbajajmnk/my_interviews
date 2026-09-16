# LangGraph — 60-Second Recall

## Formula

```text
LangGraph = State + Nodes + Edges + Reducers + Routing + Persistence + Interrupts
```

## 60-Second Answer

> LangGraph is useful when control flow and state must be explicit. Nodes transform state, edges define flow, reducers merge concurrent updates, conditional routing drives decisions, and persistence/checkpoints support durable resume. I use it when workflows need loops, branching, HITL, retries, or explicit orchestration.

## Recall Points

- Explicit state.
- Conditional routing.
- Checkpoint/resume.
- Idempotent side effects.
