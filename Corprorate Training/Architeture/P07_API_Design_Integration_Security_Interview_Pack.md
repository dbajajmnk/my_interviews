# P07 — API Design, Integration & Security

**Interview Track:** Software Design & Architecture  
**Pack:** P07 of 12  
**Source Curriculum:** Module 6 — API Design & Integration  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, design, compare, secure, and defend API architecture decisions using only the topics listed in the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain:

- RESTful API Design Principles
- API Versioning
- OpenAPI / Swagger
- GraphQL Overview
- API Security
- OAuth2
- JWT
- API Gateway Concepts
- How to design REST APIs for an enterprise application

The goal is not just to define these terms. You should be able to apply them to a realistic enterprise API scenario and defend the decisions.

---

# 2. Simple Analogy

Think of an API as a restaurant menu and service contract.

The customer should know:

- What can be requested.
- How to request it.
- What information is required.
- What response to expect.
- What happens when something goes wrong.

The kitchen is hidden behind the contract.

A good API does the same:

> It exposes a clear, stable contract without forcing consumers to understand internal implementation details.

---

# 3. Visualization

```text
Client
  |
  v
API Contract
  |
  +-----------------------------+
  |                             |
  v                             v
Design                       Security
  |                             |
  +-- REST                      +-- OAuth2
  +-- Versioning                +-- JWT
  +-- OpenAPI/Swagger           +-- Authorization
  +-- GraphQL                   |
                                v
                          API Gateway
                                |
                                v
                          Backend Services
```

---

# 4. Mind Map

```text
API Design & Integration
|
+-- REST
|   +-- Resources
|   +-- HTTP methods
|   +-- Status codes
|   +-- Statelessness
|   +-- Consistent contracts
|
+-- Versioning
|
+-- Documentation
|   +-- OpenAPI
|   +-- Swagger
|
+-- GraphQL
|
+-- Security
|   +-- OAuth2
|   +-- JWT
|
+-- API Gateway
|
+-- Enterprise API Design
```

---

# 5. RESTful API Design Principles

REST is an architectural style commonly used for web APIs.

For interview preparation, focus on practical design behavior.

---

## 5.1 Resource-Oriented Design

Model APIs around resources.

Example:

```text
/orders
/customers
/products
```

Prefer nouns over action-heavy endpoint names.

### Better

```text
POST /orders
GET /orders/1001
```

### Less REST-oriented

```text
/createOrder
/getOrderById
```

---

## 5.2 HTTP Methods

Common mapping:

```text
GET    -> Retrieve
POST   -> Create
PUT    -> Replace/update resource representation
PATCH  -> Partial update
DELETE -> Remove
```

### Interview point

Use HTTP methods consistently with intended semantics.

---

## 5.3 HTTP Status Codes

Common examples:

```text
200 OK
201 Created
204 No Content
400 Bad Request
401 Unauthorized
403 Forbidden
404 Not Found
409 Conflict
500 Internal Server Error
```

### Important

Do not return HTTP 200 for every outcome if the result is actually an error.

---

## 5.4 Statelessness

A RESTful interaction should generally be self-contained from the server's request-processing perspective.

Each request should include what the server needs to process that request.

### Interview benefit

Statelessness can simplify scaling because requests are not tied to one server's local session state.

---

## 5.5 Consistent API Contracts

Consistency matters in:

- Resource naming
- Error responses
- Pagination
- Validation
- HTTP status usage
- Data formats

A predictable API is easier to consume and maintain.

---

# 6. REST API Example

## Order Resource

### Create Order

```http
POST /orders
```

Request:

```json
{
  "customerId": "C100",
  "items": [
    {
      "productId": "P10",
      "quantity": 2
    }
  ]
}
```

Response:

```http
201 Created
```

---

### Get Order

```http
GET /orders/1001
```

---

### Update Order

```http
PATCH /orders/1001
```

---

### Delete Order

```http
DELETE /orders/1001
```

Whether deletion is actually allowed depends on business rules.

---

# 7. API Versioning

APIs evolve.

Versioning helps manage changes when consumers depend on existing contracts.

Possible conceptual approaches include:

- URI-based versioning
- Header-based versioning
- Query-parameter-based versioning

Example:

```text
/api/v1/orders
/api/v2/orders
```

### Interview point

Versioning is primarily about compatibility and controlled evolution.

### Strong answer

> I would introduce a new API version when a change cannot be made backward-compatible and existing consumers must continue to work.

---

# 8. Backward Compatibility

A good interview discussion asks:

> Can this change be made without breaking current consumers?

Examples of potentially breaking changes:

- Removing a field consumers depend on.
- Renaming a field.
- Changing data type.
- Changing endpoint meaning.
- Making optional input mandatory.

### Key principle

Avoid unnecessary breaking changes.

---

# 9. OpenAPI / Swagger

The source curriculum explicitly lists:

- OpenAPI
- Swagger

At interview level:

## OpenAPI

A standard specification for describing HTTP APIs.

It can describe:

- Endpoints
- HTTP methods
- Parameters
- Request models
- Response models
- Status codes
- Security schemes

---

## Swagger

Swagger commonly refers to tooling around OpenAPI specifications.

### Interview-ready distinction

> OpenAPI is the API description specification, while Swagger commonly refers to tools that help create, visualize, or interact with OpenAPI definitions.

---

# 10. Why API Documentation Matters

Good API documentation helps:

- Consumers understand the contract.
- Teams integrate faster.
- Reduce ambiguity.
- Support testing.
- Improve maintenance.

### Red flag

Documentation should match the real API.

Outdated documentation can be worse than missing documentation.

---

# 11. GraphQL Overview

The source requires only **GraphQL Overview**, so keep the preparation at overview level.

GraphQL allows clients to request the data shape they need through a schema-based API.

### Conceptual example

Instead of receiving a fixed REST representation:

```text
GET /customers/100/orders
```

a GraphQL client may request specific fields.

Example conceptually:

```graphql
customer(id: "100") {
  name
  orders {
    id
    status
  }
}
```

---

# 12. REST vs GraphQL

## REST

- Resource-oriented
- Multiple endpoints
- Uses HTTP semantics directly
- Response shape usually controlled by endpoint contract

## GraphQL

- Schema-oriented
- Often a single API endpoint
- Client chooses required fields
- Flexible data retrieval

### Interview-ready answer

> REST and GraphQL solve API consumption differently. I would choose based on consumer needs, data-shape flexibility, operational complexity, caching strategy, and team capability rather than assuming one is always better.

---

# 13. API Security

The source explicitly includes:

- OAuth2
- JWT

At architecture level, API security means protecting access to APIs and controlling what authenticated callers are allowed to do.

Key distinction:

```text
Authentication -> Who are you?
Authorization  -> What are you allowed to do?
```

---

# 14. OAuth2

OAuth2 is an authorization framework commonly used to grant controlled access to protected resources.

At interview level, focus on the idea:

```text
Client
   |
   v
Authorization Process
   |
   v
Access Token
   |
   v
Protected API
```

### Important

OAuth2 is not simply “login.”

It is primarily about delegated authorization and access-token-based access patterns.

---

# 15. JWT

JWT stands for JSON Web Token.

A JWT is a compact token format that can carry claims.

Conceptually:

```text
Header.Payload.Signature
```

Claims may describe:

- Subject
- Roles
- Permissions
- Issuer
- Expiration

### Important

JWT is a token format.

OAuth2 is an authorization framework.

They are not the same thing.

OAuth2 can use JWT-formatted access tokens, but OAuth2 does not require JWT in every implementation.

---

# 16. JWT Interview Risks

Do not say:

> “JWT is encrypted by default.”

A signed JWT can protect integrity, but its payload may still be readable unless encryption is specifically used.

Also consider:

- Expiration
- Signature validation
- Issuer/audience checks
- Token leakage
- Revocation challenges

The source does not require deep token security implementation, so these are interview-awareness points.

---

# 17. OAuth2 vs JWT

## OAuth2

Answers:

> How is access authorized?

## JWT

Answers:

> In what token format can claims be represented?

### Interview-ready answer

> OAuth2 and JWT solve different problems. OAuth2 is an authorization framework, while JWT is a token format that may be used inside an OAuth2-based solution.

---

# 18. API Gateway Concepts

An API Gateway provides a controlled entry point to backend APIs/services.

Conceptual structure:

```text
Clients
   |
   v
API Gateway
   |
   +--> Service A
   +--> Service B
   +--> Service C
```

Potential gateway responsibilities may include:

- Routing
- Authentication/authorization enforcement
- Rate limiting
- Request aggregation
- Cross-cutting policy enforcement

The exact responsibilities depend on architecture.

---

# 19. API Gateway Benefits

Potential benefits:

- Central entry point
- Hide internal topology
- Apply common policies
- Simplify client routing
- Support backend evolution

---

# 20. API Gateway Risks

Potential risks:

- Extra network hop
- Added operational complexity
- Bottleneck if poorly designed
- Too much business logic accumulating in gateway

### Red flag

Do not put domain/business logic into the API Gateway without a compelling reason.

---

# 21. Engineering Depth — Good API Thinking

