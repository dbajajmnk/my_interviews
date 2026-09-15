# Angular CLI

## What / Why

First-party CLI for creation, generation, build, test, serve and updates.

## Mental Model

```text
ng new / ng generate / ng build
```

## Example / Recall

```ts
// Minimal recall example for: Angular CLI
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CLI defaults unless requirements justify custom tooling.

## Common Mistake / Interview Trap

CLI/core major versions should align.

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

> **Angular CLI:** First-party CLI for creation, generation, build, test, serve and updates.
