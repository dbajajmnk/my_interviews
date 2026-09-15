# Caching

## What / Why

Cache at correct layer based on data freshness and ownership.

## Mental Model

```text
browser/query/service/server/CDN
```

## Example / Recall

```ts
// Minimal recall example for: Caching
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use explicit invalidation/revalidation.

## Common Mistake / Interview Trap

shareReplay is not a universal data cache.

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

> **Caching:** Cache at correct layer based on data freshness and ownership.
