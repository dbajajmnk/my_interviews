# concatMap

## What / Why

Queues inner Observables sequentially.

## Mental Model

```text
events → concatMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: concatMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when order matters.

## Common Mistake / Interview Trap

Can build backlog.

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

> **concatMap:** Queues inner Observables sequentially.
