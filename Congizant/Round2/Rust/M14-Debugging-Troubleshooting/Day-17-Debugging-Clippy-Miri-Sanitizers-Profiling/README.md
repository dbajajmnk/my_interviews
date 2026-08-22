# Day 17 — Debugging, Clippy, Miri, Sanitizers & Profiling

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate:

1. [Debugging workflow](01-Debugging-workflow.md)
2. [rust-gdb awareness](02-rust-gdb-awareness.md)
3. [rust-lldb awareness](03-rust-lldb-awareness.md)
4. [Backtraces](04-Backtraces.md)
5. [RUST_BACKTRACE awareness](05-RUST-BACKTRACE-awareness.md)
6. [dbg! awareness](06-dbg-awareness.md)
7. [Clippy](07-Clippy.md)
8. [Compiler diagnostics](08-Compiler-diagnostics.md)
9. [cargo expand awareness](09-cargo-expand-awareness.md)
10. [Miri awareness](10-Miri-awareness.md)
11. [Undefined behavior in unsafe code](11-Undefined-behavior-in-unsafe-code.md)
12. [Sanitizers awareness](12-Sanitizers-awareness.md)
13. [AddressSanitizer awareness](13-AddressSanitizer-awareness.md)
14. [ThreadSanitizer awareness](14-ThreadSanitizer-awareness.md)
15. [MemorySanitizer awareness](15-MemorySanitizer-awareness.md)
16. [Valgrind awareness](16-Valgrind-awareness.md)
17. [perf awareness](17-perf-awareness.md)
18. [Flamegraph awareness](18-Flamegraph-awareness.md)
19. [CPU profiling](19-CPU-profiling.md)
20. [Heap profiling awareness](20-Heap-profiling-awareness.md)
21. [Allocation tracking awareness](21-Allocation-tracking-awareness.md)
22. [Tokio console awareness](22-Tokio-console-awareness.md)
23. [Deadlock diagnosis](23-Deadlock-diagnosis.md)
24. [Async task stall diagnosis](24-Async-task-stall-diagnosis.md)
25. [Database wait diagnosis](25-Database-wait-diagnosis.md)
26. [Root-cause evidence](26-Root-cause-evidence.md)

# 2. Real-Life Analogy

Compiler diagnostics, Clippy, Miri, backtraces and profilers each prove a different class of problem.

# 3. Visualization

```text
Symptom → Compiler/Clippy/Miri/Profile → Evidence → Fix
```

# 4. Mind Map

```text
Debugging, Clippy, Miri, Sanitizers & Profiling
├── Ownership / Lifetimes
├── Types / Traits / Enums
├── Runtime / Layout
├── Concurrency / Async
├── Errors / Safety
├── Debugging / Clippy / Miri
├── Backend / Data / Production
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

> **Concept → Rust Guarantee → Ownership/Lifetime → Runtime/Executor Boundary → Failure → Evidence → Trade-Off**

# 7. Hands-On Integration

Complete a focused Rust hands-on exercise integrating the core concepts from Day 17.

# 8. Google Interview Drill

Defend the Day 17 design under changed ownership, concurrency, performance, security or scale assumptions.

# 9. Day-Level Common Mistakes

Unnecessary clones, unwrap in recoverable paths, Arc<Mutex> everywhere, blocking async work, unsafe without invariants, over-generic APIs, premature optimization.

# 10. Day-Level Best Practices

Ownership first, explicit Result/Option, small traits, enums for closed states, cancellation-aware async, minimal unsafe, Clippy/tests/Miri, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one compiler guarantee, one runtime cost, one failure/debug artifact and one alternative.

# 12. Google-Level Follow-Ups

What changes under multithreading, async cancellation, dyn Trait vs generics, unsafe/FFI, 10× traffic or a different persistence model?

# 13. Quick Revision

```text
Who owns it?
Who borrows it?
What lifetime relation exists?
Does it allocate/clone?
Static or dynamic dispatch?
Can it block/panic/deadlock?
What proves the issue?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Ownership/lifetime/runtime behavior explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
