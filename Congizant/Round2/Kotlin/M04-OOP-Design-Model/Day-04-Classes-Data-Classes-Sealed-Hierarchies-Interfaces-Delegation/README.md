# Day 04 — Classes, Data Classes, Sealed Hierarchies, Interfaces & Delegation

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Classes](01-Classes.md)
2. [Primary constructors](02-Primary-constructors.md)
3. [Secondary constructors](03-Secondary-constructors.md)
4. [init blocks](04-init-blocks.md)
5. [Properties](05-Properties.md)
6. [Custom accessors](06-Custom-accessors.md)
7. [Visibility modifiers](07-Visibility-modifiers.md)
8. [open](08-open.md)
9. [final by default](09-final-by-default.md)
10. [abstract](10-abstract.md)
11. [Interfaces](11-Interfaces.md)
12. [Inheritance](12-Inheritance.md)
13. [Method overriding](13-Method-overriding.md)
14. [Composition over inheritance](14-Composition-over-inheritance.md)
15. [Data classes](15-Data-classes.md)
16. [copy semantics awareness](16-copy-semantics-awareness.md)
17. [Enum classes](17-Enum-classes.md)
18. [Sealed classes](18-Sealed-classes.md)
19. [Sealed interfaces](19-Sealed-interfaces.md)
20. [Object declarations](20-Object-declarations.md)
21. [Companion objects](21-Companion-objects.md)
22. [Nested classes](22-Nested-classes.md)
23. [Inner classes](23-Inner-classes.md)
24. [Delegation by keyword](24-Delegation-by-keyword.md)
25. [Property delegation awareness](25-Property-delegation-awareness.md)

---

# 2. Real-Life Analogy

Sealed and data classes let the domain model say more with less boilerplate, while delegation helps avoid deep inheritance.

---

# 3. Visualization

```text
Domain → Data/Sealed/Interface → Composition/Delegation → Behavior
```

---

# 4. Mind Map

```text
Classes, Data Classes, Sealed Hierarchies, Interfaces & Delegation
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Model an order lifecycle using data classes, sealed types, interfaces and delegation.

---

# 8. Google Interview Drill

A mutable data class is used as a map key. Explain equality/hashCode risks and redesign.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
