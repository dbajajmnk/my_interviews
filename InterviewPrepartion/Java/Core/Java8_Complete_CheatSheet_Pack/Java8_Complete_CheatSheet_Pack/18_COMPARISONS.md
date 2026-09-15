# High-Value Java 8 Comparisons

## `map` vs `flatMap`

| `map` | `flatMap` |
|---|---|
| one-to-one transformation | flatten nested results |
| `T → R` | `T → Stream<R>` then flatten |

## `orElse` vs `orElseGet`

| `orElse` | `orElseGet` |
|---|---|
| eager argument evaluation | lazy supplier |
| simple default | expensive default |

## Stream vs Collection

| Collection | Stream |
|---|---|
| stores data | processes data |
| reusable | normally single-use |
| eager structure | lazy pipeline possible |

## Sequential vs Parallel Stream

| Sequential | Parallel |
|---|---|
| one logical traversal | concurrent partitioning |
| predictable overhead | coordination overhead |
| safer default | benchmark first |

## `thenApply` vs `thenCompose`

| `thenApply` | `thenCompose` |
|---|---|
| transform result | chain async result |
| Future<T> → U | Future<T> → Future<U> flattened |

## Predicate vs Function

| Predicate | Function |
|---|---|
| returns boolean | returns transformed value |
