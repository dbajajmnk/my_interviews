# Optimistic Forms

## What / Why

Update UI immediately while mutation is pending.

## Mental Model / Visual

```text
useOptimistic
```

## Example

```jsx
// Minimal recall example for Optimistic Forms
function Example() {
  return <div>Optimistic Forms</div>;
}
```

## When to Use

Use for reversible expected success.

## Common Mistake / Interview Trap

Display failure/recovery state.

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

> **Optimistic Forms:** Update UI immediately while mutation is pending.
