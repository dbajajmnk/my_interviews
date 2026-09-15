# Deferred Rendering

## What / Why

Use deferred values when expensive consumer may lag.

## Mental Model / Visual

```text
useDeferredValue
```

## Example

```jsx
// Minimal recall example for Deferred Rendering
function Example() {
  return <div>Deferred Rendering</div>;
}
```

## When to Use

Use for responsive typing + heavy list/chart.

## Common Mistake / Interview Trap

Debouncing and deferring solve different problems.

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

> **Deferred Rendering:** Use deferred values when expensive consumer may lag.
