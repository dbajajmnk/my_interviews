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
