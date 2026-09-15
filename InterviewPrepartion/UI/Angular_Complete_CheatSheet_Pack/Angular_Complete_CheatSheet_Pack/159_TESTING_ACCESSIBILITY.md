# Testing Accessibility

## What / Why

Use semantic DOM assertions and automated a11y tools.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```ts
// Minimal recall example for: Testing Accessibility
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use alongside manual keyboard/screen reader checks.

## Common Mistake / Interview Trap

Automation does not cover all WCAG issues.

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

> **Testing Accessibility:** Use semantic DOM assertions and automated a11y tools.
