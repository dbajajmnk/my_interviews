# PY-04 / File 05 — Code Review, Refactoring & Pythonic Optimization

**Priority:** P0  
**Suggested Time:** 50 minutes  
**GOJ Mapping:** M15 Code Review & Refactoring

---

# 1. Objective

Review Python code across:

- correctness;
- readability;
- complexity;
- duplication;
- API design;
- mutation;
- error handling;
- security;
- performance;
- testability;
- concurrency;
- production behavior.

---

# 2. 5W+H

## What?

Code review is engineering risk reduction, not formatting policing.

## Why?

It prevents defects, spreads knowledge, improves maintainability, and protects architecture.

## Where?

Pull requests, architecture reviews, incident fixes, AI-generated code review.

## When?

Before merge and during refactoring.

## How?

Review from correctness outward.

---

# 3. Real-Life Analogy

Inspect a building in this order:

> foundation → structure → safety → efficiency → paint.

Do not argue about formatting while correctness is broken.

---

# 4. Visualization

```text
Review Order
│
├── Correctness
├── Security
├── Data / Concurrency
├── Error Handling
├── Complexity
├── Architecture
├── Tests
├── Readability
└── Style
```

---

# 5. Mind Map

```text
Code Review
│
├── Correctness
├── Maintainability
├── Performance
├── Security
├── Testing
├── Concurrency
└── Refactoring
```

---

# 6. Core Concepts

## 6.1 Correctness First

Ask:

- does it solve requirement?
- invalid input?
- edge cases?
- race?
- partial failure?

---

## 6.2 Readability

Prefer:

```python
if user is None:
    return
```

over overly clever one-liners.

---

## 6.3 Duplication

DRY does not mean abstract every repeated two lines.

Abstract repeated **knowledge/behavior** when change together matters.

---

## 6.4 Error Handling

Bad:

```python
try:
    ...
except Exception:
    pass
```

Problems:

- hides failure;
- corrupts flow;
- destroys observability.

---

## 6.5 Security

Check:

- input validation;
- injection;
- secret handling;
- unsafe deserialization;
- path handling;
- authorization;
- sensitive logging.

---

## 6.6 Performance

Look for:

- nested loops;
- repeated DB calls;
- repeated conversions;
- accidental full materialization;
- blocking calls;
- unbounded collections.

---

# 7. Engineering Depth

## 7.1 Refactoring Rule

Refactoring changes structure while preserving intended externally observable behavior.

Use tests as safety net.

---

## 7.2 Pythonic Does Not Mean Shortest

Bad:

```python
result = [x for x in data if x and condition(x) and transform(x)]
```

if it obscures intent.

Clear code wins.

---

# 8. Implementation / Code

## N+1 Style Example

Bad conceptual flow:

```python
for user in users:
    orders = repository.load_orders(user.id)
```

Could trigger one query per user.

Review should identify data-access pattern, not only Python syntax.

---

# 9. Hands-On Practice

Review:

```python
def process(items, cache={}):
    result = []

    try:
        for item in items:
            if item not in cache:
                cache[item] = expensive(item)
            result.append(cache[item])
    except Exception:
        return []

    return result
```

Find:

- mutable default;
- broad exception;
- hidden cache lifecycle;
- possibly unbounded cache;
- no logging;
- unclear failure semantics.

---

# 10. Google Interview Drill

## Problem — Review an AI-Generated Function

```python
def get_users(ids, db):
    users = []
    for id in ids:
        user = db.execute(f"SELECT * FROM users WHERE id={id}")
        users.append(user)
    return users
```

### Review

Problems:

- SQL injection risk depending on IDs/source;
- N queries;
- variable shadows built-in `id`;
- no error handling policy;
- no batching;
- unclear result shape.

### Improve

Use parameterized/batched query.

### Test

- empty IDs;
- duplicates;
- invalid IDs;
- DB error;
- large IDs list.

### Follow-Up

- query parameter limits;
- pagination;
- authorization;
- tracing;
- DB connection pool.

---

# 11. Common Mistakes

1. Reviewing style before correctness.
2. “DRY” over-abstraction.
3. Silent exception swallowing.
4. Ignoring security.
5. Ignoring DB/network behavior.
6. Clever code.
7. Refactor without tests.
8. Assuming AI-generated code is correct.

---

# 12. Best Practices

- correctness first;
- explain review comments;
- propose simplest safer alternative;
- distinguish must-fix vs suggestion;
- review system behavior, not only line syntax;
- preserve behavior with tests.

---

# 13. Interview Questions

1. What do you review first?
2. DRY vs over-abstraction?
3. What is safe refactoring?
4. How do you review performance?
5. How do you review async code?
6. How do you review DB code?
7. How do you review security?
8. How do you review generated code?

---

# 14. Google-Level Follow-Ups

1. How would you batch IDs?
2. What if list has 100k IDs?
3. How do you authorize each record?
4. What if DB partly fails?
5. How do you measure query improvement?
6. How do you prevent regression?

---

# 15. Quick Revision

```text
Review:
correctness
→ security
→ data/concurrency
→ errors
→ complexity
→ architecture
→ tests
→ readability
→ style
```

---

# 16. Readiness Gate

- [ ] Review correctness first.
- [ ] Detect mutable default.
- [ ] Detect broad exception.
- [ ] Detect SQL risk.
- [ ] Detect N+1.
- [ ] Propose simple refactor.
- [ ] Explain regression safety.

**Gate:** READY / REPAIR

---

# 17. References

- PEP 8
- Python exception documentation
- OWASP guidance for application review
