# Agentic AI CI/CD & LLMOps — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Agentic AI CI/CD & LLMOps — Master Index

## Purpose

This pack covers the software-delivery and operational discipline required to ship agentic AI systems safely and repeatedly.

Interview focus:
- source control and branching;
- prompt/model/tool/schema versioning;
- environment promotion;
- eval gates;
- automated testing;
- infrastructure as code;
- secrets/configuration;
- deployment strategies;
- canary and blue/green;
- rollback;
- observability;
- drift detection;
- incident response;
- cost and latency budgets;
- agent/runtime releases;
- model/provider changes;
- CI/CD for multi-language Agent SDKs.

## Master Mental Model

```text
Developer Change
     ↓
Source Control
     ↓
Build / Lint / Unit / Contract
     ↓
Agent Regression + Evals
     ↓
Security / Cost / Performance Gates
     ↓
Artifact Versioning
     ↓
DEV
     ↓
UAT / Staging
     ↓
Canary / Blue-Green
     ↓
PROD
     ↓
Observe / Evaluate / Rollback / Improve
```

## Core Principle

> In LLMOps, prompts, models, tools, retrieval settings, schemas, guardrails and eval datasets are production artifacts. They must be versioned, tested, promoted and rolled back with the same discipline as code.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_LLMOPS.md`
3. `03_CICD_FOR_AGENT_SYSTEMS.md`
4. `04_ARTIFACTS_YOU_MUST_VERSION.md`
5. `05_SOURCE_CONTROL_STRATEGY.md`
6. `06_BRANCHING_AND_RELEASE_FLOW.md`
7. `07_PROMPT_VERSIONING.md`
8. `08_MODEL_VERSIONING.md`
9. `09_TOOL_AND_SCHEMA_VERSIONING.md`
10. `10_RETRIEVAL_AND_INDEX_VERSIONING.md`
11. `11_MEMORY_POLICY_VERSIONING.md`
12. `12_GUARDRAIL_POLICY_VERSIONING.md`
13. `13_EVAL_DATASET_VERSIONING.md`
14. `14_BUILD_AND_PACKAGE_PIPELINE.md`
15. `15_UNIT_CONTRACT_AND_INTEGRATION_GATES.md`
16. `16_AGENT_REGRESSION_GATES.md`
17. `17_RAG_EVALUATION_GATES.md`
18. `18_SAFETY_AND_SECURITY_GATES.md`
19. `19_LATENCY_AND_COST_GATES.md`
20. `20_INFRASTRUCTURE_AS_CODE.md`
21. `21_CONFIGURATION_AND_SECRETS_MANAGEMENT.md`
22. `22_ENVIRONMENTS_DEV_UAT_PROD.md`
23. `23_ENVIRONMENT_PROMOTION.md`
24. `24_DEPLOYMENT_STRATEGIES.md`
25. `25_CANARY_DEPLOYMENT.md`
26. `26_BLUE_GREEN_DEPLOYMENT.md`
27. `27_SHADOW_TRAFFIC.md`
28. `28_FEATURE_FLAGS_AND_PROGRESSIVE_DELIVERY.md`
29. `29_ROLLBACK_STRATEGY.md`
30. `30_MODEL_PROVIDER_FAILOVER.md`
31. `31_RUNTIME_AND_AGENT_SDK_RELEASES.md`
32. `32_MULTI_LANGUAGE_SDK_RELEASE_PIPELINE.md`
33. `33_CONTAINERIZATION_AND_KUBERNETES.md`
34. `34_OBSERVABILITY_IN_RELEASES.md`
35. `35_PRODUCTION_EVALUATION_AND_DRIFT.md`
36. `36_INCIDENT_RESPONSE_AND_POSTMORTEMS.md`
37. `37_COST_GOVERNANCE.md`
38. `38_DATA_AND_PRIVACY_GOVERNANCE.md`
39. `39_COMPLIANCE_AND_AUDITABILITY.md`
40. `40_GITOPS_AND_POLICY_AS_CODE.md`
41. `41_REFERENCE_GITHUB_ACTIONS_FLOW.md`
42. `42_REFERENCE_AZURE_DEVOPS_FLOW.md`
43. `43_PRODUCTION_ARCHITECTURE.md`
44. `44_INTERVIEW_QUESTIONS.md`
45. `45_SYSTEM_DESIGN_QUESTIONS.md`
46. `46_RELEASE_CHECKLIST.md`
47. `47_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 13  
**Pipeline gates:** 14 → 19  
**Deployment/operations:** 20 → 40  
**Implementation/interview:** 41 → 47


