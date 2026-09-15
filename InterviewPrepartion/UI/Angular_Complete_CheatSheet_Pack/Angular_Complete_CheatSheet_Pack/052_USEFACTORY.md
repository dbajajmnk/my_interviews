# useFactory

## What / Why

Creates dependency from other dependencies.

## Mental Model

```text
useFactory:(cfg)=>new Client(cfg.url)
```

## Example / Recall

```ts
// Minimal recall example for: useFactory
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for dynamic configuration.

## Common Mistake / Interview Trap

Factory logic should remain deterministic and testable.

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

> **useFactory:** Creates dependency from other dependencies.
