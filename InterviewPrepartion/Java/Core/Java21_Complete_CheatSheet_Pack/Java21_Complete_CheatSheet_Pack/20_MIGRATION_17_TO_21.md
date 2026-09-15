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
