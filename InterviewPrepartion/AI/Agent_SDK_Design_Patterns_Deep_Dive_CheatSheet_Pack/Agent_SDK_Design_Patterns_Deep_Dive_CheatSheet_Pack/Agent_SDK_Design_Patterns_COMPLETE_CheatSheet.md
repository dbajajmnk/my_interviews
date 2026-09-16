# Agent SDK Design Patterns — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Agent SDK Design Patterns — Master Index

## Purpose

This pack focuses on the software-design patterns that make an enterprise Agent SDK modular, extensible, provider-neutral, testable, and backward-compatible.

It is intentionally architecture-first: the goal is not to memorize GoF names, but to understand **where each pattern fits inside an Agent SDK**.

## Master Mapping

```text
Developer API
   │
   ▼
Facade
   │
   ▼
Agent Runtime
   ├─ Strategy        → model / retry / routing policy
   ├─ Adapter         → provider / vector DB / tool backends
   ├─ Factory         → provider/tool/runtime creation
   ├─ Builder         → fluent Agent configuration
   ├─ Command         → tool invocation as executable action
   ├─ Observer        → events / telemetry / streaming
   ├─ Chain           → guardrails / middleware
   ├─ State           → execution lifecycle behavior
   ├─ Template Method → common run lifecycle
   ├─ Decorator       → tracing / caching / retries
   ├─ Proxy           → remote tool/model access
   └─ Dependency Injection → replaceability/testability
```

## Core Principle

> Use patterns to protect stable contracts and isolate change. Do not add patterns just to make the design look sophisticated.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_PATTERN_SELECTION_MENTAL_MODEL.md`
3. `03_ADAPTER_PATTERN.md`
4. `04_STRATEGY_PATTERN.md`
5. `05_FACTORY_AND_ABSTRACT_FACTORY.md`
6. `06_BUILDER_PATTERN.md`
7. `07_COMMAND_PATTERN_FOR_TOOLS.md`
8. `08_OBSERVER_EVENT_PATTERN.md`
9. `09_FACADE_PATTERN.md`
10. `10_DECORATOR_PATTERN.md`
11. `11_CHAIN_OF_RESPONSIBILITY.md`
12. `12_PROXY_PATTERN.md`
13. `13_STATE_PATTERN.md`
14. `14_TEMPLATE_METHOD_PATTERN.md`
15. `15_REPOSITORY_AND_PROVIDER_PATTERNS.md`
16. `16_DEPENDENCY_INJECTION.md`
17. `17_PLUGIN_AND_EXTENSION_PATTERN.md`
18. `18_ROUTER_AND_POLICY_PATTERNS.md`
19. `19_RESILIENCE_PATTERNS.md`
20. `20_ANTI_PATTERNS.md`
21. `21_REFERENCE_ARCHITECTURE_WITH_PATTERNS.md`
22. `22_JAVA_EXAMPLE.md`
23. `23_PYTHON_EXAMPLE.md`
24. `24_TYPESCRIPT_EXAMPLE.md`
25. `25_CSHARP_EXAMPLE.md`
26. `26_INTERVIEW_QUESTIONS.md`
27. `27_SYSTEM_DESIGN_QUESTIONS.md`
28. `28_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

For today's interview preparation:

- **Core first:** 01 → 10
- **Enterprise extensions:** 11 → 21
- **Language examples:** 22 → 25
- **Interview mode:** 26 → 28


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Agent SDK Design Patterns — 30-Second Recall

## Recall

```text
Adapter  = normalize external providers
Strategy = swap algorithms/policies
Factory  = create implementations
Builder  = configure complex agents
Command  = represent tool calls
Observer = emit events/telemetry
Facade   = simplify public API
Decorator= add cross-cutting behavior
Chain    = pipeline validation/guardrails
State    = execution lifecycle
Proxy    = remote/controlled access
DI       = replace dependencies
```

## 30-Second Interview Answer

> I would use patterns only where they isolate change. Adapter handles provider differences, Strategy handles interchangeable policies, Factory creates implementations, Builder keeps agent configuration readable, Command represents tool calls, Observer supports events and telemetry, Facade protects a simple public API, and Dependency Injection keeps the runtime testable and replaceable.

