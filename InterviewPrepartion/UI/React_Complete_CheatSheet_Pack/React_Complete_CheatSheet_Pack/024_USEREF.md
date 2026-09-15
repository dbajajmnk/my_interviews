# useRef

## What / Why

Stores mutable value without causing re-render and can reference DOM.

## Mental Model / Visual

```text
const inputRef=useRef(null)
```

## Example

```jsx
// Minimal recall example for useRef
function Example() {
  return <div>useRef</div>;
}
```

## When to Use

Use for DOM handles or mutable instance data.

## Common Mistake / Interview Trap

Changing ref.current does not trigger render.

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

> **useRef:** Stores mutable value without causing re-render and can reference DOM.
