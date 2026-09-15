# Validation

## What / Why

Use native constraints plus domain/server validation.

## Mental Model / Visual

```text
required/minLength/server errors
```

## Example

```jsx
// Minimal recall example for Validation
function Example() {
  return <div>Validation</div>;
}
```

## When to Use

Use client validation for UX, server validation for trust.

## Common Mistake / Interview Trap

Client validation is not security.

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

> **Validation:** Use native constraints plus domain/server validation.
