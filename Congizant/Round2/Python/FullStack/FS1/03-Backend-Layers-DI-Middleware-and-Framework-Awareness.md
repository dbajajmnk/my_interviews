# FS-01 / File 03 — Backend Layers, DI, Middleware & Framework Awareness

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M19 + M4/M5 design bridge

---

# 1. Objective

Master:

- controller/router;
- service/use-case;
- repository/data access;
- dependency injection;
- middleware;
- exception mapping;
- framework-neutral architecture;
- FastAPI/Django/Flask positioning.

---

# 2. 5W+H

## What?

Backend layering separates transport, business logic, data access, and cross-cutting concerns.

## Why?

It improves testability and limits coupling.

## Where?

Backend APIs, microservices, modular monoliths.

## When?

As complexity grows beyond trivial endpoints.

## How?

Route → validate → service → repository/integration.

---

# 3. Real-Life Analogy

A hospital receptionist does not perform surgery.

The API/router receives the request; domain/service logic owns the business decision; repository owns persistence interaction.

---

# 4. Visualization

```text
HTTP
 ↓
Router / Controller
 ↓
Service / Use Case
 ↓
Repository / Adapter
 ↓
DB / External API
```

Cross-cutting:

```text
Middleware
- correlation ID
- logging
- auth
- metrics
```

---

# 5. Mind Map

```text
Backend Structure
│
├── Router
├── Service
├── Repository
├── Adapter
├── DI
├── Middleware
└── Framework
```

---

# 6. Core Concepts

## 6.1 Router/Controller

Owns transport concerns:

- route;
- request parsing;
- status/response mapping.

Do not bury core business rules here.

---

## 6.2 Service / Use Case

Owns application/business orchestration.

Example:

```python
class CreateOrder:
    def __init__(self, repo, payment):
        self.repo = repo
        self.payment = payment
```

---

## 6.3 Repository

Abstracts persistence operations when that abstraction adds value.

Avoid “generic repository” that simply mirrors every ORM method without benefit.

---

## 6.4 Dependency Injection

Inject dependencies rather than construct them deep inside business logic.

Bad:

```python
def create_order():
    db = Database()
    gateway = PaymentGateway()
```

Better:

```python
class OrderService:
    def __init__(self, repo, gateway):
        ...
```

---

## 6.5 Middleware

Good for cross-cutting request concerns:

- correlation ID;
- logging;
- metrics;
- CORS;
- auth plumbing;
- request timing.

Do not hide business logic in middleware.

---

## 6.6 Exception Mapping

Domain exception:

```text
OrderNotCancellable
```

can be mapped at transport boundary to:

```text
409 Conflict
```

Do not make domain code depend on HTTP status constants.

---

# 7. Framework Awareness

> No detailed JD confirmed a specific Python web framework. Know positioning, not trivia.

## FastAPI

Strengths:

- async-first support;
- type hints;
- validation ecosystem;
- automatic OpenAPI;
- strong fit for API/AI services.

## Django

Strengths:

- batteries-included;
- ORM;
- admin;
- auth;
- mature ecosystem;
- strong full web application framework.

## Flask

Strengths:

- lightweight;
- minimal core;
- flexible;
- easy for small services/prototypes;
- architecture decisions left more to team.

### Interview Rule

Do not say:

> FastAPI is always better.

Say:

> Framework choice depends on product needs, team, ecosystem, async requirements, admin/ORM needs, operational maturity, and existing codebase.

---

# 8. Engineering Depth

## 8.1 Modular Monolith First

Do not jump to microservices just because role says architect.

A clean modular monolith may be better when:

- team small;
- domain not yet stable;
- deployment independent scaling not required.

---

## 8.2 DI in Python

DI need not require a heavy container.

Constructor/function injection is often enough.

---

# 9. Implementation / Code

```python
class UserRepository:
    def get(self, user_id):
        ...

class UserService:
    def __init__(self, repository):
        self.repository = repository

    def get_profile(self, user_id):
        return self.repository.get(user_id)
```

---

# 10. Hands-On Practice

Refactor:

```python
@app.post("/orders")
def create_order(body):
    db = MySQLClient()
    gateway = StripeClient()
    # 50 lines of business logic
```

into:

```text
route
→ CreateOrderService
→ repository
→ payment adapter
```

---

# 11. Google Interview Drill

## Problem — Design Python Backend Structure for AI Document Search

Requirements:

- search endpoint;
- vector DB;
- metadata DB;
- LLM answer generation.

### First Structure

```text
Router
 ↓
SearchService
 ├── Retriever
 ├── MetadataRepository
 └── LLMClient
```

### Clarify

- synchronous answer?
- streaming?
- auth?
- citations?
- caching?
- provider swap?

### Trade-Off

Do not create separate microservice for every box.

### Follow-Up

- provider adapter;
- test fakes;
- tracing;
- async boundaries;
- failure mapping.

---

# 12. Common Mistakes

1. Business logic in route.
2. Infrastructure created inside service.
3. Generic repository everywhere.
4. Middleware with business rules.
5. Domain coupled to HTTP.
6. Heavy DI framework unnecessarily.
7. Framework wars.
8. Microservices too early.

---

# 13. Best Practices

- thin transport layer;
- cohesive service/use case;
- narrow adapters;
- explicit dependencies;
- middleware only for cross-cutting concerns;
- framework-neutral core where useful;
- choose architecture from change pressure.

---

# 14. Interview Questions

1. Controller vs service?
2. Repository purpose?
3. DI in Python?
4. Middleware use cases?
5. Where map exceptions?
6. FastAPI vs Django vs Flask?
7. Modular monolith vs microservices?
8. How keep framework out of domain logic?

---

# 15. Google-Level Follow-Ups

1. How test route?
2. How fake vector DB?
3. Where put retry?
4. How stream response?
5. Where put authorization?
6. When split service?
7. How migrate framework later?

---

# 16. Quick Revision

```text
Route = transport
Service = business orchestration
Repository/Adapter = external dependency
DI = explicit dependency
Middleware = cross-cutting
Framework ≠ architecture
Thin routes, clear services
```

---

# 17. Readiness Gate

- [ ] Layers.
- [ ] DI.
- [ ] Middleware.
- [ ] Exception mapping.
- [ ] Framework comparison.
- [ ] Modular monolith reasoning.
- [ ] AI search backend design.

**Gate:** READY / REPAIR

---

# 18. References

- FastAPI official docs
- Django official docs
- Flask official docs
