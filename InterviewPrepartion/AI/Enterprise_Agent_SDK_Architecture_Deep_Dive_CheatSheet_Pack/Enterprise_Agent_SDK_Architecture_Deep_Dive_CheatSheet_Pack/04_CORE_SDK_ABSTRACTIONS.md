# Core Agent SDK Abstractions

## Recommended Interfaces

```text
Agent
AgentRuntime
ModelProvider
Tool
ToolRegistry
RunContext
StateStore
MemoryProvider
Retriever
PolicyEngine
Telemetry
Evaluator
```

## Conceptual Java Example

```java
public interface ModelProvider {
    ModelResponse generate(ModelRequest request);
}

public interface Tool {
    String name();
    ToolResult execute(ToolInput input, RunContext context);
}

public interface MemoryProvider {
    List<MemoryItem> recall(MemoryQuery query);
    void remember(MemoryItem item);
}
```

## SOLID Mapping

- **S**: each provider has one reason to change.
- **O**: new model/tool/memory adapters can be added.
- **L**: implementations honor stable contracts.
- **I**: use small interfaces, not giant runtime APIs.
- **D**: runtime depends on interfaces, not concrete vendors.

## Patterns

Common patterns:
- Adapter
- Strategy
- Factory
- Builder
- Command
- Observer/Event
- Facade
- Dependency Injection
