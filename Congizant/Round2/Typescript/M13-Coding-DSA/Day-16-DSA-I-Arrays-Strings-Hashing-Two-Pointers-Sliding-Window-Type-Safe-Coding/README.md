# Day 16 — DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Type-Safe Coding

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Google problem-solving flow](01-Google-problem-solving-flow.md)
2. [Big-O](02-Big-O.md)
3. [Arrays](03-Arrays.md)
4. [Strings](04-Strings.md)
5. [Map for hashing](05-Map-for-hashing.md)
6. [Set for membership](06-Set-for-membership.md)
7. [Two pointers](07-Two-pointers.md)
8. [Sliding window](08-Sliding-window.md)
9. [Stack](09-Stack.md)
10. [Queue](10-Queue.md)
11. [Deque implementation choices](11-Deque-implementation-choices.md)
12. [Prefix sums awareness](12-Prefix-sums-awareness.md)
13. [Generic helper functions](13-Generic-helper-functions.md)
14. [Readonly inputs](14-Readonly-inputs.md)
15. [Brute force to optimization](15-Brute-force-to-optimization.md)
16. [Edge cases](16-Edge-cases.md)
17. [Complexity communication](17-Complexity-communication.md)

---

# 2. Real-Life Analogy

Types can make algorithm code clearer, but they do not change Big-O or replace algorithmic reasoning.

---

# 3. Visualization

```text
Clarify → Brute Force → Typed Invariant → Optimize → Test → Complexity
```

---

# 4. Mind Map

```text
DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Type-Safe Coding
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

Solve Two Sum, longest substring, valid parentheses, and maximum window sum using strict TypeScript and no unsafe assertions.

---

# 8. Google Interview Drill

Solve longest substring without repeating characters. Explain the invariant and how TypeScript types help without changing runtime complexity.

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
