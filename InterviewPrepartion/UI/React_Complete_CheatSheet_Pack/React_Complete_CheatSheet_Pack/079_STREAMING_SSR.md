# Streaming SSR

## What / Why

Streams server HTML progressively.

## Mental Model / Visual

```text
renderToPipeableStream / framework
```

## Example

```jsx
// Minimal recall example for Streaming SSR
function Example() {
  return <div>Streaming SSR</div>;
}
```

## When to Use

Use for faster first content and Suspense-driven SSR.

## Common Mistake / Interview Trap

Prefer framework integration unless building infrastructure.

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

> **Streaming SSR:** Streams server HTML progressively.
