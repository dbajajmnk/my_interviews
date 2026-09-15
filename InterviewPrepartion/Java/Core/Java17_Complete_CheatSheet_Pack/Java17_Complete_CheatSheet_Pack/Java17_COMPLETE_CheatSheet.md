# Java 17 Complete Cheat Sheet — Combined Edition

> Fast technical revision companion for Java 17 developers.



---

<!-- 00_MASTER_INDEX.md -->

# Java 17 Complete Cheat Sheet Pack

**Purpose:** Fast revision for Java 17 interviews, Spring Boot development, architecture discussions, migration work, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open the topic file and scan:
**What → Why → Syntax → Example → Trap**

### 10 Minutes
Read:
**What → Why → Code → Internals → Comparison → Best Practices → Interview Recall**

---

## Part A — Java 17 Core / JDK 17 Highlights

1. Java 17 Snapshot
2. Sealed Classes
3. Pattern Matching for `switch` — Preview in Java 17
4. Enhanced Pseudo-Random Number Generators
5. Strong Encapsulation of JDK Internals
6. Security Manager Deprecation
7. Context-Specific Deserialization Filters
8. JVM / GC / Platform Notes

## Part B — Java 9→17 Features Expected from a Java 17 Developer

9. Records
10. Pattern Matching for `instanceof`
11. Switch Expressions
12. Text Blocks
13. `var`
14. Java Platform Module System
15. Collection Factory Methods
16. Stream API Enhancements
17. Optional Enhancements
18. HTTP Client
19. CompletableFuture Enhancements
20. String / Files / Utility API Improvements
21. Helpful NullPointerException
22. Interface Private Methods
23. Try-with-resources Improvements

## Part C — Interview / Migration / Production

24. Java 8 vs Java 17
25. Java 11 vs Java 17
26. Migration from Java 8 to Java 17
27. Interview Traps
28. One-Page Code Recall
29. Commands / JVM Recall
30. Production Checklist
31. Practice Questions
32. Sources / Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Java 17 — 30-Second Recall

## Formula

**Java 17 = Modern Java Language + Stronger Encapsulation + Better Runtime + LTS Baseline**

## Must Remember

```text
Sealed Classes
Records
Pattern Matching instanceof
Switch Expressions
Text Blocks
var
Modules
HTTP Client
Collection Factory Methods
Stream / Optional additions
Helpful NPE
Strong Encapsulation
RandomGenerator API
```

## Key Example

```java
sealed interface Shape permits Circle, Rectangle {}

record Circle(double radius) implements Shape {}

record Rectangle(double width, double height) implements Shape {}
```

```java
static double area(Shape shape) {
    if (shape instanceof Circle c) {
        return Math.PI * c.radius() * c.radius();
    }
    if (shape instanceof Rectangle r) {
        return r.width() * r.height();
    }
    throw new IllegalArgumentException();
}
```

## Interview Traps

- Sealed classes are **final in Java 17**.
- Pattern matching for `switch` is **preview in Java 17**.
- Records are not “just Lombok”.
- `var` is local-variable type inference, not dynamic typing.
- `List.of()` creates an unmodifiable list.
- Modules are not the same thing as Maven modules.
- Strong encapsulation can break code relying on internal JDK APIs.


---

<!-- 02_JAVA17_SNAPSHOT.md -->

# Java 17 Snapshot

## Why Java 17 Matters

Java 17 is a long-term-support-era baseline widely used for enterprise modernization.

It represents a major step forward from Java 8 with:

```text
Language
 ├── Records
 ├── Sealed Classes
 ├── Pattern Matching
 ├── Switch Expressions
 ├── Text Blocks
 └── var

Platform
 ├── JPMS Modules
 ├── HTTP Client
 ├── Better collection factories
 ├── Better Stream / Optional APIs
 └── Strong encapsulation

Runtime
 ├── GC improvements
 ├── Better diagnostics
 └── Modern platform support
```

