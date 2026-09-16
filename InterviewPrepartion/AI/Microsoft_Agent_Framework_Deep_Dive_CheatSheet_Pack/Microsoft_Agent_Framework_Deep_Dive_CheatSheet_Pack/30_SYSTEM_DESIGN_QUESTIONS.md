# Microsoft Agent Framework — System Design Questions

## Q1 — Design an Enterprise Support Agent

```text
API/Auth
 ↓
Support Agent
 ├─ Context Provider → CRM profile + KB
 ├─ Function Tool → Order service
 ├─ Function Tool → Ticket service
 ├─ Middleware → policy/logging
 └─ AgentSession → conversation state
```

## Q2 — Design a Multi-Agent Case Workflow

```text
Workflow
 ↓
Triage Executor
 ↓
Sequential / Handoff orchestration
 ├─ Billing Agent
 ├─ Technical Agent
 └─ Compliance Agent
 ↓
Human approval if needed
 ↓
Finalizer
```

## Q3 — Design Cross-Company Agent Collaboration

Use A2A:
- discovery/agent cards;
- remote agent call;
- auth;
- timeout/retry;
- distributed tracing;
- versioning;
- remote state ownership.

## Q4 — Design Long-Running Research Agent

Use Agent Harness with:
- session;
- planning/todos;
- context compaction;
- memory;
- bounded looping;
- approvals;
- observability.

## Q5 — Design Durable Human-Approved Workflow

Use:
- explicit workflow;
- checkpoint store;
- request/response HITL;
- idempotent side effects;
- audit;
- resume semantics.

## Answer Framework

**Agent vs workflow → provider → tools → session/context → middleware → orchestration → persistence → HITL → A2A → observability → security.**
