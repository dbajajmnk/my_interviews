# Trusted Types

## What / Why

Use CSP Trusted Types with React 19.3 support for hardened DOM sinks.

## Mental Model / Visual

```text
require-trusted-types-for 'script'
```

## Example

```jsx
// Minimal recall example for Trusted Types
function Example() {
  return <div>Trusted Types</div>;
}
```

## When to Use

Use in high-security web apps.

## Common Mistake / Interview Trap

Still requires correct policies/sanitization.

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

> **Trusted Types:** Use CSP Trusted Types with React 19.3 support for hardened DOM sinks.
