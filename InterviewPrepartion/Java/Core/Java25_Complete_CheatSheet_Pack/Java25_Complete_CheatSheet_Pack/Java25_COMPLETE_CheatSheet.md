# Java 25 Complete Cheat Sheet — Combined Edition

> Fast technical revision companion for Java 25.



---

<!-- 00_MASTER_INDEX.md -->

# Java 25 Complete Cheat Sheet Pack

**Purpose:** Fast revision for Java 25 interviews, enterprise development, Spring Boot, architecture, migration, performance, security, and training.

**Release context:** Java 25 reached GA on 16 September 2025.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open a topic and scan:

**What → Why → Syntax/API → Visual → Trap**

### 10 Minutes
Read:

**What → Why → How → Code → Internals → Trade-offs → Production Use → Interview Recall**

---

## Part A — Java 25 Final / Permanent Features

1. Java 25 Snapshot
2. Module Import Declarations
3. Compact Source Files & Instance Main Methods
4. Flexible Constructor Bodies
5. Scoped Values
6. Key Derivation Function API
7. Compact Object Headers
8. Ahead-of-Time Command-Line Ergonomics
9. Ahead-of-Time Method Profiling
10. JFR Cooperative Sampling
11. JFR Method Timing & Tracing

## Part B — Preview / Incubator / Experimental

12. Primitive Types in Patterns, `instanceof`, and `switch` — Third Preview
13. Structured Concurrency — Fifth Preview
14. Stable Values — Preview
15. PEM Encodings of Cryptographic Objects — Preview
16. Vector API — Tenth Incubator
17. JFR CPU-Time Profiling — Experimental

## Part C — Important Java 21→25 Practical Knowledge

18. Java 21 vs Java 25
19. ScopedValue vs ThreadLocal
20. Structured Concurrency vs CompletableFuture
21. StableValue vs `final`
22. Primitive Pattern Matching
23. Compact Programs vs Traditional Programs
24. Flexible Constructors
25. KDF vs KEM
26. PEM API Practical Recall
27. AOT Startup / Warmup
28. Compact Headers / Memory
29. JFR Modern Profiling
30. Java 21 → 25 Migration

## Part D — Production / Interview

31. Concurrency Decision Guide
32. Performance Checklist
33. Security Checklist
34. Production Checklist
35. Interview Traps
36. One-Page Code Recall
37. Commands / Preview Flags
38. Practice Questions
39. Sources & Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Java 25 — 30-Second Recall

## Formula

**Java 25 = Simpler Language + Final Scoped Context + Better Startup/Warmup + Lower Memory + Stronger Profiling + Modern Crypto APIs**

## Permanent / Final Highlights

```text
Module Import Declarations
Compact Source Files & Instance Main Methods
Flexible Constructor Bodies
Scoped Values
Key Derivation Function API
Compact Object Headers
AOT Command-Line Ergonomics
AOT Method Profiling
JFR Cooperative Sampling
JFR Method Timing & Tracing
```

## Non-Final Features

```text
Primitive Types in Patterns — Third Preview
Structured Concurrency — Fifth Preview
Stable Values — Preview
PEM Encodings — Preview
Vector API — Tenth Incubator
JFR CPU-Time Profiling — Experimental
```

## Key Interview Corrections

- Scoped Values are **final in Java 25**.
- Structured Concurrency is **still preview**.
- Compact Source Files and Instance Main Methods are **final**.
- Flexible Constructor Bodies are **final**.
- Primitive patterns remain **preview**.
- Vector API remains **incubator**.
- Compact Object Headers are opt-in in Java 25, not the default.


---

<!-- 02_JAVA25_SNAPSHOT.md -->

# Java 25 Snapshot

## Why Java 25 Matters

Java 25 is a major long-term enterprise baseline.

It advances Java across:

```text
Language Simplicity
 ├── Module imports
 ├── Compact source files
 ├── Instance main
 └── Flexible constructors

Concurrency
 ├── Scoped Values — final
 └── Structured Concurrency — preview

Runtime / Performance
 ├── Compact Object Headers
 ├── AOT cache ergonomics
 └── AOT method profiling

Monitoring
 ├── JFR CPU profiling
 ├── Cooperative sampling
 └── Method timing / tracing

Security
 ├── KDF API
 └── PEM API — preview
```

## Mental Model

Java 21 focused heavily on virtual-thread-era concurrency.

Java 25 strengthens the surrounding ecosystem:
**context propagation + startup/warmup + memory density + diagnostics + language simplification**.


---

<!-- 03_MODULE_IMPORT_DECLARATIONS.md -->

# Module Import Declarations — Final in Java 25

## What

Import all packages exported by a module with one declaration.

## Syntax

```java
import module java.base;
```

## Why

Useful when learning, scripting, prototyping, or using modular libraries with many exported packages.

## Traditional

```java
import java.util.List;
import java.util.Map;
import java.util.Set;
```

## Module Import

```java
import module java.base;
```

## Important

A module import does not require your source code itself to be in a named module.

## Visual

```text
Module
 ├── exported package A
 ├── exported package B
 └── exported package C
        ↓
 import module ...
        ↓
types become available for import resolution
```

## Trap

Module import declaration is not equivalent to Maven/Gradle dependency declaration.

It changes source-level imports, not dependency acquisition.


---

<!-- 04_COMPACT_SOURCE_MAIN.md -->

# Compact Source Files & Instance Main Methods — Final in Java 25

## Goal

Reduce ceremony for small programs and beginners without creating a separate Java dialect.

## Traditional

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

## Compact Style

```java
void main() {
    IO.println("Hello");
}
```

## Important Java 25 Detail

`IO` is in `java.lang`.

Its methods are not automatically statically imported, so write:

```java
IO.println("Hello");
```

unless you explicitly use a static import.

## Best Fit

- teaching
- small utilities
- examples
- scripting-like tasks
- interview demos

## Trap

This does not replace normal classes/packages for large applications.


---

<!-- 05_FLEXIBLE_CONSTRUCTOR_BODIES.md -->

# Flexible Constructor Bodies — Final in Java 25

## What

A constructor may execute permitted statements before an explicit `super(...)` or `this(...)` call.

## Example

```java
class PositiveNumber extends NumberBase {

    PositiveNumber(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("positive only");
        }

        super(value);
    }
}
```

## Why

Previously, explicit constructor invocation had to be the first statement.

Now you can:

```text
validate
prepare arguments
initialize permitted state
then
invoke super(...) / this(...)
```

## Benefit

Safer object construction and less need for awkward static helper methods.

## Important Restriction

The early-construction region cannot freely use the under-construction object as though initialization were complete.

## Trap

This is not permission to call arbitrary overridable instance methods before superclass construction.


---

<!-- 06_SCOPED_VALUES.md -->

# Scoped Values — Final in Java 25

## What

Scoped Values safely share contextual data with callees without passing it through every method parameter.

## Example

```java
private static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> processRequest());
```

Read:

```java
String user = USER.get();
```

## Mental Model

```text
Bind
 ↓
Dynamic Call Scope
 ├── method A
 │    └── method B reads value
 └── child structured tasks can inherit
 ↓
Scope ends
 ↓
binding automatically disappears
```

## Why Better Than ThreadLocal for One-Way Context

- bounded lifetime
- immutable binding
- no manual cleanup
- efficient with virtual threads
- structured inheritance

## Good Uses

```text
request identity
tenant
trace context
authorization context
locale
```

## Trap

ScopedValue became final in Java 25.

Do not keep describing it as preview if discussing Java 25.


---

<!-- 07_KDF_API.md -->

# Key Derivation Function API — Final in Java 25

## What

KDF APIs derive one or more cryptographic keys from secret key material plus context/data.

## Concept

```text
Input Secret
 + Salt / Context
 + Parameters
      ↓
     KDF
      ↓
Derived Key Material
```

## Why

Used in modern protocols and cryptographic constructions.

Examples include HKDF-based workflows.

## Important Distinction

