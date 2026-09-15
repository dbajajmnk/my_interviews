# Optimistic State

## What / Why

Show expected result before server confirms.

## Mental Model / Visual

```text
useOptimistic
```

## Example

```jsx
// Minimal recall example for Optimistic State
function Example() {
  return <div>Optimistic State</div>;
}
```

## When to Use

Use when failure can be reverted/explained.

## Common Mistake / Interview Trap

Do not optimistically apply irreversible/high-risk operations without design.

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

> **Optimistic State:** Show expected result before server confirms.
