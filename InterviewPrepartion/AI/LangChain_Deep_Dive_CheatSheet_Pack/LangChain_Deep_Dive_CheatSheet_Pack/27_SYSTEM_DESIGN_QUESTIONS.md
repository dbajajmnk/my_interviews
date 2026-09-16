# LangChain — System Design Questions

## Q1 — Design an Enterprise Support Agent

```text
API/Auth
 ↓
LangChain Agent
 ├─ KB Retriever
 ├─ Order Tool
 ├─ Ticket Tool
 ├─ Policy Middleware
 ├─ Checkpointer
 └─ LangSmith/Telemetry
```

Discuss tool security, PII, thread state, escalation, and evaluation.

## Q2 — Design Multi-Tenant Context

Use runtime context for:
- tenant;
- user identity;
- dependencies;
- permissions.

Use separate state/checkpointer namespaces and store namespaces for isolation.

## Q3 — Design Long-Running Conversation Memory

- thread state via checkpointer;
- message trimming/summarization;
- durable long-term store for selected memories;
- explicit retention/deletion.

## Q4 — Design Dynamic Model Routing

Use middleware/strategy to select models based on task, cost, latency, or policy. Keep capability checks and telemetry.

## Q5 — LangChain or LangGraph?

Use LangChain when prebuilt agent behavior is enough. Use LangGraph directly when workflow state, branching, human checkpoints, or deterministic control must be modeled explicitly.

## Answer Framework

**Requirements → agent boundary → tools → context/state/store → middleware → security → streaming → observability → evaluation → failure handling.**
