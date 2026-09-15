# Java 21 Complete Cheat Sheet — Combined Edition

> Fast technical revision companion for Java 21.



---

<!-- 00_MASTER_INDEX.md -->

# Java 21 Complete Cheat Sheet Pack

**Purpose:** Fast revision for Java 21 interviews, enterprise development, Spring Boot, architecture discussions, migration work, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open the topic file and scan:
**What → Why → Syntax → Visual → Trap**

### 10 Minutes
Read:
**What → Why → Code → Internals → Trade-offs → Production Use → Interview Recall**

---

## Part A — Java 21 Final / Production-Ready Features

1. Java 21 Snapshot
2. Virtual Threads
3. Pattern Matching for `switch`
4. Record Patterns
5. Sequenced Collections
6. Generational ZGC
7. Key Encapsulation Mechanism (KEM) API

## Part B — Java 21 Preview / Incubator Features

8. Scoped Values — Preview
9. Structured Concurrency — Preview
10. Unnamed Patterns & Variables — Preview
11. Unnamed Classes & Instance Main Methods — Preview
12. String Templates — Preview in Java 21
13. Foreign Function & Memory API — Third Preview
14. Vector API — Sixth Incubator

## Part C — Platform / Runtime Changes

15. Dynamic Agent Loading Warning
16. Windows 32-bit x86 Deprecation
17. JVM / GC / Performance Recall

## Part D — Practical Java 17 → 21 Developer Knowledge

18. Java 17 vs Java 21
19. Java 17 → 21 Migration
20. Virtual Threads vs Platform Threads
21. Scoped Values vs ThreadLocal
22. Structured Concurrency vs CompletableFuture
23. Sequenced Collections vs Legacy Collections
24. Pattern Matching Combined Recall
25. FFM vs JNI
26. Concurrency Decision Guide

## Part E — Interview / Production

27. Interview Traps
28. One-Page Code Recall
29. Commands / Preview Flags
30. Production Checklist
31. Performance Checklist
32. Practice Questions
33. Sources / Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Java 21 — 30-Second Recall

## Formula

**Java 21 = Modern Pattern Matching + Lightweight Concurrency + Ordered Collections + GC Evolution + Native Interop Evolution**

## Final Features to Remember

```text
Virtual Threads
Pattern Matching for switch
Record Patterns
Sequenced Collections
Generational ZGC
KEM API
```

## Preview / Incubator in Java 21

```text
Scoped Values — Preview
Structured Concurrency — Preview
Unnamed Patterns & Variables — Preview
Unnamed Classes & Instance Main Methods — Preview
String Templates — Preview
FFM API — Third Preview
Vector API — Sixth Incubator
```

## Key Example

```java
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> handleRequest());
}
```

```java
static String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "int " + i;
        case String s when !s.isBlank() -> "text " + s;
        case null -> "null";
        default -> "other";
    };
}
```

## Interview Traps

- Virtual threads improve scalability for blocking tasks; they do not make CPU work faster.
- Pattern Matching for `switch` is **final in Java 21**.
- Record Patterns are **final in Java 21**.
- Scoped Values are **preview** in Java 21.
- Structured Concurrency is **preview** in Java 21.
- FFM is still **preview** in Java 21.
- Vector API is still **incubator** in Java 21.
- String Templates were preview in Java 21 and later withdrawn from the platform before finalization.


---

<!-- 02_JAVA21_SNAPSHOT.md -->

# Java 21 Snapshot

## Why Java 21 Matters

Java 21 is an LTS-era release that significantly modernizes Java in four directions:

```text
Language
 ├── Pattern Matching for switch
 ├── Record Patterns
 ├── Unnamed patterns/variables (preview)
 ├── Unnamed classes/main (preview)
 └── String templates (preview)

Concurrency
 ├── Virtual Threads
 ├── Scoped Values (preview)
 └── Structured Concurrency (preview)

Collections / Runtime
 ├── Sequenced Collections
 ├── Generational ZGC
 └── Dynamic-agent loading changes

Interop / Performance
 ├── FFM API (preview)
 ├── Vector API (incubator)
 └── KEM API
```

## Real-Life Analogy

Java 17 modernized the language model.

Java 21 pushes further into:
**high-concurrency server workloads + more expressive data decomposition + safer ordered collection APIs + modern native integration**.


