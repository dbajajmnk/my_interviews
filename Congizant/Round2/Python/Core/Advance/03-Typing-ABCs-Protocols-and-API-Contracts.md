# PY-02 / File 03 — Typing, ABCs, Protocols & API Contracts

**Priority:** P0  
**Suggested Time:** 50 minutes  
**GOJ Mapping:** M4 + selected M11

---

# 1. Objective

Master:

- type hints;
- runtime vs static typing distinction;
- generics awareness;
- `Optional` / unions;
- ABCs;
- abstract methods;
- protocols;
- structural typing;
- dependency contracts;
- interface design;
- practical typing trade-offs.

---

# 2. 5W+H

## What?

Python typing adds machine-readable contracts to dynamically typed code.

## Why?

It improves:

- IDE support;
- static checking;
- documentation;
- refactoring;
- integration contracts.

## Where?

Especially valuable in:

- large codebases;
- shared libraries;
- public APIs;
- service boundaries;
- complex domain models.

## When?

Use typing where it improves clarity and safety; do not turn annotations into noise.

## How?

Through annotations, type checkers, ABCs, protocols, and explicit contracts.

---

# 3. Real-Life Analogy

Type hints are like labels on electrical sockets.

The socket still physically exists at runtime, but the label helps engineers connect the right things before power is switched on.

---

# 4. Visualization

```text
Python Source
│
├── Runtime
│   └── dynamic objects
│
└── Static Analysis
    ├── type hints
    ├── IDE
    └── type checker
```

---

# 5. Mind Map

```text
Contracts
│
├── Type Hints
│   ├── unions
│   ├── optional
│   └── generics
│
├── ABC
│   └── nominal contract
│
└── Protocol
    └── structural contract
```

---

# 6. Core Concepts

## 6.1 Type Hints

```python
def greet(name: str) -> str:
    return f"Hello {name}"
```

Important:

> Python does not automatically enforce all type annotations at runtime.

They primarily support tooling and contracts.

---

## 6.2 Union / Optional

Modern form:

```python
def find_user(user_id: int) -> dict | None:
    ...
```

Conceptually:

> returns dictionary or `None`.

---

## 6.3 Collection Types

```python
def total(values: list[int]) -> int:
    return sum(values)
```

For more abstract contracts, prefer interfaces such as iterable/sequence when appropriate rather than demanding a concrete list.

---

## 6.4 Abstract Base Class

```python
from abc import ABC, abstractmethod

class Repository(ABC):
    @abstractmethod
    def save(self, entity):
        ...
```

Provides an explicit nominal contract.

---

## 6.5 Protocol

```python
from typing import Protocol

class Saver(Protocol):
    def save(self, entity) -> None:
        ...
```

A compatible object can satisfy the protocol structurally.

This fits Python's duck-typing philosophy.

---

## 6.6 ABC vs Protocol

ABC:

- explicit inheritance;
- nominal relationship;
- runtime abstract-method behavior.

Protocol:

- structural typing;
- implementation need not inherit from protocol;
- useful for decoupled contracts.

---

# 7. Engineering Depth

## 7.1 Concrete Type vs Abstract Capability

Rigid:

```python
def process(items: list[str]) -> None:
    ...
```

If the function only iterates, an iterable-style contract may be better.

Design principle:

> Depend on the behavior you need, not unnecessarily on a concrete container.

---

## 7.2 Type Hints Do Not Replace Validation

External data from:

- APIs;
- files;
- users;
- message queues;

still needs runtime validation.

Typing helps developers. Validation protects runtime boundaries.

---

## 7.3 Protocol and Dependency Inversion

A service can depend on a small capability:

```python
class UserLoader(Protocol):
    def load(self, user_id: int) -> "User":
        ...
```

This enables easy fakes in tests and multiple implementations without deep inheritance.

---

# 8. Implementation / Code

```python
from typing import Protocol

class Cache(Protocol):
    def get(self, key: str) -> str | None:
        ...

    def set(self, key: str, value: str) -> None:
        ...

class UserService:
    def __init__(self, cache: Cache):
        self.cache = cache
```

---

# 9. Hands-On Practice

## Practice 1

Add useful type hints to:

```python
def find(ids, loader):
    ...
```

Do not over-specify concrete implementations.

## Practice 2

Create a `Notifier` protocol.

## Practice 3

Explain why runtime validation is still required for JSON request payloads.

---

# 10. Google Interview Drill

## Problem — Pluggable Storage Contract

Need to support:

- file storage;
- cloud storage;
- in-memory fake for tests.

### Clarify

What behavior does service actually need?

Suppose:

```text
save(key, data)
load(key)
```

### First Approach

Check concrete types:

```python
if isinstance(storage, FileStorage):
    ...
```

Rigid and closed.

### Improve

Define a protocol:

```python
class Storage(Protocol):
    def save(self, key: str, data: bytes) -> None:
        ...

    def load(self, key: str) -> bytes:
        ...
```

Service depends on capability.

### Test

Provide an in-memory implementation.

### Trade-Off

Do not create a large interface with methods every implementation does not need.

### Follow-Up

- async storage?
- retries?
- streaming?
- versioning?
- observability?
- cloud provider differences?

---

# 11. Common Mistakes

1. Claiming hints are runtime enforcement.
2. Over-annotating trivial internals.
3. Using `Any` everywhere.
4. Depending on concrete types unnecessarily.
5. Building giant interfaces.
6. Using ABC when protocol/duck typing is enough.
7. Treating type hints as input validation.

---

# 12. Best Practices

- type public boundaries;
- prefer narrow contracts;
- use structural typing when appropriate;
- validate external input at runtime;
- avoid unnecessary `Any`;
- keep annotations readable.

---

# 13. Interview Questions

1. Are Python type hints enforced at runtime?
2. Why use typing in dynamic Python?
3. ABC vs Protocol?
4. Nominal vs structural typing?
5. Duck typing vs protocol?
6. Type hints vs validation?
7. Why prefer abstract capabilities over concrete lists/classes?
8. How does typing help large teams?

---

# 14. Google-Level Follow-Ups

1. How would you type an async storage API?
2. What if cloud storage returns streams?
3. What if different providers expose inconsistent behavior?
4. Where should retries live?
5. Should interface include metrics?
6. How do you prevent interface bloat?
7. How would you migrate an untyped codebase incrementally?

---

# 15. Quick Revision

```text
Hints = contracts/tooling
Runtime remains dynamic
Type hints ≠ validation
ABC = nominal abstraction
Protocol = structural contract
Depend on capability, not concrete type
Narrow contracts improve substitution/testing
```

---

# 16. Readiness Gate

- [ ] Explain type-hint role.
- [ ] Explain runtime validation distinction.
- [ ] Explain ABC.
- [ ] Explain Protocol.
- [ ] Choose ABC vs Protocol.
- [ ] Design narrow storage contract.
- [ ] Defend type choices.

**Gate:** READY / REPAIR

---

# 17. References

- Python `typing`
- PEP 484
- PEP 544
- Python `abc`
