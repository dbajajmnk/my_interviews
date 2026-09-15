# Stale State Bug

## What / Why

Callback closes over old render values.

## Mental Model / Visual

```text
closure snapshot
```

## Example

```jsx
// Minimal recall example for Stale State Bug
function Example() {
  return <div>Stale State Bug</div>;
}
```

## When to Use

Use updater functions/dependencies/Effect Events/ref as appropriate.

## Common Mistake / Interview Trap

State setters do not mutate captured variables.

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

> **Stale State Bug:** Callback closes over old render values.