---

<!-- 03_VIRTUAL_THREADS.md -->

# Virtual Threads — Final in Java 21

## What

Virtual threads are lightweight JVM-managed threads.

## Why

Traditional platform threads are expensive when an application creates huge numbers of blocking tasks.

Virtual threads allow a familiar:

```text
one task
→ one thread
```

programming model at much larger scale.

## Basic Example

```java
Thread.startVirtualThread(() -> {
    System.out.println("running");
});
```

## Executor

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    Future<String> future =
        executor.submit(() -> loadData());

    System.out.println(future.get());
}
```

## Mental Model

```text
Thousands / Millions of Virtual Threads
                ↓
            JVM Scheduler
                ↓
       Carrier Platform Threads
                ↓
              CPU
```

## Best Fit

```text
HTTP calls
DB calls
file I/O
network I/O
blocking APIs
request-per-thread servers
```

## Poor Fit

Pure CPU-bound work.

## Important

Virtual threads remove the need to use tiny thread pools merely to protect thread count.

They do **not** remove the need to protect scarce resources such as:

```text
DB connections
remote APIs
rate limits
memory
CPU
```

## Pinning / Blocking Concern

Certain blocking situations around monitor usage/native operations can reduce scalability.

## Interview Line

> Virtual threads make blocking code scalable; they do not make blocking operations themselves faster.


---

<!-- 04_PATTERN_SWITCH.md -->

# Pattern Matching for `switch` — Final in Java 21

## Example

```java
static String format(Object obj) {
    return switch (obj) {
        case Integer i -> "int: " + i;
        case Long l -> "long: " + l;
        case String s -> "text: " + s;
        case null -> "null";
        default -> "other";
    };
}
```

## Guarded Pattern

```java
case String s when s.length() > 10 -> "long text";
```

## Why

Combines:

```text
type testing
+ variable extraction
+ branching
```

## Exhaustiveness

With sealed hierarchies, switch can model all valid subtypes cleanly.

## Example

```java
sealed interface Shape permits Circle, Rectangle {}

record Circle(double radius) implements Shape {}
record Rectangle(double w, double h) implements Shape {}

static double area(Shape s) {
    return switch (s) {
        case Circle c -> Math.PI * c.radius() * c.radius();
        case Rectangle r -> r.w() * r.h();
    };
}
```

## Trap

Dominated cases cause compile-time errors.

Order patterns from more specific to more general where required.


---

<!-- 05_RECORD_PATTERNS.md -->

# Record Patterns — Final in Java 21

## What

Record patterns deconstruct record values directly.

## Record

```java
record Point(int x, int y) {}
```

## Pattern

```java
if (obj instanceof Point(int x, int y)) {
    System.out.println(x + "," + y);
}
```

## Nested Pattern

```java
record Address(String city) {}
record User(String name, Address address) {}

if (obj instanceof User(
        String name,
        Address(String city))) {

    System.out.println(name + " - " + city);
}
```

## Why

Avoids repetitive accessor calls.

## Visual

```text
User
 ├── name
 └── Address
      └── city

Pattern
 ↓
extract name + city directly
```

## Great Fit

- immutable domain data
- algebraic-style data models
- sealed hierarchies
- switch pattern matching

## Trap

Record patterns deconstruct record state; they do not change record immutability rules.


---

<!-- 06_SEQUENCED_COLLECTIONS.md -->

# Sequenced Collections — Final in Java 21

## Problem

Java collections had multiple ordered types but no common API for:

```text
first element
last element
reversed view
```

## New Interfaces

```text
SequencedCollection
SequencedSet
SequencedMap
```

## Common Operations

```java
getFirst()
getLast()
addFirst()
addLast()
removeFirst()
removeLast()
reversed()
```

## Example

```java
List<String> list =
    new ArrayList<>(List.of("A", "B", "C"));

System.out.println(list.getFirst()); // A
System.out.println(list.getLast());  // C
```

## Reversed View

```java
var reversed = list.reversed();
```

## Map Recall

Sequenced maps provide ordered first/last entry operations and reversed views.

## Why

Consistent ordered-collection semantics across APIs.

## Trap

`reversed()` can be a view, not necessarily a full independent copy.


---

<!-- 07_GENERATIONAL_ZGC.md -->

# Generational ZGC — Java 21

## What

ZGC gained generational capability.

## Why

Most objects die young.

A generational collector exploits this by treating:

```text
young objects
and
long-lived objects
```

differently.

## Mental Model

```text
Allocation
   ↓
