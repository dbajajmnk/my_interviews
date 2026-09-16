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
