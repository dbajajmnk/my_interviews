# Focus Management

## What / Why

Move/restore focus for dialogs, route changes and dynamic content.

## Mental Model

```text
focus trap/restore
```

## Example / Recall

```ts
// Minimal recall example for: Focus Management
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CDK/Aria primitives where appropriate.

## Common Mistake / Interview Trap

Do not unexpectedly steal focus.

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

> **Focus Management:** Move/restore focus for dialogs, route changes and dynamic content.