Young Generation
   ├── dies quickly → reclaim
   └── survives → older generation
```

## Goal

Maintain ZGC's low-pause design while improving efficiency for common allocation patterns.

## Good Use Cases

- large heaps
- latency-sensitive services
- workloads with strict pause goals

## Measure

```text
allocation rate
GC CPU
pause time
heap occupancy
p95/p99 latency
```

## Trap

Do not select ZGC only because it is newer.

Choose based on measured workload characteristics.


---

<!-- 08_KEM_API.md -->

# Key Encapsulation Mechanism (KEM) API — Final in Java 21

## What

KEM APIs support cryptographic key encapsulation workflows.

## Conceptual Flow

```text
Receiver Key Pair
      ↓
Sender Encapsulates
      ↓
Shared Secret + Encapsulation Message
      ↓
Receiver Decapsulates
      ↓
Same Shared Secret
```

## Why

KEM is important in modern cryptographic protocol design, including post-quantum cryptography work.

## Security Rule

Use vetted algorithms/providers and protocol standards.

Do not invent cryptographic protocols.

## Interview Recall

KEM solves **shared-key establishment/encapsulation**, not general-purpose data encryption by itself.


---

<!-- 09_SCOPED_VALUES.md -->

# Scoped Values — Preview in Java 21

## What

Scoped Values provide a way to share immutable contextual data with callees within a bounded execution scope.

## Why

They address problems often handled with `ThreadLocal`.

## Concept

```text
Bind Context
   ↓
Call Tree
   ↓
Nested Methods Read Context
   ↓
Scope Ends
```

## Example Concept

```java
static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> process());
```

## Good Use

- request context
- identity/context propagation
- tracing metadata
- structured concurrent tasks

## Benefits vs ThreadLocal

```text
bounded lifetime
immutable binding
better fit with virtual threads
clearer context ownership
```

## Trap

Scoped Values are preview in Java 21.

Do not present them as fully final Java 21 API.


---

<!-- 10_STRUCTURED_CONCURRENCY.md -->

# Structured Concurrency — Preview in Java 21

## Problem

Unstructured async code can scatter task lifecycle management.

## Goal

Treat a group of related concurrent tasks as one unit.

## Mental Model

```text
Parent Task
 ├── Child Task A
 ├── Child Task B
 └── Child Task C

Parent waits / fails / cancels as a unit
```

## Why

Improves:

- cancellation
- failure handling
- observability
- lifecycle management
- reasoning about concurrent work

## Example Concept

A request may need:

```text
Load User
Load Orders
Load Recommendations
```

These tasks conceptually belong to one parent request scope.

## Compared With CompletableFuture

Structured concurrency emphasizes **task lifetime structure**.

CompletableFuture emphasizes **completion-stage composition**.

## Trap

Structured Concurrency is preview in Java 21.


---

<!-- 11_UNNAMED_PATTERNS_VARIABLES.md -->

# Unnamed Patterns & Variables — Preview in Java 21

## Goal

Express that a variable/pattern component is intentionally unused.

## Idea

Instead of inventing meaningless names:

```text
ignored
unused
x
```

use underscore in supported preview contexts.

## Why

Communicates intent:

```text
value exists
but
we do not care about it
```

## Example Concept

Useful in:

- record decomposition
- exception handling
- loops
- lambda parameters
- local variables

## Trap

This is preview in Java 21 and requires preview compilation/runtime flags where applicable.


---

<!-- 12_UNNAMED_CLASSES_MAIN.md -->

# Unnamed Classes & Instance Main Methods — Preview in Java 21

## Goal

Reduce ceremony for beginner/small programs.

## Traditional

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

## Preview Direction

Allows simpler source forms and instance main methods.

## Why

Makes Java easier for:

- first programs
- teaching
- small scripts/examples

## Production Perspective

This is not an architecture feature for large enterprise applications.

## Trap

Preview in Java 21.


---

<!-- 13_STRING_TEMPLATES.md -->

# String Templates — Preview in Java 21

## Status

String Templates were previewed in Java 21.

They were later re-previewed and then withdrawn before becoming a final Java feature.

## Why They Were Proposed

To improve string interpolation while allowing processors to validate/transform embedded values.

## Concept

```text
Template
 + Embedded Expressions
 + Processor
        ↓