## Real-Life Analogy

Java 8 modernized coding style.

Java 17 modernized **language modeling + platform boundaries + runtime safety**.


---

<!-- 03_SEALED_CLASSES.md -->

# Sealed Classes — Java 17 Final

## What

Sealed classes/interfaces restrict which types may extend or implement them.

## Syntax

```java
public sealed interface Payment
        permits CardPayment, UpiPayment, CashPayment {
}
```

```java
public final class CardPayment implements Payment {}
```

```java
public non-sealed class UpiPayment implements Payment {}
```

```java
public final class CashPayment implements Payment {}
```

## Why

Useful when a domain has a **closed set of valid variants**.

Examples:
- payment types
- commands
- events
- AST nodes
- workflow states

## Allowed Subclass Modifiers

A direct subclass must be one of:

```text
final
sealed
non-sealed
```

## Design Benefit

```text
Open inheritance
        ↓
Hard to reason about all subtypes

Sealed hierarchy
        ↓
Known finite subtype family
```

## Interview Trap

Sealed classes do **not** mean immutable classes.

They control inheritance, not object mutability.


---

<!-- 04_PATTERN_SWITCH_PREVIEW.md -->

# Pattern Matching for `switch` — Preview in Java 17

## Status

Pattern matching for `switch` was a **preview feature in Java 17**.

That status matters in interviews.

## Idea

```java
static String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "int " + i;
        case String s  -> "text " + s;
        default        -> "other";
    };
}
```

## Why

It combines:

```text
type test
+ variable binding
+ branching
```

## Preview Compile / Run

```bash
javac --enable-preview --release 17 Demo.java
java --enable-preview Demo
```

## Important

Do not present Java 17 pattern-switch syntax as a non-preview production language feature.

## Modern Context

Pattern matching for switch was finalized in later Java releases, but in **Java 17 specifically** it remains preview.


---

<!-- 05_RANDOM_GENERATOR_API.md -->

# Enhanced Pseudo-Random Number Generators

## What

Java 17 introduced a more extensible random-generator API.

## Package

```java
java.util.random
```

## Example

```java
RandomGenerator generator =
    RandomGenerator.getDefault();

int value = generator.nextInt(100);
```

## Discover Algorithms

```java
RandomGeneratorFactory.all()
    .forEach(factory ->
        System.out.println(factory.name()));
```

## Why

A common abstraction over multiple random algorithms.

## Important

Pseudo-random != cryptographically secure.

For security-sensitive random values, use security-focused APIs such as `SecureRandom`.

## Trap

Never use ordinary pseudo-random generators for tokens/password-reset secrets merely because the API is newer.


---

<!-- 06_STRONG_ENCAPSULATION.md -->

# Strong Encapsulation of JDK Internals

## What

Java 17 strongly encapsulates internal JDK implementation details.

## Why

Historically, some libraries accessed internal packages such as:

```text
sun.*
com.sun.*
```

This was fragile and unsupported.

## Java 17 Direction

```text
Public Supported API
        ✓

Internal JDK API
        ✗ strongly restricted
```

## Migration Impact

Legacy applications may fail because they used reflection against internal JDK classes.

## Fix Strategy

1. identify internal API usage
2. upgrade the dependent library
3. move to supported public API
4. use temporary command-line opens only as a bridge

## Trap

`--add-opens` is a migration escape hatch, not the ideal permanent architecture.


---

<!-- 07_SECURITY_MANAGER_DEPRECATION.md -->

# Security Manager — Deprecated for Removal

## Java 17 Change

The Java Security Manager was deprecated for removal.

## Why It Matters

Do not design new Java security architecture around Security Manager sandboxing.

## Modern Security Controls

Prefer:

```text
OS / container isolation
Least privilege
Process boundaries
Network policies
IAM
Secrets management
Application authorization
Dependency security
```

## Interview Position

