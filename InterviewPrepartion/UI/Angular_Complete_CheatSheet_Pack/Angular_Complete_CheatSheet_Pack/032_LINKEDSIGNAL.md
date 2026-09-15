# linkedSignal

## What / Why

Creates writable state that derives/reset/reconciles from other reactive state.

## Mental Model

```text
selected = linkedSignal(()=>options()[0])
```

## Example / Recall

```ts
// Minimal recall example for: linkedSignal
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when writable state depends on changing source state.

## Common Mistake / Interview Trap

Prefer computed if callers never need to write it.

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

> **linkedSignal:** Creates writable state that derives/reset/reconciles from other reactive state.