Result
```

## Historical Example Concept

```java
STR."Hello \{name}"
```

## Critical Interview Note

Do **not** present String Templates as a current finalized Java language feature.

For Java 21 historical knowledge, remember:

```text
Preview in 21
not finalized
later withdrawn
```


---

<!-- 14_FFM_API.md -->

# Foreign Function & Memory API — Third Preview in Java 21

## Goal

Provide safer, more modern native interoperability than JNI for many use cases.

## Two Main Areas

```text
Foreign Memory
Foreign Functions
```

## Concept

```text
Java
 ↓
MemorySegment / Arena
 ↓
Native Memory

Java
 ↓
Linker / Function Descriptor
 ↓
Native Function
```

## Why

JNI can be:

- verbose
- fragile
- difficult to maintain
- hard to reason about safely

## FFM Benefits

- structured memory lifetime
- better Java API model
- native function linking
- reduced JNI boilerplate

## Trap

FFM is **third preview** in Java 21.

It became final in a later Java release, not Java 21.


---

<!-- 15_VECTOR_API.md -->

# Vector API — Sixth Incubator in Java 21

## Goal

Express vector computations that can map efficiently to CPU SIMD instructions.

## Scalar

```text
a[0] + b[0]
a[1] + b[1]
a[2] + b[2]
...
```

## Vector

```text
[A0 A1 A2 A3]
+
[B0 B1 B2 B3]
=
[C0 C1 C2 C3]
```

## Good Fits

- numeric workloads
- image processing
- signal processing
- scientific computing
- ML primitives

## Trade-off

More specialized than ordinary Java loops.

## Trap

Vector API is an incubator API in Java 21.

Do not treat it as a stable ordinary Java SE API.


---

<!-- 16_DYNAMIC_AGENT_LOADING.md -->

# Dynamic Agent Loading — Java 21 Warning Direction

## What Changed

Java 21 prepares for a future where dynamically loading agents into a running JVM is disallowed by default.

## Why

Dynamic agent loading changes running JVM behavior and has security/integrity implications.

## Impact Areas

- profiling tools
- monitoring agents
- bytecode instrumentation
- some mocking/testing tools
- observability agents

## Production Rule

Prefer explicit startup-time agent configuration where possible.

## Migration

If a tool emits warnings:

1. identify the agent
2. upgrade the tool
3. follow vendor guidance
4. avoid depending on silent runtime attachment long term


---

<!-- 17_WINDOWS_X86_DEPRECATION.md -->

# Windows 32-bit x86 Port — Deprecated for Removal

## What

Java 21 deprecated the Windows 32-bit x86 port for removal.

## Why

Modern production Java workloads overwhelmingly target 64-bit environments.

## Migration Rule

Move legacy 32-bit Windows workloads to supported 64-bit environments.

## Interview Value

Low-frequency topic, but useful for complete Java 21 release awareness.


---

<!-- 18_JVM_GC_PERFORMANCE.md -->

# JVM / GC / Performance Recall

## Java 21 Runtime Themes

```text
Virtual-thread scalability
Generational ZGC
JFR / diagnostics
modern container deployment
strong runtime observability
```

## Performance Layers

```text
Algorithm
 ↓
Allocation
 ↓
Threads / Virtual Threads
 ↓
Locks / Contention
 ↓
GC
 ↓
I/O
 ↓
Database / Network
```

## Tools

```text
jcmd
jstack
jmap
jstat
jfr
Java Flight Recorder
Mission Control
async-profiler (external)
```

## Rule

Profile first.

Do not assume:
- more threads = more throughput
- newer GC = better
- virtual threads = faster CPU


---

<!-- 19_JAVA17_VS_JAVA21.md -->

# Java 17 vs Java 21

| Area | Java 17 | Java 21 |
|---|---|---|
| LTS generation | earlier | newer |
| Sealed classes | final | available |
| Records | available | available |
| Pattern `instanceof` | available | available |
| Pattern `switch` | preview | final |
| Record patterns | preview-era path | final |
| Virtual threads | not final | final |
| Sequenced collections | absent | final |
| ZGC | non-generational baseline | generational capability |
| Scoped values | absent | preview |
| Structured concurrency | absent | preview |
| FFM | earlier incubator/preview evolution | third preview |
| KEM API | absent | final |

## Interview Summary

Java 17 is a strong modern baseline.

Java 21 adds major value for:
**high-concurrency blocking services + expressive pattern matching + ordered collection APIs + runtime evolution**.


---

<!-- 20_MIGRATION_17_TO_21.md -->

# Migration from Java 17 to Java 21

## Safe Flow

```text
Inventory libraries
 ↓
