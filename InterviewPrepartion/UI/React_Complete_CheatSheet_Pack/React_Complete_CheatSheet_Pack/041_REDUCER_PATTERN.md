# Reducer Pattern

## What / Why

Model state changes as actions and a pure reducer.

## Mental Model / Visual

```text
dispatch({type:'added',item})
```

## Example

```jsx
// Minimal recall example for Reducer Pattern
function Example() {
  return <div>Reducer Pattern</div>;
}
```

## When to Use

Use for complex interaction workflows.

## Common Mistake / Interview Trap

Action names should describe events/intent.

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

> **Reducer Pattern:** Model state changes as actions and a pure reducer.
