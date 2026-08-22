# AI-01 / File 04 — LLM API Integration, Latency, Cost & Model Selection

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M19 + M20 + M21

---

# 1. Objective

Master:

- backend LLM integration;
- provider adapter;
- timeout;
- retries;
- streaming;
- model selection;
- latency;
- token cost;
- concurrency;
- quotas;
- fallback;
- caching awareness;
- observability.

---

# 2. 5W+H

## What?

LLM integration is a distributed-system problem around a probabilistic dependency.

## Why?

Production success depends on more than model quality:

- latency;
- cost;
- rate limits;
- security;
- availability.

## Where?

Python APIs, AI services, full-stack applications.

## When?

Any production use of hosted/local models.

## How?

Backend adapter → validated request → bounded call → validated response → metrics.

---

# 3. Real-Life Analogy

Choosing an LLM is like choosing a database instance size.

The most powerful option is not always the best option.

You choose based on workload, cost, latency, quality, and risk.

---

# 4. Visualization

```text
React
 ↓
Python API
 ↓
AI Service
 ├── Prompt Builder
 ├── Model Router
 ├── Provider Adapter
 └── Output Validator
       ↓
     Model API

Cross-cutting:
timeout + retry + quota + metrics + security
```

---

# 5. Mind Map

```text
LLM Integration
│
├── Provider Adapter
├── Model Selection
├── Timeout
├── Retry
├── Streaming
├── Cost
├── Quota
├── Fallback
└── Observability
```

---

# 6. Core Concepts

## 6.1 Backend Owns Provider Credential

Never expose secret model API key in browser.

Backend provides:

- authentication;
- authorization;
- quota;
- logging;
- policy;
- model routing.

---

## 6.2 Provider Abstraction

Narrow interface:

```python
class LLMProvider(Protocol):
    async def generate(self, request: GenerationRequest) -> GenerationResult:
        ...
```

Do not build giant abstraction hiding every provider difference prematurely.

---

## 6.3 Model Selection

Choose based on:

- task quality;
- latency;
- token/context needs;
- structured output/tool support;
- privacy/residency;
- cost;
- throughput.

Possible routing:

```text
simple classification → smaller model
complex synthesis → stronger model
```

Only if evaluation proves acceptable quality.

---

## 6.4 Latency

Components:

```text
network
queue/rate wait
time to first token
generation duration
post-processing
```

Streaming improves perceived latency but not necessarily total completion time.

---

## 6.5 Cost

Typical cost drivers:

- input tokens;
- output tokens;
- model tier;
- repeated retries;
- large context;
- high concurrency.

Track cost per:

- request;
- user;
- tenant;
- feature.

---

## 6.6 Timeout

Set bounded timeout.

But LLM calls may be longer than normal REST calls.

Define:

- connection;
- first-token;
- total generation;
- user experience.

---

## 6.7 Retry

Retry transient failures carefully.

Watch:

- 429;
- 5xx;
- timeout uncertainty;
- duplicate cost.

Use backoff + jitter + bounded attempts.

---

## 6.8 Fallback

Fallback can improve availability but may change:

- quality;
- format;
- safety;
- data residency;
- cost.

Evaluate fallback independently.

---

## 6.9 Streaming

Good for interactive chat.

Need:

- partial output;
- cancellation;
- partial failure;
- tracing.

---

# 7. Engineering Depth

## 7.1 Cost Optimization Order

Before jumping to smaller model:

```text
reduce unnecessary context
reduce output verbosity
cache/reuse where safe
batch where supported
route simple tasks
then compare model tiers
```

Quality must be reevaluated.

---

## 7.2 Concurrency

Provider quota limits can become system bottleneck.

Use:

- semaphore;
- queue;
- rate limit;
- per-tenant quota.

---

## 7.3 Vendor Lock-In

Abstract stable capability:

```text
generate
embed
stream
```

But expose provider-specific capability only when needed.

Avoid a lowest-common-denominator abstraction that blocks useful features.

---

# 8. Implementation / Code

```python
async def answer(service, prompt):
    return await service.generate(
        prompt=prompt,
        timeout_seconds=20,
    )
```

Exact SDK behavior varies.

---

# 9. Hands-On Practice

Choose between small/fast and large/strong model for:

1. sentiment classification;
2. complex contract summarization;
3. deterministic math;
4. email subject generation.

Explain quality/cost trade-off.

---

# 10. Google Interview Drill

## Problem — AI Feature Cost Doubled

Traffic unchanged.

### Clarify

- model changed?
- context grew?
- output length?
- retries?
- prompt/history growth?
- cache removed?
- usage abuse?

### First Approach

Switch to cheapest model.

May break quality.

### Improve

Instrument:

```text
input tokens/request
output tokens/request
model mix
retry count
latency
cache hit
tenant usage
```

Suppose history grew from 2k to 20k tokens.

Root cost driver = context growth.

### Fix

- summarize/retrieve history;
- cap context;
- keep recent/relevant turns;
- reevaluate quality.

### Follow-Up

Set per-tenant budget and alert.

---

# 11. Common Mistakes

1. LLM called directly from React with secret.
2. Strongest model used for every task.
3. No timeout.
4. Retry storm.
5. Cost not measured.
6. Streaming assumed free.
7. Fallback quality not tested.
8. Provider abstraction overengineered.
9. Context growth ignored.

---

# 12. Best Practices

- backend provider boundary;
- choose model empirically;
- meter token/cost usage;
- cap concurrency;
- use timeouts/retries;
- evaluate fallback;
- stream where UX benefits;
- preserve provider flexibility pragmatically.

---

# 13. Interview Questions

1. How integrate LLM securely?
2. How choose model?
3. What affects latency?
4. What affects cost?
5. How handle 429?
6. How implement retry?
7. Streaming benefits?
8. Model fallback?
9. How avoid vendor lock-in?
10. How control tenant cost?

---

# 14. Google-Level Follow-Ups

1. local model?
2. data residency?
3. 10k concurrent users?
4. provider outage?
5. context limits?
6. cost anomaly?
7. quality regression after cheaper model?
8. multi-provider routing?

---

# 15. Quick Revision

```text
Backend owns LLM credentials
Choose model by quality + latency + cost + privacy
Context/output drive cost
Streaming improves perceived latency
Bound concurrency
Retry selectively
Fallback needs evaluation
Measure cost per feature/tenant
```

---

# 16. Readiness Gate

- [ ] Backend integration.
- [ ] Model selection.
- [ ] Latency.
- [ ] Cost.
- [ ] Timeout/retry.
- [ ] Streaming.
- [ ] Fallback.
- [ ] Cost-doubled drill.

**Gate:** READY / REPAIR

---

# 17. References

- Provider API documentation
- Distributed-system resilience references