Run build/tests on JDK 21
 ↓
Upgrade incompatible dependencies
 ↓
Review agents/instrumentation
 ↓
Review JVM flags
 ↓
Benchmark
 ↓
Staging
 ↓
Controlled rollout
```

## Main Risk Areas

```text
bytecode agents
old profilers
old mocking/instrumentation tools
JVM flags
native integrations
unsupported libraries
preview feature usage
GC tuning assumptions
```

## Opportunity Areas

After migration, evaluate:

```text
Virtual Threads
Pattern switch
Record Patterns
Sequenced Collections
Generational ZGC
```

## Rule

Migration success first.

Feature modernization second.


---

<!-- 21_VTHREADS_VS_PLATFORM.md -->

# Virtual Threads vs Platform Threads

| Platform Thread | Virtual Thread |
|---|---|
| OS-thread backed | JVM-managed lightweight thread |
| expensive at huge counts | designed for huge counts |
| thread pools common | thread-per-task feasible |
| good for CPU work too | best value for blocking I/O concurrency |
| scarce | plentiful |

## Important Shared Limits

Both ultimately compete for:

```text
CPU
DB connections
remote service capacity
memory
locks
```

## Decision

Use virtual threads when:

```text
many concurrent tasks
+ blocking APIs
+ simple imperative code
```

Do not expect:

```text
CPU algorithm speedup
```


---

<!-- 22_SCOPED_VALUE_VS_THREADLOCAL.md -->

# ScopedValue vs ThreadLocal

| ThreadLocal | ScopedValue |
|---|---|
| mutable per-thread state | immutable scoped binding |
| cleanup discipline required | lexical/bounded scope |
| familiar legacy approach | better structured-context model |
| can be problematic at scale | designed with modern concurrency in mind |
| final API | preview in Java 21 |

## Typical Context

```text
request ID
user identity
trace context
tenant context
```

## Rule

Do not replace ThreadLocal mechanically.

Adopt ScopedValue only when preview-feature policy allows it.


---

<!-- 23_STRUCTURED_VS_COMPLETABLE.md -->

# Structured Concurrency vs CompletableFuture

| Structured Concurrency | CompletableFuture |
|---|---|
| task lifecycle structure | completion-stage composition |
| parent-child concurrency | graph/pipeline composition |
| strong cancellation model | flexible async chaining |
| natural with virtual threads | often executor/future oriented |
| preview in Java 21 | final API |

## Use Structured Concurrency Conceptually For

```text
one request
→ multiple related child tasks
→ one combined lifecycle
```

## Use CompletableFuture For

```text
async transformations
dependent stages
event-style completion pipelines
```


---

<!-- 24_SEQUENCED_VS_LEGACY.md -->

# Sequenced Collections vs Legacy Collection APIs

## Before Java 21

Ordered collections had inconsistent first/last/reverse APIs.

## Java 21

Common sequencing abstraction:

```text
SequencedCollection
 ├── List
 └── ordered set implementations

SequencedMap
 └── ordered map implementations
```

## Recall

```java
collection.getFirst();
collection.getLast();
collection.reversed();
```

## Benefit

Code can program to **sequence semantics**, not specific collection implementation details.


---

<!-- 25_PATTERN_MATCHING_RECALL.md -->

# Pattern Matching — Combined Recall

## `instanceof`

```java
if (obj instanceof String s) {
    ...
}
```

## Record Pattern

```java
if (obj instanceof Point(int x, int y)) {
    ...
}
```

## Switch Pattern

```java
return switch (obj) {
    case String s -> ...
    case Integer i -> ...
    default -> ...
};
```

## Sealed + Record + Switch

```text
sealed hierarchy
      +
records
      +
