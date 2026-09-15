# Key Problems

## What / Why

Wrong keys cause state to stick to wrong item or reset unexpectedly.

## Mental Model / Visual

```text
stable id key
```

## Example

```jsx
// Minimal recall example for Key Problems
function Example() {
  return <div>Key Problems</div>;
}
```

## When to Use

Use domain identity.

## Common Mistake / Interview Trap

Index keys are risky for reordered/editable lists.

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

> **Key Problems:** Wrong keys cause state to stick to wrong item or reset unexpectedly.
