# track in @for

## What / Why

Stable tracking minimizes DOM reuse mistakes/work.

## Mental Model

```text
track item.id
```

## Example / Recall

```ts
// Minimal recall example for: track in @for
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use domain IDs.

## Common Mistake / Interview Trap

Track-by-index is wrong for many reordered lists.

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

> **track in @for:** Stable tracking minimizes DOM reuse mistakes/work.
