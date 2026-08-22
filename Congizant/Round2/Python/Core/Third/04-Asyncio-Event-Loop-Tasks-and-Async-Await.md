# PY-03 / File 04 — Asyncio, Event Loop, Tasks & `async` / `await`

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M10 Concurrency / Async

---

# 1. Objective

Master:

- coroutine;
- event loop;
- `async def`;
- `await`;
- task;
- `gather`;
- timeout;
- cancellation;
- semaphore;
- async queue;
- blocking-call problem;
- async vs threads;
- async API design.

---

# 2. 5W+H

## What?

`asyncio` provides cooperative concurrency around an event loop.

## Why?

It can efficiently manage many I/O-bound operations without one OS thread per operation.

## Where?

- high-concurrency APIs;
- network clients;
- websockets;
- async DB drivers;
- AI API orchestration;
- event-driven services.

## When?

Use when the workload is largely non-blocking I/O and the surrounding libraries support async.

## How?

Coroutines explicitly yield control at `await` points so the event loop can run other tasks.

---

# 3. Real-Life Analogy

One skilled waiter serves many tables.

Instead of standing beside one table while food cooks, the waiter takes another order.

The waiter only works efficiently if operations actually allow them to leave.

A blocking function is like forcing the waiter to stand still beside one table.

---

# 4. Visualization

```text
Event Loop
   │
   ├── Task A → await network ─────┐
   ├── Task B → run               │
   ├── Task C → await DB ──────┐  │
   └── Task D → run            │  │
                               ▼  ▼
                         I/O completion
                               │
                               └──► tasks resume
```

---

# 5. Mind Map

```text
asyncio
│
├── Coroutine
├── Event Loop
├── Task
├── await
├── gather
├── timeout
├── cancellation
├── Semaphore
├── Queue
└── blocking-call avoidance
```

---

# 6. Core Concepts

## 6.1 Coroutine

```python
async def fetch():
    ...
```

Calling it returns a coroutine object; execution happens when awaited/scheduled.

---

## 6.2 `await`

```python
result = await fetch()
```

`await` suspends the current coroutine until the awaited operation progresses/completes, allowing the event loop to run other ready work.

---

## 6.3 Event Loop

The event loop schedules runnable tasks and reacts to I/O readiness/timers.

At interview level:

> asyncio is cooperative concurrency. Tasks must yield control.

---

## 6.4 Task

```python
task = asyncio.create_task(fetch())
```

A task schedules a coroutine for concurrent execution by the event loop.

---

## 6.5 `gather`

```python
results = await asyncio.gather(
    fetch_a(),
    fetch_b(),
    fetch_c(),
)
```

Runs awaitables concurrently from the caller's perspective.

But you must still handle:

- errors;
- cancellation;
- concurrency limits.

---

## 6.6 Blocking Call Inside Async Code

Bad:

```python
async def handler():
    time.sleep(5)
```

This blocks the event-loop thread.

Better:

```python
await asyncio.sleep(5)
```

For unavoidable blocking library calls, consider thread offloading:

```python
result = await asyncio.to_thread(blocking_call)
```

---

## 6.7 Async Does Not Make CPU Work Faster

Bad idea:

```python
async def heavy_cpu():
    # huge pure-Python loop
```

If it never yields, the event loop is blocked.

Use appropriate CPU execution strategy.

---

## 6.8 Timeout

Modern Python supports timeout contexts:

```python
async with asyncio.timeout(5):
    result = await remote_call()
```

Timeout is an architecture requirement, not just syntax.

---

## 6.9 Cancellation

Tasks may be cancelled.

Coroutines should:

- clean up;
- propagate cancellation appropriately;
- avoid swallowing cancellation unintentionally.

---

## 6.10 Semaphore

Bound concurrency:

```python
semaphore = asyncio.Semaphore(10)

async def limited_call():
    async with semaphore:
        return await remote_call()
```

This prevents firing unlimited concurrent operations.

---

## 6.11 Async Queue

Useful for producer/consumer designs:

```python
queue = asyncio.Queue(maxsize=100)
```

A bounded queue supports backpressure.

---

# 7. Engineering Depth

## 7.1 Async vs Threads

Choose based on ecosystem and workload.

Async:

- many async I/O operations;
- efficient high concurrency;
- requires async-compatible stack.

Threads:

- existing blocking libraries;
- simpler bridge for synchronous I/O;
- OS thread overhead.

There is no universal winner.

---

## 7.2 Backpressure

If producers generate work faster than consumers process it:

```text
Producer >>> Consumer
```

unbounded queues/concurrency can exhaust:

- memory;
- connections;
- downstream capacity.

Solutions:

- bounded queue;
- semaphore;
- rate limit;
- batching;
- admission control.

---

## 7.3 Error Handling with `gather`

Concurrent operations can fail independently.

Decide:

