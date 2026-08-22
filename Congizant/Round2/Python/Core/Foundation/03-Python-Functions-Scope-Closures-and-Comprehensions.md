# PY-01 / File 03 — Python Functions, Scope, Closures & Comprehensions

**Priority:** P0  
**GOJ Mapping:** M3 Functions, Scope & Core Constructs
**Suggested Time:** 75 minutes  

---

# 1. Objective

After this file, you should be able to:

- explain Python function parameter styles;
- use positional-only and keyword-only arguments;
- explain `*args` and `**kwargs`;
- explain argument unpacking;
- debug mutable default arguments;
- explain Python parameter passing precisely;
- explain LEGB;
- use `global` and `nonlocal` appropriately;
- explain closures and late binding;
- use comprehensions without damaging readability;
- review function/API contracts at architect level.

---

# 2. 5W+H

## What?

Functions encapsulate behavior and establish local scope. Python supports flexible parameter passing, closures, first-class functions, and compact collection construction.

## Why?

Function design influences:

- clarity;
- testability;
- reuse;
- contracts;
- typing;
- side effects;
- API evolution.

## Where?

Every backend service, AI pipeline, integration layer, utility library, and framework.

## When?

Use functions to create cohesive units of behavior with explicit inputs/outputs.

## Who?

All Python engineers; architects must also reason about public API contracts and hidden state.

## How?

Through parameter binding, local scope, lexical scope, callable objects, and runtime name resolution.

---

# 3. Real-Life Analogy

Think of a function as a service counter:

```text
Inputs
  ↓
Contract
  ↓
Processing
  ↓
Output
```

A well-designed counter clearly tells customers:

- what is required;
- what is optional;
- what format is accepted;
- what result to expect.

A function with uncontrolled `*args/**kwargs` is like a service counter saying:

> Give me anything; I will try to figure it out.

That flexibility can be useful internally, but it is a weak public contract when the inputs are actually known.

---

# 4. Visualization

```text
Caller
  │
  ├── positional args
  ├── keyword args
  └── objects
  ▼
Function Binding
  │
  ├── local scope
  ├── defaults
  ├── *args
  └── **kwargs
  ▼
Execution
  │
  ├── LEGB lookup
  ├── closure access
  └── side effects
  ▼
Return
```

---

# 5. Mind Map

```text
Functions
│
├── Parameters
│   ├── Positional-only
│   ├── Positional/keyword
│   ├── *args
│   ├── Keyword-only
│   └── **kwargs
│
├── Defaults
│   └── Definition-time evaluation
│
├── Passing
│   └── Call-by-sharing
│
├── Scope
│   ├── Local
│   ├── Enclosing
│   ├── Global
│   └── Built-in
│
├── Closures
│   └── Late binding
│
└── Comprehensions
    ├── list
    ├── set
    └── dict
```

---

# 6. Core Concepts

## 6.1 Positional / Keyword Parameters

```python
def add(a, b):
    return a + b
```

Valid:

```python
add(10, 20)
add(a=10, b=20)
```

---

## 6.2 Positional-Only Parameters

Use `/`.

```python
def divide(a, b, /):
    return a / b
```

Valid:

```python
divide(10, 2)
```

Invalid:

```python
divide(a=10, b=2)
```

### Why?

Useful when parameter names should not become part of the public calling contract.

---

## 6.3 Keyword-Only Parameters

Use `*`.

```python
def connect(host, *, timeout=30, secure=True):
    ...
```

Preferred:

```python
connect(
    "service.local",
    timeout=10,
    secure=True,
)
```

This is clearer than:

```python
connect("service.local", 10, True)
```

---

## 6.4 `*args`

```python
def total(*values):
    return sum(values)
```

`values` is a tuple.

Useful for:

- wrappers;
- forwarding;
- flexible internal functions.

Risk:

> Required contract becomes less visible if overused.

---

## 6.5 `**kwargs`

```python
def configure(**options):
    return options
```

`options` is a dictionary.

Useful for:

- wrappers;
- extensible adapters;
- forwarding options.

Risk:

- unclear required inputs;
- weak discoverability;
- harder static typing;
- harder validation;
- risky refactoring.

---

## 6.6 Argument Unpacking

```python
def add(a, b):
    return a + b

values = (10, 20)

print(add(*values))
```

Keyword unpacking:

```python
def connect(host, port):
    return f"{host}:{port}"

config = {
    "host": "localhost",
    "port": 8000,
}

print(connect(**config))
```

---

## 6.7 Default Arguments

Defaults are evaluated when the function definition executes.

Problem:

```python
def add(value, items=[]):
    items.append(value)
    return items
```

Calls:

```python
print(add(1))
print(add(2))
```

Output:

```text
[1]
[1, 2]
```

The same default list is reused.

---

## 6.8 Correct Mutable-Default Pattern

```python
def add(value, items=None):
    if items is None:
        items = []

    items.append(value)
    return items
```

Use:

```python
if items is None:
```

not automatically:

```python
if not items:
```

because empty input may be valid.

---

## 6.9 Sentinel Beyond `None`

If `None` is a valid business value:

```python
_NOT_SET = object()

def update(value=_NOT_SET):
    if value is _NOT_SET:
        print("not supplied")
```

This distinguishes:

- missing argument;
- explicit `None`.

---

## 6.10 Python Parameter Passing

Best interview phrasing:

> Python passes object references by value, commonly described as call-by-sharing. Parameters become local names bound to the same supplied objects. Mutation of a shared mutable object can be caller-visible, while rebinding the local parameter does not rebind the caller's name.

Mutation:

```python
def modify(items):
    items.append(10)

data = []
modify(data)

print(data)
```

Output:

```text
[10]
```

Rebinding:

```python
def replace(items):
    items = [100]

data = []
replace(data)

print(data)
```

Output:

```text
[]
```

---

# 7. Scope

## 7.1 LEGB

Python resolves unqualified names:

> **Local → Enclosing → Global → Built-in**

Example:

```python
x = "global"

def outer():
    x = "enclosing"

    def inner():
        x = "local"
        print(x)

    inner()

outer()
```

Output:

```text
local
```

---

## 7.2 `global`

```python
count = 0

def increment():
    global count
    count += 1
```

### Architect View

Global mutable state increases:

- coupling;
- test complexity;
- concurrency risk;
- hidden dependencies.

Know the feature; do not make it the default design.

---

## 7.3 `nonlocal`

```python
def counter():
    value = 0

    def increment():
        nonlocal value
        value += 1
        return value

    return increment
```

`nonlocal` targets a binding in the enclosing function scope.

---

# 8. Closures

## 8.1 Definition

A closure is a function that retains access to bindings from its enclosing lexical scope.

```python
def multiplier(factor):
    def multiply(value):
        return factor * value

    return multiply

double = multiplier(2)

print(double(5))
```

Output:

```text
10
```

---

## 8.2 Uses

- decorators;
- callbacks;
- function factories;
- configurable behavior;
- small encapsulated state.

---

## 8.3 Closure vs Class

Use a closure when behavior/state is small and naturally functional.

Use a class when:

- state is larger;
- multiple operations exist;
- lifecycle is complex;
- explicit object identity matters;
- protocols/interfaces/design need more structure.

---

# 9. Late Binding

Problem:

```python
functions = []

for i in range(3):
    functions.append(lambda: i)

print([fn() for fn in functions])
```

Likely output:

```text
[2, 2, 2]
```

Reason:

The closures refer to the same `i` binding.

Fix:

```python
functions = []

for i in range(3):
    functions.append(lambda i=i: i)
```

Now:

```text
[0, 1, 2]
```

---

# 10. Comprehensions

## List

```python
squares = [x * x for x in range(5)]
```

## Filter

```python
evens = [x for x in numbers if x % 2 == 0]
```

## Set

```python
lengths = {len(name) for name in names}
```

## Dict

```python
squares = {x: x * x for x in range(5)}
```

---

## 10.1 When Not to Use

If the logic becomes deeply nested or hard to debug, use a normal loop.

GOJ rule:

> **Readable code beats clever code.**

---

# 11. Engineering Depth

## 11.1 Public API Design

Weak:

```python
def create_user(*args, **kwargs):
    ...
```

Stronger:

```python
def create_user(
    name: str,
    email: str,
    *,
    active: bool = True,
):
    ...
```

Why stronger?

- discoverability;
- static tooling;
- validation;
- documentation;
- safer refactoring;
- explicit contract.

---

## 11.2 Mutable Default → Architecture Follow-Up

Start:

```python
def update(data, cache={}):
    cache.update(data)
    return cache
```

Fixing the default does not answer:

- is cache shared?
- thread-safe?
- process-safe?
- persistent?
- bounded?
- invalidated?
- monitored?

A language bug can lead directly to system-design questions.

---

# 12. Implementation / Code

## Keyword-Only API

```python
def create_report(
    report_type,
    *,
    include_header=True,
    compress=False,
    timeout=30,
):
    ...
```

## Closure

```python
def make_prefixer(prefix):
    def apply(value):
        return f"{prefix}{value}"

    return apply
```

## Safe Default

```python
def register(user, users=None):
    if users is None:
        users = []

    users.append(user)
    return users
```

---

# 13. Hands-On Practice

## Practice 1

Fix:

```python
def save(config={}):
    config["enabled"] = True
    return config
```

Answer:

```python
def save(config=None):
    if config is None:
        config = {}

    config["enabled"] = True
    return config
```

---

## Practice 2

Explain precisely:

> Is Python pass-by-value or pass-by-reference?

Target:

> Python uses call-by-sharing / object references passed by value.

---

## Practice 3

Fix:

```python
callbacks = []

for i in range(5):
    callbacks.append(lambda: i)
```

Answer:

```python
callbacks = []

for i in range(5):
    callbacks.append(lambda i=i: i)
```

---

## Practice 4

Review:

```python
def create_order(*args, **kwargs):
    ...
```

Discuss:

- hidden required fields;
- poor typing;
- weak validation;
- unclear contract;
- risky refactoring.

---


# 14. Google Interview Drill

