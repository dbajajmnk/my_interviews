# Agent Testing — 60-Second Recall

## Formula

```text
Unit + Fake Model + Fake Tool + Contract + Workflow + Fault Injection + Security + Performance
```

## 60-Second Answer

> I separate deterministic software testing from probabilistic evaluation. Runtime, routing, state transitions, auth, tool dispatch, retries, serialization, and streaming contracts get normal tests using fake models and fake tools. Behavioral quality is handled with scenario/eval suites.

## Recall Points

- No live LLM in every unit test.
- Script model responses.
- Fault inject provider/tool failures.
- Test idempotency and tenant isolation.
