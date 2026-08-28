# P05 — Software Architecture Patterns

**Interview Track:** Software Design & Architecture  
**Pack:** P05 of 12  
**Source Curriculum:** Module 5 — Software Architecture Patterns  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, compare, select, explain, and defend the architecture patterns explicitly listed in the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain and compare:

- Layered Architecture
- MVC Architecture
- Clean Architecture
- Hexagonal Architecture
- Onion Architecture

You should also be able to:

- Explain the main structural idea behind each pattern.
- Understand their similarities and differences.
- Choose an appropriate architecture for a scenario.
- Explain trade-offs.
- Recognize overengineering.
- Defend your selection through cross-questions.

**Note:** Event-Driven Architecture and CQRS are also present in source Module 5, but they are handled separately in P06.

---

# 2. Simple Analogy

Think about organizing a company.

A company may separate work into:

- Customer-facing teams
- Business operations
- Finance
- Infrastructure
- External partners

Different architecture patterns organize software responsibilities in different ways.

The goal is not to memorize shapes.

The goal is to answer:

> **Where should responsibilities live, how should dependencies flow, and how much should business logic depend on frameworks or infrastructure?**

---

# 3. Visualization

```text
Architecture Patterns
|
+-- Layered
|   +-- Presentation
|   +-- Business
|   +-- Data
|
+-- MVC
|   +-- Model
|   +-- View
|   +-- Controller
|
+-- Clean
|   +-- Business rules at center
|   +-- Dependencies point inward
|
+-- Hexagonal
|   +-- Application core
|   +-- Ports
|   +-- Adapters
|
+-- Onion
    +-- Domain at center
    +-- Layers around domain
    +-- Dependencies point inward
```

---

# 4. Mind Map

```text
Architecture Selection
|
+-- Simple enterprise application?
|   +-- Layered
|
+-- UI interaction pattern?
|   +-- MVC
|
+-- Protect business rules from frameworks?
|   +-- Clean
|   +-- Onion
|   +-- Hexagonal
|
+-- Need strong external-boundary abstraction?
    +-- Hexagonal
```

---

# 5. What is an Architecture Pattern?

An architecture pattern is a reusable high-level structure for organizing major parts of a software system.

### Interview-ready answer

> An architecture pattern provides a proven way to organize responsibilities, dependencies, and major system boundaries. The right pattern depends on requirements, complexity, change frequency, team structure, and trade-offs.

### Important

Do not treat architecture patterns as frameworks.

A framework may help implement an architecture pattern, but the pattern itself is a structural idea.

---

# 6. Layered Architecture

## Core Idea

Organize the application into horizontal layers.

Common example:

```text
Presentation Layer
        |
        v
Business Layer
        |
        v
Data Access Layer
        |
        v
Database
```

### Typical Responsibilities

**Presentation**
- UI
- Controllers
- Input/output handling

**Business**
- Business rules
- Application logic

**Data Access**
- Persistence
- Repository/database interaction

---

## Benefits

- Easy to understand.
- Familiar to many teams.
- Clear responsibility separation.
- Suitable for many business applications.

---

## Risks

- Layers may become tightly coupled.
- Business logic may depend too much on infrastructure.
- Large applications can become difficult to evolve.
- Teams may create “pass-through” layers that add little value.

---

## Interview Scenario

A moderate internal business application has:

- Standard CRUD
- Straightforward business logic
- Small team
- Limited integration complexity

A layered architecture may be a reasonable starting point.

### Strong answer

Do not say:

> “Layered is old.”

Say:

> “For a straightforward application with predictable boundaries, layered architecture can be simple and effective. I would avoid adding more complex architecture unless the requirements justify it.”

---

# 7. MVC Architecture

MVC stands for:

- Model
- View
- Controller

## Core Idea

Separate:

- Data/business representation
- User interface
- Request/input coordination

---

## Structure

```text
User
 |
 v
Controller
 |
 v
Model
 |
 v
View
```

The exact runtime flow varies by framework, but conceptually:

### Model
Represents application data/business state.

### View
Presents information to the user.

### Controller
Handles requests/input and coordinates actions.

---

## Benefits

- Separation between UI and application concerns.
- Better maintainability than mixing everything together.
- Common web application pattern.

---

## Risks

- Controllers can become too large.
- Business logic may accidentally move into controllers.
- “Model” may become ambiguous across frameworks.

---

## Interview Point

MVC is often used for presentation/application structure.

It is not necessarily the complete architecture for the entire enterprise system.

---

# 8. Clean Architecture

