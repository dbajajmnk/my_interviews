# PY-01 / File 01 — Python Language Foundations

**Priority:** P0  
**GOJ Mapping:** M1 Language Foundations + selected M2 concepts  
**Suggested Time:** 45 minutes  
**Target:** Architect-level Python foundation

---

# 1. Objective

After this file, you should be able to:

- explain how Python code is executed at a practical level;
- explain dynamic typing and strong typing;
- explain duck typing;
- explain Python's object-oriented runtime model;
- explain names and object binding;
- distinguish identity from equality;
- explain mutation vs rebinding;
- answer senior follow-ups without overcomplicating the explanation.

---

# 2. 5W+H

## What?

Python is a high-level, general-purpose programming language with dynamic typing, strong typing, automatic memory management, first-class functions, and a rich object model.

## Why?

Its productivity, readability, ecosystem, backend capabilities, automation strengths, and AI/data ecosystem make it widely used in modern full-stack and AI-enabled systems.

## Where?

Common uses:

- backend APIs
- automation
- AI/ML
- data processing
- scripting
- cloud tooling
- testing
- integration services

## When?

Use Python when engineering productivity, ecosystem, maintainability, and integration speed are important and its runtime characteristics fit the workload.

## Who?

Python is used by application engineers, backend engineers, data engineers, AI engineers, automation engineers, testers, architects, and platform teams.

## How?

Python source is parsed and compiled to bytecode, which is executed by the Python runtime. At application level, names are bound to objects and operations are resolved dynamically.

---

# 3. Real-Life Analogy

Think of a Python variable as a **name label attached to an object**.

```python
a = [10, 20]
b = a
```

```text
          ┌──────────────┐
a ───────►│   [10, 20]   │
          └──────────────┘
                 ▲
                 │
b ───────────────┘
```

If you mutate the object through `b`, `a` sees the same changed object.

```python
b.append(30)

print(a)
```

Output:

```text
[10, 20, 30]
```

But if you reassign `b`:

```python
b = [100]
```

then `b` simply points elsewhere.

### Mental Anchor

> **Mutation changes an object. Rebinding changes a name.**

---

# 4. Visualization

## Python Execution

```text
Python Source (.py)
       │
       ▼
Parser / Compiler
       │
       ▼
Bytecode
       │
       ▼
Python Runtime / VM
       │
       ▼
Objects in Memory
```

Deep runtime internals belong to PY-03.

For PY-01, know this practical statement:

> Python source is compiled into bytecode and executed by the Python runtime.

---

# 5. Mind Map

```text
Python Foundations
│
├── Execution
│   ├── Source
│   ├── Bytecode
│   └── Runtime
│
├── Typing
│   ├── Dynamic
│   ├── Strong
│   └── Duck Typing
│
├── Objects
│   ├── Names
│   ├── Binding
│   ├── Identity
│   └── Equality
│
└── Behavior
    ├── Mutation
    └── Rebinding
```

---

# 6. Core Concepts

## 6.1 Dynamic Typing

```python
value = 10
value = "Python"
value = {"role": "Architect"}
```

The name `value` can be rebound to objects of different types.

### Interview Answer

> Python is dynamically typed because type information belongs to runtime objects rather than fixed variable declarations.

---

## 6.2 Strong Typing

```python
"10" + 10
```

raises:

```text
TypeError
```

Python does not silently convert unrelated types just to make the operation succeed.

Correct:

```python
int("10") + 10
```

### Interview Answer

> Python is dynamically typed but strongly typed. Incompatible operations generally require explicit conversion.

---

## 6.3 Dynamic Does Not Mean Type-Free

This is a weak statement:

> Python has no types.

Correct:

> Python has types; they are checked dynamically at runtime.

Objects have types:

```python
type(10)
type("hello")
type([1, 2])
```

---

## 6.4 Duck Typing

Example:

```python
def show_length(value):
    print(len(value))

show_length("Python")
show_length([1, 2, 3])
show_length({"a": 1})
```

The function depends on supported behavior (`len`) rather than a single concrete class.

### Senior Interpretation

Duck typing is useful, but enterprise APIs still benefit from:

- explicit contracts;
- type hints;
- validation;
- tests;
- good documentation.

Dynamic flexibility should not create ambiguity.

---

## 6.5 Functions Are Objects

```python
def greet(name):
    return f"Hello {name}"

handler = greet

print(handler("Architect"))
```

Functions can be:

- assigned;
- passed;
- returned;
- stored.

This enables:

- callbacks;
- decorators;
- strategies;
- dependency injection approaches;
- functional composition.

Advanced treatment comes in PY-02.

---

## 6.6 Names and Binding

```python
x = [1, 2]
```

Conceptually:

```text
Name x ─────► List Object [1, 2]
```

Then:

```python
y = x
```

```text
x ─────┐
       ├────► [1, 2]
y ─────┘
```

No second list is automatically created.

---

## 6.7 Identity vs Equality

```python
a = [1, 2]
b = [1, 2]

print(a == b)
print(a is b)
```

Output:

```text
True
False
```

### `==`

Tests equality semantics.

### `is`

Tests object identity.

Use:

```python
value is None
```

For normal value comparison:

```python
status == "READY"
```

---

## 6.8 `id()`

```python
a = []
b = a

print(id(a) == id(b))
```

Returns `True`.

### Architect Rule

Do not build application logic around implementation-specific interning behavior of integers or strings.

Focus on language semantics.

---

## 6.9 Mutation

```python
items = [1, 2]
items.append(3)
```

The same list object changes.

---

## 6.10 Rebinding

```python
items = [1, 2]
items = [100]
```

The name `items` is rebound to another list.

The original object may still exist if something else refers to it.

---

# 7. Engineering Depth

