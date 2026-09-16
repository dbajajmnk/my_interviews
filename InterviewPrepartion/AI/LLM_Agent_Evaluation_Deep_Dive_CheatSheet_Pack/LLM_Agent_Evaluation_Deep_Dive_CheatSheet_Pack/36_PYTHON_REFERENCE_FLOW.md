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