```text
KDF → derives keys
KEM → establishes/encapsulates shared secret
Encryption → protects data confidentiality
```

## Security Rule

Use standard algorithms and trusted providers.

Never invent your own derivation protocol.

## Interview Trap

PBKDF2 and KDF use cases overlap conceptually but are not automatically the same API migration story.


---

<!-- 08_COMPACT_OBJECT_HEADERS.md -->

# Compact Object Headers — Java 25 Product Feature

## What

HotSpot can use a smaller object-header layout.

## Goal

Reduce heap footprint and improve data locality.

## Concept

```text
Before
Object = Header + Fields

Compact Headers
Object = Smaller Header + Fields
```

## Why It Matters

For applications with very large object counts:

```text
few bytes saved per object
×
millions of objects
=
meaningful heap reduction
```

## Java 25 Status

It is a product option, but remains disabled by default in Java 25.

## Enable

```bash
java -XX:+UseCompactObjectHeaders ...
```

## Measure

- heap usage
- allocation rate
- cache locality
- throughput
- latency
- compatibility

## Trap

Do not claim Compact Object Headers are default in Java 25.


---

<!-- 09_AOT_COMMAND_ERGONOMICS.md -->

# Ahead-of-Time Command-Line Ergonomics

## Goal

Make it easier to create and use AOT caches.

## Why

Java normally gathers runtime information during startup/warmup.

AOT caching can preserve useful artifacts ahead of subsequent runs.

## Mental Model

```text
Training / Preparation
       ↓
    AOT Cache
       ↓
Application Start
       ↓
less repeated startup work
```

## Benefits

Potentially improves:

- startup time
- warmup
- deployment responsiveness

## Good Fits

```text
microservices
CLI tools
short-lived processes
serverless-like workloads
frequent restarts
```

## Trap

AOT cache is sensitive to application/JDK/platform context.

Regenerate when relevant inputs change.


---

<!-- 10_AOT_METHOD_PROFILING.md -->

# Ahead-of-Time Method Profiling

## Problem

JIT compilers normally wait for runtime method profiles before aggressive optimization.

## Java 25 Direction

Persist method execution profile information from an earlier run and make it available earlier.

## Visual

```text
Previous Run
   ↓
Method Profiles
   ↓
AOT Cache
   ↓
Next Startup
   ↓
JIT gets profile earlier
   ↓
faster warmup potential
```

## Why

Important for workloads where peak performance is good but warmup is too slow.

## Trap

AOT profiling does not eliminate JIT compilation.

It helps the JIT make informed decisions sooner.


---

<!-- 11_JFR_COOPERATIVE_SAMPLING.md -->

# JFR Cooperative Sampling

## What

Improves stability when JFR samples Java thread stacks.

## Idea

Instead of walking stacks at arbitrary unsafe moments, sampling cooperates with JVM safepoint mechanisms while trying to avoid excessive bias.

## Why

Better:

```text
stability
stack-sampling reliability
profiling confidence
```

## Production Value

Useful for always-on or low-overhead diagnostic strategies.

## Trap

Sampling is statistical observation, not exact tracing of every method call.


---

<!-- 12_JFR_METHOD_TIMING_TRACING.md -->

# JFR Method Timing & Tracing

## What

JFR can time and trace selected methods using bytecode instrumentation.

## Why

Sometimes CPU samples answer:

```text
"where is CPU spent?"
```

but not:

```text
"how long does this exact method take?"
"how often is this method called?"
```

## Mental Model

```text
Selected Method
   ↓
Instrumentation
   ↓
JFR Event
   ↓
Timing / Trace Analysis
```

## Use Carefully

Instrumenting too broadly can create overhead.

Target high-value methods.

## Good Uses

- latency investigation
- method hot spots
- framework internals
- custom diagnostics


---

<!-- 13_PRIMITIVE_PATTERNS_PREVIEW.md -->

# Primitive Types in Patterns, `instanceof`, and `switch`
## Third Preview in Java 25

## Goal

Extend pattern matching beyond reference types to primitive values/types.

## Concept