---

<!-- Source: 01_30_SECOND_RECALL.md -->
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


---

<!-- Source: 02_WHAT_IS_LLMOPS.md -->
# What Is LLMOps?

## Definition

LLMOps is the engineering discipline for reliably developing, evaluating, deploying, observing and governing LLM/agent systems in production.

## Includes

- versioning;
- testing;
- evaluation;
- deployment;
- observability;
- incident response;
- cost governance;
- safety/compliance.

## Rule

LLMOps extends DevOps; it does not replace standard software engineering.


---

<!-- Source: 03_CICD_FOR_AGENT_SYSTEMS.md -->
# CI/CD for Agent Systems

## CI

Continuously verify:
- code;
- schemas;
- tools;
- prompts;
- retrieval;
- safety;
- evals.

## CD

Promote tested artifacts through environments with controlled rollout and rollback.

## Rule

Probabilistic behavior changes the test strategy, not the need for disciplined delivery.


---

<!-- Source: 04_ARTIFACTS_YOU_MUST_VERSION.md -->
# Artifacts You Must Version

## Version

- application code;
- agent instructions/prompts;
- model/provider config;
- temperature/reasoning settings;
- tool schemas;
- structured-output schemas;
- retriever config;
- chunking strategy;
- embedding model;
- guardrail policy;
- memory policy;
- eval datasets;
- infrastructure;
- dependencies.

## Rule

If a change can alter agent behavior, it should be traceable to a version.


---

<!-- Source: 05_SOURCE_CONTROL_STRATEGY.md -->
# Source Control Strategy

## Store in Git

- code;
- prompts;
- schemas;
- IaC;
- eval cases;
- deployment manifests;
- policy files.

## Avoid

Do not hide critical production behavior only in a UI without export/version history.


---

<!-- Source: 06_BRANCHING_AND_RELEASE_FLOW.md -->
# Branching and Release Flow

## Simple Flow

```text
feature/*
   ↓ PR
develop
   ↓ tested promotion
uat/staging
   ↓ approval
main/master
   ↓ release tag
production
```

## Rule

Use the lightest branching model that still provides review, traceability and environment control.


---

<!-- Source: 07_PROMPT_VERSIONING.md -->
# Prompt Versioning

## Version

- system instructions;
- agent role instructions;
- tool descriptions;
- examples/few-shot content.

## Metadata

Record:
- prompt ID;
- version;
- commit;
- environment.

## Rule

Never change production prompts without traceable version history and regression checks.


---

<!-- Source: 08_MODEL_VERSIONING.md -->
# Model Versioning

## Track

- provider;
- model/deployment name;
- revision if available;
- runtime parameters.

## Why

Model upgrades can alter:
- tool selection;
- format adherence;
- latency;
- cost;
- safety.

## Rule

A model change is a release event.


---

<!-- Source: 09_TOOL_AND_SCHEMA_VERSIONING.md -->
# Tool and Schema Versioning

## Track

- tool contract;
- argument schema;
- result schema;
- semantic behavior.

## Breaking Change

Renaming required fields or changing semantics requires compatibility planning.

## Rule

Treat tools like public APIs.


---

<!-- Source: 10_RETRIEVAL_AND_INDEX_VERSIONING.md -->
# Retrieval and Index Versioning

## Version

- source corpus;
- chunking;
- embedding model;
- index configuration;
- metadata schema;
- reranker.

## Rule

RAG quality can regress even when application code does not change.


---

<!-- Source: 11_MEMORY_POLICY_VERSIONING.md -->
# Memory Policy Versioning

## Version

- what gets stored;
- ranking;
- retention;
- expiry;
- conflict rules.

## Why

Changing memory policy can alter future agent behavior across sessions.