## Golden Rule

**Pattern value = change isolated + contract protected + code easier to test.**


---

<!-- Source: 02_PATTERN_SELECTION_MENTAL_MODEL.md -->
# Pattern Selection Mental Model

## Ask What Is Changing

Choose patterns by change axis:

| Change Axis | Useful Pattern |
|---|---|
| Model provider | Adapter |
| Routing policy | Strategy |
| Object creation | Factory |
| Complex config | Builder |
| Tool execution | Command |
| Events/telemetry | Observer |
| Cross-cutting logic | Decorator |
| Guardrail pipeline | Chain |
| Runtime lifecycle | State / Template Method |
| External service access | Proxy |

## Do Not Pattern-Match Blindly

Do not say “we use all GoF patterns.”

Say:
> I first identify volatility: provider, policy, lifecycle, cross-cutting concerns, and public contracts. Then I choose the smallest pattern that isolates that volatility.

## Architectural Heuristic

- External variability → Adapter
- Behavioral variability → Strategy
- Creation variability → Factory
- Configuration complexity → Builder
- Action as data → Command
- Notifications → Observer
- Cross-cutting concerns → Decorator
- Sequential policy checks → Chain


---

<!-- Source: 03_ADAPTER_PATTERN.md -->
# Adapter Pattern in Agent SDKs

## Intent

Convert one provider-specific API into the SDK's internal contract.

## Architecture

```text
Agent Runtime
     │
     ▼
ModelProvider
 ├─ OpenAIAdapter
 ├─ AzureOpenAIAdapter
 ├─ AnthropicAdapter
 └─ LocalModelAdapter
```

## Why It Matters

Without Adapter:
```text
Business Code → Vendor SDK Types Everywhere
```

With Adapter:
```text
Business Code → Internal Contract → Vendor Adapter
```

## Java Sketch

```java
interface ModelProvider {
    ModelResponse generate(ModelRequest request);
}

final class AzureOpenAIAdapter implements ModelProvider {
    private final AzureClient client;

    public ModelResponse generate(ModelRequest request) {
        var vendorResponse = client.invoke(map(request));
        return normalize(vendorResponse);
    }
}
```

## Interview Point

> Adapter is the main pattern for provider neutrality because it contains vendor-specific types at the boundary.


---

<!-- Source: 04_STRATEGY_PATTERN.md -->
# Strategy Pattern in Agent SDKs

## Intent

Encapsulate interchangeable algorithms or policies.

## Examples

Strategies may control:
- model selection;
- retry;
- routing;
- tool selection policy;
- memory selection;
- retrieval ranking;
- termination rules.

## Example

```text
RoutingStrategy
 ├─ CostOptimized
 ├─ LatencyOptimized
 ├─ QualityOptimized
 └─ ComplianceOptimized
```

## Java Sketch

```java
interface RoutingStrategy {
    ModelProvider choose(RunContext context);
}
```

## Adapter vs Strategy

- **Adapter:** makes incompatible APIs compatible.
- **Strategy:** changes how a decision is made.

This distinction is a common interview question.


---

<!-- Source: 05_FACTORY_AND_ABSTRACT_FACTORY.md -->
# Factory & Abstract Factory

## Intent

Centralize creation logic and hide concrete implementations.

## Factory Example

```text
ModelProviderFactory.create(config)
        ↓
AzureOpenAIProvider / OpenAIProvider / LocalProvider
```

## Abstract Factory

Useful when a provider family requires related objects:

```text
ProviderFactory
 ├─ createModelClient()
 ├─ createEmbeddingClient()
 └─ createTelemetryMapper()
```

## When to Use

Use when creation involves:
- configuration;
- secrets;
- capability checks;
- environment;
- provider type.

## Avoid

Do not build giant factories that know every application-specific component.


---

<!-- Source: 06_BUILDER_PATTERN.md -->
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


---

<!-- Source: 07_COMMAND_PATTERN_FOR_TOOLS.md -->
# Command Pattern for Tool Calls

