# Java 8 Complete Cheat Sheet — Combined Edition

> Fast technical revision companion.



---

<!-- 00_MASTER_INDEX.md -->

# Java 8 Complete Cheat Sheet Pack

**Purpose:** Fast revision for interviews, development, architecture discussions, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open the topic file and scan:
**What → Why → Syntax → Example → Trap**

### 10 Minutes
Read:
**What → Why → How → Code → Internals → Best Practices → Mistakes → Interview Recall**

## Pack Map

1. Java 8 Snapshot
2. Lambda Expressions
3. Functional Interfaces
4. Method References
5. Stream API
6. Stream Operations
7. Collectors
8. Parallel Streams
9. Optional
10. Default & Static Interface Methods
11. Date & Time API
12. CompletableFuture
13. Collection & Map Enhancements
14. Base64
15. JVM / Metaspace Changes
16. Nashorn Historical Note
17. Common Interview Comparisons
18. Interview Traps
19. One-Page Code Recall
20. Practice Questions
21. Sources / accuracy note


---

<!-- 01_30_SECOND_RECALL.md -->

# Java 8 — 30-Second Recall

## Java 8 Formula

**Java 8 = Functional Programming + Stream Processing + Better Date/Time + Async Composition + Interface Evolution**

## Must Remember

```text
Lambda
Functional Interface
Method Reference
Stream
Optional
Default Method
java.time
CompletableFuture
Collectors
Map enhancements
```

## Core Examples

```java
list.forEach(System.out::println);
```

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .collect(Collectors.toList());
```

```java
Optional.ofNullable(value)
        .orElse("default");
```

```java
CompletableFuture.supplyAsync(() -> loadData())
                 .thenApply(this::transform);
```

## Interview Traps

- Stream does not store data.
- Intermediate stream operations are lazy.
- A stream cannot normally be reused after a terminal operation.
- `map()` and `flatMap()` are different.
- `Optional.get()` is usually a smell when used blindly.
- Parallel streams are not automatically faster.
- Default methods solved interface evolution.
- `LocalDateTime` has no timezone.


---

<!-- 02_JAVA8_SNAPSHOT.md -->

# Java 8 Snapshot

## Why Java 8 Was Important

Java 8 was a major language and API evolution because it brought functional-style programming into mainstream Java.

## Major Areas

```text
Language
 ├── Lambda expressions
 ├── Method references
 └── Default methods

Collections
 ├── Streams
 ├── Collectors
 ├── forEach
 └── Map enhancements

Core APIs
 ├── Optional
 ├── java.time
 ├── CompletableFuture
 └── Base64
```

## Real-Life Analogy

Before Java 8, many operations were written as step-by-step loops.

After Java 8, many data transformations can be expressed as:

```text
Source
 → Filter
 → Transform
 → Aggregate
 → Result
```

This is declarative programming.


---

<!-- 03_LAMBDA_EXPRESSIONS.md -->

# Lambda Expressions

## What

A lambda is a concise way to provide the implementation of a functional interface.

## Syntax

```java
(parameters) -> expression
```

or

```java
(parameters) -> {
    statements;
}
```

## Before

```java
Comparator<String> c = new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
};
```

## After

```java
Comparator<String> c = (a, b) -> a.compareTo(b);
```

## Why

- less boilerplate
- functions can be passed as values
- enables streams
- supports declarative programming

## Variable Capture

A local variable captured by a lambda must be **final or effectively final**.

```java
int limit = 10;

list.stream()
    .filter(x -> x > limit)
    .forEach(System.out::println);
```

## Important Difference

`this` inside a lambda refers to the enclosing instance, unlike an anonymous inner class.

## Trap

A lambda is not simply “a shorter anonymous class.” Semantics such as `this`, scope, and target typing differ.


---

<!-- 04_FUNCTIONAL_INTERFACES.md -->

# Functional Interfaces

## What

An interface with exactly one abstract method.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

## Standard Interfaces

| Interface | Input | Output |
|---|---|---|
| `Predicate<T>` | T | boolean |
| `Function<T,R>` | T | R |
| `Consumer<T>` | T | void |
| `Supplier<T>` | none | T |
| `UnaryOperator<T>` | T | T |
| `BinaryOperator<T>` | T,T | T |

## Examples

```java
Predicate<Integer> even = x -> x % 2 == 0;
```

```java
Function<String, Integer> length = String::length;
```

```java
Consumer<String> print = System.out::println;
```

```java
Supplier<UUID> supplier = UUID::randomUUID;
```

## Composition

```java
predicate1.and(predicate2)
predicate1.or(predicate2)
predicate.negate()
```

```java
f.andThen(g)
f.compose(g)
```

## Trap

Default and static methods do not count toward the single abstract method rule.


---

<!-- 05_METHOD_REFERENCES.md -->

# Method References

## What

A shorter syntax when a lambda only calls an existing method.

## Four Common Forms

### Static Method

```java
ClassName::staticMethod
```

Example:

```java
Integer::parseInt
```

### Bound Instance Method

```java
object::instanceMethod
```

Example:

```java
System.out::println
```

### Unbound Instance Method

```java
ClassName::instanceMethod
```

Example:

```java
String::length
```

### Constructor

```java
ClassName::new
```

Example:

```java
ArrayList::new
```

## Rule

Use a method reference when it improves readability. Do not force it when the lambda is clearer.


---

<!-- 06_STREAM_API.md -->

# Stream API

## What

A Stream is a pipeline for processing data declaratively.

## Basic Flow

```text
Collection
  ↓
