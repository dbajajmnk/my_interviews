# RouterLink

## What / Why

Declarative navigation in templates.

## Mental Model

```text
[routerLink]='["/users",id]'
```

## Example / Recall

```ts
// Minimal recall example for: RouterLink
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer over manual URL string assembly.

## Common Mistake / Interview Trap

Use relative navigation intentionally.

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

> **RouterLink:** Declarative navigation in templates.
