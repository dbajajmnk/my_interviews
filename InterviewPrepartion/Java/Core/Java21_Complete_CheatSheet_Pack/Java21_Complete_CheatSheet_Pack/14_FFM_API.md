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
