# Agent Streaming Architecture — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Agent Streaming Architecture — Master Index

## Purpose

This pack covers streaming as the real-time delivery and observability layer of agent systems.

Interview focus:
- token vs semantic vs workflow streaming;
- SSE, WebSocket, async iterables, reactive streams;
- agent event models;
- tool-call events;
- handoff events;
- progress events;
- cancellation;
- backpressure;
- resumability;
- client disconnects;
- HITL pauses;
- session persistence;
- streaming structured output;
- observability;
- OpenAI Agents SDK;
- Microsoft Agent Framework;
- LangChain/LangGraph conceptual mapping;
- production architecture.

## Master Mental Model

```text
User Request
    ↓
Agent Runtime
    │
    ├─ model token events
    ├─ tool lifecycle events
    ├─ handoff events
    ├─ state/progress events
    ├─ approval interrupts
    └─ final result
    ↓
Streaming Transport
    ├─ SSE
    ├─ WebSocket
    ├─ AsyncIterable
    └─ Reactive Stream
    ↓
Client / UI / Telemetry
```

## Core Principle

> Streaming is not just token delivery. In agent systems, the useful stream is a semantic event stream representing model output, tools, handoffs, state changes, approvals, errors, and final completion.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AGENT_STREAMING.md`
3. `03_TOKEN_STREAMING_VS_AGENT_EVENT_STREAMING.md`
4. `04_STREAMING_EVENT_MODEL.md`
5. `05_RAW_VS_SEMANTIC_EVENTS.md`
6. `06_SSE_VS_WEBSOCKET_VS_ASYNC_ITERABLE.md`
7. `07_STREAMING_LIFECYCLE.md`
8. `08_TOOL_CALL_STREAMING.md`
9. `09_HANDOFF_AND_MULTI_AGENT_STREAMING.md`
10. `10_PROGRESS_AND_CUSTOM_EVENTS.md`
11. `11_STREAMING_STRUCTURED_OUTPUT.md`
12. `12_STREAMING_WITH_HITL.md`
13. `13_CANCELLATION_AND_ABORT.md`
14. `14_CLIENT_DISCONNECT_AND_RUN_LIFECYCLE.md`
15. `15_BACKPRESSURE_AND_FLOW_CONTROL.md`
16. `16_RECONNECTION_AND_RESUME.md`
17. `17_SESSION_PERSISTENCE_AND_FINALIZATION.md`
18. `18_STREAMING_ERRORS_AND_PARTIAL_FAILURES.md`
19. `19_ORDERING_IDEMPOTENCY_AND_DUPLICATES.md`
20. `20_STREAMING_SECURITY.md`
21. `21_OBSERVABILITY_AND_TRACING.md`
22. `22_OPENAI_AGENTS_SDK_STREAMING.md`
23. `23_MICROSOFT_AGENT_FRAMEWORK_STREAMING.md`
24. `24_LANGCHAIN_LANGGRAPH_STREAMING.md`
25. `25_FRONTEND_STREAMING_PATTERNS.md`
26. `26_BACKEND_API_STREAMING_PATTERNS.md`
27. `27_PRODUCTION_ARCHITECTURE.md`
28. `28_TESTING_STREAMING_SYSTEMS.md`
29. `29_PERFORMANCE_LATENCY_AND_COST.md`
30. `30_INTERVIEW_QUESTIONS.md`
31. `31_SYSTEM_DESIGN_QUESTIONS.md`
32. `32_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core:** 01 → 10  
**Reliability:** 11 → 21  
**Frameworks + implementation:** 22 → 29  
**Interview mode:** 30 → 32


---

<!-- Source: 01_30_SECOND_RECALL.md -->
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


---

<!-- Source: 02_WHAT_IS_AGENT_STREAMING.md -->
# What Is Agent Streaming?

## Definition

Agent streaming is incremental delivery of execution events while an agent run is still in progress.

