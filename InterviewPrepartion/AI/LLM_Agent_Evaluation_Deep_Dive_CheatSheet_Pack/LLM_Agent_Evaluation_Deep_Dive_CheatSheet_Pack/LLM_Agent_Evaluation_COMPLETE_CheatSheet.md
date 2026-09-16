# LLM & Agent Evaluation — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
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


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# LLM & Agent Evaluation — 30-Second Recall

## Recall

```text
Evaluation =
Dataset
+ Run
+ Evidence
+ Metrics
+ Judge
+ Threshold
+ Regression
+ Release Gate
```

## 30-Second Interview Answer

> I evaluate agents at multiple layers. I measure final task success, structured output correctness, tool selection and arguments, trajectory efficiency, retrieval quality, groundedness, safety, latency, and cost. I use deterministic checks where possible, model-based judges for subjective criteria, human review for calibration and high-risk cases, and trace-based regression suites in CI so releases are blocked when key quality metrics fall below thresholds.

## Do Not Forget

- Final-answer quality alone is not enough for agents.
- Tool/trajectory errors may be hidden by a good final answer.
- LLM-as-judge needs calibration.
- Golden datasets need representative failure cases.
- Cost/latency are part of quality in production.
- Evaluation must be repeatable enough to detect regression.


---

<!-- Source: 02_WHAT_IS_LLM_AGENT_EVALUATION.md -->
# What Is LLM & Agent Evaluation?

## Definition

Evaluation measures whether an LLM or agent system behaves correctly, usefully, safely, efficiently, and consistently for the intended task.

## Agent Evaluation Is Broader

Agents require evaluation of:
- outputs;
- tool use;
- retrieval;
- state transitions;
- orchestration;
- memory;
- safety;
- latency;
- cost.

## Rule

> Evaluate the system, not just the language model.


---

<!-- Source: 03_OFFLINE_VS_ONLINE_EVALUATION.md -->
# Offline vs Online Evaluation

## Offline

Run test datasets before deployment.

Use for:
- regression;
- model comparison;
- prompt changes;
- tool/schema changes;
- release gates.

## Online

Measure real production behavior.

Use for:
- user success;
- failure rates;
- escalation rates;
- live latency/cost;
- drift.

## Rule

Offline tells you whether a release is safe enough to ship; online tells you whether it actually works for users.


---

<!-- Source: 04_EVAL_DATASETS_AND_GOLDEN_SETS.md -->
# Evaluation Datasets and Golden Sets

## Golden Dataset

A curated set of representative test cases with expected outcomes or evaluation criteria.

## Include

- happy paths;
- edge cases;
- adversarial cases;
- ambiguous requests;
- tool failures;
- retrieval failures;
- policy-sensitive scenarios.

## Rule

A dataset should represent production reality, not only easy examples.


---

<!-- Source: 05_TASK_SUCCESS_METRICS.md -->
# Task Success Metrics

## Examples

- resolved correctly;
- required action completed;
- expected artifact produced;
- correct ticket routed;
- correct report generated;
- user goal achieved.

## Binary vs Graded

Binary:
```text
success / failure
```

Graded:
```text
0.0 – 1.0
```

## Rule

Task success is often the most important top-level metric.


---

<!-- Source: 06_DETERMINISTIC_EVALUATORS.md -->
# Deterministic Evaluators

## Examples

- exact match;
- schema validation;
- regex;
- unit test;
- database assertion;
- expected tool name;
- argument comparison;
- state transition check.

## Strength

Repeatable and cheap.

## Limitation

Cannot judge nuanced quality well.

## Rule

Use deterministic checks whenever the requirement itself is deterministic.


---

<!-- Source: 07_LLM_AS_JUDGE.md -->
# LLM-as-Judge

## Use

Useful for subjective criteria such as:
- clarity;
- completeness;
- groundedness;
- relevance;
- helpfulness.

## Judge Prompt

Define:
- rubric;
- score scale;
- evidence;
- examples;
- output schema.

