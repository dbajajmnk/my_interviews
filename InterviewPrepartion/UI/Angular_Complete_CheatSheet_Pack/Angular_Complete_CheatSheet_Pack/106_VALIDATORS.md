# Validators

## What / Why

Synchronous/async validation functions.

## Mental Model

```text
Validators.required / custom
```

## Example / Recall

```ts
// Minimal recall example for: Validators
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use reusable domain validation.

## Common Mistake / Interview Trap

Do not trust client validation for security.

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

> **Validators:** Synchronous/async validation functions.
