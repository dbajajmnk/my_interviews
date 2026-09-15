# Resource Preloading APIs

## What / Why

React DOM supports APIs such as preload/preinit for resource hints.

## Mental Model / Visual

```text
preload(url,{as:'style'})
```

## Example

```jsx
// Minimal recall example for Resource Preloading APIs
function Example() {
  return <div>Resource Preloading APIs</div>;
}
```

## When to Use

Use framework-supported performance integration.

## Common Mistake / Interview Trap

Prefer framework automation when available.

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

> **Resource Preloading APIs:** React DOM supports APIs such as preload/preinit for resource hints.