## Core Idea

Business rules should remain independent from:

- UI
- Database
- Framework
- External services

Dependencies should point inward toward core business rules.

---

## Simplified Structure

```text
External Frameworks / UI / DB
           |
           v
    Interface Adapters
           |
           v
     Application Logic
           |
           v
       Domain Core
```

Conceptually, dependency direction points toward the center.

---

## Main Principle

> The core business logic should not depend directly on infrastructure details.

---

## Benefits

- Business rules are easier to test.
- Infrastructure can change with reduced impact.
- Strong separation of concerns.
- Supports maintainability.

---

## Risks

- More abstractions.
- More interfaces.
- More project structure.
- Can be excessive for small/simple applications.

---

# 9. Hexagonal Architecture

Hexagonal Architecture is also commonly described using:

- Application Core
- Ports
- Adapters

## Core Idea

The application core communicates with the outside world through explicit ports.

Adapters connect those ports to external technologies.

---

## Structure

```text
        Web Adapter
            |
            v
          Port
            |
            v
     Application Core
            ^
            |
          Port
            ^
            |
      Database Adapter
```

External adapters may include:

- REST controller
- Database repository
- Message broker
- External service client

---

## Why “Ports and Adapters”?

### Port
Defines how the application communicates with something.

### Adapter
Implements the technical connection.

Example:

```text
PaymentPort
    |
    +--> StripeAdapter
    +--> LegacyBankAdapter
```

---

## Benefits

- Strong isolation of business/application core.
- Infrastructure can be replaced.
- Good testability.
- Explicit integration boundaries.

---

## Risks

- More abstractions.
- More interfaces and adapters.
- Can feel heavy for simple CRUD systems.

---

# 10. Onion Architecture

## Core Idea

Place the domain model at the center.

Other concerns form layers around it.

Dependencies point inward.

---

## Simplified Structure

```text
Infrastructure
      |
      v
Application Services
      |
      v
Domain Services
      |
      v
Domain Model
```

Conceptually, outer layers depend on inner layers.

The inner domain should not depend on infrastructure.

---

## Benefits

- Strong domain focus.
- Infrastructure independence.
- Improved testability.
- Helps protect business rules.

---

## Risks

- Additional complexity.
- More abstraction.
- Requires discipline to keep dependency direction correct.

---

# 11. Clean vs Hexagonal vs Onion

These architectures have significant conceptual overlap.

Do not pretend they are completely unrelated.

They all generally emphasize:

- Business/core logic protection.
- Dependency inversion.
- Infrastructure independence.
- Testability.
- Separation of concerns.

---

## Main Emphasis

### Clean Architecture
Emphasizes dependency rules and concentric responsibility boundaries.

### Hexagonal Architecture
Emphasizes ports and adapters between the application core and external systems.

### Onion Architecture
Emphasizes domain-centric concentric layers with inward dependencies.

---

## Interview-ready answer

> Clean, Hexagonal, and Onion architectures share the idea that business logic should not depend directly on infrastructure. Their emphasis and terminology differ: Clean focuses on dependency layers, Hexagonal on ports and adapters, and Onion on a domain-centered layered model.

---

# 12. Layered vs Clean/Hexagonal/Onion

## Traditional Layered

```text
Presentation
    |
Business
    |
Data
```

Dependency usually flows downward.

## Clean / Hexagonal / Onion

Business/domain core is protected from infrastructure details.

Dependency direction is inverted toward the core.

---

## Interview Comparison

### Choose Layered when:
- Application is straightforward.
- Complexity is moderate.
- Simplicity is important.
- Infrastructure change is unlikely to dominate design.

### Consider Clean/Hexagonal/Onion when:
- Business logic is complex.
- Long-term maintainability matters.
- External systems may change.
- Testing business logic independently is important.
- Strong boundaries are valuable.

Do not turn this into a rigid rule.

---

# 13. MVC vs Layered Architecture

These solve different structural concerns.

### MVC
Primarily separates interaction/presentation responsibilities.

### Layered Architecture
Separates the application into broader technical/business layers.

They can be used together.

Example:

```text
Presentation Layer
    |
    +-- MVC
    |
Business Layer
    |
Data Layer
```

---

# 14. Engineering Depth

## 14.1 Dependency Direction Matters

In architecture interviews, ask:

> Which layer knows about which layer?

That reveals whether the architecture actually protects business logic.

---

## 14.2 Business Logic Placement

A common red flag is business logic inside:

- Controllers
- Database code
- Framework-specific classes

