# LangChain / LangGraph Streaming

## Conceptual Mapping

LangChain/LangGraph support the same core streaming concerns:
- message/token output;
- state updates;
- custom events;
- workflow/debug visibility.

## LangGraph-Oriented Mental Model

```text
Graph execution
 ├─ values/state
 ├─ updates
 ├─ messages
 ├─ custom events
 ├─ checkpoints
 ├─ tasks
 └─ debug
```

## Interview Positioning

> I separate user-facing token streaming from graph-state/event streaming. The former improves UX; the latter gives workflow visibility and operational control.
