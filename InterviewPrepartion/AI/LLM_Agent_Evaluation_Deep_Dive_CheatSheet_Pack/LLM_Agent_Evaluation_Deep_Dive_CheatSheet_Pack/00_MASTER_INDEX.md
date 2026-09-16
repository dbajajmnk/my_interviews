# LLM & Agent Evaluation — Master Index

## Purpose

This pack covers evaluation as the quality-control layer of LLM and agent systems.

Interview focus:
- offline vs online evaluation;
- golden datasets;
- deterministic and probabilistic metrics;
- LLM-as-judge;
- human evaluation;
- task success;
- tool-call accuracy;
- trajectory evaluation;
- RAG evaluation;
- memory evaluation;
- safety evaluation;
- latency/cost evaluation;
- regression testing;
- A/B tests;
- release gates;
- production monitoring;
- agent-specific evaluation architecture.

## Master Mental Model

```text
Candidate System
      ↓
 Evaluation Dataset
      ↓
 Run / Trace Capture
      ↓
 Evaluators
 ├─ Deterministic
 ├─ Model-based Judge
 ├─ Human
 ├─ Retrieval
 ├─ Tool / Trajectory
 ├─ Safety
 └─ Cost / Latency
      ↓
 Scorecard
      ↓
 Regression / Release Gate
      ↓
 Production Monitoring
```

## Core Principle

> Evaluate the behavior you care about at the level where it happens: output, tool choice, retrieval, trajectory, safety, cost, or end-to-end task success.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_LLM_AGENT_EVALUATION.md`
3. `03_OFFLINE_VS_ONLINE_EVALUATION.md`
4. `04_EVAL_DATASETS_AND_GOLDEN_SETS.md`
5. `05_TASK_SUCCESS_METRICS.md`
6. `06_DETERMINISTIC_EVALUATORS.md`
7. `07_LLM_AS_JUDGE.md`
8. `08_HUMAN_EVALUATION.md`
9. `09_OUTPUT_QUALITY_EVALUATION.md`
10. `10_STRUCTURED_OUTPUT_EVALUATION.md`
11. `11_TOOL_CALL_EVALUATION.md`
12. `12_TRAJECTORY_EVALUATION.md`
13. `13_AGENT_PATH_EFFICIENCY.md`
14. `14_ORCHESTRATION_EVALUATION.md`
15. `15_RAG_RETRIEVAL_EVALUATION.md`
16. `16_RAG_GENERATION_EVALUATION.md`
17. `17_GROUNDEDNESS_AND_FAITHFULNESS.md`
18. `18_CITATION_EVALUATION.md`
19. `19_MEMORY_EVALUATION.md`
20. `20_CONTEXT_QUALITY_EVALUATION.md`
21. `21_SAFETY_AND_GUARDRAIL_EVALUATION.md`
22. `22_PROMPT_INJECTION_EVALUATION.md`
23. `23_HITL_EVALUATION.md`
24. `24_LATENCY_COST_AND_TOKEN_METRICS.md`
25. `25_RELIABILITY_AND_RESILIENCE_EVALUATION.md`
26. `26_STREAMING_EVALUATION.md`
27. `27_MULTI_AGENT_EVALUATION.md`
28. `28_EVALUATOR_DESIGN_AND_RUBRICS.md`
29. `29_JUDGE_CALIBRATION_AND_BIAS.md`
30. `30_REGRESSION_TESTING.md`
31. `31_AB_TESTING_AND_EXPERIMENTATION.md`
32. `32_RELEASE_GATES_AND_CI.md`
33. `33_PRODUCTION_MONITORING.md`
34. `34_TRACE_BASED_EVALUATION.md`
35. `35_EVAL_ARCHITECTURE.md`
36. `36_PYTHON_REFERENCE_FLOW.md`
37. `37_JAVA_REFERENCE_FLOW.md`
38. `38_INTERVIEW_QUESTIONS.md`
39. `39_SYSTEM_DESIGN_QUESTIONS.md`
40. `40_EVALUATION_SCORECARD_TEMPLATE.md`
41. `41_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 10  
**Agent-specific evaluation:** 11 → 23  
**Operational evaluation:** 24 → 35  
**Implementation/interview:** 36 → 41