---

<!-- Source: 12_GUARDRAIL_POLICY_VERSIONING.md -->
# Guardrail and Policy Versioning

## Track

- safety policy;
- tool-risk tiers;
- approval thresholds;
- redaction rules.

## Rule

Security policy changes must be auditable like code changes.


---

<!-- Source: 13_EVAL_DATASET_VERSIONING.md -->
# Eval Dataset Versioning

## Store

- case ID;
- input;
- expected outcome;
- rubric;
- provenance;
- dataset version.

## Rule

A score is meaningless without knowing which dataset/version produced it.


---

<!-- Source: 14_BUILD_AND_PACKAGE_PIPELINE.md -->
# Build and Package Pipeline

## Pipeline

lint → compile/build → unit tests → package → SBOM/dependency scan → artifact publish

## Agent SDK

Package:
- Python wheel;
- npm package;
- Maven artifact;
- NuGet package.


---

<!-- Source: 15_UNIT_CONTRACT_AND_INTEGRATION_GATES.md -->
# Unit, Contract and Integration Gates

## Gates

- unit tests pass;
- tool contracts pass;
- schema compatibility pass;
- integration tests pass.

## Rule

Deterministic failures should stop the pipeline before expensive LLM evals run.


---

<!-- Source: 16_AGENT_REGRESSION_GATES.md -->
# Agent Regression Gates

## Check

- task success;
- tool accuracy;
- trajectory;
- structured output;
- safety.

## Rule

Use thresholds and allowed deltas against a baseline.


---

<!-- Source: 17_RAG_EVALUATION_GATES.md -->
# RAG Evaluation Gates

## Check

- retrieval hit rate;
- recall@k;
- groundedness;
- citation correctness;
- answer relevance.

## Rule

Block releases when retrieval quality materially regresses.


---

<!-- Source: 18_SAFETY_AND_SECURITY_GATES.md -->
# Safety and Security Gates

## Check

- prompt injection cases;
- unauthorized tools;
- tenant isolation;
- secret leakage;
- approval bypass.

## Rule

Critical security regression threshold should normally be zero.


---

<!-- Source: 19_LATENCY_AND_COST_GATES.md -->
# Latency and Cost Gates

## Check

- p95 latency;
- tokens/task;
- tool calls/task;
- cost/successful task.

## Rule

A functionally correct release can still be rejected for unacceptable latency or cost regression.


---

<!-- Source: 20_INFRASTRUCTURE_AS_CODE.md -->
# Infrastructure as Code

## Use

Define reproducibly:
- compute;
- network;
- identities;
- storage;
- monitoring;
- secrets references;
- model endpoints.

## Benefits

repeatability, review, drift detection, rollback.


---

<!-- Source: 21_CONFIGURATION_AND_SECRETS_MANAGEMENT.md -->
# Configuration and Secrets Management

## Config

Keep environment-specific configuration external to code.

## Secrets

Use managed secret stores/identity rather than plaintext files.

## Rule

Prompt text is not a secret-management system.


---

<!-- Source: 22_ENVIRONMENTS_DEV_UAT_PROD.md -->
# DEV, UAT and PROD

## DEV

Fast iteration, richer debugging, lower-risk data.

## UAT/Staging

Production-like validation and stakeholder acceptance.

## PROD

Controlled, monitored, least-privilege operation.

## Rule

Environment boundaries must include data, secrets, model deployments and telemetry.


---

<!-- Source: 23_ENVIRONMENT_PROMOTION.md -->
# Environment Promotion

## Pattern

```text
Same versioned artifact
DEV → UAT → PROD
```

## Avoid

Rebuilding differently for each environment.

## Rule

Promote immutable artifacts; change environment configuration separately.


---

<!-- Source: 24_DEPLOYMENT_STRATEGIES.md -->
# Deployment Strategies

## Strategies

- rolling;
- canary;
- blue-green;
- shadow;
- feature-flagged.

## Selection

Choose based on risk, traffic and rollback needs.


---

<!-- Source: 25_CANARY_DEPLOYMENT.md -->
# Canary Deployment

## Pattern

Route small percentage to new version first.

## Observe

