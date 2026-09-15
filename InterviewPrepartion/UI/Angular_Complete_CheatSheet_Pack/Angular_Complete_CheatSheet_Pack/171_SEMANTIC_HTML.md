# Semantic HTML

## What / Why

Use native HTML semantics before ARIA.

## Mental Model

```text
button, label, nav
```

## Example / Recall

```ts
// Minimal recall example for: Semantic HTML
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Foundation for accessibility.

## Common Mistake / Interview Trap

Clickable div is usually worse than button.

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

> **Semantic HTML:** Use native HTML semantics before ARIA.