## Drill — Design a Safe Retry Function

### Problem

Design a reusable function that retries an operation.

Starting API:

```python
def retry(operation, retries=3):
    ...
```

### Step 1 — Clarify

Ask:

- Which exceptions are retryable?
- Is backoff required?
- Should the operation be idempotent?
- Sync or async?
- What happens after final failure?
- Do we log each attempt?

### Step 2 — First Implementation

```python
def retry(operation, retries=3):
    last_error = None

    for _ in range(retries):
        try:
            return operation()
        except Exception as exc:
            last_error = exc

    raise last_error
```

### Step 3 — Review the Code

Problems:

- catches every exception;
- no delay/backoff;
- no jitter;
- no cancellation/timeout;
- retries may repeat non-idempotent side effects;
- observability is absent.

### Step 4 — Improve the Contract

```python
def retry(
    operation,
    *,
    retries=3,
    retryable_exceptions=(TimeoutError,),
):
    ...
```

Why keyword-only?

Because configuration is clearer and harder to misuse.

### Step 5 — Test

Test:

- success on first call;
- success after transient failure;
- non-retryable exception;
- all retries exhausted;
- retries=1;
- operation with side effects.

### Step 6 — Complexity

The wrapper itself is O(r) attempts, but real cost depends on the operation.

### Step 7 — Production Follow-Up

For distributed calls discuss:

- exponential backoff;
- jitter;
- timeout;
- circuit breaker;
- idempotency key;
- rate limiting;
- metrics;
- tracing.

### Interview Goal

> Function design → contract → testing → failure semantics → distributed resilience.


# 14. Common Mistakes

1. Saying defaults are evaluated on every call.
2. Using mutable defaults.
3. Saying Python is simply pass-by-reference.
4. Confusing `global` and `nonlocal`.
5. Using global mutable state casually.
6. Overusing `*args/**kwargs`.
7. Ignoring keyword-only parameters.
8. Misunderstanding late binding.
9. Replacing every loop with a comprehension.
10. Using `if not x` when specifically testing for `None`.

---

# 15. Best Practices

- Use explicit function contracts.
- Prefer keyword-only options when they improve readability.
- Avoid mutable defaults.
- Use sentinels intentionally.
- Minimize global mutable state.
- Keep closures small and understandable.
- Prefer readable comprehensions.
- Make side effects explicit.
- Type public interfaces where useful.

---

# 16. Interview Questions

1. What parameter types does Python support?
2. What is positional-only?
3. What is keyword-only?
4. `*args` vs `**kwargs`?
5. Why are mutable defaults dangerous?
6. When are default expressions evaluated?
7. How does Python pass function arguments?
8. What is LEGB?
9. `global` vs `nonlocal`?
10. What is a closure?
11. Explain late binding.
12. Closure vs class?
13. When does `**kwargs` create a poor API?
14. When should you avoid comprehensions?
15. What is a sentinel object?

---

# 17. Google-Level Follow-Up

Start:

```python
def update(data, cache={}):
    cache.update(data)
    return cache
```

### L1
What's wrong?

Shared mutable default.

### L2
Why?

Default object created once at function definition.

### L3
Fix it.

```python
def update(data, cache=None):
    if cache is None:
        cache = {}
    cache.update(data)
    return cache
```

### L4
Is it thread-safe?

Not automatically if the same mutable cache is shared concurrently.

### L5
What about multiple processes?

Each process may have separate memory.

### L6
Should persistent/shared state live here?

Usually ownership should be explicit.

### L7
How might Redis help?

Shared cross-instance cache, TTL, atomic operations.

### L8
What failures appear?

Timeouts, outages, stale data, stampede, hot keys.

### L9
What should be monitored?

Latency, hit ratio, errors, memory, evictions, saturation.

### L10
What does the architect define?

```text
ownership
→ consistency
→ cache pattern
→ TTL
→ fallback
→ observability
→ security
→ capacity
```

---

# 18. Quick Revision

```text
/ = positional-only
* = keyword-only boundary
*args = extra positional tuple
**kwargs = extra keyword dict
Defaults = evaluated at definition time
Mutable defaults = avoid
Parameter passing = call-by-sharing
LEGB = Local, Enclosing, Global, Built-in
global = module binding
nonlocal = enclosing function binding
Closure = function retaining enclosing bindings
Late binding = shared binding observed later
Comprehension = use only when readable
```

---

# 19. Readiness Gate

- [ ] Explain all parameter styles.
- [ ] Explain `*args/**kwargs`.
- [ ] Debug mutable default arguments.
- [ ] Explain call-by-sharing.
- [ ] Explain LEGB.
- [ ] Distinguish `global` and `nonlocal`.
- [ ] Explain closure.
- [ ] Fix late-binding bug.
- [ ] Review an over-flexible function API.
- [ ] Survive the ten-level cache follow-up ladder.

**Gate:** READY / REPAIR

---

# 20. References

- Python Language Reference — function definitions
- Python Data Model
- Python FAQ
- PEP 8
- PEP 3102 — Keyword-Only Arguments
- PEP 570 — Positional-Only Parameters
