# Route Guards

## What / Why

Control navigation decisions.

## Mental Model

```text
CanActivateFn etc.
```

## Example / Recall

```ts
// Minimal recall example for: Route Guards
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UX/navigation policy.

## Common Mistake / Interview Trap

Backend must enforce real authorization.

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

> **Route Guards:** Control navigation decisions.