Strong architecture keeps important business rules in focused application/domain areas.

---

## 14.3 Framework Independence

Clean/Hexagonal/Onion encourage the idea that frameworks are implementation details around the core.

That does not mean frameworks are unimportant.

It means business rules should not be unnecessarily coupled to them.

---

# 15. Common Mistakes / Red Flags

## Mistake 1 — Layered = Always Bad

Wrong.

Layered architecture can be appropriate and simple.

---

## Mistake 2 — Clean = Many Folders

Wrong.

Folder names do not create Clean Architecture.

Dependency direction and responsibility boundaries matter.

---

## Mistake 3 — Hexagonal = Six Sides

Wrong.

The “hexagon” is conceptual. The important idea is ports and adapters.

---

## Mistake 4 — Onion = Same as Layered

Not exactly.

Traditional layered architecture often allows downward dependencies.

Onion emphasizes inward dependency toward the domain.

---

## Mistake 5 — MVC = Complete Enterprise Architecture

MVC typically addresses a specific separation concern, especially around presentation/input.

---

## Mistake 6 — Choosing architecture by popularity

Architecture should be selected based on requirements and constraints.

---

# 16. Practical Scenario — Order Management System

Requirements:

- Create order.
- Validate customer.
- Calculate price.
- Store order.
- Call payment provider.
- Send notification.

---

## Layered Approach

```text
Controller
   |
Service
   |
Repository
   |
Database
```

Payment integration may be called from service layer.

Simple and understandable.

---

## Hexagonal Approach

```text
REST Adapter
    |
    v
Input Port
    |
    v
Order Application Core
    |
    +--> OrderRepository Port
    |
    +--> Payment Port
    |
    +--> Notification Port
            |
            v
        External Adapters
```

This gives stronger isolation from external systems.

---

## Interview Decision

Do not say one is always better.

Ask:

- How complex is the domain?
- How many external integrations?
- How likely are infrastructure changes?
- How important is test isolation?
- How large is the team?
- How much abstraction can the team maintain?

Then choose proportionately.

---

# 17. Architecture Selection Matrix

| Situation | Likely Consideration |
|---|---|
| Simple business app | Layered |
| UI/request organization | MVC |
| Strong core business isolation | Clean |
| Multiple external integrations | Hexagonal |
| Domain-centric system | Onion |
| Small CRUD app | Avoid unnecessary complexity |
| Complex domain + long lifespan | Stronger core boundaries may help |

This is a thinking aid, not a universal rule.

---

# 18. Interview Questions

## Q1 — What is layered architecture?

A structure where responsibilities are organized into layers such as presentation, business, and data access.

---

## Q2 — Benefits of layered architecture?

- Simplicity
- Familiar structure
- Separation of responsibilities
- Easier onboarding

Also discuss limitations.

---

## Q3 — Explain MVC.

Model manages application/data state, View handles presentation, Controller coordinates input/request handling.

---

## Q4 — Clean Architecture core principle?

Dependencies point toward inner business rules, keeping core logic independent from frameworks and infrastructure.

---

## Q5 — Explain Hexagonal Architecture.

Application core interacts with external systems through ports, with adapters implementing concrete integrations.

---

## Q6 — Explain Onion Architecture.

Domain sits at the center, outer layers surround it, and dependencies point inward.

---

## Q7 — Clean vs Hexagonal vs Onion?

Discuss shared principles first, then different emphasis.

---

## Q8 — Layered vs Hexagonal?

Layered is simpler and organized by horizontal responsibilities.

Hexagonal emphasizes application core isolation via ports and adapters.

---

## Q9 — Can MVC and layered architecture coexist?

Yes.

MVC can organize the presentation layer within a broader layered architecture.

---

# 19. Scenario Questions

## Scenario 1

A small internal CRUD application with six developers and limited integration complexity.

Likely approach:

**Layered architecture may be sufficient.**

---

## Scenario 2

A complex pricing domain must remain independent of database and framework changes.

Consider:

**Clean / Onion / Hexagonal-style core isolation.**

Explain why.

---

## Scenario 3

The system integrates with several external payment, shipping, and notification providers.

Strong candidate:

**Hexagonal architecture**

because external dependencies can be represented through ports and adapters.

---

## Scenario 4

A web application needs clear separation of request handling, model state, and presentation.

Candidate:

**MVC**

---

## Scenario 5

A team proposes Clean Architecture for a tiny CRUD service with almost no business logic.

Response:

Challenge whether the added abstractions provide enough value.

Use KISS/YAGNI.

---