## 7.1 Why the Name/Object Model Matters

It explains:

- shared mutable state;
- function parameter behavior;
- shallow copying;
- default argument bugs;
- closures;
- caching bugs;
- concurrent mutation;
- test contamination.

---

## 7.2 Example — Mutation vs Rebinding

```python
def update(items):
    items.append("A")
    items = ["B"]

data = []

update(data)

print(data)
```

Output:

```text
["A"]
```

Why?

- `append()` mutated the shared object.
- `items = ["B"]` only rebound the function-local name.

---

## 7.3 Architect-Level Extension

Suppose:

```python
settings = {"retry": 3}
```

and different requests mutate it.

Potential issues:

- shared request state;
- race conditions;
- unpredictable tests;
- hidden coupling;
- inconsistent worker state.

The Python object model is therefore not only an academic topic. It affects architecture and production reliability.

---

# 8. Implementation / Code

## Example 1 — Equality

```python
a = {"id": 1}
b = {"id": 1}

print(a == b)  # True
print(a is b)  # False
```

## Example 2 — Shared Object

```python
a = [1]
b = a

b.append(2)

print(a)  # [1, 2]
```

## Example 3 — Rebinding

```python
a = [1]
b = a

b = [99]

print(a)  # [1]
print(b)  # [99]
```

---

# 9. Hands-On Practice

## Practice 1

Predict:

```python
a = [1, 2]
b = a
b += [3]

print(a)
```

### Answer

```text
[1, 2, 3]
```

For a list, `+=` performs in-place extension semantics here, so the shared object changes.

---

## Practice 2

Predict:

```python
x = 10
y = x
x += 1

print(x)
print(y)
```

### Answer

```text
11
10
```

Integers are immutable; `x` is rebound to another integer object.

---

## Practice 3

Explain in 30 seconds:

> Why is `is` not a replacement for `==`?

### Target

> `is` checks identity, while `==` checks equality semantics. Two separate objects can be equal without being the same object.

---


# 10. Google Interview Drill

## Drill — Mutation vs Rebinding Under Interview Pressure

### Problem

What does this code print, and why?

```python
def update(data):
    data["status"] = "READY"
    data = {"status": "DONE"}
    return data

payload = {"status": "NEW"}
result = update(payload)

print(payload)
print(result)
```

### Step 1 — Clarify

State the two behaviors being tested:

- mutation of a shared mutable object;
- rebinding of a local parameter.

### Step 2 — First Reasoning

`data["status"] = "READY"` mutates the caller-visible dictionary.

`data = {"status": "DONE"}` only rebinds the local name.

### Step 3 — Expected Output

```text
{'status': 'READY'}
{'status': 'DONE'}
```

### Step 4 — Test Edge Case

What changes if `payload` is an immutable string instead of a dictionary?

You cannot mutate the string in place; operations create/rebind to new string objects.

### Step 5 — Complexity

Dictionary field update is expected O(1) average.

### Step 6 — Trade-Off

Do not confuse fast local mutation with safe shared-state design.

### Step 7 — Follow-Up

If this dictionary represents application-wide configuration:

- Is per-process memory sufficient?
- What happens with multiple workers?
- How is consistency maintained?
- Should configuration be immutable?
- Should configuration come from an external source?

### Interview Goal

> Move confidently from Python semantics to production-state reasoning.


# 10. Common Mistakes

1. Saying Python is weakly typed.
2. Saying Python has no types.
3. Saying assignment copies an object.
4. Using `is` for value comparison.
5. Confusing mutation with rebinding.
6. Depending on string/integer interning.
7. Giving a CPython-internals lecture when a simple language explanation is enough.

---

# 11. Best Practices

- Use `is None` for `None`.
- Use `==` for value equality.
- Be explicit about ownership of mutable objects.
- Avoid unnecessary shared mutable state.
- Prefer simple explanations first, then deeper internals only if asked.
- Separate language semantics from implementation details.

---

# 12. Interview Questions

1. Is Python dynamically typed?
2. Is Python strongly typed?
3. What is duck typing?
4. Are functions objects in Python?
5. What does assignment do?
6. What is the difference between `is` and `==`?
7. What is object identity?
8. Mutation vs rebinding?
9. Why can shared mutable state be dangerous?
10. How can Python's object model affect backend services?

---

# 13. Google-Level Follow-Ups

Start:

```python
config = {"timeout": 10}

def modify(c):
    c["timeout"] = 20
    c = {"timeout": 30}

modify(config)
print(config)
```

### L1
What prints?

```text
{"timeout": 20}
```

### L2
Why?

Mutation changed the shared dictionary; rebinding did not change the caller's binding.

### L3
What if multiple threads mutate the same dictionary?

Now concurrency and synchronization become relevant.

### L4
What if multiple API worker processes run?

Each process usually has separate memory.

### L5
What if configuration must be consistent across all instances?

Use an explicit external source/configuration mechanism rather than relying on per-process mutable memory.

---

# 14. Quick Revision

```text
Python = dynamic + strong typing
Names bind to objects
Assignment does not copy
== = equality
is = identity
Mutation changes object
Rebinding changes name
Duck typing = behavior-based usage
Functions are first-class objects
Local mutable state is not distributed state
```

---

# 15. Readiness Gate

- [ ] Explain dynamic typing.
- [ ] Explain strong typing.
- [ ] Explain duck typing.
- [ ] Explain names and object binding.
- [ ] Explain `is` vs `==`.
- [ ] Predict mutation vs rebinding.
- [ ] Explain why shared mutable state can become a production problem.
- [ ] Survive the five-level follow-up above without notes.

**Gate:** READY / REPAIR

---

# 16. References

- Python Language Reference
- Python Data Model
- Python Built-in Functions documentation
- Python FAQ
