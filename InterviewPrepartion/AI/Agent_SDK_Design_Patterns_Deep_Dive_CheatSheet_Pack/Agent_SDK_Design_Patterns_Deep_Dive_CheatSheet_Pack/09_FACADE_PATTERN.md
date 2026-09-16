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
