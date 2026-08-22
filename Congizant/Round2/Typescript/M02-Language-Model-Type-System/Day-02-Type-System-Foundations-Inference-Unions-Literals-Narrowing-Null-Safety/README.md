# Day 02 — Type System Foundations: Inference, Unions, Literals, Narrowing & Null Safety

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Static type checking over JavaScript](01-Static-type-checking-over-JavaScript.md)
2. [Type inference](02-Type-inference.md)
3. [Type annotations](03-Type-annotations.md)
4. [Primitive types](04-Primitive-types.md)
5. [Literal types](05-Literal-types.md)
6. [Union types](06-Union-types.md)
7. [Intersection types](07-Intersection-types.md)
8. [Type aliases](08-Type-aliases.md)
9. [Interfaces](09-Interfaces.md)
10. [Structural typing](10-Structural-typing.md)
11. [Optional properties](11-Optional-properties.md)
12. [Readonly properties](12-Readonly-properties.md)
13. [strictNullChecks](13-strictNullChecks.md)
14. [undefined vs null](14-undefined-vs-null.md)
15. [Control-flow narrowing](15-Control-flow-narrowing.md)
16. [typeof narrowing](16-typeof-narrowing.md)
17. [in operator narrowing](17-in-operator-narrowing.md)
18. [Truthiness narrowing](18-Truthiness-narrowing.md)
19. [Discriminated unions](19-Discriminated-unions.md)
20. [never](20-never.md)
21. [unknown](21-unknown.md)
22. [any](22-any.md)
23. [object vs Object vs {}](23-object-vs-Object-vs.md)
24. [Type assertions](24-Type-assertions.md)

---

# 2. Real-Life Analogy

The type system is a map of possible values. Narrowing is reducing the map until only the safe route remains.

---

# 3. Visualization

```text
Unknown Value → Type/Union → Narrowing → Safe Operation → Exhaustive Result
```

---

# 4. Mind Map

```text
Type System Foundations: Inference, Unions, Literals, Narrowing & Null Safety
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

Model an API result as a discriminated union and remove all unsafe `any`/non-null assertions from the example.

---

# 8. Google Interview Drill

A function accepts `any` and crashes on production input. Replace it with `unknown`, runtime validation, and narrowing.

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