- fail-fast?
- partial success?
- collect exceptions?
- cancel siblings?
- fallback?

This is a business requirement.

---

## 7.4 AI API Example

One request needs:

- user DB lookup;
- vector search;
- reranker;
- LLM call.

Some operations may be independent.

Async can overlap I/O, but:

- cap concurrent model calls;
- use deadlines;
- cancellation;
- fallback;
- rate limits.

---

# 8. Implementation / Code

## Bounded Parallel Calls

```python
import asyncio

async def fetch_many(items, limit=10):
    semaphore = asyncio.Semaphore(limit)

    async def run(item):
        async with semaphore:
            return await fetch(item)

    tasks = [asyncio.create_task(run(item)) for item in items]
    return await asyncio.gather(*tasks)
```

---

# 9. Hands-On Practice

## Practice 1

Find the bug:

```python
async def endpoint():
    time.sleep(2)
    return "done"
```

Answer:

Blocking event loop.

---

## Practice 2

Design a max-10-concurrent request fan-out using `Semaphore`.

## Practice 3

Explain difference:

```python
await fetch_a()
await fetch_b()
```

vs

```python
await asyncio.gather(fetch_a(), fetch_b())
```

Sequential waiting vs concurrent scheduling (assuming I/O-capable coroutines).

---

# 10. Google Interview Drill

## Problem — AI Aggregation Endpoint

Endpoint calls:

- vector DB: 300 ms;
- reranker: 500 ms;
- two independent metadata services: 400 ms each;
- LLM: 8 seconds.

### Clarify

- which calls depend on which?
- timeout budget?
- partial results?
- model concurrency quota?
- cancellation if client disconnects?

### First Approach

Sequential.

Latency roughly accumulates.

### Improve

Parallelize independent I/O.

Possible dependency graph:

```text
metadata A ─┐
metadata B ─┼─► context
vector DB ──┘
              ↓
           reranker
              ↓
             LLM
```

### Code Direction

Use tasks/gather for independent calls.

### Test

- metadata timeout;
- vector DB failure;
- LLM timeout;
- cancellation;
- quota exhaustion.

### Edge Cases

- event-loop blocking SDK;
- 1,000 concurrent users;
- model rate limits;
- downstream pool exhaustion.

### Trade-Off

Async increases concurrency, which can amplify load.

### Follow-Up

Add:

- semaphore;
- deadline;
- timeout;
- cancellation;
- cache;
- circuit breaker;
- metrics;
- tracing.

---

# 11. Common Mistakes

1. Saying async means parallel CPU execution.
2. Using blocking libraries in event loop.
3. Unlimited `create_task`.
4. Unlimited `gather`.
5. Ignoring cancellation.
6. No timeout.
7. No backpressure.
8. Fire-and-forget tasks with lost exceptions.
9. Mixing sync/async blindly.
10. Assuming more concurrency means lower latency forever.

---

# 12. Best Practices

- use async for non-blocking I/O;
- bound concurrency;
- define timeouts;
- propagate cancellation;
- use bounded queues;
- isolate blocking calls;
- monitor event-loop lag;
- respect connection/model quotas;
- design partial failure semantics.

---

# 13. Interview Questions

1. What is a coroutine?
2. What is an event loop?
3. What does `await` do?
4. Coroutine vs Task?
5. What does `create_task` do?
6. `gather`?
7. What blocks event loop?
8. Async vs thread?
9. How handle CPU work?
10. How handle timeout?
11. What is cancellation?
12. Why semaphore?
13. Why bounded queue?
14. What is backpressure?

---

# 14. Google-Level Follow-Ups

1. What if SDK is synchronous?
2. What if LLM takes 30 seconds?
3. What if client disconnects?
4. What if model allows 100 concurrent calls?
5. How do you prevent 10,000 waiting tasks?
6. How do you apply one total request deadline?
7. How do you measure event-loop lag?
8. How do you handle partial metadata failure?
9. When would queue-based async processing be better?

---

# 15. Quick Revision

```text
asyncio = cooperative I/O concurrency
async def = coroutine function
await = yield control while waiting
Task = scheduled coroutine
gather = concurrent awaitables
Blocking call blocks event loop
Async ≠ CPU parallelism
Semaphore = bound concurrency
Queue(maxsize) = backpressure
Timeout + cancellation are production requirements
```

---

# 16. Readiness Gate

- [ ] Explain event loop.
- [ ] Explain coroutine/task.
- [ ] Explain await.
- [ ] Detect blocking call.
- [ ] Explain async vs threads.
- [ ] Use gather.
- [ ] Use timeout/cancellation.
- [ ] Use semaphore.
- [ ] Explain backpressure.
- [ ] Design AI aggregation endpoint.

**Gate:** READY / REPAIR

---

# 17. References

- Python `asyncio`
- Python Tasks and Coroutines documentation
- Python synchronization primitives