Security Manager is a historical JVM sandbox mechanism whose long-term removal was signaled in Java 17.


---

<!-- 08_DESERIALIZATION_FILTERS.md -->

# Context-Specific Deserialization Filters

## Why

Java native serialization can be dangerous when untrusted object graphs are accepted.

## Goal

Allow filtering decisions for deserialization contexts.

## Security Principle

```text
Untrusted serialized bytes
        ↓
Filter / allowlist decision
        ↓
Only expected classes / limits
        ↓
Deserialize
```

## Best Practice

For external service APIs, prefer safer explicit formats such as JSON/Protobuf with strict schemas rather than native Java serialization.

## Trap

Deserialization filtering reduces risk; it does not make arbitrary native Java deserialization inherently safe.


---

<!-- 09_JVM_GC_PLATFORM.md -->

# JVM / GC / Platform Recall

## Java 17 Era Highlights

Important runtime context includes:

- mature G1 GC baseline
- low-pause collectors such as ZGC
- modern macOS/AArch64 support
- improved diagnostics
- tighter JDK encapsulation

## Collector Selection Mindset

```text
Throughput?
Latency?
Heap size?
Pause target?
CPU budget?
Container limits?
```

## Rule

Do not choose a GC because it is newer.

Measure:

```text
allocation rate
heap occupancy
pause duration
CPU
throughput
p95/p99 latency
```

## Common Tools

```text
jcmd
jstack
jmap
jstat
Java Flight Recorder
Mission Control
GC logs
```


---

<!-- 10_RECORDS.md -->

# Records

## What

Records provide concise syntax for transparent data carriers.

## Syntax

```java
public record User(
    long id,
    String name,
    String email
) {}
```

Compiler provides:

```text
private final fields
canonical constructor
accessors
equals()
hashCode()
toString()
```

## Accessors

```java
user.name()
```

not:

```java
user.getName()
```

## Compact Constructor

```java
record Money(BigDecimal amount, String currency) {
    Money {
        Objects.requireNonNull(amount);
        Objects.requireNonNull(currency);
    }
}
```

## Good Fits

- DTO
- command
- event
- immutable result
- value-oriented data carrier

## Trap

Records are shallowly immutable.

If a record component points to a mutable object, that object can still mutate.

## Not Simply Lombok

Record semantics are part of the Java language and type model.


---

<!-- 11_PATTERN_INSTANCEOF.md -->

# Pattern Matching for `instanceof`

## Before

```java
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println(s.length());
}
```

## Modern

```java
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

## Why

Removes redundant cast.

## Flow Scope

```java
if (obj instanceof String s && !s.isBlank()) {
    System.out.println(s);
}
```

The variable is available only where the compiler knows the pattern matched.

## Trap

Pattern variable scope is flow-sensitive, not simply block-wide.


---

<!-- 12_SWITCH_EXPRESSIONS.md -->

# Switch Expressions

## Traditional Style

```java
String result;

switch (day) {
    case MONDAY:
        result = "work";
        break;
    default:
        result = "other";
}
```

## Modern Style

```java
String result = switch (day) {
    case MONDAY, TUESDAY -> "work";
    case SATURDAY, SUNDAY -> "weekend";
    default -> "other";
};
```

## `yield`

```java
int score = switch (level) {
    case HIGH -> 100;
    case MEDIUM -> 50;
    default -> {
        int calculated = 10;
        yield calculated;
    }
};
```

## Benefits

- expression-oriented
- no accidental fall-through with arrow labels
- cleaner exhaustive logic

## Trap

Do not confuse `yield` in switch expressions with thread scheduling.


---

<!-- 13_TEXT_BLOCKS.md -->

# Text Blocks

## What

Multi-line strings.

## Example

```java
String json = """
    {
      "name": "Deepak",
      "role": "Architect"
    }
    """;
