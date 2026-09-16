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