```text
reference patterns
+
primitive patterns
=
more uniform pattern matching
```

## Example Direction

Primitive values can participate in pattern contexts and switch constructs under the preview feature.

## Why

Reduces awkward conversions and improves exhaustive type/value handling.

## Status

**Preview in Java 25.**

Compile/run with preview flags.

## Trap

Do not present primitive patterns as finalized Java 25 language syntax.


---

<!-- 14_STRUCTURED_CONCURRENCY.md -->

# Structured Concurrency — Fifth Preview in Java 25

## What

Treat related concurrent subtasks as one unit of work.

## Basic Shape

```java
try (var scope = StructuredTaskScope.open()) {

    var user = scope.fork(() -> loadUser());
    var orders = scope.fork(() -> loadOrders());

    scope.join();

    use(user.get(), orders.get());
}
```

## Default

The default scope uses virtual threads for subtasks.

## Mental Model

```text
Request
 ├── Load User
 └── Load Orders
       ↓
      join
       ↓
combined result
```

## Benefits

- bounded lifetime
- failure propagation
- cancellation
- easier observability
- natural virtual-thread composition

## Status

Preview API in Java 25.

## Trap

Scoped Values are final in Java 25; Structured Concurrency is not.


---

<!-- 15_STABLE_VALUES.md -->

# Stable Values — Preview in Java 25

## What

A StableValue is a holder whose contents can be set at most once.

## Example

```java
private static final StableValue<Logger> LOGGER =
    StableValue.of();
```

Conceptually initialize lazily:

```java
Logger logger =
    LOGGER.orElseSet(() -> createLogger());
```

## Goal

Provide deferred initialization while preserving "constant-like" semantics after initialization.

## Mental Model

```text
Unset
 ↓
compute at most once
 ↓
Set
 ↓
never changes
```

## Why

Traditional choices often trade between:

```text
final field → eager initialization
lazy field  → mutable synchronization complexity
```

Stable Values aim for deferred immutability.

## Status

Preview API.

## Trap

StableValue is not a general mutable container.

Once set, it cannot be replaced.


---

<!-- 16_PEM_API.md -->

# PEM Encodings of Cryptographic Objects — Preview

## What

Java 25 introduces preview APIs for encoding and decoding cryptographic objects using PEM format.

## Typical Objects

```text
keys
certificates
certificate revocation lists
```

## Visual

```text
Java Security Object
       ↓
    PEM Encoder
       ↓
-----BEGIN ...-----
Base64 / DER content
-----END ...-----
```

Reverse:

```text
PEM
 ↓
Decoder
 ↓
Java Security Object
```

## Why

PEM handling previously often required manual parsing or external libraries.

## Status

Preview API.

## Trap

PEM is an encoding/container format, not encryption by itself.


---

<!-- 17_VECTOR_API.md -->

# Vector API — Tenth Incubator in Java 25

## Goal

Express SIMD-friendly computations directly in Java.

## Scalar

```text
a0+b0
a1+b1
a2+b2
a3+b3
```

## Vector

```text
[a0 a1 a2 a3]
+
[b0 b1 b2 b3]
=
[c0 c1 c2 c3]
```

## Good Fits

- image processing
- signal processing
- scientific computing
- numeric kernels
- selected ML/data workloads

## Status

Still an incubator API in Java 25.

## Trap

Ten incubator rounds do not make it a normal final Java SE API.


---

<!-- 18_JFR_CPU_EXPERIMENTAL.md -->

# JFR CPU-Time Profiling — Experimental

## What

Adds more accurate CPU-time profiling information to JFR on Linux.

## Wall Time vs CPU Time

```text
Wall time
= waiting + blocked + sleeping + CPU

CPU time
= actual CPU execution
```

## Why

A method may be slow without consuming much CPU.

CPU-time profiling helps distinguish:

```text
compute bottleneck
vs
waiting bottleneck
```

## Status

Experimental in Java 25.

## Trap

Experimental JVM feature != preview Java SE API.


---

<!-- 19_JAVA21_VS_JAVA25.md -->

