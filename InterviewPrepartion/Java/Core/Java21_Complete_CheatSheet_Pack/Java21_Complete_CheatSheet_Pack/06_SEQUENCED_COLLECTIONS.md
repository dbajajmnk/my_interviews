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
