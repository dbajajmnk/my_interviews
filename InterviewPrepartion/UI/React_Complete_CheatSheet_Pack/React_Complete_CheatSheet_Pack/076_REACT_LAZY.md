# React.lazy

## What / Why

Code-splits a component loaded dynamically.

## Mental Model / Visual

```text
const Page=lazy(()=>import('./Page'))
```

## Example

```jsx
// Minimal recall example for React.lazy
function Example() {
  return <div>React.lazy</div>;
}
```

## When to Use

Use with Suspense for route/feature splitting.

## Common Mistake / Interview Trap

Lazy declaration should be stable, usually module scope.

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

> **React.lazy:** Code-splits a component loaded dynamically.