stream()
  ↓
Intermediate Operations
  ↓
Terminal Operation
  ↓
Result
```

## Example

```java
List<String> result =
    names.stream()
         .filter(n -> n.startsWith("A"))
         .map(String::toUpperCase)
         .sorted()
         .collect(Collectors.toList());
```

## Important Properties

- stream does not store data
- operations can be lazy
- pipeline is usually consumed once
- supports sequential and parallel execution

## Internal Idea

```text
Source → Pipeline Description → Terminal Trigger → Traversal
```

## Trap

This does not execute filtering yet:

```java
Stream<String> s = names.stream().filter(x -> x.length() > 3);
```

Execution normally starts when a terminal operation is invoked.


---

<!-- 07_STREAM_OPERATIONS.md -->

# Stream Operations

## Intermediate Operations

```text
filter
map
flatMap
distinct
sorted
peek
limit
skip
```

They usually return another stream.

## Terminal Operations

```text
forEach
collect
reduce
count
min
max
findFirst
findAny
anyMatch
allMatch
noneMatch
```

## `map()`

One input produces one transformed value.

```java
names.stream()
     .map(String::length);
```

## `flatMap()`

One input may produce multiple values; nested streams are flattened.

```java
lists.stream()
     .flatMap(List::stream);
```

## Reduce

```java
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
```

## Short-Circuiting

Examples:

```text
findFirst
findAny
anyMatch
limit
```

## Trap

`peek()` is mainly useful for observing/debugging pipeline elements, not for business side effects.


---

<!-- 08_COLLECTORS.md -->

# Collectors

## Common Collectors

```java
Collectors.toList()
Collectors.toSet()
Collectors.joining()
Collectors.groupingBy()
Collectors.partitioningBy()
Collectors.mapping()
Collectors.counting()
Collectors.summingInt()
Collectors.averagingInt()
```

## Grouping

```java
Map<String, List<Employee>> byDept =
    employees.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));
```

## Partitioning

```java
Map<Boolean, List<Integer>> result =
    numbers.stream()
           .collect(Collectors.partitioningBy(x -> x % 2 == 0));
```

## Joining

```java
String names =
    users.stream()
         .map(User::getName)
         .collect(Collectors.joining(", "));
```

## `toMap`

```java
Collectors.toMap(
    User::getId,
    User::getName
)
```

## Trap

Duplicate keys in `toMap()` can cause an exception unless you provide a merge function.


---

<!-- 09_PARALLEL_STREAMS.md -->

# Parallel Streams

## What

A parallel stream may process parts of a pipeline concurrently.

```java
list.parallelStream()
```

## Mental Model

```text
Input
 ↓ split
Task1 Task2 Task3 Task4
 ↓
ForkJoinPool
 ↓
combine
 ↓
Result
```

## Good Candidates

- large datasets
- CPU-bound operations
- stateless independent operations
- associative reductions

## Poor Candidates

- small collections
- blocking I/O
- order-sensitive logic
- shared mutable state
- expensive splitting/merging
- latency-sensitive shared servers without measurement

## Trap

Parallel stream ≠ guaranteed faster.

Always benchmark realistic workloads.


---

<!-- 10_OPTIONAL.md -->

# Optional

## What

A container representing a value that may or may not be present.

## Create

```java
Optional.of(value)
Optional.ofNullable(value)
Optional.empty()
```

## Use

```java
optional.orElse(defaultValue);
optional.orElseGet(() -> expensiveDefault());
optional.orElseThrow(...);
```

```java
optional.map(User::getName)
        .filter(name -> !name.isBlank())
        .ifPresent(System.out::println);
