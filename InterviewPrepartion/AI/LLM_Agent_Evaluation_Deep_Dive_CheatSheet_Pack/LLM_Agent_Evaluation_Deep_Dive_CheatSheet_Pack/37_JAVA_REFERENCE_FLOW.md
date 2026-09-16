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
