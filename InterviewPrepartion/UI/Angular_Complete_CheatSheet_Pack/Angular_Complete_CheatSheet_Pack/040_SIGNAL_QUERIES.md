# Signal Queries

## What / Why

Modern query functions expose view/content queries reactively.

## Mental Model

```text
viewChild()/contentChild()
```

## Example / Recall

```ts
// Minimal recall example for: Signal Queries
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for component/DOM integration.

## Common Mistake / Interview Trap

Queries are implementation relationships, not global state.

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

> **Signal Queries:** Modern query functions expose view/content queries reactively.