## Possible Events

- token/text delta;
- model response lifecycle;
- tool requested;
- tool started;
- tool completed;
- handoff;
- state update;
- custom progress;
- approval required;
- error;
- final result.

## Why

Streaming improves:
- perceived latency;
- user trust;
- long-running task visibility;
- operational debugging;
- interactive approvals.

## Rule

Do not equate streaming with “print tokens as they arrive.” Agent streaming is a workflow/event concern.


---

<!-- Source: 03_TOKEN_STREAMING_VS_AGENT_EVENT_STREAMING.md -->
# Token Streaming vs Agent Event Streaming

## Token Streaming

Incremental model output:
```text
"H"
"He"
"Hel"
"Hello"
```

## Agent Event Streaming

Semantic runtime events:
```text
RunStarted
ToolCalled
ToolCompleted
AgentChanged
MessageDelta
ApprovalRequired
RunCompleted
```

## Why Semantic Events Win

Token streaming helps UX. Semantic events help:
- orchestration;
- debugging;
- UI progress;
- approval;
- audit;
- telemetry.

## Interview Point

> Token streaming is one event type inside a broader agent event stream.


---

<!-- Source: 04_STREAMING_EVENT_MODEL.md -->
# Streaming Event Model

## Recommended Envelope

```json
{
  "event_id": "evt_123",
  "run_id": "run_456",
  "type": "tool.completed",
  "timestamp": "2026-09-16T10:00:00Z",
  "sequence": 17,
  "data": {}
}
```

## Core Fields

- event_id
- run_id
- type
- sequence
- timestamp
- payload/data
- optional agent/tool identifiers

## Why Sequence Matters

Useful for:
- ordering;
- deduplication;
- resume;
- replay.


---

<!-- Source: 05_RAW_VS_SEMANTIC_EVENTS.md -->
# Raw vs Semantic Events

## Raw Events

Provider-native events:
- token deltas;
- response lifecycle;
- low-level wire events.

## Semantic Events

Application/runtime normalized events:
- message completed;
- tool started/completed;
- agent changed;
- approval required.

## Design Rule

Expose semantic events to most application consumers. Keep raw events available for advanced diagnostics or highly custom UIs.

## Reason

Provider-native event shapes can change or differ across models/providers.


---

<!-- Source: 06_SSE_VS_WEBSOCKET_VS_ASYNC_ITERABLE.md -->
# SSE vs WebSocket vs AsyncIterable

## SSE

Good for server → client event streams over HTTP.

Advantages:
- simple;
- browser friendly;
- reconnect support;
- works well for chat/progress.

## WebSocket

Good when bidirectional low-latency communication is important.

Use cases:
- voice/realtime;
- client interrupts;
- collaborative interactions.

## AsyncIterable

Excellent in application SDKs:
```text
async for event in stream:
    ...
```

## Reactive Streams

Useful in Java/.NET ecosystems for:
- backpressure;
- composition;
- asynchronous pipelines.

## Selection Rule

Use transport based on interaction model, not framework fashion.


---

<!-- Source: 07_STREAMING_LIFECYCLE.md -->
# Streaming Lifecycle

## Lifecycle

```text
RunCreated
 ↓
RunStarted
 ↓
Events...
 ↓
Final model/tool step
 ↓
Post-processing
 ↓
Persistence/finalization
 ↓
RunCompleted
```

## Important

The run can still be finalizing after the final visible text delta.

## Consumers

Client code should wait for a terminal run event/state before assuming:
- session persistence is done;
- approvals are finalized;
- final result metadata is stable.


---

<!-- Source: 08_TOOL_CALL_STREAMING.md -->
# Tool Call Streaming

## Useful Tool Events

- tool.requested
- tool.started
- tool.progress
- tool.completed
- tool.failed

## UI Example

```text
Searching customer...
Found customer.
Checking order...
Order found.
Generating answer...
```

