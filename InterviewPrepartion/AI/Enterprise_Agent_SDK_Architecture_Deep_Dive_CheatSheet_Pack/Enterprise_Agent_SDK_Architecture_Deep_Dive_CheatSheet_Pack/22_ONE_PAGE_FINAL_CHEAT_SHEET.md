# Enterprise Agent SDK — One-Page Final Cheat Sheet

## Formula

```text
Enterprise Agent SDK =
Stable Public API
+ Modular Runtime
+ Provider Abstraction
+ Tool Runtime
+ State/Memory
+ Streaming
+ Security
+ Telemetry
+ Testability
+ Versioning
```

## Public API

Keep small:
- Agent
- Tool
- RunContext
- RunResult
- AgentEvent

## Internal Interfaces

- ModelProvider
- ToolRegistry
- StateStore
- MemoryProvider
- Retriever
- PolicyEngine
- Telemetry
- Evaluator

## Design Patterns

Adapter • Strategy • Factory • Builder • Command • Observer • Facade • Dependency Injection

## Production Rules

1. Do not leak vendor request/response types.
2. Normalize errors.
3. Build streaming/cancellation in from day one.
4. Treat model output as untrusted input.
5. Keep auth/authz deterministic.
6. Add telemetry hooks at runtime boundaries.
7. Make every external dependency replaceable in tests.
8. Use language-native APIs for multi-language SDKs.
9. Evolve additively where possible.
10. Keep the runtime complex so the developer experience can stay simple.

## 30-Second Answer

> I would design the Agent SDK as a stable facade over a modular runtime. The application depends on provider-neutral types such as Agent, Tool, RunContext, and AgentEvent. Internally, model providers, tools, memory, retrieval, policy, telemetry, and evaluation are interfaces with adapters. That gives us multi-provider support, multi-language consistency, testability, security, and backward-compatible evolution.