```

## `orElse` vs `orElseGet`

```java
orElse(value)
```

The argument is evaluated before the call.

```java
orElseGet(supplier)
```

The supplier is evaluated only when needed.

## Best Practice

Good for return values where absence is meaningful.

## Common Misuse

Avoid blindly using:

```java
optional.get()
```

Avoid using Optional everywhere as fields/parameters without a clear reason.

## Trap

Optional is not a replacement for all null handling.


---

<!-- 11_DEFAULT_STATIC_INTERFACE_METHODS.md -->

# Default & Static Interface Methods

## Why

They allowed interfaces to evolve without immediately breaking all implementations.

## Default Method

```java
interface Vehicle {
    default void start() {
        System.out.println("Starting");
    }
}
```

## Static Method

```java
interface MathUtil {
    static int square(int x) {
        return x * x;
    }
}
```

## Conflict Rule

If two interfaces provide the same default method:

```java
InterfaceA.super.method();
```

may be used to resolve explicitly.

## Priority Rules

Remember broadly:

```text
Class method wins over interface default
More specific interface wins
Otherwise resolve explicitly
```

## Trap

Static interface methods are not inherited like instance methods.


---

<!-- 12_DATE_TIME_API.md -->

# Java 8 Date & Time API

## Package

```java
java.time
```

## Core Types

| Type | Meaning |
|---|---|
| `LocalDate` | date |
| `LocalTime` | time |
| `LocalDateTime` | date + time |
| `Instant` | machine timestamp |
| `ZonedDateTime` | date/time + timezone |
| `ZoneId` | timezone |
| `Duration` | time-based amount |
| `Period` | date-based amount |

## Examples

```java
LocalDate today = LocalDate.now();
```

```java
LocalDate nextWeek = today.plusWeeks(1);
```

```java
Instant now = Instant.now();
```

```java
ZonedDateTime india =
    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

## Formatting

```java
DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("dd-MM-yyyy");

String value = today.format(formatter);
```

## Advantages Over Old API

- immutable
- thread-safe
- clearer types
- better timezone support

## Trap

`LocalDateTime` does not identify an absolute moment because it has no timezone/offset.


---

<!-- 13_COMPLETABLE_FUTURE.md -->

# CompletableFuture

## What

An API for composing asynchronous computations.

## Basic

```java
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "data");
```

## Transform

```java
future.thenApply(String::toUpperCase);
```

## Consume

```java
future.thenAccept(System.out::println);
```

## Chain Async Work

```java
future.thenCompose(this::loadDetailsAsync);
```

## Combine Independent Futures

```java
f1.thenCombine(f2, (a, b) -> a + b);
```

## Error Handling

```java
future.exceptionally(ex -> "fallback");
```

## Coordination

```java
CompletableFuture.allOf(f1, f2, f3);
CompletableFuture.anyOf(f1, f2, f3);
```

## `thenApply` vs `thenCompose`

```text
thenApply   = map
thenCompose = flatMap
```

## Trap

Default async methods commonly use the common ForkJoinPool unless you provide an executor. For production systems, executor strategy matters.


---

<!-- 14_COLLECTION_MAP_ENHANCEMENTS.md -->

# Collection & Map Enhancements

## Iterable

```java
list.forEach(System.out::println);
```

## Collection

```java
list.removeIf(x -> x < 0);
```

## List

```java
list.replaceAll(String::toUpperCase);
```

```java
list.sort(Comparator.naturalOrder());
```

## Map

```java
map.getOrDefault(key, defaultValue);
map.putIfAbsent(key, value);
map.computeIfAbsent(key, k -> new ArrayList<>());
map.computeIfPresent(key, (k, v) -> update(v));
map.merge(key, 1, Integer::sum);
map.replaceAll((k, v) -> transform(v));
map.forEach((k, v) -> System.out.println(k + "=" + v));
```

## High-Value Pattern

Frequency counter:

```java
map.merge(word, 1, Integer::sum);
```

## Trap

`computeIfAbsent()` should not contain uncontrolled heavy side effects.


---

<!-- 15_BASE64.md -->

# Base64 API

## Encoder

```java
String encoded =
    Base64.getEncoder()
          .encodeToString(data);
```

## Decoder

```java
byte[] decoded =
    Base64.getDecoder()
          .decode(encoded);
```

## Variants

```text
Basic
URL-safe
MIME
```

## Important

Base64 is **encoding**, not encryption.

## Trap

Never present Base64 as a security mechanism for secrets.


---

<!-- 16_JVM_METASPACE.md -->

# JVM / Metaspace Changes in Java 8

## Major Change

Permanent Generation (PermGen) was removed.

Class metadata moved to **Metaspace**.

## Before

```text
Heap
+ PermGen
```

## Java 8

```text
Heap
+ Native Memory Metaspace
```

## Why It Matters

Metaspace can grow using native memory, subject to JVM/system limits.

## Common Option

