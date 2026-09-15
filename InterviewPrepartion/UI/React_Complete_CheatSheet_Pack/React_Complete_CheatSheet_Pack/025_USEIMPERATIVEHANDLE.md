# useImperativeHandle

## What / Why

Customizes the handle exposed through a ref.

## Mental Model / Visual

```text
useImperativeHandle(ref,()=>({focus(){...}}))
```

## Example

```jsx
// Minimal recall example for useImperativeHandle
function Example() {
  return <div>useImperativeHandle</div>;
}
```

## When to Use

Use sparingly for imperative component APIs.

## Common Mistake / Interview Trap

Prefer declarative props when possible.

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

> **useImperativeHandle:** Customizes the handle exposed through a ref.
