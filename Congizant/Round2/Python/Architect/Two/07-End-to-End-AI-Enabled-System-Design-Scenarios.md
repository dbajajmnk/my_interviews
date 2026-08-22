# ARCH-02 / File 07 — End-to-End AI-Enabled System Design Scenarios

**Priority:** P0  
**Suggested Time:** 85 minutes

---

# 1. Objective

Practice complete AI-enabled architecture answers:

- React;
- Python backend;
- RAG;
- LLM;
- agents/tools;
- enterprise data;
- security;
- scale;
- evaluation;
- observability;
- rollout.

---

# 2. 5W+H

## What?

End-to-end AI architecture integrates deterministic application layers with AI capabilities in one coherent production design.

## Why?

Architect interviews test trade-offs across the whole stack.

## Where?

Enterprise assistants, copilots, AI workflow systems.

## When?

System-design and senior client scenarios.

## How?

Walk user journey and place AI only where needed.

---

# 3. Real-Life Analogy

A hospital uses specialists, labs, records, and approvals together.

No single specialist owns the whole patient-care system.

Likewise, an LLM is one specialized capability inside the product architecture.

---

# 4. Visualization

```text
React
 ↓
Gateway / Auth
 ↓
Python Application API
 ├── Deterministic Business Services
 ├── RAG Service
 ├── AI Orchestrator
 ├── Tool Policy / Executor
 └── Job Service
      ↓
Data / AI Systems
├── Relational DB
├── Object Storage
├── Vector/Search Index
├── Cache
├── Queue
└── Model Providers

Cross-cutting:
evaluation + observability + security + cost + versioning
```

---

# 5. Mind Map

```text
AI System Design
│
├── User Flow
├── Deterministic Core
├── RAG
├── Models
├── Tools
├── Data
├── Security
├── Reliability
├── Evaluation
└── Rollout
```

---

# 6. Core Design Sequence

For each scenario:

```text
1. Business goal
2. Functional requirements
3. NFRs
4. AI-fit decision
5. Deterministic/AI boundary
6. Data architecture
7. AI capability
8. Security
9. Scale/reliability
10. Evaluation
11. Observability
12. Rollout/fallback
```

---

# 7. Scenario A — Enterprise Knowledge Copilot

Requirements:

- enterprise documents;
- citations;
- role-based access;
- React + Python;
- 2k concurrent users.

Design:

```text
React
→ Python API
→ identity/ACL
→ hybrid RAG
→ reranker
→ context
→ LLM
→ citation validation
→ stream
```

Production:

- tenant-aware cache;
- bounded model concurrency;
- versioned indexes;
- offline eval;
- freshness SLO.

---

# 8. Scenario B — AI Support Assistant with Actions

Capabilities:

- answer policy;
- get order status;
- create ticket;
- propose refund.

Architecture:

```text
RAG → policy knowledge
Tool → order status
Tool → create ticket
Refund → deterministic eligibility + approval
```

Agent may coordinate dynamically, but refund authorization stays deterministic.

---

# 9. Scenario C — AI Code Review Service

Input:

- pull request;
- code diff;
- repository context.

Architecture:

```text
Git/CI
→ Code Review Service
→ static analysis
→ targeted repo context
→ LLM review
→ structured findings
→ validation/dedup
→ PR comments
```

Do not let LLM replace:

- compiler;
- tests;
- SAST;
- dependency scanning.

---

# 10. Google Interview Drill

## Problem — Design Enterprise AI Development Copilot

Requirements:

- React UI;
- Python backend;
- developers ask code questions;
- internal repositories;
- RAG over docs/code;
- generate code suggestions;
- optionally create PR draft;
- no autonomous production deployment;
- 5k developers;
- source code confidential.

### Clarify

- repository permissions?
- provider data policy?
- supported languages?
- latency?
- PR integration?
- audit?
- region?

### Architecture

```text
React
→ Python AI API
→ Identity/RBAC
→ Repository Connector
→ Permission-Aware RAG
→ Model Adapter
→ Structured Response
→ Code Validation Layer
→ Optional PR Draft Tool
```

### Security

- repo ACL before retrieval;
- no unrestricted repo dump;
- provider approved for source code;
- secrets redaction;
- PR creation tool scoped;
- no deploy tool.

### Quality

- compile/lint/test suggested code in sandbox where possible;
- static analysis;
- golden evaluation set;
- human developer review.

### Scale

- cache embeddings;
- incremental indexing;
- bounded model concurrency;
- queue long indexing jobs.

### Observability

- model/prompt/index version;
- latency;
- token cost;
- code acceptance rate;
- security findings;
- false-positive rate.

### Follow-Up

If later enabling auto-merge:

> introduce risk tier, policy gate, required tests, code-owner approval, canary, rollback.

---

# 11. Common Mistakes

1. LLM directly accesses all repositories.
2. Model replaces compiler/tests.
3. Agent can deploy production immediately.
4. No evaluation.
5. No code sandbox/validation.
6. No permission-aware RAG.
7. Provider confidentiality ignored.
8. No rollout strategy.

---

# 12. Best Practices

- deterministic controls around AI;
- permission-aware retrieval;
- sandbox generated code;
- human review for meaningful code changes;
- version/evaluate;
- scale indexing and inference separately;
- expose only necessary tools.

---

# 13. Interview Questions

1. Design AI-enabled full-stack platform.
2. How combine React/Python/RAG?
3. How secure source code?
4. How validate generated code?
5. How scale model calls?
6. How version prompts/indexes?
7. How evaluate developer copilot?
8. How add safe actions later?

---

# 14. Google-Level Follow-Ups

1. 50k developers?
2. multi-region source code?
3. private repo changes?
4. model outage?
5. generated vulnerable dependency?
6. PR tool abused?
7. acceptance metric gaming?
8. local model requirement?
9. audit request?
10. provider breach?

---

# 15. Quick Revision

```text
Full-stack AI:
React
→ Python control plane
→ deterministic business/security
→ RAG/model/tools
→ validation
→ user/action

Evaluation + security + observability are not optional add-ons.
```

---

# 16. Readiness Gate

- [ ] Full-stack AI architecture.
- [ ] RAG/model/tool boundary.
- [ ] Code-validation boundary.
- [ ] Security.
- [ ] Scale.
- [ ] Evaluation/rollout.
- [ ] Development-copilot drill.

**Gate:** READY / REPAIR

---

# 17. References

- Enterprise AI architecture
- Secure SDLC and AI-assisted development references
