# PY-03 / File 01 — CPython Execution, Memory & Garbage Collection

**Priority:** P0  
**Suggested Time:** 55 minutes  
**GOJ Mapping:** M9 Runtime, Memory & Internals

---

# 1. Objective

After this file, you should be able to:

- explain Python source execution at practical CPython depth;
- explain bytecode at a high level;
- explain object references;
- explain reference counting;
- explain cyclic garbage collection;
- distinguish object lifetime from variable lifetime;
- explain how memory can still grow in Python;
- discuss memory profiling and production implications.

---

# 2. 5W+H

## What?

CPython is the most widely used Python implementation. It compiles source into bytecode and executes that bytecode in the interpreter.

## Why?

Runtime behavior affects:

- performance;
- memory;
- concurrency;
- object lifetime;
- debugging;
- production reliability.

## Where?

Every CPython backend/API/AI service.

## When?

Runtime knowledge matters when diagnosing:

- leaks;
- high memory;
- concurrency;
- CPU usage;
- object lifetime;
- surprising performance.

## How?

Through bytecode execution, object references, reference counting, and cyclic garbage collection.

---

# 3. Real-Life Analogy

Think of objects as rented rooms.

Names hold room keys.

When no valid keys remain, the room can be reclaimed.

But if two rooms keep keys to each other, reference counting alone may not notice they are unreachable from the outside.

That is where cyclic GC helps.

---

# 4. Visualization

```text
source.py
   │
   ▼
Parser / Compiler
   │
   ▼
Bytecode
   │
   ▼
CPython Interpreter
   │
   ▼
Python Objects
   │
   ├── references
   ├── ref counts
   └── cyclic GC
```

---

# 5. Mind Map

```text
CPython Runtime
│
├── Source
├── Bytecode
├── Interpreter
├── Objects
│   ├── identity
│   ├── type
│   └── value/state
├── References
├── Reference Counting
└── Cyclic GC
```

---

# 6. Core Concepts

## 6.1 Source to Bytecode

Python source is compiled to bytecode before execution.

At a practical interview level:

> CPython compiles Python source to bytecode and its interpreter executes those bytecode instructions.

You can inspect bytecode with `dis`:

```python
import dis

def add(a, b):
    return a + b

dis.dis(add)
```

Do not memorize bytecode opcodes.

---

## 6.2 Objects and References

```python
a = [1, 2]
b = a
```

Both names reference the same object.

The object continues to exist while reachable references remain.

---

## 6.3 Reference Counting

CPython uses reference counting as a primary memory-management mechanism.

Conceptually:

```text
Object
  │
  ├── referenced by a
  ├── referenced by b
  └── referenced elsewhere
```

When the reference count reaches zero, CPython can usually reclaim the object immediately.

---

## 6.4 `del` Does Not Necessarily Delete the Object

```python
a = [1, 2]
b = a

del a
```

The list still exists because `b` still references it.

`del` removes a binding/reference, not necessarily the underlying object.

---

## 6.5 Cyclic References

```python
class Node:
    pass

a = Node()
b = Node()

a.other = b
b.other = a
```

These objects reference each other.

Reference counting alone may not reclaim such unreachable cycles.

CPython has cyclic garbage collection to detect collectible reference cycles.

---

## 6.6 Garbage Collection Is Not a License to Ignore Ownership

Python manages memory, but applications can still retain objects unintentionally.

Examples:

- global caches;
- unbounded dictionaries;
- retained callbacks;
- object graphs;
- task references;
- queues;
- library/resource leaks.

---

## 6.7 Memory Leak vs Memory Growth

Not every increase in process memory is a true leak.

Possible causes:

- legitimate caching;
- allocator behavior;
- fragmentation;
- large temporary objects;
- objects still referenced;
- library-native memory;
- workload growth.

Architect-level answer:

> First determine whether objects are still reachable and whether retained memory is expected before calling it a leak.

---

# 7. Engineering Depth

## 7.1 Why Memory May Not Return Immediately to the OS

Even after objects are freed, the process allocator may keep memory arenas for reuse.

Therefore:

> freed Python objects do not always translate into an immediate drop in RSS.

This matters in production diagnostics.

---

## 7.2 Resource Lifetime vs Memory Lifetime

Garbage collection is not the right mechanism for deterministic external resource cleanup.

