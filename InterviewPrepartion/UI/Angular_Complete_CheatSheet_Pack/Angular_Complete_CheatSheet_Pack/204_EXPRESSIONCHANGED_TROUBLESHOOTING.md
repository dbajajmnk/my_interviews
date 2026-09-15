# ExpressionChanged Troubleshooting

## What / Why

A binding changes after it was checked in the same verification cycle.

## Mental Model

```text
late mutation
```

## Example / Recall

```ts
// Minimal recall example for: ExpressionChanged Troubleshooting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Fix lifecycle/data flow.

## Common Mistake / Interview Trap

setTimeout is usually a workaround.

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

> **ExpressionChanged Troubleshooting:** A binding changes after it was checked in the same verification cycle.