- task success;
- safety;
- latency;
- cost;
- error rate.

## Rule

Canary decisions should use predefined rollback thresholds.


---

<!-- Source: 26_BLUE_GREEN_DEPLOYMENT.md -->
# Blue-Green Deployment

## Pattern

Keep old and new environments side-by-side and switch traffic.

## Benefit

Fast rollback.

## Trade-Off

Higher temporary infrastructure cost.


---

<!-- Source: 27_SHADOW_TRAFFIC.md -->
# Shadow Traffic

## Pattern

Replay/copy production requests to candidate version without affecting user outcome.

## Use

Compare behavior safely.

## Caution

Protect sensitive data and avoid duplicate side effects.


---

<!-- Source: 28_FEATURE_FLAGS_AND_PROGRESSIVE_DELIVERY.md -->
# Feature Flags and Progressive Delivery

## Use

Enable:
- new model;
- new prompt;
- new tool;
- memory feature;
- retriever.

## Rule

Flags should have owners, expiry and cleanup plans.


---

<!-- Source: 29_ROLLBACK_STRATEGY.md -->
# Rollback Strategy

## Rollback Scope

Be able to restore:
- code;
- prompt;
- model config;
- tool schema;
- retriever/index;
- guardrail policy.

## Rule

Rollback is not complete if only the container image is reverted.


---

<!-- Source: 30_MODEL_PROVIDER_FAILOVER.md -->
# Model Provider Failover

## Pattern

Primary provider/model → fallback provider/model.

## Need

- normalized interface;
- capability compatibility;
- prompt/schema compatibility;
- eval coverage.

## Rule

Failover must be tested, not merely configured.


---

<!-- Source: 31_RUNTIME_AND_AGENT_SDK_RELEASES.md -->
# Runtime and Agent SDK Releases

## Release

Separate:
- runtime version;
- SDK version;
- agent template/version;
- provider adapter version.

## Rule

Consumers should know compatibility ranges.


---

<!-- Source: 32_MULTI_LANGUAGE_SDK_RELEASE_PIPELINE.md -->
# Multi-Language SDK Release Pipeline

## Languages

Python / Java / C# / TypeScript.

## Pipeline

common spec → generated/shared fixtures → language-specific tests → package publish → compatibility matrix.

## Rule

Semantic parity first; idiomatic APIs second.


---

<!-- Source: 33_CONTAINERIZATION_AND_KUBERNETES.md -->
# Containerization and Kubernetes

## Use

For self-hosted runtimes:
- immutable images;
- health probes;
- autoscaling;
- resource limits;
- rollout control.

## Agent-Specific

Size for model/tool concurrency, streaming connections and long-running tasks.


---

<!-- Source: 34_OBSERVABILITY_IN_RELEASES.md -->
# Observability in Releases

## Every Release

Tag telemetry with:
- app version;
- SDK version;
- prompt version;
- model/deployment;
- environment.

## Benefit

Correlate regressions with exact release components.


---

<!-- Source: 35_PRODUCTION_EVALUATION_AND_DRIFT.md -->
# Production Evaluation and Drift

## Monitor

- sampled trace evals;
- task success;
- tool errors;
- groundedness;
- safety;
- cost/latency.

## Drift

May come from:
- model change;
- data change;
- user behavior;
- tool/API change.


---

<!-- Source: 36_INCIDENT_RESPONSE_AND_POSTMORTEMS.md -->
# Incident Response and Postmortems

## Incident Flow

detect → contain → rollback/disable → diagnose → recover → postmortem.

## Postmortem

Capture:
- impact;
- timeline;
- root cause;
- failed controls;
- new regression tests.

## Rule

Every meaningful incident should improve the eval/test suite.


---

<!-- Source: 37_COST_GOVERNANCE.md -->
# Cost Governance

## Controls

- token budgets;
- model routing;
- max turns;
- caching;
- quota;
- spend alerts.

## Metric

Cost per successful task.


---

<!-- Source: 38_DATA_AND_PRIVACY_GOVERNANCE.md -->
# Data and Privacy Governance

## Govern

- prompt storage;
- trace retention;
- evaluation data;
- PII;
- embeddings;
- memory.

