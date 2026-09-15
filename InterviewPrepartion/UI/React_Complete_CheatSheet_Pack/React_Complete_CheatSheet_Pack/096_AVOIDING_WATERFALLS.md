# Avoiding Waterfalls

## What / Why

Start independent work in parallel and use framework data-loading patterns.

## Mental Model / Visual

```text
Promise.all / route loaders
```

## Example

```jsx
// Minimal recall example for Avoiding Waterfalls
function Example() {
  return <div>Avoiding Waterfalls</div>;
}
```

## When to Use

Use server/framework data APIs.

## Common Mistake / Interview Trap

Nested effects that fetch sequentially often create waterfalls.

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

> **Avoiding Waterfalls:** Start independent work in parallel and use framework data-loading patterns.
