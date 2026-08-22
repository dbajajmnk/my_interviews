# PY-01 / File 02 — Python Type System, Objects & Collections

**Priority:** P0  
**GOJ Mapping:** M2 Language Model & Type System + selected M6 Collections
**Suggested Time:** 60 minutes  

---

# 1. Objective

After this file, you should be able to:

- distinguish mutable and immutable objects;
- explain hashability;
- explain assignment vs copying;
- explain shallow vs deep copy;
- select list, tuple, set, and dict based on requirements;
- discuss average complexity accurately;
- connect local collection choices to production architecture.

---

# 2. 5W+H

## What?

Python provides mutable and immutable object types and built-in collections optimized for different data-access patterns.

## Why?

Correct selection affects correctness, readability, complexity, memory, concurrency, and maintainability.

## Where?

Collections appear everywhere:

- API payload processing
- caching
- indexing
- deduplication
- configuration
- transformations
- permission checks
- graph/data processing

## When?

Select a collection based on semantics first, then performance characteristics.

## Who?

Every Python engineer; senior engineers must also understand production consequences.

## How?

Through Python's sequence, mapping, and set abstractions plus hash/equality semantics.

---

# 3. Real-Life Analogy

Think of:

- `list` as an ordered notebook;
- `tuple` as a fixed coordinate card;
- `set` as a guest list with no duplicates;
- `dict` as a lookup directory.

The right structure communicates intent.

---

# 4. Visualization

```text
Python Collections
│
├── Sequence
│   ├── list  → mutable
│   └── tuple → immutable
│
├── Set
│   ├── set       → mutable
│   └── frozenset → immutable
│
└── Mapping
    └── dict → mutable key/value mapping
```

---

# 5. Mind Map

```text
Objects & Collections
│
├── Mutability
├── Hashability
├── Assignment
├── Copying
│   ├── Shallow
│   └── Deep
└── Collections
    ├── list
    ├── tuple
    ├── set
    └── dict
```

---

# 6. Core Concepts

## 6.1 Mutable Objects

Common mutable types:

- list
- dict
- set
- most custom class instances

Example:

```python
items = [1, 2]
items.append(3)
```

The object changes in place.

---

## 6.2 Immutable Objects

Common immutable types:

- int
- float
- bool
- str
- tuple
- frozenset
- bytes

Example:

```python
x = 10
x += 1
```

A new integer value is bound to `x`; integer `10` was not modified.

---

## 6.3 Why Immutability Matters

Immutability can improve:

- reasoning;
- safe sharing;
- predictability;
- key/hash stability;
- functional-style transformations.

It does not automatically make an entire system thread-safe.

---

## 6.4 Hashability

Dictionary keys and set elements need suitable hash behavior.

Common hashable values:

- int
- str
- many tuples containing hashable values

Common unhashable values:

- list
- dict
- set

Example:

```python
lookup = {}
lookup[[1, 2]] = "value"
```

raises `TypeError`.

---

## 6.5 Assignment vs Copy

```python
a = [1, 2]
b = a
```

No copy.

```python
b = a.copy()
```

Creates a new outer list.

---

## 6.6 Shallow Copy

```python
a = [[1], [2]]
b = a.copy()

b[0].append(99)

print(a)
```

Output:

```text
[[1, 99], [2]]
```

Nested mutable objects are still shared.

---

## 6.7 Deep Copy

```python
import copy

a = [[1], [2]]
b = copy.deepcopy(a)

b[0].append(99)

print(a)
```

Output:

```text
[[1], [2]]
```

### Architect Rule

Do not use `deepcopy()` as a universal safety mechanism.

First clarify:

- ownership;
- mutation requirements;
- object graph size;
- lifecycle;
- external resources.

---

# 7. Collections

## 7.1 List

Use when:

- order matters;
- duplicates are allowed;
- contents change;
- index-based sequence operations matter.

```python
events = ["created", "validated", "processed"]
```

Typical:

