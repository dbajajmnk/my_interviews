# untracked

## What / Why

Reads a signal without creating a reactive dependency.

## Mental Model

```text
untracked(counter)
```

## Example / Recall

```ts
// Minimal recall example for: untracked
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when incidental read should not re-run computation/effect.

## Common Mistake / Interview Trap

Do not use to hide a dependency bug.

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

> **untracked:** Reads a signal without creating a reactive dependency.
