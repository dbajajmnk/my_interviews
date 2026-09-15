# React Compiler Strategy

## What / Why

Let compiler optimize eligible code; profile before manual memoization.

## Mental Model / Visual

```text
Compiler + eslint rules
```

## Example

```jsx
// Minimal recall example for React Compiler Strategy
function Example() {
  return <div>React Compiler Strategy</div>;
}
```

## When to Use

Use stable compiler with incremental rollout.

## Common Mistake / Interview Trap

Do not remove all manual memoization blindly without validation.

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

> **React Compiler Strategy:** Let compiler optimize eligible code; profile before manual memoization.
