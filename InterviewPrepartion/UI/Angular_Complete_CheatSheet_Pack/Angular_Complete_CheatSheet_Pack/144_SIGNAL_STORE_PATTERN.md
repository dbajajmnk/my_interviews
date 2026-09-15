# Signal Store Pattern

## What / Why

Model state, computed selectors and actions around signals.

## Mental Model

```text
state + computed + methods
```

## Example / Recall

```ts
// Minimal recall example for: Signal Store Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for structured feature/application state.

## Common Mistake / Interview Trap

Library choice should follow actual complexity.

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

> **Signal Store Pattern:** Model state, computed selectors and actions around signals.