## Rule

Production data used for eval/training must follow explicit policy.


---

<!-- Source: 39_COMPLIANCE_AND_AUDITABILITY.md -->
# Compliance and Auditability

## Need

Trace:
- who changed what;
- who approved;
- which version deployed;
- which model/prompt produced an outcome.

## Rule

Release traceability is part of enterprise AI governance.


---

<!-- Source: 40_GITOPS_AND_POLICY_AS_CODE.md -->
# GitOps and Policy as Code

## GitOps

Git is the desired-state source for deployable configuration.

## Policy as Code

Automate checks for:
- allowed models;
- regions;
- network;
- security;
- minimum eval thresholds.


---

<!-- Source: 41_REFERENCE_GITHUB_ACTIONS_FLOW.md -->
# Reference GitHub Actions Flow

## Conceptual Flow

```yaml
jobs:
  build:
  unit-tests:
  contract-tests:
  agent-evals:
  security:
  cost-latency-gate:
  package:
  deploy-dev:
  deploy-uat:
  canary-prod:
  promote-prod:
```

## Rule

Keep expensive live-model evals targeted and cache/reuse fixtures where safe.


---

<!-- Source: 42_REFERENCE_AZURE_DEVOPS_FLOW.md -->
# Reference Azure DevOps Flow

## Stages

```text
Build
 → Test
 → Eval
 → Security
 → Publish Artifact
 → DEV
 → UAT Approval
 → Canary PROD
 → Full PROD
```

## Controls

Use environment approvals and protected service connections.


---

<!-- Source: 43_PRODUCTION_ARCHITECTURE.md -->
# Agentic AI CI/CD & LLMOps — Production Architecture

## Reference

```text
Git
 ↓
CI Pipeline
 ├─ tests
 ├─ evals
 ├─ security
 └─ cost/latency
 ↓
Artifact Registry
 ↓
DEV → UAT → PROD
          ↓
     Canary / Flags
          ↓
 Agent Runtime
          ↓
Observability + Trace Evals
          ↓
Rollback / Feedback
```

## Control Plane

Version registry for:
- code;
- prompts;
- models;
- tools;
- retrieval;
- policies;
- datasets.


---

<!-- Source: 44_INTERVIEW_QUESTIONS.md -->
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


---

<!-- Source: 45_SYSTEM_DESIGN_QUESTIONS.md -->
# Agentic AI CI/CD & LLMOps — System Design Questions

## Q1 — Design a Release Pipeline for an Agent SDK

Build → unit/contract → agent regression → security → cost/latency → package → DEV/UAT → canary → production.

## Q2 — Design Safe Model Upgrade

Pin candidate model, run offline evals, shadow/canary, compare quality/cost/latency, promote or rollback.

## Q3 — Design Prompt Deployment

Prompt in Git + version tag + regression dataset + approval + progressive rollout + telemetry.

## Q4 — Design RAG Index Release

Version corpus/chunking/embedding/index, build parallel index, evaluate, switch alias, rollback alias if needed.

## Q5 — Design Multi-Language SDK Delivery

Canonical contract → parity tests → per-language packaging → release notes → deprecation/compatibility matrix.

## Answer Framework

**Version → build → test/eval → secure → package → promote → canary → observe → rollback.**


---

<!-- Source: 46_RELEASE_CHECKLIST.md -->
# Agentic AI Release Checklist

## Checklist

- [ ] Code version tagged
- [ ] Prompt version tagged
- [ ] Model/deployment pinned
- [ ] Tool schemas versioned
- [ ] Structured-output schemas checked
- [ ] RAG/index version recorded
- [ ] Memory/guardrail policy versioned
- [ ] Unit tests pass
- [ ] Contract tests pass
- [ ] Agent regression passes
- [ ] RAG eval passes
- [ ] Safety/security tests pass
- [ ] p95 latency within budget
- [ ] Cost/success within budget
- [ ] Artifact immutable
- [ ] DEV verified
- [ ] UAT approved
- [ ] Canary thresholds configured
- [ ] Rollback version identified
- [ ] Observability version labels present
- [ ] Production monitoring active


---

<!-- Source: 47_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
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