## Risk

Judges may have:
- bias;
- inconsistency;
- verbosity preference;
- self-preference;
- position bias.

## Rule

Calibrate model judges against human judgments and deterministic signals.


---

<!-- Source: 08_HUMAN_EVALUATION.md -->
# Human Evaluation

## Best For

- high-stakes quality;
- subtle domain correctness;
- calibration;
- user experience;
- disagreement resolution.

## Rubrics

Use clear scoring dimensions rather than “looks good.”

## Inter-Rater Agreement

Measure whether reviewers interpret the rubric consistently.


---

<!-- Source: 09_OUTPUT_QUALITY_EVALUATION.md -->
# Output Quality Evaluation

## Dimensions

- correctness;
- relevance;
- completeness;
- conciseness;
- clarity;
- tone;
- policy compliance.

## Rule

Do not combine every dimension into one vague “quality” score.


---

<!-- Source: 10_STRUCTURED_OUTPUT_EVALUATION.md -->
# Structured Output Evaluation

## Checks

- schema valid;
- required fields present;
- enum values valid;
- business rules valid;
- semantic correctness.

## Example

Schema-valid:
```json
{"priority":"high","confidence":0.99}
```
may still be semantically wrong.

## Rule

Evaluate both structure and meaning.


---

<!-- Source: 11_TOOL_CALL_EVALUATION.md -->
# Tool Call Evaluation

## Evaluate

- correct tool selected;
- unnecessary tool avoided;
- arguments correct;
- permissions respected;
- result handled correctly.

## Metrics

- tool selection accuracy;
- argument accuracy;
- invalid call rate;
- unnecessary call rate.

## Rule

For agents, tool correctness is often as important as final text.


---

<!-- Source: 12_TRAJECTORY_EVALUATION.md -->
# Trajectory Evaluation

## Trajectory

Sequence of:
- model turns;
- tool calls;
- handoffs;
- retrieval;
- state changes.

## Evaluate

- valid path;
- unnecessary steps;
- loops;
- wrong delegation;
- failed recovery.

## Rule

A good final answer can hide a bad execution path; evaluate both.


---

<!-- Source: 13_AGENT_PATH_EFFICIENCY.md -->
# Agent Path Efficiency

## Metrics

- number of turns;
- tool calls;
- retriever calls;
- agent handoffs;
- retries;
- elapsed time.

## Goal

Minimize wasted hops without sacrificing correctness.

## Rule

Efficiency should be evaluated relative to task success.


---

<!-- Source: 14_ORCHESTRATION_EVALUATION.md -->
# Orchestration Evaluation

## Evaluate

- correct route;
- correct specialist;
- correct termination;
- correct parallelization;
- correct retry/replan.

## Examples

Router accuracy, supervisor delegation accuracy, evaluator-loop success rate.


---

<!-- Source: 15_RAG_RETRIEVAL_EVALUATION.md -->
# RAG Retrieval Evaluation

## Metrics

- Precision@K
- Recall@K
- Hit Rate
- MRR
- NDCG

## Question

Did the retriever surface the evidence needed to answer correctly?

## Rule

Evaluate retrieval separately from answer generation.


---

<!-- Source: 16_RAG_GENERATION_EVALUATION.md -->
# RAG Generation Evaluation

## Evaluate

- answer relevance;
- correctness;
- groundedness;
- citation use;
- unsupported claims.

## Rule

Good retrieval does not guarantee good generation.


---

<!-- Source: 17_GROUNDEDNESS_AND_FAITHFULNESS.md -->
# Groundedness and Faithfulness

## Groundedness

Whether answer claims are supported by provided evidence.

## Faithfulness

Whether the answer accurately reflects source content without inventing unsupported facts.

## Evaluation

Use:
- claim extraction;
- evidence matching;
- model judge;
- human review for important cases.


---

<!-- Source: 18_CITATION_EVALUATION.md -->
# Citation Evaluation

## Evaluate

- citation exists;
- citation supports claim;
- source is correct;
- citation maps to used evidence.

