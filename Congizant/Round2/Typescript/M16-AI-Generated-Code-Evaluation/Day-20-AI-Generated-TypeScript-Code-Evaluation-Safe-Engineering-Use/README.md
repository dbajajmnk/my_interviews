# Day 20 — AI-Generated TypeScript Code Evaluation & Safe Engineering Use

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [AI code as untrusted proposal](01-AI-code-as-untrusted-proposal.md)
2. [Hallucinated packages](02-Hallucinated-packages.md)
3. [Hallucinated types](03-Hallucinated-types.md)
4. [Hallucinated framework APIs](04-Hallucinated-framework-APIs.md)
5. [Unsound casts](05-Unsound-casts.md)
6. [any leakage](06-any-leakage.md)
7. [Non-null assertions](07-Non-null-assertions.md)
8. [Fake runtime validation through interfaces](08-Fake-runtime-validation-through-interfaces.md)
9. [Generic overengineering](09-Generic-overengineering.md)
10. [Conditional type mistakes](10-Conditional-type-mistakes.md)
11. [Async correctness](11-Async-correctness.md)
12. [Promise handling](12-Promise-handling.md)
13. [Security review](13-Security-review.md)
14. [Dependency risk](14-Dependency-risk.md)
15. [Generated tests](15-Generated-tests.md)
16. [Generated schemas](16-Generated-schemas.md)
17. [Generated SQL](17-Generated-SQL.md)
18. [Performance review](18-Performance-review.md)
19. [Human approval](19-Human-approval.md)
20. [Accept repair reject rubric](20-Accept-repair-reject-rubric.md)

---

# 2. Real-Life Analogy

AI can generate beautiful types that hide unsafe casts; the real test is whether the runtime contract is actually proven.

---

# 3. Visualization

```text
AI Output → tsc/API Verify → Runtime Validation → Security/Async Review → Tests → Verdict
```

---

# 4. Mind Map

```text
AI-Generated TypeScript Code Evaluation & Safe Engineering Use
├── Type-System Guarantee
├── Emitted JavaScript
├── Runtime Validation Boundary
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
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

Broad P1 topics are awareness-first. Do not sacrifice P0 correctness to memorize type-system trivia.

---

# 6. Engineering Integration

Connect:

> **Requirement → Static Type Invariant → Runtime Boundary → JavaScript Behavior → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Evaluate AI-generated snippets for an API client, Nest/Express controller, generic utility, ORM query, and runtime validator.

---

# 8. Google Interview Drill

AI returns code with `as User` after parsing untrusted JSON. Explain why the type checker is being bypassed and how to verify safely.

Use:

> **Clarify → First Approach → Improve → Code/Design → Type-Check → Run/Test → Edge Cases → Runtime Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Treating TypeScript types as runtime guards.
- Replacing evidence with `any`, assertions, or `!`.
- Forgetting JavaScript event-loop/memory/module behavior.
- Sharing internal types across boundaries without runtime/schema contracts.
- Building type-level complexity that exceeds business value.
- Ignoring framework/package/runtime version differences.

---

# 10. Day-Level Best Practices

- Strict mode by default.
- `unknown` at uncertain boundaries.
- Runtime validation at external boundaries.
- Keep types readable and stable.
- Preserve JavaScript/Node runtime literacy.
- Use type-level abstraction only when it reduces real duplication/risk.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. Which parts disappear after compilation?
3. What could still fail at runtime?
4. What boundary needs runtime validation?
5. What would you review in AI-generated code?
6. What trade-off would make you simplify the type design?

---

# 12. Google-Level Follow-Ups

1. What changes if the input comes from JSON/network/database?
2. What changes if strict mode is enabled?
3. What changes for a library vs an application?
4. What happens if JavaScript callers bypass your types?
5. What would you measure if compiler performance is slow?
6. What would you measure if runtime performance is slow?

---

# 13. Quick Revision

```text
What does the type checker know?
What gets emitted?
What exists at runtime?
Where is data validated?
What can still fail?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish static vs runtime guarantees.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
