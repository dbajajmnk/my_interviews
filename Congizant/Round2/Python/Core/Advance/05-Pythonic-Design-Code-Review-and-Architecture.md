# PY-02 / File 05 — Pythonic Design, Code Review & Architecture

**Priority:** P0  
**Suggested Time:** 45 minutes  
**GOJ Mapping:** M15 Code Review & Refactoring + M21 architecture bridge

---

# 1. Objective

Be able to:

- recognize non-Pythonic over-engineering;
- review class design;
- simplify abstractions;
- identify hidden state and coupling;
- improve dependency boundaries;
- reason about maintainability;
- connect Python design to architecture.

---

# 2. 5W+H

## What?

Pythonic design means using Python's strengths while preserving sound engineering principles.

## Why?

A design copied mechanically from Java/C++ can create unnecessary ceremony in Python.

## Where?

- services;
- domain models;
- libraries;
- integrations;
- AI pipelines;
- application architecture.

## When?

During design, refactoring, code review, and architecture evolution.

## How?

Use simple language features, narrow contracts, composition, first-class functions, context managers, generators, protocols, and clear ownership.

---

# 3. Real-Life Analogy

Do not wear a winter coat in summer simply because it is a good coat.

A design can be “good” in one ecosystem and unnecessarily heavy in another.

---

# 4. Visualization

```text
Requirement
   ↓
Simple Python
   ↓
Real Change Pressure?
 ┌───┴───┐
 No     Yes
 │       │
Keep    Add focused
simple  abstraction
```

---

# 5. Mind Map

```text
Pythonic Design
│
├── Simplicity
├── Explicit contracts
├── Composition
├── Functions
├── Protocols
├── Resource ownership
├── Dependency injection
├── Refactoring
└── Code review
```

---

# 6. Core Concepts

## 6.1 Explicit Is Better Than Hidden

Avoid hidden global dependencies.

Better:

```python
class UserService:
    def __init__(self, repository):
        self.repository = repository
```

than importing/constructing infrastructure everywhere.

---

## 6.2 Functions Before Unnecessary Classes

If behavior is stateless and simple, a function may be the best abstraction.

---

## 6.3 Narrow Dependencies

Depend on exactly what is needed.

A service needing `get_user()` does not need an entire “God repository” with 50 methods.

---

## 6.4 Pure Functions Where Useful

Pure functions are easier to:

- test;
- reason about;
- parallelize;
- reuse.

Not every operation can or should be pure.

---

## 6.5 Side Effects at Boundaries

A useful architecture tendency:

```text
Core logic
   ↓
mostly deterministic
   ↓
Boundary adapters
   ├── DB
   ├── API
   ├── Queue
   └── File
```

This improves testability.

---

# 7. Engineering Depth

## 7.1 Code Review Questions

When reviewing Python architecture ask:

- Is state ownership clear?
- Is mutation intentional?
- Is this class necessary?
- Is inheritance justified?
- Is dependency hidden?
- Is contract too broad?
- Can a function/protocol simplify it?
- Are resources cleaned up?
- Are failures explicit?
- Is async/concurrency handled correctly? (PY-03)

---

## 7.2 Refactoring Signal

Bad signs:

- class hierarchy > domain complexity;
- dozens of one-method classes;
- global singleton services;
- broad `**kwargs`;
- hidden imports for dependencies;
- decorators hiding business flow;
- ABCs with one implementation forever and no reason.

---

# 8. Implementation / Code

Over-engineered:

```python
class DiscountStrategyFactory:
    @staticmethod
    def create(kind):
        if kind == "ten":
            return TenPercentDiscountStrategy()
```

Potentially simpler:

```python
DISCOUNTS = {
    "ten": lambda amount: amount * 0.90,
}
```

The simple form may be sufficient.

---

# 9. Hands-On Practice

Review this design:

```python
class DatabaseSingleton:
    _instance = None

    @classmethod
    def instance(cls):
        if cls._instance is None:
            cls._instance = cls()
        return cls._instance
```

Discuss:

- thread concerns;
- testability;
- lifecycle;
- multi-process behavior;
- connection pooling;
- explicit dependency injection.

---

# 10. Google Interview Drill

## Problem — Refactor a Rigid Order Service

```python
class OrderService:
    def create(self, order):
        db = MySQLRepository()
        db.save(order)

        email = EmailClient()
        email.send(order.email)
```

### Clarify

Need:

- testability;
- alternative database;
- notification changes;
- failure handling.

### First Improvement

Inject dependencies:

```python
class OrderService:
    def __init__(self, repository, notifier):
        self.repository = repository
        self.notifier = notifier
```

### Test

Use fakes.

### Edge Cases

- DB succeeds, notification fails;
- duplicate request;
- retry;
- transaction boundary.

### Trade-Off

Do not create 12 abstraction layers around two stable dependencies.

### Follow-Up

At scale:

- outbox pattern?
- asynchronous notification?
- idempotency?
- distributed transaction avoidance?
- observability?

---

# 11. Common Mistakes

1. Equating “Pythonic” with short code.
2. Removing useful architecture in the name of simplicity.
3. Creating needless classes.
4. Hiding dependencies.
5. Global singleton state.
6. Overusing decorators.
7. Wide interfaces.
8. Ignoring failure semantics.

---

# 12. Best Practices

- simplest sufficient abstraction;
- explicit dependency boundaries;
- narrow contracts;
- composition;
- test with fakes;
- keep side effects visible;
- refactor from evidence, not fashion;
- optimize clarity for the team.

---

# 13. Interview Questions

1. What does Pythonic design mean?
2. When use function vs class?
3. How do you avoid over-engineering?
4. How do you design testable Python services?
5. Why explicit dependency injection?
6. Why is Singleton risky?
7. Where should side effects live?
8. What do you check in a Python code review?

---

# 14. Google-Level Follow-Ups

From OrderService:

1. What if DB commit succeeds but email fails?
2. Should email be synchronous?
3. How would queue help?
4. How prevent duplicate notification?
5. What is outbox pattern?
6. How do you trace request across services?
7. How do you test failure scenarios?
8. What happens during retry?

---

# 15. Quick Revision

```text
Pythonic ≠ clever
Simple ≠ simplistic
Functions for stateless behavior
Composition for variable behavior
Protocols for narrow contracts
Explicit dependencies
Visible side effects
Avoid global singleton state
Refactor based on real change pressure
```

---

# 16. Readiness Gate

- [ ] Recognize class overuse.
- [ ] Explain dependency injection.
- [ ] Review Singleton.
- [ ] Simplify pattern-heavy code.
- [ ] Design testable service.
- [ ] Handle failure follow-ups.
- [ ] Defend KIS without sacrificing architecture.

**Gate:** READY / REPAIR

---

# 17. References

- Python Data Model
- PEP 8
- Python `typing`
- Python `abc`
