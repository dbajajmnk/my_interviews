# LangGraph — Interview Questions & Answers

## 1. What is LangGraph?

A low-level orchestration framework for long-running, stateful agents and workflows.

## 2. What is StateGraph?

A builder where nodes read shared state and return partial state updates.

## 3. Why compile the graph?

`StateGraph` is only a builder. Compilation creates the executable graph.

## 4. What are reducers?

Functions that define how concurrent updates to a state key are merged.

## 5. Conditional edge vs Command?

Conditional edges route externally based on state. Command lets a node return both state updates and control-flow instructions.

## 6. What is Send?

A primitive for dynamically invoking a node with custom state, useful for map-reduce and fan-out.

## 7. What is a checkpoint?

A persisted snapshot of graph state at a point in execution.

## 8. What is a thread?

A logical sequence of checkpoints identified by `thread_id`.

## 9. How does HITL work?

Use `interrupt()` to pause and `Command(resume=...)` to continue, with checkpointing enabled.

## 10. Why must interrupt-side effects be idempotent?

The interrupted node may restart from the beginning on resume.

## 11. What is durable execution?

Persisting workflow progress so execution can survive waits, failures, or restarts.

## 12. What stream modes matter?

Values, updates, messages, custom, checkpoints, tasks, and debug.

## 13. What are subgraphs?

Reusable/nested graphs used to isolate meaningful workflow boundaries.

## 14. Functional API vs Graph API?

Functional API uses entrypoint/tasks; Graph API models nodes/edges explicitly. Choose based on readability and control needs.

## 15. LangChain vs LangGraph?

LangChain is higher-level; LangGraph is lower-level orchestration and runtime control.

## 16. How do you handle parallel writes?

Use reducers appropriate to the state key and design deterministic aggregation.

## 17. How do retries work safely?

Retry transient failures only and protect side effects with idempotency.

## 18. How do you debug a bad graph run?

Inspect state history, node path, stream events, checkpoint sequence, tool/model traces, and error metadata.

## 19. What is time travel?

Using historical checkpoints to inspect, replay, or branch from earlier graph state.

## 20. One-line principle?

> Make control flow explicit, state durable, and side effects idempotent.
