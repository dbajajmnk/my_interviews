# P08 — Microservices Architecture & Communication

**Interview Track:** Software Design & Architecture  
**Pack:** P08 of 12  
**Source Curriculum:** Module 7 — Microservices & Cloud-Native Architecture  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, compare, decompose, communicate, and defend microservices architecture decisions using only the topics listed in the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain:

- Monolithic vs. Microservices Architecture
- Service Decomposition
- API Gateway
- Service Discovery
- Event-Driven Communication
- How to design a microservices architecture for an online shopping platform

You should also be able to:

- Explain when microservices are justified.
- Explain when a monolith may be the better choice.
- Identify sensible service boundaries.
- Explain how services communicate.
- Explain why service discovery is needed.
- Explain how API Gateway fits into a microservices architecture.
- Defend trade-offs through follow-up questions.

The source curriculum also lists Docker, Kubernetes, and Twelve-Factor App Principles under Module 7. Those are intentionally covered in P09 according to the locked 12-pack TOC.

---

# 2. Simple Analogy

Think of a large retail company.

## Monolith

One large department handles:

- Orders
- Payments
- Inventory
- Customers
- Shipping

Everything is managed together.

## Microservices

Different specialized departments handle:

- Order Management
- Payment
- Inventory
- Customer
- Shipping

Each has a clear responsibility and interacts with others through agreed contracts.

### Key interview idea

Microservices are not “small APIs.”

They are independently focused service boundaries with clear responsibilities and communication contracts.

---

# 3. Visualization

```text
                Clients
                   |
                   v
              API Gateway
                   |
      +------------+------------+
      |            |            |
      v            v            v
  Order Service  User Service  Product Service
      |                         |
      v                         v
 Payment Service          Inventory Service
      |
      v
 Shipping Service
```

Communication may be:

```text
Synchronous
Service A ---> Service B
```

or:

```text
Event-Driven
Service A ---> Event ---> Service B / C / D
```

---

# 4. Mind Map

```text
Microservices
|
+-- Monolith vs Microservices
|
+-- Service Decomposition
|   +-- Business capability
|   +-- Responsibility
|   +-- Boundary
|
+-- Communication
|   +-- Direct/API
|   +-- Event-Driven
|
+-- API Gateway
|
+-- Service Discovery
|
+-- Online Shopping Case Study
```

---

# 5. Monolithic Architecture

A monolithic application packages most application functionality into one deployable application.

Conceptually:

```text
Application
|
+-- Orders
+-- Customers
+-- Products
+-- Payments
+-- Inventory
+-- Shipping
```

All parts are deployed together.

---

## Benefits

Potential benefits include:

- Simpler deployment.
- Easier local development.
- Easier debugging in many small/medium systems.
- Lower operational complexity.
- Simpler transactions across modules.

---

## Risks

As systems and teams grow:

- Tight coupling can increase.
- Deployment can become slower.
- One change may require full redeployment.
- Scaling individual capabilities independently may be difficult.
- Large codebases may become harder to maintain.

---

# 6. Microservices Architecture

Microservices architecture divides a system into independently focused services around business responsibilities.

Example:

```text
Order Service
Payment Service
Inventory Service
Customer Service
Shipping Service
```

Each service owns a focused capability.

### Interview-ready answer

> Microservices architecture decomposes an application into independently deployable services aligned around business capabilities, communicating through explicit contracts.

---

# 7. Monolith vs Microservices

| Monolith | Microservices |
|---|---|
| Single deployable unit | Multiple independently deployable services |
| Simpler operations | More operational complexity |
| Easier local debugging | Distributed debugging |
| Shared application boundary | Distributed service boundaries |
| Often simpler transactions | Distributed transaction complexity |
| Scale whole app | Scale services independently |
| Easier initial development | More infrastructure and coordination |

### Golden interview point

> Microservices trade local simplicity for independent deployment, scaling, and team/service autonomy.

---

# 8. When Microservices May Be Justified

Possible signals:

- Large system with distinct business capabilities.
- Multiple teams need independent delivery.
- Different capabilities have different scaling needs.
- Deployment independence is important.
- Strong service ownership is required.
- System complexity is already difficult to manage as one unit.

### Important

These are indicators, not automatic rules.

---

# 9. When a Monolith May Be Better

A monolith can be the right choice when:

- Application is small or moderate.
- Team is small.
- Requirements are evolving quickly.
- Operational maturity is limited.
- Independent scaling is not needed.
- Complexity does not justify distributed architecture.

### Strong answer

> I would not start with microservices purely because they are popular. I would choose them only if organizational, deployment, scaling, or domain boundaries justify the extra complexity.

---