```

## Good Uses

- JSON examples
- SQL
- HTML
- XML
- templates
- test fixtures

## Why

Avoids excessive escaping and string concatenation.

## Trap

Text blocks are still `String` objects, not a template engine.


---

<!-- 14_VAR.md -->

# `var` — Local Variable Type Inference

## Example

```java
var name = "Deepak";
var users = new ArrayList<User>();
```

Compiler still knows exact static type.

## Not Dynamic Typing

```text
var ≠ JavaScript-style dynamic variable
```

## Cannot Use Everywhere

Not for:

```text
fields
method return type
ordinary method parameter types
```

## Good Use

When the RHS makes the type obvious.

## Poor Use

```java
var x = complicatedFactoryCall();
```

when it hides important meaning.

## Rule

Use `var` to reduce noise, not information.


---

<!-- 15_MODULE_SYSTEM.md -->

# Java Platform Module System (JPMS)

## What

Introduced strong named modules into the Java platform.

## Descriptor

```java
module com.example.orders {
    requires java.sql;

    exports com.example.orders.api;
}
```

## Concepts

```text
module
requires
exports
opens
uses
provides
```

## Why

- explicit dependencies
- stronger encapsulation
- reliable configuration
- modular runtime images

## `exports` vs `opens`

```text
exports → normal public access
opens   → deep reflective access
```

## Trap

JPMS modules are not the same as Maven/Gradle multi-module builds.


---

<!-- 16_COLLECTION_FACTORY_METHODS.md -->

# Collection Factory Methods

## Create

```java
List<String> list = List.of("A", "B");
Set<Integer> set = Set.of(1, 2, 3);

Map<String, Integer> map =
    Map.of("A", 1, "B", 2);
```

## Characteristics

These are unmodifiable collections.

```java
list.add("C"); // throws UnsupportedOperationException
```

## Copy

```java
List<String> copy = List.copyOf(source);
```

## Trap

Unmodifiable does not necessarily mean deeply immutable if contained elements are mutable.


---

<!-- 17_STREAM_ENHANCEMENTS.md -->

# Stream API Enhancements After Java 8

## `takeWhile`

```java
stream.takeWhile(x -> x < 10)
```

Consumes prefix while predicate remains true.

## `dropWhile`

```java
stream.dropWhile(x -> x < 10)
```

Drops matching prefix.

## `ofNullable`

```java
Stream.ofNullable(value)
```

Produces zero or one element.

## `iterate`

Modern bounded form:

```java
Stream.iterate(
    0,
    n -> n < 10,
    n -> n + 1
)
```

## `toList()`

Modern Java includes:

```java
List<String> names =
    stream.map(User::name)
          .toList();
```

## Trap

Do not assume every `toList()` result has the same mutability semantics as `Collectors.toList()`.


---

<!-- 18_OPTIONAL_ENHANCEMENTS.md -->

# Optional Enhancements

Useful additions after Java 8 include:

## `ifPresentOrElse`

```java
optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("missing")
);
```

## `or`

```java
optional.or(() -> backupOptional);
```

## `stream`

```java
optional.stream()
```

Useful in Stream pipelines.

## `isEmpty`

```java
if (optional.isEmpty()) {
    ...
}
```

## Trap

Optional is still not intended as a universal replacement for every nullable field/parameter.


---

<!-- 19_HTTP_CLIENT.md -->

# Modern HTTP Client

## Package

```java
java.net.http
```

## Client

```java
HttpClient client =
    HttpClient.newHttpClient();
```

## Request

```java
HttpRequest request =
    HttpRequest.newBuilder()
        .uri(URI.create("https://example.com"))
        .GET()
        .build();
```

## Sync

```java
HttpResponse<String> response =
    client.send(
        request,
        HttpResponse.BodyHandlers.ofString()
    );
```

## Async

```java
client.sendAsync(
        request,
        HttpResponse.BodyHandlers.ofString()
    )
    .thenApply(HttpResponse::body)
    .thenAccept(System.out::println);
