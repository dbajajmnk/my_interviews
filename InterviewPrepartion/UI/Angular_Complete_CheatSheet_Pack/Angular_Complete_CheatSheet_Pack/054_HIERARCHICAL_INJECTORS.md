# Hierarchical Injectors

## What / Why

Child injectors can override providers.

## Mental Model

```text
root → route/component subtree
```

## Example / Recall

```ts
// Minimal recall example for: Hierarchical Injectors
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for scoped feature instances.

## Common Mistake / Interview Trap

Know provider scope when debugging duplicate state.

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

> **Hierarchical Injectors:** Child injectors can override providers.
