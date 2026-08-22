# PY-04 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer/code without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 10 Minutes

Answer:

1. Google coding flow?
2. Time vs space complexity?
3. Hashing use cases?
4. Two pointers?
5. Sliding window?
6. Stack?
7. Queue/deque?
8. DFS vs BFS?
9. Why visited set?
10. Debugging flow?
11. What comes first in code review?
12. How do you evaluate AI-generated code?

---

# 2. Coding Round — 18 Minutes

## Problem A — Two Sum

Solve brute force, then optimize.

## Problem B — Longest Unique Substring

Use sliding window.

Required:

- explanation;
- code;
- tests;
- complexity.

---

# 3. DSA Reasoning — 8 Minutes

Given service dependency graph:

- determine reachability;
- explain DFS/BFS;
- state O(V+E);
- explain cycle handling.

---

# 4. Debugging / Review — 8 Minutes

Review:

```python
cache = {}

async def get_user(user_id):
    if user_id in cache:
        return cache[user_id]

    user = requests.get(
        f"https://users/{user_id}"
    ).json()

    cache[user_id] = user
    return user
```

Identify at least:

- blocking call in async;
- no timeout;
- local unbounded cache;
- stale data;
- no error handling;
- concurrency/stampede risk.

---

# 5. AI Evaluation — 8 Minutes

AI generates:

```python
def find_duplicates(values):
    duplicates = []
    for i in range(len(values)):
        for j in range(i + 1, len(values)):
            if values[i] == values[j]:
                duplicates.append(values[i])
    return duplicates
```

Evaluate:

- correctness semantics;
- duplicate output behavior;
- O(n²);
- potential optimized approaches;
- hashability assumption;
- test cases.

---

# 6. Architect Follow-Up — 8 Minutes

Take the cache example and answer:

1. How would you make HTTP non-blocking?
2. How would you bound concurrency?
3. How would you add timeout?
4. What if 100 requests miss same key?
5. How would distributed cache work?
6. How would you monitor it?
7. What tests would you require?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Problem Understanding & Explanation | 15% | ___ / 15 |
| Coding & Correctness | 25% | ___ / 25 |
| Complexity & Optimization | 15% | ___ / 15 |
| Debugging & Code Review | 20% | ___ / 20 |
| Google Interview Drill | 15% | ___ / 15 |
| AI Evaluation & Architect Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

PY-04 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] can reason before coding
- [ ] can produce clean Python
- [ ] can test edge cases
- [ ] can state complexity
- [ ] can apply hashing/two pointers/sliding window
- [ ] can traverse basic tree/graph
- [ ] can debug systematically
- [ ] can review code beyond style
- [ ] can evaluate AI-generated code critically
- [ ] can survive production follow-ups

---

# 9. Final Quick Notes

```text
Coding:
clarify → brute force → optimize → code → test → complexity → follow-up

Patterns:
hashing
two pointers
sliding window
stack
queue
DFS
BFS

Debug:
reproduce → evidence → isolate → hypothesis → fix → regression

Review:
correctness → security → concurrency/data → errors → performance → architecture → tests → readability

AI code:
never trust surface plausibility
verify requirement + correctness + edge cases + API + security + complexity + production fit
```

---

# 10. Decision

### READY

Move to:

> **Area 03 — Full Stack / FS-01 Python Backend & API Engineering**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
