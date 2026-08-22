# FS-03 / File 04 — API Integration, Auth, Errors, Caching & Full-Stack Flow

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M19 + M20

---

# 1. Objective

Master frontend/backend integration:

- fetch/API client;
- request/response contracts;
- loading/error/empty/success states;
- cancellation;
- auth;
- authorization-aware UI;
- token/cookie trade-offs;
- CORS/CSRF awareness;
- cache/server state;
- optimistic updates;
- retries;
- correlation IDs.

---

# 2. 5W+H

## What?

Full-stack integration turns backend contracts into reliable user experiences.

## Why?

Most production bugs happen at boundaries: contracts, auth, timing, errors, stale data.

## Where?

Every React ↔ Python API interaction.

## When?

Any frontend data flow.

## How?

Typed client contract → request → server validation/auth → response/error → UI state update.

---

# 3. Real-Life Analogy

Frontend and backend are two departments using a shared form.

If the form fields or error codes change without coordination, work stops even if both departments are individually correct.

---

# 4. Visualization

```text
React
 ↓
API Client
 ↓
HTTP
 ↓
Python API
 ├── validate
 ├── auth
 ├── service
 └── DB
 ↓
Response
 ↓
Client cache/state
 ↓
UI
```

---

# 5. Mind Map

```text
Integration
│
├── Contract
├── Loading
├── Error
├── Auth
├── CORS
├── CSRF
├── Cache
├── Retry
├── Optimistic Update
└── Correlation ID
```

---

# 6. Core Concepts

## 6.1 API Client Boundary

Centralize common concerns:

- base URL;
- auth headers/cookies;
- JSON parsing;
- error mapping;
- correlation IDs;
- timeout/cancellation.

Avoid duplicated fetch boilerplate in every component.

---

## 6.2 UI States

At minimum:

```text
idle
loading
success
empty
error
```

Sometimes:

```text
refreshing
stale
optimistic
```

Only model states product actually needs.

---

## 6.3 Authentication Storage

Common browser approaches:

### HttpOnly secure cookie
JavaScript cannot directly read it; helps reduce token theft via XSS, but CSRF must be considered depending design.

### JavaScript-accessible storage
Convenient but exposed to XSS.

No universal answer. Threat model matters.

---

## 6.4 Authorization-Aware UI

Hiding a button is UX, not security.

Backend must enforce authorization.

Frontend can hide/disable actions for user experience, but cannot be trust boundary.

---

## 6.5 CORS

CORS is a browser cross-origin access control mechanism.

It is not authentication.

Server must still authenticate/authorize requests.

---

## 6.6 CSRF

Relevant especially when browser automatically sends authentication credentials such as cookies.

Mitigations include:

- SameSite cookie policy;
- anti-CSRF token;
- origin checks depending architecture.

---

## 6.7 Retry

Do not automatically retry every frontend request.

Good candidates:

- transient GET failure.

Be careful:

- POST with side effects unless idempotent.

---

## 6.8 Client Cache / Server State

Need semantics:

- cache key;
- stale time;
- refetch;
- invalidation;
- mutation update.

---

## 6.9 Optimistic Update

Update UI before server confirms.

Good UX when failure rare and rollback possible.

Need:

- temporary state;
- rollback;
- conflict handling.

---

# 7. Engineering Depth

## 7.1 Contract Compatibility

Types generated/shared from OpenAPI can reduce drift, but runtime server responses still need correctness.

Contract ownership should be clear.

---

## 7.2 Correlation ID

Frontend can preserve/display request ID from backend errors to help support.

Do not leak sensitive internal diagnostics.

---

# 8. Implementation / Code

```typescript
async function apiGet<T>(
  url: string,
  signal?: AbortSignal
): Promise<T> {
  const response = await fetch(url, {
    credentials: "include",
    signal
  });

  if (!response.ok) {
    throw new Error(`HTTP ${response.status}`);
  }

  return response.json();
}
```

Real application should map structured server errors rather than only generic `Error`.

---

# 9. Hands-On Practice

Design UI behavior for:

```text
GET /orders
```

Cases:

- loading;
- no orders;
- 401;
- 403;
- 500;
- network offline;
- stale cached data.

---

# 10. Google Interview Drill

## Problem — Optimistic Todo Update

User marks todo complete.

### Clarify

- server versioning?
- failure rate?
- multi-device edits?
- offline?

### First Approach

Wait for server, then update UI.

Correct but slower perceived UX.

### Improve

Optimistically update local/server cache, send PATCH, rollback on failure.

### Edge Cases

- server rejects due to stale version;
- request times out;
- user toggles twice quickly;
- component unmounts.

### Follow-Up

Use ETag/version for conflict detection.

Backend remains source of truth.

---

# 11. Common Mistakes

1. UI authorization treated as security.
2. CORS treated as auth.
3. Tokens casually stored in localStorage.
4. Retry every POST.
5. No cancellation.
6. No empty/error state.
7. Cache invalidation ignored.
8. Optimistic update without rollback.
9. Frontend/backend contract duplicated manually everywhere.

---

# 12. Best Practices

- explicit API client boundary;
- typed contracts;
- backend authorization always;
- threat-model auth storage;
- cancel stale requests;
- retry selectively;
- model error states;
- invalidate/update cache after mutation;
- surface support-safe request IDs.

---

# 13. Interview Questions

1. How integrate React with REST API?
2. How handle loading/error states?
3. Cookie vs localStorage token trade-off?
4. What is CORS?
5. What is CSRF?
6. Why UI authorization is insufficient?
7. Retry policy?
8. Optimistic update?
9. Cache invalidation?
10. How prevent contract drift?

---

# 14. Google-Level Follow-Ups

1. token expires mid-request?
2. refresh token?
3. multi-tab logout?
4. offline?
5. ETag?
6. 409 conflict?
7. request deduplication?
8. stale cache?

---

# 15. Quick Revision

```text
API boundary centralizes integration
Backend enforces authZ
CORS ≠ auth
Cookie auth → consider CSRF
JS-readable token → consider XSS
Retry selectively
Cache needs key + stale + invalidation
Optimistic update needs rollback/conflict
```

---

# 16. Readiness Gate

- [ ] API client.
- [ ] UI states.
- [ ] Auth storage trade-off.
- [ ] CORS/CSRF.
- [ ] Backend authorization.
- [ ] Cache.
- [ ] Optimistic update.
- [ ] Todo drill.

**Gate:** READY / REPAIR

---

# 17. References

- MDN Fetch/CORS
- OWASP web security guidance
- React documentation