```text
-XX:MaxMetaspaceSize=
```

## Interview Trap

Metaspace is not simply "a bigger PermGen." Its memory management and location differ.


---

<!-- 17_NASHORN_HISTORICAL.md -->

# Nashorn — Historical Java 8 Feature

## What

Java 8 introduced Nashorn as a JavaScript engine for the JVM.

## Why Mention It

It is part of Java 8 feature history and still appears in interviews.

## Important Current Context

Nashorn was deprecated later and removed from the JDK in a subsequent Java release.

## Interview Position

Say:

> Nashorn was a Java 8 JavaScript engine feature, but it is historical rather than a modern Java platform recommendation.

Do not design new systems around it merely because it appeared in Java 8.


---

<!-- 18_COMPARISONS.md -->

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


---

<!-- 19_INTERVIEW_TRAPS.md -->

# Java 8 Interview Traps

1. Lambda requires a functional-interface target type.
2. Functional interface can still contain default/static methods.
3. Captured local variables must be final/effectively final.
4. `this` in a lambda refers to the enclosing object.
5. Stream intermediate operations are generally lazy.
6. A consumed stream cannot normally be reused.
7. Stream does not modify the source unless your own side effects do.
8. `map()` != `flatMap()`.
9. `peek()` is not meant as the main business side-effect mechanism.
10. Parallel stream is not automatically faster.
11. Avoid shared mutable state in parallel pipelines.
12. `Optional.of(null)` throws.
13. `orElse()` may evaluate fallback even when value is present.
14. `LocalDateTime` has no zone.
15. `Instant` represents a machine timestamp.
16. Default methods mainly enabled interface evolution.
17. Class methods override conflicting interface defaults.
18. `thenApply` != `thenCompose`.
19. CompletableFuture default executor strategy matters.
20. Base64 is not encryption.
21. Metaspace replaced PermGen.
22. Nashorn is historical, not a current recommendation.


---

<!-- 20_ONE_PAGE_CODE_RECALL.md -->

# Java 8 — One-Page Code Recall

## Lambda

```java
(x, y) -> x + y
```

## Predicate

```java
Predicate<Integer> p = x -> x > 10;
```

## Function

```java
Function<String, Integer> f = String::length;
```

## Consumer

```java
Consumer<String> c = System.out::println;
```

## Supplier

```java
Supplier<UUID> s = UUID::randomUUID;
```

## Stream

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .collect(Collectors.toList());
```

## Grouping

```java
Collectors.groupingBy(Employee::getDepartment)
```

## Reduce

```java
numbers.stream().reduce(0, Integer::sum);
```

## Optional

```java
Optional.ofNullable(value)
        .map(String::trim)
        .orElse("N/A");
```

## Date

```java
LocalDate.now();
Instant.now();
ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

## CompletableFuture

```java
CompletableFuture
    .supplyAsync(this::load)
    .thenApply(this::transform)
    .thenAccept(System.out::println);
```

## Map

```java
map.computeIfAbsent(key, k -> new ArrayList<>());
map.merge(key, 1, Integer::sum);
```


---

<!-- 21_PRACTICE_QUESTIONS.md -->

# Java 8 Practice Questions

## Quick Interview Questions

1. Why were lambdas introduced?
2. What is a functional interface?
3. Explain `Predicate`, `Function`, `Consumer`, `Supplier`.
4. Lambda vs anonymous class?
5. What is a method reference?
6. Stream vs Collection?
7. Intermediate vs terminal operations?
8. Why are streams lazy?
9. `map` vs `flatMap`?
10. `reduce` vs `collect`?
11. What are stateful stream operations?
12. When should parallel streams be avoided?
13. What is Optional?
14. `orElse` vs `orElseGet`?
15. Why default methods?
16. What happens with default-method conflicts?
17. Why is `java.time` better than `Date`/`Calendar`?
18. `Period` vs `Duration`?
19. `Instant` vs `LocalDateTime`?
20. What is CompletableFuture?
21. `thenApply` vs `thenCompose`?
22. How do you combine futures?
23. Which executor is used by default for async CompletableFuture operations?
24. What changed from PermGen to Metaspace?
25. Is Base64 encryption?


---

<!-- 22_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary references for Java 8 concepts:

- Java SE 8 API documentation
- Java Language Specification
- Oracle Java tutorials / Java 8 feature documentation

## Scope Note

This pack focuses on the Java 8 features that remain important for:
- interviews
- enterprise Java
- Spring/Spring Boot development
- functional programming
- collections/data processing
- asynchronous programming

Historical features such as Nashorn are marked accordingly.

## Practical Rule

For modern production work, understand Java 8 deeply because it shaped current Java, but use the supported Java version required by the project.
