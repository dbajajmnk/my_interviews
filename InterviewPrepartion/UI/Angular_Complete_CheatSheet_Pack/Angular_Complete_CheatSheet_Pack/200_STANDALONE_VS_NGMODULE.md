# Standalone vs NgModule

## What / Why

Standalone is default modern Angular; NgModules are legacy/compatibility architecture.

## Mental Model

```text
component imports directly vs module declarations
```

## Example / Recall

```ts
// Minimal recall example for: Standalone vs NgModule
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know both for enterprise interviews.

## Common Mistake / Interview Trap

Do not say NgModules were removed.

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

> **Standalone vs NgModule:** Standalone is default modern Angular; NgModules are legacy/compatibility architecture.
