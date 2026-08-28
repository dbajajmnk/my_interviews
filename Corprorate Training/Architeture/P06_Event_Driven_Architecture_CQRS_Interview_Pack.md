# P06 — Event-Driven Architecture + CQRS

**Interview Track:** Software Design & Architecture  
**Pack:** P06 of 12  
**Source Curriculum:** Module 5 — Software Architecture Patterns  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, compare, select, and defend Event-Driven Architecture and CQRS at the level supported by the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain:

- Event-Driven Architecture
- CQRS — Introduction
- When event-driven thinking is useful
- When synchronous interaction may be simpler
- Basic producer/event/consumer flow
- Basic CQRS command/query separation
- Trade-offs and risks
- How Event-Driven Architecture and CQRS can relate
- How to choose or reject these approaches in an interview scenario

The supplied curriculum lists **Event-Driven Architecture** and **CQRS (Introduction)** under Software Architecture Patterns. This pack therefore stays at strong interview-level fundamentals rather than presenting advanced CQRS or event-sourcing material as required curriculum.

---

# 2. Simple Analogy

## Event-Driven Architecture

Imagine an airport announcement system.

A flight status changes.

The airport publishes an announcement:

> “Flight 123 is now boarding.”

Different people react independently:

- Passengers move to the gate.
- Staff prepare boarding.
- Displays update.
- Lounge staff may notify passengers.

The publisher does not manually call every person one by one.

That is the core event-driven idea:

> **Something happens → an event is produced → interested consumers react.**

---

## CQRS

Imagine a bank counter with separate responsibilities:

- One desk accepts actions such as deposit or withdrawal.
- Another desk answers information queries such as current balance or statement requests.

The actions that **change state** and the requests that **read state** are separated conceptually.

That is the basic CQRS idea:

> **Commands change state. Queries read state.**

---

# 3. Visualization

## Event-Driven Architecture

```text
Producer
   |
   v
 Event
   |
   v
Event Channel / Broker
   |
   +----------+-----------+-----------+
   |          |           |           |
   v          v           v           v
Consumer A Consumer B  Consumer C  Consumer D
```

Example:

```text
Order Service
     |
     v
OrderCreated Event
     |
     +--> Inventory
     +--> Notification
     +--> Analytics
     +--> Shipping
```

---

## CQRS

```text
            Application
          /             \
         v               v
     Commands          Queries
         |               |
         v               v
   Write Model       Read Model
         |               |
         +------- Data --+
```

At introductory level:

**Command side = change state**  
**Query side = retrieve state**

---

# 4. Mind Map

```text
Event-Driven + CQRS
|
+-- Event-Driven Architecture
|   +-- Producer
|   +-- Event
|   +-- Consumer
|   +-- Loose coupling
|   +-- Async possibilities
|   +-- Failure handling
|   +-- Eventual consistency possibility
|
+-- CQRS
|   +-- Command
|   +-- Query
|   +-- Separate responsibility
|   +-- Different read/write concerns
|
+-- Interview Decision
    +-- Why use?
    +-- Why not?
    +-- Trade-offs
    +-- Alternatives
```

---

# 5. Event-Driven Architecture

## 5.1 What is Event-Driven Architecture?

Event-Driven Architecture (EDA) is an architectural style in which components communicate by producing and reacting to events.

An event represents something that has happened.

Examples:

- OrderCreated
- PaymentCompleted
- UserRegistered
- ShipmentDispatched

### Interview-ready answer

> Event-Driven Architecture organizes communication around events. Producers publish facts that have occurred, and interested consumers react to those events, which can reduce direct coupling between components.

---

# 6. Core Building Blocks

## Producer

Creates/publishes the event.

Example:

```text
Order Service -> OrderCreated
```

---

## Event

A statement that something already happened.

Example:

```text
OrderCreated
orderId = 1001
customerId = 501
```

---

## Consumer

Receives and reacts to the event.

Example:

```text
Inventory Service
Notification Service
Analytics Service
```

---

## Event Channel / Broker

May carry events between producers and consumers.

