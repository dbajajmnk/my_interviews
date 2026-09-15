# Pure Pipes

## What / Why

Pure pipes run only when input references change.

## Mental Model

```text
value | expensivePipe
```

## Example / Recall

```ts
// Minimal recall example for: Pure Pipes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable pure template transforms.

## Common Mistake / Interview Trap

Impure pipes execute frequently and can be costly.

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

> **Pure Pipes:** Pure pipes run only when input references change.
