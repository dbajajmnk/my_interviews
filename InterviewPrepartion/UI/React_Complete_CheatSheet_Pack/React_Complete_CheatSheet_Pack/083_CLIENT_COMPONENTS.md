# Client Components

## What / Why

Interactive components running on client within RSC frameworks.

## Mental Model / Visual

```text
'use client' boundary
```

## Example

```jsx
// Minimal recall example for Client Components
function Example() {
  return <div>Client Components</div>;
}
```

## When to Use

Use for state/effects/browser APIs.

## Common Mistake / Interview Trap

Client boundary can pull imports into client bundle.

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

> **Client Components:** Interactive components running on client within RSC frameworks.
