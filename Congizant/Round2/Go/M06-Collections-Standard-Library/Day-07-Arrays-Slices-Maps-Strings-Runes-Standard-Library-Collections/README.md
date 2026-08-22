# Day 07 — Arrays, Slices, Maps, Strings, Runes & Standard Library Collections

**Module:** M06 — Collections & Standard Library  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Arrays](01-Arrays.md)
2. [Slices](02-Slices.md)
3. [Slice header awareness](03-Slice-header-awareness.md)
4. [len](04-len.md)
5. [cap](05-cap.md)
6. [append](06-append.md)
7. [copy](07-copy.md)
8. [Slice growth awareness](08-Slice-growth-awareness.md)
9. [Slice aliasing](09-Slice-aliasing.md)
10. [Sub-slicing memory retention](10-Sub-slicing-memory-retention.md)
11. [Maps](11-Maps.md)
12. [Map lookup comma-ok](12-Map-lookup-comma-ok.md)
13. [Map iteration order](13-Map-iteration-order.md)
14. [Delete](14-Delete.md)
15. [Clear awareness](15-Clear-awareness.md)
16. [Strings](16-Strings.md)
17. [Bytes vs runes](17-Bytes-vs-runes.md)
18. [UTF-8](18-UTF-8.md)
19. [range over string](19-range-over-string.md)
20. [strings package](20-strings-package.md)
21. [bytes package](21-bytes-package.md)
22. [sort package](22-sort-package.md)
23. [slices package awareness](23-slices-package-awareness.md)
24. [maps package awareness](24-maps-package-awareness.md)
25. [container/heap awareness](25-container-heap-awareness.md)
26. [container/list awareness](26-container-list-awareness.md)
27. [Collection complexity](27-Collection-complexity.md)

---

# 2. Real-Life Analogy

A slice is a window onto an array. Two windows can look separate while still sharing the same room underneath.

---

# 3. Visualization

```text
Array → Slice Header → Backing Array | Map/String → Mutation/Aliasing/Complexity
```

---

# 4. Mind Map

```text
Arrays, Slices, Maps, Strings, Runes & Standard Library Collections
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement deduplication, frequency counting, safe sub-slicing, rune-aware string processing, and top-K preparation.

---

# 8. Google Interview Drill

A tiny subslice keeps a 500 MB backing array alive. Explain slice retention and fix it.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
