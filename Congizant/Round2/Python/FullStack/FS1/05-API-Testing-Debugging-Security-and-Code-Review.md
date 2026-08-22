# FS-01 / File 05 — API Testing, Debugging, Security & Code Review

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** M17 + M14 + M15 + M20

---

# 1. Objective

Master:

- API test pyramid;
- unit/integration/contract/end-to-end;
- mocking/fakes;
- API debugging;
- security review;
- code review;
- regression strategy;
- observability-driven diagnosis.

---

# 2. 5W+H

## What?

API quality is validated across logic, integration, contract, security, and runtime behavior.

## Why?

A backend can pass unit tests and still fail in production due to DB/network/auth/contract issues.

## Where?

CI/CD, pre-production, production incident response.

## When?

Every release and bug fix.

## How?

Layered tests + secure code review + runtime observability.

---

# 3. Real-Life Analogy

Testing a car requires more than testing the engine on a bench.

You also test:

- brakes;
- road behavior;
- crash safety;
- full vehicle.

---

# 4. Visualization

```text
Unit
 ↓
Service Integration
 ↓
DB / External Adapter
 ↓
API Contract
 ↓
E2E / Smoke
 ↓
Load / Security
```

---

# 5. Mind Map

```text
API Quality
│
├── Unit
├── Integration
├── Contract
├── E2E
├── Security
├── Load
├── Debugging
└── Code Review
```

---

# 6. Core Concepts

## 6.1 Unit Test

Test business logic with fakes/mocks.

---

## 6.2 Integration Test

Test real boundary such as DB or HTTP adapter.

---

## 6.3 Contract Test

Verify consumer/provider expectations.

Useful in frontend-backend and microservice integration.

---

## 6.4 E2E

Validate critical user flow.

Keep focused; E2E suites are slower/brittle.

---

## 6.5 API Security Checks

Review:

- authentication;
- object-level authorization;
- input validation;
- injection;
- mass assignment;
- rate limits;
- secrets;
- sensitive data;
- logging;
- CORS;
- file upload safety.

---

## 6.6 Broken Object Level Authorization

Example:

```text
GET /users/101/orders/999
```

Authenticated user must still be authorized to access order 999.

Checking “logged in” is not enough.

---

## 6.7 Mass Assignment

Do not map arbitrary request JSON directly to privileged model fields.

Example attacker sets:

```json
{"role":"ADMIN"}
```

Explicit allowed fields.

---

# 7. Engineering Depth

## 7.1 Debug Slow API

Use trace breakdown:

```text
request
├── auth
├── DB
├── external API
├── serialization
└── queue/lock wait
```

---

## 7.2 Code Review Order

```text
correctness
→ authorization/security
→ transactions/data
→ concurrency
→ errors
→ performance
→ tests
→ readability
```

---

# 8. Implementation / Code

Bad:

```python
def update_user(user_id, payload):
    user = db.get(user_id)
    for key, value in payload.items():
        setattr(user, key, value)
```

Risk: mass assignment.

Better: explicit mapping/validated DTO.

---

# 9. Hands-On Practice

Review:

```python
@app.get("/orders/{order_id}")
def get_order(order_id):
    return db.get_order(order_id)
```

Ask:

- authentication?
- ownership authorization?
- not found?
- serialization?
- sensitive fields?
- tracing?

---

# 10. Google Interview Drill

## Problem — API Returns Correct Data to Wrong User

### Clarify

- authentication working?
- tenant?
- object ownership?
- caching?
- reproduction?

### Root Cause Candidate

BOLA / missing object-level authorization.

### Fix

Authorize resource against principal/tenant before return.

### Regression Test

User A cannot access User B resource.

### Follow-Up

- admin override?
- multi-tenant DB?
- cache key must include tenant?
- audit logging?

---

# 11. Common Mistakes

1. Unit tests only.
2. Over-mocking.
3. No authorization negative tests.
4. Logging secrets/tokens.
5. Direct JSON-to-model assignment.
6. No regression test.
7. Ignoring contract compatibility.
8. No load/security testing for critical API.

---

# 12. Best Practices

- test business rules;
- test DB/integration boundaries;
- add negative authorization tests;
- parameterize queries;
- explicit request DTO;
- structured logs;
- correlation IDs;
- regression test every significant defect.

---

# 13. Interview Questions

1. Unit vs integration?
2. Contract test?
3. What should be mocked?
4. How test auth?
5. What is BOLA?
6. What is mass assignment?
7. How debug slow API?
8. Code review order?
9. How prevent regression?

---

# 14. Google-Level Follow-Ups

1. cache leaks tenant data?
2. test third-party failure?
3. load test target?
4. test idempotency?
5. test retry?
6. test circuit breaker?
7. test async cancellation?

---

# 15. Quick Revision

```text
Test:
unit
integration
contract
E2E
security
load

Security:
AuthN
AuthZ
BOLA
validation
injection
mass assignment
secrets
rate limit
```

---

# 16. Readiness Gate

- [ ] Test layers.
- [ ] Contract tests.
- [ ] BOLA.
- [ ] Mass assignment.
- [ ] Debug slow API.
- [ ] Code review order.
- [ ] Negative security tests.
- [ ] Wrong-user drill.

**Gate:** READY / REPAIR

---

# 17. References

- OWASP API Security Top 10
- Python testing framework docs
- OpenAPI/contract-testing references
