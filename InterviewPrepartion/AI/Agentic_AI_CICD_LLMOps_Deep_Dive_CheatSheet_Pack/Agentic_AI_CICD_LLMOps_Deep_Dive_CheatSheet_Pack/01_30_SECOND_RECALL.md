# Agentic AI CI/CD & LLMOps — 30-Second Recall

## Recall

```text
LLMOps =
Version
+ Test
+ Evaluate
+ Secure
+ Deploy
+ Observe
+ Rollback
+ Improve
```

## 30-Second Interview Answer

> I treat an agent release as a versioned bundle of code, prompts, model configuration, tool schemas, retrieval settings, guardrails and eval assets. CI runs deterministic tests plus agent and RAG regression suites, then checks safety, latency and cost thresholds. CD promotes the same immutable artifact through DEV, UAT and production using canary or blue-green rollout with observability, rollback criteria and post-release evaluation.

## Do Not Forget

- Prompt changes are production changes.
- Model upgrades can break behavior without code changes.
- Eval datasets belong in version control.
- Cost and latency can be release gates.
- Rollback must include model/prompt/config versions, not code only.
