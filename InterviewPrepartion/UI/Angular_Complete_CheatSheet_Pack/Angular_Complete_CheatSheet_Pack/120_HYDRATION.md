# Hydration

## What / Why

Reuses server-rendered DOM instead of recreating it.

## Mental Model

```text
SSR DOM → client hydration
```

## Example / Recall

```ts
// Minimal recall example for: Hydration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use with Angular SSR.

## Common Mistake / Interview Trap

DOM-manipulating libraries need hydration compatibility.

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

> **Hydration:** Reuses server-rendered DOM instead of recreating it.