record patterns
      +
switch patterns
      =
very expressive domain modeling
```

## Interview Insight

This is one of the biggest language-modeling improvements in modern Java.


---

<!-- 26_FFM_VS_JNI.md -->

# FFM vs JNI

| FFM API | JNI |
|---|---|
| modern Java API | native interface model |
| structured memory access | more manual native glue |
| linker abstractions | native wrapper code common |
| easier composition | verbose and fragile |
| preview in Java 21 | long-standing final mechanism |

## Use Case

Calling:

```text
C libraries
native operating-system APIs
high-performance native code
```

## Rule

In Java 21, FFM is preview.

JNI remains relevant for stable production use where preview APIs are not allowed.


---

<!-- 27_CONCURRENCY_DECISION_GUIDE.md -->

# Java 21 Concurrency Decision Guide

## Blocking I/O Service

```text
Virtual Threads
```

## Related Child Tasks Per Request

```text
Virtual Threads
+ Structured Concurrency (if preview allowed)
```

## Context Propagation

```text
Scoped Values (if preview allowed)
```

## Async Pipeline

```text
CompletableFuture
```

## CPU Parallelism

Consider:

```text
ForkJoinPool
parallel algorithms
Vector API for suitable numeric work
```

## Durable Background Processing

Use:

```text
queue / broker / job platform
```

not merely threads.

## Key Rule

Concurrency model should match the workload:

```text
CPU-bound
I/O-bound
latency-sensitive
throughput-sensitive
durable
request-scoped
```


---

<!-- 28_INTERVIEW_TRAPS.md -->

# Java 21 Interview Traps

1. Virtual threads are final in Java 21.
2. Virtual threads do not make CPU-bound code faster.
3. Virtual threads do not remove DB pool limits.
4. Pattern Matching for switch is final in Java 21.
5. Record Patterns are final in Java 21.
6. Scoped Values are preview in Java 21.
7. Structured Concurrency is preview in Java 21.
8. FFM API is third preview in Java 21.
9. Vector API is sixth incubator in Java 21.
10. String Templates are preview in Java 21, not final.
11. String Templates were later withdrawn before finalization.
12. Unnamed Patterns/Variables are preview in Java 21.
13. Unnamed Classes/Instance Main are preview in Java 21.
14. Sequenced collections add common first/last/reverse semantics.
15. `reversed()` may be a view.
16. Generational ZGC is about GC efficiency/latency, not application logic.
17. KEM is about key establishment/encapsulation.
18. Randomness/crypto APIs must be selected based on security requirements.
19. Dynamic agent loading behavior is tightening.
20. Preview features require explicit compile/runtime flags.
21. LTS does not mean every feature inside the release is final.
22. Migration to Java 21 does not require immediate adoption of every Java 21 feature.


---

<!-- 29_ONE_PAGE_CODE_RECALL.md -->

# Java 21 — One-Page Code Recall

## Virtual Thread

```java
Thread.startVirtualThread(() -> work());
```

## Virtual Thread Executor

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> work());
}
```

## Switch Pattern

```java
return switch (obj) {
    case String s -> s.length();
    case Integer i -> i;
    case null -> 0;
    default -> -1;
};
```

## Record Pattern

```java
if (obj instanceof Point(int x, int y)) {
    System.out.println(x + y);
}
```

## Sequenced Collection

```java
list.getFirst();
list.getLast();
list.reversed();
```

## RandomGenerator

```java
RandomGenerator generator =
    RandomGenerator.getDefault();
```

## Scoped Value — Preview Concept

```java
ScopedValue.where(USER, value)
    .run(() -> work());
```

## Preview Compile

```bash
javac --enable-preview --release 21 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```


---

<!-- 30_COMMANDS_PREVIEW_FLAGS.md -->

# Java 21 Commands / Preview Flags

## Check Version

```bash
java -version
javac -version
```

## Compile Normal Code

```bash
javac Demo.java
```

## Run

```bash
java Demo
```

## Compile Preview Features

```bash
javac --enable-preview --release 21 Demo.java
```

## Run Preview Code

```bash
java --enable-preview Demo
```

## Useful JVM Tools

```text
jcmd
jstack
jmap
jstat
jps
jfr
```

## GC / Runtime

Prefer modern unified JVM logging and JFR rather than relying on old removed/deprecated flags.

