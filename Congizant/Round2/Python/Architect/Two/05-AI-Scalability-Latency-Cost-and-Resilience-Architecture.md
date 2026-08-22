# ARCH-02 / File 05 — AI Scalability, Latency, Cost & Resilience Architecture

**Priority:** P0  
**Suggested Time:** 80 minutes

---

# 1. Objective

Master:

- AI request path;
- concurrency;
- token/model cost;
- streaming;
- batching;
- caching;
- quotas;
- timeouts;
- retries;
- circuit breakers;
- fallback;
- queues;
- backpressure;
- model/provider bottlenecks.

---

# 2. 5W+H

## What?

AI scalability is the ability to meet quality, latency, and cost targets while model and tool providers have finite capacity and quotas.

## Why?

AI workloads are slower and more expensive than typical CRUD calls.

## Where?

Model APIs, embedding, retrieval, reranking, agent tools.

## When?

Every production AI architecture.

## How?

Measure the path, bound work, control concurrency, and scale the bottleneck.

---

# 3. Real-Life Analogy

AI capacity is like a restaurant with a limited number of chefs.

Letting unlimited guests enter does not make meals arrive faster.

You need reservations, queues, priorities, and capacity controls.

---

# 4. Visualization

```text
Users
 ↓
API Rate Limit
 ↓
AI Orchestrator
 ├── Retrieval
 ├── Reranker
 └── Model
      ↓
Concurrency Gate
      ↓
Provider

Cross-cutting:
cache + queue + fallback + metrics
```

---

# 5. Mind Map

```text
AI Production
│
├── Latency
├── Tokens
├── Cost
├── Concurrency
├── Quota
├── Cache
├── Queue
├── Retry
├── Fallback
└── Backpressure
```

---

# 6. Core Concepts

## 6.1 AI Latency Budget

Break into:

```text
auth
retrieval
rerank
prompt build
provider queue
time to first token
generation
post-processing
```

---

## 6.2 Streaming

Improves perceived latency for chat.

Does not reduce total model compute automatically.

Need:

- cancellation;
- partial failure;
- citation handling.

---

## 6.3 Concurrency Limit

Even if API handles 10k connections, provider may allow only 200 active generations.

Use:

- semaphore;
- queue;
- tenant quotas.

---

## 6.4 Token Cost

Cost grows with:

- prompt/context size;
- output size;
- repeated model calls;
- retries;
- agent loops.

Optimize context before blindly switching models.

---

## 6.5 Caching

Possible:

- embeddings;
- retrieval results;
- deterministic classification;
- final answer in safe cases.

Cache keys must include:

- tenant/security scope;
- prompt/model/index version;
- relevant user/context attributes.

---

## 6.6 Timeout / Retry

Retry:

- selected 429/5xx;
- bounded;
- backoff/jitter;
- total deadline.

Avoid retrying unsafe side effects without idempotency.

---

## 6.7 Circuit Breaker / Fallback

If provider unhealthy:

- alternate provider;
- smaller model;
- search-only result;
- human escalation;
- queue.

Depends on task risk.

---

## 6.8 Queues

Long-running work:

```text
document processing
batch summarization
offline eval
agent task
```

belongs in job/worker architecture.

---

## 6.9 Backpressure

When model quota saturated:

- reject/defer;
- queue;
- rate limit;
- lower-priority shedding.

Do not create infinite backlog.

---

# 7. Engineering Depth

## 7.1 Cost Budget per Tenant/Feature

Track:

```text
tokens
model calls
tool calls
retrieval/rerank
cost
```

Set:

- per-run budget;
- per-tenant monthly budget;
- alerts.

---

## 7.2 Quality-Cost Frontier

You want smallest/cheapest architecture meeting required quality.

More powerful model may not justify cost for simple tasks.

---

## 7.3 Retry Amplification in Agents

One model call retries, then repeated tool loops can multiply cost.

Use total-run budget, not only per-call retry.

---

# 8. Implementation / Design

```text
Request
→ tenant quota
→ retrieval
→ concurrency gate
→ model
→ stream
```

If saturated:

```text
interactive → fail/degrade quickly
batch → queue
```

---

# 9. Hands-On Practice

For 5k concurrent users and provider limit of 300 generations:

Design:

- per-tenant rate limit;
- global semaphore;
- queue for background work;
- streaming;
- cancellation;
- fallback policy.

---

# 10. Google Interview Drill

## Problem — AI Chat p95 Latency Doubles

Traffic unchanged.

### Clarify

- retrieval latency?
- model TTFT?
- generation length?
- context tokens?
- provider queue?
- retry count?
- model changed?

### First Approach

Add API pods.

May not help.

### Improve

Trace stages.

Suppose:

```text
retrieval = 150 ms
provider queue = 3 sec
TTFT = 2 sec
```

Bottleneck is provider capacity.

Options:

- reduce concurrency per request;
- route simple tasks to faster model;
- secondary provider;
- queue lower-priority work;
- negotiate quota.

### Follow-Up

Re-evaluate quality after routing changes.

---

# 11. Common Mistakes

1. Scale API when provider is bottleneck.
2. Unlimited model concurrency.
3. Cache ignores tenant/version.
4. Retry storm.
5. Long context not measured.
6. Agent loop cost ignored.
7. No cancellation.
8. Infinite queue.

---

# 12. Best Practices

- stage-level latency tracing;
- bound model concurrency;
- per-tenant quotas;
- token/cost budgets;
- queue long work;
- cache carefully;
- degrade/fallback by risk;
- measure quality after optimization.

---

# 13. Interview Questions

1. How scale AI API?
2. What affects TTFT?
3. How control model concurrency?
4. How reduce token cost?
5. How cache AI?
6. How handle provider 429?
7. How design fallback?
8. How prevent agent runaway cost?
9. How handle queue overload?

---

# 14. Google-Level Follow-Ups

1. 10× traffic?
2. one tenant consumes quota?
3. provider region outage?
4. batch vs interactive priority?
5. multi-provider routing?
6. long prompts?
7. cancellation?
8. cost anomaly?

---

# 15. Quick Revision

```text
Trace AI path
Provider often is bottleneck
Bound concurrency
Meter tokens/cost
Queue long work
Cache with tenant/version keys
Retry selectively
Fallback by risk
Backpressure instead of infinite backlog
```

---

# 16. Readiness Gate

- [ ] Latency budget.
- [ ] Concurrency.
- [ ] Token/cost.
- [ ] Cache.
- [ ] Retry/fallback.
- [ ] Queue/backpressure.
- [ ] Latency-doubled drill.

**Gate:** READY / REPAIR

---

# 17. References

- Distributed systems resilience and AI production architecture references
