# Secrets

## What / Why

Anything shipped to browser can be inspected.

## Mental Model

```text
environment config ≠ secret
```

## Example / Recall

```ts
// Minimal recall example for: Secrets
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep real secrets on server/secret manager.

## Common Mistake / Interview Trap

Angular environment files are not secret storage.

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

> **Secrets:** Anything shipped to browser can be inspected.
