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