The source curriculum does not prescribe a specific broker technology, so do not assume Kafka, RabbitMQ, Azure Service Bus, etc. unless the interviewer or scenario introduces one.

---

# 7. Event vs Command

This is a valuable interview distinction.

## Command

Represents an intention/request:

> “Create this order.”

Example:

```text
CreateOrder
```

## Event

Represents something that already happened:

> “The order was created.”

Example:

```text
OrderCreated
```

### Quick distinction

**Command = please do this.**  
**Event = this happened.**

---

# 8. Why Use Event-Driven Architecture?

Potential reasons include:

- Reduce direct coupling between components.
- Allow multiple consumers to react independently.
- Support asynchronous workflows where appropriate.
- Improve extensibility for new consumers.
- Model business events naturally.

Example:

When `OrderCreated` occurs:

```text
Inventory reserves stock
Notification sends email
Analytics records activity
Shipping prepares fulfillment
```

The Order component does not necessarily need direct knowledge of all consumers.

---

# 9. Event-Driven Trade-Offs

EDA is not automatically better.

Potential challenges:

- Harder debugging.
- Harder end-to-end tracing.
- Event ordering.
- Duplicate delivery.
- Failure handling.
- Event schema/version evolution.
- Eventual consistency.
- Operational complexity.

### Interview principle

> Reduced coupling usually introduces coordination and operational complexity elsewhere.

---

# 10. Synchronous vs Event-Driven Communication

## Synchronous

```text
Service A
   |
   v
Service B
   |
 response
```

Caller typically waits for the response.

### Good fit when:
- Immediate response is required.
- Workflow is simple.
- Request/result relationship is direct.

---

## Event-Driven

```text
Producer
   |
Publish Event
   |
   +--> Consumer A
   +--> Consumer B
```

Producer may not wait for every downstream action.

### Good fit when:
- Multiple independent reactions exist.
- Loose coupling is valuable.
- Immediate completion of all downstream work is not required.

---

## Interview Answer

Do not say:

> “Async is always more scalable.”

Better:

> “I would choose synchronous or event-driven interaction based on consistency needs, response expectations, coupling, failure behavior, and operational complexity.”

---

# 11. Practical E-Commerce Example

## Without Event-Driven Approach

```text
OrderService
   |
   +--> InventoryService
   +--> EmailService
   +--> AnalyticsService
   +--> ShippingService
```

OrderService is directly aware of several downstream systems.

---

## Event-Driven Approach

```text
OrderService
     |
     v
OrderCreated
     |
     +--> InventoryConsumer
     +--> EmailConsumer
     +--> AnalyticsConsumer
     +--> ShippingConsumer
```

### Benefit

New consumers can potentially be added without modifying the producer.

### Trade-off

The workflow becomes more distributed and requires careful failure and consistency handling.

---

# 12. Eventual Consistency

In event-driven systems, different parts of a system may not update at exactly the same instant.

Example:

1. Order created.
2. `OrderCreated` event published.
3. Analytics consumes it after a short delay.

For that period:

```text
Order system = updated
Analytics = not yet updated
```

The system can be **eventually consistent**.

### Interview point

Whether eventual consistency is acceptable depends on the business requirement.

Do not assume every domain can tolerate it.

---

# 13. Failure Thinking

Interviewers often move from:

> “Use events.”

to:

> “What happens if the consumer fails?”

Strong architecture thinking asks:

- Can processing retry?
- What happens to failed events?
- How do we prevent incorrect repeated side effects?
- How do we observe failures?
- How do we handle partial completion?

The source curriculum does not specify particular reliability mechanisms, so the pack keeps these as conceptual interview questions rather than prescribing technologies.

---

# 14. Idempotency — Interview Aid

If the same event is processed more than once, a consumer should avoid producing an incorrect duplicate effect where the business requires it.

Example:

If `PaymentCompleted` is delivered twice, we should not ship the same order twice.

This is a useful interview concept around event-driven reliability, but it is an interview aid rather than an explicitly named source-curriculum topic.

---

# 15. CQRS — Introduction

