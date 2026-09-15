# Memory Leak Troubleshooting

## What / Why

Long-lived subscriptions/listeners/resources outlive owning component.

## Mental Model

```text
takeUntilDestroyed/AsyncPipe/cleanup
```

## Example / Recall

```ts
// Minimal recall example for: Memory Leak Troubleshooting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use lifecycle-aware APIs.

## Common Mistake / Interview Trap

Destroying component does not automatically clean every custom external resource.

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

> **Memory Leak Troubleshooting:** Long-lived subscriptions/listeners/resources outlive owning component.
