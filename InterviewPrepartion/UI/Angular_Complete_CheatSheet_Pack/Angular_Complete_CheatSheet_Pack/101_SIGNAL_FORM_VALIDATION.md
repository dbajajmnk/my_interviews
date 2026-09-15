# Signal Form Validation

## What / Why

Defines validation in schema functions.

## Mental Model

```text
required(path.email), email(path.email)
```

## Example / Recall

```ts
// Minimal recall example for: Signal Form Validation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use centralized typed validation.

## Common Mistake / Interview Trap

Server-side validation still required.

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

> **Signal Form Validation:** Defines validation in schema functions.
