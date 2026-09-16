# Agent Testing — One-Page Final Cheat Sheet

## Formula

```text
Agent Testing =
Unit
+ Fake Model
+ Fake Tool
+ Contract
+ Workflow
+ Failure Injection
+ Security
+ Eval Regression
+ CI Gate
+ Canary
```

## Key Rules

1. Do not call real LLMs in every unit test.
2. Script model behavior for runtime tests.
3. Test state and trajectory.
4. Test tool contracts separately.
5. Test RAG and memory independently.
6. Verify HITL resume.
7. Test retries with idempotency.
8. Inject failures.
9. Run security/tenant negative tests.
10. Use canary validation after CI.

## 30-Second Answer

> I treat agent testing as layered engineering. Deterministic logic gets unit and contract tests, the agent loop uses scripted fake models and tools, retrieval and memory are tested independently, graph state and orchestration paths are asserted explicitly, and streaming, HITL, retries, idempotency, authorization, and failure recovery each have dedicated scenarios. Probabilistic quality is handled through golden evaluation datasets, and critical regression thresholds are enforced in CI before canary release.

## Recall Line

> **Test deterministic behavior deterministically; test probabilistic behavior statistically.**
