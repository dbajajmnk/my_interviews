# Production Checklist

## What / Why

Validate performance, security, accessibility, caching, error recovery and monitoring.

## Mental Model / Visual

```text
pre-release checklist
```

## Example

```jsx
// Minimal recall example for Production Checklist
function Example() {
  return <div>Production Checklist</div>;
}
```

## When to Use

Use before major releases.

## Common Mistake / Interview Trap

A green unit-test suite alone is not production readiness.

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

> **Production Checklist:** Validate performance, security, accessibility, caching, error recovery and monitoring.
