# Day 23 — REST, Auth, Idempotency, gRPC/Protobuf & API Contracts

**Module:** M19 — Backend / Framework / API Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [REST resource design](01-REST-resource-design.md)
2. [HTTP methods](02-HTTP-methods.md)
3. [Status codes](03-Status-codes.md)
4. [Request validation](04-Request-validation.md)
5. [Stable error contracts](05-Stable-error-contracts.md)
6. [Authentication](06-Authentication.md)
7. [Authorization](07-Authorization.md)
8. [Object-level authorization](08-Object-level-authorization.md)
9. [JWT awareness](09-JWT-awareness.md)
10. [OAuth2/OIDC awareness](10-OAuth2-OIDC-awareness.md)
11. [Pagination](11-Pagination.md)
12. [Cursor pagination awareness](12-Cursor-pagination-awareness.md)
13. [Idempotency keys](13-Idempotency-keys.md)
14. [Retries and side effects](14-Retries-and-side-effects.md)
15. [OpenAPI awareness](15-OpenAPI-awareness.md)
16. [gRPC](16-gRPC.md)
17. [Protobuf](17-Protobuf.md)
18. [Schema evolution](18-Schema-evolution.md)
19. [Generated stubs](19-Generated-stubs.md)
20. [HTTP/2 awareness](20-HTTP-2-awareness.md)
21. [TLS awareness](21-TLS-awareness.md)
22. [API versioning](22-API-versioning.md)
23. [Backward compatibility](23-Backward-compatibility.md)

---

# 2. Real-Life Analogy

Day 23 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Client → Auth/AuthZ → Validation → Idempotent Use Case → Stable Contract
```

---

# 4. Mind Map

```text
REST, Auth, Idempotency, gRPC/Protobuf & API Contracts
├── Language Semantics
├── Lifetime / Ownership
├── Compiler / Linker / Runtime
├── Concurrency / Memory Model
├── Failure / Undefined Behavior
├── Debugging / Sanitizers
├── Code Review
├── AI Evaluation
├── Performance / Production
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

---

# 6. Engineering Integration

Connect:

> **Concept → C++ Guarantee → Lifetime/Ownership → Compiler/Runtime Boundary → Failure/UB → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Design Create/Get/List/Cancel Order APIs with validation, authZ, pagination, idempotency and protobuf/gRPC awareness.

---

# 8. Google Interview Drill

Design POST /payments where upstream may succeed after timeout; prevent duplicate side effects.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Raw ownership without RAII.
- Dangling pointers/references/views.
- Iterator invalidation.
- Incorrect copy/move semantics.
- Missing virtual destructor.
- Data races/atomic misuse.
- Overusing templates/patterns.
- Optimizing before profiling.

---

# 10. Day-Level Best Practices

- Rule of Zero first.
- RAII everywhere practical.
- Smart/value ownership explicit.
- Strong warnings + sanitizers.
- Const-correctness.
- Defined behavior only.
- Measure before optimization.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the C++ standard guarantee?
3. What is compiler/ABI/runtime-specific?
4. What can dangle, race, leak or invoke UB?
5. What tool would you use to prove the problem?
6. What simpler/safer design could replace this?

---

# 12. Google-Level Follow-Ups

1. What changes under optimization?
2. What changes under concurrency?
3. What changes if ownership becomes shared?
4. What changes across a shared-library ABI boundary?
5. What would ASan/TSan/profiler show?
6. What trade-off would make you choose another language/runtime?

---

# 13. Quick Revision

```text
What is it?
Who owns it?
When does lifetime end?
Can anything dangle?
What can be UB?
What allocates/copies/moves?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can explain ownership/lifetime/UB risks.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
