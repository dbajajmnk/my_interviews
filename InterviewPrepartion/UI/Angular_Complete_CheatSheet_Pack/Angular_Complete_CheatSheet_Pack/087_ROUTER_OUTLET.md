# router-outlet

## What / Why

Placeholder for activated route component.

## Mental Model

```text
<router-outlet/>
```

## Example / Recall

```ts
// Minimal recall example for: router-outlet
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in shell/layout components.

## Common Mistake / Interview Trap

Nested outlets need clear ownership.

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

> **router-outlet:** Placeholder for activated route component.
