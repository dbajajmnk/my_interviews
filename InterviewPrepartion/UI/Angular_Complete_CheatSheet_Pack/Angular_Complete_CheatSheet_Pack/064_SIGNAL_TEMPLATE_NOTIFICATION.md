# Signal Template Notification

## What / Why

Updating a signal read in a template schedules the correct view update.

## Mental Model

```text
signal.set → Angular notification
```

## Example / Recall

```ts
// Minimal recall example for: Signal Template Notification
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as the primary modern reactive state mechanism.

## Common Mistake / Interview Trap

Mutating object internals without changing tracked signal semantics can be confusing.

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

> **Signal Template Notification:** Updating a signal read in a template schedules the correct view update.
