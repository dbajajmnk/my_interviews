# Complete Enterprise Agent SDK System Design — Master Index

## Purpose

This is the integration pack that connects all prior Agent SDK topics into one coherent enterprise architecture.

Use it for:
- senior/staff/principal system-design interviews;
- Coforge Agent SDK & Developer Enablement interview;
- architecture discussions;
- whiteboarding;
- reference-platform design;
- future global Agent Platform roles.

## Master Architecture

```text
                           ┌──────────────────────────┐
                           │   Developers / Apps      │
                           │ Py / Java / C# / TS      │
                           └────────────┬─────────────┘
                                        │
                               Public Agent SDK
                                        │
        ┌───────────────────────────────┼───────────────────────────────┐
        │                               │                               │
     Agent API                       Tool API                       Run/Event API
        │                               │                               │
        └───────────────────────────────┼───────────────────────────────┘
                                        │
                               Agent Runtime / Orchestrator
                                        │
      ┌───────────────┬─────────────────┼─────────────────┬───────────────┐
      │               │                 │                 │               │
   Model GW        Tool Runtime      Context Layer      Memory          Retrieval
      │               │                 │                 │               │
Providers/API      Enterprise APIs      Auth/Tenant      Stores       Vector/BM25
      │               │                 │                 │               │
      └───────────────┴─────────────────┼─────────────────┴───────────────┘
                                        │
                               Workflow / State Engine
                                        │
      ┌───────────────┬─────────────────┼─────────────────┬───────────────┐
      │               │                 │                 │               │
   Guardrails       HITL             Evaluation        OTel            Reliability
      │               │                 │                 │               │
  Policy/AuthZ      Approval         Offline/Online    Traces        Retry/Fencing
                                        │
                                  CI/CD + LLMOps
                                        │
                              Dev → UAT → Canary → Prod
```

## Core Principle

> Keep the public SDK small and stable, make the runtime modular, keep security and authorization deterministic, make state durable, make telemetry first-class, and version everything that can change agent behavior.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_SYSTEM_DESIGN_REQUIREMENTS.md`
3. `03_FUNCTIONAL_REQUIREMENTS.md`
4. `04_NON_FUNCTIONAL_REQUIREMENTS.md`
5. `05_HIGH_LEVEL_ARCHITECTURE.md`
6. `06_CONTROL_PLANE_VS_DATA_PLANE.md`
7. `07_PUBLIC_SDK_LAYER.md`
8. `08_MULTI_LANGUAGE_SDK_LAYER.md`
9. `09_AGENT_RUNTIME_LAYER.md`
10. `10_MODEL_GATEWAY.md`
11. `11_PROVIDER_ADAPTERS.md`
12. `12_TOOL_RUNTIME.md`
13. `13_CONTEXT_MANAGEMENT_LAYER.md`
14. `14_MEMORY_LAYER.md`
15. `15_RAG_RETRIEVAL_LAYER.md`
16. `16_ORCHESTRATION_LAYER.md`
17. `17_WORKFLOW_STATE_ENGINE.md`
18. `18_STREAMING_ARCHITECTURE.md`
19. `19_HITL_ARCHITECTURE.md`
20. `20_GUARDRAIL_AND_POLICY_ARCHITECTURE.md`
21. `21_SECURITY_ARCHITECTURE.md`
22. `22_IDENTITY_AUTHN_AUTHZ.md`
23. `23_MULTI_TENANCY.md`
24. `24_OBSERVABILITY_ARCHITECTURE.md`
25. `25_EVALUATION_ARCHITECTURE.md`
26. `26_TESTING_ARCHITECTURE.md`
27. `27_RELIABILITY_ARCHITECTURE.md`
28. `28_DURABLE_EXECUTION_AND_FENCING.md`
29. `29_CICD_AND_LLMOPS_ARCHITECTURE.md`
30. `30_VERSIONING_AND_COMPATIBILITY_ARCHITECTURE.md`
31. `31_DEVELOPER_ENABLEMENT_ARCHITECTURE.md`
32. `32_FOUNDRY_INTEGRATION_ARCHITECTURE.md`
33. `33_STORAGE_ARCHITECTURE.md`
34. `34_EVENTING_AND_QUEUE_ARCHITECTURE.md`
35. `35_CACHE_ARCHITECTURE.md`
36. `36_DEPLOYMENT_TOPOLOGY.md`
37. `37_SCALING_STRATEGY.md`
38. `38_CAPACITY_AND_COST_MODEL.md`
39. `39_FAILURE_AND_DEGRADATION_MATRIX.md`
40. `40_END_TO_END_SEQUENCE_TOOL_CALL.md`
41. `41_END_TO_END_SEQUENCE_RAG.md`
42. `42_END_TO_END_SEQUENCE_HITL.md`
43. `43_END_TO_END_SEQUENCE_MULTI_AGENT.md`
44. `44_END_TO_END_SEQUENCE_LONG_RUNNING_JOB.md`
45. `45_API_CONTRACT_REFERENCE.md`
46. `46_DATA_CONTRACT_REFERENCE.md`
47. `47_EVENT_CONTRACT_REFERENCE.md`
48. `48_ERROR_CONTRACT_REFERENCE.md`
49. `49_ARCHITECTURE_DECISION_RECORDS.md`
50. `50_TRADE_OFFS_AND_ALTERNATIVES.md`
51. `51_SYSTEM_DESIGN_45_MINUTE_ANSWER.md`
52. `52_SYSTEM_DESIGN_10_MINUTE_ANSWER.md`
53. `53_WHITEBOARD_ORDER.md`
54. `54_INTERVIEWER_FOLLOW_UPS.md`
55. `55_PRINCIPAL_LEVEL_DISCUSSION_POINTS.md`
56. `56_ARCHITECTURE_CHECKLIST.md`
57. `57_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Requirements & architecture:** 01 → 12  
**Core agent layers:** 13 → 20  
**Enterprise controls:** 21 → 31  
**Platform/deployment:** 32 → 39  
**End-to-end flows:** 40 → 48  
**Interview mastery:** 49 → 57
