# PY-01 — Final Readiness Assessment

**Purpose:** Validate the complete PY-01 pack before moving to PY-02.  
**Rule:** Answer without notes first. Repair weak areas before moving forward.

---

# 1. Round 1 — Rapid Recall

Answer each in 30–60 seconds.

1. Is Python dynamically typed?
2. Is Python strongly typed?
3. What is duck typing?
4. What does assignment do?
5. `is` vs `==`?
6. Mutation vs rebinding?
7. Mutable vs immutable?
8. What is hashability?
9. Assignment vs shallow copy?
10. Shallow vs deep copy?
11. List vs tuple?
12. List vs set?
13. Set vs dict?
14. Why is dict lookup expected O(1)?
15. What is a positional-only argument?
16. What is a keyword-only argument?
17. `*args` vs `**kwargs`?
18. Why are mutable default arguments dangerous?
19. How does Python pass arguments?
20. What is LEGB?
21. `global` vs `nonlocal`?
22. What is a closure?
23. What is late binding?
24. When should a comprehension be avoided?

---

# 2. Round 2 — Predict the Output

## Q1

```python
a = [1, 2]
b = a
b.append(3)

print(a)
```

Expected:

```text
[1, 2, 3]
```

---

## Q2

```python
a = [1, 2]
b = a
b = [100]

print(a)
```

Expected:

```text
[1, 2]
```

---

## Q3

```python
a = [[1]]
b = a.copy()

b[0].append(2)

print(a)
```

Expected:

```text
[[1, 2]]
```

---

## Q4

```python
def add(x, items=[]):
    items.append(x)
    return items

print(add(1))
print(add(2))
```

Expected:

```text
[1]
[1, 2]
```

---

## Q5

```python
def modify(items):
    items.append(1)
    items = [99]

data = []
result = modify(data)

print(data)
print(result)
```

Expected:

```text
[1]
None
```

Reason:

- shared list mutated;
- local parameter rebound;
- function has no explicit return.

---

## Q6

```python
functions = []

for i in range(3):
    functions.append(lambda: i)

print([f() for f in functions])
```

Expected:

```text
[2, 2, 2]
```

---

# 3. Round 3 — Debugging

## Q1

Fix:

```python
def save(config={}):
    config["enabled"] = True
    return config
```

Target:

```python
def save(config=None):
    if config is None:
        config = {}

    config["enabled"] = True
    return config
```

---

## Q2

Review:

```python
if status is "READY":
    ...
```

Target:

```python
if status == "READY":
    ...
```

---

## Q3

Review:

```python
def create_user(*args, **kwargs):
    ...
```

Expected discussion:

- unclear required parameters;
- poor discoverability;
- difficult validation;
- weaker type checking;
- risky refactoring;
- use explicit parameters where contract is known.

---

# 4. Round 4 — Data Structure Decisions

Choose the best starting structure and explain why.

## Scenario A

Ordered audit events with duplicates.

**Answer:** list

## Scenario B

Unique permission names with frequent membership checks.

**Answer:** set

## Scenario C

Customer ID → customer object.

**Answer:** dict

## Scenario D

Fixed coordinate pair.

**Answer:** tuple

## Scenario E

Distributed shared user cache.

**Answer:** not simply a Python collection; likely an external cache/store depending on requirements.

This is an architect-level distinction.

---

# 5. Round 5 — Code Review

Review:

```python
cache = {}

def get_profile(user_id):
    if user_id in cache:
        return cache[user_id]

    profile = load_profile(user_id)
    cache[user_id] = profile
    return profile
```

Discuss:

- cache lifetime;
- stale data;
- unbounded memory;
- thread behavior;
- process isolation;
- restarts;
- invalidation;
- observability;
- whether distributed caching is required.

---

# 6. Round 6 — Google-Level Follow-Up Ladder

Start with:

```python
def update(data, cache={}):
    cache.update(data)
    return cache
```

Answer in sequence:

1. What is wrong?
2. Why does it happen?
3. Fix it.
4. Is the fixed version thread-safe?
5. Should this state live in the function?
6. What happens with multiple workers?
7. When would a distributed cache be appropriate?
8. How would cache invalidation work?
9. What new failures does Redis introduce?
10. What metrics would you monitor?
11. What is your fallback during cache outage?
12. How would you prevent a cache stampede?
13. How would security change for a distributed cache?
14. What consistency does the application require?
15. How would you test cache failure behavior?

Target flow:

> **Language → Code → Debug → Concurrency → Distributed State → Reliability → Observability → Security → Testing**

---

# 7. Round 7 — Architect Communication

