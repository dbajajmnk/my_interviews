# Effect Dependencies

## What / Why

Every reactive value used by an effect belongs in its dependency model.

## Mental Model / Visual

```text
useEffect(fn,[roomId])
```

## Example

```jsx
// Minimal recall example for Effect Dependencies
function Example() {
  return <div>Effect Dependencies</div>;
}
```

## When to Use

Follow the linter.

## Common Mistake / Interview Trap

Suppressing exhaustive-deps often hides stale-closure bugs.

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

> **Effect Dependencies:** Every reactive value used by an effect belongs in its dependency model.
