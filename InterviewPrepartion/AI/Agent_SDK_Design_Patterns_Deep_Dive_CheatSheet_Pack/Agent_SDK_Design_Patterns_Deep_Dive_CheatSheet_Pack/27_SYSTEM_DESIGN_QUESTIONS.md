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
