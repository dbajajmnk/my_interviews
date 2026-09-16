# Java Example — Tool Calling Pattern

## Example

```java
public interface ToolHandler<I, O> {
    O execute(I input, ToolContext context);
}

public final class CreateTicketTool
        implements ToolHandler<CreateTicketInput, TicketResult> {

    public TicketResult execute(
            CreateTicketInput input,
            ToolContext context) {

        authorization.check(
            context.userId(),
            "ticket:create"
        );

        validator.validate(input);

        return ticketService.create(input);
    }
}
```

## Pattern Mapping

- Command-style tool request
- Dependency Injection
- explicit execution context
- deterministic authorization