## Rule

Do not expose sensitive raw tool arguments/results blindly to end users.


---

<!-- Source: 09_HANDOFF_AND_MULTI_AGENT_STREAMING.md -->
# Handoff and Multi-Agent Streaming

## Events

- handoff.requested
- handoff.completed
- agent.changed

## Why

Multi-agent systems need to communicate who currently owns the task.

## UI

Show meaningful progress such as:
```text
Triage Agent → Billing Specialist
```
when it helps users understand the workflow.

## Observability

Always include agent identity in traces/events for handoff debugging.


---

<!-- Source: 10_PROGRESS_AND_CUSTOM_EVENTS.md -->
# Progress and Custom Events

## Purpose

Long-running tools/workflows benefit from explicit progress events.

## Examples

- 3/10 documents processed;
- report section completed;
- indexing complete;
- waiting for approval.

## Rule

Emit business-meaningful progress, not arbitrary internal noise.

## Custom Event

```json
{
  "type": "progress",
  "data": {
    "phase": "document_analysis",
    "completed": 3,
    "total": 10
  }
}
```


---

<!-- Source: 11_STREAMING_STRUCTURED_OUTPUT.md -->
# Streaming Structured Output

## Challenge

Partial structured data may not yet be valid or complete.

## Approaches

- stream text/progress, validate final object;
- stream field-level semantic events;
- aggregate then deserialize.

## Rule

Do not execute irreversible business actions from partial structured output.


---

<!-- Source: 12_STREAMING_WITH_HITL.md -->
# Streaming with Human-in-the-Loop

## Flow

```text
Run streaming
   ↓
ApprovalRequired
   ↓
stream pauses/settles
   ↓
Human approves/rejects
   ↓
run resumes
   ↓
stream continues
```

## Important

Approval is a workflow state, not a new unrelated user turn.

## Design

Persist:
- run state;
- interruption ID;
- requested action;
- approval decision;
- resume token/checkpoint.


---

<!-- Source: 13_CANCELLATION_AND_ABORT.md -->
# Cancellation and Abort

## Cancellation

Cancellation should propagate:
```text
Client
 ↓
API
 ↓
Agent runtime
 ↓
model/tool/retrieval calls
```

## Modes

Possible semantics:
- immediate cancel;
- cancel after current turn;
- cancel after current safe boundary.

## Rule

Define cancellation semantics explicitly; do not leave them accidental.


---

<!-- Source: 14_CLIENT_DISCONNECT_AND_RUN_LIFECYCLE.md -->
# Client Disconnect and Run Lifecycle

## Problem

Browser/network may disconnect while the agent continues processing.

## Questions

Should disconnect:
- cancel the run?
- leave run active?
- pause?
- persist and allow reconnect?

## Enterprise Pattern

For business workflows, decouple:
```text
client connection lifecycle
from
business run lifecycle
```

## Rule

A dropped browser tab should not accidentally cancel an approved financial workflow unless that is explicitly intended.


---

<!-- Source: 15_BACKPRESSURE_AND_FLOW_CONTROL.md -->
# Backpressure and Flow Control

## Problem

Producer can emit events faster than consumer can process them.

## Controls

- bounded buffers;
- batching;
- throttling;
- dropping low-value events;
- reactive backpressure;
- slow-consumer disconnect policy.

## Rule

Never let debug-level token/event volume exhaust server memory.


---

<!-- Source: 16_RECONNECTION_AND_RESUME.md -->
# Reconnection and Resume

## Resume Requirements

Useful mechanisms:
- event IDs;
- sequence numbers;
- durable run ID;
- checkpoint;
- cursor/continuation token.

## SSE Pattern

Clients can reconnect with the last processed event ID and request missing events if the server retains/replays them.

## Long-Running Pattern

For long-running runs, persist execution state independently of the stream connection.


---

<!-- Source: 17_SESSION_PERSISTENCE_AND_FINALIZATION.md -->
# Session Persistence and Finalization

