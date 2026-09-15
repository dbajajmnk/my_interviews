# afterEveryRender

## What / Why

Runs after every render cycle.

## Mental Model

```text
afterEveryRender(...)
```

## Example / Recall

```ts
// Minimal recall example for: afterEveryRender
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use sparingly for integration/measurement.

## Common Mistake / Interview Trap

Can become expensive.

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

> **afterEveryRender:** Runs after every render cycle.