# 10. Service Decomposition

Service decomposition means deciding where service boundaries should be.

This is one of the most important microservices interview topics.

---

## 10.1 Decompose by Business Capability

Example online shopping capabilities:

```text
Customer
Product Catalog
Order
Payment
Inventory
Shipping
Notification
```

Each capability represents a meaningful business responsibility.

---

## 10.2 Avoid Technical Decomposition

Weak idea:

```text
Controller Service
Database Service
Validation Service
Utility Service
```

These are technical layers, not business capabilities.

Microservices should generally align with meaningful business boundaries.

---

## 10.3 Good Service Boundary Characteristics

A good service boundary usually has:

- Focused responsibility.
- High cohesion.
- Limited unnecessary coupling.
- Clear API/event contracts.
- Independent evolution potential.

---

# 11. Service Decomposition Example

For online shopping:

```text
Customer Service
- customer profile
- account information

Catalog Service
- products
- categories

Order Service
- order creation
- order state

Payment Service
- payment processing

Inventory Service
- stock

Shipping Service
- shipment processing
```

### Important

Actual boundaries depend on business rules.

Do not claim this decomposition is universal.

---

# 12. API Gateway in Microservices

The curriculum explicitly lists API Gateway in Module 7.

Conceptually:

```text
Clients
   |
   v
API Gateway
   |
   +--> Order Service
   +--> Customer Service
   +--> Catalog Service
```

Potential responsibilities:

- Routing
- Authentication enforcement
- Cross-cutting policies
- Request aggregation
- Hiding internal service topology

---

# 13. Why Use API Gateway?

Without gateway:

```text
Client ---> Order Service
Client ---> Customer Service
Client ---> Catalog Service
Client ---> Payment Service
```

Client must know multiple services.

With gateway:

```text
Client ---> API Gateway ---> Services
```

The gateway simplifies external access.

### Trade-off

Gateway itself adds another component and operational responsibility.

---

# 14. Service Discovery

In distributed systems, service instances may:

- Scale up/down.
- Restart.
- Move.
- Have dynamic network locations.

Service Discovery helps services locate available instances.

Conceptually:

```text
Service A
   |
   v
Service Registry / Discovery Mechanism
   |
   v
Available Service B Instance
```

### Interview-ready answer

> Service discovery allows services to find other service instances dynamically instead of relying on fixed network locations.

---

# 15. Client-Side vs Server-Side Discovery — Interview Aid

The source only lists Service Discovery, so keep this conceptual.

## Client-Side Concept

Client selects an instance using discovery information.

## Server-Side Concept

A routing/load-balancing layer discovers and forwards to an available instance.

Do not turn this into a required implementation detail unless asked.

---

# 16. Microservices Communication

The source explicitly includes **Event-Driven Communication**.

At interview level, compare:

- Synchronous API communication
- Event-driven communication

---

## 16.1 Synchronous

```text
Order Service ---> Payment Service
```

Order Service waits for response.

Good when:

- Immediate result needed.
- Request-response relationship is direct.

---

## 16.2 Event-Driven

```text
Order Service
   |
   v
OrderCreated
   |
   +--> Inventory
   +--> Notification
   +--> Analytics
```

Good when:

- Multiple services react.
- Loose coupling is useful.
- Immediate downstream completion is not required.

---

# 17. Microservices Communication Trade-Offs

## Synchronous Risks

- Runtime dependency.
- Cascading failures.
- Latency chains.

## Event-Driven Risks

- Eventual consistency.
- Harder tracing.
- Failure/retry complexity.
- Duplicate processing concerns.

### Interview principle

> Communication style should be chosen per interaction, not once for the entire system.

---

# 18. Data Ownership — Interview Aid

The source does not explicitly list "database per service," so do not present it as curriculum.

However, for interview reasoning, a service should have clear ownership of its business data and avoid uncontrolled coupling through shared persistence structures.

### Example

Order Service should own order-related behavior/data.

Inventory Service should own stock-related behavior/data.

The exact physical data architecture is a design decision.

---

# 19. Distributed System Complexity

Microservices introduce complexity such as:

- Network failures.
- Latency.
- Partial failures.
- Service discovery.
- Observability.
- Versioned contracts.
- Deployment coordination.
- Data consistency challenges.

### Strong interview line

> Microservices do not remove complexity; they redistribute it from code/module boundaries into distributed-system and operational concerns.

---

# 20. Common Mistakes / Red Flags

## Mistake 1 — Microservice = Small Service

Wrong.

Size alone does not define a meaningful service boundary.

---

## Mistake 2 — One Table = One Microservice

Wrong.

Service boundaries should reflect business capability, not arbitrary technical splitting.

