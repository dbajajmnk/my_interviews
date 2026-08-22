# ARCH-03 / File 01 — Security Architecture, Identity, Authorization & Trust Boundaries

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M20 Security + M21 Architecture

---

# 1. Objective

Master:

- authentication vs authorization;
- identity propagation;
- RBAC/ABAC awareness;
- tenant isolation;
- least privilege;
- zero-trust thinking;
- service identity;
- trust boundaries;
- secrets;
- encryption;
- auditability.

---

# 2. 5W+H

## What?

Security architecture defines who/what can access which resource under which policy and how that decision is enforced.

## Why?

Most security failures come from broken trust boundaries or excessive privilege, not only weak passwords.

## Where?

Browser, API gateway, backend, database, cache, queues, AI services, internal tools.

## When?

At architecture design time—not after implementation.

## How?

Authenticate → authorize → minimize privilege → validate → audit.

---

# 3. Real-Life Analogy

A corporate badge proves who you are.

It does not automatically allow access to:

- payroll room;
- server room;
- CEO office.

Identity and permission are different.

---

# 4. Visualization

```text
User / Service
      ↓
Authentication
      ↓
Principal / Claims
      ↓
Authorization Policy
      ↓
Resource / Action
      ↓
Audit
```

---

# 5. Mind Map

```text
Security Architecture
│
├── Authentication
├── Authorization
├── RBAC
├── ABAC
├── Tenant Isolation
├── Least Privilege
├── Service Identity
├── Secrets
├── Encryption
└── Audit
```

---

# 6. Core Concepts

## 6.1 Authentication

> Who are you?

Examples:

- user session;
- OIDC/OAuth login;
- certificate/service identity.

---

## 6.2 Authorization

> What are you allowed to do?

Examples:

```text
user can view own order
manager can approve request
service can publish event
```

---

## 6.3 RBAC

Role-Based Access Control:

```text
role → permissions
```

Simple and common.

---

## 6.4 ABAC Awareness

Attribute-Based Access Control:

```text
principal attributes
+ resource attributes
+ context
→ policy decision
```

Useful for:

- tenant;
- region;
- sensitivity;
- ownership.

Do not overcomplicate if roles are sufficient.

---

## 6.5 Object-Level Authorization

Authenticated user may still not access arbitrary object IDs.

Example:

```text
GET /orders/999
```

Server must verify ownership/permission.

---

## 6.6 Tenant Isolation

Enforce tenant boundary in:

- DB queries;
- cache keys;
- object storage paths/policies;
- vector retrieval;
- queues/events;
- tools;
- citations.

---

## 6.7 Least Privilege

Application/service account receives only required permissions.

Avoid:

- DB admin user;
- cloud owner credentials;
- broad wildcard tool permissions.

---

## 6.8 Service Identity

Service-to-service calls need identity too.

Do not assume internal network = trusted.

---

## 6.9 Secrets Management

Secrets should be:

- stored outside source code;
- access-controlled;
- rotated;
- audited;
- not logged.

---

## 6.10 Encryption

### In Transit
TLS.

### At Rest
Storage/database/cloud encryption.

But encryption does not replace authorization.

---

# 7. Engineering Depth

## 7.1 Zero Trust

Core principle:

> never trust solely because request came from an internal network.

Verify identity and authorization continuously at meaningful boundaries.

---

## 7.2 Policy Enforcement Point

Centralized policy decisions can be useful, but enforcement still occurs at service/resource boundary.

Avoid one giant auth service becoming only fragile control.

---

## 7.3 AI Trust Boundary

Model output never grants permission.

Example:

```text
LLM says user is admin
```

Meaningless unless deterministic identity system says so.

---

# 8. Implementation / Design

```text
Browser
→ Identity Provider
→ Access Token / Session
→ API Gateway
→ Python API
→ Authorization Policy
→ Resource
```

For service-to-service:

```text
Service Identity
→ Authenticated Channel
→ Policy
→ Service Resource
```

---

# 9. Hands-On Practice

Design access for:

- customer;
- support agent;
- finance manager;
- system worker.

To `refund_payment`.

Define separate read vs write permissions.

---

# 10. Google Interview Drill

## Problem — Multi-Tenant SaaS Data Leak

User from Tenant A can access:

```text
GET /api/documents/{tenantB_document_id}
```

### Clarify

- auth works?
- tenant ID from URL/client?
- DB query?
- cache?
- object storage?
- RAG index?

### Root Cause

Likely object-level/tenant authorization failure.

### Improve

```text
principal.tenant_id
→ authorization policy
→ DB query includes tenant boundary
→ storage/citation/cache use same boundary
```

Never trust tenant ID supplied by user alone.

### Regression Tests

- Tenant A cannot access B;
- admin role scope defined;
- cache cannot cross tenants.

---

# 11. Common Mistakes

1. Authentication = authorization.
2. Internal network assumed trusted.
3. Tenant ID trusted from request body.
4. Frontend hides button but backend allows action.
5. Service accounts overprivileged.
6. Secrets in source/config repo.
7. Encryption treated as complete security.
8. LLM decides permission.

---

# 12. Best Practices

- identity first;
- authorization at resource/action boundary;
- tenant boundary everywhere;
- least privilege;
- secure service identities;
- centralized secrets;
- audit sensitive actions.

---

# 13. Interview Questions

1. AuthN vs AuthZ?
2. RBAC vs ABAC?
3. What is BOLA?
4. How enforce tenant isolation?
5. What is least privilege?
6. Service-to-service auth?
7. What is zero trust?
8. How manage secrets?
9. Encryption in transit/at rest?
10. Where enforce policy?

---

# 14. Google-Level Follow-Ups

1. cross-region identity?
2. role changes mid-session?
3. token revoked?
4. service account compromised?
5. cache leak?
6. super-admin?
7. break-glass access?
8. audit retention?

---

# 15. Quick Revision

```text
AuthN = identity
AuthZ = permission
Tenant boundary is deterministic
Internal ≠ trusted
Least privilege
Service identity matters
Secrets outside code
Encryption complements—not replaces—authorization
```

---

# 16. Readiness Gate

- [ ] AuthN/AuthZ.
- [ ] RBAC/ABAC.
- [ ] Object-level auth.
- [ ] Tenant isolation.
- [ ] Least privilege.
- [ ] Secrets/encryption.
- [ ] SaaS leak drill.

**Gate:** READY / REPAIR

---

# 17. References

- OWASP authorization guidance
- OAuth/OIDC architecture references
- Zero-trust security architecture references
