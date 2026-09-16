# Agent Streaming — 30-Second Recall

## Recall

```text
Agent Streaming =
tokens
+ tool events
+ handoffs
+ state/progress
+ approval events
+ errors
+ final completion
```

## 30-Second Interview Answer

> In an agent system, streaming should expose semantic execution events, not only token deltas. I separate raw model events from higher-level events such as tool started/completed, agent changed, approval required, progress update, error, and run completed. I then deliver those through SSE, WebSocket, AsyncIterable, or a reactive stream while handling cancellation, backpressure, reconnection, persistence, and finalization correctly.

## Do Not Forget

- Last visible token does not always mean run is complete.
- Tool and approval events matter as much as text.
- Client disconnect must not silently corrupt business execution.
- Cancellation must propagate through the runtime and tools.
- Resume needs event IDs/checkpoints or durable run state.