## Issue

Final visible text can arrive before:
- session write;
- state compaction;
- audit persistence;
- approval bookkeeping;
- final usage accounting.

## Rule

Only mark the run complete after runtime finalization succeeds.

## UI

Separate:
- “answer text finished”
from
- “run completed”
when the distinction matters.


---

<!-- Source: 18_STREAMING_ERRORS_AND_PARTIAL_FAILURES.md -->
# Streaming Errors and Partial Failures

## Failure Points

- model stream breaks;
- tool fails;
- network disconnects;
- client stops consuming;
- downstream store fails.

## Error Event

Emit normalized terminal error metadata where possible.

## Rule

A partially displayed answer does not mean the run succeeded.

## Recovery

Use:
- reconnect;
- resume;
- retry at safe boundary;
- fallback final message.


---

<!-- Source: 19_ORDERING_IDEMPOTENCY_AND_DUPLICATES.md -->
# Ordering, Idempotency and Duplicates

## Why

Reconnect/replay can cause event duplication.

## Controls

- event_id;
- sequence;
- dedupe cache;
- idempotent client handlers.

## Ordering

If concurrent tools emit events, define whether ordering is:
- global;
- per-run;
- per-tool/span.

## Rule

Design streaming consumers to tolerate duplicate delivery.


---

<!-- Source: 20_STREAMING_SECURITY.md -->
# Streaming Security

## Risks

- leaking tool arguments;
- leaking hidden system details;
- PII in partial output;
- unauthorized progress events;
- cross-tenant run subscriptions.

## Controls

- authenticated run subscription;
- tenant/run ownership check;
- event filtering;
- redaction;
- secure transport;
- bounded retention.

## Rule

Authorization applies to the stream channel as much as to the initial request.


---

<!-- Source: 21_OBSERVABILITY_AND_TRACING.md -->
# Observability and Tracing

## Trace vs Stream

Stream = runtime delivery to consumers.  
Trace = durable observability record.

## Correlate

Use:
- run_id;
- trace_id;
- span_id;
- event_id;
- tool_call_id;
- agent_id.

## Rule

Do not depend on the frontend stream as your only operational record.


---

<!-- Source: 22_OPENAI_AGENTS_SDK_STREAMING.md -->
# OpenAI Agents SDK Streaming

## Current Python API

Current OpenAI Agents SDK documentation uses:
- `Runner.run_streamed(...)`
- `RunResultStreaming`
- `result.stream_events()`

## Event Levels

The SDK exposes:
- raw response events;
- higher-level run-item events;
- agent-updated events.

## Important Completion Detail

The streaming run is not complete until the async event iterator finishes. Post-processing such as session persistence or approval bookkeeping may continue after the last visible token.

## Approvals

If a tool approval interruption occurs:
- drain the stream;
- inspect interruptions;
- convert to run state;
- approve/reject;
- resume with streaming.

## Cancellation

Current SDK supports cancellation, including stopping immediately or after the current turn.


---

<!-- Source: 23_MICROSOFT_AGENT_FRAMEWORK_STREAMING.md -->
# Microsoft Agent Framework Streaming

## Agent Streaming

Current .NET Agent Framework exposes `RunStreamingAsync(...)`, returning an asynchronous stream of `AgentResponseUpdate`.

## Workflow Streaming

Current workflow execution supports streaming event consumption.

C# conceptually:
```text
RunStreamingAsync(workflow, input)
 ↓
WatchStreamAsync()
 ↓
WorkflowEvent
```

## Workflow Events

Workflow events provide real-time observability into executor progress and workflow output.

## A2A

Remote A2A agents also support streaming updates and long-running/background-response patterns.

## Frontend Integration

Current AG-UI hosting can stream agent responses as protocol events over SSE.


---

<!-- Source: 24_LANGCHAIN_LANGGRAPH_STREAMING.md -->
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


