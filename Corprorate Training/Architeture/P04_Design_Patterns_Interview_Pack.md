# P04 — Design Patterns

**Interview Track:** Software Design & Architecture  
**Pack:** P04 of 12  
**Source Curriculum:** Module 4 — Design Patterns  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, select, compare, implement conceptually, and defend the design patterns explicitly listed in the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain and apply:

### Creational Patterns
- Singleton
- Factory
- Builder

### Structural Patterns
- Adapter
- Facade
- Decorator

### Behavioral Patterns
- Observer
- Strategy
- Command

You should also be able to:

- Identify the problem each pattern solves.
- Recognize when a pattern is appropriate.
- Explain when a pattern is unnecessary.
- Compare similar patterns.
- Discuss trade-offs.
- Apply the patterns to practical interview scenarios.
- Survive cross-questions without relying on memorized definitions.

The supplied curriculum also includes a hands-on requirement to implement common design patterns in a sample application.

---

# 2. Simple Analogy

Think of patterns as reusable ways of organizing common problems.

A pattern is not a ready-made piece of code.

It is more like a proven arrangement.

Examples:

- **Factory** — ask a workshop to create the right product for you.
- **Builder** — construct a complex product step by step.
- **Adapter** — use a travel plug adapter between incompatible sockets.
- **Facade** — use a hotel reception desk instead of coordinating every department yourself.
- **Decorator** — add toppings to a pizza without changing the base pizza.
- **Observer** — subscribers receive updates when something changes.
- **Strategy** — choose one algorithm from multiple interchangeable options.
- **Command** — package a request as an object.
- **Singleton** — one controlled shared instance.

---

# 3. Visualization

```text
Design Patterns
|
+-- Creational
|   +-- Singleton
|   +-- Factory
|   +-- Builder
|
+-- Structural
|   +-- Adapter
|   +-- Facade
|   +-- Decorator
|
+-- Behavioral
    +-- Observer
    +-- Strategy
    +-- Command
```

---

# 4. Mind Map

```text
Pattern Selection
|
+-- Need object creation control?
|   +-- One shared instance -> Singleton
|   +-- Choose implementation -> Factory
|   +-- Build complex object step by step -> Builder
|
+-- Need structural adaptation?
|   +-- Incompatible interfaces -> Adapter
|   +-- Simplify subsystem -> Facade
|   +-- Add behavior dynamically -> Decorator
|
+-- Need behavioral flexibility?
    +-- Notify dependents -> Observer
    +-- Swap algorithms -> Strategy
    +-- Encapsulate request -> Command
```

---

# 5. What is a Design Pattern?

A design pattern is a reusable design approach for a recurring software design problem.

### Interview-ready answer

> A design pattern is a reusable solution structure for a recurring design problem. It is not copy-paste code; it is a proven way of organizing responsibilities and interactions.

### Important

Do not say:

> “Patterns are mandatory best practices.”

Better:

> Patterns are useful when the problem they solve actually exists.

---

# 6. Creational Patterns

---

## 6.1 Singleton

### Intent

Ensure that a class has one controlled instance and provide a common access point to it.

### Simple example

A configuration registry may be designed as one shared instance.

### Conceptual structure

```text
Singleton
|
+-- private constructor
+-- static/shared instance
+-- getInstance()
```

### Interview concerns

Singleton can introduce:

- Global state
- Tight coupling
- Hidden dependencies
- Testing difficulty
- Concurrency concerns

### Strong interview answer

> I would use Singleton only when a single shared instance is a genuine requirement, not merely because object creation feels inconvenient.

### Cross-question

**Q: Is Singleton always bad?**

No.

It can be appropriate when one controlled shared instance is truly needed, but misuse can create hidden global state and reduce testability.

---

## 6.2 Factory

### Intent

Encapsulate object creation and return an appropriate implementation based on context.

### Example

```text
NotificationFactory
|
+-- create("EMAIL") -> EmailNotifier
+-- create("SMS")   -> SmsNotifier
+-- create("PUSH")  -> PushNotifier
```

### Why use it?

The client does not need to know detailed construction logic.

### Interview benefit

Useful when:

- Multiple implementations exist.
- Creation logic is conditional.
- Clients should depend on abstraction rather than concrete classes.

### Red flag

Do not create a Factory if there is only trivial object creation with no meaningful variation.

---

## 6.3 Builder

### Intent

Construct a complex object step by step.

### Example

```text
ReportBuilder
|
+-- withTitle()
+-- withHeader()
+-- withFooter()
+-- withFormat()
+-- build()
```

### Good use case

An object has:

