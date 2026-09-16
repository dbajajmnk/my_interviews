# Java Example — Pattern Composition

## Example

```java
ModelProvider provider =
    new TracingModelProvider(
        new RetryingModelProvider(
            new AzureOpenAIAdapter(azureClient)));

RoutingStrategy routing = new QualityOptimizedRoutingStrategy(provider);

ToolRegistry tools = new DefaultToolRegistry();
tools.register(new GetOrderTool());

Agent agent = Agent.builder()
    .name("support-agent")
    .routingStrategy(routing)
    .toolRegistry(tools)
    .build();
```

## Patterns Present

- Adapter → `AzureOpenAIAdapter`
- Decorator → tracing/retry wrappers
- Strategy → routing
- Registry → tools
- Builder → agent configuration