Answer each in under two minutes.

## Q1

> Explain Python's parameter-passing model to a Java architect.

Target:

- concise;
- object references;
- mutation vs rebinding;
- one example.

## Q2

> Why would you choose a set rather than a list?

Target:

- semantics;
- membership;
- uniqueness;
- complexity;
- requirement caveats.

## Q3

> Why would you avoid `deepcopy()` in a large service model?

Target:

- memory;
- cost;
- object graph;
- ownership;
- external resources;
- design clarity.

## Q4

> Why can `**kwargs` hurt API design?

Target:

- contract;
- typing;
- validation;
- discoverability;
- refactoring.

---

# 8. Final Quick Notes

```text
Dynamic + strong typing
Name → object
Assignment ≠ copy
== equality
is identity
Mutation ≠ rebinding
Mutable: list/dict/set
Immutable: int/str/tuple
Shallow copy shares nested references
Deep copy is not default architecture
Dict/Set expected O(1)
Collections chosen by semantics first
Defaults evaluated once at definition
Avoid mutable defaults
Python parameter passing = call-by-sharing
LEGB
global ≠ nonlocal
Closure retains enclosing bindings
Late binding can surprise
Readable comprehensions only
Local memory ≠ distributed state
```

---

# 9. Final PY-01 Readiness Gate

Mark each only after answering without notes.

| Capability | Status |
|---|---|
| Dynamic + strong typing | ⬜ |
| Duck typing | ⬜ |
| Names/object binding | ⬜ |
| `is` vs `==` | ⬜ |
| Mutation vs rebinding | ⬜ |
| Mutability | ⬜ |
| Hashability | ⬜ |
| Shallow/deep copy | ⬜ |
| Collection selection | ⬜ |
| Dict/set complexity | ⬜ |
| Function parameter styles | ⬜ |
| `*args/**kwargs` | ⬜ |
| Mutable default bug | ⬜ |
| Parameter passing | ⬜ |
| LEGB | ⬜ |
| `global/nonlocal` | ⬜ |
| Closure | ⬜ |
| Late binding | ⬜ |
| API design review | ⬜ |
| Local vs distributed state | ⬜ |
| Google-level follow-up survival | ⬜ |

---

# 10. Decision

## READY

Move to:

> **PY-02 — Advanced Python, OOP, Decorators, Iterators, Generators, Context Managers, Typing, SOLID & GoF**

## REPAIR

Return only to the weak file/topic. Do not repeat the entire pack.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**


---

# 11. Google-Level Lock Check

Before PY-01 is considered complete, confirm that you can perform the interview reasoning sequence without prompting:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity → Trade-Off → Follow-Up → Defend**

- [ ] Language-foundation drill completed
- [ ] Collection/data-structure drill completed
- [ ] Function/API-design drill completed
- [ ] Can explain trade-offs without memorized wording
- [ ] Can move from Python code to production architecture when asked

**Final Decision:** READY / REPAIR


---

# 12. Timed Final Assessment

Complete this assessment in **60 minutes**.

## Section A — Concept & Explanation — 12 minutes

Answer without notes:

1. Python dynamic vs strong typing
2. Name binding vs assignment copying
3. Mutation vs rebinding
4. `is` vs `==`
5. Mutable vs immutable
6. Python parameter-passing semantics

## Section B — Code / Prediction — 12 minutes

Solve output-prediction questions from this pack and explain **why**, not only the result.

## Section C — Debugging & Review — 12 minutes

Review and repair:

- mutable default argument
- incorrect identity comparison
- weak `*args/**kwargs` public API
- shared mutable state

## Section D — Google Interview Drill — 15 minutes

Take one simple Python problem and follow:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity → Trade-Off**

## Section E — Architect Follow-Up — 9 minutes

Extend the problem into:

- concurrency
- multiple workers
- cache/state ownership
- distributed state
- failure handling
- observability

---

# 13. Final Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Concept Understanding & Explanation | 20% | ___ / 20 |
| Code / Output Prediction | 20% | ___ / 20 |
| Debugging & Code Review | 20% | ___ / 20 |
| Google Interview Drill | 25% | ___ / 25 |
| Follow-Up & Architect-Level Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

## Readiness Rule

### READY

- **80%+ overall**
- No critical P0 weakness
- Able to explain without notes
- Able to code/debug under interview pressure
- Able to survive follow-up questions

### REPAIR

Any of the following:

- score below 80%
- weak P0 topic
- explanation depends on memorized wording
- code can be written but not defended
- inability to handle edge cases/trade-offs/follow-ups

### Repair Rule

> **Repair the gap, not the complete pack.**
