# Day 03 — Functions, Lambdas, Higher-Order Functions, Extensions & Scope Functions

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Top-level functions](01-Top-level-functions.md)
2. [Member functions](02-Member-functions.md)
3. [Local functions](03-Local-functions.md)
4. [Default arguments](04-Default-arguments.md)
5. [Named arguments](05-Named-arguments.md)
6. [Vararg](06-Vararg.md)
7. [Function types](07-Function-types.md)
8. [Lambdas](08-Lambdas.md)
9. [Trailing lambdas](09-Trailing-lambdas.md)
10. [Higher-order functions](10-Higher-order-functions.md)
11. [Function references](11-Function-references.md)
12. [Closures](12-Closures.md)
13. [Extension functions](13-Extension-functions.md)
14. [Receiver types](14-Receiver-types.md)
15. [let](15-let.md)
16. [run](16-run.md)
17. [with](17-with.md)
18. [apply](18-apply.md)
19. [also](19-also.md)
20. [Inline lambda awareness](20-Inline-lambda-awareness.md)
21. [Non-local returns awareness](21-Non-local-returns-awareness.md)

---

# 2. Real-Life Analogy

Extensions and scope functions are shorthand tools—use them like good kitchen knives, not as decorations.

---

# 3. Visualization

```text
Function/Extension → Receiver/Closure → Higher-Order Composition → Result
```

---

# 4. Mind Map

```text
Functions, Lambdas, Higher-Order Functions, Extensions & Scope Functions
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

Implement validation/transformation helpers using functions, extensions and scope functions; refactor over-chaining.

---

# 8. Google Interview Drill

Explain when let/run/apply/also improve clarity and when they make code harder to review.

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
