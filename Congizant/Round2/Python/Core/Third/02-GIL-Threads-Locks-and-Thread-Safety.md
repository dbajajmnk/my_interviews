# PY-03 / File 02 — GIL, Threads, Locks & Thread Safety

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M10 Concurrency / Async

---

# 1. Objective

Master:

- what the GIL is;
- what the GIL is not;
- I/O-bound vs CPU-bound behavior;
- Python threads;
- race conditions;
- locks;
- deadlocks;
- thread pools;
- thread-safety reasoning;
- production implications.

---

# 2. 5W+H

## What?

The GIL is a CPython mechanism that allows only one thread at a time to execute Python bytecode in a process.

## Why?

Historically it simplifies parts of CPython's memory/object implementation.

## Where?

Relevant to multithreaded CPython processes.

## When?

It matters when choosing concurrency for:

- I/O;
- CPU-heavy code;
- mixed workloads.

## How?

Threads share process memory, but Python-bytecode parallelism is constrained by the GIL in standard CPython builds.

---

# 3. Real-Life Analogy

Imagine many workers sharing one whiteboard marker.

They can prepare independently, wait for external work, and take turns using the marker.

For I/O-heavy work, this can still be effective because workers spend time waiting.

For pure CPU Python work, one marker limits true simultaneous Python-bytecode execution.

---

# 4. Visualization

```text
One CPython Process
│
├── Thread A ─┐
├── Thread B ─┼──► GIL ─► Python bytecode execution
└── Thread C ─┘

Threads still:
- share memory
- can overlap I/O waits
- can run native code that releases the GIL
```

---

# 5. Mind Map

```text
Threads
│
├── GIL
├── Shared Memory
├── Race Condition
├── Lock
├── Deadlock
├── ThreadPool
└── I/O-bound workloads
```

---

# 6. Core Concepts

## 6.1 Correct GIL Answer

> In CPython, the GIL allows only one thread at a time to execute Python bytecode within a process. It does not mean Python cannot do concurrency, and it does not mean threads are useless.

---

## 6.2 Why Threads Still Help I/O Work

During:

- network I/O;
- file I/O;
- blocking system calls;

threads can spend significant time waiting.

Other threads can make progress.

---

## 6.3 CPU-Bound Python

For pure Python CPU-heavy work, adding threads usually does not provide linear CPU parallelism because of the GIL.

Consider:

- multiprocessing;
- native/vectorized libraries;
- external workers;
- workload redesign.

---

## 6.4 Native Libraries

Some C extensions release the GIL during compute-heavy native operations.

Therefore:

> “Threads never run in parallel in Python” is too broad.

Be precise:

> Python bytecode execution is constrained by the GIL in standard CPython, while native code may release it.

---

## 6.5 Race Condition

A race occurs when outcome depends on timing/interleaving of concurrent operations.

Example:

```python
balance = 100

def withdraw():
    global balance
    if balance >= 80:
        balance -= 80
```

Two concurrent callers can violate intended business rules without synchronization.

---

## 6.6 `x += 1` Is Not a Concurrency Contract

Do not assume a high-level operation is safe just because it appears to be one line.

Correct approach:

> synchronize shared mutable state based on the operation's invariant.

---

## 6.7 Lock

```python
from threading import Lock

lock = Lock()

with lock:
    # critical section
    ...
```

Use the smallest critical section necessary.

---

## 6.8 Deadlock

Example pattern:

```text
Thread A holds Lock 1 → waits Lock 2
Thread B holds Lock 2 → waits Lock 1
```

Neither can proceed.

Prevent with:

- consistent lock ordering;
- smaller critical sections;
- fewer shared locks;
- timeouts where appropriate;
- design simplification.

---

## 6.9 Thread Pool

```python
from concurrent.futures import ThreadPoolExecutor

with ThreadPoolExecutor(max_workers=10) as executor:
    futures = [executor.submit(fetch, url) for url in urls]
```

Good fit for synchronous I/O-bound operations when async conversion is impractical.

---

# 7. Engineering Depth

## 7.1 Thread Safety

Ask:

- what state is shared?
- is mutation atomic relative to the business invariant?
- does external library claim thread safety?
- can state be isolated instead?

