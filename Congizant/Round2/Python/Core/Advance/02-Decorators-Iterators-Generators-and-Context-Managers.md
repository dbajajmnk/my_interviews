# PY-02 / File 02 — Decorators, Iterators, Generators & Context Managers

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** selected M11 Modern & Advanced Features

---

# 1. Objective

Master:

- first-class functions;
- closures as decorator foundation;
- decorators;
- decorator arguments;
- iterator protocol;
- generators;
- `yield`;
- lazy evaluation;
- context managers;
- `with`;
- deterministic cleanup;
- production use cases and traps.

---

# 2. 5W+H

## What?

These are Python mechanisms for behavior wrapping, lazy iteration, and resource lifecycle control.

## Why?

They reduce boilerplate and enable reusable cross-cutting behavior when used carefully.

## Where?

- frameworks;
- logging;
- authorization;
- retry;
- instrumentation;
- data pipelines;
- streaming;
- files;
- database resources;
- locks.

## When?

Use them when they simplify repeated behavior without hiding critical control flow.

## How?

Through callable wrapping, iterator protocol, suspended function execution, and context protocol.

---

# 3. Real-Life Analogy

A decorator is like airport security wrapping normal travel.

```text
Original Operation
       │
       ▼
Security Check
       │
       ▼
Operation Executes
       │
       ▼
Audit / Exit
```

A generator is like a tap:

> produce one item when requested, not the whole tank at once.

A context manager is like hotel key checkout:

> acquire → use → guaranteed release.

---

# 4. Visualization

```text
Decorator:
call → wrapper → original function → wrapper result

Generator:
next() → run until yield → pause → next() → resume

Context:
__enter__ → body → __exit__
```

---

# 5. Mind Map

```text
Advanced Functions
│
├── Decorators
│   ├── wrapper
│   ├── functools.wraps
│   └── parameters
│
├── Iterators
│   ├── __iter__
│   └── __next__
│
├── Generators
│   └── yield
│
└── Context Managers
    ├── __enter__
    ├── __exit__
    └── contextmanager
```

---

# 6. Core Concepts

## 6.1 First-Class Functions

```python
def greet(name):
    return f"Hello {name}"

handler = greet
```

Functions can be passed and returned.

Decorators rely on this.

---

## 6.2 Basic Decorator

```python
from functools import wraps

def audit(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        print("before")
        result = func(*args, **kwargs)
        print("after")
        return result
    return wrapper
```

Usage:

```python
@audit
def process():
    return "done"
```

Conceptually:

```python
process = audit(process)
```

---

## 6.3 Why `functools.wraps`?

Without it, wrapper metadata can replace the original function's:

- `__name__`;
- docstring;
- annotations;
- introspection metadata.

Frameworks may rely on metadata.

---

## 6.4 Parameterized Decorator

```python
def retry(times):
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            last_error = None
            for _ in range(times):
                try:
                    return func(*args, **kwargs)
                except TimeoutError as exc:
                    last_error = exc
            raise last_error
        return wrapper
    return decorator
```

But production retry needs more thought:

- backoff;
- jitter;
- idempotency;
- retryable exceptions;
- metrics;
- cancellation.

---

## 6.5 Iterator Protocol

An iterator provides:

- `__iter__()`;
- `__next__()`.

`__next__()` raises `StopIteration` when exhausted.

Example:

```python
class Counter:
    def __init__(self, end):
        self.current = 0
        self.end = end

    def __iter__(self):
        return self

    def __next__(self):
        if self.current >= self.end:
            raise StopIteration
        value = self.current
        self.current += 1
        return value
```

---

## 6.6 Generator

```python
def numbers(end):
    for i in range(end):
        yield i
```

A generator suspends execution at `yield` and resumes later.

---

## 6.7 Why Generators?

Useful for:

- large data;
- streams;
- pipelines;
- lazy processing;
- memory-sensitive iteration.

A generator can avoid constructing a full list.

---

## 6.8 Generator Is Not “Always Faster”

It may reduce memory, but:

- repeated generation can cost CPU;
- one-shot iteration matters;
- random access is unavailable;
- downstream behavior matters.

---

## 6.9 Context Manager

```python
with open("file.txt") as f:
    data = f.read()
```

The resource is closed reliably.

Protocol:

```python
__enter__()
__exit__()
```

---

## 6.10 Custom Context Manager

```python
class Transaction:
    def __enter__(self):
        print("begin")
        return self

    def __exit__(self, exc_type, exc, tb):
        if exc is None:
            print("commit")
        else:
            print("rollback")
```

---

## 6.11 `contextlib.contextmanager`

```python
from contextlib import contextmanager

@contextmanager
def transaction():
    print("begin")
    try:
        yield
        print("commit")
    except Exception:
        print("rollback")
        raise
```

