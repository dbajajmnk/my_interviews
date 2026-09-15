# Pattern Matching — Combined Recall

## `instanceof`

```java
if (obj instanceof String s) {
    ...
}
```

## Record Pattern

```java
if (obj instanceof Point(int x, int y)) {
    ...
}
```

## Switch Pattern

```java
return switch (obj) {
    case String s -> ...
    case Integer i -> ...
    default -> ...
};
```

## Sealed + Record + Switch

```text
sealed hierarchy
      +
records
      +
record patterns
      +
switch patterns
      =
very expressive domain modeling
```

## Interview Insight

This is one of the biggest language-modeling improvements in modern Java.
