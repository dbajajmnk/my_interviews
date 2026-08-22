# Day 04 — Classes, RAII, Constructors, Destructors, Inheritance & Composition

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Classes](01-Classes.md)
2. [Structs vs classes](02-Structs-vs-classes.md)
3. [Access specifiers](03-Access-specifiers.md)
4. [Constructors](04-Constructors.md)
5. [Default constructor](05-Default-constructor.md)
6. [Parameterized constructor](06-Parameterized-constructor.md)
7. [Delegating constructors](07-Delegating-constructors.md)
8. [Destructor](08-Destructor.md)
9. [RAII](09-RAII.md)
10. [Member initializer lists](10-Member-initializer-lists.md)
11. [this pointer](11-this-pointer.md)
12. [Static members](12-Static-members.md)
13. [Friend awareness](13-Friend-awareness.md)
14. [Encapsulation](14-Encapsulation.md)
15. [Inheritance](15-Inheritance.md)
16. [Public inheritance](16-Public-inheritance.md)
17. [Protected/private inheritance awareness](17-Protected-private-inheritance-awareness.md)
18. [Virtual functions](18-Virtual-functions.md)
19. [Override](19-Override.md)
20. [final](20-final.md)
21. [Abstract classes](21-Abstract-classes.md)
22. [Pure virtual functions](22-Pure-virtual-functions.md)
23. [Virtual destructors](23-Virtual-destructors.md)
24. [Object slicing](24-Object-slicing.md)
25. [Composition over inheritance](25-Composition-over-inheritance.md)
26. [Rule of Zero awareness](26-Rule-of-Zero-awareness.md)
27. [Rule of Three](27-Rule-of-Three.md)
28. [Rule of Five](28-Rule-of-Five.md)
29. [Copy constructor](29-Copy-constructor.md)
30. [Copy assignment](30-Copy-assignment.md)
31. [Move constructor](31-Move-constructor.md)
32. [Move assignment](32-Move-assignment.md)

---

# 2. Real-Life Analogy

RAII is a keycard attached to an object's lifetime: when the object leaves scope, the keycard automatically closes the resource.

---

# 3. Visualization

```text
Class → Constructor/RAII → Ownership → Copy/Move → Destruction
```

---

# 4. Mind Map

```text
Classes, RAII, Constructors, Destructors, Inheritance & Composition
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

Model a resource-owning class using RAII and Rule of Zero where possible; demonstrate object slicing and virtual destructor necessity.

---

# 8. Google Interview Drill

A base pointer deletes a derived object without a virtual destructor. Explain the undefined behavior and redesign.

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
