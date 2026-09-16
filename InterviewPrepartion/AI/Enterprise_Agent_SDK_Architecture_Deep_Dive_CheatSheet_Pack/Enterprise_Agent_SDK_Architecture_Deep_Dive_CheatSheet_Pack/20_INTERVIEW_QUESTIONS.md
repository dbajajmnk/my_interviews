# Enterprise Agent SDK — Interview Q&A

## 1. What is an Agent SDK?

A reusable developer library that exposes stable primitives for building and running agents while hiding provider, tool, state, telemetry, and policy plumbing.

## 2. What should the public API expose?

Small domain-neutral primitives such as Agent, Tool, RunContext, RunResult, AgentEvent, and configuration/builders.

## 3. How do you avoid vendor lock-in?

Use a normalized internal ModelProvider interface with provider-specific adapters and capability discovery.

## 4. How should tools be represented?

As typed/structured contracts with name, description, schema, authorization metadata, timeout, and execution handler.

## 5. Why separate state and memory?

State is execution-scoped. Memory has independent retention, privacy, and lifecycle semantics.

## 6. Why streaming support?

Agent tasks may take time; applications need token deltas, tool events, progress, and errors incrementally.

## 7. How do you support cancellation?

Pass a cancellation/deadline context through runtime, provider, retrieval, and tool layers.

## 8. How should errors work?

Normalize provider-specific failures into SDK-level error categories while retaining causal details internally.

## 9. How do you make it testable?

Dependency inversion, deterministic fake model providers, fake tools, in-memory state/memory, and trace capture.

## 10. How do you support multiple languages?

Share semantic contracts and lifecycle behavior but expose idiomatic language-native APIs.

## 11. How do you secure tool calls?

Validate schema, enforce auth/authz outside the model, use least privilege, classify read/write risk, audit calls, and require approval for sensitive operations.

## 12. What belongs in observability?

Run/model/tool/retrieval spans, errors, retries, tokens, latency, cost metadata, and policy decisions.

## 13. How do you evolve an SDK?

Prefer additive changes, deprecations, migration guides, compatibility shims, and semantic versioning.

## 14. What is the biggest architecture mistake?

Leaking provider-specific types throughout the public SDK and application code.

## 15. What is your one-line architecture principle?

> Stable contracts outside, replaceable adapters inside.