- index access: O(1)
- append: amortized O(1)
- membership: O(n)

---

## 7.2 Tuple

Use when:

- sequence is conceptually fixed;
- immutability communicates intent;
- a composite immutable value is useful.

```python
coordinate = (28.4, 77.0)
```

Do not say:

> Tuple is always faster.

Say:

> I choose tuple primarily for fixed-value semantics; performance differences are workload-dependent.

---

## 7.3 Set

Use when:

- uniqueness matters;
- membership is frequent;
- set operations are useful.

```python
allowed_roles = {"ADMIN", "USER"}
```

Expected average membership:

> O(1)

---

## 7.4 Dictionary

Use for:

- key/value lookup;
- indexing;
- counting;
- grouping;
- configuration;
- local cache-like structures.

```python
users = {
    101: "A",
    102: "B",
}
```

Expected average lookup:

> O(1)

But not a universal worst-case guarantee.

---

# 8. Engineering Depth

## 8.1 Why Dict/Set Lookup Is Usually O(1)

They are hash-table based.

Simplified flow:

```text
Key
 ↓
hash(key)
 ↓
candidate location
 ↓
equality check when needed
 ↓
value / membership result
```

Collisions and resizing make this an average-case statement.

---

## 8.2 List vs Set Is Not Only Big-O

Suppose there are only three allowed statuses:

```python
allowed = ["NEW", "READY", "DONE"]
```

Switching to a set may not materially matter.

Consider:

- size;
- lookup frequency;
- order requirement;
- readability;
- uniqueness;
- measured bottleneck.

Big-O is part of engineering judgment, not the entire decision.

---

## 8.3 Local Collection vs Distributed State

A local dictionary:

```python
cache = {}
```

is only local process memory.

With three workers:

```text
Worker A → cache A
Worker B → cache B
Worker C → cache C
```

They are not automatically synchronized.

If the requirement is shared cache/state, architecture may need:

- Redis;
- database;
- distributed policy/config service;
- another explicit shared store.

---

# 9. Implementation / Code

## Frequency Counter

```python
frequency = {}

for item in data:
    frequency[item] = frequency.get(item, 0) + 1
```

## Duplicate Detection

```python
seen = set()

for request_id in request_ids:
    if request_id in seen:
        print("duplicate", request_id)
    seen.add(request_id)
```

## Composite Key

```python
cache = {}

key = ("customer-101", "profile")
cache[key] = {"name": "A"}
```

---

# 10. Hands-On Practice

## Practice 1

Predict:

```python
a = [[1]]
b = a.copy()

b[0].append(2)

print(a)
```

Answer:

```text
[[1, 2]]
```

---

## Practice 2

Requirement:

> Detect duplicate request IDs efficiently.

Choose:

> `set`

Reason:

- expresses uniqueness;
- expected O(1) membership.

---

## Practice 3

Requirement:

> Preserve all event order and duplicates.

Choose:

> `list`

---

## Practice 4

Requirement:

> Map user ID to user profile.

Choose:

> `dict`

---

## Practice 5

Requirement:

> Represent fixed latitude/longitude pair.

Choose:

> `tuple`

---


# 11. Google Interview Drill

## Drill — Duplicate Detection

### Problem

Implement:

```python
def has_duplicates(values):
    ...
```

Return `True` when the input contains a duplicate.

### Step 1 — Clarify

Ask:

- Are values hashable?
- Can the input be very large?
- Do we need only a boolean or the duplicate values?
- Is input an in-memory collection or a stream?

### Step 2 — First Approach

Compare every element with every other element.

Complexity:

- Time: O(n²)
- Extra space: O(1), depending on implementation

### Step 3 — Improve

Use a set:

```python
def has_duplicates(values):
    seen = set()

    for value in values:
        if value in seen:
            return True
        seen.add(value)

    return False
```

Complexity:

- Expected time: O(n)
- Extra space: O(n)

### Step 4 — Test

