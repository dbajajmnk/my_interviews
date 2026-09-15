# Lazy Loading

## What / Why

Loads route component/config only when navigated.

## Mental Model

```text
loadComponent/loadChildren
```

## Example / Recall

```ts
// Minimal recall example for: Lazy Loading
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for feature boundaries and initial bundle reduction.

## Common Mistake / Interview Trap

Lazy loading alone does not guarantee good chunking/performance.

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

> **Lazy Loading:** Loads route component/config only when navigated.
