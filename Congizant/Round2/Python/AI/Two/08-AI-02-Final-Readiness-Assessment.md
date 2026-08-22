# AI-02 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. What is RAG?
2. RAG vs fine-tuning?
3. RAG vs long-context prompt?
4. Offline vs online RAG pipeline?
5. What is chunking?
6. Why overlap?
7. What metadata matters?
8. How handle document updates?
9. What are embeddings?
10. Vector vs lexical search?
11. What is hybrid search?
12. What is reranking?
13. What is top-k?
14. Recall vs precision?
15. How build context?
16. How design citations?
17. What is no-answer behavior?
18. How secure RAG?
19. Where enforce ACL?
20. How handle deletion?
21. What is RAG golden dataset?
22. What is Recall@K?
23. What is groundedness?
24. How debug bad RAG answer?
25. Why version embeddings/index?
26. How reindex without downtime?
27. What RAG SLOs matter?

---

# 2. Ingestion Scenario — 8 Minutes

A 300-page policy manual is split strictly by page and RAG misses answers spanning page boundaries.

Explain:

- why page boundaries are artificial;
- chunking/overlap options;
- structure-aware chunking;
- parent/adjacent expansion;
- evaluation before/after.

---

# 3. Retrieval Scenario — 8 Minutes

Queries containing exact error codes fail with vector search.

Explain:

- lexical search;
- metadata;
- hybrid retrieval;
- reranking;
- evaluation.

---

# 4. Security Scenario — 8 Minutes

Tenant A sees Tenant B citation.

Treat as security incident.

Investigate:

- retrieval filter;
- cache key;
- metadata;
- citation resolver;
- stale ACL.

Define regression tests.

---

# 5. Google Interview Drill — 14 Minutes

## Design Enterprise RAG Knowledge Assistant

Requirements:

- 1M documents;
- 100k users;
- ACL;
- citations;
- 5-minute freshness;
- React + Python;
- 2k concurrent users;
- provider quotas.

Use:

> **Clarify → Ingest → Secure → Retrieve → Rerank → Context → Generate → Cite → Evaluate → Observe → Scale → Defend**

Expected:

```text
Sources
→ queue
→ parse/chunk
→ metadata/ACL
→ embed
→ versioned index

React
→ Python API
→ identity/ACL filter
→ hybrid retrieval
→ reranker
→ context builder
→ LLM
→ citation validation
→ stream
```

Include:

- no-answer;
- versioning;
- rollback;
- latency/cost;
- freshness;
- golden evaluation set.

---

# 6. Architect Follow-Up — 10 Minutes

Answer:

1. Why not fine-tune on all documents?
2. How choose chunk size?
3. Why hybrid search?
4. How prevent fake citations?
5. How detect stale index?
6. How handle embedding upgrade?
7. What if reranker is slow?
8. What if vector DB fails?
9. How enforce tenant isolation?
10. How prove RAG improved?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| RAG Foundations & Ingestion | 20% | ___ / 20 |
| Retrieval / Search / Reranking | 20% | ___ / 20 |
| Context / Grounding / Citations | 15% | ___ / 15 |
| Security / Freshness / Governance | 15% | ___ / 15 |
| Google Interview Drill | 15% | ___ / 15 |
| Evaluation / Production Architect Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

AI-02 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] RAG vs fine-tuning clear
- [ ] ingestion/chunking clear
- [ ] vector/hybrid/reranking clear
- [ ] context/citations clear
- [ ] ACL/freshness/delete clear
- [ ] evaluation metrics clear
- [ ] stage-by-stage debugging clear
- [ ] production RAG architecture defendable
- [ ] no buzzword-only answers

---

# 9. Final Quick Notes

```text
RAG = external knowledge at runtime

Offline:
parse → chunk → metadata → embed → index

Online:
authorize → retrieve → filter → rerank → context → generate → cite

Quality:
retrieval + generation both matter

Security:
ACL before model context

Evaluation:
Recall@K
Precision@K
groundedness
citation correctness
answer quality

Production:
freshness
versioning
rollback
latency
cost
quota
observability
```

---

# 10. Decision

### READY

Move to:

> **AI-03 — Agents, Evaluation & Production AI**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
