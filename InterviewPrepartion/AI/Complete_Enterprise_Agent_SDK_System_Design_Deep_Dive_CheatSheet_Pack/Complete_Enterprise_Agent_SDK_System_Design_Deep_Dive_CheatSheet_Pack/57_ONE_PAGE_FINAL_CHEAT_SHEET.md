# Complete Enterprise Agent SDK System Design — One-Page Final Cheat Sheet

## Formula

```text
Enterprise Agent SDK =
Stable SDK
+ Modular Runtime
+ Model Gateway
+ Tool Runtime
+ Context
+ Memory
+ RAG
+ Orchestration
+ Durable State
+ Streaming
+ HITL
+ Security
+ Eval
+ OTel
+ Reliability
+ LLMOps
+ Developer Enablement
```

## Architecture Rules

1. Keep public contract small.
2. Keep provider details behind adapters.
3. Model proposes; trusted code executes.
4. Separate context, state, memory, and RAG.
5. Use simplest orchestration possible.
6. Durable workflows require checkpoints.
7. Leases need fencing for stale-worker safety.
8. One user goal → one correlated trace.
9. Test deterministic shell; evaluate probabilistic behavior.
10. Version everything that changes behavior.

## 30-Second Answer

> I would build a stable multi-language Agent SDK over a modular, durable runtime. Provider adapters normalize models, the tool runtime validates and authorizes actions, context/memory/RAG are separate governed layers, orchestration uses explicit state, streaming exposes semantic events, HITL handles high-risk actions, OpenTelemetry traces the full run, evals and tests gate releases, and reliability includes retries, idempotency, checkpoints, fencing and failover. Everything behavior-affecting is versioned and promoted through CI/CD with developer-friendly templates and documentation.

## Recall Line

> **Stable contract outside, modular intelligence inside, deterministic controls around it.**
