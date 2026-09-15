# ng test

## What / Why

Runs unit tests using current configured runner; new apps default to Vitest.

## Mental Model

```text
ng test
```

## Example / Recall

```ts
// Minimal recall example for: ng test
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use watch/CI configuration.

## Common Mistake / Interview Trap

Runner can differ in migrated legacy apps.

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

> **ng test:** Runs unit tests using current configured runner; new apps default to Vitest.
