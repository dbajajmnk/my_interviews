# Trusted Types

## What / Why

Browser security policy can restrict dangerous DOM sinks.

## Mental Model

```text
TrustedHTML etc.
```

## Example / Recall

```ts
// Minimal recall example for: Trusted Types
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in hardened applications where supported.

## Common Mistake / Interview Trap

Requires compatible application/library behavior.

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

> **Trusted Types:** Browser security policy can restrict dangerous DOM sinks.
