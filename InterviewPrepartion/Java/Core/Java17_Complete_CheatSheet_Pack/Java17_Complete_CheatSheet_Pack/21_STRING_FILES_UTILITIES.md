# String / Files / Utility Enhancements

## String

Useful modern methods include:

```java
isBlank()
lines()
strip()
stripLeading()
stripTrailing()
repeat()
```

Example:

```java
"  ".isBlank(); // true
```

## Files

Useful methods include:

```java
Files.readString(path)
Files.writeString(path, text)
```

## Predicate

```java
Predicate.not(String::isBlank)
```

## Objects

Modern JDK versions added useful range/index checks and other helpers.

## Rule

Use standard library improvements instead of reimplementing common utilities.
