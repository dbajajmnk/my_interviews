# Day 25 — Java/Application Security: OWASP, Spring Security, Secrets, JWT/OAuth2 & Secure Coding

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [threat modeling](01-threat-modeling.md)
2. [authentication](02-authentication.md)
3. [authorization](03-authorization.md)
4. [Spring Security concepts](04-Spring-Security-concepts.md)
5. [OAuth2/OIDC/JWT awareness](05-OAuth2-OIDC-JWT-awareness.md)
6. [BOLA](06-BOLA.md)
7. [SQL injection](07-SQL-injection.md)
8. [XSS/CSRF/CORS](08-XSS-CSRF-CORS.md)
9. [SSRF](09-SSRF.md)
10. [secrets](10-secrets.md)
11. [dependency risk](11-dependency-risk.md)
12. [secure logging](12-secure-logging.md)

---

# 2. Real-Life Analogy

Authentication is the building badge; authorization is the door access list. Possessing a badge does not open every room.

---

# 3. Visualization

```text
Request → Authenticate → Principal → Authorize Resource/Action → Validate → Execute → Audit
```

---

# 4. Mind Map

```text
Java/Application Security: OWASP, Spring Security, Secrets, JWT/OAuth2 & Secure Coding
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Threat-model a Spring REST API + React frontend. Cover login, token/session, BOLA, SQL injection, SSRF, file upload, secrets, dependency CVEs, logging, and tenant isolation.

---

# 8. Google Interview Drill

Authenticated user changes `/orders/123` to `/orders/456` and sees another user's order. Explain BOLA, deterministic resource auth, regression test, and why hiding UI links is irrelevant.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- JWT = security solved
- CORS = authentication
- Role check without resource ownership
- Secrets in application.yml
- Logging tokens/PII
- Disabling CSRF without understanding auth model

---

# 10. Day-Level Best Practices

- Threat model
- Authorize resource/action
- Use parameterized data access
- Least privilege
- Secure secrets
- Patch/scan dependencies
- Minimize sensitive logs

---

# 11. Interview Questions

1. AuthN vs AuthZ?
2. OAuth2 vs OIDC?
3. JWT pros/risks?
4. BOLA?
5. CSRF?
6. CORS?
7. SSRF?
8. How secure secrets?

---

# 12. Google-Level Follow-Ups

1. Token revocation?
2. Refresh tokens?
3. Service-to-service identity?
4. mTLS?
5. How would an AI tool change threat model?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
