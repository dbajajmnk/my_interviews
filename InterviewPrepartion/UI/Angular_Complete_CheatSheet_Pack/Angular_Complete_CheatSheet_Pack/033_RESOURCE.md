# resource

## What / Why

Reactive async read API driven by signals.

## Mental Model

```text
resource({params:..., loader:...})
```

## Example / Recall

```ts
// Minimal recall example for: resource
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for signal-driven read operations.

## Common Mistake / Interview Trap

Do not use resource loaders for mutations.

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

> **resource:** Reactive async read API driven by signals.
