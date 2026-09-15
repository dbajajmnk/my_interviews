# Render and Commit

## What / Why

Render calculates UI; commit applies changes/effects.

## Mental Model / Visual

```text
Trigger → Render → Commit
```

## Example

```jsx
// Minimal recall example for Render and Commit
function Example() {
  return <div>Render and Commit</div>;
}
```

## When to Use

Use to reason about performance and effect timing.

## Common Mistake / Interview Trap

Rendering must stay pure.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Render and Commit:** Render calculates UI; commit applies changes/effects.