## Rule

Citation presence alone is not citation correctness.


---

<!-- Source: 19_MEMORY_EVALUATION.md -->
# Memory Evaluation

## Evaluate

- correct memory recalled;
- irrelevant memory excluded;
- stale memory avoided;
- updates applied;
- delete/forget honored.

## Metrics

- memory precision;
- recall;
- stale-memory rate;
- harmful-memory rate.


---

<!-- Source: 20_CONTEXT_QUALITY_EVALUATION.md -->
# Context Quality Evaluation

## Evaluate

- relevance;
- freshness;
- token efficiency;
- authorization;
- completeness.

## Metric Ideas

- useful context / total context;
- stale item rate;
- irrelevant-token ratio.


---

<!-- Source: 21_SAFETY_AND_GUARDRAIL_EVALUATION.md -->
# Safety and Guardrail Evaluation

## Evaluate

- blocked unsafe behavior;
- allowed safe behavior;
- tool abuse prevention;
- policy compliance.

## Metrics

- true positive;
- false positive;
- false negative;
- bypass rate.

## Rule

Over-blocking and under-blocking both matter.


---

<!-- Source: 22_PROMPT_INJECTION_EVALUATION.md -->
# Prompt Injection Evaluation

## Test Cases

- malicious retrieved document;
- malicious tool output;
- user instruction to reveal secrets;
- cross-tenant injection.

## Success Criteria

Agent must preserve system policy and tool boundaries.


---

<!-- Source: 23_HITL_EVALUATION.md -->
# Human-in-the-Loop Evaluation

## Evaluate

- approval triggered when required;
- safe actions not over-escalated;
- resume works correctly;
- rejection respected.

## Metrics

- required-approval recall;
- unnecessary-approval rate;
- resume success.


---

<!-- Source: 24_LATENCY_COST_AND_TOKEN_METRICS.md -->
# Latency, Cost and Token Metrics

## Metrics

- total latency;
- time to first token/event;
- model latency;
- tool latency;
- token usage;
- cost per successful task.

## Rule

Cost per success is more meaningful than raw token count.


---

<!-- Source: 25_RELIABILITY_AND_RESILIENCE_EVALUATION.md -->
# Reliability and Resilience Evaluation

## Failure Injection

Test:
- tool timeout;
- rate limit;
- provider error;
- bad retrieval;
- malformed output.

## Evaluate

- retry;
- fallback;
- graceful degradation;
- eventual success.


---

<!-- Source: 26_STREAMING_EVALUATION.md -->
# Streaming Evaluation

## Evaluate

- event ordering;
- terminal completion;
- disconnect/reconnect;
- cancellation;
- duplicate handling;
- partial error.

## UX Metrics

- time to first useful event;
- perceived responsiveness.


---

<!-- Source: 27_MULTI_AGENT_EVALUATION.md -->
# Multi-Agent Evaluation

## Evaluate

- correct role assignment;
- handoff quality;
- context isolation;
- duplicate work;
- coordination overhead;
- final synthesis.

## Rule

Measure whether multiple agents outperform a simpler baseline.


---

<!-- Source: 28_EVALUATOR_DESIGN_AND_RUBRICS.md -->
# Evaluator Design and Rubrics

## Rubric

Define:
- criterion;
- score scale;
- examples;
- pass threshold.

## Example

```text
Groundedness:
0 = unsupported
1 = partially supported
2 = fully supported
```

## Rule

Specific rubrics improve consistency.


---

<!-- Source: 29_JUDGE_CALIBRATION_AND_BIAS.md -->
# Judge Calibration and Bias

## Calibration

Compare model judge decisions against a trusted human-reviewed sample.

## Biases

- verbosity bias;
- self-preference;
- order bias;
- style preference.

## Controls

- blinded outputs;
- randomized order;
- multiple judges;
- human spot checks.


---

<!-- Source: 30_REGRESSION_TESTING.md -->
# Regression Testing

## Purpose

