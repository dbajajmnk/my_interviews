# Refs as Escape Hatch

## What / Why

Refs access DOM or mutable external instances.

## Mental Model / Visual

```text
ref.current.focus()
```

## Example

```jsx
// Minimal recall example for Refs as Escape Hatch
function Example() {
  return <div>Refs as Escape Hatch</div>;
}
```

## When to Use

Use when imperative integration is necessary.

## Common Mistake / Interview Trap

Do not use refs to bypass normal state flow.

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

> **Refs as Escape Hatch:** Refs access DOM or mutable external instances.
