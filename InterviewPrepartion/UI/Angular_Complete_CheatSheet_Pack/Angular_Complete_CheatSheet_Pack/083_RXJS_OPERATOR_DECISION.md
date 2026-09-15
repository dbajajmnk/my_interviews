# RxJS Operator Decision

## What / Why

Choose flattening operator based on cancellation/order/concurrency semantics.

## Mental Model

```text
switch/merge/concat/exhaust
```

## Example / Recall

```ts
// Minimal recall example for: RxJS Operator Decision
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Memorize by business semantics.

## Common Mistake / Interview Trap

Selecting operator by habit creates race conditions.

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

> **RxJS Operator Decision:** Choose flattening operator based on cancellation/order/concurrency semantics.
