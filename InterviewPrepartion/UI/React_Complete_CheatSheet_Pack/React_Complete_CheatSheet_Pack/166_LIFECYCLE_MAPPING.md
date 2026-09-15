# Lifecycle Mapping

## What / Why

mount/update/unmount thinking maps imperfectly to effects.

## Mental Model / Visual

```text
render/commit/effect model
```

## Example

```jsx
// Minimal recall example for Lifecycle Mapping
function Example() {
  return <div>Lifecycle Mapping</div>;
}
```

## When to Use

Use effect synchronization model instead.

## Common Mistake / Interview Trap

Do not mechanically translate every class lifecycle to one useEffect.

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

> **Lifecycle Mapping:** mount/update/unmount thinking maps imperfectly to effects.
