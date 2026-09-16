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
