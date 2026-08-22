# FS-01 / File 02 — Validation, Errors, Auth, Pagination & Idempotency

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M19 + selected M20 Security

---

# 1. Objective

Master:

- boundary validation;
- consistent error handling;
- authentication vs authorization;
- token/session concepts;
- pagination;
- filtering/sorting;
- idempotency;
- concurrency conflict basics;
- API security reasoning.

---

# 2. 5W+H

## What?

These are API boundary controls protecting correctness, security, and predictable client behavior.

## Why?

An API is only as reliable as its validation and failure contract.

## Where?

Every public/private backend endpoint.

## When?

Before business logic and whenever state changes.

## How?

Validate → authenticate → authorize → execute → handle conflicts → return explicit result.

---

# 3. Real-Life Analogy

Airport boarding:

1. ticket format checked;
2. identity checked;
3. permission to board checked;
4. boarding order controlled.

Validation, authentication, and authorization solve different problems.

---

# 4. Visualization

```text
Request
  ↓
Schema Validation
  ↓
Authentication
  ↓
Authorization
  ↓
Business Validation
  ↓
Execute
  ↓
Error Mapping
  ↓
Response
```

---

# 5. Mind Map

```text
API Boundary
│
├── Validation
├── Error Contract
├── Authentication
├── Authorization
├── Pagination
├── Filtering
├── Sorting
├── Idempotency
└── Concurrency Conflict
```

---

# 6. Core Concepts

## 6.1 Schema Validation

Validate:

- required fields;
- type;
- range;
- format;
- length.

Example:

```text
email = valid format
quantity > 0
currency in supported set
```

---

## 6.2 Business Validation

Schema-valid does not mean business-valid.

Example:

```text
quantity = 5
```

may pass schema but fail if stock is 2.

---

## 6.3 Error Contract

Example:

```json
{
  "code": "ORDER_NOT_CANCELLABLE",
  "message": "Order cannot be cancelled after shipment",
  "correlationId": "..."
}
```

Avoid exposing stack traces.

---

## 6.4 Authentication vs Authorization

Authentication:

> Who are you?

Authorization:

> What are you allowed to do?

JWT/OAuth awareness may appear, but avoid claiming every token design is JWT-based.

---

## 6.5 Token Security

Consider:

- expiry;
- signature validation;
- audience;
- issuer;
- scopes/roles;
- key rotation;
- token storage;
- revocation strategy.

---

## 6.6 Pagination

### Offset

```text
?page=3&size=20
```

Simple, but large offsets and concurrent inserts can cause performance/consistency issues.

### Cursor

```text
?after=encoded_cursor&limit=20
```

Better for large/changing datasets when stable ordering key exists.

---

## 6.7 Filtering & Sorting

Allow only approved fields/operators.

Never directly concatenate arbitrary client-provided sort/filter fragments into SQL.

---

## 6.8 Idempotency Key

For duplicate-safe command:

```text
POST /payments
Idempotency-Key: abc-123
```

Server stores outcome associated with key/request semantics.

Repeat returns same logical outcome instead of duplicate side effect.

---

## 6.9 Optimistic Concurrency

Use version/ETag to detect lost update.

Concept:

```text
Read version 5
Client updates
Server accepts only if version still 5
```

Else return conflict/precondition failure depending contract.

---

# 7. Engineering Depth

## 7.1 Validation Placement

Do not duplicate every rule in every layer.

Boundary:

- shape/format.

Domain/service:

- business invariants.

Database:

- final integrity constraints.

Each layer has responsibility.

---

## 7.2 Idempotency Storage

Questions:

- key scope?
- TTL?
- request fingerprint?
- same key with different payload?
- result persistence?
- concurrent same-key requests?

This is not solved by merely reading a header.

---

# 8. Implementation / Code

Framework-neutral:

```python
def create_payment(request):
    command = validate_payment(request.body)
    identity = authenticate(request.headers)
    authorize(identity, "payment:create")

    return payment_service.create(
        command,
        idempotency_key=request.headers.get("Idempotency-Key"),
    )
```

---

# 9. Hands-On Practice

Design:

1. validation error;
2. unauthorized access;
3. forbidden action;
4. duplicate email conflict;
5. cursor pagination response;
6. idempotent payment request.

---

# 10. Google Interview Drill

## Problem — Payment Creation API

### Clarify

- monetary side effect?
- duplicate network retries expected?
- external gateway?
- synchronous response?
- status lifecycle?

### First Design

```text
POST /payments
```

### Improve

Add:

- authentication;
- authorization;
- schema validation;
- business validation;
- idempotency key;
- transaction;
- gateway timeout;
- audit;
- error schema.

### Edge Cases

- same key same payload;
- same key different payload;
- gateway timeout after charging;
- DB commit failure;
- duplicate callback.

### Follow-Up

How do you reconcile uncertain gateway state?

Use provider transaction ID/status inquiry/webhook/reconciliation workflow.

---

# 11. Common Mistakes

1. Auth and authorization treated as same.
2. Client validation trusted.
3. Stack trace exposed.
4. Offset pagination used blindly at huge scale.
5. Idempotency claimed without persistence.
6. Same idempotency key accepted with different payload.
7. Arbitrary sort field passed to SQL.
8. JWT treated as universal solution.

---

# 12. Best Practices

- validate at trust boundary;
- domain rules in service/domain;
- stable error codes;
- least privilege;
- explicit pagination;
- whitelist filtering/sorting;
- idempotency for retriable side effects;
- optimistic concurrency where needed.

---

# 13. Interview Questions

1. Schema vs business validation?
2. AuthN vs AuthZ?
3. JWT concerns?
4. Offset vs cursor pagination?
5. What is idempotency key?
6. How do you implement idempotency?
7. 409 Conflict use case?
8. What is optimistic locking?
9. How do you secure filtering/sorting?

---

# 14. Google-Level Follow-Ups

1. gateway charged but response timed out?
2. duplicate webhook?
3. token revoked?
4. multi-tenant authorization?
5. cursor stability?
6. retry on 500?
7. client sends same key different body?

---

# 15. Quick Revision

```text
Validation = shape + business
AuthN = identity
AuthZ = permission
Offset = simple
Cursor = scalable/stable traversal
Idempotency = repeated command, same logical effect
Optimistic concurrency = version check
```

---

# 16. Readiness Gate

- [ ] Validation layers.
- [ ] Error schema.
- [ ] AuthN vs AuthZ.
- [ ] Token risks.
- [ ] Pagination.
- [ ] Idempotency.
- [ ] Optimistic concurrency.
- [ ] Payment drill.

**Gate:** READY / REPAIR

---

# 17. References

- OWASP API Security
- OAuth 2.0 / OIDC references
- HTTP conditional request documentation
