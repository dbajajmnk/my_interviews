# PY-02 / File 04 — SOLID & Gang of Four in Python

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M5 Design Principles & Gang of Four Patterns

---

# 1. Objective

Be able to:

- explain SOLID in Python;
- recognize violations;
- refactor toward simpler designs;
- explain all GoF pattern categories;
- deeply defend the most relevant patterns for Python/backend architecture;
- identify Pythonic alternatives;
- avoid pattern-driven over-engineering.

---

# 2. 5W+H

## What?

SOLID provides design principles. GoF patterns name recurring design solutions.

## Why?

They create a shared vocabulary for maintainability and change.

## Where?

- service design;
- plugins;
- integrations;
- policies;
- adapters;
- object creation;
- workflow behavior.

## When?

Use when the problem and change pressure justify the abstraction.

## How?

Start from the design problem, not the pattern name.

---

# 3. Real-Life Analogy

Patterns are like tools in a toolbox.

A hammer is useful when there is a nail.

Carrying a hammer does not mean every problem is a nail.

---

# 4. Visualization

```text
Design Problem
     ↓
Change Axis
     ↓
Simplest Design
     ↓
Need Reusable Structure?
   ┌─────┴─────┐
   No          Yes
   │            │
Keep Simple   Consider Pattern
```

---

# 5. Mind Map

```text
Design
│
├── SOLID
│   ├── SRP
│   ├── OCP
│   ├── LSP
│   ├── ISP
│   └── DIP
│
└── GoF
    ├── Creational
    ├── Structural
    └── Behavioral
```

---

# 6. SOLID

## 6.1 SRP — Single Responsibility Principle

A module/class should have one primary reason to change.

Bad:

```python
class UserService:
    def create_user(self):
        ...
    def send_email(self):
        ...
    def generate_pdf(self):
        ...
    def save_to_database(self):
        ...
```

Separate cohesive responsibilities where change pressure is independent.

SRP does **not** mean one method per class.

---

## 6.2 OCP — Open/Closed Principle

Software should allow extension without repeatedly modifying stable core logic.

Bad:

```python
if payment_type == "card":
    ...
elif payment_type == "paypal":
    ...
elif payment_type == "bank":
    ...
```

If providers change frequently, introduce a strategy/provider abstraction.

But for two stable cases, conditionals may be perfectly fine.

---

## 6.3 LSP — Liskov Substitution Principle

A subtype should honor expectations of its abstraction.

If a subclass unexpectedly breaks valid base-class behavior, substitution fails.

Classic warning:

> inheritance merely for reuse can violate semantics.

---

## 6.4 ISP — Interface Segregation Principle

Clients should not depend on methods they do not need.

Avoid:

```text
MegaRepository
├── save
├── load
├── export_pdf
├── send_email
├── cache
└── archive
```

Prefer focused contracts.

Protocols are useful here.

---

## 6.5 DIP — Dependency Inversion Principle

High-level policy should depend on abstractions/capabilities, not hard-coded infrastructure.

```python
class OrderService:
    def __init__(self, repository):
        self.repository = repository
```

Instead of creating database clients inside business logic.

---

# 7. GoF Categories

## Creational

1. Singleton
2. Factory Method
3. Abstract Factory
4. Builder
5. Prototype

## Structural

6. Adapter
7. Bridge
8. Composite
9. Decorator
10. Facade
11. Flyweight
12. Proxy

## Behavioral

13. Chain of Responsibility
14. Command
15. Interpreter
16. Iterator
17. Mediator
18. Memento
19. Observer
20. State
21. Strategy
22. Template Method
23. Visitor

---

# 8. High-Value Patterns for This Interview

## 8.1 Strategy

Problem:

> algorithm/behavior varies independently.

Python:

```python
class PricingStrategy:
    def calculate(self, amount):
        raise NotImplementedError
```

But Python can often use a function directly:

```python
def checkout(amount, pricing_strategy):
    return pricing_strategy(amount)
```

### Pythonic Lesson

First-class functions can replace ceremony.

---

## 8.2 Factory Method

Useful when creation logic varies or concrete choice should be centralized.

```python
def create_storage(kind):
    if kind == "s3":
        return S3Storage()
    if kind == "file":
        return FileStorage()
    raise ValueError(kind)
```

Do not create a complex class-based factory unless needed.

---

## 8.3 Adapter

Problem:

> incompatible external API.

```python
class LegacyPaymentAdapter:
    def __init__(self, legacy):
        self.legacy = legacy

    def charge(self, amount):
        return self.legacy.make_payment(total=amount)
```

Very relevant for integration architecture.

---

## 8.4 Decorator Pattern

Adds behavior without modifying core component.

Python's function decorators are language-level mechanisms related in spirit but not identical to every object-oriented Decorator-pattern use case.

---

## 8.5 Facade

Provides a simplified entry point over complex subsystems.

Useful for:

- AI orchestration;
- external SDK complexity;
- legacy integrations.

---

## 8.6 Proxy

Controls access to another object.

Examples:

- lazy loading;
- access control;
- remote proxy;
- caching.

---

## 8.7 Observer

Publish/subscribe relationship.

Python options can include:

- callbacks;
- event dispatchers;
- messaging infrastructure for distributed cases.

Do not confuse in-process Observer with distributed event architecture.

---

## 8.8 State

Behavior changes according to state.

Useful when state transitions are explicit and complex.

Do not replace a simple enum + condition unnecessarily.

---

## 8.9 Command

Encapsulates an action/request as an object.

Useful for:

- queues;
- undo;
- audit;
- workflow orchestration.

---

## 8.10 Chain of Responsibility

Pass request through handlers until handled or chain completes.

Examples:

