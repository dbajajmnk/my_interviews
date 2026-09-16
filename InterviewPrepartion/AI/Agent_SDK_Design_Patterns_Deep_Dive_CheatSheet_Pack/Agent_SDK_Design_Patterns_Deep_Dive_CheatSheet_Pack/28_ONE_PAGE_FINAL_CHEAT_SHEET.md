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