## Intent

Represent an operation as an object/value that can be validated, logged, queued, retried, or approved.

## Agent Mapping

```text
Model Decision
   ↓
ToolCommand
   ├─ toolName
   ├─ arguments
   ├─ correlationId
   └─ metadata
   ↓
ToolExecutor
```

## Why It Fits

Tool calls need:
- validation;
- auditing;
- approval;
- replay;
- idempotency;
- async execution.

Command makes the action explicit.

## Interview Point

> I would model tool invocation as a command rather than letting the model directly invoke arbitrary application methods.


---

<!-- Source: 08_OBSERVER_EVENT_PATTERN.md -->
# Observer / Event Pattern

## Intent

Notify interested components without coupling the runtime to each subscriber.

## Agent Events

Examples:
- RunStarted
- ModelCalled
- ToolRequested
- ToolCompleted
- GuardrailTriggered
- RunCompleted
- RunFailed

## Consumers

Events may feed:
- UI streaming;
- logs;
- tracing;
- analytics;
- audit;
- evaluation.

## Architecture

```text
Agent Runtime
   │ emits
   ▼
Event Bus
 ├─ Telemetry
 ├─ UI Stream
 ├─ Audit
 └─ Evaluator
```


---

<!-- Source: 09_FACADE_PATTERN.md -->
# Facade Pattern

## Intent

Expose a simple interface over a complex subsystem.

## Agent SDK Example

```text
Developer
   │
   ▼
Agent.run()
   │
   ├─ provider
   ├─ context
   ├─ tools
   ├─ policy
   ├─ telemetry
   └─ retries
```

## Why It Matters

The SDK should feel simple even if the runtime is sophisticated.

## Interview Phrase

> Keep complexity inside the runtime so the developer experience stays simple.


---

<!-- Source: 10_DECORATOR_PATTERN.md -->
# Decorator Pattern

## Intent

Add behavior around an existing component without modifying its core implementation.

## Use Cases

Decorate:
- model provider with tracing;
- retriever with caching;
- tool with authorization;
- provider with retry;
- memory with encryption.

## Example

```text
TracingModelProvider
    ↓
RetryingModelProvider
    ↓
AzureOpenAIProvider
```

## Benefit

Cross-cutting concerns stay composable and separately testable.

## Caution

Too many nested decorators can make runtime behavior hard to inspect. Keep composition visible.


---

<!-- Source: 11_CHAIN_OF_RESPONSIBILITY.md -->
# Chain of Responsibility for Guardrails

## Intent

Pass a request through a sequence of handlers until all checks pass or one stops processing.

## Guardrail Pipeline

```text
Input
 ↓
Schema Check
 ↓
PII Check
 ↓
Policy Check
 ↓
Authorization
 ↓
Risk Check
 ↓
Execute
```

## Why It Fits

Each policy check has one responsibility and can be added/removed independently.

## Return Model

Handlers can return:
- PASS
- BLOCK
- REQUIRE_APPROVAL
- TRANSFORM


---

<!-- Source: 12_PROXY_PATTERN.md -->
# Proxy Pattern

## Intent

Control access to a remote or sensitive dependency through an intermediary.

## Examples

- remote model proxy;
- tool execution proxy;
- rate-limited provider proxy;
- authorization proxy.

## Architecture

```text
Agent Runtime
   ↓
SecureToolProxy
   ↓
Remote Tool Service
```

## Proxy vs Adapter

- Proxy keeps same conceptual interface and controls access.
- Adapter changes one interface into another.


---

<!-- Source: 13_STATE_PATTERN.md -->
# State Pattern in Agent Runtime

## Intent

Change behavior based on current lifecycle state.

## Possible States

```text
CREATED
  ↓
RUNNING
  ↓
WAITING_FOR_TOOL
  ↓
WAITING_FOR_APPROVAL
  ↓
COMPLETED / FAILED / CANCELLED
```

## Why It Helps

State-specific behavior becomes explicit instead of scattered boolean flags.

## Good For

- long-running runs;
- pause/resume;
- approval workflows;
- retries;
- cancellation.