Avoid:

> put one giant global lock around everything.

That destroys concurrency.

---

## 7.2 Locks vs Architecture

Sometimes the best fix is not a lock.

Possible alternatives:

- immutable data;
- per-request state;
- message passing;
- queue ownership;
- database transaction;
- external atomic operation.

---

## 7.3 API Example

If a sync Python API calls 20 remote services:

Threads can help if:

- client calls are blocking;
- concurrent I/O is safe;
- worker count is bounded.

But too many threads can create:

- memory overhead;
- context switching;
- downstream overload;
- connection-pool exhaustion.

---

# 8. Implementation / Code

## Bounded Thread Pool

```python
from concurrent.futures import ThreadPoolExecutor

def fetch_all(urls):
    with ThreadPoolExecutor(max_workers=8) as executor:
        return list(executor.map(fetch, urls))
```

`max_workers` is an architectural control, not a random number.

---

# 9. Hands-On Practice

## Practice 1

Explain why a thread pool can help with 50 blocking HTTP calls.

## Practice 2

Explain why it may not speed up a pure-Python Fibonacci benchmark.

## Practice 3

Find deadlock risk from two locks acquired in inconsistent order.

---

# 10. Google Interview Drill

## Problem — Concurrent API Calls

Requirement:

> For one request, call 10 independent downstream REST APIs and combine results.

### Clarify

- sync client or async client?
- timeout?
- partial failure?
- max latency?
- downstream rate limit?
- all results mandatory?

### First Approach

Call sequentially.

Latency becomes approximately sum of call times.

### Improve

For sync clients:

- bounded thread pool.

For async clients:

- asyncio may be better.

### Test

- all succeed;
- one timeout;
- multiple failures;
- slow provider;
- cancellation.

### Trade-Off

Parallelizing all 10 calls can overload downstream systems.

### Follow-Up

Discuss:

- concurrency limits;
- per-call timeout;
- global deadline;
- bulkhead;
- fallback;
- tracing.

---

# 11. Common Mistakes

1. Saying GIL means no concurrency.
2. Saying threads are useless in Python.
3. Using threads for CPU-heavy pure Python without thinking.
4. Assuming one-line updates are thread-safe.
5. One giant lock.
6. Nested locks without ordering.
7. Unbounded thread pools.
8. Ignoring downstream capacity.
9. Confusing thread safety with process safety.

---

# 12. Best Practices

- use threads primarily for blocking I/O;
- bound worker count;
- minimize shared mutable state;
- keep locks small;
- define lock ordering;
- use timeouts;
- respect downstream capacity;
- measure throughput/latency.

---

# 13. Interview Questions

1. What is the GIL?
2. Does GIL mean Python cannot do concurrency?
3. Why are threads useful for I/O?
4. Why not for pure Python CPU work?
5. What is a race condition?
6. What is a deadlock?
7. Lock vs RLock?
8. What is thread safety?
9. Thread pool use case?
10. Why bound thread count?

---

# 14. Google-Level Follow-Ups

1. What if downstream allows only 20 RPS?
2. What if thread pool has 500 workers?
3. What if HTTP connection pool has only 20 connections?
4. How do you apply request deadline?
5. How do you prevent cascading failure?
6. How do you trace parallel calls?
7. What metrics indicate pool saturation?

---

# 15. Quick Revision

```text
GIL = one thread executes Python bytecode at a time per CPython process
Threads still useful for I/O
Native code may release GIL
CPU-bound pure Python → consider processes
Race = timing-dependent correctness
Lock protects invariant
Deadlock = cyclic waiting
Bound thread pools
Thread safety ≠ process safety
```

---

# 16. Readiness Gate

- [ ] Explain GIL accurately.
- [ ] Explain I/O vs CPU thread behavior.
- [ ] Explain native-code caveat.
- [ ] Identify race.
- [ ] Explain lock usage.
- [ ] Explain deadlock.
- [ ] Design bounded thread pool.
- [ ] Survive downstream-call drill.

**Gate:** READY / REPAIR

---

# 17. References

- Python `threading`
- Python `concurrent.futures`
- Python implementation documentation
