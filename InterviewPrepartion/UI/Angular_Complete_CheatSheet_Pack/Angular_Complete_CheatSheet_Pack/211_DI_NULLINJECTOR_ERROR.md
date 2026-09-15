# DI NullInjector Error

## What / Why

Requested token has no visible provider in current injector hierarchy.

## Mental Model

```text
token → provider scope
```

## Example / Recall

```ts
// Minimal recall example for: DI NullInjector Error
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Check provider registration and dynamic scopes.

## Common Mistake / Interview Trap

Adding provider randomly can create duplicate instances.

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

> **DI NullInjector Error:** Requested token has no visible provider in current injector hierarchy.
