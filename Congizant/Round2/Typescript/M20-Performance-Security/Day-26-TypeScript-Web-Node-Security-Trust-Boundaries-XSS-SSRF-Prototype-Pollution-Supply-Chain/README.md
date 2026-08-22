# Day 26 — TypeScript/Web/Node Security: Trust Boundaries, XSS, SSRF, Prototype Pollution & Supply Chain

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Type safety is not security](01-Type-safety-is-not-security.md)
2. [Runtime validation](02-Runtime-validation.md)
3. [Authentication vs authorization](03-Authentication-vs-authorization.md)
4. [BOLA](04-BOLA.md)
5. [SQL injection](05-SQL-injection.md)
6. [NoSQL injection awareness](06-NoSQL-injection-awareness.md)
7. [XSS](07-XSS.md)
8. [DOM XSS](08-DOM-XSS.md)
9. [CSRF](09-CSRF.md)
10. [CORS](10-CORS.md)
11. [SSRF](11-SSRF.md)
12. [Prototype pollution](12-Prototype-pollution.md)
13. [Unsafe object merging](13-Unsafe-object-merging.md)
14. [Mass assignment](14-Mass-assignment.md)
15. [Path traversal](15-Path-traversal.md)
16. [Command injection](16-Command-injection.md)
17. [File upload security](17-File-upload-security.md)
18. [Secrets](18-Secrets.md)
19. [Secure logging](19-Secure-logging.md)
20. [npm supply-chain risk](20-npm-supply-chain-risk.md)
21. [Dependency confusion awareness](21-Dependency-confusion-awareness.md)
22. [ReDoS](22-ReDoS.md)
23. [CSP awareness](23-CSP-awareness.md)
24. [Unsafe deserialization awareness](24-Unsafe-deserialization-awareness.md)
25. [Generated code security](25-Generated-code-security.md)

---

# 2. Real-Life Analogy

An attacker does not care that your request body had a TypeScript interface; only runtime controls protect the system.

---

# 3. Visualization

```text
Untrusted Input → Runtime Validate → Authenticate/AuthZ → Safe Data/Network → Audit
```

---

# 4. Mind Map

```text
TypeScript/Web/Node Security: Trust Boundaries, XSS, SSRF, Prototype Pollution & Supply Chain
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

Threat-model a TypeScript React/Node platform with file uploads, webhooks, ORM access, and third-party packages.

---

# 8. Google Interview Drill

A DTO interface contains `role: 'user' | 'admin'`, but the server blindly trusts the request body. Explain why compile-time types do not authorize runtime data.

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
