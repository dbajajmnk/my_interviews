# Day 19 — AI-Generated Java Code Evaluation & Safe Engineering Use

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [AI code review](01-AI-code-review.md)
2. [correctness](02-correctness.md)
3. [API validity](03-API-validity.md)
4. [security](04-security.md)
5. [concurrency](05-concurrency.md)
6. [performance](06-performance.md)
7. [tests](07-tests.md)
8. [hallucinated dependencies](08-hallucinated-dependencies.md)
9. [generated SQL](09-generated-SQL.md)
10. [generated config](10-generated-config.md)
11. [human oversight](11-human-oversight.md)

---

# 2. Real-Life Analogy

AI-generated code is like a patch emailed by an unknown but talented contributor: useful, never exempt from review and CI.

---

# 3. Visualization

```text
Prompt → AI Proposal → Compile → Static/Security Checks → Tests → Review → Sandbox/Deploy Gate
```

---

# 4. Mind Map

```text
AI-Generated Java Code Evaluation & Safe Engineering Use
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

Evaluate five AI-generated snippets: concurrent cache, REST controller, JPA query, CompletableFuture pipeline, and shell command. Produce a review verdict: accept / repair / reject, with evidence.

---

# 8. Google Interview Drill

AI generates a Spring endpoint that accepts `userId` and returns that user's records without authorization. Explain why code can be syntactically correct yet architecturally unsafe. Add tests and policy checks.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Trusting code because it compiles
- Assuming generated tests prove correctness
- Blind dependency additions
- Executing generated SQL/shell directly
- Ignoring license/security/governance

---

# 10. Day-Level Best Practices

- Compile and test
- Verify APIs against docs/build
- Review security/concurrency
- Use sandbox/dry-run for actions
- Keep human ownership

---

# 11. Interview Questions

1. How evaluate AI-generated Java?
2. What kinds of hallucinations occur?
3. How validate generated tests?
4. How secure generated SQL?
5. Can AI approve its own code?
6. What belongs in an AI code-review rubric?

---

# 12. Google-Level Follow-Ups

1. How automate evaluation in CI?
2. When can low-risk changes auto-merge?
3. How detect vulnerable dependencies?
4. How preserve audit trail?

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
