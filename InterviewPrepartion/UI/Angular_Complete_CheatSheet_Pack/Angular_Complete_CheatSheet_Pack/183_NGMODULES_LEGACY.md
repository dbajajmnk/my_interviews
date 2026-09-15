# NgModules Legacy

## What / Why

NgModules group declarations/imports/providers in older Angular architecture.

## Mental Model

```text
@NgModule
```

## Example / Recall

```ts
// Minimal recall example for: NgModules Legacy
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for enterprise maintenance/migration.

## Common Mistake / Interview Trap

Do not build new Angular 22 apps around NgModule-first architecture.

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

> **NgModules Legacy:** NgModules group declarations/imports/providers in older Angular architecture.
