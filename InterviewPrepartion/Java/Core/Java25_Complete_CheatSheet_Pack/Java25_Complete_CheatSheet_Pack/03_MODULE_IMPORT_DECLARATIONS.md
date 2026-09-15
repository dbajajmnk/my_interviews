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
