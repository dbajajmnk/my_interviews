# Uncontrolled Inputs

## What / Why

DOM stores current value; read via FormData/ref.

## Mental Model / Visual

```text
defaultValue / FormData
```

## Example

```jsx
// Minimal recall example for Uncontrolled Inputs
function Example() {
  return <div>Uncontrolled Inputs</div>;
}
```

## When to Use

Use for simple/native form flows.

## Common Mistake / Interview Trap

Do not mix controlled/uncontrolled for same input.

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

> **Uncontrolled Inputs:** DOM stores current value; read via FormData/ref.
