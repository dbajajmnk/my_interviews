# Memoized Derived State

## What / Why

Use computed signals for reactive derivations.

## Mental Model

```text
computed(()=>...)
```

## Example / Recall

```ts
// Minimal recall example for: Memoized Derived State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use instead of recalculating expensive derived state in templates.

## Common Mistake / Interview Trap

Computed should remain pure.

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

> **Memoized Derived State:** Use computed signals for reactive derivations.
