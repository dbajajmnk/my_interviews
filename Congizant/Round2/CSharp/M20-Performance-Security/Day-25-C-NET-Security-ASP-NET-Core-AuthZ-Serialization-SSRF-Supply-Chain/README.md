# Day 25 — C#/.NET Security: ASP.NET Core, AuthZ, Serialization, SSRF & Supply Chain

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Threat modeling](01-Threat-modeling.md)
2. [Authentication vs authorization](02-Authentication-vs-authorization.md)
3. [BOLA](03-BOLA.md)
4. [SQL injection](04-SQL-injection.md)
5. [EF parameterization awareness](05-EF-parameterization-awareness.md)
6. [XSS awareness](06-XSS-awareness.md)
7. [Razor encoding awareness](07-Razor-encoding-awareness.md)
8. [CSRF](08-CSRF.md)
9. [CORS](09-CORS.md)
10. [SSRF](10-SSRF.md)
11. [Open redirect awareness](11-Open-redirect-awareness.md)
12. [Mass assignment/overposting](12-Mass-assignment-overposting.md)
13. [File upload security](13-File-upload-security.md)
14. [Path traversal](14-Path-traversal.md)
15. [Command injection](15-Command-injection.md)
16. [Secrets management](16-Secrets-management.md)
17. [ASP.NET Core Data Protection awareness](17-ASP-NET-Core-Data-Protection-awareness.md)
18. [Secure logging](18-Secure-logging.md)
19. [JWT validation](19-JWT-validation.md)
20. [Cookie security](20-Cookie-security.md)
21. [TLS awareness](21-TLS-awareness.md)
22. [System.Text.Json security awareness](22-System-Text-Json-security-awareness.md)
23. [Unsafe deserialization awareness](23-Unsafe-deserialization-awareness.md)
24. [Dependency vulnerabilities](24-Dependency-vulnerabilities.md)
25. [NuGet supply-chain risk](25-NuGet-supply-chain-risk.md)
26. [Rate limiting awareness](26-Rate-limiting-awareness.md)
27. [Unsafe code risk](27-Unsafe-code-risk.md)

---

# 2. Real-Life Analogy

Day 25 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Untrusted Input → Validate/AuthZ → Safe DB/File/Network/Serialization → Audit
```

---

# 4. Mind Map

```text
C#/.NET Security: ASP.NET Core, AuthZ, Serialization, SSRF & Supply Chain
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
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

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Threat-model an ASP.NET Core API with file uploads, DB access, external HTTP calls and JWT auth.

---

# 8. Google Interview Drill

Secure an endpoint that fetches a user-supplied URL against SSRF.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
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
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