# Java 21 vs Java 25

| Area | Java 21 | Java 25 |
|---|---|---|
| Virtual Threads | final | mature baseline |
| Scoped Values | preview | final |
| Structured Concurrency | preview | fifth preview |
| Compact main/source | preview beginnings | final |
| Flexible Constructors | unavailable/future | final |
| Module Imports | unavailable | final |
| Primitive Patterns | unavailable | third preview |
| KDF API | unavailable | final |
| PEM API | unavailable | preview |
| Compact Headers | unavailable as product feature | product option |
| AOT Cache | less mature | easier + profiling |
| JFR | strong | expanded profiling/tracing |

## Interview Summary

Java 21 made lightweight concurrency mainstream.

Java 25 strengthens:
**context propagation, startup/warmup, language ergonomics, memory density, profiling, and crypto APIs**.


---

<!-- 20_SCOPEDVALUE_VS_THREADLOCAL.md -->

# ScopedValue vs ThreadLocal

| ThreadLocal | ScopedValue |
|---|---|
| mutable per-thread storage | immutable scoped binding |
| manual cleanup discipline | bounded automatically |
| can leak across pooled threads | binding ends with scope |
| inheritance can be costly | designed for structured inheritance |
| longstanding API | final since Java 25 |

## Best ScopedValue Use

```text
one-way context transmission
```

Examples:

```text
tenant
request identity
trace info
authorization context
```

## Rule

Use ThreadLocal when mutable per-thread state is genuinely needed.

Prefer ScopedValue for bounded immutable context.


---

<!-- 21_STRUCTURED_VS_COMPLETABLE.md -->

# Structured Concurrency vs CompletableFuture

| Structured Concurrency | CompletableFuture |
|---|---|
| parent-child task structure | async stage graph |
| lifecycle bounded by scope | lifecycle may be dispersed |
| natural with virtual threads | executor/future oriented |
| cancellation/failure easier to reason | flexible pipelines |
| preview Java 25 | final API |

## Structured Example

```text
HTTP Request
 ├── user task
 ├── order task
 └── pricing task
      ↓
     join
```

## CompletableFuture Example

```text
fetch
 ↓
transform
 ↓
combine
 ↓
recover
```

## Rule

Use the model that best represents the shape of work.


---

<!-- 22_STABLEVALUE_VS_FINAL.md -->

# StableValue vs `final`

| `final` field | StableValue |
|---|---|
| assigned during initialization | can be initialized later |
| constant reference after assignment | set at most once |
| simple and final API | preview API |
| ideal default | useful for deferred constants |

## Core Idea

```text
final
= immediate immutability

StableValue
= deferred immutability
```

## Rule

Prefer `final` when eager initialization is practical.

Do not introduce preview complexity without a real lazy-initialization need.


---

<!-- 23_PRIMITIVE_PATTERN_RECALL.md -->

# Primitive Pattern Matching Recall

## Evolution

```text
instanceof reference patterns
        ↓
record patterns
        ↓
switch patterns
        ↓
primitive patterns (preview)
```

## Goal

Make pattern matching more uniform across Java's type system.

## Think In Terms Of

```text
matching
conversion safety
exhaustiveness
switch readability
```

## Interview Trap

In Java 25, primitive pattern matching is not permanent yet.


---

<!-- 24_COMPACT_PROGRAMS_VS_TRADITIONAL.md -->

# Compact Programs vs Traditional Java Programs

## Compact

Best for:

```text
learning
examples
small utilities
quick experiments
coding demonstrations
```

## Traditional

Best for:

```text
enterprise apps
libraries
frameworks
domain architecture
multi-class systems
```

## Key Point

Compact source files simplify the starting point.

They do not remove Java's existing class/package/module model.


---

<!-- 25_FLEXIBLE_CONSTRUCTOR_RECALL.md -->

# Flexible Constructors — Quick Recall

## Before

```text
super(...) / this(...)
must be first
```

## Java 25

```text
validation / permitted preparation
        ↓
super(...) / this(...)
        ↓
rest of construction
```

## Good Pattern

