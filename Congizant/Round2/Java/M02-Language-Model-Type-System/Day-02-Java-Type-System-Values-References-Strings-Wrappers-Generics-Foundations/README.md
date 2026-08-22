# Day 02 — Java Type System, Values, References, Strings, Wrappers & Generics Foundations

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [primitive vs reference semantics](01-primitive-vs-reference-semantics.md)
2. [stack variable vs object reference mental model](02-stack-variable-vs-object-reference-mental-model.md)
3. [String immutability](03-String-immutability.md)
4. [String pool](04-String-pool.md)
5. [wrappers/autoboxing](05-wrappers-autoboxing.md)
6. [equals/hashCode](06-equals-hashCode.md)
7. [generics basics](07-generics-basics.md)
8. [type inference](08-type-inference.md)
9. [nullability awareness](09-nullability-awareness.md)

---

# 2. Real-Life Analogy

A primitive is the actual house number written on your note; an object variable is the address pointing to the house. Passing the note copies what is written on it.

---

# 3. Visualization

```text
Variable → primitive value OR object reference → object; method call copies the variable value
```

---

# 4. Mind Map

```text
Java Type System, Values, References, Strings, Wrappers & Generics Foundations
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Predict and then verify outputs for String pool, wrapper comparisons, `equals`, null unboxing, generic lists, and reference aliasing. Explain each result without relying on memorized trivia.

---

# 8. Google Interview Drill

Design a type-safe result wrapper `Result<T>` for a service method. Discuss generics, immutability, null avoidance, error representation, and why raw types should be rejected.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Saying Java is pass-by-reference
- Using `==` for value equality
- Relying on wrapper identity caching
- Ignoring null unboxing
- Using raw collections

---

# 10. Day-Level Best Practices

- Use `.equals` or domain-specific equality
- Prefer immutable value types where possible
- Use generics instead of casts
- Avoid unnecessary boxing in hot loops
- Model absence explicitly when useful

---

# 11. Interview Questions

1. Is Java pass-by-value?
2. Why is String immutable?
3. `==` vs `equals`?
4. What is autoboxing?
5. What is type erasure?
6. Why can't generics use primitives directly?

---

# 12. Google-Level Follow-Ups

1. How does `hashCode` relate to `equals`?
2. Why is `List<Integer>` not a `List<Number>`?
3. What problem do wildcards solve?
4. How would records affect value modeling?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