Before designing endpoints, ask:

- Who are the consumers?
- What business resources exist?
- What operations are required?
- What security model is required?
- What error conditions exist?
- What backward compatibility matters?
- What scale and performance are expected?
- Which integrations depend on the API?

---

# 22. Common Mistakes / Red Flags

## Mistake 1 — Verbs everywhere

Avoid:

```text
/getCustomer
/createOrder
/deleteProduct
```

Prefer resource-oriented design where appropriate.

---

## Mistake 2 — HTTP 200 for every response

Use meaningful status codes.

---

## Mistake 3 — Breaking consumers casually

Treat API contracts as externally depended-on interfaces.

---

## Mistake 4 — Swagger = API

Swagger/OpenAPI documents the API.

It is not the architecture itself.

---

## Mistake 5 — OAuth2 = JWT

Wrong.

Framework vs token format.

---

## Mistake 6 — Authentication = Authorization

Different concerns.

---

## Mistake 7 — API Gateway = Business Service

Gateway should primarily handle gateway/cross-cutting concerns, not become a central domain service.

---

# 23. Practical Enterprise API Design Lab

The source curriculum explicitly requires:

> Design REST APIs for an enterprise application.

Use this scenario:

## Employee Expense Management

Functions:

- Submit expense
- View expense
- Approve expense
- Reject expense
- Generate reports

---

## Resource Model

```text
/employees
/expenses
/reports
```

---

## Example Endpoints

### Submit Expense

```http
POST /expenses
```

### Get Expense

```http
GET /expenses/{expenseId}
```

### View Employee Expenses

```http
GET /employees/{employeeId}/expenses
```

### Approve Expense

A resource-oriented option could model approval as a state update:

```http
PATCH /expenses/{expenseId}
```

Request:

```json
{
  "status": "APPROVED"
}
```

The exact contract should follow business rules.

---

# 24. Security Flow — Conceptual

```text
User
 |
 v
Authorization / Identity System
 |
 v
Access Token
 |
 v
API Gateway
 |
 v
Expense API
```

The backend validates caller identity/claims according to the chosen security architecture.

---

# 25. API Versioning Scenario

Suppose V1 returns:

```json
{
  "employeeName": "Asha"
}
```

V2 needs:

```json
{
  "employee": {
    "firstName": "Asha",
    "lastName": "Kumar"
  }
}
```

If consumers cannot handle the structural change, a new version may be appropriate.

---

# 26. Interview Questions

## Q1 — What makes an API RESTful?

Discuss:

- Resources
- HTTP semantics
- Stateless interaction
- Consistent contracts

---

## Q2 — PUT vs PATCH?

PUT typically represents full replacement/update semantics.

PATCH represents partial modification.

Exact behavior should be clearly documented.

---

## Q3 — Why API versioning?

To manage incompatible evolution while protecting existing consumers.

---

## Q4 — OpenAPI vs Swagger?

OpenAPI = specification.

Swagger = common tooling around OpenAPI.

---

## Q5 — REST vs GraphQL?

Compare:

- Endpoint/resource model
- Client data flexibility
- Operational complexity
- Use-case suitability

---

## Q6 — Authentication vs authorization?

Authentication:

> Who are you?

Authorization:

> What can you do?

---

## Q7 — OAuth2 vs JWT?

OAuth2 is an authorization framework.

JWT is a token format.

---

## Q8 — Why API Gateway?

Centralized entry, routing, policy enforcement, and abstraction over backend services.

Discuss trade-offs.

---

# 27. Scenario Questions

## Scenario 1

A mobile client needs only three fields, while a web client needs fifteen.

Possible discussion:

- REST tailored endpoints
- Query shaping
- GraphQL flexibility

Do not automatically choose GraphQL without considering complexity.

---

## Scenario 2

You must change an API response in a way that breaks current clients.

Discuss:

- Backward compatibility
- Versioning
- Migration plan

---

## Scenario 3

Multiple microservices must be exposed to external clients.

Possible candidate:

**API Gateway**

Explain routing and cross-cutting policies.

---

## Scenario 4

An API returns confidential user data to any authenticated user.

Problem:

Authentication exists, but authorization may be missing or insufficient.

---

## Scenario 5

A team says:

> “We use OAuth2 because our token is JWT.”

Correct the distinction.

---

# 28. Follow-Up / Cross-Question Survival

## Cross-Q1
**Should every API be versioned from day one?**

Not necessarily.

Versioning strategy should be deliberate, but adding visible version complexity without need may be unnecessary.

---

## Cross-Q2
**Can GraphQL replace REST everywhere?**

No.

