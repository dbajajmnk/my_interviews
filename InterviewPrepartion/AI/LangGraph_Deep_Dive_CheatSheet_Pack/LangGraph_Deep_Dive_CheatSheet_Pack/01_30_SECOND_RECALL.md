# LangGraph — 30-Second Recall

## Recall

```text
LangGraph =
StateGraph
+ Nodes
+ Edges
+ Shared State
+ Reducers
+ Persistence
+ Interrupts
+ Streaming
+ Durable Execution
```

## 30-Second Interview Answer

> LangGraph is a low-level orchestration framework for building stateful, long-running agents and workflows. I define a StateGraph with typed shared state, nodes that return partial state updates, and edges that determine control flow. I use checkpointers for durable state, interrupts for human-in-the-loop, Command for update-plus-routing, Send for dynamic fan-out, and streaming for runtime visibility.

## Key Distinctions

- `StateGraph` = builder.
- `compile()` = executable graph.
- node = function operating on shared state.
- edge = control-flow transition.
- reducer = merges concurrent state updates.
- checkpointer = durable thread state.
- `Command` = update state + route.
- `Send` = dynamic fan-out with custom state.
- `interrupt()` = pause and resume.
