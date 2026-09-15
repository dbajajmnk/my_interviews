# Feature Service State

## What / Why

Injectable service owns feature-level signals and operations.

## Mental Model

```text
feature store service
```

## Example / Recall

```ts
// Minimal recall example for: Feature Service State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when multiple components in one feature share state.

## Common Mistake / Interview Trap

Scope provider intentionally.

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

> **Feature Service State:** Injectable service owns feature-level signals and operations.
