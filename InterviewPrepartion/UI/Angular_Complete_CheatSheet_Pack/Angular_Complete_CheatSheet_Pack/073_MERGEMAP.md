# mergeMap

## What / Why

Subscribes to multiple inner Observables concurrently.

## Mental Model

```text
events → mergeMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: mergeMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for concurrent independent work.

## Common Mistake / Interview Trap

Control concurrency for high-volume sources.

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

> **mergeMap:** Subscribes to multiple inner Observables concurrently.
