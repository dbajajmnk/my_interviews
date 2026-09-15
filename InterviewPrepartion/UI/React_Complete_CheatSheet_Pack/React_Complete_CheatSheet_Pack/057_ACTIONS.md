# Actions

## What / Why

React Actions coordinate async mutations with pending/error/optimistic workflows.

## Mental Model / Visual

```text
action={async formData => ...}
```

## Example

```jsx
// Minimal recall example for Actions
function Example() {
  return <div>Actions</div>;
}
```

## When to Use

Use framework/client action APIs for mutations.

## Common Mistake / Interview Trap

Actions are broader than ordinary event handlers.

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

> **Actions:** React Actions coordinate async mutations with pending/error/optimistic workflows.
