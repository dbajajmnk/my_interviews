# P02 — Object-Oriented Design Principles

**Interview Track:** Software Design & Architecture  
**Pack:** P02 of 12  
**Source Curriculum:** Module 2 — Object-Oriented Design Principles  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Explain, apply, compare, refactor, and defend core object-oriented design principles in interview scenarios.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain and apply:

- SOLID Principles
- DRY
- KISS
- YAGNI
- Separation of Concerns
- Coupling and Cohesion
- Dependency Injection
- Inversion of Control
- Refactoring using SOLID principles

The goal is not to memorize definitions. You should be able to identify design problems, explain why they are problems, propose a better structure, and defend the trade-offs.

---

# 2. Simple Analogy

Imagine a restaurant kitchen.

A poor kitchen design may have:

- One person taking orders, cooking, billing, cleaning, and handling inventory.
- Every station depending directly on every other station.
- The same recipe duplicated in multiple places.
- Complex procedures for tasks that should be simple.

A better kitchen separates responsibilities:

- Order taking
- Cooking
- Billing
- Inventory
- Cleaning

Each role has a clear responsibility, dependencies are controlled, and processes are reusable.

That is very similar to good software design.

---

# 3. Visualization

```text
Business Requirement
       |
       v
   Design Logic
       |
       +-------------------------------+
       |                               |
       v                               v
Responsibilities                 Dependencies
       |                               |
       v                               v
Separation of Concerns      Coupling / Cohesion
       |                               |
       +---------------+---------------+
                       |
                       v
                    SOLID
                       |
     +---------+-------+-------+---------+
     |         |               |         |
     v         v               v         v
    SRP       OCP             LSP       ISP       DIP
                       |
                       v
                 DI / IoC
                       |
                       v
               Maintainable Design
```

---

# 4. Mind Map

```text
Object-Oriented Design Principles
|
+-- SOLID
|   +-- SRP
|   +-- OCP
|   +-- LSP
|   +-- ISP
|   +-- DIP
|
+-- Supporting Principles
|   +-- DRY
|   +-- KISS
|   +-- YAGNI
|   +-- Separation of Concerns
|
+-- Structural Quality
|   +-- Coupling
|   +-- Cohesion
|
+-- Dependency Management
|   +-- DI
|   +-- IoC
|
+-- Practical
    +-- Refactoring
    +-- Trade-offs
    +-- Code / design review
```

---

# 5. Core Concepts

## 5.1 SOLID

SOLID is a group of five object-oriented design principles intended to improve maintainability, flexibility, and clarity.

---

## 5.2 S — Single Responsibility Principle

A class or module should have one clear reason to change.

### Example

Poor design:

```text
InvoiceService
- calculateInvoice()
- saveToDatabase()
- sendEmail()
- generatePDF()
```

This class mixes:

- Business calculation
- Persistence
- Notification
- Document generation

Better separation:

```text
InvoiceCalculator
InvoiceRepository
InvoiceEmailService
InvoicePdfGenerator
```

### Interview point

SRP is not simply “one method per class.”

It means responsibilities that change for different reasons should be separated.

### Cross-question

**Q: Can SRP create too many classes?**

Yes, if applied mechanically. The objective is meaningful separation, not fragmentation for its own sake.

---

## 5.3 O — Open/Closed Principle

Software entities should be open for extension but closed for unnecessary modification.

### Example

Suppose payment logic is written as:

```text
if paymentType == CARD
else if paymentType == PAYPAL
else if paymentType == UPI
```

Each new payment method forces modification of existing logic.

A better design may define:

```text
PaymentProcessor
    process()

CardPaymentProcessor
PaypalPaymentProcessor
UPIPaymentProcessor
```

New implementations can be added with less modification to stable code.

### Interview point

OCP does not mean code must never be modified.

It means stable behavior should be extendable without repeatedly changing central logic.

---

## 5.4 L — Liskov Substitution Principle

A subtype should be usable wherever its base type is expected without breaking expected behavior.

### Simple example

If a method expects a `Bird` with a meaningful `fly()` contract, creating a `Penguin` subtype that cannot satisfy that behavior shows a poor abstraction.

The deeper problem is usually the incorrect base abstraction.

### Better thinking

Instead of:

```text
Bird
  fly()
```

we may separate capabilities:

```text
Bird
FlyingBird
NonFlyingBird
```

The exact design depends on context.

### Interview point

LSP is about behavioral compatibility, not just inheritance syntax.

---

## 5.5 I — Interface Segregation Principle

Clients should not be forced to depend on methods they do not need.

### Poor interface

```text
Worker
- work()
- eat()
- sleep()
```

An automated robot may implement `work()` but should not be forced to implement irrelevant `eat()` or `sleep()` methods.

Better:

