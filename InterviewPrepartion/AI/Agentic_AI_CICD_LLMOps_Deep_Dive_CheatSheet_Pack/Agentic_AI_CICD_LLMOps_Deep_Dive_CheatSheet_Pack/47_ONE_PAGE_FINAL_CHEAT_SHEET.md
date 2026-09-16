# Agentic AI CI/CD & LLMOps — One-Page Final Cheat Sheet

## Formula

```text
LLMOps =
Version
+ Build
+ Test
+ Evaluate
+ Secure
+ Package
+ Promote
+ Canary
+ Observe
+ Rollback
```

## Version Everything That Changes Behavior

- code
- prompt
- model
- tool/schema
- retrieval/index
- memory policy
- guardrail policy
- eval dataset

## Production Rules

1. Treat model upgrades as releases.
2. Keep prompts in version control.
3. Gate with deterministic tests and agent evals.
4. Add safety, latency and cost thresholds.
5. Promote immutable artifacts.
6. Use DEV → UAT → PROD.
7. Prefer canary/blue-green for risky changes.
8. Tag telemetry with release versions.
9. Roll back all behavior-affecting artifacts, not code only.
10. Convert incidents into regression tests.

## 30-Second Answer

> My LLMOps pipeline versions every behavior-affecting artifact—code, prompts, models, tools, schemas, retrieval, memory policies and eval datasets. CI runs deterministic tests plus agent, RAG, safety, latency and cost gates. The same immutable artifact is promoted through DEV and UAT into canary or blue-green production, with version-tagged telemetry, predefined rollback thresholds, and continuous trace-based evaluation after release.

## Recall Line

> **If it changes agent behavior, version it, test it, observe it and make it rollbackable.**
