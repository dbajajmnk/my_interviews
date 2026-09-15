# Interpolation

## What / Why

Displays expression values in text.

## Mental Model

```text
{{ user().name }}
```

## Example / Recall

```ts
// Minimal recall example for: Interpolation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for text binding.

## Common Mistake / Interview Trap

Expressions should stay side-effect free.

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

> **Interpolation:** Displays expression values in text.
