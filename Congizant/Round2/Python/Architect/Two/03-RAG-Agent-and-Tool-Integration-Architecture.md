# ARCH-02 / File 03 — RAG, Agent & Tool Integration Architecture

**Priority:** P0  
**Suggested Time:** 80 minutes

---

# 1. Objective

Master:

- combining RAG and agents;
- retrieval as a tool/capability;
- deterministic workflow vs agent orchestration;
- tool registry;
- state/checkpoint;
- human approval;
- long-running AI jobs;
- architecture boundaries.

---

# 2. 5W+H

## What?

AI-enabled architecture may combine retrieval, LLM generation, deterministic APIs, and tools in one controlled workflow.

## Why?

Real enterprise tasks often require both knowledge and action.

## Where?

Support, operations, enterprise search, workflow automation.

## When?

When user goal spans knowledge retrieval and controlled system interactions.

## How?

Use RAG for knowledge, tools for actions, deterministic policy for control, agent only for dynamic sequencing.

---

# 3. Real-Life Analogy

RAG is the library.

Tools are the hands.

The agent is the coordinator deciding which reference or action is needed.

Security is the access-control desk.

---

# 4. Visualization

```text
User
 ↓
Python AI API
 ↓
Orchestrator
 ├── RAG Retriever
 ├── LLM
 ├── Tool Registry
 ├── State / Checkpoint
 ├── Policy Engine
 └── Approval Service
      ↓
Enterprise Systems
```

---

# 5. Mind Map

```text
AI Orchestration
│
├── RAG
├── Model
├── Tools
├── Agent
├── Workflow
├── State
├── Policy
├── Approval
└── Audit
```

---

# 6. Core Concepts

## 6.1 RAG and Agent Are Different

RAG:

> retrieve knowledge.

Agent:

> choose/sequence actions.

Agent may use RAG as one tool.

Do not call every RAG chatbot an agent.

---

## 6.2 Workflow First

Known process:

```text
retrieve
→ summarize
→ validate
→ save draft
```

Use deterministic workflow.

Unknown next action based on observation:

> agent may help.

---

## 6.3 Tool Registry

Each tool:

```text
name
description
input schema
output schema
risk level
authorization rule
timeout
idempotency behavior
```

---

## 6.4 State / Checkpoint

Need for:

- multi-step task;
- human approval;
- crash recovery;
- long-running job.

---

## 6.5 Long-Running AI Work

Use:

```text
POST /jobs
→ queue
→ worker/orchestrator
→ status store
→ GET /jobs/{id}
```

Do not keep a 10-minute HTTP request open unnecessarily.

---

## 6.6 Human Approval

High-risk action:

```text
agent proposes
→ approval state
→ human reviews
→ deterministic executor
```

---

# 7. Engineering Depth

## 7.1 Retrieval as Tool

Agent tool:

```text
search_policy(query, tenant)
```

But policy layer still injects tenant identity; model should not freely choose tenant.

---

## 7.2 Side-Effect Separation

Read tools and write tools should be distinct.

Example:

```text
get_order_status
create_refund_proposal
execute_refund
```

This enables stronger controls.

---

## 7.3 Avoid Agent-in-Agent Complexity

Nested agents create:

- hard traces;
- unpredictable cost;
- difficult security;
- complex evaluation.

Use modular workflows first.

---

# 8. Implementation / Design

```text
User Question
→ Intent / Goal
→ RAG Search if knowledge needed
→ Tool Calls if system data needed
→ Draft/Decision
→ Human Approval if high risk
→ Execute
→ Audit
```

---

# 9. Hands-On Practice

Design support flow:

- read policy;
- check order;
- propose refund;
- human approve > threshold;
- execute refund.

Separate retrieval vs action.

---

# 10. Google Interview Drill

## Problem — Enterprise IT Assistant

Capabilities:

- answer troubleshooting questions;
- inspect service health;
- create incident ticket;
- propose restart.

### Clarify

- restart approval?
- tenant/team RBAC?
- audit?
- tool failures?
- long investigations?

### Architecture

```text
React
→ Python AI API
→ Orchestrator
   ├── RAG KB
   ├── Metrics Tool
   ├── Ticket Tool
   ├── Restart Proposal Tool
   ├── Policy
   └── Approval
```

### Critical Boundary

Model can propose restart.

Model cannot authorize restart.

### Follow-Up

If investigation exceeds 30 sec, use async job/checkpoint.

---

# 11. Common Mistakes

1. RAG = agent.
2. Agent used for fixed flow.
3. Write tools too broad.
4. Tenant chosen by model.
5. No checkpoint.
6. Approval embedded only in prompt.
7. Long job in request thread.
8. Nested agents by default.

---

# 12. Best Practices

- RAG for knowledge;
- tools for system access;
- agent only for dynamic decisions;
- policy outside model;
- read/write tool separation;
- checkpoint long tasks;
- human approval for risky actions.

---

# 13. Interview Questions

1. How combine RAG and agents?
2. Is RAG an agent?
3. When use workflow?
4. What belongs in tool registry?
5. How handle long agent job?
6. Why separate read/write tools?
7. Where enforce tenant scope?
8. How handle human approval?

---

# 14. Google-Level Follow-Ups

1. tool times out?
2. RAG returns malicious text?
3. duplicate side effect?
4. user cancels?
5. approval expires?
6. worker crashes?
7. tool schema changes?
8. agent version changes mid-run?

---

# 15. Quick Revision

```text
RAG = knowledge
Tools = actions/data access
Agent = dynamic orchestration
Workflow = known sequence
Policy = deterministic
Approval = before risky action
Checkpoint = long-running safety
```

---

# 16. Readiness Gate

- [ ] RAG vs agent.
- [ ] Workflow first.
- [ ] Tool registry.
- [ ] State/checkpoint.
- [ ] Approval boundary.
- [ ] IT-assistant drill.

**Gate:** READY / REPAIR

---

# 17. References

- RAG/agent orchestration architecture references
