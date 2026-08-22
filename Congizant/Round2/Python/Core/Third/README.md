# GOJ Interview Preparation — Cognizant
## Area 02 — Python
### PY-03 — Runtime, Memory, GIL, Threading, Multiprocessing & Asyncio

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M9 Runtime, Memory & Internals + M10 Concurrency / Async + selected M20 Performance  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

---

# 1. Pack Objective

PY-03 prepares you for the runtime and concurrency questions that often separate a Python developer from a senior backend architect.

By the end of this pack you should be able to:

- explain CPython execution at interview depth;
- explain references, reference counting, cyclic GC, and memory behavior;
- explain the GIL precisely without myths;
- distinguish threading, multiprocessing, and asyncio;
- choose the right concurrency model for I/O-bound and CPU-bound workloads;
- explain the event loop and `async` / `await`;
- identify blocking calls inside async applications;
- design cancellation, timeout, retry, backpressure, and concurrency limits;
- debug race conditions, deadlocks, starvation, event-loop blocking, and process issues;
- reason about concurrency in APIs and AI-enabled services;
- defend production design choices.

Target:

> **Understand → Explain → Apply → Code → Debug → Review → Design → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-PY-03-Final/
│
├── README.md
├── 01-CPython-Execution-Memory-and-Garbage-Collection.md
├── 02-GIL-Threads-Locks-and-Thread-Safety.md
├── 03-Multiprocessing-and-CPU-Bound-Workloads.md
├── 04-Asyncio-Event-Loop-Tasks-and-Async-Await.md
├── 05-Production-Concurrency-Performance-and-Failure-Scenarios.md
└── 06-PY-03-Final-Readiness-Assessment.md
```

KIS rule:

- no separate Labs/Practice/Assignments folders;
- drills stay inside the relevant file;
- final assessment is separate because it validates the complete pack.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | CPython execution, references, memory, GC | 55 min |
| 02 | GIL, threads, locks, thread safety | 65 min |
| 03 | Multiprocessing, process pools, CPU-bound work | 50 min |
| 04 | Asyncio, event loop, tasks, cancellation, timeout | 80 min |
| 05 | Production concurrency, AI/API scenarios, debugging | 55 min |
| 06 | Final readiness assessment | 60 min |
| **Total** |  | **~6 hr 5 min** |

Time rule:

> **Do not memorize internals for their own sake. Learn enough internals to make correct engineering decisions.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity → Trade-Off → Follow-Up → Defend**

---

# 5. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| Concept Understanding & Explanation | 20% |
| Code / Concurrency Implementation | 20% |
| Debugging & Code Review | 20% |
| Google Interview Drill | 25% |
| Architect-Level Defense | 15% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can explain GIL without myths;
- can select threads/processes/async correctly;
- can identify async blocking;
- can defend concurrency limits, timeouts, cancellation, and failure handling.

---

# 6. PY-03 Completion Criteria

You must be able to:

- explain source → bytecode → interpreter;
- explain references/reference counting/cyclic GC at practical depth;
- explain memory leaks in managed Python environments;
- explain the GIL and what it does **not** mean;
- use locks appropriately;
- explain race conditions and deadlocks;
- choose multiprocessing for genuine CPU parallelism when appropriate;
- explain serialization/process-boundary costs;
- explain the asyncio event loop;
- distinguish coroutine, task, and future at practical level;
- use `gather`, timeout, cancellation, semaphore, and queue concepts;
- design a long-running AI API without blocking workers;
- discuss backpressure and bounded concurrency;
- debug event-loop blocking and saturation.

---

# 7. Next Pack

After PY-03:

> **PY-04 — Python Coding, DSA, Debugging, Code Review & AI-Generated Code Evaluation**