- Many optional fields.
- Several configuration steps.
- Multiple valid combinations.

### Interview point

Builder improves readability when constructor arguments become difficult to manage.

### Cross-question

**Factory vs Builder?**

**Factory:** decides which object/implementation to create.

**Builder:** controls how a complex object is constructed step by step.

---

# 7. Structural Patterns

---

## 7.1 Adapter

### Intent

Make incompatible interfaces work together.

### Real-life analogy

Travel plug adapter.

### Example

Existing application expects:

```text
PaymentProcessor
    pay()
```

Third-party library exposes:

```text
LegacyPaymentGateway
    makePayment()
```

Adapter:

```text
LegacyPaymentAdapter implements PaymentProcessor
    pay() -> legacy.makePayment()
```

### Interview use

Good for:

- Third-party integration.
- Legacy system integration.
- Interface mismatch.

### Red flag

Adapter changes interface compatibility, not business semantics.

---

## 7.2 Facade

### Intent

Provide a simpler unified interface to a complex subsystem.

### Example

Without facade:

```text
Client
 -> InventoryService
 -> PaymentService
 -> ShippingService
 -> NotificationService
```

With facade:

```text
Client
   |
   v
OrderFacade
   |
   +--> InventoryService
   +--> PaymentService
   +--> ShippingService
   +--> NotificationService
```

### Interview point

Facade simplifies usage.

It does not necessarily remove subsystem complexity internally.

---

## 7.3 Decorator

### Intent

Add behavior dynamically by wrapping an existing object.

### Example

```text
Coffee
|
+-- MilkDecorator
+-- SugarDecorator
+-- CreamDecorator
```

Each decorator adds behavior while preserving the same interface.

### Software example

```text
HttpClient
|
+-- LoggingDecorator
+-- RetryDecorator
+-- MetricsDecorator
```

### Interview point

Decorator favors composition over subclass explosion.

### Cross-question

**Decorator vs inheritance?**

Decorator adds behavior through composition at runtime.

Inheritance adds behavior through a static type hierarchy.

---

# 8. Behavioral Patterns

---

## 8.1 Observer

### Intent

When one object changes state, notify interested dependents.

### Example

```text
Order
  |
  +--> EmailSubscriber
  +--> SmsSubscriber
  +--> AnalyticsSubscriber
```

When order status changes, observers are notified.

### Typical uses

- Event notifications
- UI updates
- Publish/subscribe-like in-process behavior

### Risks

- Hard-to-follow update chains.
- Unexpected ordering.
- Memory leaks if observers are not managed properly.

---

## 8.2 Strategy

### Intent

Define interchangeable algorithms behind a common interface.

### Example

```text
PaymentStrategy
|
+-- CardPayment
+-- PaypalPayment
+-- UpiPayment
```

Context:

```text
CheckoutService
    uses PaymentStrategy
```

### Interview value

Useful when behavior varies but the calling flow remains stable.

### Cross-question

**Strategy vs large if/else?**

Strategy can reduce growing conditional logic when variants are meaningful and likely to change independently.

But for trivial stable cases, a strategy hierarchy may be unnecessary.

---

## 8.3 Command

### Intent

Encapsulate a request as an object.

### Example

```text
Command
|
+-- CreateOrderCommand
+-- CancelOrderCommand
+-- RefundOrderCommand
```

Invoker:

```text
CommandBus / Button / Controller
    executes Command
```

### Useful when

- Requests need queuing.
- Requests need logging.
- Undo/redo behavior is needed.
- Request execution should be decoupled from request creation.

### Interview point

Command separates:

- Who asks for something.
- What request is represented.
- Who actually performs it.

---

# 9. Engineering Depth

## 9.1 Pattern Selection Is Problem-Driven

Do not start with:

> “Which pattern can I use?”

Start with:

> “What design problem do I have?”

Then choose a pattern only if it fits.

---

## 9.2 Patterns Can Combine

Example:

- Factory creates Strategy implementations.
- Facade hides several services.
- Decorator adds logging around a service.
- Observer publishes state changes.

Multiple patterns can coexist, but avoid combining patterns unnecessarily.

---

## 9.3 Pattern Misuse

Patterns create structure, but also add:

- Classes
- Interfaces
- Indirection
- Learning cost
- Debugging complexity

Use them where they reduce larger complexity.

---

# 10. Pattern Comparison Matrix

| Pattern | Main Problem |
|---|---|
| Singleton | One controlled shared instance |
| Factory | Encapsulate creation / choose implementation |
| Builder | Construct complex object step by step |
| Adapter | Make incompatible interfaces work together |
| Facade | Simplify access to complex subsystem |
| Decorator | Add behavior dynamically |
| Observer | Notify dependent objects of changes |
| Strategy | Swap algorithms/behaviors |
| Command | Encapsulate a request |