Detect quality drops after:
- prompt changes;
- model upgrades;
- tool changes;
- retrieval changes;
- schema changes.

## Rule

Every production incident should contribute new regression cases when possible.


---

<!-- Source: 31_AB_TESTING_AND_EXPERIMENTATION.md -->
# A/B Testing and Experimentation

## Use

Compare candidate systems in production or realistic traffic.

## Metrics

- task success;
- user satisfaction;
- completion rate;
- cost;
- latency.

## Rule

A/B tests complement offline evals; they do not replace safety gating.


---

<!-- Source: 32_RELEASE_GATES_AND_CI.md -->
# Release Gates and CI

## Pipeline

```text
PR
 ↓
Unit tests
 ↓
Agent eval suite
 ↓
Safety evals
 ↓
Cost/latency check
 ↓
Threshold pass?
 ├─ yes → deploy
 └─ no  → block
```

## Rule

Evaluation should be executable and automatable, not only a spreadsheet exercise.


---

<!-- Source: 33_PRODUCTION_MONITORING.md -->
# Production Monitoring

## Monitor

- task success proxies;
- error rate;
- tool failures;
- fallback rate;
- escalation rate;
- cost;
- latency;
- user feedback.

## Drift

Watch for behavior changes after:
- model updates;
- data changes;
- tool/API changes.


---

<!-- Source: 34_TRACE_BASED_EVALUATION.md -->
# Trace-Based Evaluation

## Why

Agent traces contain rich execution evidence.

## Evaluate From Trace

- chosen tools;
- order;
- retries;
- handoffs;
- retrieved docs;
- final outcome.

## Rule

Trace-based evaluation is critical for agent debugging and regression analysis.


---

<!-- Source: 35_EVAL_ARCHITECTURE.md -->
# Evaluation Architecture

## Reference

```text
Eval Dataset
   ↓
Runner
   ↓
Agent/System Under Test
   ↓
Trace Store
   ↓
Evaluator Pipeline
 ├─ deterministic
 ├─ judge model
 ├─ safety
 ├─ retrieval
 ├─ latency/cost
 └─ human sample
   ↓
Scorecard
   ↓
Release Gate / Dashboard
```

## Design

Keep evaluator logic versioned separately from system-under-test.


---

<!-- Source: 36_PYTHON_REFERENCE_FLOW.md -->
# Python Evaluation Reference Flow

## Pseudo-Code

```python
for case in dataset:
    result = run_agent(case.input)

    scores = {
        "task_success": task_success(case, result),
        "tool_accuracy": tool_accuracy(case, result.trace),
        "groundedness": judge_groundedness(result),
        "latency_ms": result.latency_ms,
        "cost": result.cost,
    }

    save_scores(case.id, scores)
```

## Rule

The architecture matters more than a specific evaluation library.


---

<!-- Source: 37_JAVA_REFERENCE_FLOW.md -->
# Java Evaluation Reference Flow

## Interfaces

```java
interface Evaluator<T> {
    EvaluationResult evaluate(
        EvalCase testCase,
        T actual);
}

record EvaluationResult(
    String metric,
    double score,
    String evidence) {}
```

## Enterprise Point

Keep evaluators composable, versioned, and runnable in CI.


---

<!-- Source: 38_INTERVIEW_QUESTIONS.md -->
# LLM & Agent Evaluation — Interview Q&A

## 1. How do you evaluate an agent?

At output, tool, retrieval, trajectory, safety, latency/cost, and task-success levels.

## 2. Offline vs online?

Offline before release; online on production behavior.

## 3. What is LLM-as-judge?

Using a model to score outputs against a rubric.

## 4. Why not rely only on LLM-as-judge?

Judges can be biased and inconsistent.

## 5. Tool-call evaluation?

Check correct tool, correct arguments, unnecessary calls, and policy compliance.

## 6. Trajectory evaluation?

Evaluate the path of actions, not only the final answer.

## 7. How do you evaluate RAG?

Retrieval metrics + grounded answer metrics + citation correctness.

