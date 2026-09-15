# useCallback

## What / Why

Caches a function identity.

## Mental Model / Visual

```text
const fn=useCallback(()=>save(id),[id])
```

## Example

```jsx
// Minimal recall example for useCallback
function Example() {
  return <div>useCallback</div>;
}
```

## When to Use

Use when function identity matters for optimized children/dependencies.

## Common Mistake / Interview Trap

Do not wrap every function by habit.

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

> **useCallback:** Caches a function identity.
