# Method References

## What

A shorter syntax when a lambda only calls an existing method.

## Four Common Forms

### Static Method

```java
ClassName::staticMethod
```

Example:

```java
Integer::parseInt
```

### Bound Instance Method

```java
object::instanceMethod
```

Example:

```java
System.out::println
```

### Unbound Instance Method

```java
ClassName::instanceMethod
```

Example:

```java
String::length
```

### Constructor

```java
ClassName::new
```

Example:

```java
ArrayList::new
```

## Rule

Use a method reference when it improves readability. Do not force it when the lambda is clearer.