---

<!-- Source: 14_TEMPLATE_METHOD_PATTERN.md -->
# Template Method for Run Lifecycle

## Intent

Define the skeleton of an algorithm while allowing certain steps to vary.

## Agent Run Template

```text
initialize()
buildContext()
invokeModel()
validateDecision()
executeAction()
updateState()
checkStop()
finalizeRun()
```

## Use

Useful when multiple agent runtimes share the same lifecycle but customize:
- context assembly;
- policy;
- model invocation;
- stop rules.

## Caution

Prefer composition over deep inheritance if behavior becomes highly variable.


---

<!-- Source: 15_REPOSITORY_AND_PROVIDER_PATTERNS.md -->
# Repository & Provider Patterns

## Repository

Use Repository when you want a clean domain-facing abstraction for persisted data.

Examples:
```text
RunRepository
CheckpointRepository
MemoryRepository
```

## Provider

Use Provider interfaces for infrastructure capabilities:
```text
ModelProvider
EmbeddingProvider
MemoryProvider
TelemetryProvider
```

## Why

Separates domain/runtime logic from storage and infrastructure details.


---

<!-- Source: 16_DEPENDENCY_INJECTION.md -->
# Dependency Injection

## Purpose

Dependency Injection is the glue that makes patterns practical.

## Without DI

```java
class AgentRuntime {
    private final AzureOpenAIProvider provider = new AzureOpenAIProvider();
}
```

## With DI

```java
class AgentRuntime {
    private final ModelProvider provider;

    AgentRuntime(ModelProvider provider) {
        this.provider = provider;
    }
}
```

## Benefits

- provider replacement;
- test doubles;
- easier configuration;
- clearer dependencies;
- reduced coupling.

## Interview Point

> Patterns isolate variability; DI makes that variability injectable.


---

<!-- Source: 17_PLUGIN_AND_EXTENSION_PATTERN.md -->
# Plugin & Extension Pattern

## Intent

Allow new capabilities without changing the Agent SDK core.

## Possible Plugins

- model adapter;
- memory backend;
- retriever;
- evaluator;
- telemetry exporter;
- tool pack.

## Extension Contract

A plugin should declare:
- identifier;
- version;
- capabilities;
- SDK compatibility;
- configuration schema.

## Security

Do not give plugins implicit unrestricted credentials or filesystem/network access.


---

<!-- Source: 18_ROUTER_AND_POLICY_PATTERNS.md -->
# Router & Policy Patterns

## Router

A router chooses one path/provider/agent based on runtime context.

## Examples

- route coding tasks to one model;
- route low-cost tasks to smaller model;
- route sensitive workloads to approved region/provider.

## Policy Pattern

Encapsulate rules that decide:
- allowed tools;
- approval requirement;
- data access;
- model eligibility.

## Separation

Routing answers **where should this go?**

Policy answers **is this allowed?**


---

<!-- Source: 19_RESILIENCE_PATTERNS.md -->
# Resilience Patterns for Agent SDKs

## Core Patterns

- Retry
- Timeout
- Circuit Breaker
- Bulkhead
- Fallback
- Idempotency
- Rate Limiter

## Example

```text
Agent Runtime
  ↓
Timeout
  ↓
Retry
  ↓
Circuit Breaker
  ↓
Model Provider
```

## Caution

Order matters. Blind retry around a non-idempotent tool can duplicate side effects.

## Interview Rule

> Retry transient reads freely within limits; retry writes only when idempotency is guaranteed.


---

<!-- Source: 20_ANTI_PATTERNS.md -->
# Agent SDK Anti-Patterns

## 1. Provider Leakage

Public API exposes vendor-specific request/response classes.

## 2. God Runtime

One giant class handles model calls, tools, memory, tracing, retries, and policies.

## 3. Pattern Explosion

Every class gets wrapped in multiple abstractions without real change pressure.

## 4. Prompt-as-Security

Critical authorization rules exist only in natural-language instructions.

## 5. Global Mutable Registry

Hidden global providers/tools make testing and multi-tenant behavior unsafe.

