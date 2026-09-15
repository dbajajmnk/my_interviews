# Resource Status

## What / Why

Resources expose value/loading/error/status style reactive state.

## Mental Model

```text
resource.value()/isLoading/error
```

## Example / Recall

```ts
// Minimal recall example for: Resource Status
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to model async UX declaratively.

## Common Mistake / Interview Trap

Always render loading/error/empty states.

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

> **Resource Status:** Resources expose value/loading/error/status style reactive state.
