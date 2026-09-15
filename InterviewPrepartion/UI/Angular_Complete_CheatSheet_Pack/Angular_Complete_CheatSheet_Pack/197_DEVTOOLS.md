# DevTools

## What / Why

Angular DevTools inspects components, DI and performance.

## Mental Model

```text
browser extension
```

## Example / Recall

```ts
// Minimal recall example for: DevTools
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for change detection/component diagnosis.

## Common Mistake / Interview Trap

Production profiling still needs real-user metrics.

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

> **DevTools:** Angular DevTools inspects components, DI and performance.