```python
assert has_duplicates([1, 2, 3]) is False
assert has_duplicates([1, 2, 1]) is True
assert has_duplicates([]) is False
assert has_duplicates([1]) is False
```

### Step 5 — Edge Case

What if elements are unhashable?

Example:

```python
[[1], [2], [1]]
```

A normal set-based solution fails.

Now discuss:

- canonicalization;
- serialization;
- custom keys;
- alternative comparison strategies.

### Step 6 — Architecture Follow-Up

What if there are one billion IDs arriving as a stream?

Discuss:

- streaming;
- memory limits;
- external state;
- partitioning;
- probabilistic structures such as Bloom filters when false positives are acceptable;
- distributed deduplication.

### Interview Goal

> Data structure → complexity → edge case → scale → architecture.


# 11. Common Mistakes

1. Treating assignment as copying.
2. Assuming shallow copy gives fully independent nested state.
3. Deep-copying everything.
4. Saying tuple is just a faster list.
5. Saying set/dict lookup is always O(1) in every possible case.
6. Choosing a set when order/duplicates are meaningful.
7. Treating a local dict as a distributed cache.
8. Using mutable objects as keys.
9. Optimizing data structures without understanding the workload.

---

# 12. Best Practices

- Choose by semantics first.
- Use set for uniqueness/membership.
- Use dict for keyed lookup.
- Use tuple for fixed-value semantics.
- Use list for ordered mutable sequences.
- Clarify ownership before copying.
- Do not assume local state is shared state.
- Profile when performance materially matters.

---

# 13. Interview Questions

1. Mutable vs immutable?
2. Why is a list unhashable?
3. Why can tuple be a dict key?
4. Assignment vs shallow copy?
5. Shallow vs deep copy?
6. When is `deepcopy()` a poor choice?
7. List vs tuple?
8. List vs set?
9. Set vs dict?
10. Why is dict lookup expected O(1)?
11. What can cause a hash collision?
12. Why is an in-memory dict not enough for distributed cache?

---

# 14. Google-Level Follow-Up

Start:

```python
cache = {}

def get_user(user_id):
    if user_id in cache:
        return cache[user_id]

    user = load_from_db(user_id)
    cache[user_id] = user
    return user
```

### L1
What is the complexity of local lookup?

Expected average O(1).

### L2
What happens when the user changes in the database?

The cache can become stale.

### L3
What happens with multiple workers?

Each worker can have different cache contents.

### L4
What happens after restart?

Local cache is lost.

### L5
Can memory grow without bound?

Yes, unless managed.

### L6
When might Redis help?

When cross-instance shared caching/TTL/atomic operations are required.

### L7
What failures does Redis introduce?

Network failures, timeouts, stale data, hot keys, outages, stampedes, capacity issues.

### L8
What must the architecture define?

```text
cache pattern
→ TTL
→ invalidation
→ consistency
→ fallback
→ observability
→ security
→ capacity
```

---

# 15. Quick Revision

```text
Mutable: list, dict, set
Immutable: int, str, tuple
Assignment ≠ copy
Shallow copy: nested references can remain shared
Deep copy: recursive copy where possible
List: ordered mutable sequence
Tuple: fixed sequence/value
Set: uniqueness + membership
Dict: key/value lookup
Set/Dict: expected O(1)
Local cache ≠ distributed cache
```

---

# 16. Readiness Gate

- [ ] Explain mutability.
- [ ] Explain hashability.
- [ ] Explain assignment vs copy.
- [ ] Predict shallow-copy behavior.
- [ ] Explain deep-copy trade-offs.
- [ ] Choose list/tuple/set/dict from requirements.
- [ ] Explain expected O(1) lookup.
- [ ] Explain why local dict state does not solve distributed consistency.
- [ ] Survive the cache follow-up ladder.

**Gate:** READY / REPAIR

---

# 17. References

- Python Data Model
- Python Standard Types documentation
- Python `copy` module documentation
- Python built-in collections documentation
