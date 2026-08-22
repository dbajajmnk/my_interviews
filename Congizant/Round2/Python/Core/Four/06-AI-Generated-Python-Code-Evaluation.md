# PY-04 / File 06 — AI-Generated Python Code Evaluation

**Priority:** P0  
**Suggested Time:** 50 minutes  
**GOJ Mapping:** M16 AI-Generated Code Evaluation

---

# 1. Objective

Be able to evaluate AI-generated Python code for:

- correctness;
- requirement fit;
- hidden assumptions;
- security;
- performance;
- concurrency;
- API misuse;
- dependency hallucination;
- test coverage;
- maintainability;
- production readiness.

This is highly relevant to an AI-enabled architect role.

---

# 2. 5W+H

## What?

AI code evaluation means treating generated code as an untrusted engineering proposal until verified.

## Why?

Generated code can look convincing while containing:

- subtle bugs;
- nonexistent APIs;
- insecure patterns;
- wrong complexity;
- broken edge cases.

## Where?

Copilots, LLM assistants, code-generation workflows, AI evaluation projects.

## When?

Every time generated code enters engineering workflow.

## How?

Use evidence-based review + tests + documentation verification.

---

# 3. Real-Life Analogy

AI-generated code is like code from a very fast new contractor.

It may be excellent.

It still requires review.

---

# 4. Visualization

```text
AI Output
   ↓
Requirement Check
   ↓
Compile / Run
   ↓
Correctness Tests
   ↓
Edge Cases
   ↓
Security Review
   ↓
Performance Review
   ↓
API / Dependency Verification
   ↓
Production Decision
```

---

# 5. Mind Map

```text
AI Code Review
│
├── Requirement Fit
├── Correctness
├── Hallucinated API
├── Security
├── Performance
├── Concurrency
├── Tests
├── Maintainability
└── Production Readiness
```

---

# 6. Core Concepts

## 6.1 Never Trust Surface Plausibility

Code can look professional and still be wrong.

Verify behavior.

---

## 6.2 Requirement Fit

Ask:

- did model solve actual problem?
- did it invent assumptions?
- did it omit constraints?
- did it change semantics?

---

## 6.3 Hallucinated APIs

Generated code may call:

- nonexistent methods;
- outdated library APIs;
- wrong parameters;
- wrong async behavior.

Verify against official docs when necessary.

---

## 6.4 Security

Look for:

- string-built SQL;
- shell injection;
- unsafe `eval`;
- hard-coded secrets;
- weak authorization;
- unsafe deserialization;
- path traversal;
- secret logging.

---

## 6.5 Performance

AI often produces correct but inefficient code:

- O(n²) when O(n) available;
- full list materialization;
- repeated DB/API calls;
- unbounded concurrency;
- unnecessary deep copies.

---

## 6.6 Testing

Generated tests may repeat implementation assumptions rather than independently validate requirements.

Include:

- normal;
- edge;
- negative;
- failure;
- concurrency where relevant.

---

# 7. Engineering Depth

## 7.1 Evaluation Rubric

For every AI-generated solution:

```text
1. Requirement
2. Correctness
3. Edge Cases
4. Complexity
5. Security
6. Reliability
7. API Validity
8. Maintainability
9. Tests
10. Production Fit
```

---

## 7.2 AI Can Review AI — But Human Owns Decision

A second model can find issues, but it is not an independent proof.

Critical code still needs deterministic tests/review.

---

# 8. Implementation / Code

AI-generated example:

```python
def unique(values):
    result = []
    for value in values:
        if value not in result:
            result.append(value)
    return result
```

Correct for preserving first occurrence order, but O(n²) membership behavior.

Potential better form:

```python
def unique(values):
    return list(dict.fromkeys(values))
```

But only if elements are hashable and semantics fit.

This is exactly why review needs constraints.

---

# 9. Hands-On Practice

Evaluate:

```python
async def fetch_all(urls):
    return await asyncio.gather(
        *(client.get(url) for url in urls)
    )
```

Questions:

- unlimited concurrency?
- timeout?
- failure policy?
- connection pool?
- cancellation?
- client API actually async?
- thousands of URLs?

---

# 10. Google Interview Drill

## Problem — AI Generated an API Cache

```python
cache = {}

async def get_product(product_id):
    if product_id in cache:
        return cache[product_id]

    product = requests.get(
        f"https://service/products/{product_id}"
    ).json()

    cache[product_id] = product
    return product
```

### Review

Problems:

1. blocking `requests` call inside async function;
2. no timeout;
3. no error handling;
4. process-local unbounded cache;
5. stale cache;
6. no concurrency protection/stampede handling;
7. no response validation;
8. no cancellation integration;
9. possible URL/input concerns depending on design.

### Improve

Use async HTTP client or thread bridge; timeout; bounded/TTL cache; response validation.

### Follow-Up

At distributed scale:

- Redis?
- cache-aside?
- TTL?
- stampede protection?
- fallback?
- observability?

### Goal

> Evaluate beyond syntax and reach production behavior.

---

# 11. Common Mistakes

1. Trusting generated code because it runs.
2. Ignoring requirement mismatch.
3. Not checking docs.
4. Accepting generated tests blindly.
5. Missing injection/security.
6. Missing complexity.
7. Missing concurrency explosion.
8. Missing lifecycle/state ownership.
9. “AI said so” as justification.

---

# 12. Best Practices

- treat output as draft;
- require tests;
- verify APIs;
- review complexity;
- review security;
- compare against requirements;
- keep human accountability;
- use static analysis/CI.

---

# 13. Interview Questions

1. How do you review AI-generated code?
2. What are common hallucinations?
3. Can generated tests be trusted?
4. How do you validate library usage?
5. What security risks do you check?
6. How do you evaluate complexity?
7. How do you use AI safely in code review?

---

# 14. Google-Level Follow-Ups

1. How automate evaluation?
2. Static analysis?
3. sandbox execution?
4. unit/integration tests?
5. dependency vulnerability scan?
6. policy gates?
7. human approval?
8. audit trail?

---

# 15. Quick Revision

```text
AI code = untrusted proposal
Check:
requirement
correctness
edge cases
complexity
security
API validity
concurrency
tests
maintainability
production fit
```

---

# 16. Readiness Gate

- [ ] Evaluate requirement fit.
- [ ] Detect hallucinated API risk.
- [ ] Detect security issues.
- [ ] Detect complexity issue.
- [ ] Detect async blocking.
- [ ] Detect unbounded concurrency/cache.
- [ ] Define automated + human gates.

**Gate:** READY / REPAIR

---

# 17. References

- Python official documentation
- OWASP secure coding guidance
- Relevant library official documentation
