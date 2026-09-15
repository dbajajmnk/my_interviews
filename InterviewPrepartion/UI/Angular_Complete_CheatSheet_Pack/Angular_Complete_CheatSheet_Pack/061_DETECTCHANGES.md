# detectChanges

## What / Why

Runs change detection for a view subtree immediately.

## Mental Model

```text
cdr.detectChanges()
```

## Example / Recall

```ts
// Minimal recall example for: detectChanges
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use sparingly in advanced integration/testing.

## Common Mistake / Interview Trap

Frequent manual detectChanges usually signals design issues.

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

> **detectChanges:** Runs change detection for a view subtree immediately.
