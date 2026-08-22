# Day 25 — Go Security: Web/API, Input, Files, SSRF, Supply Chain & Memory-Safe Boundaries

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Threat modeling](01-Threat-modeling.md)
2. [Authentication vs authorization](02-Authentication-vs-authorization.md)
3. [BOLA](03-BOLA.md)
4. [SQL injection](04-SQL-injection.md)
5. [Command injection](05-Command-injection.md)
6. [Path traversal](06-Path-traversal.md)
7. [SSRF](07-SSRF.md)
8. [Open redirect awareness](08-Open-redirect-awareness.md)
9. [File upload security](09-File-upload-security.md)
10. [Request body limits](10-Request-body-limits.md)
11. [JSON validation](11-JSON-validation.md)
12. [Mass assignment awareness](12-Mass-assignment-awareness.md)
13. [Secrets management](13-Secrets-management.md)
14. [Secure logging](14-Secure-logging.md)
15. [TLS configuration awareness](15-TLS-configuration-awareness.md)
16. [JWT validation awareness](16-JWT-validation-awareness.md)
17. [CORS awareness](17-CORS-awareness.md)
18. [CSRF awareness](18-CSRF-awareness.md)
19. [XSS awareness for templates](19-XSS-awareness-for-templates.md)
20. [html/template escaping](20-html-template-escaping.md)
21. [text/template caution](21-text-template-caution.md)
22. [Dependency vulnerabilities](22-Dependency-vulnerabilities.md)
23. [govulncheck awareness](23-govulncheck-awareness.md)
24. [Module supply-chain risk](24-Module-supply-chain-risk.md)
25. [Rate limiting awareness](25-Rate-limiting-awareness.md)
26. [unsafe package risk](26-unsafe-package-risk.md)
27. [Race conditions as security risk](27-Race-conditions-as-security-risk.md)

---

# 2. Real-Life Analogy

Day 25 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Untrusted Input → Validate/AuthZ → Safe DB/File/Network/Template → Audit
```

---

# 4. Mind Map

```text
Go Security: Web/API, Input, Files, SSRF, Supply Chain & Memory-Safe Boundaries
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Threat-model a Go API with file uploads, outbound HTTP, DB access and templates.

---

# 8. Google Interview Drill

Secure an endpoint that fetches a user-supplied URL and returns the response.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