```

## Supports

```text
HTTP/1.1
HTTP/2
Synchronous
Asynchronous
WebSocket APIs
```

## Production Rule

Configure:

```text
timeouts
authentication
error mapping
retry policy
connection behavior
observability
```


---

<!-- 20_COMPLETABLE_FUTURE_ENHANCEMENTS.md -->

# CompletableFuture — Java 9+ Enhancements

## Timeout

```java
future.orTimeout(2, TimeUnit.SECONDS);
```

## Fallback on Timeout

```java
future.completeOnTimeout(
    defaultValue,
    2,
    TimeUnit.SECONDS
);
```

## Delayed Executor

```java
Executor executor =
    CompletableFuture.delayedExecutor(
        1,
        TimeUnit.SECONDS
    );
```

## Rule

Timeout is not cancellation of every underlying operation automatically.

Understand what your task/executor/resource is doing.


---

<!-- 21_STRING_FILES_UTILITIES.md -->

# String / Files / Utility Enhancements

## String

Useful modern methods include:

```java
isBlank()
lines()
strip()
stripLeading()
stripTrailing()
repeat()
```

Example:

```java
"  ".isBlank(); // true
```

## Files

Useful methods include:

```java
Files.readString(path)
Files.writeString(path, text)
```

## Predicate

```java
Predicate.not(String::isBlank)
```

## Objects

Modern JDK versions added useful range/index checks and other helpers.

## Rule

Use standard library improvements instead of reimplementing common utilities.


---

<!-- 22_HELPFUL_NPE.md -->

# Helpful NullPointerExceptions

## Before

Historically:

```text
NullPointerException
```

gave limited information.

## Modern Java

A helpful NPE can identify the failed dereference path more precisely.

Example concept:

```text
Cannot invoke "Address.city()" because
"user.address()" is null
```

## Why

Faster debugging.

## Trap

Better NPE messages do not justify poor null-design or missing validation.


---

<!-- 23_PRIVATE_INTERFACE_METHODS.md -->

# Private Interface Methods

## Why

Interfaces with multiple default methods can share implementation without exposing helper methods publicly.

## Example

```java
interface LoggerSupport {

    default void info(String msg) {
        log("INFO", msg);
    }

    default void error(String msg) {
        log("ERROR", msg);
    }

    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }
}
```

## Benefit

Avoid duplicated default-method implementation logic.

## Trap

Private interface methods are implementation details and cannot be invoked by implementing classes.


---

<!-- 24_TRY_WITH_RESOURCES.md -->

# Try-with-resources Improvement

## Java 7 Style

Resource often declared inside try header.

## Java 9+ Improvement

An effectively final variable can be declared earlier and reused.

```java
BufferedReader reader =
    Files.newBufferedReader(path);

try (reader) {
    System.out.println(reader.readLine());
}
```

## Rule

Resource must still be final/effectively final.

## Benefit

Cleaner code when resource creation occurs before the try block.


---

<!-- 25_JAVA8_VS_JAVA17.md -->

# Java 8 vs Java 17

| Area | Java 8 | Java 17 |
|---|---|---|
| Functional style | Lambdas/Streams introduced | mature baseline |
| Data carriers | classes/POJOs | records |
| Inheritance control | open/final | sealed classes |
| Type tests | cast after `instanceof` | pattern binding |
| Switch | statement-heavy | expressions + modern syntax |
| Strings | quoted strings | text blocks |
| Local typing | explicit | `var` available |
| Modules | classpath | JPMS available |
| HTTP | legacy clients / libraries | standard modern HTTP client |
| JDK internals | easier legacy access | strongly encapsulated |
| Diagnostics | older baseline | improved runtime tooling |
| LTS generation | older | modern enterprise baseline |

## Interview Summary

Java 8 modernized functional programming.

Java 17 modernized:
**domain modeling + language expressiveness + encapsulation + runtime platform**.


---

<!-- 26_JAVA11_VS_JAVA17.md -->

# Java 11 vs Java 17

## Java 11 Era Highlights

- standardized HTTP Client
- String utilities
- Files read/write string
- local-variable syntax for lambda parameters
- LTS baseline

## Java 17 Era Additional High-Value Features

- records
- sealed classes
- pattern matching for `instanceof`
- text blocks
- switch expressions
- stronger JDK encapsulation
- newer runtime/platform changes

## Migration View

```text
Java 11
   ↓
