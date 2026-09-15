# Template Type Checking

## What / Why

Angular compiler checks template expressions against TypeScript types.

## Mental Model

```text
strictTemplates
```

## Example / Recall

```ts
// Minimal recall example for: Template Type Checking
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep strict template checking enabled.

## Common Mistake / Interview Trap

Using any weakens one of Angular's strongest safety features.

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

> **Template Type Checking:** Angular compiler checks template expressions against TypeScript types.