---

## Mistake 3 — Shared Database Everywhere

Can create hidden tight coupling between services.

---

## Mistake 4 — All Communication Must Be Async

Wrong.

Choose synchronous or event-driven based on interaction needs.

---

## Mistake 5 — API Gateway Contains Business Logic

Gateway should not become the central domain engine.

---

## Mistake 6 — Microservices Always Scale Better

They can allow independent scaling, but architecture, infrastructure, and workload determine real scalability.

---

## Mistake 7 — Start Microservices Before Understanding Domain

Premature decomposition creates poor boundaries and distributed complexity.

---

# 21. Practical Lab — Online Shopping Platform

The source curriculum explicitly requires:

> Design a microservices architecture for an online shopping platform.

Use the following requirements:

- Browse products.
- Create account.
- Place order.
- Make payment.
- Track inventory.
- Ship order.
- Notify customer.

---

# 22. Candidate Service Decomposition

```text
Customer Service
Catalog Service
Order Service
Payment Service
Inventory Service
Shipping Service
Notification Service
```

Again, this is a reasonable interview decomposition, not the only valid architecture.

---

# 23. High-Level Architecture

```text
                 Web / Mobile
                     |
                     v
                 API Gateway
                     |
       +-------------+-------------+
       |             |             |
       v             v             v
 Customer Service Catalog Service Order Service
                                   |
                     +-------------+-------------+
                     |             |             |
                     v             v             v
              Payment Service Inventory Service Shipping Service
                                                   |
                                                   v
                                            Notification Service
```

---

# 24. Example Order Flow — Mixed Communication

## Step 1

Client:

```text
POST /orders
```

through API Gateway to Order Service.

## Step 2

Order Service may synchronously validate an immediate dependency if required.

## Step 3

After order creation:

```text
OrderCreated
```

event can notify:

```text
Inventory
Notification
Analytics
```

The exact combination depends on consistency and business requirements.

---

# 25. Service Discovery in the Case Study

Suppose multiple Payment Service instances exist:

```text
Payment-1
Payment-2
Payment-3
```

A discovery/routing mechanism helps callers locate an available instance without hard-coded addresses.

---

# 26. Architecture Decision Questions

Before choosing microservices, ask:

- How large is the application?
- How many teams?
- How independent are business capabilities?
- Do services need independent deployment?
- Which capabilities scale differently?
- Can the organization operate distributed systems?
- What consistency requirements exist?
- What failure behavior is acceptable?

---

# 27. Interview Questions

## Q1 — Monolith vs microservices?

Compare:

- Deployment
- Scaling
- Complexity
- Transactions
- Debugging
- Team independence

---

## Q2 — What is service decomposition?

Dividing the system into focused services around meaningful business responsibilities.

---

## Q3 — How do you choose service boundaries?

Use:

- Business capability
- Responsibility
- Cohesion
- Change patterns
- Coupling
- Independent evolution

---

## Q4 — What is API Gateway?

A controlled entry point that routes client requests and can apply common policies before reaching backend services.

---

## Q5 — Why service discovery?

Because distributed service instances may have dynamic locations and multiple instances.

---

## Q6 — Synchronous vs event-driven communication?

Choose based on:

- Immediate response need
- Coupling
- Failure behavior
- Consistency
- Workflow

---

## Q7 — Why are microservices harder to debug?

Because request flows cross multiple processes/services/networks, creating distributed tracing and failure-analysis complexity.

---

## Q8 — Should every service have its own database?

Do not answer as a universal rule.

Explain service data ownership and independent boundaries, then say physical storage design depends on requirements.

---

# 28. Scenario Questions

## Scenario 1

A startup with five developers and one small product wants 30 microservices.

Response:

Challenge the complexity.

A modular monolith may be more appropriate initially.

---

## Scenario 2

Three teams must deploy independently and one capability scales 20x more than others.

Microservices may provide meaningful value.

Explain trade-offs.

---

## Scenario 3

Order Service directly calls six services synchronously.

Concern:

- Latency chain
- Runtime coupling
- Cascading failure

Consider which interactions require immediate response and which may be event-driven.

---

## Scenario 4

Services use hard-coded IP addresses.

Problem:

Poor fit for dynamic distributed deployment.

Service discovery/routing is needed.

---

## Scenario 5

One service needs direct access to another service's database tables.

Red flag:

This bypasses service contracts and increases tight coupling.

---

# 29. Follow-Up / Cross-Question Survival

## Cross-Q1
**Are microservices always independently deployable?**

Independent deployability is a major architectural goal, but poor coupling can still make deployments coordinated. Architecture must support true independence.

---

