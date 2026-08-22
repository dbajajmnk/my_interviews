# PY-02 / File 01 — Python OOP, Object Model & Composition

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** M4 OOP / Design Model

---

# 1. Objective

After this file, you should be able to explain and defend:

- classes vs instances;
- instance attributes vs class attributes;
- `self`, `cls`, instance/class/static methods;
- encapsulation conventions;
- inheritance and overriding;
- MRO and `super()`;
- composition vs inheritance;
- abstraction;
- dataclasses;
- method resolution problems;
- architect-level object-design choices.

---

# 2. 5W+H

## What?

OOP organizes state and behavior around objects and relationships.

## Why?

It can improve cohesion, encapsulation, extensibility, and testability when the domain genuinely benefits from object modeling.

## Where?

- domain models;
- services;
- adapters;
- framework components;
- plugins;
- policies;
- orchestration objects.

## When?

Use OOP when state and behavior belong together and explicit object collaboration improves clarity.

## Who?

Backend engineers, library authors, framework developers, architects.

## How?

Through classes, instances, methods, composition, inheritance, protocols, and controlled dependencies.

---

# 3. Real-Life Analogy

A class is a **design specification**; an object is a **real instance built from that specification**.

```text
Class: PaymentProcessor
        │
        ├── process()
        ├── refund()
        └── configuration
               │
               ▼
      Actual Processor Object
```

But architecture is not about creating classes for everything.

Sometimes a plain function is better.

---

# 4. Visualization

```text
Object Design
│
├── State
│   └── attributes
│
├── Behavior
│   └── methods
│
├── Relationships
│   ├── Composition
│   └── Inheritance
│
└── Contracts
    ├── ABC
    └── Protocol
```

---

# 5. Mind Map

```text
Python OOP
│
├── Class / Instance
├── self / cls
├── Instance / Class Attributes
├── Instance / Class / Static Methods
├── Encapsulation
├── Inheritance
│   ├── overriding
│   ├── MRO
│   └── super()
├── Composition
├── Abstraction
└── Dataclasses
```

---

# 6. Core Concepts

## 6.1 Class vs Instance

```python
class User:
    role = "USER"

    def __init__(self, name):
        self.name = name
```

`role` is a class attribute.

`name` is normally an instance attribute.

```python
a = User("A")
b = User("B")
```

Each instance has its own `name`.

---

## 6.2 `self`

`self` is the conventional name for the instance receiving an instance method call.

```python
class Account:
    def close(self):
        self.closed = True
```

Python passes the instance explicitly to the method.

---

## 6.3 Instance vs Class Attribute Trap

```python
class Team:
    members = []

    def add(self, name):
        self.members.append(name)
```

All instances can share the same class-level list.

This can become an accidental shared-state bug.

Prefer instance state:

```python
class Team:
    def __init__(self):
        self.members = []
```

---

## 6.4 Instance Method

```python
class Service:
    def execute(self):
        return "done"
```

Operates on an instance.

---

## 6.5 Class Method

```python
class User:
    def __init__(self, name):
        self.name = name

    @classmethod
    def guest(cls):
        return cls("Guest")
```

Useful for alternate constructors and class-level behavior.

---

## 6.6 Static Method

```python
class Validator:
    @staticmethod
    def valid_email(value):
        return "@" in value
```

No `self` or `cls`.

### Senior Question

Should this necessarily be a static method?

Not always. A module-level function may be simpler.

---

## 6.7 Encapsulation in Python

Python primarily uses conventions rather than strict private-access enforcement.

```python
class Account:
    def __init__(self):
        self._balance = 0
```

Single underscore:

> internal-use convention

Double underscore invokes name mangling:

```python
self.__secret
```

Do not confuse name mangling with true security.

---

## 6.8 Inheritance

```python
class Storage:
    def save(self, data):
        raise NotImplementedError

class FileStorage(Storage):
    def save(self, data):
        ...
```

Inheritance models an **is-a** relationship.

But inheritance creates coupling.

---

## 6.9 Composition

```python
class OrderService:
    def __init__(self, repository):
        self.repository = repository

    def create(self, order):
        self.repository.save(order)
```

Composition models a **has-a / uses-a** relationship.

### Architect Rule

> Prefer composition when behavior can be assembled without forcing a fragile class hierarchy.

---

## 6.10 MRO

Python uses a Method Resolution Order to decide where to look for methods in inheritance hierarchies.

```python
class A:
    pass

class B(A):
    pass

class C(A):
    pass

class D(B, C):
    pass

print(D.mro())
```

The exact order follows Python's C3 linearization.

### Interview Point

You should know what MRO solves:

- deterministic lookup;
- multiple inheritance ordering;
- cooperative `super()` behavior.

---

## 6.11 `super()`

`super()` delegates according to the MRO rather than simply meaning “call my parent.”

That distinction matters in multiple inheritance.

---

## 6.12 Abstraction

Use abstraction to express stable contracts and hide unnecessary implementation details.

Possible tools:

- plain duck typing;
- ABCs;
- protocols;
- composition;
- explicit interfaces through documentation/types.

Do not create abstract layers without a real variability point.

---

## 6.13 Dataclasses

```python
from dataclasses import dataclass

@dataclass
class User:
    id: int
    name: str
```

Automatically provides useful generated methods such as initialization and representation.

Useful for data-centric objects.

