# Accessibility Testing

## What / Why

Combine automated tooling with keyboard/screen-reader testing.

## Mental Model

```text
axe + manual
```

## Example / Recall

```ts
// Minimal recall example for: Accessibility Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in CI/release review.

## Common Mistake / Interview Trap

Passing automated scan does not equal full accessibility.

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

> **Accessibility Testing:** Combine automated tooling with keyboard/screen-reader testing.
