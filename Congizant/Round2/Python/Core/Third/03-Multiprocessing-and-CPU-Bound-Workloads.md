# PY-03 / File 03 — Multiprocessing & CPU-Bound Workloads

**Priority:** P0  
**Suggested Time:** 50 minutes  
**GOJ Mapping:** M10 Concurrency

---

# 1. Objective

Master:

- process vs thread;
- multiprocessing;
- process pools;
- IPC/serialization costs;
- shared state;
- CPU-bound workload design;
- process startup concerns;
- production usage.

---

# 2. 5W+H

## What?

Multiprocessing uses separate OS processes, each with its own Python interpreter and memory space.

## Why?

It can provide parallel CPU execution across cores for CPU-bound workloads.

## Where?

- image/data transformation;
- CPU-heavy parsing;
- scientific tasks;
- model preprocessing;
- compute-heavy jobs.

## When?

When CPU is the bottleneck and process overhead is justified.

## How?

Through `multiprocessing` or process pools.

---

# 3. Real-Life Analogy

Threads are workers in one kitchen sharing the same pantry.

Processes are separate kitchens.

Separate kitchens can cook truly in parallel, but ingredients and messages must be transported between them.

---

# 4. Visualization

```text
Process A
├── Python runtime
├── memory
└── GIL

Process B
├── Python runtime
├── memory
└── GIL

CPU cores can execute processes in parallel.
```

---

# 5. Mind Map

```text
Multiprocessing
│
├── Separate Memory
├── Process Pool
├── Serialization
├── IPC
├── CPU Parallelism
├── Startup Cost
└── Failure Isolation
```

---

# 6. Core Concepts

## 6.1 Separate Memory

Unlike threads, processes do not normally share Python object memory directly.

This reduces some shared-state issues but introduces communication cost.

---

## 6.2 Process Pool

```python
from concurrent.futures import ProcessPoolExecutor

with ProcessPoolExecutor() as executor:
    results = list(executor.map(cpu_heavy, inputs))
```

Good for independent CPU-heavy tasks.

---

## 6.3 Serialization Cost

Arguments/results often need to cross process boundaries.

This may require serialization/pickling.

Large object transfer can erase expected performance gains.

---

## 6.4 CPU-Bound Is Not Enough

Ask:

- task size?
- data-transfer size?
- number of cores?
- process startup cost?
- memory?
- native library already parallel?
- container CPU quota?

---

## 6.5 Shared State

Avoid heavy shared mutable state between processes when possible.

Prefer:

- independent tasks;
- message passing;
- shared external store where needed.

---

# 7. Engineering Depth

## 7.1 AI Workload Example

Suppose preprocessing 100,000 documents involves heavy CPU tokenization/cleaning.

Possible process pool.

But if actual bottleneck is remote embedding API latency:

> multiprocessing may be the wrong optimization.

Always identify bottleneck first.

---

## 7.2 Kubernetes/Containers

If container has 1 CPU limit, creating 16 processes does not create 16 CPU cores.

Architecture must consider actual resource limits.

---

## 7.3 Process Pool Risks

- memory multiplication;
- process startup;
- serialization;
- worker crash;
- oversized batches;
- uneven work;
- container limits.

---

# 8. Implementation / Code

```python
from concurrent.futures import ProcessPoolExecutor

def square_sum(n):
    return sum(i * i for i in range(n))

def run(values):
    with ProcessPoolExecutor(max_workers=4) as executor:
        return list(executor.map(square_sum, values))
```

---

# 9. Hands-On Practice

## Practice 1

Choose:

> 1,000 remote HTTP calls.

Likely not multiprocessing; I/O concurrency is the key.

## Practice 2

Choose:

> CPU-heavy pure-Python transformation across independent files.

Process pool may fit.

## Practice 3

Explain why sending 1 GB objects to each worker may be expensive.

---

# 10. Google Interview Drill

## Problem — Process 1 Million Documents

Each document requires expensive CPU normalization before embedding.

### Clarify

- average document size?
- CPU cost?
- embedding local or remote?
- ordering?
- retry?
- memory limit?
- CPU quota?

### First Approach

Sequential.

### Improve

Batch + process pool for CPU normalization.

Then remote embedding concurrency separately.

### Test

- malformed document;
- worker crash;
- large document;
- batch skew.

### Trade-Off

Process count must respect:

- CPU cores;
- memory;
- serialization;
- downstream throughput.

### Follow-Up

Design pipeline:

```text
Ingest
→ CPU normalize
→ bounded process pool
→ batch
→ embedding API
→ vector store
```

This separates CPU parallelism from I/O concurrency.

---

# 11. Common Mistakes

1. Using processes for every task.
2. Ignoring serialization.
3. Too many workers.
4. Ignoring container CPU/memory limits.
5. Sharing too much mutable state.
6. Assuming processes are cheap.
7. Mixing remote I/O bottleneck with CPU bottleneck.

---

# 12. Best Practices

- measure bottleneck;
- use independent coarse tasks;
- limit worker count;
- batch intelligently;
- minimize process-boundary data;
- handle worker failure;
- account for container resources.

---

# 13. Interview Questions

1. Process vs thread?
2. Why does multiprocessing help CPU-bound Python?
3. What are process costs?
4. What is IPC?
5. Why serialization matters?
6. Process pool use case?
7. What happens to memory?
8. How do container limits change worker count?

---

# 14. Google-Level Follow-Ups

1. What if tasks vary dramatically in size?
2. How do you prevent one giant task blocking progress?
3. How do you retry failed document processing?
4. How do you avoid duplicate embeddings?
5. How do you monitor worker utilization?
6. Would a distributed job queue be better?

---

# 15. Quick Revision

```text
Processes = separate memory + separate interpreter
Can use multiple CPU cores
Good for CPU-bound pure Python
Costs: startup + memory + IPC + serialization
Measure first
Respect container CPU limits
Separate CPU stage from I/O stage
```

---

# 16. Readiness Gate

- [ ] Thread vs process.
- [ ] Explain CPU parallelism.
- [ ] Explain serialization cost.
- [ ] Choose worker count sensibly.
- [ ] Explain container limits.
- [ ] Design CPU + embedding pipeline.
- [ ] Survive failure follow-ups.

**Gate:** READY / REPAIR

---

# 17. References

- Python `multiprocessing`
- Python `concurrent.futures`
