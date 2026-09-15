# Preloading

## What / Why

Preload lazy routes/resources based on policy.

## Mental Model

```text
PreloadAllModules/custom
```

## Example / Recall

```ts
// Minimal recall example for: Preloading
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use if navigation likelihood justifies network cost.

## Common Mistake / Interview Trap

Preloading everything can defeat lazy loading.

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

> **Preloading:** Preload lazy routes/resources based on policy.
