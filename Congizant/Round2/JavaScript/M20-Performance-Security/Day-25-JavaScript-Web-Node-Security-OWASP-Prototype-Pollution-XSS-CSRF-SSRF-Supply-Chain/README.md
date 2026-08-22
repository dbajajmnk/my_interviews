# Day 25 — JavaScript/Web/Node Security: OWASP, Prototype Pollution, XSS, CSRF, SSRF & Supply Chain

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Threat modeling](01-Threat-modeling.md)
2. [Authentication vs authorization](02-Authentication-vs-authorization.md)
3. [BOLA](03-BOLA.md)
4. [SQL injection](04-SQL-injection.md)
5. [NoSQL injection awareness](05-NoSQL-injection-awareness.md)
6. [XSS](06-XSS.md)
7. [DOM XSS](07-DOM-XSS.md)
8. [CSRF](08-CSRF.md)
9. [CORS](09-CORS.md)
10. [SSRF](10-SSRF.md)
11. [Open redirect awareness](11-Open-redirect-awareness.md)
12. [Prototype pollution](12-Prototype-pollution.md)
13. [Unsafe object merging](13-Unsafe-object-merging.md)
14. [Mass assignment](14-Mass-assignment.md)
15. [File upload security](15-File-upload-security.md)
16. [Path traversal](16-Path-traversal.md)
17. [Command injection](17-Command-injection.md)
18. [Secrets management](18-Secrets-management.md)
19. [Secure logging](19-Secure-logging.md)
20. [npm supply-chain risk](20-npm-supply-chain-risk.md)
21. [Dependency confusion awareness](21-Dependency-confusion-awareness.md)
22. [ReDoS](22-ReDoS.md)
23. [Content Security Policy awareness](23-Content-Security-Policy-awareness.md)

---

# 2. Real-Life Analogy

Security is a series of trust boundaries: every identity, object, URL, file, package, and browser sink must be treated according to risk.

---

# 3. Visualization

```text
Input/Identity → Validate/AuthZ → Safe Data/Network → Output → Audit
```

---

# 4. Mind Map

```text
JavaScript/Web/Node Security: OWASP, Prototype Pollution, XSS, CSRF, SSRF & Supply Chain
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
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
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Threat-model a React/Node API with file uploads, webhooks, database access, and third-party packages. Add negative tests for the most important trust boundaries.

---

# 8. Google Interview Drill

An endpoint accepts a URL and fetches it server-side. Show how SSRF can reach internal resources and redesign with allowlists, egress controls, timeouts, and size limits.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
