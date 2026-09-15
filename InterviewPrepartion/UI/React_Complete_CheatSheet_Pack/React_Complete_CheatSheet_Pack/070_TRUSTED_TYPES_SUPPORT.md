# Trusted Types Support

## What / Why

React 19.3 passes Trusted Types values through to supported DOM sinks.

## Mental Model / Visual

```text
TrustedHTML / CSP trusted-types
```

## Example

```jsx
// Minimal recall example for Trusted Types Support
function Example() {
  return <div>Trusted Types Support</div>;
}
```

## When to Use

Use in hardened XSS defenses.

## Common Mistake / Interview Trap

Trusted Types do not replace sanitization or CSP design.

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

> **Trusted Types Support:** React 19.3 passes Trusted Types values through to supported DOM sinks.
