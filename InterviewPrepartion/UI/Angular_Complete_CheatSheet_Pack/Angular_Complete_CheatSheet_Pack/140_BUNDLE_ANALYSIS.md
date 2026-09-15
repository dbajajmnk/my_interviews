# Bundle Analysis

## What / Why

Inspect generated chunks/dependency size.

## Mental Model

```text
source-map-explorer/build stats
```

## Example / Recall

```ts
// Minimal recall example for: Bundle Analysis
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use before dependency replacement.

## Common Mistake / Interview Trap

A small code change can import a huge package.

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

> **Bundle Analysis:** Inspect generated chunks/dependency size.
