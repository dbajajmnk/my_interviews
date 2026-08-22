# GOJ Interview Preparation — Cognizant
## Area 04 — AI
### AI-02 — RAG Architecture

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** Emerging AI Layer + M16 AI Evaluation + M18 Data Access + M19 API Engineering + M20 Performance/Security + M21 Architecture + M22 Production Engineering  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” It focuses on durable, vendor-neutral RAG engineering rather than provider-specific product trivia.

---

# 1. Pack Objective

AI-02 prepares you to design, explain, debug, evaluate, and defend an enterprise Retrieval-Augmented Generation system.

By the end of this pack you should be able to:

- explain why RAG exists and when it is preferable to prompting or fine-tuning;
- design ingestion, parsing, chunking, metadata, embedding, and indexing pipelines;
- choose chunking strategies and explain their trade-offs;
- explain vector search, metadata filtering, hybrid search, reranking, and top-k selection;
- design prompt assembly with context budgeting and citations;
- enforce tenant isolation and document-level authorization before model generation;
- reason about freshness, re-indexing, deletion, embedding migrations, and versioning;
- diagnose poor RAG quality by separating retrieval failure from generation failure;
- define offline and online RAG evaluation;
- discuss latency, cost, caching, observability, and scaling;
- design production-ready React + Python + RAG architectures;
- survive architect-level follow-up questions without bluffing.

Target:

> **Ingest → Chunk → Embed → Index → Retrieve → Filter → Rerank → Ground → Generate → Cite → Evaluate → Observe → Improve**

---

# 2. Directory Structure

```text
GOJ-Cognizant-AI-02-Final/
│
├── README.md
├── 01-RAG-Foundations-and-End-to-End-Architecture.md
├── 02-Ingestion-Parsing-Chunking-Metadata-and-Indexing.md
├── 03-Embeddings-Vector-Search-Hybrid-Retrieval-and-Reranking.md
├── 04-Context-Assembly-Prompting-Citations-and-Generation.md
├── 05-RAG-Security-Freshness-Multi-Tenancy-and-Data-Governance.md
├── 06-RAG-Evaluation-Debugging-Observability-and-Optimization.md
├── 07-Production-RAG-System-Design-and-Architect-Scenarios.md
└── 08-AI-02-Final-Readiness-Assessment.md
```

KIS rule:

- no separate practice/lab folders;
- one meaningful Google drill per topic file;
- no vector-database brand memorization;
- no complex agent orchestration here—agents belong to AI-03.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | RAG foundations & end-to-end architecture | 60 min |
| 02 | Ingestion, chunking, metadata, indexing | 75 min |
| 03 | Embeddings, vector/hybrid retrieval, reranking | 80 min |
| 04 | Context assembly, prompting, citations | 70 min |
| 05 | Security, freshness, multi-tenancy, governance | 70 min |
| 06 | Evaluation, debugging, observability, optimization | 80 min |
| 07 | Production RAG system design | 70 min |
| 08 | Final readiness assessment | 60 min |
| **Total** |  | **~9 hr 25 min** |

Time rule:

> **Do not memorize RAG buzzwords. Learn which stage fails, how to measure it, and how to improve it.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Design → Test → Edge Cases → Cost / Risk → Trade-Off → Follow-Up → Defend**

---

# 5. RAG Interview Standard

For every RAG design question:

```text
1. Clarify source data and users
2. Define authorization boundary
3. Define ingestion and freshness requirement
4. Define chunking + metadata strategy
5. Define embedding/index strategy
6. Define retrieval method
7. Define reranking/filtering
8. Define context budget
9. Define generation/citation contract
10. Define evaluation metrics
11. Define observability/cost/latency
12. Defend failure modes and trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| RAG Foundations & Ingestion | 20% |
| Retrieval / Search / Reranking | 20% |
| Context / Grounding / Citations | 15% |
| Security / Freshness / Governance | 15% |
| Google Interview Drill | 15% |
| Evaluation / Production Architect Defense | 15% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can separate retrieval vs generation failures;
- can enforce ACL before retrieval/generation;
- can define measurable RAG evaluation;
- can defend chunking/retrieval/cost/latency trade-offs.

---

# 7. AI-02 Completion Criteria

You must be able to:

- explain RAG vs fine-tuning;
- draw complete RAG pipeline;
- choose chunk size/overlap strategy;
- define metadata;
- explain embeddings/vector similarity;
- explain hybrid search and reranking;
- explain top-k trade-off;
- build context within token budget;
- return trustworthy citations;
- handle document updates/deletion;
- enforce tenant/document ACL;
- define retrieval metrics and answer metrics;
- debug low-quality answers stage by stage;
- design production RAG for enterprise use.

---

# 8. Next Pack

After AI-02:

> **AI-03 — Agents, Evaluation & Production AI**
