# Java 8 Date & Time API

## Package

```java
java.time
```

## Core Types

| Type | Meaning |
|---|---|
| `LocalDate` | date |
| `LocalTime` | time |
| `LocalDateTime` | date + time |
| `Instant` | machine timestamp |
| `ZonedDateTime` | date/time + timezone |
| `ZoneId` | timezone |
| `Duration` | time-based amount |
| `Period` | date-based amount |

## Examples

```java
LocalDate today = LocalDate.now();
```

```java
LocalDate nextWeek = today.plusWeeks(1);
```

```java
Instant now = Instant.now();
```

```java
ZonedDateTime india =
    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

## Formatting

```java
DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("dd-MM-yyyy");

String value = today.format(formatter);
```

## Advantages Over Old API

- immutable
- thread-safe
- clearer types
- better timezone support

## Trap

`LocalDateTime` does not identify an absolute moment because it has no timezone/offset.
