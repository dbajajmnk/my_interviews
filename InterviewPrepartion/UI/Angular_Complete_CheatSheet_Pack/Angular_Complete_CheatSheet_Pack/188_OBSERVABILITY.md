# Observability

## What / Why

Capture route, version, errors, HTTP timings and backend trace correlation.

## Mental Model

```text
frontend telemetry → backend traces
```

## Example / Recall

```ts
// Minimal recall example for: Observability
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use release-aware monitoring.

## Common Mistake / Interview Trap

Never log secrets/PII casually.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Observability:** Capture route, version, errors, HTTP timings and backend trace correlation.
