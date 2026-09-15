# Authorization

## What / Why

UI can conditionally expose actions, backend enforces permissions.

## Mental Model

```text
canEdit()
```

## Example / Recall

```ts
// Minimal recall example for: Authorization
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UX.

## Common Mistake / Interview Trap

Server must make final authorization decision.

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

> **Authorization:** UI can conditionally expose actions, backend enforces permissions.
