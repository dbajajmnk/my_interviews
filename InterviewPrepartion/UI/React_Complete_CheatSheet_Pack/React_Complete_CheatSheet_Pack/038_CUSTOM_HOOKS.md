# Custom Hooks

## What / Why

Extract reusable stateful logic into functions beginning with use.

## Mental Model / Visual

```text
function useOnlineStatus(){...}
```

## Example

```jsx
// Minimal recall example for Custom Hooks
function Example() {
  return <div>Custom Hooks</div>;
}
```

## When to Use

Use to reuse logic, not component state instances.

## Common Mistake / Interview Trap

Hooks share logic; each call gets its own state.

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

> **Custom Hooks:** Extract reusable stateful logic into functions beginning with use.
