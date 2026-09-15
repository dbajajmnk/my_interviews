# Feature-First Folders

## What / Why

Organize by business feature.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```ts
// Minimal recall example for: Feature-First Folders
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for scalable enterprise codebases.

## Common Mistake / Interview Trap

Avoid giant global components/services directories.

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

> **Feature-First Folders:** Organize by business feature.