CQRS stands for:

**Command Query Responsibility Segregation**

## Core Idea

Separate operations that:

- **Change state** — Commands
- **Read state** — Queries

---

## Traditional Model

```text
Application Service
    |
    +--> create()
    +--> update()
    +--> delete()
    +--> read()
```

Same model may handle both reads and writes.

---

## CQRS Concept

```text
Commands
   |
   v
Write Side

Queries
   |
   v
Read Side
```

The degree of separation can vary.

At introductory interview level, focus on responsibility separation rather than assuming completely separate databases or infrastructure.

---

# 16. Command

A command requests a state change.

Examples:

- CreateOrder
- CancelOrder
- ApproveExpense
- UpdateCustomerAddress

A command is generally action-oriented.

---

# 17. Query

A query asks for information without intentionally changing business state.

Examples:

- GetOrderById
- SearchProducts
- GetExpenseStatus
- GenerateCustomerView

---

# 18. Why Consider CQRS?

Potential reasons:

- Read and write workloads are very different.
- Read models need different shapes than write models.
- Business commands need strong domain rules.
- Read paths need independent optimization.
- Clear separation of responsibilities is valuable.

### Example

E-commerce:

**Write side**
- Place order
- Cancel order
- Change shipping address

**Read side**
- Order history
- Order tracking view
- Dashboard
- Search

---

# 19. CQRS Trade-Offs

CQRS can introduce:

- More models.
- More code.
- Data synchronization complexity.
- Eventual consistency if read/write models update separately.
- Increased operational complexity.

### Red flag

Do not recommend CQRS for every CRUD application.

### Strong answer

> CQRS is useful when separating read and write concerns creates real value. For a simple application with similar read and write needs, traditional CRUD may be more appropriate.

---

# 20. CQRS Does Not Automatically Mean Separate Databases

At introductory level, CQRS means responsibility separation.

Implementations may range from:

```text
Separate command/query code paths
```

to much stronger separation.

Do not claim:

> “CQRS requires two databases.”

That is not a requirement of the core pattern.

---

# 21. Event-Driven Architecture + CQRS

They can be used together, but they are not the same pattern.

Example:

```text
CreateOrderCommand
       |
       v
Command Handler
       |
       v
Order State Updated
       |
       v
OrderCreated Event
       |
       +--> Update Read Model
       +--> Notification
       +--> Analytics
```

### Distinction

**CQRS**
Separates command/write responsibility from query/read responsibility.

**EDA**
Organizes communication around produced and consumed events.

A system can use:

- EDA without CQRS.
- CQRS without extensive event-driven communication.
- Both together.

---

# 22. CQRS vs CRUD

## CRUD

Simple model:

```text
Create
Read
Update
Delete
```

Potentially appropriate for many straightforward business applications.

---

## CQRS

Separates:

```text
Commands
Queries
```

Potentially useful for more complex or asymmetric read/write needs.

### Interview selection rule

Do not choose CQRS merely because it sounds more architectural.

Choose it only if requirements justify the added complexity.

---

# 23. Engineering Depth — Architecture Selection

Ask these questions before recommending EDA:

- Do multiple consumers need to react?
- Can downstream actions be asynchronous?
- Is loose coupling valuable?
- Can the business tolerate delayed consistency?
- Can the team operate distributed workflows?

Ask these before recommending CQRS:

- Are read/write models significantly different?
- Is write-side business logic complex?
- Are read optimization needs substantial?
- Does separation justify additional complexity?

---

# 24. Common Mistakes / Red Flags

## Mistake 1 — Event = Message

An event represents something that happened.

Transport message is the mechanism carrying information.

Do not casually collapse all messaging concepts into one.

---

## Mistake 2 — Event-Driven = Always Asynchronous

Event-driven systems often use asynchronous communication, but the defining idea is communication through events, not merely “async.”

---

## Mistake 3 — CQRS = Two Databases

Wrong.

CQRS is about command/query responsibility separation.

---

## Mistake 4 — CQRS = Event Sourcing

Wrong.

They are separate concepts.

