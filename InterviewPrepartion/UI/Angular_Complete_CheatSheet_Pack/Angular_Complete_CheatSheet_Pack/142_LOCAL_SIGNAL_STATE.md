# Local Signal State

## What / Why

Use signals inside component/feature for local state.

## Mental Model

```text
signal/computed
```

## Example / Recall

```ts
// Minimal recall example for: Local Signal State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Default for UI state.

## Common Mistake / Interview Trap

Do not centralize local state prematurely.

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

> **Local Signal State:** Use signals inside component/feature for local state.
