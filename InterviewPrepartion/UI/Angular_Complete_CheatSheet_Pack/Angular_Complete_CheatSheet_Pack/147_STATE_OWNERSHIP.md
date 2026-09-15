# State Ownership

## What / Why

Every state value should have one clear owner/source of truth.

## Mental Model

```text
URL / server / component / store
```

## Example / Recall

```ts
// Minimal recall example for: State Ownership
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use before choosing tools.

## Common Mistake / Interview Trap

Duplicated state causes sync bugs.

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

> **State Ownership:** Every state value should have one clear owner/source of truth.
