# AI-02 / File 01 — RAG Foundations & End-to-End Architecture

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** Emerging AI Architecture

---

# 1. Objective

Master:

- what RAG is;
- why RAG exists;
- RAG vs prompting vs fine-tuning;
- offline indexing vs online query flow;
- retrieval vs generation responsibility;
- grounding;
- citations;
- end-to-end architecture.

---

# 2. 5W+H

## What?

Retrieval-Augmented Generation retrieves relevant external information at query time and supplies it to an LLM as context for generating an answer.

## Why?

RAG helps when knowledge is:

- private;
- dynamic;
- too large to place in every prompt;
- expected to be cited;
- controlled by enterprise permissions.

## Where?

- enterprise search;
- policy assistant;
- document Q&A;
- support assistant;
- technical knowledge systems.

## When?

Use when answer quality depends on external authoritative knowledge that should remain separately managed.

## How?

```text
Documents → index pipeline
User question → retrieval → context → LLM → grounded answer
```

---

# 3. Real-Life Analogy

An LLM without RAG is like an expert answering from memory.

RAG gives the expert access to the latest approved reference files before answering.

---

# 4. Visualization

## Offline / Ingestion

```text
Documents
   ↓
Parse / Clean
   ↓
Chunk
   ↓
Metadata
   ↓
Embeddings
   ↓
Search Index / Vector Store
```

## Online / Query

```text
User Question
   ↓
Authorize
   ↓
Query Processing
   ↓
Retrieve
   ↓
Filter / Rerank
   ↓
Context Builder
   ↓
LLM
   ↓
Answer + Citations
```

---

# 5. Mind Map

```text
RAG
│
├── Ingestion
│   ├── parse
│   ├── chunk
│   └── index
├── Retrieval
│   ├── semantic
│   ├── keyword
│   └── rerank
├── Generation
│   ├── prompt
│   ├── context
│   └── citations
└── Production
    ├── security
    ├── freshness
    ├── evaluation
    └── observability
```

---

# 6. Core Concepts

## 6.1 RAG vs Base LLM

Base model may have learned general knowledge during training.

RAG supplies runtime external knowledge.

This helps with:

- current information;
- private information;
- evidence/citations;
- separation of knowledge from model weights.

---

## 6.2 RAG vs Fine-Tuning

### RAG

Best suited when problem is:

> model needs access to changing/reference knowledge.

### Fine-tuning

Best suited when problem is more like:

> model behavior, style, task mapping, or specialized output pattern needs adaptation.

Fine-tuning is not a reliable replacement for a frequently changing document database.

---

## 6.3 RAG vs Long Prompt

For a small, fixed source, sending all relevant content may be simpler.

RAG becomes valuable when:

- corpus large;
- dynamic;
- permission-controlled;
- per-query relevance matters.

KIS:

> Do not build a vector platform when 5 pages of static context solve the problem.

---

## 6.4 Retrieval Failure vs Generation Failure

Retrieval failure:

> correct evidence never reached model.

Generation failure:

> correct evidence was retrieved but model used it incorrectly or ignored it.

Debug them separately.

---

## 6.5 Grounding

Grounding means answer should be based on supplied authoritative context.

Prompt might state:

```text
Answer only from provided sources.
If evidence is insufficient, say so.
```

Still requires evaluation.

---

## 6.6 Citations

Citations should connect answer to source metadata.

Good architecture preserves:

```text
document_id
chunk_id
page/section
title
source URI/access reference
```

---

# 7. Engineering Depth

## 7.1 RAG Is a Search System Plus a Generation System

If retrieval is weak, changing the LLM may not fix the real problem.

Think:

```text
Answer Quality
≈ Retrieval Quality × Generation Quality
```

Not a literal formula, but useful mental model.

---

## 7.2 Start Simple

Baseline:

```text
chunk
→ embed
→ top-k vector search
→ prompt
→ answer
```

Only add:

- query rewriting;
- hybrid search;
- reranking;
- multi-stage retrieval;

when evaluation proves baseline insufficient.

---

# 8. Implementation / Code

Pseudo:

```python
async def answer(question, identity):
    candidates = await retriever.search(
        query=question,
        identity=identity,
        top_k=5,
    )

    context = build_context(candidates)

    return await llm.generate(
        question=question,
        context=context,
    )
```

Important:

> authorization must not be delegated to the prompt.

---

# 9. Hands-On Practice

Classify which need RAG:

1. summarize one uploaded 2-page note;
2. answer questions across 100k internal policies;
3. classify sentiment;
4. latest product documentation assistant;
5. exact payroll calculation.

---

# 10. Google Interview Drill

## Problem — Build an Internal Policy Assistant

Requirements:

- 50k documents;
- policies update weekly;
- citations required;
- employees should see only authorized documents.

### Clarify

- formats?
- ACL source?
- latency target?
- update SLA?
- multilingual?
- citation detail?

### First Approach

Fine-tune model on all policies.

Problems:

- freshness;
- deletion;
- citations;
- access control;
- retraining cost.

### Improve

Use RAG:

```text
Policy Sources
→ ingestion/index
→ ACL metadata
→ retrieval filtered by identity
→ rerank
→ context
→ LLM
→ answer + citations
```

### Edge Cases

- policy deleted;
- conflicting policies;
- stale index;
- user loses access;
- no relevant evidence.

### Defend

Knowledge stays in governed external systems; model receives only authorized relevant context.

---

# 11. Common Mistakes

1. RAG = vector database only.
2. Fine-tuning used for frequently changing facts.
3. Authorization performed only in prompt.
4. Retrieval and generation failures mixed together.
5. Citations created after the fact without source linkage.
6. Complex RAG before baseline evaluation.
7. Assuming RAG eliminates hallucination.

---

# 12. Best Practices

- separate offline/online pipeline;
- baseline first;
- preserve source metadata;
- authorize before context reaches model;
- evaluate retrieval and generation separately;
- support no-answer behavior.

---

# 13. Interview Questions

1. What is RAG?
2. Why use RAG?
3. RAG vs fine-tuning?
4. RAG vs long context?
5. What is grounding?
6. What are RAG pipeline stages?
7. Retrieval vs generation failure?
8. Why citations?
9. Does RAG eliminate hallucination?
10. When should you not build RAG?

---

# 14. Google-Level Follow-Ups

1. 10 documents only?
2. weekly updates?
3. ACL changes?
4. conflicting sources?
5. multilingual corpus?
6. model upgrade?
7. no relevant result?
8. citations incorrect?

---

# 15. Quick Revision

```text
RAG = retrieve external knowledge + generate with context
Fine-tuning changes behavior/weights
RAG changes runtime knowledge
Retrieval failure ≠ generation failure
Authorization must happen before model context
Citations require source metadata
Start simple, evaluate, then improve
```

---

# 16. Readiness Gate

- [ ] RAG definition.
- [ ] RAG vs fine-tuning.
- [ ] Offline/online pipeline.
- [ ] Retrieval vs generation failure.
- [ ] Grounding.
- [ ] Citation reasoning.
- [ ] Policy assistant drill.

**Gate:** READY / REPAIR

---

# 17. References

- Provider-neutral RAG architecture references
- Vector search and information retrieval references
