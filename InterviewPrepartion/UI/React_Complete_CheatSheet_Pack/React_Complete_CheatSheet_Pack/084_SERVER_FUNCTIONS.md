# Server Functions

## What / Why

Server-executed functions callable through framework-integrated React architecture.

## Mental Model / Visual

```text
'use server'
```

## Example

```jsx
// Minimal recall example for Server Functions
function Example() {
  return <div>Server Functions</div>;
}
```

## When to Use

Use via framework security/data mutation patterns.

## Common Mistake / Interview Trap

Treat as network endpoints: authorize, validate, protect secrets.

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

> **Server Functions:** Server-executed functions callable through framework-integrated React architecture.