```text
Workable
Eatable
Sleepable
```

### Interview point

Prefer focused interfaces over large “god interfaces.”

---

## 5.6 D — Dependency Inversion Principle

High-level modules should not depend directly on low-level implementation details. Both should depend on abstractions.

### Poor design

```text
OrderService
    directly creates MySQLOrderRepository
```

The business layer becomes tightly coupled to a particular implementation.

Better:

```text
OrderService
    depends on OrderRepository

MySQLOrderRepository implements OrderRepository
```

### Interview point

DIP is a design principle.

Dependency Injection is one common technique used to implement it.

---

# 6. DRY, KISS, YAGNI

## 6.1 DRY — Don't Repeat Yourself

Avoid duplicating the same knowledge or logic in multiple places.

### Why it matters

Duplication can create inconsistent behavior.

Example:

The same tax calculation exists in three modules.

If tax rules change, all three must be updated correctly.

### Red flag

DRY does not mean every similar-looking line must be abstracted.

Premature abstraction can make code harder to understand.

---

## 6.2 KISS — Keep It Simple

Prefer the simplest design that correctly solves the requirement.

### Interview point

Simple does not mean simplistic.

A design should be understandable and proportionate to actual needs.

### Example

If an internal application has limited users and straightforward requirements, introducing a highly distributed architecture without justification may violate KISS.

---

## 6.3 YAGNI — You Aren't Gonna Need It

Do not build functionality or complexity based only on imagined future requirements.

### Example

Building multi-region active-active deployment for a small internal application with no such requirement may be premature.

### Interview point

YAGNI encourages evidence-based design.

---

# 7. Separation of Concerns

Different concerns should be separated so that changes in one area have limited impact on others.

Typical concerns:

- Presentation
- Business logic
- Persistence
- Security
- Integration
- Notification

### Example

A controller should not usually:

- Validate everything
- Execute complex business logic
- Build database queries
- Send emails
- Format reports

All inside one method.

### Benefit

Separation of concerns improves:

- Maintainability
- Testability
- Reusability
- Change isolation

---

# 8. Coupling and Cohesion

## 8.1 Coupling

Coupling describes how strongly modules depend on each other.

### High coupling

A change in one module forces changes in several others.

### Lower coupling

Modules interact through clear boundaries and controlled contracts.

### Interview preference

Aim for appropriately low coupling, not “zero coupling.”

Modules must collaborate somehow.

---

## 8.2 Cohesion

Cohesion describes how closely related the responsibilities inside a module are.

### High cohesion

A module has a focused purpose.

### Low cohesion

A module contains unrelated responsibilities.

### Example

`PaymentService` containing payment-related behavior is cohesive.

`UtilityService` containing payment, email, file handling, authentication, and reporting is poorly cohesive.

---

## 8.3 Coupling vs Cohesion

A common design goal is:

**Low coupling + High cohesion**

Why?

- High cohesion keeps related responsibilities together.
- Lower coupling reduces unnecessary dependencies between modules.

---

# 9. Dependency Injection and IoC

## 9.1 Dependency Injection

Dependency Injection means supplying a dependency from outside rather than constructing it directly inside the dependent class.

### Poor design

```text
class OrderService {
    repository = new MySQLOrderRepository()
}
```

### Better abstraction

```text
class OrderService {
    OrderRepository repository

    OrderService(OrderRepository repository) {
        this.repository = repository
    }
}
```

Now the service depends on an abstraction.

---

## 9.2 Injection Styles

Common styles include:

- Constructor injection
- Setter injection
- Method injection

For required dependencies, constructor injection is often preferred because it makes required dependencies explicit.

---

## 9.3 Inversion of Control

IoC is the broader idea that control over object creation or execution flow is moved away from application code to a framework/container or external mechanism.

Dependency Injection is one implementation technique for IoC.

### Easy distinction

**IoC = broader principle**  
**DI = common technique**

---

# 10. Engineering Depth

## 10.1 SOLID Principles Work Together

Example:

An `OrderService` depends on `OrderRepository`.

This may support:

- SRP: service focuses on business logic.
- DIP: business logic depends on abstraction.
- OCP: new repository implementations can be added.
- Testability: fake/mock repository can be injected.

Good design principles frequently reinforce each other.

---

## 10.2 Principles Are Guidelines, Not Laws

Interview red flag:

> “I always apply every SOLID principle everywhere.”

Better:

> “I use the principles as design guidance and balance them against complexity, readability, scale, and actual requirements.”

---

## 10.3 Abstraction Has a Cost

Too little abstraction can cause duplication and tight coupling.

Too much abstraction can cause:

- Excessive interfaces
- Indirection
- Hard-to-follow code
- Unnecessary complexity

Good design finds the right level.

---

# 11. Common Mistakes / Red Flags

