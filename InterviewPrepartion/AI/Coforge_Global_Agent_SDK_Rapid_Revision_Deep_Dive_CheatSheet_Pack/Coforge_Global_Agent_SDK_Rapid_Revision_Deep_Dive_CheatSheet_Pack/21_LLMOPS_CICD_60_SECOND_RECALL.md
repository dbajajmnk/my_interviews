# Agentic AI CI/CD & LLMOps — 60-Second Recall

## Formula

```text
Version + Build + Test + Evaluate + Secure + Deploy + Observe + Rollback
```

## 60-Second Answer

> I version every behavior-affecting artifact: code, prompts, model config, tools, schemas, retrieval, memory policy, guardrails, and eval datasets. CI runs deterministic tests plus agent/RAG/safety/cost/latency gates; CD promotes immutable artifacts through DEV, UAT, canary, and production.

## Recall Points

- Model change = release.
- Prompt change = release.
- Canary risky changes.
- Rollback more than code.