## 8. How do you evaluate memory?

Correct recall, irrelevant memory exclusion, stale-memory rate, and forget/update behavior.

## 9. What makes a good golden dataset?

Representative normal, edge, adversarial, and failure cases.

## 10. How do you prevent eval overfitting?

Use held-out cases, production samples, and evolving datasets.

## 11. How do evals enter CI?

Run automated suites and block releases below defined thresholds.

## 12. What is trace-based evaluation?

Scoring tool calls, handoffs, retrieval, and execution paths from traces.

## 13. How do you evaluate safety?

Attack cases plus false-positive/false-negative measurement.

## 14. What metric matters most?

End-to-end task success, supported by layer-specific diagnostics.

## 15. One-line principle?

> Evaluate outcomes and execution, not just fluent text.


---

<!-- Source: 39_SYSTEM_DESIGN_QUESTIONS.md -->
# LLM & Agent Evaluation — System Design Questions

## Q1 — Design an Evaluation Platform

Dataset registry → runner → trace capture → evaluator pipeline → score store → dashboard → CI gate.

## Q2 — Evaluate Enterprise RAG

Measure retrieval recall/precision, groundedness, citation correctness, latency, and access-control correctness.

## Q3 — Evaluate Tool-Using Agent

Measure tool selection, arguments, retries, side-effect correctness, and final task success.

## Q4 — Evaluate Multi-Agent System

Measure correct routing, handoff quality, duplicate work, path efficiency, and final synthesis.

## Q5 — Production Eval Strategy

Combine sampled traces, user feedback, business KPIs, automated judges, and incident-driven regression cases.

## Answer Framework

**Dataset → runner → traces → evaluators → scorecard → thresholds → CI gate → production monitoring.**


---

<!-- Source: 40_EVALUATION_SCORECARD_TEMPLATE.md -->
# Evaluation Scorecard Template

## Template

| Dimension | Metric | Threshold | Actual | Status |
|---|---|---:|---:|---|
| Task | Task success | ≥ 90% |  |  |
| Tools | Tool selection accuracy | ≥ 95% |  |  |
| Tools | Argument validity | ≥ 98% |  |  |
| RAG | Recall@K | ≥ 90% |  |  |
| RAG | Groundedness | ≥ 95% |  |  |
| Safety | Critical violation rate | 0% |  |  |
| Memory | Stale-memory rate | ≤ 2% |  |  |
| Efficiency | Avg. agent turns | ≤ target |  |  |
| Latency | p95 latency | ≤ target |  |  |
| Cost | Cost/successful task | ≤ target |  |  |

## Rule

Use thresholds appropriate to the actual business risk and workload.


---

<!-- Source: 41_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# LLM & Agent Evaluation — One-Page Final Cheat Sheet

## Formula

```text
Agent Evaluation =
Task Success
+ Output Quality
+ Tool Accuracy
+ Trajectory Quality
+ Retrieval Quality
+ Groundedness
+ Memory Quality
+ Safety
+ Latency
+ Cost
```

## Evaluation Layers

- Output
- Structured result
- Tool call
- Retrieval
- Trajectory
- Orchestration
- Memory
- Safety
- Reliability
- Cost/latency

## Production Rules

1. Start from task success.
2. Add layer-specific diagnostics.
3. Use deterministic checks where possible.
4. Calibrate LLM judges.
5. Build representative golden datasets.
6. Evaluate traces, not only final output.
7. Include adversarial/safety cases.
8. Add CI release gates.
9. Monitor production drift.
10. Turn incidents into regression tests.

## 30-Second Answer

> I treat evaluation as a production engineering discipline. I maintain representative datasets, run the full agent, capture traces, score final task success plus tool, retrieval, trajectory, safety, latency, and cost metrics, use deterministic evaluators where possible and calibrated model judges where necessary, then enforce regression thresholds in CI and continue monitoring sampled production traces after release.

## Recall Line

> **Evaluate outcomes and execution, not just fluent text.**
