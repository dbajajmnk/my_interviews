# Agent Context Management — System Design Questions

## Q1 — Design Context for a Support Agent

Use:
- runtime user/tenant identity;
- session conversation state;
- authorized CRM/customer context;
- KB retrieval;
- selected memory;
- context trimming.

## Q2 — Design Multi-Tenant Memory

Partition by:
```text
tenant → user → memory namespace
```
Enforce authorization on every read/write and test cross-tenant isolation.

## Q3 — Design Long Conversation Handling

Use:
- recent-turn window;
- summary/compaction;
- critical-fact store;
- retrieval of older context when needed.

## Q4 — Design Multi-Agent Handoff Context

Transfer:
- objective;
- selected facts;
- current status;
- unresolved work;
- provenance.

Do not transfer unrelated confidential history.

## Q5 — Design Durable Context for HITL

Persist:
- run/thread state;
- approval request;
- relevant context references;
- schema/version;
- safe resumable metadata.

## Answer Framework

**Context types → source → authorization → selection → token budget → persistence → freshness → security → observability.**
