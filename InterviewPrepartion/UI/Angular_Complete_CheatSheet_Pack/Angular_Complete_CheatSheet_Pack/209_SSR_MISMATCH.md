# SSR Mismatch

## What / Why

Server and browser produce incompatible DOM/state.

## Mental Model

```text
browser API/time/random/data mismatch
```

## Example / Recall

```ts
// Minimal recall example for: SSR Mismatch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Make first render deterministic.

## Common Mistake / Interview Trap

Direct DOM mutation before hydration can break reuse.

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

> **SSR Mismatch:** Server and browser produce incompatible DOM/state.
