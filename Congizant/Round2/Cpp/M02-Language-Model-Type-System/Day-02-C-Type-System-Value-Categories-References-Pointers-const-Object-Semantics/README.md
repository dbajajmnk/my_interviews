# Day 02 — C++ Type System, Value Categories, References, Pointers, const & Object Semantics

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Fundamental types](01-Fundamental-types.md)
2. [Integer types](02-Integer-types.md)
3. [Floating-point types](03-Floating-point-types.md)
4. [bool](04-bool.md)
5. [char types](05-char-types.md)
6. [std::byte awareness](06-std-byte-awareness.md)
7. [Enumerations](07-Enumerations.md)
8. [Scoped enum enum class](08-Scoped-enum-enum-class.md)
9. [Type aliases](09-Type-aliases.md)
10. [using aliases](10-using-aliases.md)
11. [auto type deduction](11-auto-type-deduction.md)
12. [decltype](12-decltype.md)
13. [const qualification](13-const-qualification.md)
14. [Pointers](14-Pointers.md)
15. [Null pointer nullptr](15-Null-pointer-nullptr.md)
16. [References](16-References.md)
17. [Lvalue references](17-Lvalue-references.md)
18. [Rvalue references awareness](18-Rvalue-references-awareness.md)
19. [Value categories](19-Value-categories.md)
20. [lvalue](20-lvalue.md)
21. [xvalue awareness](21-xvalue-awareness.md)
22. [prvalue awareness](22-prvalue-awareness.md)
23. [Array types](23-Array-types.md)
24. [Pointer arithmetic awareness](24-Pointer-arithmetic-awareness.md)
25. [Conversions](25-Conversions.md)
26. [static_cast](26-static-cast.md)
27. [dynamic_cast awareness](27-dynamic-cast-awareness.md)
28. [const_cast awareness](28-const-cast-awareness.md)
29. [reinterpret_cast awareness](29-reinterpret-cast-awareness.md)
30. [Object lifetime overview](30-Object-lifetime-overview.md)

---

# 2. Real-Life Analogy

References and pointers are ways of reaching objects; value categories describe whether an expression names stable storage or an expiring value.

---

# 3. Visualization

```text
Expression → Type/Value Category → Reference/Pointer Binding → Object Lifetime
```

---

# 4. Mind Map

```text
C++ Type System, Value Categories, References, Pointers, const & Object Semantics
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

Create examples for references, pointers, const, nullptr, casts, and value categories; explain which conversions are safe and why.

---

# 8. Google Interview Drill

A temporary is passed through overloads and picks an unexpected function. Reason from value categories and reference binding.

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
