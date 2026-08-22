# ARCH-02 / File 01 — AI Architecture Principles & System Boundaries

**Priority:** P0  
**Suggested Time:** 65 minutes

---

# 1. Objective

Master:

- AI as a system capability;
- deterministic vs probabilistic boundaries;
- business invariants;
- AI placement;
- responsibility boundaries;
- risk-based architecture;
- prompt vs RAG vs fine-tuning vs agent selection.

---

# 2. 5W+H

## What?

AI architecture is the disciplined integration of probabilistic models into deterministic software systems.

## Why?

Models are powerful but:

- non-deterministic;
- fallible;
- costly;
- externally governed;
- sensitive to context and prompts.

## Where?

Enterprise applications, copilots, document assistants, automation, search, support systems.

## When?

When AI creates measurable value beyond deterministic software.

## How?

Keep critical controls deterministic and expose AI through narrow, observable, evaluated boundaries.

---

# 3. Real-Life Analogy

An LLM is like a specialist consultant.

The consultant may:

- analyze;
- recommend;
- draft;
- classify.

But company policy, identity, payments, permissions, and final irreversible actions still require deterministic control.

---

# 4. Visualization

```text
User
 ↓
Application / API
 ├── Identity
 ├── Authorization
 ├── Business Rules
 ├── Data Access
 └── Audit
      ↓
AI Capability Boundary
 ├── LLM
 ├── RAG
 ├── Agent
 └── Tool Calling
      ↓
Validation / Approval
      ↓
Business Outcome
```

---

# 5. Mind Map

```text
AI Architecture
│
├── Business Goal
├── Deterministic Core
├── AI Capability
├── Data Boundary
├── Tool Boundary
├── Evaluation
├── Security
└── Failure Strategy
```

---

# 6. Core Concepts

## 6.1 Deterministic Core

Keep exact invariants outside model:

```text
authorization
payment math
database constraints
workflow legality
tenant isolation
financial limits
```

AI may assist but should not own them by default.

---

## 6.2 AI Capability Boundary

Expose AI behind service interfaces:

```text
summarize()
classify()
retrieve_and_answer()
generate_draft()
propose_action()
```

This keeps application architecture testable.

---

## 6.3 Prompt vs RAG vs Fine-Tuning vs Agent

### Prompt
Use when task can be solved with instructions and provided context.

### RAG
Use when model needs external, changing, private, or citable knowledge.

### Fine-Tuning
Use when behavior/style/task mapping needs adaptation and prompting is insufficient.

### Agent
Use when next action must depend dynamically on intermediate observations/tools.

---

## 6.4 AI Is Not the Authorization Layer

Never:

```text
retrieve everything
→ ask model to hide unauthorized content
```

Always:

```text
identity
→ deterministic permission filter
→ AI sees only authorized data
```

---

## 6.5 AI Is Not Source of Truth

Source of truth remains:

- relational DB;
- approved documents;
- enterprise APIs;
- governed knowledge bases.

Model output is derived.

---

## 6.6 Risk-Based Autonomy

Low-risk:

- summarization;
- draft;
- classification.

Higher-risk:

- send email;
- change order;
- issue refund;
- deploy code;
- delete data.

Autonomy should reduce as consequence increases.

---

# 7. Engineering Depth

## 7.1 AI Architecture Decision Tree

```text
Can deterministic logic solve it?
 ├── yes → use code/rules
 └── no
      ↓
Need external current/private knowledge?
 ├── yes → RAG/tool
 └── no
      ↓
Need behavior adaptation?
 ├── yes → prompting/fine-tuning
      ↓
Need dynamic multi-step actions?
 ├── yes → controlled agent
 └── no → model call/workflow
```

---

## 7.2 AI Boundary Makes Replacement Possible

If AI capability is isolated, you can:

- swap providers;
- change model;
- disable feature;
- route to fallback;
- test with fake provider.

---

# 8. Implementation / Design

```python
class SupportAssistant:
    def __init__(self, retriever, model, policy):
        self.retriever = retriever
        self.model = model
        self.policy = policy
```

Business authorization belongs in policy/application layer, not model prompt.

---

# 9. Hands-On Practice

Choose approach:

1. exact tax calculation → deterministic code.
2. answer current policy → RAG.
3. classify tickets → prompt/model.
4. draft legal summary → model + review.
5. investigate issue using multiple tools → controlled agent.

---

# 10. Google Interview Drill

## Problem — AI-Powered Refund Assistant

Requirement:

> User asks for refund in natural language.

### Clarify

- refund policy?
- amount limit?
- irreversible?
- identity?
- fraud controls?
- human approval?

### First Design

User → LLM → payment API.

Unsafe.

### Improve

```text
User
→ Intent Extraction
→ Deterministic Eligibility Service
→ Refund Proposal
→ Approval if required
→ Payment Service
→ Audit
```

LLM helps interpret request and explain result.

### Follow-Up

For refunds below low threshold, automation may be allowed after measured evidence and policy.

---

# 11. Common Mistakes

1. AI owns business invariants.
2. LLM used because role says AI.
3. Prompt treated as security.
4. RAG/agent/fine-tuning selected by hype.
5. No graceful disable/fallback.
6. AI output treated as source of truth.
7. No autonomy risk levels.

---

# 12. Best Practices

- deterministic core first;
- narrow AI boundary;
- choose simplest AI technique;
- risk-based autonomy;
- validate outputs;
- design fallback;
- evaluate every major AI behavior change.

---

# 13. Interview Questions

1. Where should AI sit in enterprise architecture?
2. What stays deterministic?
3. Prompt vs RAG?
4. RAG vs fine-tuning?
5. Workflow vs agent?
6. How control AI autonomy?
7. Why AI is not source of truth?
8. How make AI replaceable?

---

# 14. Google-Level Follow-Ups

1. model unavailable?
2. legal/regulatory decision?
3. user overrides model?
4. provider changes behavior?
5. low-risk automation?
6. offline requirement?
7. strict audit?
8. deterministic fallback?

---

# 15. Quick Revision

```text
AI = capability inside deterministic system
Business invariants stay deterministic
Prompt → instruction
RAG → current/private knowledge
Fine-tune → behavior adaptation
Agent → dynamic multi-step actions
Autonomy follows risk
```

---

# 16. Readiness Gate

- [ ] Deterministic vs AI boundary.
- [ ] Technique selection.
- [ ] Source-of-truth rule.
- [ ] Risk-based autonomy.
- [ ] Refund drill.

**Gate:** READY / REPAIR

---

# 17. References

- Enterprise AI architecture and software architecture references