# 20. Cross-Question Survival

## Cross-Q1
**Is Clean Architecture always better than layered architecture?**

No.

Clean Architecture introduces more boundaries and abstractions. For simple systems, layered architecture may be more appropriate.

---

## Cross-Q2
**Can layered architecture use dependency inversion?**

Yes.

Layered systems can still apply abstractions and dependency inversion. Architecture patterns are not rigid boxes.

---

## Cross-Q3
**Why use Hexagonal Architecture?**

When protecting application logic from changing external systems and integrations is valuable.

---

## Cross-Q4
**Is database inside the domain in Onion Architecture?**

No.

The domain should remain independent of infrastructure concerns such as databases.

---

## Cross-Q5
**What makes Clean Architecture difficult?**

Potential costs include:
- More abstractions
- More interfaces
- More indirection
- Learning curve
- Risk of overengineering

---

## Cross-Q6
**Which architecture would you choose for every project?**

None.

Architecture selection is contextual.

---

# 21. Whiteboard Drill

Draw from memory:

## Layered

```text
Presentation
    |
Business
    |
Data
```

## Clean

```text
Infrastructure
    |
Adapters
    |
Application
    |
Domain
```

## Hexagonal

```text
Adapter -> Port -> Core -> Port -> Adapter
```

## Onion

```text
Infrastructure
    |
Application
    |
Domain Services
    |
Domain Model
```

Then explain dependency direction.

---

# 22. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- Layered Architecture
- MVC
- Clean Architecture
- Hexagonal Architecture
- Onion Architecture
- Dependency direction
- Ports and adapters
- Architecture selection trade-off

---

# 23. Rapid Revision

## Layered
**Presentation → Business → Data**

## MVC
**Model • View • Controller**

## Clean
**Core business rules protected; dependencies inward**

## Hexagonal
**Core + Ports + Adapters**

## Onion
**Domain at center; dependencies inward**

## Golden Rule

> Choose architecture based on actual complexity, change pressure, boundaries, and constraints—not fashion.

---

# 24. Self-Practice

Answer aloud:

1. What is an architecture pattern?
2. Explain layered architecture.
3. Layered advantages and disadvantages?
4. Explain MVC.
5. MVC vs layered?
6. Explain Clean Architecture.
7. Explain Hexagonal Architecture.
8. Explain Onion Architecture.
9. Clean vs Hexagonal?
10. Hexagonal vs Onion?
11. Why do dependencies point inward?
12. What is a port?
13. What is an adapter?
14. When is Layered sufficient?
15. When would Clean Architecture be overengineering?
16. Which architecture fits many external integrations?
17. Which architecture is domain-centric?
18. Can these patterns be combined?
19. How would you structure an order-management system?
20. How would you justify your architecture choice?

---

# 25. P05 Readiness Gate

Do **not** mark P05 complete unless you can:

- [ ] Explain Layered Architecture.
- [ ] Explain MVC.
- [ ] Explain Clean Architecture.
- [ ] Explain Hexagonal Architecture.
- [ ] Explain Onion Architecture.
- [ ] Compare Layered vs Clean-style architecture.
- [ ] Compare MVC vs Layered.
- [ ] Compare Clean vs Hexagonal vs Onion.
- [ ] Explain dependency direction.
- [ ] Explain ports and adapters.
- [ ] Select architecture for a scenario.
- [ ] Explain when a simpler architecture is better.
- [ ] Identify overengineering.
- [ ] Draw the major patterns without notes.
- [ ] Handle at least five cross-questions.
- [ ] Defend one architecture choice based on requirements and constraints.

**Pass Condition:** You can choose a proportionate architecture, explain its structure, compare alternatives, and defend the trade-off without claiming one pattern is universally best.

---

# 26. Source Boundary

This pack is grounded in the following topics from **Module 5 of the supplied Software Design & Architecture curriculum**:

- Layered Architecture
- MVC Architecture
- Clean Architecture
- Hexagonal Architecture
- Onion Architecture
- Workshop: Compare architecture patterns and choose the best fit for different scenarios

**Event-Driven Architecture and CQRS are intentionally deferred to P06**, because the locked 12-pack TOC separates them into their own interview unit while preserving the same source scope.

The examples, selection matrix, analogies, comparisons, scenario drills, whiteboard exercises, interview questions, and readiness gate are interview-preparation aids built around the source-listed architecture patterns.

---

## Status

**P05 — READY FOR STUDY & READINESS VALIDATION**

**Next after P05 gate:** P06 — Event-Driven Architecture + CQRS