## Mistake 1 — SRP = One Method Per Class

Wrong.

SRP is about one reason to change.

---

## Mistake 2 — OCP = Never Modify Code

Wrong.

OCP aims to reduce repeated modification of stable logic by supporting extension.

---

## Mistake 3 — LSP = Only About Inheritance Syntax

Wrong.

It is about preserving expected behavior.

---

## Mistake 4 — DIP = Dependency Injection

Not exactly.

DIP is the principle.

DI is a technique commonly used to achieve it.

---

## Mistake 5 — More Abstraction = Better Design

Not always.

Unnecessary abstraction can violate KISS and YAGNI.

---

## Mistake 6 — Low Coupling Means No Dependencies

Impossible in a useful system.

The goal is controlled and appropriate dependencies.

---

# 12. Refactoring Exercise

The source curriculum explicitly includes:

> Refactor an application using SOLID principles.

Use this sample.

## Before

```text
OrderManager
|
+-- validateOrder()
+-- calculatePrice()
+-- saveOrder()
+-- sendConfirmationEmail()
+-- generateInvoice()
```

Problems:

- Multiple responsibilities
- Tight coupling
- Hard to test
- Hard to replace infrastructure behavior
- Changes in unrelated concerns affect one class

---

## After

```text
OrderService
   |
   +--> OrderValidator
   +--> PricingService
   +--> OrderRepository
   +--> NotificationService
   +--> InvoiceService
```

### Improvements

- Responsibilities are separated.
- Interfaces can be introduced where useful.
- Dependencies can be injected.
- Infrastructure implementations can change independently.
- Testing becomes easier.

### Important

Do not split classes mechanically.

Each boundary should represent a meaningful responsibility.

---

# 13. Practical Scenario

## Scenario

A reporting service:

- Fetches data from database.
- Calculates business metrics.
- Converts results to PDF.
- Emails report.
- Logs everything.
- Contains SQL directly.

### Interview analysis

Potential issues:

- Low cohesion.
- Multiple reasons to change.
- Tight infrastructure coupling.
- Poor testability.
- Violates separation of concerns.

### Possible refactoring

```text
ReportService
|
+--> ReportRepository
+--> MetricsCalculator
+--> ReportFormatter
+--> NotificationService
+--> Logger
```

Then ask:

- Which dependencies need abstractions?
- Which responsibilities can remain together?
- Are we overengineering?
- What actual change patterns justify the split?

---

# 14. Interview Questions

## Q1 — Explain SOLID.

Do not just expand the acronym.

Explain:

- Purpose
- Each principle
- One practical example
- How principles improve maintainability

---

## Q2 — SRP vs Separation of Concerns?

SRP usually focuses on responsibility at class/module level.

Separation of concerns is a broader design idea that different types of concerns should be kept distinct.

They reinforce each other.

---

## Q3 — DRY vs abstraction?

DRY discourages duplication of knowledge.

Abstraction is one possible way to remove duplication, but abstraction should be introduced carefully.

---

## Q4 — KISS vs YAGNI?

KISS focuses on avoiding unnecessary complexity in the current solution.

YAGNI focuses on avoiding functionality or complexity based on speculative future needs.

---

## Q5 — Coupling vs cohesion?

Coupling = dependency between modules.

Cohesion = relatedness of responsibilities inside a module.

Goal: appropriately low coupling and high cohesion.

---

## Q6 — DIP vs DI?

DIP is a design principle.

DI is one technique for supplying dependencies from outside and can help implement DIP.

---

## Q7 — Constructor injection vs setter injection?

Constructor injection makes required dependencies explicit at object creation.

Setter injection may be useful for optional or changeable dependencies.

The correct choice depends on the dependency semantics.

---

## Q8 — Does SOLID always improve code?

Not automatically.

Mechanical application can create overengineering.

Principles should solve actual design problems.

---

# 15. Scenario Questions

## Scenario 1

A service contains 3,000 lines and handles:

- Validation
- Persistence
- Email
- Logging
- Payment
- Reporting

### Answer direction

Discuss:

- SRP
- Separation of concerns
- Cohesion
- Coupling
- Refactoring boundaries
- Risk of over-splitting

---

## Scenario 2

Every time a new notification type is added, an existing switch statement is modified.

### Principle

Likely OCP concern.

Consider abstraction such as:

```text
NotificationSender
EmailSender
SmsSender
PushSender
```

But first confirm complexity justifies the abstraction.

---

## Scenario 3

A base class defines methods that some subclasses cannot meaningfully implement.

### Principle

Potential LSP problem and possibly poor abstraction.

---

## Scenario 4

An interface contains twenty methods, but most implementations use only five.

### Principle

Potential ISP violation.

---

## Scenario 5

A business service directly creates a concrete database repository.

### Principle

