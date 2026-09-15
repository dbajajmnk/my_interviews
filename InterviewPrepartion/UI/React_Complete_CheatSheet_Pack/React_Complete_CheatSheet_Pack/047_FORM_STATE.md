# Form State

## What / Why

Model input values, validation and submit status explicitly.

## Mental Model / Visual

```text
value/errors/pending
```

## Example

```jsx
// Minimal recall example for Form State
function Example() {
  return <div>Form State</div>;
}
```

## When to Use

Use native forms/framework actions where appropriate.

## Common Mistake / Interview Trap

Avoid one effect per field.

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

> **Form State:** Model input values, validation and submit status explicitly.