## 6. Boolean State Explosion

`isRunning`, `isWaiting`, `isPaused`, `isFailed` combinations become inconsistent.

## 7. Retry Everything

Dangerous for write operations and policy failures.

## 8. Multi-Agent by Default

Unnecessary agents increase cost, latency, and debugging complexity.


---

<!-- Source: 21_REFERENCE_ARCHITECTURE_WITH_PATTERNS.md -->
# Reference Architecture with Patterns

## Architecture

```text
Developer App
    │
    ▼
Facade: Agent SDK
    │
    ▼
Builder: Agent Configuration
    │
    ▼
Agent Runtime
    ├─ Strategy: routing/retry/termination
    ├─ State: lifecycle
    ├─ Chain: guardrails/policies
    │
    ├─ Adapter: ModelProvider
    │      └─ Decorator: tracing/retry
    │
    ├─ Command: ToolCall
    │      └─ Proxy: remote/secure tool
    │
    └─ Observer: events/telemetry
```

## How to Explain It

1. Facade protects the developer-facing surface.
2. Builder handles configuration.
3. Adapter isolates vendors.
4. Strategy isolates behavior/policy choices.
5. Command represents tool calls.
6. Chain applies guardrails.
7. Observer publishes runtime events.
8. Decorator adds cross-cutting behavior.
9. State controls lifecycle.
10. DI wires all components together.


---

<!-- Source: 22_JAVA_EXAMPLE.md -->
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


---

<!-- Source: 23_PYTHON_EXAMPLE.md -->
# Python Example — Pattern Composition

## Example

```python
class ModelProvider:
    async def generate(self, request):
        raise NotImplementedError

class OpenAIAdapter(ModelProvider):
    def __init__(self, client):
        self.client = client

    async def generate(self, request):
        raw = await self.client.responses.create(**map_request(request))
        return normalize(raw)

provider = TracingProvider(
    RetryingProvider(
        OpenAIAdapter(client)
    )
)

agent = (
    AgentBuilder()
    .with_model(provider)
    .add_tool(get_order_status)
    .build()
)
```

## Pattern Mapping

Adapter + Decorator + Builder + Dependency Injection.


---

<!-- Source: 24_TYPESCRIPT_EXAMPLE.md -->
# TypeScript Example — Pattern Composition

## Example

```ts
interface ModelProvider {
  generate(req: ModelRequest): Promise<ModelResponse>;
}

class AzureOpenAIAdapter implements ModelProvider {
  constructor(private client: AzureClient) {}

  async generate(req: ModelRequest): Promise<ModelResponse> {
    const raw = await this.client.invoke(mapRequest(req));
    return normalize(raw);
  }
}

const provider =
  new TracingProvider(
    new RetryProvider(
      new AzureOpenAIAdapter(client)
    )
  );
```

## Pattern Mapping

Adapter + Decorator + Dependency Injection.


---

<!-- Source: 25_CSHARP_EXAMPLE.md -->
# C# Example — Pattern Composition

## Example

```csharp
public interface IModelProvider
{
    Task<ModelResponse> GenerateAsync(
        ModelRequest request,
        CancellationToken cancellationToken);
}

public sealed class AzureOpenAIAdapter : IModelProvider
{
    private readonly AzureClient _client;

    public AzureOpenAIAdapter(AzureClient client)
    {
        _client = client;
    }

    public async Task<ModelResponse> GenerateAsync(
        ModelRequest request,
        CancellationToken cancellationToken)
    {
        var raw = await _client.InvokeAsync(
            Map(request), cancellationToken);
        return Normalize(raw);
    }
}
```

## Pattern Mapping

Adapter + DI, with async/cancellation built into the contract.


---

<!-- Source: 26_INTERVIEW_QUESTIONS.md -->
# Agent SDK Design Patterns — Interview Q&A

## 1. Which pattern is most important for provider neutrality?

Adapter, because it contains provider-specific APIs behind an internal contract.

## 2. Adapter vs Strategy?

Adapter changes an interface; Strategy changes an algorithm or policy.

## 3. Why Builder for Agent configuration?

