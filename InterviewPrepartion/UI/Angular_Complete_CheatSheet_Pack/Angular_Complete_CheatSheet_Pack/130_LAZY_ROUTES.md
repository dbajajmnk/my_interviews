# Lazy Routes

## What / Why

Split feature code by navigation boundary.

## Mental Model

```text
loadComponent/loadChildren
```

## Example / Recall

```ts
// Minimal recall example for: Lazy Routes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use broadly for large features.

## Common Mistake / Interview Trap

Avoid unnecessary nested waterfall chunks.

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

> **Lazy Routes:** Split feature code by navigation boundary.