```java
Child(int value) {
    if (value < 0) throw new IllegalArgumentException();
    super(value);
}
```

## Why

Validation can happen before superclass side effects.

## Trap

Object construction still has strict safety rules.


---

<!-- 26_KDF_VS_KEM.md -->

# KDF vs KEM

| KDF | KEM |
|---|---|
| derive keys from secret material | establish/encapsulate shared secret |
| e.g. HKDF workflows | public-key-oriented key establishment |
| Java 25 KDF API final | KEM API already available from earlier Java |

## Typical Flow Together

```text
KEM
 ↓
Shared Secret
 ↓
KDF
 ↓
Application Keys
 ↓
Encryption / Authentication
```

## Interview Insight

KEM and KDF solve different layers of the key-management problem.


---

<!-- 27_PEM_PRACTICAL_RECALL.md -->

# PEM Practical Recall

## PEM Shape

```text
-----BEGIN PUBLIC KEY-----
...
-----END PUBLIC KEY-----
```

## PEM Usually Wraps

DER-encoded binary material represented textually.

## Common Developer Tasks

```text
read certificate
read public/private key
write certificate
exchange key material
```

## Java 25 Advantage

Preview API aims to reduce hand-written PEM parsing/encoding.

## Security Rule

Encoding a private key as PEM does not make it safe.

Protect access and encrypt sensitive key material appropriately.


---

<!-- 28_AOT_STARTUP_WARMUP.md -->

# AOT Startup & Warmup Cheat Sheet

## Startup

Time until application can begin useful work.

## Warmup

Time until runtime/JIT reaches desired optimized performance.

## Java 25 AOT Story

```text
Training Run
 ↓
AOT Cache
 ├── classes / heap artifacts
 └── method profiles
 ↓
Next Run
 ↓
faster startup / earlier optimization
```

## Good Metrics

```text
time-to-first-request
time-to-steady-state
startup CPU
startup memory
p95 during warmup
```

## Trap

Fast startup and fast steady-state performance are different goals.


---

<!-- 29_COMPACT_HEADERS_MEMORY.md -->

# Compact Headers & Memory Density

## Why Object Headers Matter

Object-heavy applications pay header overhead for every object.

Example mental math:

```text
4 bytes saved
× 10,000,000 objects
≈ 40 MB
```

(actual results vary)

## Potential Benefits

```text
smaller heap
better cache locality
higher deployment density
less memory bandwidth
```

## Validate

Run representative benchmarks.

Check:

```text
heap
GC
CPU
throughput
latency
```


---

<!-- 30_JFR_MODERN_PROFILING.md -->

# JFR Modern Profiling — Java 25

## Three Java 25 JFR Improvements

```text
CPU-Time Profiling — experimental
Cooperative Sampling
Method Timing & Tracing
```

## Decision Guide

Need hot CPU areas?

```text
CPU sampling
```

Need exact selected method timing?

```text
method timing/tracing
```

Need broad low-overhead production diagnostics?

```text
JFR event recording + sampling
```

## Rule

Use the least intrusive technique that answers the question.


---

<!-- 31_MIGRATION_21_TO_25.md -->

# Java 21 → Java 25 Migration

## Safe Flow

```text
Inventory
 ↓
Update build/toolchain
 ↓
Run on JDK 25
 ↓
Fix library/agent incompatibility
 ↓
Regression tests
 ↓
Performance baseline
 ↓
Staging
 ↓
Controlled rollout
```

## Then Modernize

Evaluate separately:

```text
Scoped Values
Compact Headers
AOT
KDF
new language features
JFR improvements
```

## Risk Areas

- bytecode agents
- profilers
- instrumentation
- JVM flags
- frameworks
- native dependencies
- preview-feature code

## Rule

Migration first.

Feature adoption second.


---

<!-- 32_CONCURRENCY_DECISION_GUIDE.md -->

# Java 25 Concurrency Decision Guide

## Many Blocking I/O Tasks

```text
Virtual Threads
```

## Immutable Request Context

```text
Scoped Values
```

## Related Child Tasks

