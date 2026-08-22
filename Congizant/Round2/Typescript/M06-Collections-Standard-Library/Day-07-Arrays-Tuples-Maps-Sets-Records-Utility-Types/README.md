# Day 07 — Arrays, Tuples, Maps, Sets, Records & Utility Types

**Module:** M06 — Collections & Standard Library  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Array<T>](01-Array-T.md)
2. [ReadonlyArray](02-ReadonlyArray.md)
3. [Tuples](03-Tuples.md)
4. [Readonly tuples](04-Readonly-tuples.md)
5. [Map](05-Map.md)
6. [Set](06-Set.md)
7. [WeakMap](07-WeakMap.md)
8. [WeakSet](08-WeakSet.md)
9. [Record](09-Record.md)
10. [Partial](10-Partial.md)
11. [Required](11-Required.md)
12. [Readonly utility type](12-Readonly-utility-type.md)
13. [Pick](13-Pick.md)
14. [Omit](14-Omit.md)
15. [Exclude](15-Exclude.md)
16. [Extract](16-Extract.md)
17. [NonNullable](17-NonNullable.md)
18. [Parameters](18-Parameters.md)
19. [ReturnType](19-ReturnType.md)
20. [Awaited](20-Awaited.md)
21. [keyof](21-keyof.md)
22. [Indexed access types](22-Indexed-access-types.md)
23. [Destructuring](23-Destructuring.md)
24. [Spread](24-Spread.md)
25. [Optional chaining](25-Optional-chaining.md)
26. [Nullish coalescing](26-Nullish-coalescing.md)
27. [Collection complexity](27-Collection-complexity.md)

---

# 2. Real-Life Analogy

Utility types are type-level transformation tools: they reshape contracts without copying runtime objects.

---

# 3. Visualization

```text
Source Type → Utility/Mapped Transform → Derived Type → Same Runtime Data
```

---

# 4. Mind Map

```text
Arrays, Tuples, Maps, Sets, Records & Utility Types
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

Design immutable configuration, typed lookup maps, tuple-based coordinates, and API projection types using utility types.

---

# 8. Google Interview Drill

Choose between interface/object, Record, Map, tuple, and discriminated union for five different domain requirements.

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
