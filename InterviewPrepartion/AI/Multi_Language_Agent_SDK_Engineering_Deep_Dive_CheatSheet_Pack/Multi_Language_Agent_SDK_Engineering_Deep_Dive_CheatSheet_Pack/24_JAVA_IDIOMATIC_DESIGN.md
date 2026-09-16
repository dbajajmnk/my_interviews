# Java Idiomatic SDK Design

## Characteristics

- builders;
- interfaces;
- records/POJOs;
- CompletableFuture/CompletionStage;
- Flow.Publisher or reactive integrations;
- checked vs unchecked exception decisions.

## Example

```java
var agent = Agent.builder()
    .name("support")
    .tools(List.of(searchTool))
    .build();

CompletionStage<RunResult> result =
    agent.runAsync("Find my order", context);
```

## Rule

Strong typing, builders and explicit interfaces should feel natural to Java developers.
