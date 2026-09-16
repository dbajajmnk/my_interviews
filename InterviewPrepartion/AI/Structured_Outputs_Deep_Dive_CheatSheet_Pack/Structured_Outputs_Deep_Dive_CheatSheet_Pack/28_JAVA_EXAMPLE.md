# Java Example — Typed Structured Output

## Example

```java
public record TicketClassification(
    String category,
    String priority,
    double confidence
) {}

public void validate(TicketClassification result) {
    if (result.confidence() < 0 || result.confidence() > 1) {
        throw new IllegalArgumentException("Invalid confidence");
    }
}
```

## Rule

Use JSON Schema/serializer tooling to map the provider response into stable Java domain types.
