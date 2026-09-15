# Form Submission

## What / Why

Model pending/success/error and prevent accidental duplication.

## Mental Model

```text
submit → pending → result
```

## Example / Recall

```ts
// Minimal recall example for: Form Submission
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use server idempotency for high-risk operations.

## Common Mistake / Interview Trap

Disabled button alone is not transactional protection.

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

> **Form Submission:** Model pending/success/error and prevent accidental duplication.
