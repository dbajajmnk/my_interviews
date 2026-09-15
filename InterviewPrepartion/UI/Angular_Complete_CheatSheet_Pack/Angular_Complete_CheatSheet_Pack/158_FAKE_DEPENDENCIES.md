# Fake Dependencies

## What / Why

Use providers/useValue/spies for boundary collaborators.

## Mental Model

```text
mock API service
```

## Example / Recall

```ts
// Minimal recall example for: Fake Dependencies
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Mock external boundaries, not every internal class.

## Common Mistake / Interview Trap

Too many mocks make tests unrealistic.

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

> **Fake Dependencies:** Use providers/useValue/spies for boundary collaborators.
