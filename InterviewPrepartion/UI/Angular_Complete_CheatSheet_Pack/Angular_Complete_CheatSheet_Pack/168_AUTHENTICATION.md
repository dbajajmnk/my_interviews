# Authentication

## What / Why

Frontend integrates identity and session/token state.

## Mental Model

```text
IdP → client → API
```

## Example / Recall

```ts
// Minimal recall example for: Authentication
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use route UX and interceptors carefully.

## Common Mistake / Interview Trap

Never rely on frontend-only auth enforcement.

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

> **Authentication:** Frontend integrates identity and session/token state.
