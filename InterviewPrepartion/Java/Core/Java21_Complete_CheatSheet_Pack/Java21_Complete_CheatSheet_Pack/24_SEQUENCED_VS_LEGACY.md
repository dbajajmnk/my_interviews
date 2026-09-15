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
