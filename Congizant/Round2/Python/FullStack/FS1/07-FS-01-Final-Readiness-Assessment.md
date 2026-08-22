# FS-01 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. GET vs POST?
2. PUT vs PATCH?
3. Safe vs idempotent?
4. 401 vs 403?
5. 201 vs 202?
6. What is REST statelessness?
7. What is API contract?
8. Schema vs business validation?
9. AuthN vs AuthZ?
10. Offset vs cursor pagination?
11. Idempotency key?
12. Optimistic concurrency?
13. Controller vs service?
14. Repository?
15. DI?
16. Middleware?
17. FastAPI vs Django vs Flask?
18. Async vs sync API?
19. Timeout vs retry?
20. Circuit breaker?
21. Cache stampede?
22. Rate limiting?
23. Contract test?
24. BOLA?
25. Health vs readiness?

---

# 2. API Design — 12 Minutes

Design:

> `POST /orders`

Include:

- contract;
- validation;
- auth;
- idempotency;
- transaction;
- status codes;
- error schema;
- observability.

---

# 3. Code Review — 10 Minutes

Review:

```python
cache = {}

async def get_user(user_id):
    if user_id in cache:
        return cache[user_id]

    user = requests.get(
        f"https://users/{user_id}"
    ).json()

    cache[user_id] = user
    return user
```

Identify:

- blocking call in async;
- no timeout;
- unbounded/stale process-local cache;
- no error handling;
- no validation;
- concurrency/stampede;
- distributed consistency.

---

# 4. Security — 8 Minutes

Scenario:

Authenticated User A accesses:

```text
GET /users/A/orders/ORDER-B
```

Server returns ORDER-B owned by User B.

Explain:

> Broken Object Level Authorization.

Fix + regression test.

---

# 5. Google Interview Drill — 12 Minutes

## Long-Running AI Document API

Requirements:

- 100 MB file;
- 1–3 min processing;
- user needs job status.

Use:

> **Clarify → First Approach → Improve → Design → Test → Edge Cases → Trade-Off → Follow-Up → Defend**

Expected:

```text
upload/storage
→ job
→ queue
→ worker pipeline
→ job status
```

Include:

- retry;
- idempotency;
- security;
- observability.

---

# 6. Architect Follow-Up — 6 Minutes

Answer:

1. How scale API?
2. What if DB pool saturates?
3. What if queue grows?
4. What if LLM returns 429?
5. How do you protect downstream?
6. What metrics show saturation?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| HTTP / REST / Contract Understanding | 20% | ___ / 20 |
| API Design & Implementation | 20% | ___ / 20 |
| Security / Validation / Reliability | 20% | ___ / 20 |
| Google Interview Drill | 20% | ___ / 20 |
| Testing / Debugging / Code Review | 10% | ___ / 10 |
| Architect-Level Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

FS-01 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] can design API contract
- [ ] methods/status codes accurate
- [ ] validation/auth correct
- [ ] pagination/idempotency understood
- [ ] layering/DI understood
- [ ] framework choice defended
- [ ] async/resilience understood
- [ ] API security reviewed
- [ ] production architecture defended

---

# 9. Final Quick Notes

```text
Contract first
Validate boundary
AuthN ≠ AuthZ
Use semantic methods/statuses
Idempotency protects retried side effects
Thin route → service → adapter/repository
Framework ≠ architecture
Async for non-blocking I/O
Timeout every remote call
Retry selectively
Cache with TTL/invalidation
Rate limit protects capacity
Test authorization negatively
Long work → queue/job
Observe logs + metrics + traces
```

---

# 10. Decision

### READY

Move to:

> **FS-02 — SQL, Database & Data Access**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
