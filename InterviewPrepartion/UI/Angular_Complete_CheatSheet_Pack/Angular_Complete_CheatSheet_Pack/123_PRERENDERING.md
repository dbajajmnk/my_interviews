# Prerendering

## What / Why

Generates static HTML ahead of requests.

## Mental Model

```text
build → static HTML
```

## Example / Recall

```ts
// Minimal recall example for: Prerendering
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for stable content routes.

## Common Mistake / Interview Trap

Dynamic/personalized data needs another render mode.

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

> **Prerendering:** Generates static HTML ahead of requests.
