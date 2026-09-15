# Reducer Types

## What / Why

Type state/actions with unions.

## Mental Model / Visual

```text
type Action={type:'added';item:Item}|...
```

## Example

```jsx
// Minimal recall example for Reducer Types
function Example() {
  return <div>Reducer Types</div>;
}
```

## When to Use

Use exhaustiveness checking.

## Common Mistake / Interview Trap

Avoid stringly typed unvalidated actions.

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

> **Reducer Types:** Type state/actions with unions.
