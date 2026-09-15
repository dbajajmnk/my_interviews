# Event Binding

## What / Why

Calls handlers for DOM/component events.

## Mental Model

```text
(click)='save()'
```

## Example / Recall

```ts
// Minimal recall example for: Event Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UI interaction.

## Common Mistake / Interview Trap

Keep handlers small; delegate business logic.

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

> **Event Binding:** Calls handlers for DOM/component events.
