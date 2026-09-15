# Deployment Cache Safety

## What / Why

Use hashed immutable assets and compatible HTML/runtime manifests.

## Mental Model / Visual

```text
app.abcd.js
```

## Example

```jsx
// Minimal recall example for Deployment Cache Safety
function Example() {
  return <div>Deployment Cache Safety</div>;
}
```

## When to Use

Use CDN caching + rollback.

## Common Mistake / Interview Trap

Stale HTML pointing to deleted chunks causes failures.

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

> **Deployment Cache Safety:** Use hashed immutable assets and compatible HTML/runtime manifests.
