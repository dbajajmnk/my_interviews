# Collectors

## Common Collectors

```java
Collectors.toList()
Collectors.toSet()
Collectors.joining()
Collectors.groupingBy()
Collectors.partitioningBy()
Collectors.mapping()
Collectors.counting()
Collectors.summingInt()
Collectors.averagingInt()
```

## Grouping

```java
Map<String, List<Employee>> byDept =
    employees.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));
```

## Partitioning

```java
Map<Boolean, List<Integer>> result =
    numbers.stream()
           .collect(Collectors.partitioningBy(x -> x % 2 == 0));
```

## Joining

```java
String names =
    users.stream()
         .map(User::getName)
         .collect(Collectors.joining(", "));
```

## `toMap`

```java
Collectors.toMap(
    User::getId,
    User::getName
)
```

## Trap

Duplicate keys in `toMap()` can cause an exception unless you provide a merge function.
