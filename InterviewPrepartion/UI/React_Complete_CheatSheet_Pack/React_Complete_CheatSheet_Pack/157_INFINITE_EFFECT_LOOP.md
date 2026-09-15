# Infinite Effect Loop

## What / Why

Effect updates state that changes one of its own dependencies repeatedly.

## Mental Model / Visual

```text
effect → setState → dependency change → effect
```

## Example

```jsx
// Minimal recall example for Infinite Effect Loop
function Example() {
  return <div>Infinite Effect Loop</div>;
}
```

## When to Use

Remove unnecessary effect or stabilize logic.

## Common Mistake / Interview Trap

Memoizing blindly may hide root design problem.

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

> **Infinite Effect Loop:** Effect updates state that changes one of its own dependencies repeatedly.