## Cross-Q2
**Can a monolith scale horizontally?**

Yes.

A monolith can be replicated behind load balancing if it is designed appropriately.

Microservices are not required for horizontal scaling.

---

## Cross-Q3
**How small should a microservice be?**

There is no universal size.

Boundary should be driven by business responsibility and change/deployment needs, not line count.

---

## Cross-Q4
**Can microservices share a database?**

They can technically, but excessive shared persistence can undermine service independence. Evaluate the trade-off rather than treating it as a rigid rule.

---

## Cross-Q5
**What if service discovery fails?**

Service-to-service communication may be affected. Discovery mechanisms therefore need appropriate availability and resilience.

---

## Cross-Q6
**Should API Gateway handle all authentication and authorization?**

Gateway can enforce common access policies, but backend services may still need domain-level authorization.

---

## Cross-Q7
**Would you convert every monolith to microservices?**

No.

Migration should solve actual problems such as deployment coupling, team autonomy, scaling, or domain complexity.

---

# 30. Whiteboard Drill

Draw without notes:

```text
Clients
  |
  v
API Gateway
  |
  +--> Customer
  +--> Catalog
  +--> Order
          |
          +--> Payment
          +--> Inventory
          +--> Shipping
```

Then add:

```text
OrderCreated
  |
  +--> Notification
  +--> Analytics
```

Explain:

- Service boundaries
- Gateway
- Discovery
- Sync communication
- Event-driven communication
- Trade-offs

---

# 31. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- Monolith
- Microservices
- Service decomposition
- Service boundary
- API Gateway
- Service Discovery
- Synchronous communication
- Event-driven communication
- Distributed-system complexity
- Microservices trade-off

---

# 32. Rapid Revision

## Monolith

**One deployable application**

## Microservices

**Independent focused business services**

## Decomposition

**Business capability + high cohesion + controlled coupling**

## API Gateway

**External entry point / routing / common policies**

## Service Discovery

**Find dynamic service instances**

## Communication

**Sync when immediate response matters**  
**Events when independent reactions/loose coupling matter**

## Golden Rule

> Use microservices when the business, team, scaling, or deployment boundaries justify distributed-system complexity.

---

# 33. Self-Practice

Answer aloud:

1. Monolith vs microservices?
2. Benefits of monolith?
3. Risks of monolith?
4. Benefits of microservices?
5. Risks of microservices?
6. What is service decomposition?
7. How do you identify service boundaries?
8. Why not decompose by technical layer?
9. What is API Gateway?
10. What is service discovery?
11. Why are hard-coded service locations bad?
12. Sync vs event-driven communication?
13. When would you use events?
14. Can monolith scale horizontally?
15. Should every service have its own database?
16. Why are microservices harder to debug?
17. What problems justify microservices?
18. When would a monolith be better?
19. Design an online-shopping microservices architecture.
20. Defend your service boundaries.

---

# 34. P08 Readiness Gate

Do **not** mark P08 complete unless you can:

- [ ] Explain monolithic architecture.
- [ ] Explain microservices architecture.
- [ ] Compare monolith vs microservices.
- [ ] Explain when microservices are justified.
- [ ] Explain when monolith may be better.
- [ ] Explain service decomposition.
- [ ] Identify meaningful business service boundaries.
- [ ] Explain API Gateway.
- [ ] Explain Service Discovery.
- [ ] Compare synchronous vs event-driven communication.
- [ ] Explain distributed-system trade-offs.
- [ ] Design the online-shopping architecture.
- [ ] Draw the architecture without notes.
- [ ] Handle at least five microservices cross-questions.
- [ ] Defend why each service boundary exists.
- [ ] Avoid technology-first or microservices-by-default answers.

**Pass Condition:** You can decide whether microservices are justified, define sensible service boundaries, explain communication and discovery, and defend the architecture against simpler alternatives.

---

# 35. Source Boundary

This pack is grounded in the following topics from **Module 7 of the supplied Software Design & Architecture curriculum**:

- Monolithic vs. Microservices
- Service Decomposition
- API Gateway
- Service Discovery
- Event-Driven Communication
- Lab: Design a microservices architecture for an online shopping platform

The following source Module 7 topics are intentionally deferred to **P09** according to the locked 12-pack TOC:

- Containerization with Docker
- Kubernetes Basics
- Twelve-Factor App Principles

The explanations around service boundaries, synchronous communication, distributed complexity, and data ownership are interview-preparation aids that help defend the listed curriculum topics; they are not presented as additional mandatory curriculum modules.

---

## Status

**P08 — READY FOR STUDY & READINESS VALIDATION**

**Next after P08 gate:** P09 — Cloud-Native Architecture + DevOps