Potential DIP problem.

DI may help.

---

# 16. Cross-Question Survival

## Cross-Q1
**Can SRP reduce performance?**

Usually the bigger concern is maintainability and design clarity. Extra abstraction may introduce small overhead in some cases, but the actual impact should be measured rather than assumed.

---

## Cross-Q2
**Can DRY be harmful?**

Yes.

If unrelated code is abstracted only because it currently looks similar, future changes may create awkward coupling.

---

## Cross-Q3
**Does dependency injection require a framework?**

No.

Dependencies can be injected manually through constructors or methods.

A DI container is optional.

---

## Cross-Q4
**Can high cohesion create large classes?**

Potentially.

High cohesion means responsibilities are strongly related, not that class size is irrelevant. A cohesive class can still need refactoring if it becomes too complex.

---

## Cross-Q5
**When would you not create an interface?**

If there is no meaningful abstraction, substitution need, testing benefit, or likely variation, adding an interface may be unnecessary.

---

## Cross-Q6
**Is inheritance required for SOLID?**

No.

SOLID applies more broadly to object-oriented design. Composition and interfaces are often preferable to deep inheritance.

---

# 17. Code Review Drill

Review this conceptually:

```text
class PaymentService {
    process(type) {
        if type == "CARD":
            ...
        else if type == "PAYPAL":
            ...
        else if type == "UPI":
            ...
    }
}
```

Ask:

1. What is wrong?
2. Is it actually a problem yet?
3. Which principle may apply?
4. What would you change?
5. Would you introduce interfaces immediately?
6. What trade-off does the refactoring create?

### Strong answer

Do not say “OCP violation” and stop.

Explain the evidence:

- Existing logic changes for each new payment type.
- Risk grows as variants increase.
- Strategy-like abstraction may help.
- For only one or two stable variants, extra abstraction may be unnecessary.
- Design should match actual change pressure.

---

# 18. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- SOLID
- SRP
- OCP
- LSP
- ISP
- DIP
- DRY
- KISS
- YAGNI
- Separation of Concerns
- Coupling
- Cohesion
- DI
- IoC

---

# 19. Rapid Revision

## SOLID

**S** — One clear reason to change  
**O** — Extend without repeatedly modifying stable logic  
**L** — Subtypes preserve expected behavior  
**I** — Focused interfaces  
**D** — Depend on abstractions, not concrete details

## Supporting principles

**DRY** — Avoid duplicated knowledge  
**KISS** — Prefer necessary simplicity  
**YAGNI** — Do not build speculative complexity  
**SoC** — Separate distinct concerns

## Structure

**Low coupling + High cohesion**

## Dependency management

**DIP = principle**  
**DI = technique**  
**IoC = broader control inversion**

---

# 20. Self-Practice

Answer aloud:

1. Explain SOLID with one example each.
2. SRP vs separation of concerns?
3. OCP with payment example.
4. Explain LSP without quoting textbook wording.
5. What problem does ISP solve?
6. DIP vs DI?
7. DI vs IoC?
8. DRY vs premature abstraction?
9. KISS vs YAGNI?
10. Low coupling vs high cohesion?
11. How would you refactor a god class?
12. When is an interface unnecessary?
13. How can SOLID create overengineering?
14. Why is constructor injection commonly preferred?
15. Refactor a reporting service conceptually.

---

# 21. P02 Readiness Gate

Do **not** mark P02 complete unless you can:

- [ ] Explain all five SOLID principles in your own words.
- [ ] Give one practical example for each SOLID principle.
- [ ] Explain DRY, KISS and YAGNI without confusing them.
- [ ] Explain separation of concerns.
- [ ] Explain coupling and cohesion.
- [ ] Explain why low coupling and high cohesion are desirable.
- [ ] Distinguish DIP, DI and IoC.
- [ ] Analyze a poorly structured class.
- [ ] Propose a reasonable refactoring.
- [ ] Explain when abstraction becomes overengineering.
- [ ] Handle at least five cross-questions.
- [ ] Review a design scenario instead of only reciting definitions.

**Pass Condition:** You can identify a design problem, connect it to a principle, propose a proportionate improvement, and defend why the improvement is justified.

---

# 22. Source Boundary

This pack is grounded in **Module 2 of the supplied Software Design & Architecture curriculum**, which contains:

- SOLID Principles
- DRY, KISS, YAGNI
- Separation of Concerns
- Coupling and Cohesion
- Dependency Injection & Inversion of Control
- Refactor an application using SOLID principles

The analogies, examples, scenario drills, code-review exercises, cross-questions, and readiness checks are interview-preparation aids built around those supplied topics.

---

## Status

**P02 — READY FOR STUDY & READINESS VALIDATION**

**Next after P02 gate:** P03 — UML + C4 Architecture Modeling