# Change Detection Bug

## What / Why

UI not updating usually means state changed without notifying Angular or mutation/ownership is wrong.

## Mental Model

```text
signal/input/event/markForCheck
```

## Example / Recall

```ts
// Minimal recall example for: Change Detection Bug
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Trace notification source.

## Common Mistake / Interview Trap

Do not spam detectChanges.

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

> **Change Detection Bug:** UI not updating usually means state changed without notifying Angular or mutation/ownership is wrong.
