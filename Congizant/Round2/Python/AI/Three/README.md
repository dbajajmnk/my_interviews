# GOJ Interview Preparation — Cognizant
## Area 04 — AI
### AI-03 — Agents, Evaluation & Production AI

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** Emerging AI Layer + M16 AI-Generated Code Evaluation + M19 API Engineering + M20 Performance/Security + M21 Architecture + M22 Production Engineering + M23 Senior Engineering Scenarios  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” It focuses on durable agentic-AI and production-AI concepts rather than vendor-specific frameworks.

---

# 1. Pack Objective

AI-03 prepares you to design, evaluate, secure, observe, and defend agentic and production AI systems.

By the end of this pack you should be able to:

- explain workflow vs agent vs tool-calling system;
- decide when an agent is justified and when deterministic orchestration is better;
- design tool/function calling with strict schemas and deterministic authorization;
- manage state, memory, conversation context, and checkpoints;
- design single-agent and multi-agent patterns without unnecessary complexity;
- explain planning, routing, delegation, and human approval;
- protect tools from prompt injection, excessive permissions, unsafe parameters, and irreversible actions;
- evaluate agent success using task-level, tool-level, safety, latency, and cost metrics;
- design offline and online evaluation;
- trace agent executions end to end;
- control loops, retries, budgets, concurrency, and model/tool failures;
- design production AI rollouts, versioning, canaries, fallback, and rollback;
- reason about AI-generated code/action evaluation;
- survive architect-level AI scenarios with Evidence First / No Bluff.

Target:

> **Goal → Plan → Select Tool → Authorize → Execute → Observe → Validate → Continue / Stop → Evaluate → Improve**

---

# 2. Directory Structure

```text
GOJ-Cognizant-AI-03-Final/
│
├── README.md
├── 01-Agent-Fundamentals-Workflows-and-Tool-Calling.md
├── 02-Agent-State-Memory-Planning-Routing-and-Multi-Agent-Patterns.md
├── 03-Tool-Security-Guardrails-Human-Approval-and-Safe-Actions.md
├── 04-Agent-and-LLM-Evaluation-Offline-Online-and-Golden-Datasets.md
├── 05-Production-AI-Observability-Cost-Latency-Reliability-and-Debugging.md
├── 06-AI-Generated-Code-and-Action-Evaluation.md
├── 07-Production-Agentic-System-Design-and-Architect-Scenarios.md
└── 08-AI-03-Final-Readiness-Assessment.md
```

KIS rule:

- start with deterministic workflow;
- add agent autonomy only where dynamic reasoning/tool selection creates measurable value;
- no multi-agent system unless one agent/workflow is insufficient;
- model output is never an authorization boundary;
- every agent loop requires termination and budget controls.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | Agent fundamentals, workflows, tool calling | 70 min |
| 02 | State, memory, planning, routing, multi-agent patterns | 75 min |
| 03 | Tool security, guardrails, human approval | 75 min |
| 04 | Agent/LLM evaluation | 80 min |
| 05 | Production observability, cost, reliability, debugging | 75 min |
| 06 | AI-generated code/action evaluation | 60 min |
| 07 | Production system design & architect scenarios | 75 min |
| 08 | Final readiness assessment | 60 min |
| **Total** |  | **~9 hr 30 min** |

Time rule:

> **Autonomy is a design choice, not a goal. Prefer the least autonomous system that reliably solves the problem.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Design → Test → Edge Cases → Cost / Risk → Trade-Off → Follow-Up → Defend**

---

# 5. Agentic AI Interview Standard

For every agent design question:

```text
1. Clarify business goal
2. Decide workflow vs agent
3. Define allowed tools/actions
4. Define deterministic authorization
5. Define state/memory requirements
6. Define planning/routing behavior
7. Define termination + budget
8. Define validation + human approval
9. Define failure/retry/rollback
10. Define evaluation criteria
11. Add traces/metrics/audit
12. Defend autonomy and trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| Agent / Workflow / Tool Fundamentals | 20% |
| State / Planning / Orchestration | 15% |
| Security / Guardrails / Human Approval | 20% |
| Evaluation & AI Quality | 15% |
| Production Reliability / Observability | 15% |
| Google Drill & Architect Defense | 15% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can reject unnecessary agent complexity;
- can secure tool execution deterministically;
- can define measurable evaluation;
- can stop runaway loops;
- can defend production rollout and failure handling.

---

# 7. AI-03 Completion Criteria

You must be able to:

- explain agent vs workflow;
- explain tool/function calling;
- design tool schemas;
- define state/memory boundaries;
- explain planning/routing/delegation;
- explain single vs multi-agent trade-offs;
- enforce least privilege;
- define human approval points;
- protect against prompt injection/tool misuse;
- create agent evaluation metrics;
- trace agent runs;
- control latency/cost/token/tool budgets;
- design retry/fallback/rollback;
- evaluate generated code/actions before execution;
- design production agentic architecture.

---

# 8. Next Pack

After AI-03:

> **Area 05 — Architecture / ARCH-01 Full-Stack System Design**
