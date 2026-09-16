# Enterprise Agent SDK — 60-Second Recall

## Formula

```text
SDK = Stable Contract + Modular Runtime + Adapters + Developer Experience
```

## 60-Second Answer

> I design the Agent SDK as a thin, stable, provider-neutral developer contract over a modular runtime. The public API exposes Agent, Tool, Run, Context, Events, Results, and Errors. Provider integrations, tool execution, memory, retrieval, policy, telemetry, orchestration, and retries remain behind interfaces.

## Recall Points

- Small public surface.
- No provider types in public API.
- Semantic consistency across languages.
- Runtime complexity hidden behind adapters.
