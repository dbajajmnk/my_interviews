# AI-01 / File 06 — Architect Scenarios & Production AI Decisions

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M21 Architecture + Emerging AI Layer

---

# 1. Objective

Integrate AI-01 into architect-level decisions:

- when to use LLM;
- build vs buy;
- model routing;
- privacy;
- cost;
- latency;
- fallback;
- deterministic boundaries;
- evaluation;
- full-stack integration.

---

# 2. 5W+H

## What?

AI architecture is the disciplined placement of probabilistic models inside deterministic software systems.

## Why?

Model capability alone does not create a reliable product.

## Where?

Enterprise assistants, document workflows, copilots, automation.

## When?

Whenever AI affects business flow.

## How?

Put models behind clear contracts and surround them with deterministic controls.

---

# 3. Real-Life Analogy

The LLM is a powerful specialist consultant.

The architect still defines:

- what decisions the consultant may make;
- which data they can access;
- how advice is checked;
- what happens when they are unavailable.

---

# 4. Visualization

```text
User / React
     ↓
Python API
     ↓
Deterministic Controls
├── Auth
├── Validation
├── Policy
├── Data Access
└── Budget
     ↓
LLM / AI Capability
     ↓
Output Validation
     ↓
Business Workflow
```

---

# 5. Mind Map

```text
AI Architecture
│
├── Use Case Fit
├── Model Choice
├── Deterministic Boundary
├── Data Boundary
├── Cost
├── Latency
├── Evaluation
├── Fallback
└── Observability
```

---

# 6. Core Concepts

## 6.1 AI as Component, Not Whole System

Strong architecture:

```text
deterministic app
+ AI capability
+ validation
+ data systems
+ observability
```

Weak architecture:

```text
user input → LLM → whatever it says happens
```

---

## 6.2 Build vs Buy

Hosted provider:

- faster start;
- managed scale;
- vendor dependency;
- external data boundary.

Self-host/local:

- more control;
- operational burden;
- hardware/capacity;
- model quality trade-offs.

Decision depends on requirements.

---

## 6.3 Model Routing

Potential:

```text
small model → classification
stronger model → complex synthesis
```

Need evaluation and operational simplicity.

Do not add router because it sounds advanced.

---

## 6.4 Deterministic Guardrails

Examples:

- enum validation;
- permission checks;
- rules;
- policy engine;
- schema validation;
- code sandbox;
- DB constraints.

Guardrails outside model are often more reliable than asking model to guard itself.

---

## 6.5 Data Access

Model should see only authorized data.

For enterprise AI:

```text
User Identity
→ Tenant
→ ACL
→ Retrieved Data
→ LLM
```

Never retrieve globally and ask prompt to “please ignore unauthorized documents.”

---

## 6.6 Failure Modes

Plan for:

- provider timeout;
- 429;
- malformed structured output;
- hallucination;
- safety refusal;
- unavailable model;
- cost spike.

---

# 7. Engineering Depth

## 7.1 SLA/SLO

AI feature may need:

- time-to-first-token;
- total latency;
- success rate;
- grounded answer rate;
- cost/request.

Traditional uptime alone is insufficient.

---

## 7.2 Feature Degradation

If model unavailable:

Possible:

- retry later;
- fallback provider;
- return search results without synthesis;
- disable AI explanation;
- queue job.

Choose product-specific graceful degradation.

---

# 8. Implementation / Design

```text
React
 ↓
Python API
 ├── auth
 ├── quota
 ├── validation
 ├── prompt/context builder
 ├── model adapter
 ├── output validator
 └── metrics
       ↓
     LLM
```

---

# 9. Hands-On Practice

Decide architecture for:

1. customer email drafting;
2. payroll calculation;
3. document Q&A;
4. ticket classification;
5. auto-execution of shell commands.

Explain where human/deterministic control is required.

---

# 10. Google Interview Drill

## Problem — Design Enterprise AI Support Assistant

Requirements:

- React frontend;
- Python backend;
- company support knowledge;
- customer PII;
- 5-second target for initial response;
- must not reveal another customer's data.

### Clarify

- current support source?
- tenant/customer ACL?
- chat history?
- provider privacy?
- human escalation?
- volume/cost?

### First Design

```text
React → LLM API directly
```

Reject: secret/security/governance issues.

### Improve

```text
React
 ↓
Python API
 ├── identity + authorization
 ├── input validation
 ├── retrieval/data access
 ├── model call
 ├── output validation
 └── observability
```

### Controls

- backend-owned provider key;
- customer-scoped data;
- prompt injection awareness;
- citations where appropriate;
- timeout;
- cost quota;
- fallback/handoff.

### Edge Cases

- customer requests another customer's account;
- provider down;
- PII accidentally appears in logs;
- malicious retrieved content;
- outdated support article.

### Defend

The LLM is not the security boundary.

---

# 11. Common Mistakes

1. LLM placed at center of every decision.
2. AI directly accesses unrestricted data.
3. Prompt used as authorization.
4. Build/self-host chosen from hype.
5. No evaluation before model routing.
6. No graceful degradation.
7. No cost controls.
8. No AI-specific SLOs.

---

# 12. Best Practices

- deterministic security boundaries;
- minimum data access;
- model behind backend;
- evaluate before routing/upgrade;
- define fallback;
- meter cost;
- observe AI quality and latency;
- keep architecture simple.

---

# 13. Interview Questions

1. How place LLM in enterprise architecture?
2. Build vs buy?
3. How protect PII?
4. How avoid vendor lock-in?
5. What belongs outside model?
6. How handle provider outage?
7. What AI SLOs?
8. How model-route?
9. How enforce tenant isolation?
10. How degrade gracefully?

---

# 14. Google-Level Follow-Ups

1. provider stores prompts?
2. region restriction?
3. model quality drops after upgrade?
4. cost spike?
5. 10x traffic?
6. legal hold?
7. human escalation?
8. auditability?

---

# 15. Quick Revision

```text
LLM is one component
Security/authorization stay deterministic
Backend owns secrets/policy
Minimum authorized data only
Evaluate models/prompts
Define AI SLOs: quality + latency + cost
Plan fallback/degradation
```

---

# 16. Readiness Gate

- [ ] Use-case fit.
- [ ] Build vs buy.
- [ ] Deterministic boundary.
- [ ] Data/PII boundary.
- [ ] Failure/fallback.
- [ ] AI SLOs.
- [ ] Support-assistant drill.

**Gate:** READY / REPAIR

---

# 17. References

- Enterprise AI architecture references
- OWASP LLM application guidance
