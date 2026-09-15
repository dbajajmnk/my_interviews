# ComponentStore / SignalStore

## What / Why

Feature-local store patterns from ecosystem.

## Mental Model

```text
feature store
```

## Example / Recall

```ts
// Minimal recall example for: ComponentStore / SignalStore
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce global-store pressure.

## Common Mistake / Interview Trap

Know exact library version/API when implementing.

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

> **ComponentStore / SignalStore:** Feature-local store patterns from ecosystem.
