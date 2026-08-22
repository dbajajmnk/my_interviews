# Day 18 — Code Review, Refactoring, Clean Java & Maintainability

**Module:** M15 — Code Review & Refactoring Mastery  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [review order](01-review-order.md)
2. [correctness](02-correctness.md)
3. [security](03-security.md)
4. [concurrency](04-concurrency.md)
5. [performance](05-performance.md)
6. [API design](06-API-design.md)
7. [code smells](07-code-smells.md)
8. [refactoring](08-refactoring.md)
9. [naming](09-naming.md)
10. [immutability](10-immutability.md)
11. [legacy code](11-legacy-code.md)
12. [technical debt](12-technical-debt.md)

---

# 2. Real-Life Analogy

A code reviewer is an airport security officer: dangerous items matter more than whether a suitcase is neatly packed.

---

# 3. Visualization

```text
Requirement → Correctness → Security/Data/Concurrency → Failure/Performance → Tests → Maintainability → Style
```

---

# 4. Mind Map

```text
Code Review, Refactoring, Clean Java & Maintainability
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

Review a deliberately flawed service containing mutable shared state, broad catch, SQL concatenation, N+1 query, duplicate code, and boolean flags. Rank issues by severity.

---

# 8. Google Interview Drill

You have 20 minutes to review a PR. Explain why style should not be your first concern. Identify correctness/security first, then maintainability, and separate blocker vs suggestion.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Style-first review
- Refactoring without tests
- Massive unrelated cleanup in feature PR
- Subjective naming wars
- Ignoring concurrency/security

---

# 10. Day-Level Best Practices

- Review risk first
- Make comments actionable
- Separate blocker from suggestion
- Use automated formatter/static checks
- Refactor in small verified steps

---

# 11. Interview Questions

1. Your code-review checklist?
2. What is refactoring?
3. Common Java code smells?
4. How prioritize technical debt?
5. How review API compatibility?
6. What makes a useful review comment?

---

# 12. Google-Level Follow-Ups

1. How review AI-generated PR?
2. How handle disagreement?
3. When accept duplication?
4. How refactor legacy code without tests?

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