The source curriculum does not list Event Sourcing, so do not present it as mandatory curriculum content.

---

## Mistake 5 — Event-Driven = Microservices

Wrong.

Event-driven communication can exist in different architectural contexts.

---

## Mistake 6 — Using CQRS for Simple CRUD

Can add unnecessary complexity.

---

# 25. Practical Scenario — Online Shopping Platform

## Requirement

When an order is placed:

- Order must be recorded.
- Inventory must react.
- Customer should be notified.
- Analytics should record activity.

---

## Event-Driven Model

```text
Customer
   |
   v
Place Order
   |
   v
Order Service
   |
   v
OrderCreated
   |
   +--> Inventory
   +--> Notification
   +--> Analytics
```

---

## CQRS View

### Commands

```text
CreateOrder
CancelOrder
UpdateShippingAddress
```

### Queries

```text
GetOrder
GetOrderHistory
TrackOrder
```

### Interview reasoning

If read and write needs are simple, full CQRS separation may be unnecessary.

If read models become highly specialized and write-side rules become complex, CQRS may become more attractive.

---

# 26. Interview Questions

## Q1 — What is Event-Driven Architecture?

An architecture style where components produce and react to events representing things that happened.

---

## Q2 — Benefits of EDA?

Potential benefits:

- Loose coupling
- Extensibility
- Multiple independent consumers
- Asynchronous processing where appropriate

Then discuss complexity.

---

## Q3 — What is an event?

A fact describing something that has already happened.

---

## Q4 — Command vs event?

Command:

> Request/intention.

Event:

> Fact that already occurred.

---

## Q5 — Synchronous vs event-driven?

Compare:

- Response expectations
- Coupling
- Consistency
- failure behavior
- operational complexity

---

## Q6 — What is CQRS?

Separate command responsibilities that change state from query responsibilities that read state.

---

## Q7 — Why use CQRS?

When read/write concerns, models, workloads, or optimization needs differ enough to justify separation.

---

## Q8 — CQRS vs CRUD?

CRUD is simpler and often sufficient.

CQRS introduces command/query separation and should be justified by actual complexity.

---

## Q9 — Does CQRS require separate databases?

No.

---

## Q10 — EDA vs CQRS?

EDA concerns event-based interaction.

CQRS concerns read/write responsibility separation.

---

# 27. Scenario Questions

## Scenario 1

When an order is placed, five independent systems need to react.

Possible candidate:

**Event-Driven Architecture**

Explain trade-offs.

---

## Scenario 2

An internal CRUD application has simple reads and writes with little business complexity.

Likely answer:

**Do not introduce CQRS without a reason.**

---

## Scenario 3

A dashboard has very heavy read traffic and a write model with complex validation rules.

CQRS may be worth considering.

Explain why and what complexity it adds.

---

## Scenario 4

The business requires every downstream operation to complete before returning success.

Ask whether an event-driven asynchronous flow fits that requirement or whether some synchronous coordination is needed.

---

## Scenario 5

A consumer processes the same order event twice.

Discuss duplicate side-effect protection conceptually.

---

# 28. Follow-Up / Cross-Question Survival

## Cross-Q1
**Does EDA guarantee loose coupling?**

Not automatically.

Consumers can still become semantically coupled to event schemas and business assumptions.

---

## Cross-Q2
**What is the biggest challenge in EDA?**

There is no single universal answer, but common difficulties include observability, consistency, ordering, duplicate processing, failure handling, and operational complexity.

---

## Cross-Q3
**Can EDA be used inside a monolith?**

Yes.

Event-driven interaction is not restricted to microservices.

---

## Cross-Q4
**Can CQRS use one database?**

Yes.

CQRS is fundamentally responsibility separation, not a mandatory physical data split.

---

## Cross-Q5
**Is CQRS good for scalability?**

It can allow independent optimization of reads and writes in some designs, but it also adds complexity. Do not sell it as an automatic scalability solution.

---

## Cross-Q6
**Can CQRS work without events?**

Yes.

Commands and queries can be separated without an event-driven architecture.

---

