# React Testing Library

## What / Why

Query/access UI like users.

## Mental Model / Visual

```text
getByRole
```

## Example

```jsx
// Minimal recall example for React Testing Library
function Example() {
  return <div>React Testing Library</div>;
}
```

## When to Use

Use accessible queries first.

## Common Mistake / Interview Trap

Overusing test IDs hides accessibility problems.

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

> **React Testing Library:** Query/access UI like users.
