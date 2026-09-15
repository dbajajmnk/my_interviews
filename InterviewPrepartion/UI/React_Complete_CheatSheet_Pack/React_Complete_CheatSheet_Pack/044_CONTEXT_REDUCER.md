# Context + Reducer

## What / Why

Combine context for distribution with reducer for state transitions.

## Mental Model / Visual

```text
Provider → state/dispatch
```

## Example

```jsx
// Minimal recall example for Context + Reducer
function Example() {
  return <div>Context + Reducer</div>;
}
```

## When to Use

Use for modest app-wide domains.

## Common Mistake / Interview Trap

Can become a global-store anti-pattern at large scale.

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

> **Context + Reducer:** Combine context for distribution with reducer for state transitions.
