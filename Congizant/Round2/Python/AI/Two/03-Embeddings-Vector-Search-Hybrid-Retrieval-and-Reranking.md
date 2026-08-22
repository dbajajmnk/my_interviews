# AI-02 / File 03 — Embeddings, Vector Search, Hybrid Retrieval & Reranking

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** Retrieval engineering

---

# 1. Objective

Master:

- embeddings;
- vector similarity;
- approximate nearest neighbor awareness;
- top-k;
- metadata filters;
- lexical/keyword retrieval;
- hybrid search;
- query rewriting awareness;
- reranking;
- retrieval recall/precision trade-offs.

---

# 2. 5W+H

## What?

Retrieval selects candidate chunks most likely to contain evidence needed for the user question.

## Why?

The LLM cannot use knowledge that retrieval never provides.

## Where?

RAG query path.

## When?

Every RAG request.

## How?

Question → query representation → candidate retrieval → filter → rerank → top context.

---

# 3. Real-Life Analogy

Vector search is like finding books by meaning rather than exact title words.

Keyword search is like looking up exact terms in an index.

Hybrid search uses both.

Reranking is the librarian taking the first 50 candidates and ordering the best 5 for your exact question.

---

# 4. Visualization

```text
Question
 ↓
Query Embedding ───────┐
                       ├── Vector Search
Keywords ──────────────┤
                       └── Lexical Search
                              ↓
                       Candidate Merge
                              ↓
                       Metadata / ACL Filter
                              ↓
                           Reranker
                              ↓
                             Top-K
```

---

# 5. Mind Map

```text
Retrieval
│
├── Embedding
├── Vector Search
├── Keyword Search
├── Hybrid Search
├── Metadata Filter
├── Query Rewrite
├── Reranker
├── Top-K
└── Recall / Precision
```

---

# 6. Core Concepts

## 6.1 Embeddings

Semantic vectors represent text for similarity search.

Query and chunks should use compatible embedding space.

---

## 6.2 Vector Search

Given query vector, retrieve nearby vectors.

At scale, systems often use approximate nearest-neighbor indexes for speed/memory trade-offs.

You do not need to memorize HNSW/IVF internals unless asked, but know:

> approximate search trades exactness for speed/scale.

---

## 6.3 Top-K

Retrieve `k` candidates.

Too low:

- miss evidence.

Too high:

- more noise;
- rerank/context cost;
- lower precision.

Tune with evaluation.

---

## 6.4 Metadata Filtering

Filter by:

- tenant;
- ACL;
- document type;
- date;
- region;
- product.

Critical:

> security filters must be enforced before unauthorized chunks can reach the LLM.

---

## 6.5 Lexical Search

Keyword/BM25-style retrieval remains strong for:

- exact product codes;
- error codes;
- names;
- acronyms;
- rare terms.

---

## 6.6 Hybrid Search

Combine semantic and lexical retrieval.

Useful when corpus contains both:

- natural-language questions;
- exact identifiers/keywords.

---

## 6.7 Reranking

First-stage retrieval is fast/broad.

Reranker scores candidates more precisely against query.

Pipeline:

```text
retrieve 30–100
→ rerank
→ keep top 5–10
```

Numbers depend on workload.

---

## 6.8 Query Rewriting

May transform vague user question into retrieval-friendly query.

Example:

```text
User: "What about PTO in Germany?"
Rewrite: "Germany paid time off policy annual leave"
```

But rewriting can distort intent.

Evaluate before adding.

---

# 7. Engineering Depth

## 7.1 Recall vs Precision

High recall:

> retrieve most relevant evidence, even with extra noise.

High precision:

> retrieved items are mostly relevant.

Two-stage systems often:

```text
stage 1 maximize recall
stage 2 rerank for precision
```

---

## 7.2 Vector Search Is Not Always Best

Question:

```text
"Error code XJ-4821"
```

Exact lexical search may beat semantic search.

Hybrid search is often practical.

---

## 7.3 Reranker Cost

Reranking improves relevance but adds:

- latency;
- compute/model cost.

Use only if quality gain justifies.

---

# 8. Implementation / Code

Pseudo:

```python
async def retrieve(question, identity):
    vector_hits = await vector_search(
        question,
        top_k=30,
        filters={"tenant_id": identity.tenant_id},
    )

    keyword_hits = await lexical_search(
        question,
        top_k=30,
        filters={"tenant_id": identity.tenant_id},
    )

    candidates = merge(vector_hits, keyword_hits)
    ranked = await rerank(question, candidates)

    return ranked[:5]
```

---

# 9. Hands-On Practice

Choose retrieval style:

1. “How do I reset my password?” → semantic/vector likely useful.
2. “KB-4921” → lexical exact matching important.
3. “Vacation policy for Germany” → semantic + metadata/filter.
4. Product code + descriptive symptom → hybrid may help.

---

# 10. Google Interview Drill

## Problem — RAG Fails on Product Codes

Users ask:

```text
What does error PX-771 mean?
```

Vector retrieval often returns conceptually similar but wrong codes.

### Clarify

- exact code indexed?
- tokenizer behavior?
- lexical index available?
- metadata field for error code?

### First Approach

Use bigger embedding model.

May not solve exact-term weakness.

### Improve

Hybrid retrieval:

```text
exact/lexical match on code
+ vector semantic retrieval
→ merge
→ rerank
```

Optionally metadata-index product/error code.

### Test

Create evaluation set with:

- exact codes;
- similar codes;
- descriptions without code;
- typo variants if supported.

### Follow-Up

How do you weight lexical vs vector results?

Tune against evaluation, not intuition.

---

# 11. Common Mistakes

1. Vector search used for everything.
2. Top-k fixed without evaluation.
3. ACL filter after model call.
4. Exact identifiers ignored.
5. Reranker added without measuring benefit.
6. Query rewriting assumed always helpful.
7. Embedding model changed without reindex plan.
8. Similarity score treated as calibrated confidence.

---

# 12. Best Practices

- understand query types;
- use metadata filters early;
- consider hybrid retrieval;
- rerank when measured gain exists;
- tune top-k;
- keep retrieval evaluation set;
- version embeddings/index.

---

# 13. Interview Questions

1. What are embeddings?
2. What is vector similarity?
3. What is ANN?
4. What is top-k?
5. Why metadata filters?
6. Semantic vs lexical search?
7. What is hybrid search?
8. What is reranking?
9. Recall vs precision?
10. When query rewriting helps?

---

# 14. Google-Level Follow-Ups

1. typo in product code?
2. multilingual search?
3. 100M vectors?
4. filter reduces recall?
5. reranker slow?
6. stale embedding model?
7. multiple corpora?
8. threshold/no-answer?

---

# 15. Quick Revision

```text
Vector = meaning
Lexical = exact terms
Hybrid = both
Filter security/metadata early
Top-k trades recall vs noise
Reranker trades latency/cost for precision
Similarity score ≠ confidence
Evaluate retrieval independently
```

---

# 16. Readiness Gate

- [ ] Embeddings.
- [ ] Vector search.
- [ ] Lexical search.
- [ ] Hybrid.
- [ ] Metadata filtering.
- [ ] Reranking.
- [ ] Recall/precision.
- [ ] Product-code drill.

**Gate:** READY / REPAIR

---

# 17. References

- Information retrieval references
- Vector similarity / ANN references
