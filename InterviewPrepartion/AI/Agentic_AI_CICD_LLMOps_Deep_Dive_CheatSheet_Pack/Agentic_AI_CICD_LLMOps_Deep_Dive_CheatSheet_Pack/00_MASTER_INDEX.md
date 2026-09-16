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
