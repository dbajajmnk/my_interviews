# Transfer State

## What / Why

Avoid refetching identical server-fetched data after hydration.

## Mental Model

```text
server data → transfer → client
```

## Example / Recall

```ts
// Minimal recall example for: Transfer State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use SSR data optimization.

## Common Mistake / Interview Trap

Never serialize secrets into browser-visible transfer state.

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

> **Transfer State:** Avoid refetching identical server-fetched data after hydration.
