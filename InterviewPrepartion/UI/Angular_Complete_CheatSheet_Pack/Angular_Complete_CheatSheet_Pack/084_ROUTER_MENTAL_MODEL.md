# Router Mental Model

## What / Why

Router matches URL to route configuration and renders route components/outlets.

## Mental Model

```text
URL → route match → guards/resolvers → component
```

## Example / Recall

```ts
// Minimal recall example for: Router Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use router as application navigation architecture.

## Common Mistake / Interview Trap

Do not build complex navigation with manual DOM state.

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

> **Router Mental Model:** Router matches URL to route configuration and renders route components/outlets.
