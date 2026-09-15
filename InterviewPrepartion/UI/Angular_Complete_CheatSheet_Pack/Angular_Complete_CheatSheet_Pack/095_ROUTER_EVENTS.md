# Router Events

## What / Why

Observe navigation lifecycle.

## Mental Model

```text
NavigationStart/End/Error
```

## Example / Recall

```ts
// Minimal recall example for: Router Events
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for telemetry/loading integration.

## Common Mistake / Interview Trap

Do not duplicate router internal state.

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

> **Router Events:** Observe navigation lifecycle.
