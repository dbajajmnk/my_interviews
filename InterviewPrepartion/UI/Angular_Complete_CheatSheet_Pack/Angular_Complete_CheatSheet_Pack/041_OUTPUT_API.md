# Output API

## What / Why

output() defines typed event outputs.

## Mental Model

```text
saved = output<Order>()
```

## Example / Recall

```ts
// Minimal recall example for: Output API
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for child-to-parent event contracts.

## Common Mistake / Interview Trap

Outputs communicate events, not shared mutable state.

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

> **Output API:** output() defines typed event outputs.
