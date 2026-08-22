# Day 25 — Security: Kotlin/JVM, Web/API, Serialization & Supply Chain

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Threat modeling](01-Threat-modeling.md)
2. [Authentication vs authorization](02-Authentication-vs-authorization.md)
3. [BOLA](03-BOLA.md)
4. [SQL injection](04-SQL-injection.md)
5. [XSS awareness](05-XSS-awareness.md)
6. [CSRF awareness](06-CSRF-awareness.md)
7. [CORS](07-CORS.md)
8. [SSRF](08-SSRF.md)
9. [Mass assignment](09-Mass-assignment.md)
10. [File upload security](10-File-upload-security.md)
11. [Path traversal](11-Path-traversal.md)
12. [Command injection](12-Command-injection.md)
13. [Secrets management](13-Secrets-management.md)
14. [Secure logging](14-Secure-logging.md)
15. [Unsafe Java serialization](15-Unsafe-Java-serialization.md)
16. [Deserialization risk](16-Deserialization-risk.md)
17. [Dependency vulnerabilities](17-Dependency-vulnerabilities.md)
18. [Gradle supply-chain risk](18-Gradle-supply-chain-risk.md)
19. [JWT validation awareness](19-JWT-validation-awareness.md)
20. [Input validation](20-Input-validation.md)
21. [Output encoding](21-Output-encoding.md)
22. [Rate limiting awareness](22-Rate-limiting-awareness.md)

---

# 2. Real-Life Analogy

Day 25 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Untrusted input → validate/authZ → safe DB/network/file → audit
```

---

# 4. Mind Map

```text
Security: Kotlin/JVM, Web/API, Serialization & Supply Chain
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
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
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Threat-model a Kotlin backend with file uploads, DB access and external HTTP calls.

---

# 8. Google Interview Drill

Secure an endpoint that fetches a user-supplied URL against SSRF.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
