# Performance Mental Model

## What / Why

Optimize bundle delivery, rendering work, data/network and DOM together.

## Mental Model

```text
network → JS → change detection → DOM → paint
```

## Example / Recall

```ts
// Minimal recall example for: Performance Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Profile before changing architecture.

## Common Mistake / Interview Trap

Angular performance is not only change detection.

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

> **Performance Mental Model:** Optimize bundle delivery, rendering work, data/network and DOM together.
