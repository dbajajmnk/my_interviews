# Agent Streaming — One-Page Final Cheat Sheet

## Formula

```text
Agent Streaming =
Tokens
+ Tools
+ Handoffs
+ Progress
+ Approvals
+ Errors
+ Completion
```

## Key Distinctions

- raw event = provider-native
- semantic event = runtime normalized
- SSE = server → client
- WebSocket = bidirectional
- stream != trace
- last token != guaranteed final run completion

## Production Rules

1. Use stable event envelopes.
2. Include run/event/sequence IDs.
3. Persist long-running run state.
4. Separate connection lifecycle from run lifecycle.
5. Support cancellation deliberately.
6. Handle duplicate/reordered events.
7. Apply backpressure.
8. Redact sensitive tool/model data.
9. Resume from checkpoints/cursors where needed.
10. Mark complete only after finalization.

## 30-Second Answer

> I design agent streaming as a semantic event channel, not a raw token pipe. The runtime emits model deltas, tool events, handoffs, progress, approvals, errors, and terminal state through SSE, WebSocket, or an SDK async stream. For production I add sequence IDs, durable run state, reconnection, backpressure, cancellation propagation, security filtering, and explicit finalization so a lost client connection does not corrupt the business workflow.
