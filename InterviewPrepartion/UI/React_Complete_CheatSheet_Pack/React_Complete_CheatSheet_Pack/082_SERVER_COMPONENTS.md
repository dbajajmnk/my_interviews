# Server Components

## What / Why

Components rendered in server environment and shipped as serialized UI payload rather than client JS.

## Mental Model / Visual

```text
RSC → client components boundaries
```

## Example

```jsx
// Minimal recall example for Server Components
function Example() {
  return <div>Server Components</div>;
}
```

## When to Use

Use through RSC-capable frameworks.

## Common Mistake / Interview Trap

Server Components cannot use client-only Hooks/state/effects.

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

> **Server Components:** Components rendered in server environment and shipped as serialized UI payload rather than client JS.
