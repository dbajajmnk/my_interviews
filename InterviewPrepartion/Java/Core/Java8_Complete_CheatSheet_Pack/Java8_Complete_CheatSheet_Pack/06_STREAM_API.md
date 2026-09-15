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
