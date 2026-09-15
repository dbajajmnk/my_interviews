# Live Regions

## What / Why

Announce dynamic status to screen readers.

## Mental Model

```text
aria-live
```

## Example / Recall

```ts
// Minimal recall example for: Live Regions
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for async validation/status updates.

## Common Mistake / Interview Trap

Avoid noisy repeated announcements.

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

> **Live Regions:** Announce dynamic status to screen readers.
