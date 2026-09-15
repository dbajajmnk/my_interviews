# Secrets

## What / Why

Never ship secrets in client bundles.

## Mental Model / Visual

```text
public config != secret
```

## Example

```jsx
// Minimal recall example for Secrets
function Example() {
  return <div>Secrets</div>;
}
```

## When to Use

Use server-side secret storage.

## Common Mistake / Interview Trap

Anything sent to browser is observable.

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

> **Secrets:** Never ship secrets in client bundles.
