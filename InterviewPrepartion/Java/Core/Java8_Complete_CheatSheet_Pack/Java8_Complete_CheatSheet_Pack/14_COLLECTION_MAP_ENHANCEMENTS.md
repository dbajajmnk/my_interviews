# Collection & Map Enhancements

## Iterable

```java
list.forEach(System.out::println);
```

## Collection

```java
list.removeIf(x -> x < 0);
```

## List

```java
list.replaceAll(String::toUpperCase);
```

```java
list.sort(Comparator.naturalOrder());
```

## Map

```java
map.getOrDefault(key, defaultValue);
map.putIfAbsent(key, value);
map.computeIfAbsent(key, k -> new ArrayList<>());
map.computeIfPresent(key, (k, v) -> update(v));
map.merge(key, 1, Integer::sum);
map.replaceAll((k, v) -> transform(v));
map.forEach((k, v) -> System.out.println(k + "=" + v));
```

## High-Value Pattern

Frequency counter:

```java
map.merge(word, 1, Integer::sum);
```

## Trap

`computeIfAbsent()` should not contain uncontrolled heavy side effects.
