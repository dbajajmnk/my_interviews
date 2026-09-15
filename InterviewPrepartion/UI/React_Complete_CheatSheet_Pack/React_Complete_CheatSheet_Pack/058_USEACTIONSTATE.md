# useActionState

## What / Why

Manages result state for an Action and exposes pending status.

## Mental Model / Visual

```text
const [state,action,pending]=useActionState(fn,initial)
```

## Example

```jsx
// Minimal recall example for useActionState
function Example() {
  return <div>useActionState</div>;
}
```

## When to Use

Use for forms/mutations tied to an Action.

## Common Mistake / Interview Trap

Known validation errors can be returned as state; unknown errors should throw to boundaries.

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

> **useActionState:** Manages result state for an Action and exposes pending status.
