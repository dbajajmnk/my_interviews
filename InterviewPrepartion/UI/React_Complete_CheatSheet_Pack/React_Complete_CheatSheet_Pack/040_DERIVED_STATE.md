# Derived State

## What / Why

Compute values from props/state during render instead of storing duplicates.

## Mental Model / Visual

```text
fullName = first+' '+last
```

## Example

```jsx
// Minimal recall example for Derived State
function Example() {
  return <div>Derived State</div>;
}
```

## When to Use

Use when value is deterministically derived.

## Common Mistake / Interview Trap

Duplicated derived state causes synchronization bugs.

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

> **Derived State:** Compute values from props/state during render instead of storing duplicates.
