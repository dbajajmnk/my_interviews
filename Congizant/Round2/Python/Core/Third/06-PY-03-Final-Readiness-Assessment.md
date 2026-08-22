# PY-03 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes. Repair only weak areas.

---

# 1. Rapid Recall

Answer each in 30–60 seconds:

1. How does CPython execute source?
2. What is bytecode?
3. What is reference counting?
4. Why cyclic GC?
5. Does `del` delete an object?
6. Can Python leak memory?
7. What is GIL?
8. Does GIL prevent all concurrency?
9. Why threads help I/O?
10. Why processes help CPU-heavy Python?
11. Race condition?
12. Deadlock?
13. Thread pool?
14. Process pool?
15. Serialization cost?
16. Coroutine?
17. Event loop?
18. Task?
19. `await`?
20. `gather`?
21. Blocking call in async?
22. Semaphore?
23. Backpressure?
24. Timeout?
25. Cancellation?
26. Retry?
27. Idempotency?
28. Bulkhead?
29. When use background queue?
30. Which concurrency metrics matter?

---

# 2. Code / Prediction

## Q1

```python
async def endpoint():
    time.sleep(3)
    return "done"
```

What is wrong?

> Blocks event loop.

---

## Q2

```python
async def run():
    a = await fetch_a()
    b = await fetch_b()
```

If calls are independent, how could you overlap them?

```python
a, b = await asyncio.gather(fetch_a(), fetch_b())
```

---

## Q3

What is wrong with:

```python
tasks = [asyncio.create_task(call(x)) for x in one_million_items]
```

Potential unbounded task/memory/downstream pressure.

---

# 3. Debugging Round

## Scenario A — API CPU at 100%

Service uses asyncio and performs a huge pure-Python loop in request handler.

Diagnosis:

> CPU work blocks event loop.

Discuss:

- process pool;
- native implementation;
- background worker;
- algorithm optimization.

---

## Scenario B — Memory Keeps Growing

Discuss investigation:

```text
metrics
→ traffic correlation
→ tracemalloc
→ object retention
→ caches
→ queues
→ tasks
→ native memory
```

---

## Scenario C — Threaded App Occasionally Duplicates Updates

Look for:

- race condition;
- shared mutable state;
- missing atomic business operation;
- DB transaction/lock requirement.

---

# 4. Concurrency Selection Round

Choose and defend.

## A — 500 blocking HTTP calls

Potential:

> bounded thread pool.

## B — 500 async HTTP calls with async client

Potential:

> asyncio + bounded semaphore.

## C — heavy pure-Python transform

Potential:

> process pool / native library.

## D — 2-minute AI report generation

Potential:

> background job queue.

## E — 20 independent downstream calls in one API request

Potential:

> bounded concurrent I/O with timeout/deadline.

---

# 5. Google Interview Drill

## Design an AI Full-Stack Backend

Traffic:

- 2,000 concurrent users;
- vector DB call;
- metadata service;
- LLM provider;
- LLM quota: 100 concurrent calls;
- typical LLM latency: 8 seconds.

Use:

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Trade-Off → Follow-Up → Defend**

Expected discussion:

```text
Request
  ↓
Auth / rate limit
  ↓
Async API
  ├── vector search
  └── metadata
       ↓
Context assembly
       ↓
Bounded LLM semaphore
       ↓
Provider
```

If backlog exceeds acceptable wait:

```text
API
 ↓
Job Queue
 ↓
Workers
 ↓
Bounded LLM calls
```

Need:

- timeout;
- cancellation;
- retries only where safe;
- idempotency;
- provider quota;
- observability;
- queue depth;
- fallback.

---

# 6. Architect Follow-Ups

Answer:

1. Why asyncio here?
2. Why not 2,000 threads?
3. Why not multiprocessing for LLM calls?
4. What if SDK is blocking?
5. What if provider returns 429?
6. How do you choose concurrency limit?
7. How do you handle client disconnect?
8. When switch to background queue?
9. How do you prevent retry storms?
10. What metrics prove saturation?
11. How do you test failure?
12. How do Kubernetes CPU limits affect processes?

---

# 7. Timed Assessment Plan

| Section | Time |
|---|---:|
| Rapid Recall | 12 min |
| Code / Prediction | 10 min |
| Debugging | 10 min |
| Model Selection | 8 min |
| Google Drill | 14 min |
| Architect Follow-Up | 6 min |
| **Total** | **60 min** |

---

# 8. Final Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Concept Understanding & Explanation | 20% | ___ / 20 |
| Code / Concurrency Implementation | 20% | ___ / 20 |
| Debugging & Code Review | 20% | ___ / 20 |
| Google Interview Drill | 25% | ___ / 25 |
| Architect-Level Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

---

# 9. Readiness Gate

To mark PY-03 READY:

- [ ] 80%+ overall
- [ ] No P0 weakness
- [ ] Explain CPython memory basics
- [ ] Explain GIL precisely
- [ ] Select thread/process/async correctly
- [ ] Detect event-loop blocking
- [ ] Use bounded concurrency
- [ ] Explain timeout/cancellation
- [ ] Explain backpressure
- [ ] Explain idempotent retry
- [ ] Design AI concurrency architecture
- [ ] Define production metrics

---

# 10. Final Quick Notes

```text
CPython = bytecode interpreter
Reference counting + cyclic GC
GIL limits Python-bytecode thread parallelism
Threads → blocking I/O
Processes → CPU-heavy Python
Asyncio → cooperative I/O concurrency
Blocking call blocks event loop
Semaphore bounds concurrency
Queue creates buffer + backpressure
Timeout + cancellation are mandatory
Retry selectively
Idempotency protects repeated side effects
Long work may belong in background jobs
Observe latency + concurrency + queue + errors + CPU + memory
```

---

# 11. Next Pack

> **PY-04 — Python Coding, DSA, Debugging, Code Review & AI-Generated Code Evaluation**