## Migration Check

Watch for:

```text
agent-loading warnings
unsupported JVM options
native-access issues
preview-feature mismatch
library bytecode incompatibility
```


---

<!-- 31_PRODUCTION_CHECKLIST.md -->

# Java 21 Production Checklist

## Runtime

- [ ] supported Java 21 distribution
- [ ] patch level current
- [ ] container limits validated
- [ ] GC behavior measured
- [ ] JVM flags reviewed

## Virtual Threads

- [ ] blocking workload actually benefits
- [ ] DB pool remains bounded appropriately
- [ ] downstream rate limits enforced
- [ ] ThreadLocal usage reviewed
- [ ] pinning/contention profiled

## Preview Features

- [ ] organizational policy allows them
- [ ] build uses preview flags
- [ ] runtime uses preview flags
- [ ] upgrade risk accepted
- [ ] not accidentally treated as stable API

## Security

- [ ] no unsupported crypto design
- [ ] deserialization reviewed
- [ ] native integration reviewed
- [ ] agent loading controlled

## Observability

- [ ] JFR strategy
- [ ] metrics
- [ ] traces
- [ ] thread/concurrency visibility
- [ ] GC metrics


---

<!-- 32_PERFORMANCE_CHECKLIST.md -->

# Java 21 Performance Checklist

## Measure

```text
throughput
p50/p95/p99 latency
CPU
heap
allocation rate
GC pause
GC CPU
platform thread count
virtual thread count
DB pool saturation
downstream latency
```

## Virtual Thread Service

Check:

```text
CPU saturation?
DB pool bottleneck?
remote API throttling?
lock contention?
pinning?
memory pressure?
```

## ZGC Evaluation

Compare:

```text
pause time
CPU overhead
heap headroom
latency tail
```

## Rule

Java 21 gives new performance tools.

It does not eliminate the need for profiling and capacity planning.


---

<!-- 33_PRACTICE_QUESTIONS.md -->

# Java 21 Practice Questions

1. Why is Java 21 important?
2. What are virtual threads?
3. Virtual thread vs platform thread?
4. Do virtual threads improve CPU performance?
5. When should you use virtual threads?
6. What is carrier-thread pinning?
7. What is Pattern Matching for switch?
8. Is pattern switch final in Java 21?
9. What are record patterns?
10. How do sealed classes combine with switch patterns?
11. What are Sequenced Collections?
12. What does `reversed()` return conceptually?
13. What is Generational ZGC?
14. Why use generations in GC?
15. What is the KEM API?
16. What are Scoped Values?
17. ScopedValue vs ThreadLocal?
18. Is ScopedValue final in Java 21?
19. What is Structured Concurrency?
20. Structured Concurrency vs CompletableFuture?
21. Is Structured Concurrency final in Java 21?
22. What are unnamed patterns and variables?
23. What are unnamed classes?
24. What happened to String Templates?
25. What is FFM?
26. FFM vs JNI?
27. Is FFM final in Java 21?
28. What is Vector API?
29. Why is Vector API still incubator?
30. What changed with dynamic agent loading?
31. What should you check when migrating 17 → 21?
32. Which Java 21 features are safest to adopt first?
33. Which Java 21 features require preview flags?
34. Why does LTS not mean every feature is final?


---

<!-- 34_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary references:

- OpenJDK JEP documentation
- Java SE 21 API documentation
- Java Language Specification
- OpenJDK / Oracle Java 21 release notes

## Final in Java 21

- Virtual Threads
- Pattern Matching for `switch`
- Record Patterns
- Sequenced Collections
- Generational ZGC
- Key Encapsulation Mechanism API

## Preview in Java 21

- String Templates
- Unnamed Patterns and Variables
- Unnamed Classes and Instance Main Methods
- Scoped Values
- Structured Concurrency
- Foreign Function & Memory API — third preview

## Incubator in Java 21

- Vector API — sixth incubator

## Important Historical Accuracy

String Templates were previewed in Java 21, re-previewed later, and withdrawn before becoming a final Java language feature.

FFM is not final in Java 21; it became final in a later Java release.

## Scope

This pack focuses on practical Java 21 knowledge for:
- interviews
- Spring Boot/backend development
- architecture
- migration
- performance
- modern concurrency
