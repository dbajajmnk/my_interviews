# Circular Dependency

## What / Why

Features/services import each other cyclically.

## Mental Model

```text
A→B→A
```

## Example / Recall

```ts
// Minimal recall example for: Circular Dependency
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Refactor ownership/contracts.

## Common Mistake / Interview Trap

forwardRef rarely fixes architectural coupling.

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

> **Circular Dependency:** Features/services import each other cyclically.
