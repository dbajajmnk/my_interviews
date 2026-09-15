# Stale Closures

## What / Why

Callbacks/effects capture values from their render.

## Mental Model / Visual

```text
closure sees snapshot
```

## Example

```jsx
// Minimal recall example for Stale Closures
function Example() {
  return <div>Stale Closures</div>;
}
```

## When to Use

Use dependencies, updater functions, refs or Effect Events appropriately.

## Common Mistake / Interview Trap

Do not assume callback sees future state.

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

> **Stale Closures:** Callbacks/effects capture values from their render.
