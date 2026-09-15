# State Granularity

## What / Why

Place state so updates re-render only required subtrees.

## Mental Model / Visual

```text
colocate state
```

## Example

```jsx
// Minimal recall example for State Granularity
function Example() {
  return <div>State Granularity</div>;
}
```

## When to Use

Use component boundaries strategically.

## Common Mistake / Interview Trap

Global state changes can fan out re-renders.

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

> **State Granularity:** Place state so updates re-render only required subtrees.
