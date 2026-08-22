# Day 14 — Smart Pointers, Streams, Files, Serialization & Networking Awareness

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [std::unique_ptr](01-std-unique-ptr.md)
2. [std::shared_ptr](02-std-shared-ptr.md)
3. [std::weak_ptr](03-std-weak-ptr.md)
4. [Ownership semantics](04-Ownership-semantics.md)
5. [make_unique](05-make-unique.md)
6. [make_shared](06-make-shared.md)
7. [Shared_ptr reference counting awareness](07-Shared-ptr-reference-counting-awareness.md)
8. [Cyclic ownership](08-Cyclic-ownership.md)
9. [Weak references](09-Weak-references.md)
10. [Custom deleters awareness](10-Custom-deleters-awareness.md)
11. [iostream](11-iostream.md)
12. [istream](12-istream.md)
13. [ostream](13-ostream.md)
14. [ifstream](14-ifstream.md)
15. [ofstream](15-ofstream.md)
16. [stringstream](16-stringstream.md)
17. [Binary I/O awareness](17-Binary-I-O-awareness.md)
18. [Filesystem library](18-Filesystem-library.md)
19. [std::filesystem::path](19-std-filesystem-path.md)
20. [Serialization formats awareness](20-Serialization-formats-awareness.md)
21. [JSON library awareness](21-JSON-library-awareness.md)
22. [Protobuf awareness](22-Protobuf-awareness.md)
23. [Boost.Asio awareness](23-Boost-Asio-awareness.md)
24. [Sockets awareness](24-Sockets-awareness.md)
25. [HTTP client/server library awareness](25-HTTP-client-server-library-awareness.md)
26. [Timeouts](26-Timeouts.md)
27. [Streaming I/O](27-Streaming-I-O.md)
28. [Buffer lifetime](28-Buffer-lifetime.md)
29. [Payload size limits](29-Payload-size-limits.md)

---

# 2. Real-Life Analogy

Day 14 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Ownership → Smart Pointer → Stream/File/Network → Buffer Lifetime → Cleanup
```

---

# 4. Mind Map

```text
Smart Pointers, Streams, Files, Serialization & Networking Awareness
├── Language Semantics
├── Lifetime / Ownership
├── Compiler / Linker / Runtime
├── Concurrency / Memory Model
├── Failure / Undefined Behavior
├── Debugging / Sanitizers
├── Code Review
├── AI Evaluation
├── Performance / Production
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

> **Concept → C++ Guarantee → Lifetime/Ownership → Compiler/Runtime Boundary → Failure/UB → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build file/resource ownership examples with smart pointers and stream a large file safely.

---

# 8. Google Interview Drill

A shared_ptr cycle leaks memory despite no raw new/delete. Explain reference cycles and weak_ptr.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Raw ownership without RAII.
- Dangling pointers/references/views.
- Iterator invalidation.
- Incorrect copy/move semantics.
- Missing virtual destructor.
- Data races/atomic misuse.
- Overusing templates/patterns.
- Optimizing before profiling.

---

# 10. Day-Level Best Practices

- Rule of Zero first.
- RAII everywhere practical.
- Smart/value ownership explicit.
- Strong warnings + sanitizers.
- Const-correctness.
- Defined behavior only.
- Measure before optimization.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the C++ standard guarantee?
3. What is compiler/ABI/runtime-specific?
4. What can dangle, race, leak or invoke UB?
5. What tool would you use to prove the problem?
6. What simpler/safer design could replace this?

---

# 12. Google-Level Follow-Ups

1. What changes under optimization?
2. What changes under concurrency?
3. What changes if ownership becomes shared?
4. What changes across a shared-library ABI boundary?
5. What would ASan/TSan/profiler show?
6. What trade-off would make you choose another language/runtime?

---

# 13. Quick Revision

```text
What is it?
Who owns it?
When does lifetime end?
Can anything dangle?
What can be UB?
What allocates/copies/moves?
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
- [ ] I can explain ownership/lifetime/UB risks.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
