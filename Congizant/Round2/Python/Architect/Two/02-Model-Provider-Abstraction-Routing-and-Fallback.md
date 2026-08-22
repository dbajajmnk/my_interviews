# ARCH-02 / File 02 — Model / Provider Abstraction, Routing & Fallback

**Priority:** P0  
**Suggested Time:** 70 minutes

---

# 1. Objective

Master:

- provider abstraction;
- model adapters;
- capability-based interfaces;
- model routing;
- fallback;
- provider-specific features;
- configuration/versioning;
- avoiding vendor lock-in without lowest-common-denominator design.

---

# 2. 5W+H

## What?

A model/provider abstraction separates business capability from provider-specific API details.

## Why?

Models and providers change quickly.

## Where?

Backend AI service layer.

## When?

When multiple models/providers, migration, testing, or fallback are plausible.

## How?

Abstract stable capabilities and isolate provider-specific details in adapters.

---

# 3. Real-Life Analogy

A universal power adapter gives a common interface, but it should not pretend every country has identical electrical systems.

Abstraction should hide irrelevant differences, not useful capabilities.

---

# 4. Visualization

```text
Business Capability
       ↓
AI Service Interface
       ↓
Model Router
 ┌─────┼─────┐
Provider A Provider B Local Model
```

---

# 5. Mind Map

```text
Model Architecture
│
├── Interface
├── Adapter
├── Router
├── Fallback
├── Capability
├── Version
├── Policy
└── Evaluation
```

---

# 6. Core Concepts

## 6.1 Stable Capability Interface

Examples:

```text
generate_text()
generate_structured()
embed()
stream()
```

Avoid giant interface covering every possible vendor feature.

---

## 6.2 Provider Adapter

Adapter handles:

- authentication;
- SDK;
- request mapping;
- retries/timeouts;
- response normalization;
- provider errors.

---

## 6.3 Model Routing

Route based on:

- task type;
- quality requirement;
- latency;
- cost;
- context length;
- geography/privacy;
- structured output/tool capability.

---

## 6.4 Routing Must Be Evaluated

Example:

```text
classification → small model
complex synthesis → larger model
```

Only if evaluation proves acceptable quality.

---

## 6.5 Fallback

Fallback may be:

- same provider, different model;
- secondary provider;
- deterministic fallback;
- degraded response;
- queue/retry later.

Fallback must preserve:

- security;
- data residency;
- output contract;
- acceptable quality.

---

## 6.6 Vendor Lock-In

Avoid hard-coding model/provider logic across business code.

But do not overbuild portability if only one provider is realistic.

KIS:

> isolate provider dependency first; multi-provider orchestration only when needed.

---

## 6.7 Model Configuration

Version:

```text
provider
model
temperature/sampling
prompt version
output schema
routing policy
```

---

# 7. Engineering Depth

## 7.1 Capability Matrix

Example:

| Requirement | Model A | Model B |
|---|---|---|
| Structured Output | Strong | Medium |
| Context | High | Medium |
| Latency | Medium | Fast |
| Cost | High | Low |
| Region Support | Yes | Limited |

Architecture chooses based on workload.

---

## 7.2 Fallback Is Not Free

Fallback provider may:

- produce incompatible JSON;
- have different safety behavior;
- violate region policy;
- cost more;
- behave differently in tool calling.

Test it.

---

# 8. Implementation / Design

```python
class ModelProvider(Protocol):
    async def generate(self, request):
        ...

class ProviderAAdapter(ModelProvider):
    ...

class ProviderBAdapter(ModelProvider):
    ...
```

Router:

```python
provider = router.choose(task, policy, budget)
result = await provider.generate(request)
```

---

# 9. Hands-On Practice

Define routing for:

- ticket classification;
- long contract summarization;
- RAG answer;
- code generation;
- PII-sensitive local-only task.

---

# 10. Google Interview Drill

## Problem — Primary LLM Provider Has 30-Minute Outage

### Clarify

- feature critical?
- fallback provider approved?
- same region/privacy?
- structured output compatibility?
- queue acceptable?

### First Approach

Automatically switch all traffic.

Risky.

### Improve

Policy-based fallback:

```text
simple classification → secondary provider
high-risk financial/legal → fail closed / human
chat drafting → degraded secondary provider
batch jobs → queue/retry
```

### Follow-Up

Track fallback quality separately and canary provider changes.

---

# 11. Common Mistakes

1. Provider SDK everywhere.
2. Abstraction for every vendor feature.
3. Automatic fallback without policy.
4. Routing by cost only.
5. Fallback not evaluated.
6. Region/privacy ignored.
7. Model config unversioned.

---

# 12. Best Practices

- narrow provider boundary;
- capability-based routing;
- evaluated fallback;
- policy-aware routing;
- version configuration;
- expose provider-specific features deliberately.

---

# 13. Interview Questions

1. How avoid model vendor lock-in?
2. What should provider adapter own?
3. How route models?
4. How design fallback?
5. What if output schemas differ?
6. How version model configuration?
7. When is multi-provider unnecessary?

---

# 14. Google-Level Follow-Ups

1. provider latency spike?
2. data residency?
3. local model?
4. quality regression?
5. tool-calling differences?
6. model deprecated?
7. cost cap?
8. partial region outage?

---

# 15. Quick Revision

```text
Abstract stable capabilities
Adapter owns provider details
Router uses quality + latency + cost + privacy
Fallback must be evaluated
Version model configuration
Avoid both lock-in and over-abstraction
```

---

# 16. Readiness Gate

- [ ] Provider abstraction.
- [ ] Adapter responsibility.
- [ ] Routing.
- [ ] Fallback.
- [ ] Versioning.
- [ ] Outage drill.

**Gate:** READY / REPAIR

---

# 17. References

- Adapter/strategy patterns
- Provider-neutral AI integration architecture
