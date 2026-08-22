# FS-01 / File 01 — HTTP, REST & API Contracts

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** M19 Backend / API Engineering

---

# 1. Objective

Master:

- HTTP request/response;
- methods;
- status codes;
- headers;
- REST constraints at practical level;
- resources;
- URI design;
- request/response contracts;
- content negotiation awareness;
- statelessness;
- API versioning fundamentals.

---

# 2. 5W+H

## What?

HTTP is an application protocol for request/response communication. REST is an architectural style for resource-oriented network APIs.

## Why?

A strong API contract reduces coupling between frontend, backend, mobile, partners, and AI integrations.

## Where?

- web backends;
- microservices;
- mobile APIs;
- external integrations;
- AI service endpoints.

## When?

Whenever systems communicate over HTTP.

## Who?

Backend, frontend, platform, integration, and architecture teams.

## How?

Client sends request → server validates/processes → server returns explicit status, headers, and representation.

---

# 3. Real-Life Analogy

An API is a restaurant menu.

The customer should know:

- what can be ordered;
- required inputs;
- possible results;
- error cases.

They should not need to know the kitchen implementation.

---

# 4. Visualization

```text
Client
  │
  │ HTTP Request
  │ method + URI + headers + body
  ▼
API
  │
  ├── routing
  ├── validation
  ├── auth
  ├── business logic
  └── persistence/integration
  │
  ▼
HTTP Response
status + headers + body
```

---

# 5. Mind Map

```text
HTTP / REST
│
├── Request
├── Response
├── Methods
├── Status Codes
├── Headers
├── Resource
├── URI
├── Representation
├── Statelessness
└── Versioning
```

---

# 6. Core Concepts

## 6.1 HTTP Methods

### GET
Read resource. Should be safe and idempotent.

### POST
Usually create/process command. Not inherently idempotent.

### PUT
Replace/update resource representation at known URI. Intended to be idempotent.

### PATCH
Partial update. Idempotency depends on semantics.

### DELETE
Delete resource. Intended to be idempotent at protocol semantics level.

---

## 6.2 Safe vs Idempotent

**Safe:** should not change server state from client intent.

**Idempotent:** repeating the same request has the same intended effect as one request.

Example:

```text
PUT /users/101/status
{"status":"ACTIVE"}
```

Repeating may still produce logs/audit events, but resource effect remains ACTIVE.

---

## 6.3 Status Codes

Common:

```text
200 OK
201 Created
202 Accepted
204 No Content
400 Bad Request
401 Unauthorized (authentication required/invalid)
403 Forbidden
404 Not Found
409 Conflict
422 Unprocessable Content / validation semantics in many APIs
429 Too Many Requests
500 Internal Server Error
502 Bad Gateway
503 Service Unavailable
504 Gateway Timeout
```

Do not return `200` for every failure.

---

## 6.4 Resource-Oriented URI

Prefer:

```text
GET /users/101
POST /users
GET /users/101/orders
```

Avoid action-heavy RPC-style naming when resource semantics fit:

```text
/getUser
/createUser
```

But REST is not religion. Some operations are naturally commands.

---

## 6.5 Request Contract

Example:

```json
{
  "name": "A",
  "email": "a@example.com"
}
```

Contract should define:

- required fields;
- types;
- formats;
- constraints;
- defaults;
- unknown-field policy.

---

## 6.6 Response Contract

Example:

```json
{
  "id": 101,
  "name": "A",
  "email": "a@example.com"
}
```

Keep response stable and explicit.

Do not leak internal DB schema accidentally.

---

## 6.7 Statelessness

REST-style statelessness means each request contains enough context for server processing; server does not rely on hidden conversational session state between requests.

This does not mean:

> the server has no state.

Databases, caches, and session stores are still stateful systems.

---

## 6.8 Headers

Examples:

- `Authorization`
- `Content-Type`
- `Accept`
- `ETag`
- correlation/request IDs
- cache headers

---

## 6.9 Versioning

Options:

```text
/api/v1/users
```

or header/media-type approaches.

Architect question:

> Do we need versioning yet?

Version only when contract evolution requires compatibility management.

---

# 7. Engineering Depth

## 7.1 Contract First

Frontend and backend integration improves when contract is explicit before implementation.

Possible artifacts:

- OpenAPI;
- JSON schema;
- example requests/responses;
- error schema.

---

## 7.2 REST vs RPC

REST fits resource-oriented CRUD/use cases.

RPC can fit action-oriented operations.

Example:

```text
POST /payments/{id}/refund
```

is often clearer than forcing refund into awkward resource semantics.

Architecture optimizes clarity, not ideology.

---

# 8. Implementation / Code

Framework-neutral pseudo-Python:

```python
def create_user(request):
    payload = validate_user(request.json)
    user = service.create(payload)

    return {
        "status": 201,
        "body": serialize_user(user),
        "headers": {
            "Location": f"/users/{user.id}"
        },
    }
```

---

# 9. Hands-On Practice

Design endpoints for:

- create order;
- get order;
- update order status;
- list customer orders;
- cancel order.

Define method + path + success status.

---

# 10. Google Interview Drill

## Problem — Design Order API

Requirements:

- create order;
- retrieve;
- cancel;
- list orders;
- duplicate create requests possible due to client retries.

### Clarify

- client supplies order ID?
- payment involved?
- cancellation rules?
- pagination?
- idempotency requirement?

### First Design

```text
POST   /orders
GET    /orders/{id}
GET    /orders
POST   /orders/{id}/cancel
```

### Improve

Add:

- validation;
- error schema;
- idempotency key on create;
- pagination;
- authorization;
- observability.

### Edge Cases

- duplicate create;
- cancel shipped order;
- unknown order;
- partial downstream failure.

### Follow-Up

How would you version the API?

Only if breaking evolution requires it.

---

# 11. Common Mistakes

1. All responses return 200.
2. Confusing 401 and 403.
3. POST used for every operation.
4. Internal DB model leaked as API model.
5. No error schema.
6. No idempotency for retried commands.
7. REST dogma over clarity.
8. Versioning prematurely.

---

# 12. Best Practices

- explicit contracts;
- semantic methods/statuses;
- stable error schema;
- resource naming;
- separate transport model from persistence model;
- document with OpenAPI;
- design compatibility intentionally.

---

# 13. Interview Questions

1. REST principles?
2. PUT vs PATCH?
3. POST vs PUT?
4. Safe vs idempotent?
5. 401 vs 403?
6. 200 vs 201 vs 202?
7. What is statelessness?
8. How do you version APIs?
9. What makes a good API contract?
10. REST vs RPC?

---

# 14. Google-Level Follow-Ups

1. duplicate POST?
2. concurrent updates?
3. partial resource representation?
4. optimistic locking?
5. long-running request?
6. backward compatibility?
7. mobile client on old version?

---

# 15. Quick Revision

```text
GET read
POST create/command
PUT idempotent replace/update
PATCH partial update
DELETE delete

201 created
202 accepted
204 no body
401 unauthenticated
403 unauthorized
409 conflict
429 rate limit

Contract > framework
```

---

# 16. Readiness Gate

- [ ] Method semantics.
- [ ] Status codes.
- [ ] Safe vs idempotent.
- [ ] Resource design.
- [ ] Contract design.
- [ ] Statelessness.
- [ ] Versioning.
- [ ] Design Order API.

**Gate:** READY / REPAIR

---

# 17. References

- HTTP semantics specification
- OpenAPI specification
- REST architectural style references
