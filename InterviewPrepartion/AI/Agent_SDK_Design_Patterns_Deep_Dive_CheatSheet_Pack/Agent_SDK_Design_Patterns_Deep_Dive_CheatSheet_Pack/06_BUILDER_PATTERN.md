# Builder Pattern for Agent Configuration

## Intent

Make complex optional configuration readable and safe.

## Example

```java
Agent agent = Agent.builder()
    .name("support-agent")
    .model(modelProvider)
    .instructions("...")
    .addTool(orderTool)
    .memory(memory)
    .maxSteps(8)
    .timeout(Duration.ofSeconds(30))
    .build();
```

## Why It Fits

Agents often have many optional parameters:
- tools;
- memory;
- retrieval;
- guardrails;
- limits;
- telemetry;
- metadata.

A Builder avoids constructors with 15 parameters.

## Rule

Validate configuration at `build()` time and fail fast.
