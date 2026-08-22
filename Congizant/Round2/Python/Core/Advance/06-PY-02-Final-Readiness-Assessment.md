# PY-02 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes. Repair only weak areas.

---

# 1. Round 1 — Rapid Recall

Answer each in 30–60 seconds:

1. Class vs instance?
2. Class attribute vs instance attribute?
3. Instance/class/static method?
4. Inheritance vs composition?
5. What is MRO?
6. What does `super()` do?
7. Dataclass use case?
8. What is a decorator?
9. Why `functools.wraps`?
10. Iterator protocol?
11. Generator?
12. Generator vs list?
13. Context manager?
14. Type hints: runtime or static?
15. ABC vs Protocol?
16. Structural typing?
17. SRP?
18. OCP?
19. LSP?
20. ISP?
21. DIP?
22. Strategy pattern?
23. Adapter?
24. Factory?
25. Facade?
26. Proxy?
27. Observer?
28. State?
29. Command?
30. Chain of Responsibility?
31. Why Singleton can be harmful?
32. What does Pythonic design mean?

---

# 2. Round 2 — Coding

## Q1 — Decorator

Implement a decorator that logs execution time and preserves metadata.

## Q2 — Generator

Implement a generator returning only error records from an iterable.

## Q3 — Protocol

Create a narrow storage protocol with `save` and `load`.

## Q4 — Composition

Refactor a service that creates its own repository and notifier.

---

# 3. Round 3 — Debugging & Code Review

## Q1

```python
class Team:
    members = []
```

Identify risk.

## Q2

```python
def retry(func):
    try:
        return func()
    except Exception:
        return func()
```

Review:

- catches everything;
- exactly one implicit retry;
- no backoff;
- no idempotency;
- no observability;
- second failure behavior.

## Q3

```python
class PaymentServiceFactoryManager:
    ...
```

Ask whether abstraction is solving a real problem.

---

# 4. Round 4 — SOLID / Pattern Selection

Choose and defend.

## Scenario A

Third-party SDK has incompatible API.

**Likely:** Adapter

## Scenario B

Runtime-selectable algorithm.

**Likely:** Strategy / callable

## Scenario C

Simplify complex AI subsystem behind one interface.

**Likely:** Facade

## Scenario D

Build provider implementation based on configuration.

**Likely:** factory function / Factory Method as complexity grows

## Scenario E

Request passes through validators/middleware.

**Likely:** Chain of Responsibility

## Scenario F

Need one global database connection.

**Do not automatically choose:** Singleton

Discuss application lifecycle and pooling.

---

# 5. Round 5 — Google Interview Drill

## Design Multiple AI Provider Support

Requirements:

- OpenAI;
- Azure OpenAI;
- future providers;
- provider fallback;
- testability.

Use this reasoning flow:

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Trade-Off → Follow-Up → Defend**

Expected design reasoning:

- Adapter for provider SDK differences;
- narrow Protocol for capability;
- Strategy/callable for routing;
- simple factory for construction;
- Facade only if subsystem complexity warrants it.

Do not create patterns merely to name patterns.

---

# 6. Round 6 — Architect Follow-Ups

Answer:

1. What if provider timeout occurs?
2. What if rate limit occurs?
3. Which failures should retry?
4. How do you prevent duplicate side effects?
5. How do you monitor provider latency?
6. How do you measure cost?
7. How do you enable fallback?
8. How do you prevent vendor lock-in?
9. How do you support streaming?
10. How do you test provider outage?

---

# 7. Timed Assessment Plan

| Section | Time |
|---|---:|
| Rapid Recall | 12 min |
| Coding | 15 min |
| Debug/Review | 10 min |
| Google Design Drill | 15 min |
| Architect Follow-Ups | 8 min |
| **Total** | **60 min** |

---

# 8. Final Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Concept Understanding & Explanation | 20% | ___ / 20 |
| Code / Design Implementation | 20% | ___ / 20 |
| Debugging & Code Review | 20% | ___ / 20 |
| Google Interview Drill | 25% | ___ / 25 |
| Architect-Level Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

---

# 9. Readiness Gate

To mark PY-02 READY:

- [ ] 80%+ total
- [ ] No P0 weakness
- [ ] Can explain OOP trade-offs
- [ ] Can code decorator/generator
- [ ] Can explain ABC vs Protocol
- [ ] Can apply SOLID pragmatically
- [ ] Can recognize relevant GoF pattern
- [ ] Can offer Pythonic alternative
- [ ] Can reject over-engineering
- [ ] Can defend AI-provider design

### READY

Move to PY-03.

### REPAIR

Repair only failed areas.

---

# 10. Final Quick Notes

```text
OOP = model state + behavior
Prefer composition for variable behavior
MRO controls lookup
super() follows MRO
Decorator wraps callable
Generator = lazy yield
Context manager = deterministic resource lifecycle
Hints = static contracts, not runtime validation
ABC = nominal
Protocol = structural
SOLID = principles, not dogma
GoF = vocabulary for recurring design problems
Python can implement patterns with less ceremony
Singleton often hides global state
Pattern intent > pattern boilerplate
```

---

# 11. Next Pack

> **PY-03 — Runtime, Memory, GIL, Threading, Multiprocessing & Asyncio**
