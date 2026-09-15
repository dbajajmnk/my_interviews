# React.memo

## What / Why

Skips component re-render when props compare equal.

## Mental Model / Visual

```text
memo(Component)
```

## Example

```jsx
// Minimal recall example for React.memo
function Example() {
  return <div>React.memo</div>;
}
```

## When to Use

Use after profiling when parent renders are expensive.

## Common Mistake / Interview Trap

Memoization is useless if props always change identity.

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

> **React.memo:** Skips component re-render when props compare equal.
