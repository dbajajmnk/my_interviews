# LangGraph — One-Page Final Cheat Sheet

## Formula

```text
LangGraph =
State
+ Nodes
+ Edges
+ Reducers
+ Routing
+ Persistence
+ Interrupts
+ Streaming
+ Durable Execution
```

## Core APIs

- `StateGraph`
- `START`
- `END`
- `add_node`
- `add_edge`
- `add_conditional_edges`
- `compile`
- `invoke / ainvoke`
- `stream / astream`
- `Command`
- `Send`
- `interrupt`

## Key Concepts

- StateGraph = builder
- Compiled graph = executable
- Reducer = merge state updates
- Checkpoint = persisted state snapshot
- Thread = checkpoint sequence
- Command = update + routing
- Send = dynamic fan-out
- Interrupt = pause/resume
- Store = broader long-term memory
- Subgraph = nested reusable workflow

## Production Rules

1. Persist state for long-running workflows.
2. Use explicit thread IDs.
3. Make side effects idempotent.
4. Bound retries and timeouts.
5. Use reducers for parallel state writes.
6. Model human approval with interrupts.
7. Stream meaningful execution events.
8. Keep auth/authz outside model reasoning.
9. Test paths, not only nodes.
10. Prefer the simplest graph that makes control flow clear.

## 30-Second Answer

> LangGraph gives me explicit control over a stateful agent workflow. I model shared state with a StateGraph, implement nodes as state transformations, connect them through edges and conditional routes, persist execution with checkpoints and threads, use Command and Send for dynamic control flow, interrupt/resume for human approval, and streaming plus tracing for runtime visibility.
