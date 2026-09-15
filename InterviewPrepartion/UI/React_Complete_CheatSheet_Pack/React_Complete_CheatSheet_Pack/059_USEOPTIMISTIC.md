# useOptimistic

## What / Why

Provides temporary optimistic state during an Action.

## Mental Model / Visual

```text
const [optimistic,setOptimistic]=useOptimistic(state)
```

## Example

```jsx
// Minimal recall example for useOptimistic
function Example() {
  return <div>useOptimistic</div>;
}
```

## When to Use

Use for responsive mutation UI.

## Common Mistake / Interview Trap

Reconcile failures and server truth explicitly.

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

> **useOptimistic:** Provides temporary optimistic state during an Action.
