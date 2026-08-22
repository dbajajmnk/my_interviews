# AI-02 / File 06 — RAG Evaluation, Debugging, Observability & Optimization

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M16 AI Evaluation + M14 Debugging + M22 Production

---

# 1. Objective

Master:

- RAG evaluation;
- retrieval metrics;
- answer metrics;
- golden datasets;
- stage-by-stage debugging;
- online feedback;
- tracing;
- latency/cost breakdown;
- A/B testing;
- optimization workflow.

---

# 2. 5W+H

## What?

RAG evaluation measures whether the right evidence is retrieved and whether the generated answer uses it correctly.

## Why?

Without evaluation, RAG tuning becomes guesswork.

## Where?

Offline test sets, staging, production monitoring.

## When?

Before release and after any change to:

- parser;
- chunking;
- embeddings;
- retrieval;
- reranker;
- prompt;
- model.

## How?

Measure retrieval separately from generation, then end-to-end.

---

# 3. Real-Life Analogy

If a student gives a wrong answer, first ask:

> Did they receive the correct textbook page?

Then ask:

> Did they understand and use it correctly?

That is retrieval vs generation evaluation.

---

# 4. Visualization

```text
Question
 ↓
Retrieval
 ├── Recall@K
 ├── Precision@K
 └── MRR/nDCG awareness
 ↓
Context
 ↓
Generation
 ├── Groundedness
 ├── Answer Correctness
 ├── Relevance
 └── Citation Correctness
 ↓
End-to-End User Success
```

---

# 5. Mind Map

```text
RAG Evaluation
│
├── Retrieval
│   ├── Recall@K
│   ├── Precision@K
│   └── Ranking
├── Generation
│   ├── correctness
│   ├── groundedness
│   └── citations
├── Online
│   ├── feedback
│   └── task success
└── Operations
    ├── latency
    ├── cost
    └── traces
```

---

# 6. Core Concepts

## 6.1 Golden Dataset

Each test case can contain:

```text
question
expected relevant document/chunk IDs
reference answer or rubric
expected citations
```

Need:

- normal;
- edge;
- adversarial;
- business-critical cases.

---

## 6.2 Recall@K

Of the relevant evidence, how much appears in top K?

Practical question:

> Did retrieval include the source needed to answer?

---

## 6.3 Precision@K

Of retrieved top K, how much is actually relevant?

High noise wastes context.

---

## 6.4 Ranking Metrics Awareness

Metrics such as:

- MRR;
- nDCG;

evaluate ranking quality.

Architect does not need formula memorization unless asked, but should know ranking can be measured beyond binary hit/miss.

---

## 6.5 Answer Correctness

Does answer match expected factual content?

Can use:

- exact/deterministic checks where possible;
- human rubric;
- model-assisted judge with calibration.

---

## 6.6 Groundedness

Are claims supported by supplied context?

Distinct from general factual correctness.

An answer can be factually true but unsupported by retrieved source.

---

## 6.7 Citation Correctness

Does citation actually support claim?

Measure separately.

---

## 6.8 Online Signals

Examples:

- thumbs up/down;
- answer retry;
- abandonment;
- click citation;
- escalation;
- task completion.

These are noisy but useful.

---

# 7. Engineering Depth

## 7.1 Debugging Flow

When answer is bad:

```text
1. Is source in corpus?
2. Was source parsed correctly?
3. Was chunk created correctly?
4. Was it embedded/indexed?
5. Did retrieval return it?
6. Did filtering remove it?
7. Did reranker drop it?
8. Did context include it?
9. Did model use it correctly?
10. Was citation mapped correctly?
```

This is the core RAG debugging skill.

---

## 7.2 Latency Breakdown

Measure:

```text
query preprocessing
retrieval
reranking
context build
LLM first token
LLM generation
post-processing
```

Do not optimize blind.

---

## 7.3 Cost Breakdown

Track:

- embedding/indexing cost;
- retrieval/reranker cost;
- input/output tokens;
- retries;
- cache.

---

## 7.4 Change Evaluation

If chunk size changes:

> rerun same golden dataset.

If embedding model changes:

> re-index version + compare retrieval quality.

If LLM changes:

> compare generation/groundedness/cost.

One variable at a time when possible.

---

# 8. Implementation / Code

Pseudo evaluation:

```python
def hit_at_k(retrieved_ids, relevant_ids, k):
    return int(
        any(
            doc_id in set(relevant_ids)
            for doc_id in retrieved_ids[:k]
        )
    )
```

Use richer metrics as needed, but simple hit rate is a useful baseline.

---

# 9. Hands-On Practice

Given:

```text
question: "Germany PTO policy?"
expected source: DOC-17 section 4
retrieved top5: DOC-3, DOC-9, DOC-17, DOC-22, DOC-5
```

Hit@5 = yes.

Then ask:

- did reranker preserve DOC-17?
- did final context include it?
- did answer cite it?

---

# 10. Google Interview Drill

## Problem — RAG Accuracy Dropped After Embedding Upgrade

### Clarify

- old vectors re-used?
- new query embedding with old document embeddings?
- whole corpus re-embedded?
- chunking changed too?
- evaluation dataset available?

### First Suspicion

Embedding-space mismatch or quality regression.

### Investigation

```text
verify embedding versions
→ run retrieval eval
→ compare Recall@K
→ inspect failed queries
→ compare latency/cost
```

### Fix

- version indexes;
- fully re-embed compatible corpus;
- canary/A-B compare;
- rollback if quality lower.

### Follow-Up

Never silently mix incompatible embedding versions.

---

# 11. Common Mistakes

1. End-to-end score only.
2. No retrieval labels.
3. Tuning from anecdotes.
4. Model change + chunk change simultaneously.
5. LLM judge uncalibrated.
6. User thumbs-up treated as perfect truth.
7. No latency breakdown.
8. No index/model version tracking.

---

# 12. Best Practices

- evaluate stages independently;
- maintain golden set;
- version every major AI artifact;
- trace source IDs;
- monitor online signals;
- compare quality + latency + cost;
- make changes measurable/reversible.

---

# 13. Interview Questions

1. How evaluate RAG?
2. What is Recall@K?
3. Precision@K?
4. Groundedness?
5. Citation correctness?
6. Golden dataset?
7. How debug bad answer?
8. How evaluate embedding change?
9. LLM-as-judge risks?
10. What RAG metrics monitor in production?

---

# 14. Google-Level Follow-Ups

1. no labeled dataset?
2. human evaluation too costly?
3. multilingual?
4. long-tail queries?
5. adversarial data?
6. A/B testing?
7. rollback?
8. drift?

---

# 15. Quick Revision

```text
Bad answer:
source?
parse?
chunk?
index?
retrieve?
filter?
rerank?
context?
generate?
cite?

Evaluate retrieval separately from generation.
Version + measure every change.
Quality + latency + cost all matter.
```

---

# 16. Readiness Gate

- [ ] Golden dataset.
- [ ] Recall/precision.
- [ ] Groundedness.
- [ ] Citation correctness.
- [ ] Debug flow.
- [ ] Latency/cost breakdown.
- [ ] Embedding-upgrade drill.

**Gate:** READY / REPAIR

---

# 17. References

- Information retrieval evaluation references
- RAG evaluation frameworks/concepts