### Not Automatically Appropriate For

- behavior-heavy domain services;
- objects with complex lifecycle;
- entities needing custom invariants that are hidden by simplistic generated initialization.

---

# 7. Engineering Depth

## 7.1 Composition vs Inheritance

Ask:

- Is the relationship really “is-a”?
- Is substitution safe?
- Will base-class changes affect many children?
- Do behaviors need independent variation?
- Can dependency injection simplify testing?

### Strong Answer

> I prefer composition by default for changeable behaviors and use inheritance when there is a genuine stable subtype relationship.

---

## 7.2 Multiple Inheritance

Python supports it, but use carefully.

Reasonable use cases can include:

- mixins;
- cooperative framework behavior.

Risks:

- MRO complexity;
- hidden coupling;
- constructor interactions;
- readability.

---

## 7.3 Class vs Function

Do not create a class merely to hold one stateless operation.

Bad:

```python
class MathHelper:
    def add(self, a, b):
        return a + b
```

Simpler:

```python
def add(a, b):
    return a + b
```

KIS is an architectural skill.

---

# 8. Implementation / Code

## Composition Example

```python
class PaymentGateway:
    def charge(self, amount):
        raise NotImplementedError

class OrderService:
    def __init__(self, gateway):
        self.gateway = gateway

    def checkout(self, amount):
        return self.gateway.charge(amount)
```

The service depends on behavior, not a specific concrete gateway.

---

# 9. Hands-On Practice

## Practice 1

Find the bug:

```python
class RequestTracker:
    requests = []

    def add(self, request_id):
        self.requests.append(request_id)
```

Answer:

`requests` is shared across instances.

---

## Practice 2

Refactor an inheritance-heavy design:

```python
class EmailOrderService(OrderService):
    ...

class SmsOrderService(OrderService):
    ...
```

If the only difference is notification mechanism, prefer composition:

```text
OrderService
   │
   └── NotificationStrategy
```

---

# 10. Google Interview Drill

## Problem — Extensible Notification Design

Design a system supporting:

- email;
- SMS;
- push notification.

### Clarify

Ask:

- same payload?
- multiple channels at once?
- retry behavior?
- failure isolation?
- runtime extensibility?

### First Approach

Large conditional:

```python
def notify(channel, message):
    if channel == "email":
        ...
    elif channel == "sms":
        ...
```

### Improve

Use composition:

```python
class Notifier:
    def send(self, message):
        raise NotImplementedError

class EmailNotifier(Notifier):
    def send(self, message):
        ...

class NotificationService:
    def __init__(self, notifier):
        self.notifier = notifier
```

### Test

- each notifier independently;
- service with fake notifier;
- unsupported/failing notifier.

### Edge Cases

- partial failures;
- retry;
- rate limits;
- timeouts.

### Trade-Off

Do not introduce a class hierarchy if only two simple functions are needed.

### Follow-Up

At scale:

- queue?
- retry policy?
- idempotency?
- observability?
- provider failover?

### Goal

> OOP → composition → testability → distributed design.

---

# 11. Common Mistakes

1. Class attributes for per-instance mutable state.
2. Inheritance for code reuse only.
3. Overusing multiple inheritance.
4. Misunderstanding `super()`.
5. Treating underscores as security.
6. Creating classes for stateless helpers.
7. Using dataclass for every object.
8. Over-abstracting stable code.

---

# 12. Best Practices

- favor cohesive objects;
- prefer composition for variable behavior;
- keep inheritance shallow;
- use ABC/protocol only when contract value is real;
- avoid hidden shared state;
- keep constructors simple;
- use dataclasses for data-centric models;
- choose functions when objects add no value.

---

# 13. Interview Questions

1. Class vs object?
2. Class attribute vs instance attribute?
3. `self` vs `cls`?
4. Instance vs class vs static method?
5. How does encapsulation work in Python?
6. Inheritance vs composition?
7. What is MRO?
8. What does `super()` really do?
9. Multiple inheritance risks?
10. Dataclass vs normal class?
11. When is a class unnecessary?

---

# 14. Google-Level Follow-Ups

From notification design:

1. Why composition?
2. Why not `if/elif`?
3. How would you add WhatsApp?
4. How would you test?
5. What if one provider fails?
6. How do retries work?
7. Is retry safe for duplicate sends?
8. How do you make it idempotent?
9. Where does queueing fit?
10. How do you monitor delivery?

---

# 15. Quick Revision

```text
Class = blueprint
Instance = runtime object
Class attr can be shared
Instance attr belongs to object
Inheritance = is-a
Composition = has-a / uses-a
Prefer composition for variable behavior
MRO = deterministic method lookup
super() follows MRO
Dataclass = data-centric convenience
Class is not mandatory for every behavior
```

---

# 16. Readiness Gate

- [ ] Explain class vs instance.
- [ ] Explain class-state trap.
- [ ] Explain method types.
- [ ] Explain inheritance vs composition.
- [ ] Explain MRO and `super()`.
- [ ] Explain multiple-inheritance risk.
- [ ] Explain dataclass use cases.
- [ ] Refactor inheritance to composition.
- [ ] Survive notification architecture follow-ups.

**Gate:** READY / REPAIR

---

# 17. References

- Python Data Model
- Python classes documentation
- Python `dataclasses` documentation
- Python MRO documentation
