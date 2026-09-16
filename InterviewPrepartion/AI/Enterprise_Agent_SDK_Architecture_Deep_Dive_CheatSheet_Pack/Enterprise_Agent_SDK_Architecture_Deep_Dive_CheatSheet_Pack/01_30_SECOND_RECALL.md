# Enterprise Agent SDK — 30-Second Recall

## Recall

```text
Public SDK
  ↓
Agent Runtime
  ├─ Model Gateway
  ├─ Tool Runtime
  ├─ Context/State
  ├─ Memory
  ├─ Retrieval
  ├─ Policy
  ├─ Telemetry
  └─ Evaluation Hooks
```

**Public contract should be stable. Internal providers should be replaceable.**

## 30-Second Interview Answer

> I would design the Agent SDK as a thin, stable developer-facing contract over a modular runtime. The public API would expose concepts such as Agent, Tool, Run, Context, and Events, while model providers, retrieval, memory, policy, telemetry, and orchestration sit behind interfaces. That gives us provider neutrality, testability, backward compatibility, and consistent behavior across Java, Python, C#, and TypeScript.

## Never Forget

- SDK != framework internals.
- Public API should not leak vendor-specific types.
- Model choice is an adapter concern.
- Tool execution needs security boundaries.
- Streaming and cancellation belong in the contract.
- Errors need normalized SDK exceptions.
- Telemetry hooks should be built in, not bolted on later.
