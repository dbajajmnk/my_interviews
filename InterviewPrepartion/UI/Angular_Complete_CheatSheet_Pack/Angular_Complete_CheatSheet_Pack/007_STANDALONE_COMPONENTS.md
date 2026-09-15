# Standalone Components

## What / Why

Modern Angular components are standalone by default.

## Mental Model

```text
Component imports its dependencies directly
```

## Example / Recall

```ts
// Minimal recall example for: Standalone Components
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as the default architecture for Angular 22 applications.

## Common Mistake / Interview Trap

Do not add `standalone: true` in modern Angular unless maintaining older style expectations.

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

> **Standalone Components:** Modern Angular components are standalone by default.
