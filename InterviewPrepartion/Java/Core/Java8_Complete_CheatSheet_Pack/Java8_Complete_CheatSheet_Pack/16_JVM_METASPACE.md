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
