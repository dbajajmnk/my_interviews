# Defer Prefetch

## What / Why

Prefetches deferred code/data ahead of rendering.

## Mental Model

```text
prefetch on idle
```

## Example / Recall

```ts
// Minimal recall example for: Defer Prefetch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce perceived wait.

## Common Mistake / Interview Trap

Can waste network bandwidth.

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

> **Defer Prefetch:** Prefetches deferred code/data ahead of rendering.
