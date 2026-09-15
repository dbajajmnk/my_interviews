# useReducer

## What / Why

Centralizes complex local state transitions.

## Mental Model / Visual

```text
const [state,dispatch]=useReducer(reducer, initial)
```

## Example

```jsx
// Minimal recall example for useReducer
function Example() {
  return <div>useReducer</div>;
}
```

## When to Use

Use for related state with explicit actions.

## Common Mistake / Interview Trap

Reducer must remain pure.

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

> **useReducer:** Centralizes complex local state transitions.
