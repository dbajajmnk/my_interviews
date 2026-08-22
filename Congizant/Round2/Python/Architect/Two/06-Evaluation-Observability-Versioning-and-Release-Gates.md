# ARCH-02 / File 06 — Evaluation, Observability, Versioning & Release Gates

**Priority:** P0  
**Suggested Time:** 75 minutes

---

# 1. Objective

Master:

- offline evaluation;
- online evaluation;
- golden datasets;
- AI traces;
- model/prompt/index/tool versioning;
- canary;
- shadow;
- rollback;
- quality gates;
- AI incident diagnosis.

---

# 2. 5W+H

## What?

AI release engineering ensures changes are measured, traceable, reversible, and safe.

## Why?

Model/provider behavior can change even when application code does not.

## Where?

Prompt, model, RAG, agent, tools, policies, retrieval.

## When?

Before and after every meaningful AI change.

## How?

Version → evaluate → shadow/canary → observe → promote or rollback.

---

# 3. Real-Life Analogy

You do not replace an aircraft engine across the entire fleet without testing, controlled rollout, and rollback planning.

AI changes deserve the same discipline.

---

# 4. Visualization

```text
Change
 ↓
Offline Eval
 ↓
Shadow / Staging
 ↓
Canary
 ↓
Online Metrics
 ↓
Promote
   or
Rollback
```

---

# 5. Mind Map

```text
AI Release
│
├── Golden Set
├── Offline Eval
├── Online Eval
├── Traces
├── Versioning
├── Shadow
├── Canary
├── Gate
└── Rollback
```

---

# 6. Core Concepts

## 6.1 Version Everything Important

Record:

```text
model
provider
prompt
embedding model
index
chunking
reranker
agent graph
tool schema
policy
```

---

## 6.2 Offline Evaluation

Run representative dataset before deployment.

Measure task-specific metrics.

---

## 6.3 Online Evaluation

Track:

- task success;
- user feedback;
- escalation;
- groundedness;
- tool errors;
- latency;
- cost;
- policy violations.

---

## 6.4 Shadow

Send production-like traffic to new version without affecting user outcome.

Useful for:

- model comparison;
- latency/cost;
- retrieval changes.

Need privacy/governance approval.

---

## 6.5 Canary

Route small percentage/tenants to new version.

Compare:

- quality;
- latency;
- safety;
- cost.

---

## 6.6 Release Gate

Example:

```text
No security critical regression
Groundedness >= baseline - tolerance
Task success >= target
p95 latency <= threshold
Cost/request <= budget
```

---

## 6.7 Rollback

Keep old:

- prompt;
- model config;
- index version;
- routing policy;

available long enough to restore quickly.

---

## 6.8 AI Trace

Trace:

```text
request
→ retrieval
→ context
→ model
→ tool
→ validation
→ final
```

Store versions and safe metadata.

---

# 7. Engineering Depth

## 7.1 Model Provider Upgrade

Never assume newest model is automatically better.

Evaluate:

- target tasks;
- safety;
- structured output;
- tool behavior;
- latency;
- cost.

---

## 7.2 RAG Index Upgrade

Build:

```text
v2 index in parallel
→ evaluate
→ canary
→ switch
→ retain v1 for rollback
```

---

## 7.3 Critical Regression Set

Some cases are pass/fail gates:

- no cross-tenant data;
- no unauthorized tool;
- no dangerous action without approval.

Average score cannot compensate for critical security failure.

---

# 8. Implementation / Design

Version metadata:

```json
{
  "model": "model-v3",
  "prompt": "support-v12",
  "index": "kb-2026-08-v4",
  "policy": "tool-policy-v7"
}
```

---

# 9. Hands-On Practice

Define release gate for RAG assistant:

- Recall@5;
- groundedness;
- citation correctness;
- p95 latency;
- cost/query;
- cross-tenant tests.

---

# 10. Google Interview Drill

## Problem — New Model Improves Quality 5% but Cost 2× and p95 Latency 1.8×

### Clarify

- high-value task?
- usage volume?
- quality gain on which slices?
- critical safety changes?
- cheaper routing option?

### First Approach

Upgrade globally because quality is better.

Incomplete.

### Improve

- route complex tasks to new model;
- retain smaller model for simple tasks;
- canary;
- compare business outcome;
- set budget.

### Follow-Up

If high-value legal summarization, quality may justify cost; for ticket classification, likely not.

---

# 11. Common Mistakes

1. No version metadata.
2. Newest model assumed best.
3. Global rollout immediately.
4. Average metric hides security failure.
5. No rollback.
6. Shadow traffic without privacy review.
7. Prompt change not evaluated.
8. Index migration destructive.

---

# 12. Best Practices

- version AI artifacts;
- maintain golden set;
- critical safety gates;
- staged rollout;
- monitor online;
- rollback ready;
- compare quality + latency + cost together.

---

# 13. Interview Questions

1. How release AI changes?
2. What should be versioned?
3. Offline vs online evaluation?
4. Shadow vs canary?
5. How define release gate?
6. How rollback RAG?
7. How evaluate model upgrade?
8. What is critical regression set?

---

# 14. Google-Level Follow-Ups

1. provider silently updates model?
2. index schema migration?
3. user feedback conflicts with offline metrics?
4. canary small sample?
5. rollback after data migration?
6. prompt hotfix?
7. cost spike after release?
8. regional model differences?

---

# 15. Quick Revision

```text
Version everything
Evaluate before rollout
Shadow/canary progressively
Quality + latency + cost + safety
Critical failures cannot hide in averages
Rollback must be prepared
```

---

# 16. Readiness Gate

- [ ] Versioning.
- [ ] Offline/online eval.
- [ ] Shadow/canary.
- [ ] Release gates.
- [ ] Rollback.
- [ ] Model-upgrade drill.

**Gate:** READY / REPAIR

---

# 17. References

- Software release engineering
- AI evaluation and observability references
