# Day 15 — Runtime Validation, JSON, Fetch, Serialization & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [JSON.parse returns runtime values](01-JSON-parse-returns-runtime-values.md)
2. [unknown at trust boundaries](02-unknown-at-trust-boundaries.md)
3. [Runtime schema validation](03-Runtime-schema-validation.md)
4. [Zod awareness](04-Zod-awareness.md)
5. [Valibot/io-ts awareness](05-Valibot-io-ts-awareness.md)
6. [Type guards](06-Type-guards.md)
7. [Schema inference patterns](07-Schema-inference-patterns.md)
8. [DTO validation](08-DTO-validation.md)
9. [fetch typing](09-fetch-typing.md)
10. [Typed HTTP client wrappers](10-Typed-HTTP-client-wrappers.md)
11. [Request/Response types](11-Request-Response-types.md)
12. [AbortSignal](12-AbortSignal.md)
13. [URL](13-URL.md)
14. [Serialization limitations](14-Serialization-limitations.md)
15. [Date serialization](15-Date-serialization.md)
16. [BigInt serialization issue](16-BigInt-serialization-issue.md)
17. [File I/O in Node](17-File-I-O-in-Node.md)
18. [Buffers](18-Buffers.md)
19. [Streams](19-Streams.md)
20. [WebSocket typing awareness](20-WebSocket-typing-awareness.md)
21. [SSE awareness](21-SSE-awareness.md)
22. [Network timeouts](22-Network-timeouts.md)
23. [Response limits](23-Response-limits.md)

---

# 2. Real-Life Analogy

External JSON is an unopened package: a TypeScript label on the box does not prove what is inside.

---

# 3. Visualization

```text
External Bytes/JSON → unknown → Runtime Schema → Trusted Type → Business Logic
```

---

# 4. Mind Map

```text
Runtime Validation, JSON, Fetch, Serialization & Networking
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

Build a typed HTTP client that treats external JSON as unknown, validates it at runtime, and returns a precise result type.

---

# 8. Google Interview Drill

An API client casts `await response.json() as User`. Explain why this is unsafe and replace with runtime validation.

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
