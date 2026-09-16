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
