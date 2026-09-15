# useId

## What / Why

Generates unique IDs for accessibility relationships.

## Mental Model / Visual

```text
const id=useId()
```

## Example

```jsx
// Minimal recall example for useId
function Example() {
  return <div>useId</div>;
}
```

## When to Use

Use for label/input or ARIA relationships.

## Common Mistake / Interview Trap

Do not use as list keys.

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

> **useId:** Generates unique IDs for accessibility relationships.