---

<!-- Source: 25_FRONTEND_STREAMING_PATTERNS.md -->
# Frontend Streaming Patterns

## UI State

Model UI as explicit phases:
- connecting;
- thinking/processing;
- tool activity;
- waiting approval;
- streaming answer;
- completed;
- failed.

## Rendering

Avoid directly rendering every raw event. Map runtime events into stable UI events/view models.

## Cancellation

Provide a cancel button only if backend semantics are well defined.


---

<!-- Source: 26_BACKEND_API_STREAMING_PATTERNS.md -->
# Backend API Streaming Patterns

## SSE Endpoint

```text
POST /runs
 → returns run_id

GET /runs/{id}/events
 → SSE stream
```

## Alternative

Single-request streaming:
```text
POST /agent/stream
→ SSE/chunked stream
```

## Long-Running Enterprise Pattern

Prefer:
- create run;
- persist run;
- subscribe separately;
- reconnect by run ID.


---

<!-- Source: 27_PRODUCTION_ARCHITECTURE.md -->
# Agent Streaming — Production Architecture

## Reference Architecture

```text
Client
  │
API Gateway/Auth
  │
Run Service
  ├─ Agent Runtime
  ├─ Tool Services
  ├─ Session/Checkpoint Store
  └─ Event Publisher
          │
          ▼
      Event Buffer/Broker
          │
    ┌─────┼─────┐
    ▼     ▼     ▼
   SSE   WS   Telemetry
    │
  Client UI
```

## Production Checklist

- durable run ID;
- stable event envelope;
- event sequence;
- reconnect/resume;
- auth on subscriptions;
- backpressure;
- cancellation semantics;
- event retention;
- redaction;
- finalization state;
- telemetry.


---

<!-- Source: 28_TESTING_STREAMING_SYSTEMS.md -->
# Testing Streaming Systems

## Unit Tests

Test event mapping and reducers independently.

## Integration Tests

Test:
- token stream;
- tool events;
- handoff;
- approval pause/resume;
- cancellation;
- disconnect/reconnect;
- duplicate event handling;
- terminal error.

## Deterministic Testing

Use scripted/fake models with predefined event sequences.

## Rule

Test event order and terminal states, not only final text.


---

<!-- Source: 29_PERFORMANCE_LATENCY_AND_COST.md -->
# Performance, Latency and Cost

## Latency Metrics

Measure:
- time to first event;
- time to first token;
- time to first useful semantic event;
- tool latency;
- total completion time.

## Cost

Streaming does not inherently reduce model token cost, but it improves perceived latency and allows earlier user cancellation.

## Optimization

- reduce unnecessary low-level events;
- batch non-UI telemetry;
- use connection reuse where beneficial;
- cap buffer sizes.


---

<!-- Source: 30_INTERVIEW_QUESTIONS.md -->
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


---

<!-- Source: 31_SYSTEM_DESIGN_QUESTIONS.md -->
# Agent Streaming — System Design Questions

## Q1 — Design a Streaming Support Agent

Cover:
- SSE;
- semantic events;
- tool progress;
- run IDs;
- disconnect/reconnect;
- finalization.

## Q2 — Design Long-Running Research Agent

Use:
- durable run store;
- event broker;
- reconnect by run ID;
- progress events;
- checkpointing;
- cancellation.

## Q3 — Design HITL Streaming

Model:
```text
stream → approval event → pause → approve → resume stream
```
Persist interruption state.

## Q4 — Design Multi-Agent Streaming

Emit agent identity/handoff events and preserve one global run correlation ID.

## Q5 — Design Mobile Client on Unstable Network

Use resumable subscription with event sequence/cursor and avoid binding run lifetime to TCP connection.

## Answer Framework

**Event model → transport → ordering → persistence → reconnect → cancellation → backpressure → security → observability.**


---

<!-- Source: 32_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
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