```text
Structured Concurrency
```

if preview APIs are allowed.

## Async Dataflow Pipeline

```text
CompletableFuture
```

## CPU Parallelism

```text
ForkJoinPool
parallel algorithms
Vector API for specialized numeric workloads
```

## Durable Background Work

```text
queue / broker / scheduler
```

not merely in-memory threads.

## Rule

Match concurrency model to workload, not trend.


---

<!-- 33_PERFORMANCE_CHECKLIST.md -->

# Java 25 Performance Checklist

## Measure First

```text
startup
warmup
throughput
p50/p95/p99
CPU
heap
allocation
GC
thread count
virtual-thread count
locks
DB saturation
network latency
```

## Java 25-Specific Opportunities

- Compact Object Headers
- AOT cache
- AOT method profiling
- JFR CPU profiling
- JFR method tracing
- Vector API for specialized work

## Rule

Enable one optimization at a time and re-measure.


---

<!-- 34_SECURITY_CHECKLIST.md -->

# Java 25 Security Checklist

## Crypto

- [ ] use KDF API correctly
- [ ] use standard algorithms/providers
- [ ] do not invent crypto
- [ ] distinguish KDF / KEM / encryption
- [ ] protect key material

## PEM

- [ ] preview API policy reviewed
- [ ] private-key storage protected
- [ ] certificate validation remains separate

## TLS / Runtime

- [ ] current patch version
- [ ] disabled algorithms reviewed
- [ ] secrets externalized
- [ ] secure random source used where required

## General

- [ ] dependency scanning
- [ ] least privilege
- [ ] serialization boundaries
- [ ] audit sensitive operations


---

<!-- 35_PRODUCTION_CHECKLIST.md -->

# Java 25 Production Checklist

## Version

- [ ] supported JDK 25 distribution
- [ ] current security patch
- [ ] build and runtime versions aligned

## Feature Status

- [ ] no accidental preview dependency
- [ ] preview flags documented
- [ ] incubator modules documented
- [ ] experimental JVM features isolated

## Performance

- [ ] startup baseline
- [ ] warmup baseline
- [ ] GC baseline
- [ ] JFR diagnostics ready
- [ ] compact headers tested before enabling

## Concurrency

- [ ] virtual-thread limits understood
- [ ] ScopedValue usage bounded
- [ ] Structured Concurrency policy reviewed

## Operations

- [ ] rollback
- [ ] metrics
- [ ] traces
- [ ] logs
- [ ] JFR


---

<!-- 36_INTERVIEW_TRAPS.md -->

# Java 25 Interview Traps

1. Java 25 GA was released in September 2025.
2. Scoped Values are final in Java 25.
3. Structured Concurrency remains preview.
4. Primitive patterns remain preview.
5. Stable Values are preview.
6. PEM Encodings API is preview.
7. Vector API remains incubator.
8. JFR CPU-Time Profiling is experimental.
9. Module Import Declarations are final.
10. Compact Source Files and Instance Main Methods are final.
11. Flexible Constructor Bodies are final.
12. Compact Source Files are not a separate Java dialect.
13. Module imports do not replace dependency management.
14. ScopedValue is not mutable ThreadLocal replacement.
15. StableValue is set-at-most-once, not a mutable reference.
16. KDF != KEM.
17. PEM != encryption.
18. Compact Object Headers are not default in Java 25.
19. AOT method profiles help warmup; they do not eliminate JIT.
20. StructuredTaskScope uses virtual threads by default.
21. Preview != experimental != incubator.
22. New Java syntax does not automatically improve runtime performance.
23. Migration and modernization should be separate risk steps.


---

<!-- 37_ONE_PAGE_CODE_RECALL.md -->

# Java 25 — One-Page Code Recall

## Module Import

```java
import module java.base;
```

## Compact Main

```java
void main() {
    IO.println("Hello");
}
```

## Flexible Constructor

```java
Child(int x) {
    if (x < 0) throw new IllegalArgumentException();
    super(x);
}
```

## ScopedValue

```java
static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> work());
```