Choose based on consumer needs, complexity, caching, tooling, operations, and team capability.

---

## Cross-Q3
**Can JWT be revoked easily?**

Stateless token designs can make revocation more complex. The approach depends on token lifetime and security architecture.

---

## Cross-Q4
**Can an API Gateway become a single point of failure?**

Yes, if architecture does not provide adequate resilience and scaling.

---

## Cross-Q5
**Should authorization happen only at the gateway?**

Not necessarily.

Gateway-level controls can help, but backend services may also need to enforce domain-specific authorization.

---

## Cross-Q6
**Can OpenAPI generate code?**

Tooling can generate clients/server stubs from OpenAPI definitions, but OpenAPI itself is the specification.

---

# 29. Whiteboard Drill

Draw and explain:

```text
Client
  |
  v
API Gateway
  |
  +--> Order API
  +--> Customer API
  +--> Reporting API
          |
          v
        Data
```

Then add:

```text
Identity / Authorization System
        |
        v
     Access Token
```

Explain:

- Routing
- Authentication/authorization
- Backend boundaries
- API contract
- Versioning
- Documentation

---

# 30. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- REST
- Resource-oriented API
- Statelessness
- API versioning
- OpenAPI
- Swagger
- GraphQL
- Authentication
- Authorization
- OAuth2
- JWT
- API Gateway

---

# 31. Rapid Revision

## REST

**Resources + HTTP semantics + stateless interaction + consistent contracts**

## Versioning

**Protect consumers from incompatible change**

## OpenAPI

**API description specification**

## Swagger

**Tooling around OpenAPI**

## GraphQL

**Schema-based flexible data retrieval**

## Security

**Authentication = identity**  
**Authorization = permission**

## OAuth2

**Authorization framework**

## JWT

**Token format**

## API Gateway

**Controlled entry point to backend APIs/services**

## Golden Rule

> Design APIs around stable business contracts, clear security boundaries, and consumer needs—not just endpoint syntax.

---

# 32. Self-Practice

Answer aloud:

1. What is REST?
2. What makes an API resource-oriented?
3. GET vs POST vs PUT vs PATCH vs DELETE?
4. Why status codes matter?
5. What is statelessness?
6. Why API versioning?
7. What is backward compatibility?
8. OpenAPI vs Swagger?
9. What is GraphQL?
10. REST vs GraphQL?
11. Authentication vs authorization?
12. What is OAuth2?
13. What is JWT?
14. OAuth2 vs JWT?
15. What is API Gateway?
16. API Gateway benefits?
17. API Gateway risks?
18. Design an expense-management API.
19. How would you version a breaking response change?
20. How would you secure an enterprise API?

---

# 33. P07 Readiness Gate

Do **not** mark P07 complete unless you can:

- [ ] Explain RESTful API design principles.
- [ ] Design resource-oriented endpoints.
- [ ] Use HTTP methods appropriately.
- [ ] Explain meaningful HTTP status codes.
- [ ] Explain statelessness.
- [ ] Explain API versioning and backward compatibility.
- [ ] Explain OpenAPI and Swagger correctly.
- [ ] Give a high-level GraphQL overview.
- [ ] Compare REST and GraphQL.
- [ ] Distinguish authentication and authorization.
- [ ] Explain OAuth2.
- [ ] Explain JWT.
- [ ] Distinguish OAuth2 from JWT.
- [ ] Explain API Gateway concepts.
- [ ] Design a basic enterprise REST API.
- [ ] Handle at least five API/security cross-questions.
- [ ] Defend API design choices instead of only naming technologies.

**Pass Condition:** You can design a clear enterprise API contract, explain how it evolves and is documented, describe its security model, and defend whether REST, GraphQL, versioning, or an API Gateway is justified.

---

# 34. Source Boundary

This pack is grounded in **Module 6 of the supplied Software Design & Architecture curriculum**, which contains:

- RESTful API Design Principles
- API Versioning
- OpenAPI / Swagger
- GraphQL Overview
- API Security (OAuth2, JWT)
- API Gateway Concepts
- Lab: Design REST APIs for an enterprise application

The examples, endpoint designs, comparison material, security clarifications, scenario questions, whiteboard drills, and readiness gate are interview-preparation aids around those source-listed topics.

The source does **not** explicitly require deeper OAuth2 grant-flow implementation, API rate-limiting algorithms, GraphQL federation, service mesh, or detailed gateway product configuration, so these are not treated as mandatory curriculum topics in this pack.

---

## Status

**P07 — READY FOR STUDY & READINESS VALIDATION**

**Next after P07 gate:** P08 — Microservices Architecture & Communication