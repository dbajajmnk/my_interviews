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
