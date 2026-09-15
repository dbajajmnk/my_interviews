# cache

## What / Why

Caches work in Server Components for a cache lifetime.

## Mental Model / Visual

```text
const cached=cache(fetcher)
```

## Example

```jsx
// Minimal recall example for cache
function Example() {
  return <div>cache</div>;
}
```

## When to Use

Use inside RSC architecture.

## Common Mistake / Interview Trap

This is not a general client cache.

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

> **cache:** Caches work in Server Components for a cache lifetime.