Use explicit lifecycle management for:

- files;
- sockets;
- locks;
- DB transactions.

That is why context managers matter.

---

## 7.3 Memory Profiling Approach

When memory grows:

1. reproduce;
2. observe object counts;
3. identify retained references;
4. inspect caches/queues;
5. compare snapshots;
6. profile allocation hot spots;
7. inspect native-library memory where relevant.

Tools/techniques can include:

- `tracemalloc`;
- `gc`;
- heap/object inspection;
- process metrics.

---

# 8. Implementation / Code

## `tracemalloc` Example

```python
import tracemalloc

tracemalloc.start()

data = [str(i) for i in range(100_000)]

snapshot = tracemalloc.take_snapshot()
top = snapshot.statistics("lineno")

for stat in top[:5]:
    print(stat)
```

Use this as a diagnostic technique, not an interview memorization exercise.

---

# 9. Hands-On Practice

## Practice 1

Explain:

```python
a = []
b = a
del a
```

Question:

> Does the list necessarily disappear?

Answer:

> No. `b` still references it.

---

## Practice 2

Find the growth risk:

```python
cache = {}

def load(key):
    if key not in cache:
        cache[key] = expensive_load(key)
    return cache[key]
```

Discuss:

- no eviction;
- no TTL;
- unbounded cardinality;
- process-local cache.

---

# 10. Google Interview Drill

## Problem — Memory Keeps Growing in a Python API

### Clarify

Ask:

- steady growth or plateau?
- correlated with traffic?
- request type?
- Python heap or native memory?
- cache present?
- background tasks?
- container limit?

### First Approach

Restart process.

Not a root-cause fix.

### Improve

Investigate:

```text
metrics
→ heap snapshots
→ tracemalloc
→ retained object references
→ caches/queues/tasks
→ native libraries
```

### Edge Cases

- memory allocator retains arenas;
- true business cache;
- C extension leak;
- un-awaited tasks retained;
- large response buffering.

### Trade-Off

Aggressive manual `gc.collect()` is not automatically the solution.

### Follow-Up

How would you:

- bound caches?
- monitor memory?
- set container limits?
- detect OOM risk?
- roll out a fix safely?

---

# 11. Common Mistakes

1. Saying Python has no memory leaks.
2. Saying `del` deletes the object.
3. Saying cyclic GC replaces reference counting.
4. Calling every RSS increase a leak.
5. Forcing GC blindly.
6. Depending on GC for files/sockets.
7. Ignoring native-library memory.
8. Ignoring unbounded application caches.

---

# 12. Best Practices

- make ownership explicit;
- bound caches/queues;
- use context managers;
- monitor process memory;
- profile before optimizing;
- separate Python heap from native memory concerns;
- understand expected workload growth.

---

# 13. Interview Questions

1. How does CPython execute code?
2. What is bytecode?
3. How does CPython manage object lifetime?
4. What is reference counting?
5. Why cyclic GC?
6. Does `del` delete an object?
7. Can Python leak memory?
8. Why might RSS stay high after objects are freed?
9. How would you investigate memory growth?
10. Why not rely on GC for resource cleanup?

---

# 14. Google-Level Follow-Ups

1. What if growth happens only under one endpoint?
2. What if tracemalloc looks stable but RSS grows?
3. What if NumPy/native extension is involved?
4. What if cache must hold millions of entries?
5. How do you set eviction?
6. How do you monitor OOM risk in Kubernetes?
7. What signals trigger autoscaling vs memory repair?

---

# 15. Quick Revision

```text
CPython: source → bytecode → interpreter
Names reference objects
Reference count → primary reclamation
Cycles need cyclic GC
del removes a binding
GC ≠ deterministic external cleanup
Python can retain memory unintentionally
RSS growth ≠ automatically leak
Profile first
```

---

# 16. Readiness Gate

- [ ] Explain source → bytecode → interpreter.
- [ ] Explain reference counting.
- [ ] Explain cyclic GC.
- [ ] Explain `del`.
- [ ] Explain memory-growth causes.
- [ ] Explain deterministic cleanup.
- [ ] Describe memory investigation flow.
- [ ] Survive API-memory drill.

**Gate:** READY / REPAIR

---

# 17. References

- Python Data Model
- Python `gc` documentation
- Python `tracemalloc` documentation
- Python `dis` documentation
