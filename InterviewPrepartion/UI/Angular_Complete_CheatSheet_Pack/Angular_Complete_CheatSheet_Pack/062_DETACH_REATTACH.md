# detach / reattach

## What / Why

Removes/adds a view from normal change-detection traversal.

## Mental Model

```text
cdr.detach(); ...; cdr.reattach()
```

## Example / Recall

```ts
// Minimal recall example for: detach / reattach
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for specialized high-performance scenarios.

## Common Mistake / Interview Trap

Detached views require careful manual updates.

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

> **detach / reattach:** Removes/adds a view from normal change-detection traversal.
