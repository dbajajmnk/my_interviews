# Day 08 — Exceptions, Error Handling, Resource Safety & API Failure Design

**Module:** M07 — Error / Exception Handling  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [checked/unchecked](01-checked-unchecked.md)
2. [exception hierarchy](02-exception-hierarchy.md)
3. [throw/throws](03-throw-throws.md)
4. [try/catch/finally](04-try-catch-finally.md)
5. [try-with-resources](05-try-with-resources.md)
6. [custom exceptions](06-custom-exceptions.md)
7. [exception translation](07-exception-translation.md)
8. [cause chains](08-cause-chains.md)
9. [error contracts](09-error-contracts.md)
10. [logging](10-logging.md)

---

# 2. Real-Life Analogy

An exception is like a fire alarm: the right floor handles what it can, but nobody should remove the battery and pretend nothing happened.

---

# 3. Visualization

```text
Failure → Throw → Stack Unwind → Catch/Translate/Recover → Stable External Error
```

---

# 4. Mind Map

```text
Exceptions, Error Handling, Resource Safety & API Failure Design
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

Design exception hierarchy for order creation. Map validation/domain/not-found/conflict/infrastructure failures into stable REST responses while preserving internal cause information.

---

# 8. Google Interview Drill

A service catches `Exception`, logs it, and returns null. Explain why this is dangerous and refactor toward explicit domain errors and centralized API exception mapping.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Catch `Exception` everywhere
- Throwing checked exceptions across every layer
- Logging and rethrowing repeatedly
- Returning null after error
- Exposing stack traces to clients

---

# 10. Day-Level Best Practices

- Catch where you can add meaning/recover
- Preserve cause
- Use domain-specific errors
- Close resources deterministically
- Centralize external error mapping

---

# 11. Interview Questions

1. Checked vs unchecked?
2. `throw` vs `throws`?
3. try-with-resources?
4. Suppressed exceptions?
5. Why exception translation?
6. When create custom exception?

---

# 12. Google-Level Follow-Ups

1. How do exceptions behave in CompletableFuture?
2. What happens to transaction on exception?
3. How should error handling interact with retries?
4. When would Result/Either-style modeling be preferable?

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
