# NgOptimizedImage

## What / Why

Optimizes image loading hints and common image performance patterns.

## Mental Model

```text
ngSrc
```

## Example / Recall

```ts
// Minimal recall example for: NgOptimizedImage
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for static images.

## Common Mistake / Interview Trap

Image dimensions/loading strategy still matter.

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

> **NgOptimizedImage:** Optimizes image loading hints and common image performance patterns.
