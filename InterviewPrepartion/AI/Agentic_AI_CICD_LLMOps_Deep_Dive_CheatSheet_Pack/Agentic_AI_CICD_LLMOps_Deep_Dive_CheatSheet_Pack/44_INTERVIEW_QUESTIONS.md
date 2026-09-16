# Agentic AI CI/CD & LLMOps — Interview Q&A

## 1. What is LLMOps?

DevOps extended for LLM/agent artifacts, evals, observability, safety and cost.

## 2. What should be versioned?

Code, prompts, model config, tools, schemas, retrieval, policies and eval datasets.

## 3. Why is model change a release?

Behavior can change without code changing.

## 4. How do you gate a release?

Deterministic tests + agent/RAG evals + safety + latency/cost thresholds.

## 5. Canary vs blue-green?

Canary gradually shifts traffic; blue-green keeps two full environments and switches traffic.

## 6. How do you rollback an agent?

Restore code plus prompt/model/tool/retrieval/policy versions.

## 7. Why immutable artifacts?

The same tested version should move across environments.

## 8. What is shadow traffic?

Candidate system observes copied production requests without affecting user output.

## 9. How do you detect drift?

Production metrics/evals over traces and business KPIs.

## 10. What is cost governance?

Budgets, routing, limits, alerts and cost-per-success monitoring.

## 11. How do you secure secrets?

Managed identity/secret store; never model-visible prompt text.

## 12. What belongs in Git?

Code, prompts, schemas, IaC, evals and policy config.

## 13. How do you release multi-language SDKs?

Common spec plus per-language tests/packages and compatibility matrix.

## 14. How do incidents improve the system?

Create new regression/eval cases and stronger controls.

## 15. One-line principle?

> If it changes agent behavior, version it, test it, observe it and make it rollbackable.