Language modernization
   ↓
Runtime / library evolution
   ↓
Java 17
```


---

<!-- 27_MIGRATION_8_TO_17.md -->

# Migration from Java 8 to Java 17

## Safe Migration Flow

```text
Inventory dependencies
 ↓
Upgrade build plugins
 ↓
Compile on modern JDK
 ↓
Fix removed/deprecated APIs
 ↓
Fix JDK-internal access
 ↓
Upgrade frameworks/libraries
 ↓
Run unit tests
 ↓
Run integration tests
 ↓
Performance test
 ↓
Observe in staging
 ↓
Controlled rollout
```

## Common Risk Areas

```text
sun.* / internal APIs
reflection
old bytecode tooling
old mocking libraries
JAXB/JAX-WS assumptions
TLS / crypto changes
GC flags
container behavior
old application servers
illegal reflective access
```

## Architecture Rule

Do not mix:
- JDK migration
- framework major migration
- database migration
- architecture redesign

into one uncontrolled change unless unavoidable.

## Interview Answer

The hardest part of 8→17 migration is usually **ecosystem compatibility and internal API assumptions**, not language syntax.


---

<!-- 28_INTERVIEW_TRAPS.md -->

# Java 17 Interview Traps

1. Sealed classes control inheritance, not immutability.
2. Records are shallowly immutable.
3. Records can implement interfaces.
4. Records cannot extend arbitrary classes.
5. Pattern matching for `switch` is preview in Java 17.
6. Pattern matching for `instanceof` is final before Java 17.
7. `var` is compile-time inference, not dynamic typing.
8. `var` cannot be used for fields.
9. `List.of()` is unmodifiable.
10. Unmodifiable does not mean deep immutable.
11. Stream `toList()` should not be assumed equivalent to mutable collectors.
12. JPMS module != Maven module.
13. `exports` != `opens`.
14. Strong encapsulation may break reflective legacy libraries.
15. `--add-opens` is a bridge, not ideal permanent design.
16. HTTP Client supports async calls with CompletableFuture.
17. `LocalDateTime` still has no timezone.
18. Helpful NPE improves diagnostics, not null-safety.
19. Security Manager is deprecated for removal in Java 17.
20. RandomGenerator is not automatically cryptographically secure.
21. Modern Java syntax does not automatically improve performance.
22. Java 17 migration risk is frequently library/framework compatibility.


---

<!-- 29_ONE_PAGE_CODE_RECALL.md -->

# Java 17 — One-Page Code Recall

## Record

```java
record User(long id, String name) {}
```

## Sealed

```java
sealed interface Shape permits Circle, Rectangle {}
```

## Pattern `instanceof`

```java
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

## Switch Expression

```java
String type = switch (code) {
    case 1 -> "ONE";
    case 2 -> "TWO";
    default -> "OTHER";
};
```

## Text Block

```java
String json = """
    {"status":"OK"}
    """;
```

## `var`

```java
var users = new ArrayList<User>();
```

## Collections

```java
List<String> list = List.of("A", "B");
Map<String,Integer> map = Map.of("A",1);
```

## Stream Additions

```java
stream.takeWhile(x -> x < 10);
stream.dropWhile(x -> x < 10);
Stream.ofNullable(value);
```

## Optional

```java
optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("missing")
);
```