## Structured Concurrency — Preview

```java
try (var scope = StructuredTaskScope.open()) {
    var a = scope.fork(() -> taskA());
    var b = scope.fork(() -> taskB());

    scope.join();

    use(a.get(), b.get());
}
```

## StableValue — Preview

```java
static final StableValue<Service> SERVICE =
    StableValue.of();

Service s =
    SERVICE.orElseSet(() -> createService());
```

## Compact Headers

```bash
java -XX:+UseCompactObjectHeaders -jar app.jar
```

## Preview Compile

```bash
javac --enable-preview --release 25 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```


---

<!-- 38_COMMANDS_PREVIEW_FLAGS.md -->

# Java 25 Commands / Preview Flags

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

## Preview Compile

```bash
javac --enable-preview --release 25 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```

## JFR

```bash
jcmd
jfr
```

Typical diagnostic ecosystem:

```text
jcmd
jstack
jmap
jstat
jfr
Java Mission Control
```

## Compact Headers

```bash
java -XX:+UseCompactObjectHeaders ...
```

## Rule

Do not copy JVM flags from older Java versions without validating them on Java 25.


---

<!-- 39_PRACTICE_QUESTIONS.md -->

# Java 25 Practice Questions

1. Why is Java 25 significant?
2. Which Java 25 language features became permanent?
3. What is a module import declaration?
4. Module import vs Maven dependency?
5. What is a compact source file?
6. How does instance `main` work?
7. What changed with `IO` in Java 25?
8. What are Flexible Constructor Bodies?
9. What can execute before `super()`?
10. What are Scoped Values?
11. ScopedValue vs ThreadLocal?
12. Are Scoped Values preview in Java 25?
13. What is Structured Concurrency?
14. Is Structured Concurrency final?
15. What changed in StructuredTaskScope?
16. What are Stable Values?
17. StableValue vs final field?
18. What are primitive patterns?
19. Are primitive patterns final?
20. What is the KDF API?
21. KDF vs KEM?
22. What is the PEM API?
23. Why is PEM not encryption?
24. What are Compact Object Headers?
25. Are compact headers default?
26. What is an AOT cache?
27. What is AOT method profiling?
28. Startup vs warmup?
29. What is JFR cooperative sampling?
30. What is JFR method timing/tracing?
31. CPU time vs wall time?
32. What is the status of JFR CPU profiling?
33. Why is Vector API still incubator?
34. What should be checked migrating 21→25?
35. Which Java 25 features are safest to adopt first?
36. Preview vs incubator vs experimental?


---

<!-- 40_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary official sources used for this pack:

- OpenJDK JEP documentation
- Oracle Java SE 25 Language Updates
- Oracle JDK 25 Release Notes
- Java SE 25 API documentation
- Oracle Java 25 Core Libraries documentation

## Java 25 JEP-Level Feature Status

### Final / Permanent / Product Features

- JEP 511 — Module Import Declarations
- JEP 512 — Compact Source Files and Instance Main Methods
- JEP 513 — Flexible Constructor Bodies
- JEP 506 — Scoped Values
- JEP 510 — Key Derivation Function API
- JEP 519 — Compact Object Headers
- JEP 514 — Ahead-of-Time Command-Line Ergonomics
- JEP 515 — Ahead-of-Time Method Profiling
- JEP 518 — JFR Cooperative Sampling
- JEP 520 — JFR Method Timing & Tracing

### Preview

- JEP 507 — Primitive Types in Patterns, `instanceof`, and `switch` (Third Preview)
- JEP 505 — Structured Concurrency (Fifth Preview)
- JEP 502 — Stable Values (Preview)
- JEP 470 — PEM Encodings of Cryptographic Objects (Preview)

### Incubator

- JEP 508 — Vector API (Tenth Incubator)

### Experimental

- JEP 509 — JFR CPU-Time Profiling

## Release

Java 25 GA: 16 September 2025.

## Revision Rule

For production deployment, always verify:
- exact JDK vendor
- current patch release
- target framework compatibility
- preview/incubator policy
