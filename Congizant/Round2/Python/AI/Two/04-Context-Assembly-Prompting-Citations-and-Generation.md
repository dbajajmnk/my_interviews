# AI-02 / File 04 — Context Assembly, Prompting, Citations & Generation

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** Prompting + generation architecture

---

# 1. Objective

Master:

- context construction;
- deduplication;
- ordering;
- token budget;
- prompt grounding;
- citation mapping;
- no-answer behavior;
- answer generation;
- structured RAG responses;
- source attribution.

---

# 2. 5W+H

## What?

Context assembly converts retrieved candidates into a compact evidence package for the LLM.

## Why?

Good retrieval can still fail if context is noisy, duplicated, unauthorized, or exceeds token budget.

## Where?

Between retrieval/reranking and generation.

## When?

Every RAG request.

## How?

Select → deduplicate → order → budget → format → instruct → generate → validate.

---

# 3. Real-Life Analogy

A lawyer does not hand a judge a truckload of all case files.

They select the most relevant evidence, organize it, and cite the exact source.

---

# 4. Visualization

```text
Retrieved Chunks
      ↓
Deduplicate
      ↓
Select / Order
      ↓
Token Budget
      ↓
Context Blocks + Metadata
      ↓
Grounded Prompt
      ↓
LLM
      ↓
Answer + Citation IDs
```

---

# 5. Mind Map

```text
Context
│
├── Relevance
├── Dedup
├── Ordering
├── Token Budget
├── Source IDs
├── Grounding Prompt
├── No-Answer
└── Citation Validation
```

---

# 6. Core Concepts

## 6.1 Context Budget

Total context must fit model window:

```text
system instructions
+ user question
+ chat history
+ retrieved evidence
+ output budget
<= model context
```

---

## 6.2 Deduplication

Overlapping chunks may repeat the same sentence.

Too much duplication:

- wastes tokens;
- biases model toward repeated evidence.

---

## 6.3 Ordering

Possible strategies:

- highest relevance first;
- group by document/section;
- chronological when time matters.

Evaluate based on task.

---

## 6.4 Source Labels

Give each context block stable ID:

```text
[S1] Employee Handbook, page 12
...
[S2] Germany Leave Policy, section 4
...
```

Model can cite `[S1]`, `[S2]`.

Application maps IDs to trusted metadata.

---

## 6.5 Citation Validation

Do not allow model to invent arbitrary URL.

Better:

> model cites allowed source IDs; backend resolves them.

Validate cited IDs exist in supplied context.

---

## 6.6 No-Answer Behavior

Prompt:

```text
If provided sources do not contain enough evidence,
state that the answer is not available from the supplied sources.
```

Then evaluate whether model actually follows this.

---

## 6.7 Conflicting Context

If sources conflict:

- prefer authoritative/latest based on metadata policy;
- expose conflict rather than hallucinate certainty.

---

## 6.8 Structured RAG Response

Example:

```json
{
  "answer": "...",
  "citations": ["S1", "S3"],
  "insufficientEvidence": false
}
```

Validate schema and citation IDs.

---

# 7. Engineering Depth

## 7.1 Citation Correctness vs Citation Presence

A response can contain citations that do not support the claim.

Evaluation must measure:

- citation exists;
- citation points to retrieved source;
- cited source actually supports statement.

---

## 7.2 Context Compression

If candidates exceed budget:

- rerank;
- select sentences;
- summarize chunks;
- parent-child retrieval;
- metadata pruning.

Compression itself can lose evidence, so evaluate.

---

## 7.3 Prompt Injection in Retrieved Content

Context block may include malicious instruction.

Prompt/system design should explicitly treat retrieved documents as untrusted data.

But do not rely on prompt wording alone—security-sensitive tools/actions require deterministic controls.

---

# 8. Implementation / Code

Pseudo:

```python
def build_context(chunks, token_budget):
    selected = []
    used = 0

    for chunk in chunks:
        tokens = estimate_tokens(chunk.text)

        if used + tokens > token_budget:
            break

        selected.append(chunk)
        used += tokens

    return selected
```

Production version should account for deduplication, metadata, and exact tokenizer.

---

# 9. Hands-On Practice

Given 20 retrieved chunks and budget for 6, decide:

- duplicates;
- conflicting sources;
- latest version;
- section adjacency;
- citation IDs.

---

# 10. Google Interview Drill

## Problem — Answer Has Correct Facts but Wrong Citations

### Clarify

- model invents source URLs?
- source IDs in prompt?
- citations validated?
- duplicated chunks?

### First Approach

Prompt harder: “Do not hallucinate citations.”

Not enough.

### Improve

```text
backend assigns source IDs
→ prompt contains only allowed IDs
→ model returns IDs
→ backend validates IDs
→ UI maps IDs to source metadata
```

### Test

- unsupported claim;
- nonexistent source ID;
- one claim supported by multiple sources;
- conflicting sources.

### Follow-Up

Measure citation precision/recall separately from answer factuality.

---

# 11. Common Mistakes

1. Dump all retrieved chunks into prompt.
2. No token budget.
3. Duplicate evidence.
4. Model creates arbitrary URLs.
5. Citation presence treated as correctness.
6. No no-answer policy.
7. Conflicting sources ignored.
8. Retrieved text trusted as instructions.

---

# 12. Best Practices

- select/rerank before context;
- label sources;
- validate citations;
- reserve output budget;
- support insufficient-evidence response;
- treat retrieved documents as untrusted data;
- evaluate grounding/citation quality.

---

# 13. Interview Questions

1. How build RAG context?
2. How manage token budget?
3. Why deduplicate?
4. How design citations?
5. How prevent fake citations?
6. What is no-answer behavior?
7. How handle conflicting sources?
8. What is context compression?
9. How does prompt injection affect RAG?

---

# 14. Google-Level Follow-Ups

1. 100 relevant chunks?
2. latest source?
3. citation to deleted document?
4. multilingual evidence?
5. table evidence?
6. stream citations?
7. chat history plus RAG budget?
8. answer uses uncited general knowledge?

---

# 15. Quick Revision

```text
Retrieval result ≠ final context
Deduplicate + select + budget
Use backend-controlled source IDs
Validate model citations
No-answer is a feature
Conflicting evidence needs policy
Retrieved text is untrusted data
```

---

# 16. Readiness Gate

- [ ] Context budget.
- [ ] Dedup/order.
- [ ] Source IDs.
- [ ] Citation validation.
- [ ] No-answer.
- [ ] Conflicts.
- [ ] Wrong-citation drill.

**Gate:** READY / REPAIR

---

# 17. References

- RAG grounding/citation architecture references
- Prompt/security guidance
