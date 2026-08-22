# AI-01 / File 02 — Tokens, Context, Embeddings & Inference

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** Emerging AI Core

---

# 1. Objective

Master:

- tokenization;
- token count;
- context window;
- prompt + output token budget;
- truncation;
- embeddings;
- similarity intuition;
- inference controls;
- temperature/top-p awareness;
- latency/cost relationship.

---

# 2. 5W+H

## What?

LLMs operate on tokens, not raw human concepts. Context window limits how much tokenized information can be processed at once.

Embeddings map content into vectors where semantic similarity can be compared.

## Why?

These concepts directly affect:

- cost;
- latency;
- RAG;
- prompt design;
- long-document processing.

## Where?

Every LLM application.

## When?

Whenever designing prompts, retrieval, document workflows, or budget controls.

## How?

Text → tokens → model context; text/chunks → embedding vectors for semantic comparison.

---

# 3. Real-Life Analogy

Context window is like the amount of material you can place on a desk at one time.

A larger desk helps, but dumping every document onto it can still make work slower, more expensive, and less focused.

---

# 4. Visualization

```text
Text
 ↓
Tokenizer
 ↓
[Token1, Token2, Token3, ...]
 ↓
Context Window
 ├── system/instructions
 ├── conversation
 ├── retrieved context
 └── output budget
```

Embedding:

```text
"car"   → [ ...vector... ]
"auto"  → [ ...vector... ]
"banana"→ [ ...vector... ]

car ~ auto > banana
```

---

# 5. Mind Map

```text
Inference Inputs
│
├── Tokens
├── Context Window
├── Prompt Budget
├── Output Budget
├── Embeddings
├── Temperature
└── Sampling
```

---

# 6. Core Concepts

## 6.1 Token

A token is a model-specific unit of text.

It may represent:

- whole word;
- word fragment;
- punctuation;
- whitespace pattern.

Token count is not equal to character count or word count.

---

## 6.2 Context Window

Maximum token sequence model can consider per request, including input and output budget depending model/API semantics.

Architect rule:

> Context is a finite resource.

---

## 6.3 Long Context Is Not Free

Larger input can increase:

- latency;
- cost;
- irrelevant distraction;
- retrieval noise.

Do not solve every knowledge problem by sending entire document repository.

---

## 6.4 Embedding

An embedding is a numeric vector representation used to capture semantic characteristics.

Use cases:

- semantic search;
- clustering;
- similarity;
- retrieval.

---

## 6.5 Similarity

Common measure:

- cosine similarity;
- dot product;
- Euclidean distance depending model/store.

Do not assume one metric fits every embedding model/index.

---

## 6.6 Embeddings Are Not Generated Answers

Embedding model:

> maps content to vector.

Generation model:

> produces text/code/output.

They serve different roles.

---

## 6.7 Temperature

Conceptually controls randomness in token sampling.

Lower:

- more focused/repeatable tendency.

Higher:

- more varied/creative tendency.

Exact behavior varies by API/model.

Do not say `temperature=0` guarantees mathematical determinism across every provider/runtime.

---

## 6.8 Top-p

Nucleus sampling restricts candidate probability mass.

In many production apps:

> tune minimally; do not randomly manipulate both temperature and top-p without reason.

---

## 6.9 Output Length

Long output means:

- more tokens;
- more latency;
- more cost;
- higher chance of unnecessary content.

Specify concise output where appropriate.

---

# 7. Engineering Depth

## 7.1 Context Engineering

Good context is:

- relevant;
- authoritative;
- concise;
- structured;
- permission-filtered.

More context is not automatically better context.

---

## 7.2 Embedding Versioning

If embedding model changes, vectors may no longer be directly comparable.

Production systems may need:

- re-embedding;
- versioned indexes;
- migration plan.

This becomes more important in AI-02.

---

## 7.3 Token Budget

Example design:

```text
Model context = fixed capacity

system instructions
+ conversation
+ retrieved context
+ user question
+ expected answer
<= context capacity
```

Need truncation/summarization policy.

---

# 8. Implementation / Code

```python
def estimate_request_budget(
    system_tokens,
    history_tokens,
    context_tokens,
    user_tokens,
    output_budget,
):
    return (
        system_tokens
        + history_tokens
        + context_tokens
        + user_tokens
        + output_budget
    )
```

The actual tokenizer should be provider/model-compatible.

---

# 9. Hands-On Practice

Question:

> You have a 500-page manual. Should you send all of it to the LLM for every question?

Strong answer:

> Usually no. Retrieve relevant sections, summarize where appropriate, and use context budget intentionally.

---

# 10. Google Interview Drill

## Problem — Chat History Exceeds Context Window

### Clarify

- must preserve full history?
- regulatory/audit storage separate?
- how much recent context matters?
- can older turns be summarized?
- retrieval from conversation history?

### First Approach

Drop oldest messages blindly.

Can lose important constraints.

### Improve

Possible strategy:

```text
System instructions
+ recent turns
+ structured memory/summary
+ retrieved relevant old turns
+ current user question
```

### Edge Cases

- summary loses critical detail;
- user corrects earlier fact;
- privacy deletion;
- token budget spike.

### Follow-Up

How do you evaluate summary quality?

Compare downstream answer quality on representative conversations.

---

# 11. Common Mistakes

1. Token = word.
2. Larger context always better.
3. Embedding = generation.
4. `temperature=0` claimed universally deterministic.
5. Ignoring output tokens in budget.
6. No truncation policy.
7. Re-embedding implications ignored.

---

# 12. Best Practices

- measure tokens;
- keep context focused;
- reserve output budget;
- use embeddings for semantic retrieval;
- version embedding strategy;
- tune sampling conservatively.

---

# 13. Interview Questions

1. What is a token?
2. What is context window?
3. Why token count matters?
4. What is embedding?
5. Embedding vs LLM generation?
6. Cosine similarity?
7. Temperature?
8. Top-p?
9. Why long context can hurt?
10. How manage chat history?

---

# 14. Google-Level Follow-Ups

1. 1M-token document?
2. model migration?
3. embedding migration?
4. multilingual embeddings?
5. token cost controls?
6. summarize vs retrieve?
7. conversation memory?

---

# 15. Quick Revision

```text
Model reads tokens
Context window is finite
More context ≠ better
Embedding = semantic vector
Generation ≠ embedding
Temperature affects sampling variability
Token budget affects latency + cost
History needs memory/summarization/retrieval strategy
```

---

# 16. Readiness Gate

- [ ] Token.
- [ ] Context window.
- [ ] Embedding.
- [ ] Similarity.
- [ ] Temperature/top-p.
- [ ] Token budget.
- [ ] Chat-history drill.

**Gate:** READY / REPAIR

---

# 17. References

- Provider tokenizer documentation
- Embedding/vector similarity references
