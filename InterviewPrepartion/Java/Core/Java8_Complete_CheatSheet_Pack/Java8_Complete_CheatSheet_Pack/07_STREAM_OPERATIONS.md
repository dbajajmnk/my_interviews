# Stream Operations

## Intermediate Operations

```text
filter
map
flatMap
distinct
sorted
peek
limit
skip
```

They usually return another stream.

## Terminal Operations

```text
forEach
collect
reduce
count
min
max
findFirst
findAny
anyMatch
allMatch
noneMatch
```

## `map()`

One input produces one transformed value.

```java
names.stream()
     .map(String::length);
```

## `flatMap()`

One input may produce multiple values; nested streams are flattened.

```java
lists.stream()
     .flatMap(List::stream);
```

## Reduce

```java
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
```

## Short-Circuiting

Examples:

```text
findFirst
findAny
anyMatch
limit
```

## Trap

`peek()` is mainly useful for observing/debugging pipeline elements, not for business side effects.
