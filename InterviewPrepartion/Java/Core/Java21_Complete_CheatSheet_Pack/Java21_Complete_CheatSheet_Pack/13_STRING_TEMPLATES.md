# String Templates — Preview in Java 21

## Status

String Templates were previewed in Java 21.

They were later re-previewed and then withdrawn before becoming a final Java feature.

## Why They Were Proposed

To improve string interpolation while allowing processors to validate/transform embedded values.

## Concept

```text
Template
 + Embedded Expressions
 + Processor
        ↓
Result
```

## Historical Example Concept

```java
STR."Hello \{name}"
```

## Critical Interview Note

Do **not** present String Templates as a current finalized Java language feature.

For Java 21 historical knowledge, remember:

```text
Preview in 21
not finalized
later withdrawn
```