---

# 11. Common Mistakes / Red Flags

## Mistake 1 — Memorizing definition only

Interviewers usually ask:

- Why?
- When?
- When not?
- Trade-offs?
- Alternative?

---

## Mistake 2 — Pattern everywhere

Pattern use without a real problem creates unnecessary complexity.

---

## Mistake 3 — Singleton as global variable replacement

This can create hidden dependencies.

---

## Mistake 4 — Factory for every `new`

Factory is useful when creation logic or implementation selection matters.

---

## Mistake 5 — Adapter vs Facade confusion

**Adapter:** compatibility.

**Facade:** simplification.

---

## Mistake 6 — Strategy vs Command confusion

**Strategy:** interchangeable algorithm.

**Command:** encapsulated request.

---

## Mistake 7 — Decorator vs Facade confusion

**Decorator:** adds behavior while preserving interface.

**Facade:** provides simplified subsystem interface.

---

# 12. Practical Sample Application

The source asks to implement common patterns in a sample application.

Use an **Online Ordering System**.

---

## 12.1 Factory

Create payment processor:

```text
PaymentProcessorFactory
|
+-- Card
+-- UPI
+-- Wallet
```

---

## 12.2 Strategy

Checkout selects discount logic:

```text
DiscountStrategy
|
+-- RegularDiscount
+-- PremiumDiscount
+-- FestivalDiscount
```

---

## 12.3 Observer

Order status update notifies:

```text
Order
|
+-- CustomerNotification
+-- Analytics
+-- InventoryUpdate
```

---

## 12.4 Facade

```text
CheckoutFacade
|
+-- Inventory
+-- Payment
+-- Order
+-- Notification
```

---

## 12.5 Adapter

Integrate legacy shipping provider:

```text
ShippingService
    ship()

LegacyCourier
    dispatch()

CourierAdapter
    ship() -> dispatch()
```

---

## 12.6 Decorator

Add behavior around notification:

```text
Notifier
|
+-- EmailNotifier
     |
     +-- LoggingDecorator
     +-- RetryDecorator
```

---

## 12.7 Command

Represent actions:

```text
PlaceOrderCommand
CancelOrderCommand
RefundOrderCommand
```

---

## 12.8 Builder

Build order request:

```text
OrderBuilder
|
+-- customer()
+-- address()
+-- items()
+-- coupon()
+-- notes()
+-- build()
```

---

# 13. Interview Questions

## Q1 — What is a design pattern?

A reusable design structure for a recurring problem, not reusable finished code.

---

## Q2 — Singleton use case?

Use when exactly one controlled shared instance is genuinely required.

Also discuss risks.

---

## Q3 — Factory vs Builder?

Factory chooses/creates an implementation.

Builder constructs a complex object step by step.

---

## Q4 — Adapter vs Facade?

Adapter makes incompatible interfaces compatible.

Facade simplifies access to a complex subsystem.

---

## Q5 — Decorator vs inheritance?

Decorator uses composition to add behavior dynamically.

Inheritance uses a static class hierarchy.

---

## Q6 — Observer vs event-driven architecture?

Observer is a design pattern for notification relationships, often within an application or process.

Event-driven architecture is a broader architectural style.

Do not treat them as identical.

---

## Q7 — Strategy vs Command?

Strategy encapsulates interchangeable behavior.

Command encapsulates a request/action.

---

## Q8 — When would you avoid patterns?

When the problem is too simple and the pattern adds more complexity than it removes.

---

# 14. Scenario Questions

## Scenario 1

A payment module supports Card and UPI. New payment methods are added frequently.

Likely candidate:

**Strategy**, possibly with **Factory** for creation.

---

## Scenario 2

A third-party shipping SDK has an interface incompatible with your application.

Pattern:

**Adapter**

---

## Scenario 3

A subsystem requires five service calls, but clients should use one simple interface.

Pattern:

**Facade**

---

## Scenario 4

You need to add logging and retry behavior around an existing service without modifying it.

Pattern:

**Decorator**

---

## Scenario 5

Many components need to react when order status changes.

Pattern:

**Observer**

---

## Scenario 6

You need requests that can be queued, logged, or retried.

Pattern:

**Command**

---

## Scenario 7

A complex configuration object has fifteen optional parameters.

Pattern:

**Builder**

---

## Scenario 8

Exactly one shared configuration manager is required.

Possible pattern:

**Singleton**

But explain why one instance is truly required.

---

