# GOJ Interview Preparation — Cognizant
## Area 05 — Architecture
### ARCH-02 — AI-Enabled Architecture

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M16 AI Evaluation + M18 Data Access + M19 API Engineering + M20 Performance/Security + M21 Architecture & Distributed Systems + M22 Production Engineering + M23 Senior Engineering Scenarios  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” AI fundamentals, RAG depth, and agent depth are already covered in AI-01/02/03; this pack focuses on architectural synthesis, boundaries, trade-offs, and production decisions.

---

# 1. Pack Objective

ARCH-02 converts AI knowledge into architecture-level decision making.

By the end of this pack you should be able to:

- decide where AI belongs in a full-stack enterprise system;
- separate deterministic core logic from probabilistic AI capability;
- define clean Python backend boundaries for models, RAG, tools, and agents;
- design model/provider abstraction without overengineering;
- design tenant-aware AI data flows;
- choose synchronous, streaming, asynchronous, and queued AI interaction patterns;
- design resilience around LLM/vector/tool providers;
- define AI-specific security boundaries and approval points;
- reason about privacy, prompt injection, model/tool permissions, and data governance;
- define evaluation gates for prompts, models, RAG, and agents;
- define AI observability, cost, latency, and quality SLOs;
- design rollout, canary, fallback, rollback, and versioning;
- defend AI architecture under client and interviewer follow-up pressure.

Target:

> **Business Goal → Deterministic Core → AI Capability → Data Boundary → Model/Tool Boundary → Evaluation → Security → Reliability → Cost → Observability → Rollout → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-ARCH-02-Final/
│
├── README.md
├── 01-AI-Architecture-Principles-and-System-Boundaries.md
├── 02-Model-Provider-Abstraction-Routing-and-Fallback.md
├── 03-RAG-Agent-and-Tool-Integration-Architecture.md
├── 04-AI-Security-Privacy-Governance-and-Trust-Boundaries.md
├── 05-AI-Scalability-Latency-Cost-and-Resilience-Architecture.md
├── 06-Evaluation-Observability-Versioning-and-Release-Gates.md
├── 07-End-to-End-AI-Enabled-System-Design-Scenarios.md
└── 08-ARCH-02-Final-Readiness-Assessment.md
```

KIS rule:

- AI is a capability, not the whole system;
- deterministic business invariants stay outside the model;
- provider abstraction is narrow and justified;
- do not add agents where a workflow is enough;
- do not add RAG where fixed context is enough;
- every AI component must have an evaluation and fallback story.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | AI architecture principles & boundaries | 65 min |
| 02 | Model/provider abstraction, routing, fallback | 70 min |
| 03 | RAG, agent, tool integration architecture | 80 min |
| 04 | Security, privacy, governance, trust boundaries | 75 min |
| 05 | Scale, latency, cost, resilience | 80 min |
| 06 | Evaluation, observability, versioning, release gates | 75 min |
| 07 | End-to-end architect scenarios | 85 min |
| 08 | Final readiness assessment | 60 min |
| **Total** |  | **~9 hr 50 min** |

Time rule:

> **Do not relearn AI theory here. Practice architecture decisions and trade-off defense.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Design → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Design → Identify Risk/Bottleneck → Improve → Test Failure → Evaluate → Trade-Off → Follow-Up → Defend**

---

# 5. AI Architecture Interview Standard

For every AI architecture problem:

```text
1. Clarify business goal
2. Ask whether AI is actually needed
3. Define deterministic vs probabilistic boundary
4. Define data/access boundary
5. Define model/RAG/agent capability
6. Define APIs and execution mode
7. Define safety/authorization controls
8. Define latency/cost/scale constraints
9. Define evaluation and observability
10. Define failure/fallback behavior
11. Define rollout/versioning
12. Defend alternatives and trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| AI Architecture Principles & Boundaries | 20% |
| Model / RAG / Agent Integration | 20% |
| Security / Governance / Trust | 15% |
| Scale / Cost / Reliability | 15% |
| Evaluation / Observability / Release | 15% |
| Google Drill & Architect Defense | 15% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can separate deterministic core from AI;
- can explain provider/data/tool boundaries;
- can define evaluation before rollout;
- can defend scale/security/cost trade-offs;
- can design graceful degradation.

---

# 7. ARCH-02 Completion Criteria

You must be able to:

- define AI architecture boundaries;
- choose prompt vs RAG vs fine-tuning vs agent;
- design provider abstraction;
- define model routing/fallback;
- design RAG and agent integration without duplicating responsibilities;
- enforce tenant/data/tool security;
- define human approval;
- design AI latency/cost budgets;
- define resilience and fallback;
- define offline/online evaluation;
- version prompts/models/indexes/tools;
- design canary/rollback;
- solve end-to-end AI system design.

---

# 8. Next Pack

After ARCH-02:

> **ARCH-03 — Security, Performance & Production**
