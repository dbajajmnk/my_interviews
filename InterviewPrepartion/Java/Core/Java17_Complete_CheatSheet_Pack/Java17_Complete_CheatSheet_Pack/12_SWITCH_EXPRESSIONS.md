# Switch Expressions

## Traditional Style

```java
String result;

switch (day) {
    case MONDAY:
        result = "work";
        break;
    default:
        result = "other";
}
```

## Modern Style

```java
String result = switch (day) {
    case MONDAY, TUESDAY -> "work";
    case SATURDAY, SUNDAY -> "weekend";
    default -> "other";
};
```

## `yield`

```java
int score = switch (level) {
    case HIGH -> 100;
    case MEDIUM -> 50;
    default -> {
        int calculated = 10;
        yield calculated;
    }
};
```

## Benefits

- expression-oriented
- no accidental fall-through with arrow labels
- cleaner exhaustive logic

## Trap

Do not confuse `yield` in switch expressions with thread scheduling.
