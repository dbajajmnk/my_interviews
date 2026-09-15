# useContext

## What / Why

Reads nearest context value.

## Mental Model / Visual

```text
const theme=useContext(ThemeContext)
```

## Example

```jsx
// Minimal recall example for useContext
function Example() {
  return <div>useContext</div>;
}
```

## When to Use

Use for stable cross-cutting data.

## Common Mistake / Interview Trap

Context updates can re-render many consumers.

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

> **useContext:** Reads nearest context value.