- middleware;
- validation pipeline;
- authentication pipeline.

---

# 9. Pythonic Alternatives

Python features can reduce classical pattern ceremony:

| Classical Need | Pythonic Option |
|---|---|
| Strategy | first-class function / callable |
| Iterator | generator |
| Singleton | module-level object / dependency lifecycle |
| Decorator | `@decorator` |
| Factory | function / mapping |
| Command | callable / function / dataclass command |
| Adapter | small wrapper |
| Template Method | composition / higher-order function |

### Senior Rule

> Know the pattern intent. Implement only the structure Python actually needs.

---

# 10. Engineering Depth

## Singleton

Do not say:

> Singleton is best for database connection.

Problems:

- global state;
- hidden dependency;
- testing;
- concurrency/lifecycle;
- multi-process reality.

Prefer explicit application-scoped dependency management.

---

## Design Pattern Decision Flow

```text
What changes?
   ↓
Can simple function/conditional solve it?
   ↓
Will this axis keep changing?
   ↓
Does abstraction reduce coupling?
   ↓
Use smallest sufficient pattern
```

---

# 11. Implementation / Code

## Strategy with Callable

```python
from collections.abc import Callable

def percentage_discount(rate: float):
    def apply(amount: float) -> float:
        return amount * (1 - rate)
    return apply

def checkout(amount: float, discount: Callable[[float], float]) -> float:
    return discount(amount)
```

No strategy-class hierarchy needed.

---

# 12. Hands-On Practice

## Practice 1

Identify SOLID violation:

```python
class ReportService:
    def load_data(self):
        ...
    def calculate(self):
        ...
    def render_pdf(self):
        ...
    def email(self):
        ...
```

Discuss change reasons rather than mechanically splitting classes.

## Practice 2

Choose pattern:

> Integrate third-party API exposing incompatible method names.

Answer:

> Adapter.

## Practice 3

Choose pattern:

> Runtime-selectable pricing algorithm.

Answer:

> Strategy, possibly represented by a callable.

## Practice 4

Question:

> Need one global database connection.

Do not jump to Singleton. Discuss application lifecycle and connection pool.

---

# 13. Google Interview Drill

## Problem — Multiple AI Providers

Support:

- OpenAI;
- Azure OpenAI;
- another future provider.

Need:

```text
generate(prompt) → response
```

### Clarify

- streaming?
- model selection?
- retries?
- provider-specific parameters?
- fallback?
- rate limits?

### First Approach

```python
if provider == "openai":
    ...
elif provider == "azure":
    ...
```

Fine initially.

### Change Pressure

If providers and policies expand, define a narrow provider abstraction.

Possible patterns:

- Adapter for provider SDK differences;
- Strategy for provider selection/routing;
- Factory for provider construction;
- Facade for simplified AI service entry point.

### Do Not Overengineer

Three patterns do not automatically require three class layers.

### Test

Use fake provider.

### Edge Cases

- timeout;
- quota;
- malformed response;
- streaming interrupted;
- provider outage.

### Follow-Up

- circuit breaker;
- retry;
- fallback;
- observability;
- token cost;
- data residency;
- security;
- provider abstraction.

### Goal

> Pattern intent → minimal Python design → production AI architecture.

---

# 14. Common Mistakes

1. Memorizing definitions without problem context.
2. Applying patterns everywhere.
3. Java-style class explosion.
4. Singleton for global state.
5. Deep inheritance for reuse.
6. Giant interfaces.
7. Calling every conditional an OCP violation.
8. Confusing Observer with distributed messaging.
9. Confusing Python decorator syntax with all Decorator-pattern cases.
10. Naming a pattern without trade-offs.

---

# 15. Best Practices

- start with problem;
- identify change axis;
- prefer simplest sufficient design;
- use composition;
- exploit first-class functions;
- use protocols for narrow contracts;
- test abstractions;
- remove abstraction if it adds no value.

---

# 16. Interview Questions

1. Explain SOLID in Python.
2. SRP vs “one method per class”?
3. OCP and when not to apply it?
4. LSP example?
5. ISP in Python?
6. DIP with protocols?
7. Strategy in Python?
8. Factory function vs Factory Method?
9. Adapter?
10. Facade?
11. Proxy?
12. Observer?
13. State?
14. Command?
15. Chain of Responsibility?
16. Why Singleton is risky?
17. Which patterns Python makes simpler?

---

# 17. Google-Level Follow-Ups

For AI provider abstraction:

1. Why Adapter?
2. Why Strategy?
3. Where does Factory help?
4. Could functions be enough?
5. How handle async streaming?
6. How type provider contract?
7. How test provider failure?
8. How implement fallback?
9. How prevent vendor lock-in?
10. What metrics support routing decisions?

---

# 18. Quick Revision

```text
SOLID = principles, not rules
Pattern = named recurring solution
Start from problem
Prefer composition
Use Python first-class functions
Strategy can be callable
Factory can be function
Adapter wraps incompatible API
Facade simplifies subsystem
Proxy controls access
Observer ≠ automatically distributed events
Singleton often hides global state
Know intent, reduce ceremony
```

---

# 19. Readiness Gate

- [ ] Explain each SOLID principle.
- [ ] Identify violations without dogma.
- [ ] List all 23 GoF patterns by category.
- [ ] Deeply explain high-value patterns.
- [ ] Show Pythonic alternatives.
- [ ] Reject unnecessary Singleton.
- [ ] Design AI-provider abstraction.
- [ ] Defend minimalism.

**Gate:** READY / REPAIR

---

# 20. References

- Python Data Model
- Python `typing`
- Python `abc`
- Design Patterns — Gamma, Helm, Johnson, Vlissides
