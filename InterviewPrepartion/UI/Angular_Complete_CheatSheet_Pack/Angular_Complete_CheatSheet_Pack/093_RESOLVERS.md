# Resolvers

## What / Why

Load data before route activation.

## Mental Model

```text
resolve
```

## Example / Recall

```ts
// Minimal recall example for: Resolvers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when route should not render without required data.

## Common Mistake / Interview Trap

Can delay navigation; use loading UX thoughtfully.

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

> **Resolvers:** Load data before route activation.
