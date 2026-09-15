# useDeferredValue

## What / Why

Lets non-critical UI lag behind urgent updates.

## Mental Model / Visual

```text
const deferred=useDeferredValue(query)
```

## Example

```jsx
// Minimal recall example for useDeferredValue
function Example() {
  return <div>useDeferredValue</div>;
}
```

## When to Use

Use for expensive dependent rendering.

## Common Mistake / Interview Trap

It defers rendering, not the network request by itself.

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

> **useDeferredValue:** Lets non-critical UI lag behind urgent updates.
