# useInsertionEffect

## What / Why

Runs before layout effects for CSS-in-JS style insertion.

## Mental Model / Visual

```text
useInsertionEffect(...)
```

## Example

```jsx
// Minimal recall example for useInsertionEffect
function Example() {
  return <div>useInsertionEffect</div>;
}
```

## When to Use

Mostly for library authors.

## Common Mistake / Interview Trap

Do not use for normal application effects.

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

> **useInsertionEffect:** Runs before layout effects for CSS-in-JS style insertion.
