# OpenAI Agents SDK — System Design Questions

## Q1 — Design a Triage + Specialist System

```text
User
 ↓
Triage Agent
 ├─ handoff → Billing Agent
 ├─ handoff → Technical Agent
 └─ handoff → Sales Agent
```

Discuss handoff descriptions, session continuity, guardrails, tracing, and specialist tool permissions.

## Q2 — Manager with Specialist Agents

```text
Manager Agent
 ├─ Research Agent as tool
 ├─ Data Agent as tool
 └─ Writer Agent as tool
        ↓
Manager synthesizes
```

Use agent-as-tool because manager retains ownership.

## Q3 — Human-Approved Operations Agent

```text
Agent
 ↓
DeleteResourceTool
 ↓ approval required
Run interruption
 ↓
Human approve/reject
 ↓
Resume
```

Discuss durable storage for paused work, idempotency, and audit.

## Q4 — Multi-Tenant Enterprise Agent

Discuss:
- per-tenant context;
- identity propagation;
- separate sessions;
- tool scoping;
- rate limits;
- cost attribution;
- trace redaction;
- policy enforcement.

## Q5 — Realtime Support Agent

Discuss:
- RealtimeAgent/Runner/Session;
- audio/text events;
- function tools;
- approvals;
- session lifecycle;
- disconnect handling;
- observability.

## Answer Framework

**Agent → Runner → tools → delegation → guardrails → context/session → approvals → results/streaming → tracing → security → evaluation.**
