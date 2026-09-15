# BehaviorSubject

## What / Why

Subject with current value for new subscribers.

## Mental Model

```text
new BehaviorSubject(initial)
```

## Example / Recall

```ts
// Minimal recall example for: BehaviorSubject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy state stores.

## Common Mistake / Interview Trap

Signals are often simpler for current synchronous UI state.

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

> **BehaviorSubject:** Subject with current value for new subscribers.
