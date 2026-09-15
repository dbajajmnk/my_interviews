# Pattern Matching for `instanceof`

## Before

```java
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println(s.length());
}
```

## Modern

```java
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

## Why

Removes redundant cast.

## Flow Scope

```java
if (obj instanceof String s && !s.isBlank()) {
    System.out.println(s);
}
```

The variable is available only where the compiler knows the pattern matched.

## Trap

Pattern variable scope is flow-sensitive, not simply block-wide.
