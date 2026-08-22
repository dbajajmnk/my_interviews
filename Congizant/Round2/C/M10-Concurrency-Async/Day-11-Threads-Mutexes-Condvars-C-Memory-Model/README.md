# Day 11 — Threads, Mutexes, Condvars & C Memory Model

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [C11 threads awareness](01-C11-threads-awareness.md)
2. [POSIX pthreads awareness](02-POSIX-pthreads-awareness.md)
3. [pthread_create awareness](03-pthread-create-awareness.md)
4. [pthread_join awareness](04-pthread-join-awareness.md)
5. [pthread_mutex_t awareness](05-pthread-mutex-t-awareness.md)
6. [pthread_cond_t awareness](06-pthread-cond-t-awareness.md)
7. [Data races](07-Data-races.md)
8. [C memory model awareness](08-C-memory-model-awareness.md)
9. [Happens-before awareness](09-Happens-before-awareness.md)
10. [Thread-local storage](10-Thread-local-storage.md)
11. [_Thread_local awareness](11-Thread-local-awareness.md)
12. [Deadlock](12-Deadlock.md)
13. [Lock ordering](13-Lock-ordering.md)
14. [Condition-variable predicates](14-Condition-variable-predicates.md)
15. [Spurious wakeups](15-Spurious-wakeups.md)
16. [Thread lifecycle](16-Thread-lifecycle.md)
17. [Shared-state design](17-Shared-state-design.md)
18. [False sharing awareness](18-False-sharing-awareness.md)

# 2. Real-Life Analogy

volatile means observe this access; mutex/atomics mean coordinate safely.

# 3. Visualization

```text
Threads → Mutex/Condvar → Happens-Before → Shared State
```

# 4. Mind Map

```text
Threads, Mutexes, Condvars & C Memory Model
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Reproduce and fix a race/deadlock using pthread-style synchronization.

# 8. Google Interview Drill

Explain why volatile is not thread safety.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
