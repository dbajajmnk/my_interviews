# Vitest Default

## What / Why

New Angular CLI projects use Vitest as default unit test runner.

## Mental Model

```text
ng test → Vitest + jsdom
```

## Example / Recall

```ts
// Minimal recall example for: Vitest Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for new Angular 22 projects.

## Common Mistake / Interview Trap

Karma knowledge still matters for older apps.

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

> **Vitest Default:** New Angular CLI projects use Vitest as default unit test runner.
