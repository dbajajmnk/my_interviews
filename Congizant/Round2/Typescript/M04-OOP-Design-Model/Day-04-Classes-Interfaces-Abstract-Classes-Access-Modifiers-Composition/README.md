# Day 04 — Classes, Interfaces, Abstract Classes, Access Modifiers & Composition

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Class fields](01-Class-fields.md)
2. [Constructors](02-Constructors.md)
3. [Parameter properties](03-Parameter-properties.md)
4. [public](04-public.md)
5. [private](05-private.md)
6. [protected](06-protected.md)
7. [readonly](07-readonly.md)
8. [ECMAScript private fields awareness](08-ECMAScript-private-fields-awareness.md)
9. [Interfaces](09-Interfaces.md)
10. [Implements](10-Implements.md)
11. [Abstract classes](11-Abstract-classes.md)
12. [Abstract members](12-Abstract-members.md)
13. [Inheritance](13-Inheritance.md)
14. [Method overriding](14-Method-overriding.md)
15. [Composition over inheritance](15-Composition-over-inheritance.md)
16. [Dependency injection by constructor](16-Dependency-injection-by-constructor.md)
17. [Polymorphism](17-Polymorphism.md)
18. [Structural compatibility of classes](18-Structural-compatibility-of-classes.md)
19. [Static members](19-Static-members.md)
20. [Generic classes](20-Generic-classes.md)
21. [Getters and setters](21-Getters-and-setters.md)
22. [Immutability](22-Immutability.md)
23. [Domain modeling](23-Domain-modeling.md)

---

# 2. Real-Life Analogy

Interfaces are contracts on the blueprint; classes and JavaScript objects are the structures that actually exist at runtime.

---

# 3. Visualization

```text
Interface/Abstract Contract → Class/Composition → Emitted JS Object → Behavior
```

---

# 4. Mind Map

```text
Classes, Interfaces, Abstract Classes, Access Modifiers & Composition
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

Model payment processors with interfaces and constructor-injected composition, then compare to an inheritance-heavy version.

---

# 8. Google Interview Drill

A class hierarchy compiles but violates behavioral expectations. Explain why structural typing does not remove the need for LSP.

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