---

# 7. Engineering Depth

## 7.1 Decorator Trade-Off

Good for:

- cross-cutting behavior;
- instrumentation;
- authorization;
- registration;
- caching.

Risk:

- hidden control flow;
- difficult debugging;
- ordering interactions;
- surprising side effects.

Architect rule:

> Use decorators for orthogonal reusable behavior, not to hide core business flow.

---

## 7.2 Generator Trade-Off

List:

```python
items = [transform(x) for x in source]
```

Generator:

```python
items = (transform(x) for x in source)
```

Choose based on:

- memory;
- reuse;
- one-shot consumption;
- latency;
- downstream needs.

---

## 7.3 Context Managers and Reliability

They are useful for:

- files;
- locks;
- DB transaction boundaries;
- temporary resources;
- tracing spans.

The key principle:

> resource cleanup should be deterministic.

---

# 8. Implementation / Code

## Timing Decorator

```python
from functools import wraps
from time import perf_counter

def timed(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        start = perf_counter()
        try:
            return func(*args, **kwargs)
        finally:
            elapsed = perf_counter() - start
            print(f"{func.__name__}: {elapsed:.4f}s")
    return wrapper
```

---

# 9. Hands-On Practice

## Practice 1

Write a decorator that logs function name before execution.

## Practice 2

Convert:

```python
def load_all(rows):
    result = []
    for row in rows:
        result.append(transform(row))
    return result
```

to a generator.

## Practice 3

Create a context manager for acquiring/releasing a mock lock.

---

# 10. Google Interview Drill

## Problem — Stream a Large File

Requirement:

> Process a 20 GB log file and count error lines.

### Clarify

- one file or many?
- can data fit in memory? no;
- exact count?
- compressed?
- parallelism required?

### First Approach

```python
lines = file.readlines()
```

Problem:

Loads the full file.

### Improve

```python
def error_lines(path):
    with open(path) as f:
        for line in f:
            if "ERROR" in line:
                yield line
```

Count:

```python
count = sum(1 for _ in error_lines(path))
```

### Test

- empty file;
- no errors;
- all errors;
- malformed lines.

### Complexity

- Time: O(n) in number of lines
- Extra application memory: roughly O(1) relative to file size

### Trade-Off

Generator is one-pass; replay requires reopening the source.

### Follow-Up

At distributed scale:

- partition files?
- object storage?
- parallel workers?
- exactly-once vs at-least-once?
- checkpointing?
- monitoring?

---

# 11. Common Mistakes

1. Forgetting `wraps`.
2. Catching all exceptions in retry decorators.
3. Decorating core business flow excessively.
4. Assuming generator results can be reused indefinitely.
5. Converting generator to list and losing memory benefit.
6. Failing to close resources.
7. Suppressing exceptions accidentally in `__exit__`.
8. Writing context managers without clear ownership.

---

# 12. Best Practices

- preserve function metadata;
- keep decorators focused;
- keep generator pipelines readable;
- use context managers for lifecycle;
- re-raise unexpected failures;
- test decorator order;
- avoid hidden magic.

---

# 13. Interview Questions

1. What is a decorator?
2. How does `@decorator` work?
3. Why use `wraps`?
4. What is a parameterized decorator?
5. Iterable vs iterator?
6. What is the iterator protocol?
7. What does `yield` do?
8. Generator vs list?
9. Generator expression vs list comprehension?
10. What is a context manager?
11. `__enter__` / `__exit__`?
12. When use `contextmanager`?

---

# 14. Google-Level Follow-Ups

From the 20 GB file:

1. Why not `readlines()`?
2. What if transformation is CPU-heavy?
3. What if input is from S3?
4. What if processing crashes halfway?
5. How do you resume?
6. How do you parallelize?
7. What ordering guarantees are needed?
8. What metrics matter?
9. How do you handle corrupt records?
10. Would async help? Why/why not?

---

# 15. Quick Revision

```text
Decorator = callable wrapper
@x = function transformed by x
wraps preserves metadata
Iterator = __iter__ + __next__
Generator = yield + suspended execution
Generator = lazy, one-pass
Context manager = deterministic acquire/release
with = __enter__ / __exit__
Use magic only when it improves clarity
```

---

# 16. Readiness Gate

- [ ] Implement decorator.
- [ ] Explain `wraps`.
- [ ] Explain iterator protocol.
- [ ] Implement generator.
- [ ] Explain generator trade-offs.
- [ ] Implement context manager.
- [ ] Explain exception handling in context.
- [ ] Survive large-file drill.

**Gate:** READY / REPAIR

---

# 17. References

- Python `functools`
- Python iterator documentation
- Python generators documentation
- Python `contextlib`
