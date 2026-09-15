# Signal Equality

## What / Why

Signals can customize equality semantics.

## Mental Model

```text
signal(value,{equal:...})
```

## Example / Recall

```ts
// Minimal recall example for: Signal Equality
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use rarely for performance/domain equality.

## Common Mistake / Interview Trap

Incorrect equality can suppress required updates.

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

> **Signal Equality:** Signals can customize equality semantics.
