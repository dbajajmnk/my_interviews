# Day 03 — Functions, Overloads, Generics, Constraints & Type-Safe APIs

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Function parameter types](01-Function-parameter-types.md)
2. [Return types](02-Return-types.md)
3. [Optional parameters](03-Optional-parameters.md)
4. [Default parameters](04-Default-parameters.md)
5. [Rest parameters](05-Rest-parameters.md)
6. [Function types](06-Function-types.md)
7. [Call signatures](07-Call-signatures.md)
8. [Construct signatures](08-Construct-signatures.md)
9. [Function overloads](09-Function-overloads.md)
10. [Implementation signatures](10-Implementation-signatures.md)
11. [Generic functions](11-Generic-functions.md)
12. [Generic type parameters](12-Generic-type-parameters.md)
13. [Constraints](13-Constraints.md)
14. [keyof constraints](14-keyof-constraints.md)
15. [Generic defaults](15-Generic-defaults.md)
16. [Inference in generics](16-Inference-in-generics.md)
17. [Callbacks](17-Callbacks.md)
18. [this parameter typing](18-this-parameter-typing.md)
19. [void](19-void.md)
20. [never returning functions](20-never-returning-functions.md)
21. [Higher-order functions](21-Higher-order-functions.md)
22. [Variance awareness](22-Variance-awareness.md)

---

# 2. Real-Life Analogy

Generics are reusable molds that preserve the shape of whatever concrete type the caller supplies.

---

# 3. Visualization

```text
Generic API → Constraints/Inference → Caller-Specific Types → Runtime JavaScript
```

---

# 4. Mind Map

```text
Functions, Overloads, Generics, Constraints & Type-Safe APIs
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

Build a type-safe generic repository helper and an overloaded API, then explain when overloads are better or worse than unions/generics.

---

# 8. Google Interview Drill

A generic utility returns `any` and loses all type safety. Redesign with constraints and inferred return types.

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