Because agents have many optional dependencies and policies; Builder keeps configuration readable and validated.

## 4. Why Command for tool calls?

It turns a tool invocation into a first-class object that can be validated, approved, logged, queued, retried, and audited.

## 5. Why Observer?

It decouples runtime execution from telemetry, UI streaming, audit, and evaluation consumers.

## 6. Why Facade?

It protects developers from internal subsystem complexity and keeps the SDK easy to use.

## 7. Why Decorator?

To add cross-cutting behavior such as tracing, retry, caching, or authorization without changing the base component.

## 8. Why Chain of Responsibility?

It is a natural fit for sequential guardrail/policy checks.

## 9. Why State pattern?

To make lifecycle-dependent behavior explicit for running, waiting, paused, completed, failed, and cancelled states.

## 10. What pattern should you avoid overusing?

Any pattern that adds abstraction without real volatility. Overengineering is itself an architecture risk.

## 11. How does DI fit?

DI supplies interchangeable implementations to the abstractions created by these patterns.

## 12. How do resilience patterns fit?

Retries, timeouts, circuit breakers, bulkheads, and idempotency protect remote model/tool calls.

## 13. How do you explain pattern choice in an interview?

Start with the change pressure. Example: 'Providers vary, so I isolate that variability using Adapter.'

## 14. What is the best pattern for plugin ecosystems?

Stable extension interfaces plus explicit plugin registration and compatibility metadata.

## 15. One-line design principle?

> Design around expected change, not around pattern names.


---

<!-- Source: 27_SYSTEM_DESIGN_QUESTIONS.md -->
# Agent SDK Design Patterns — System Design Questions

## Q1 — Design Provider-Neutral Model Access

Use:
- ModelProvider interface;
- Adapter per vendor;
- Strategy for provider routing;
- Factory for creation;
- Decorator for retry/tracing.

## Q2 — Design Tool Execution

Use:
- Command for tool invocation;
- Registry for discovery;
- Chain for validation/policy;
- Proxy for remote execution;
- Observer for audit/events.

## Q3 — Design Guardrails

Use Chain of Responsibility:
```text
Input → Schema → PII → AuthZ → Risk → Approval → Execute
```

## Q4 — Design Runtime Lifecycle

Use explicit states:
```text
CREATED → RUNNING → WAITING → COMPLETED
                     └→ FAILED/CANCELLED
```

## Q5 — Design SDK for Easy Testing

Use:
- interfaces;
- DI;
- Adapter;
- Strategy;
- in-memory repositories;
- fake providers;
- Observer for trace capture.

## Answer Framework

For pattern questions:

**Change pressure → chosen pattern → boundary protected → trade-off → testability impact.**


---

<!-- Source: 28_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Agent SDK Design Patterns — One-Page Final Cheat Sheet

## Pattern Map

| Pattern | Agent SDK Use |
|---|---|
| Adapter | Provider normalization |
| Strategy | Routing/retry/policy choice |
| Factory | Provider/runtime creation |
| Builder | Agent configuration |
| Command | Tool invocation |
| Observer | Events/telemetry |
| Facade | Simple public API |
| Decorator | Tracing/retry/caching |
| Chain | Guardrails/policies |
| Proxy | Controlled remote access |
| State | Lifecycle |
| Template Method | Shared run skeleton |
| Repository | Persistence abstraction |
| DI | Replaceable dependencies |

## Final Architecture Recall

```text
Facade
 ↓
Builder
 ↓
Runtime
 ├─ Strategy
 ├─ State
 ├─ Chain
 ├─ Adapter
 ├─ Command
 ├─ Observer
 └─ Decorator
```

## 30-Second Answer

> In an Agent SDK, I use patterns around real change points. Adapter isolates model vendors, Strategy swaps policies, Factory and Builder manage creation/configuration, Command represents tool calls, Observer supports events and telemetry, Chain handles guardrails, Decorator adds cross-cutting behavior, and DI keeps everything replaceable and testable. The goal is modularity and stable contracts—not pattern quantity.

## Final Reminder

**Start with volatility. Then choose the pattern.**
