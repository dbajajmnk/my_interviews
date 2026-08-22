# AI-03 / File 07 — Production Agentic System Design & Architect Scenarios

**Priority:** P0  
**Suggested Time:** 75 minutes

---

# 1. Objective

Integrate AI-03 into production architecture:

- React + Python + agent service;
- state/checkpoints;
- tools;
- policies;
- approval;
- evaluation;
- observability;
- scaling;
- failure handling;
- deployment/versioning.

---

# 2. 5W+H

## What?

A production agentic system is an orchestrated application where models can make bounded decisions while deterministic software controls permissions, state, budgets, and side effects.

## Why?

Autonomy without control is operational and security risk.

## Where?

Enterprise copilots, support automation, coding assistants, operations.

## When?

When task genuinely benefits from dynamic multi-step action selection.

## How?

Model-driven decisions inside deterministic guardrails.

---

# 3. Real-Life Analogy

A modern aircraft can use autopilot, but:

- flight envelope;
- permissions;
- instruments;
- alarms;
- human override;

remain deterministic safety systems.

---

# 4. Visualization

```text
React / Client
     ↓
Python API
     ↓
Agent Orchestrator
├── State / Checkpoint
├── Planner / Router
├── Tool Registry
├── Authorization Policy
├── Budget / Termination
├── Human Approval
└── Output Validator
     ↓
Tools / Systems
├── Search
├── CRM
├── Ticketing
├── DB APIs
└── Other services

Cross-cutting:
traces + eval + audit + metrics + cost
```

---

# 5. Mind Map

```text
Production Agent
│
├── API
├── Orchestrator
├── State
├── Tools
├── Policy
├── Approval
├── Evaluation
├── Observability
├── Scale
└── Rollback
```

---

# 6. Core Concepts

## 6.1 Orchestrator

Owns:

- run lifecycle;
- state;
- model invocation;
- tool dispatch;
- budgets;
- termination;
- checkpointing.

Do not let model own infrastructure lifecycle.

---

## 6.2 Tool Registry

Each tool defines:

```text
name
schema
risk level
authorization rule
timeout
idempotency behavior
handler
```

---

## 6.3 State Store

Need durable store for:

- long runs;
- approvals;
- retry/resume;
- audit.

Short synchronous requests may keep state in memory, but production design must account for process failure and scaling.

---

## 6.4 Human Approval Service

Approval request should be durable and linked to agent run/action.

State:

```text
WAITING_APPROVAL
```

not blocked in an in-memory thread for hours.

---

## 6.5 Scaling

Separate:

- API concurrency;
- agent worker concurrency;
- model quota;
- tool/downstream quota.

Queue long runs.

---

## 6.6 Versioning

Record:

```text
model
prompt
tool schema
policy
agent graph/workflow
evaluation set
```

A run should be reproducible enough to diagnose behavior.

---

# 7. Engineering Depth

## 7.1 Graceful Degradation

If model unavailable:

- queue;
- human fallback;
- deterministic workflow;
- partial functionality.

If one tool unavailable:

- alternative tool;
- skip if optional;
- terminate safely.

---

## 7.2 Multi-Agent Deployment

Before splitting into many agents ask:

- separate permission boundary?
- independent scaling?
- independent evaluation?
- specialized model/tool set?

Otherwise one orchestrator with modular tools may be simpler.

---

## 7.3 Rollout

Use:

```text
offline eval
→ shadow
→ canary
→ limited tenants
→ monitor
→ expand
```

with rollback.

---

# 8. Implementation / Design

Logical architecture:

```text
Client
→ API
→ Agent Run Service
→ Queue (for long runs)
→ Agent Worker
   ├── Model Adapter
   ├── Tool Executor
   ├── Policy Engine
   └── Checkpoint Store
→ Result / Approval API
```

---

# 9. Hands-On Practice

Design a safe agent for:

> production incident assistant that may inspect metrics/logs and propose a restart.

Rule:

- read tools automatic;
- restart proposal requires approval;
- arbitrary shell unavailable.

---

# 10. Google Interview Drill

## Problem — Design Enterprise Operations Copilot

Requirements:

- engineers ask natural-language questions;
- agent can inspect logs, metrics, deployments;
- may propose restart/rollback;
- production actions require approval;
- all activity auditable;
- 500 concurrent users.

### Clarify

- supported systems?
- RBAC?
- action risk?
- run duration?
- data sensitivity?
- model provider?
- SLO?

### Architecture

```text
React
→ Python API
→ Identity/RBAC
→ Agent Orchestrator
   ├── state/checkpoint
   ├── read-only diagnostic tools
   ├── change-action tools
   ├── policy
   └── budget
→ Human Approval
→ Tool Executor
```

### Security

- least privilege;
- no arbitrary shell;
- resource-scoped authorization;
- approval before change;
- audit.

### Reliability

- max steps;
- timeouts;
- retries;
- queue/checkpoint;
- model/tool fallback.

### Evaluation

- incident diagnosis accuracy;
- unsafe-action rate;
- correct tool selection;
- average steps;
- time-to-recommendation;
- cost.

### Follow-Up

How would you gradually automate low-risk actions?

Use evidence-based policy tiers after measured success.

---

# 11. Common Mistakes

1. Agent gets production admin credentials.
2. Arbitrary shell tool.
3. Approval handled only in chat text.
4. State lost on restart.
5. No model/tool versioning.
6. Multi-agent for show.
7. No evaluation gate.
8. No rollback/canary.

---

# 12. Best Practices

- orchestrator owns lifecycle;
- policy owns permissions;
- queue/checkpoint long runs;
- durable approvals;
- tool-specific risk rules;
- trace/evaluate every run;
- staged rollout;
- automate incrementally based on evidence.

---

# 13. Interview Questions

1. Design production agent architecture.
2. Where store state?
3. How handle approvals?
4. How scale?
5. How version agent?
6. How roll out model changes?
7. What if tool fails?
8. What if model fails?
9. How audit?
10. When multi-agent?

---

# 14. Google-Level Follow-Ups

1. approval after 2 hours?
2. worker restarts?
3. duplicate queue message?
4. model provider outage?
5. one tenant spikes traffic?
6. canary metrics?
7. policy change mid-run?
8. regional restrictions?
9. rollback action?
10. agent learns wrong memory?

---

# 15. Quick Revision

```text
Production agent =
orchestrator
+ explicit state
+ narrow tools
+ deterministic policy
+ budget/termination
+ human approval
+ evaluation
+ traces/audit

Autonomy stays inside controlled boundaries.
```

---

# 16. Readiness Gate

- [ ] Orchestrator.
- [ ] Tool registry.
- [ ] State/checkpoint.
- [ ] Approval.
- [ ] Scaling.
- [ ] Versioning.
- [ ] Rollout.
- [ ] Operations-copilot drill.

**Gate:** READY / REPAIR

---

# 17. References

- Production agentic architecture references
- Distributed workflow and security references
