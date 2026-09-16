# Agent Streaming — Interview Q&A

## 1. What is agent streaming?

Incremental delivery of model and runtime events during an agent run.

## 2. Token streaming vs semantic streaming?

Token streaming exposes text deltas; semantic streaming exposes tools, handoffs, state/progress, approvals, errors, and completion.

## 3. SSE vs WebSocket?

SSE is simpler for server-to-client streams; WebSocket is better when true bidirectional low-latency interaction is required.

## 4. Why event IDs?

For deduplication, ordering, resume, and replay.

## 5. What is backpressure?

A slow consumer cannot keep up with event production; use bounded buffering/throttling/reactive flow control.

## 6. How do you handle client disconnect?

Decouple run lifecycle from connection lifecycle, persist run state, and support reconnect where needed.

## 7. Why isn't the last token the end?

Post-processing, session persistence, approvals, usage accounting, or runtime finalization may still be running.

## 8. How do you cancel safely?

Propagate cancellation to runtime/tools and define immediate vs safe-boundary semantics.

## 9. How do approvals interact with streaming?

The stream reaches an interruption state, approval is resolved, then the run resumes.

## 10. How do you test streaming?

Use deterministic event sequences and assert order, error, cancellation, reconnect, and terminal state behavior.

## 11. What should the frontend consume?

Normalized semantic UI events rather than provider-native raw wire events.

## 12. What should be persisted?

Run state, sequence/event IDs where resume matters, approvals, and final result metadata.

## 13. One-line principle?

> Stream execution semantics, not just tokens.