## HTTP Client

```java
HttpClient client = HttpClient.newHttpClient();
```

## CompletableFuture Timeout

```java
future.orTimeout(2, TimeUnit.SECONDS);
```

## RandomGenerator

```java
RandomGenerator rg = RandomGenerator.getDefault();
```


---

<!-- 30_COMMANDS_JVM.md -->

# Java 17 Commands / JVM Recall

## Version

```bash
java -version
javac -version
```

## Compile

```bash
javac Demo.java
```

## Run

```bash
java Demo
```

## Preview Feature Compile

```bash
javac --enable-preview --release 17 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```

## Useful Runtime Tools

```text
jcmd
jstack
jmap
jstat
jps
jfr
```

## Modules

```bash
java --list-modules
jdeps app.jar
jlink ...
```

## Migration Diagnostics

Look for:

```text
illegal reflective access
internal JDK package usage
unsupported JVM flags
dependency bytecode incompatibility
```


---

<!-- 31_PRODUCTION_CHECKLIST.md -->

# Java 17 Production Checklist

## Runtime

- [ ] supported JDK distribution/version
- [ ] container memory settings verified
- [ ] GC behavior measured
- [ ] heap sizing evidence-based
- [ ] JFR/diagnostics strategy available

## Dependencies

- [ ] compatible with Java 17
- [ ] no unsupported internal JDK API dependency
- [ ] security patches current
- [ ] bytecode agents compatible

## Code

- [ ] use modern APIs where they improve clarity
- [ ] do not use preview features accidentally in production
- [ ] no unnecessary `--add-opens`
- [ ] serialization risk reviewed

## Performance

- [ ] benchmark critical paths
- [ ] p95/p99 monitored
- [ ] allocation/GC checked
- [ ] CPU profiling available

## Migration

- [ ] integration tests
- [ ] regression tests
- [ ] load tests
- [ ] rollback strategy
- [ ] observability during rollout


---

<!-- 32_PRACTICE_QUESTIONS.md -->

# Java 17 Practice Questions

1. Why is Java 17 significant?
2. What are sealed classes?
3. `final` vs `sealed` vs `non-sealed`?
4. Can a record extend another class?
5. Are records deeply immutable?
6. Why use records instead of POJOs?
7. Explain pattern matching for `instanceof`.
8. What is the status of pattern-switch in Java 17?
9. Explain switch expressions and `yield`.
10. What are text blocks?
11. Is `var` dynamic typing?
12. Where can `var` be used?
13. What is JPMS?
14. `exports` vs `opens`?
15. Maven module vs Java module?
16. Why `List.of()`?
17. What changed in Stream API after Java 8?
18. What changed in Optional?
19. Explain modern Java HTTP Client.
20. Sync vs async HTTP request?
21. What changed in CompletableFuture?
22. Why were JDK internals strongly encapsulated?
23. Why is `--add-opens` risky as permanent design?
24. What changed with Security Manager?
25. What is RandomGenerator?
26. RandomGenerator vs SecureRandom?
27. What are helpful NPEs?
28. What are private interface methods?
29. What changed in try-with-resources?
30. What are the main risks migrating Java 8 → 17?


---

<!-- 33_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary references:

- OpenJDK JEP index
- Java SE 17 API documentation
- Java Language Specification
- Oracle/OpenJDK release documentation

## Important Status Notes

### Final in / by Java 17

- Sealed Classes — final in Java 17
- Records — final before Java 17
- Pattern Matching for `instanceof` — final before Java 17
- Switch Expressions — final before Java 17
- Text Blocks — final before Java 17

### Preview in Java 17

- Pattern Matching for `switch`

## Scope

This pack intentionally includes both:

1. **features introduced specifically in Java 17**, and
2. **high-value Java 9→17 features expected from a Java 17 developer**.

That is the practical interview/enterprise interpretation of “Java 17 knowledge.”