# 15. Cross-Question Survival

## Cross-Q1
**Why not just use if/else instead of Strategy?**

If variants are few and stable, if/else may be simpler.

Strategy becomes more valuable when behaviors grow, vary independently, or require extension.

---

## Cross-Q2
**Can Factory and Strategy work together?**

Yes.

Factory may create the appropriate Strategy implementation.

---

## Cross-Q3
**Does Facade prevent direct subsystem access?**

Not necessarily.

A facade provides a simpler interface; subsystem access can still exist if design allows it.

---

## Cross-Q4
**Is Observer synchronous or asynchronous?**

The pattern itself does not require one execution model.

Implementation can vary.

---

## Cross-Q5
**Why is Decorator useful compared with subclassing?**

It supports flexible runtime composition and avoids creating many subclasses for combinations of behavior.

---

## Cross-Q6
**When is Builder unnecessary?**

When object construction is simple and constructor/factory usage is already clear.

---

## Cross-Q7
**Can Singleton violate SOLID?**

It can contribute to tight coupling or hidden dependencies if globally accessed. Whether it creates a design problem depends on implementation and context.

---

# 16. Pattern Identification Drill

Identify the likely pattern:

1. Convert incompatible interface → **Adapter**
2. Simplify complicated subsystem → **Facade**
3. Add behavior through wrapping → **Decorator**
4. Notify dependents → **Observer**
5. Swap algorithm → **Strategy**
6. Package request → **Command**
7. Step-by-step object creation → **Builder**
8. Centralized implementation creation → **Factory**
9. Single controlled instance → **Singleton**

---

# 17. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- Singleton
- Factory
- Builder
- Adapter
- Facade
- Decorator
- Observer
- Strategy
- Command

For every answer use:

**Problem → Pattern idea → Example → Trade-off**

---

# 18. Rapid Revision

## Creational

**Singleton** — one controlled instance  
**Factory** — encapsulate creation  
**Builder** — step-by-step construction

## Structural

**Adapter** — compatibility  
**Facade** — simplification  
**Decorator** — dynamic behavior addition

## Behavioral

**Observer** — notification  
**Strategy** — interchangeable algorithm  
**Command** — request as object

## Golden Rule

> Use the pattern because the design problem exists, not because you want to demonstrate pattern knowledge.

---

# 19. Self-Practice

Answer aloud:

1. What is a design pattern?
2. Singleton benefits and risks?
3. Factory vs Builder?
4. Adapter vs Facade?
5. Decorator vs inheritance?
6. Observer use case?
7. Strategy use case?
8. Command use case?
9. Strategy vs Command?
10. When would you avoid Factory?
11. When would you avoid Builder?
12. When can Singleton become harmful?
13. Can multiple patterns work together?
14. Which pattern fits legacy integration?
15. Which pattern fits multiple payment algorithms?
16. Which pattern fits dynamic logging/retry wrapping?
17. Which pattern fits order-state notifications?
18. Which pattern fits request queuing?
19. Which pattern fits complicated subsystem access?
20. Which pattern fits complex object construction?

---

# 20. P04 Readiness Gate

Do **not** mark P04 complete unless you can:

- [ ] Explain all nine source patterns in your own words.
- [ ] Classify each as Creational, Structural, or Behavioral.
- [ ] Explain the problem each pattern solves.
- [ ] Give one practical example for each.
- [ ] Explain at least one drawback/trade-off for each.
- [ ] Compare Factory vs Builder.
- [ ] Compare Adapter vs Facade.
- [ ] Compare Decorator vs inheritance.
- [ ] Compare Strategy vs Command.
- [ ] Explain Observer clearly.
- [ ] Select an appropriate pattern from a scenario.
- [ ] Explain when a pattern is unnecessary.
- [ ] Apply multiple patterns to the supplied sample application.
- [ ] Handle at least five pattern cross-questions.

**Pass Condition:** You can identify the problem first, select a proportionate pattern, explain why it fits, discuss alternatives, and defend the trade-off.

---

# 21. Source Boundary

This pack is grounded in **Module 4 of the supplied Software Design & Architecture curriculum**, which contains:

### Creational
- Singleton
- Factory
- Builder

### Structural
- Adapter
- Facade
- Decorator

### Behavioral
- Observer
- Strategy
- Command

### Hands-on
- Implement common design patterns in a sample application

The examples, analogies, comparisons, scenario drills, interview questions, and readiness gate are interview-preparation aids built around these source-listed patterns.

---

## Status

**P04 — READY FOR STUDY & READINESS VALIDATION**

**Next after P04 gate:** P05 — Software Architecture Patterns