## Cross-Q7
**Would you use CQRS for every financial system?**

No.

Domain type alone does not justify CQRS. Requirements and complexity must justify it.

---

# 29. Whiteboard Drill

Draw and explain from memory:

## EDA

```text
Producer
   |
 Event
   |
Broker / Channel
   |
   +--> Consumer A
   +--> Consumer B
```

Then explain:

- Producer
- Event
- Consumer
- Failure
- Consistency
- Trade-off

---

## CQRS

```text
Client
  |
  +--> Command -> Write Side
  |
  +--> Query   -> Read Side
```

Then explain why separation may or may not be justified.

---

# 30. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- Event-Driven Architecture
- Event
- Producer
- Consumer
- Command vs Event
- Synchronous vs Event-Driven
- Eventual Consistency
- CQRS
- Command
- Query
- CQRS vs CRUD
- EDA vs CQRS

---

# 31. Rapid Revision

## EDA

**Something happens → Event → Consumers react**

## Command vs Event

**Command:** Do this  
**Event:** This happened

## CQRS

**Commands change state**  
**Queries read state**

## CQRS ≠

- Not automatically two databases
- Not the same as Event Sourcing
- Not mandatory for complex-looking systems

## Golden Rule

> Use EDA or CQRS only when their decoupling/separation benefits justify the additional complexity.

---

# 32. Self-Practice

Answer aloud:

1. What is Event-Driven Architecture?
2. What is an event?
3. Producer vs consumer?
4. Command vs event?
5. Synchronous vs event-driven?
6. What are EDA benefits?
7. What are EDA risks?
8. What is eventual consistency?
9. What is CQRS?
10. Command vs query?
11. CQRS vs CRUD?
12. Does CQRS need two databases?
13. CQRS vs Event-Driven Architecture?
14. Can EDA exist without microservices?
15. Can CQRS exist without EDA?
16. When would you avoid CQRS?
17. What happens if a consumer fails?
18. What if the same event is processed twice?
19. Design an event flow for OrderCreated.
20. Defend whether CQRS is appropriate for a simple CRUD application.

---

# 33. P06 Readiness Gate

Do **not** mark P06 complete unless you can:

- [ ] Explain Event-Driven Architecture in your own words.
- [ ] Explain producer, event, and consumer.
- [ ] Distinguish command from event.
- [ ] Compare synchronous and event-driven communication.
- [ ] Explain at least three EDA benefits.
- [ ] Explain at least three EDA trade-offs.
- [ ] Explain eventual consistency conceptually.
- [ ] Explain CQRS at introductory level.
- [ ] Distinguish command from query.
- [ ] Explain CQRS vs CRUD.
- [ ] State clearly that CQRS does not inherently require two databases.
- [ ] Distinguish CQRS from EDA.
- [ ] Explain when CQRS may be overengineering.
- [ ] Draw both EDA and CQRS flows without notes.
- [ ] Handle at least five cross-questions.
- [ ] Defend whether EDA/CQRS fits a given scenario.

**Pass Condition:** You can explain both patterns simply, identify when they add value, identify when they add unnecessary complexity, and defend your choice through follow-up questioning.

---

# 34. Source Boundary

This pack is grounded in the following topics from **Module 5 of the supplied Software Design & Architecture curriculum**:

- Event-Driven Architecture
- CQRS (Introduction)
- Workshop: Compare architecture patterns and choose the best fit for different scenarios

The following are included only as interview-preparation aids around those source topics:

- Producer/event/consumer explanation
- Command vs event
- Synchronous vs event-driven comparison
- Eventual consistency explanation
- Failure-oriented cross-questions
- Idempotency concept
- CQRS vs CRUD
- EDA vs CQRS comparisons

The supplied source does **not** explicitly list advanced CQRS, Event Sourcing, sagas, specific message brokers, or broker-specific implementation details; therefore those are not treated as mandatory curriculum content in this pack.

---

## Status

**P06 — READY FOR STUDY & READINESS VALIDATION**

**Next after P06 gate:** P07 — API Design, Integration & Security