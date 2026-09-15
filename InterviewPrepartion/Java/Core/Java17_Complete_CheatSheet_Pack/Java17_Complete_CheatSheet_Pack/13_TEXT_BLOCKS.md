# Text Blocks

## What

Multi-line strings.

## Example

```java
String json = """
    {
      "name": "Deepak",
      "role": "Architect"
    }
    """;
```

## Good Uses

- JSON examples
- SQL
- HTML
- XML
- templates
- test fixtures

## Why

Avoids excessive escaping and string concatenation.

## Trap

Text blocks are still `String` objects, not a template engine.
