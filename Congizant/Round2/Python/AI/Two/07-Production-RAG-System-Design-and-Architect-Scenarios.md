# AI-02 / File 07 — Production RAG System Design & Architect Scenarios

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M21 Architecture + M22 Production

---

# 1. Objective

Integrate all RAG concepts into production architecture:

- ingestion services;
- indexes/stores;
- online query API;
- caching;
- queues;
- scaling;
- security;
- observability;
- resilience;
- cost;
- deployment/versioning.

---

# 2. 5W+H

## What?

Production RAG architecture connects governed enterprise data with online retrieval and LLM generation.

## Why?

A demo RAG system is easy; a secure, fresh, measurable, scalable RAG platform is not.

## Where?

Enterprise AI assistants and knowledge systems.

## When?

Architect/system-design interviews and production deployments.

## How?

Separate ingestion, retrieval, generation, and governance concerns.

---

# 3. Real-Life Analogy

A news service has two systems:

1. newsroom/indexing pipeline;
2. reader-facing search/delivery system.

RAG similarly separates document processing from live user queries.

---

# 4. Visualization

```text
             OFFLINE / INGESTION
Sources
  ↓
Connectors
  ↓
Parse / Chunk
  ↓
Metadata / ACL
  ↓
Embedding
  ↓
Vector / Search Index
  ↓
Version Registry


               ONLINE / QUERY
React
  ↓
Gateway / Auth
  ↓
Python RAG API
  ├── ACL-aware Retriever
  ├── Hybrid Search
  ├── Reranker
  ├── Context Builder
  ├── LLM Adapter
  └── Citation Validator
        ↓
      Stream Response

Cross-cutting:
cache + logs + metrics + traces + eval + quotas
```

---

# 5. Mind Map

```text
Production RAG
│
├── Ingestion
├── Index
├── Query API
├── Security
├── Cache
├── Queue
├── Scaling
├── Versioning
├── Evaluation
└── Observability
```

---

# 6. Core Concepts

## 6.1 Separate Ingestion and Query Scaling

Ingestion:

- batch/event driven;
- CPU/network heavy;
- embedding cost.

Query:

- low latency;
- user-facing;
- retrieval/model quota.

Scale independently.

---

## 6.2 Queue for Ingestion

Document update:

```text
source event
→ queue
→ parse/chunk/embed worker
→ index
```

Benefits:

- retry;
- burst smoothing;
- asynchronous processing.

---

## 6.3 Cache

Possible caches:

- query embedding;
- retrieval result;
- final answer;
- source metadata.

But cache must respect:

- tenant;
- ACL;
- freshness;
- model/prompt/index versions.

---

## 6.4 Versioning

Track:

```text
parser version
chunking version
embedding model version
index version
prompt version
LLM model version
reranker version
```

Needed for:

- debugging;
- rollback;
- evaluation.

---

## 6.5 Resilience

Plan for:

- vector store unavailable;
- embedding provider outage;
- LLM outage;
- reranker timeout;
- partial ingestion.

Degrade safely.

Example:

> if reranker fails, possibly use first-stage retrieval if quality policy allows.

---

## 6.6 Scale

Potential bottlenecks:

- vector QPS;
- metadata filter;
- reranker;
- model quota;
- context token cost;
- ingestion queue.

Scale measured bottleneck.

---

# 7. Engineering Depth

## 7.1 Multi-Region

Questions:

- data residency?
- local index?
- replication?
- model endpoint region?
- freshness lag?
- global tenant routing?

Do not add multi-region without requirement.

---

## 7.2 Zero-Downtime Reindex

When embedding/chunk version changes:

```text
build v2 index
→ evaluate
→ shadow/canary
→ switch traffic
→ retain v1 for rollback
→ remove later
```

Avoid rebuilding active index destructively.

---

## 7.3 AI SLOs

Examples:

```text
retrieval p95
time to first token
answer success rate
groundedness
citation correctness
freshness lag
cost/query
```

---

# 8. Implementation / Design

Example logical services:

```text
Document Ingestion Service
Retrieval Service
Generation Service
Evaluation Pipeline
Metadata/ACL Service
```

Could be modules in one deploy or separate services.

Do not split into microservices without operational need.

---

# 9. Hands-On Practice

Design production path for:

> 1M documents, 10k employees, daily updates, 2k concurrent chat users.

Identify:

- ingestion scaling;
- retrieval;
- ACL;
- model quota;
- cache;
- monitoring.

---

# 10. Google Interview Drill

## Problem — Design Enterprise RAG Platform

Requirements:

- 1M documents;
- PDF/HTML/Office docs;
- 100k users;
- role/document ACL;
- updates every 5 minutes;
- citations mandatory;
- p95 first response < 4 sec;
- multiple business units;
- model provider quota.

### Clarify

- tenants/business units isolated?
- data residency?
- expected query QPS?
- document size?
- multilingual?
- SLA for deletion?
- failure tolerance?

### Baseline Architecture

```text
Sources
→ ingestion queue
→ parse/chunk workers
→ metadata/ACL
→ embedding
→ versioned search index

User
→ auth
→ Python RAG API
→ ACL filter
→ hybrid retrieval
→ rerank
→ context
→ model
→ citation validation
→ stream
```

### Production Controls

- bounded model concurrency;
- per-user/tenant rate limits;
- tracing;
- freshness lag metrics;
- golden-set evaluation;
- versioned rollout;
- cache with ACL-aware keys.

### Edge Cases

- stale ACL;
- partial reindex;
- provider 429;
- source deletion;
- conflicting docs;
- index migration.

### Defend

Explain why each component exists and which could remain in one service initially.

---

# 11. Common Mistakes

1. Ingestion/query tightly coupled.
2. Active index rebuilt destructively.
3. Cache ignores ACL/version.
4. No freshness metric.
5. Microservices for every step.
6. No rollback for embedding/index change.
7. Model quota ignored.
8. No evaluation gate before rollout.

---

# 12. Best Practices

- separate offline/online paths logically;
- use queues for ingestion;
- version AI artifacts;
- canary/reindex safely;
- measure freshness;
- bound model usage;
- cache carefully;
- keep deployment topology simple until scale demands separation.

---

# 13. Interview Questions

1. Design production RAG?
2. Why separate ingestion/query?
3. How scale ingestion?
4. How scale retrieval?
5. What versions track?
6. How reindex safely?
7. How cache RAG?
8. What SLOs?
9. How handle provider outage?
10. Monolith vs microservices for RAG?

---

# 14. Google-Level Follow-Ups

1. 100M docs?
2. one hot tenant?
3. ACL updated instantly?
4. cross-region?
5. vector store down?
6. embedding migration?
7. reindex cost?
8. model quota exhausted?
9. canary evaluation?
10. disaster recovery?

---

# 15. Quick Revision

```text
Offline:
source → parse → chunk → metadata/ACL → embed → index

Online:
auth → retrieve → rerank → context → LLM → cite

Production:
version
queue
cache
quota
freshness
evaluation
observability
rollback

Scale bottleneck, not buzzword
```

---

# 16. Readiness Gate

- [ ] Offline/online separation.
- [ ] Queue.
- [ ] Versioning.
- [ ] Cache.
- [ ] Reindex.
- [ ] SLOs.
- [ ] Resilience.
- [ ] Enterprise platform drill.

**Gate:** READY / REPAIR

---

# 17. References

- Enterprise search/RAG architecture references
- Distributed system production patterns
