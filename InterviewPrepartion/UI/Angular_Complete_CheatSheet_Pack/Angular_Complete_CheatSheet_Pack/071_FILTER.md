# filter

## What / Why

Emits only matching values.

## Mental Model

```text
filter(x=>x.active)
```

## Example / Recall

```ts
// Minimal recall example for: filter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for stream filtering.

## Common Mistake / Interview Trap

Remember filter changes emissions, not source data.

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

> **filter:** Emits only matching values.
