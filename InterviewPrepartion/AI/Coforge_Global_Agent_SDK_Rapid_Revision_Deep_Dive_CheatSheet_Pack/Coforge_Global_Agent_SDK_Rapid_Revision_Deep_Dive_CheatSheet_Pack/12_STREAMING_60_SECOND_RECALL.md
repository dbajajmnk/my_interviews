# Agent Streaming — 60-Second Recall

## Formula

```text
Streaming = Tokens + Tool Events + Progress + Approvals + Errors + Completion
```

## 60-Second Answer

> In an agent system I stream semantic execution events, not just model tokens. The public event model should include lifecycle, tool, approval, error, and terminal events. Cancellation, reconnect, duplicates, backpressure, and final completion semantics must be explicit.

## Recall Points

- Last token != run completion.
- Normalize provider events.
- Cancellation propagates.
- Separate run lifetime from connection lifetime.
