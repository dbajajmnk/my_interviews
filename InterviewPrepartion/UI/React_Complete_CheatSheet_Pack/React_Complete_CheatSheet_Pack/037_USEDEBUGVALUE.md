# useDebugValue

## What / Why

Adds labels for custom hooks in React DevTools.

## Mental Model / Visual

```text
useDebugValue(status)
```

## Example

```jsx
// Minimal recall example for useDebugValue
function Example() {
  return <div>useDebugValue</div>;
}
```

## When to Use

Use in reusable custom hooks when useful.

## Common Mistake / Interview Trap

Mostly a debugging/library feature.

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

> **useDebugValue:** Adds labels for custom hooks in React DevTools.
