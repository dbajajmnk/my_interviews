# Day 02 — Go Types, Zero Values, Pointers, Structs, Interfaces & Nil Semantics

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Static typing](01-Static-typing.md)
2. [Type inference](02-Type-inference.md)
3. [Defined types](03-Defined-types.md)
4. [Type aliases](04-Type-aliases.md)
5. [Basic types](05-Basic-types.md)
6. [Integer types](06-Integer-types.md)
7. [Floating point types](07-Floating-point-types.md)
8. [Complex types awareness](08-Complex-types-awareness.md)
9. [bool](09-bool.md)
10. [string](10-string.md)
11. [byte](11-byte.md)
12. [rune](12-rune.md)
13. [UTF-8 awareness](13-UTF-8-awareness.md)
14. [Zero values](14-Zero-values.md)
15. [Pointers](15-Pointers.md)
16. [Pointer vs value semantics](16-Pointer-vs-value-semantics.md)
17. [Structs](17-Structs.md)
18. [Anonymous structs](18-Anonymous-structs.md)
19. [Interfaces](19-Interfaces.md)
20. [Implicit interface satisfaction](20-Implicit-interface-satisfaction.md)
21. [nil](21-nil.md)
22. [Typed nil interface trap](22-Typed-nil-interface-trap.md)
23. [Type assertions](23-Type-assertions.md)
24. [Type switches](24-Type-switches.md)
25. [Comparability](25-Comparability.md)
26. [Equality](26-Equality.md)
27. [Conversions](27-Conversions.md)

---

# 2. Real-Life Analogy

A Go interface is a socket defined by the consumer; any plug with the required methods fits without declaring the relationship.

---

# 3. Visualization

```text
Value → Concrete Type → Pointer/Struct/Interface → nil/equality semantics
```

---

# 4. Mind Map

```text
Go Types, Zero Values, Pointers, Structs, Interfaces & Nil Semantics
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

Model a domain with defined types, structs, interfaces and pointers; reproduce the typed-nil interface trap.

---

# 8. Google Interview Drill

An error interface prints non-nil even though the underlying pointer is nil. Explain exactly why.

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
