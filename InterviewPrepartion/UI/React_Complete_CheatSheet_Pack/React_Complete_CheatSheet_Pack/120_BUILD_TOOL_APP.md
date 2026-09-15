# Build-Tool App

## What / Why

Use Vite/Parcel/Rsbuild when framework is not a fit or for learning/custom setup.

## Mental Model / Visual

```text
React + Vite
```

## Example

```jsx
// Minimal recall example for Build-Tool App
function Example() {
  return <div>Build-Tool App</div>;
}
```

## When to Use

Use for client apps or unusual constraints.

## Common Mistake / Interview Trap

You own routing/data/SSR integrations yourself.

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

> **Build-Tool App:** Use Vite/Parcel/Rsbuild when framework is not a fit or for learning/custom setup.
