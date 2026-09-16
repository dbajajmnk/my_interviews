# Agent Testing Engineering — Master Index

## Purpose

This pack covers testing as the engineering discipline that makes agent systems repeatable, debuggable, and release-safe.

Interview focus:
- unit vs integration vs end-to-end testing;
- deterministic fake models;
- fake tools and retrievers;
- contract testing;
- graph/workflow testing;
- state-transition testing;
- streaming testing;
- HITL testing;
- tool failure injection;
- retry/idempotency tests;
- memory/RAG testing;
- prompt/version regression;
- security/adversarial testing;
- CI/CD test pyramids;
- production confidence.

## Master Mental Model

```text
                    Agent System
                         │
        ┌────────────────┼────────────────┐
        ▼                ▼                ▼
   Deterministic      Probabilistic     Integration
      Logic              Logic            Boundaries
        │                │                │
        ▼                ▼                ▼
 Unit / Contract    Eval / Golden Set   Integration / E2E
        │                │                │
        └────────────────┼────────────────┘
                         ▼
                    CI Release Gate
```

## Core Principle

> Test deterministic behavior deterministically, test model behavior statistically, and test integration boundaries explicitly.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AGENT_TESTING.md`
3. `03_TEST_PYRAMID_FOR_AGENT_SYSTEMS.md`
4. `04_UNIT_TESTING_AGENT_LOGIC.md`
5. `05_FAKE_MODEL_PATTERN.md`
6. `06_SCRIPTED_MODEL_RESPONSES.md`
7. `07_FAKE_TOOL_PATTERN.md`
8. `08_TOOL_CONTRACT_TESTING.md`
9. `09_RETRIEVER_TESTING.md`
10. `10_RAG_PIPELINE_TESTING.md`
11. `11_MEMORY_TESTING.md`
12. `12_CONTEXT_ASSEMBLY_TESTING.md`
13. `13_STRUCTURED_OUTPUT_TESTING.md`
14. `14_TOOL_CALL_TESTING.md`
15. `15_STATE_TRANSITION_TESTING.md`
16. `16_LANGGRAPH_WORKFLOW_TESTING.md`
17. `17_ORCHESTRATION_TESTING.md`
18. `18_MULTI_AGENT_TESTING.md`
19. `19_STREAMING_TESTING.md`
20. `20_HITL_TESTING.md`
21. `21_RETRY_TIMEOUT_AND_CIRCUIT_BREAKER_TESTING.md`
22. `22_IDEMPOTENCY_AND_DUPLICATE_EXECUTION_TESTING.md`
23. `23_FAILURE_INJECTION.md`
24. `24_CHAOS_AND_RESILIENCE_TESTING.md`
25. `25_SECURITY_AND_PROMPT_INJECTION_TESTING.md`
26. `26_AUTHORIZATION_AND_TENANT_ISOLATION_TESTING.md`
27. `27_PROMPT_AND_MODEL_REGRESSION_TESTING.md`
28. `28_GOLDEN_DATASET_TESTING.md`
29. `29_PROPERTY_BASED_AND_FUZZ_TESTING.md`
30. `30_PERFORMANCE_AND_LOAD_TESTING.md`
31. `31_COST_BUDGET_TESTING.md`
32. `32_OBSERVABILITY_AND_TRACE_ASSERTIONS.md`
33. `33_CI_CD_TEST_GATES.md`
34. `34_TEST_ENVIRONMENTS_AND_FIXTURES.md`
35. `35_PYTHON_REFERENCE_TESTS.md`
36. `36_JAVA_REFERENCE_TESTS.md`
37. `37_TYPESCRIPT_REFERENCE_TESTS.md`
38. `38_CSHARP_REFERENCE_TESTS.md`
39. `39_PRODUCTION_VALIDATION_AND_CANARY.md`
40. `40_INTERVIEW_QUESTIONS.md`
41. `41_SYSTEM_DESIGN_QUESTIONS.md`
42. `42_TESTING_CHECKLIST.md`
43. `43_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 14  
**Workflow/runtime testing:** 15 → 24  
**Security/regression/performance:** 25 → 34  
**Language implementation:** 35 → 38  
**Production/interview:** 39 → 43
