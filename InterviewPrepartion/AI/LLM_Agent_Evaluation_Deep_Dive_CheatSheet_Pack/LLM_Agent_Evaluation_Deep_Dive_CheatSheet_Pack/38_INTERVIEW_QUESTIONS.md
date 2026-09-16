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
