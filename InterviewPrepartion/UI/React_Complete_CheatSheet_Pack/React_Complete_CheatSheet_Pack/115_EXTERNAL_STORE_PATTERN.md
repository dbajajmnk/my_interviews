# External Store Pattern

## What / Why

Integrate Redux/Zustand/other stores through supported subscription mechanisms.

## Mental Model / Visual

```text
useSyncExternalStore under library
```

## Example

```jsx
// Minimal recall example for External Store Pattern
function Example() {
  return <div>External Store Pattern</div>;
}
```

## When to Use

Use for large/shared client-state domains.

## Common Mistake / Interview Trap

Do not put server cache data in global client store by default.

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

> **External Store Pattern:** Integrate Redux/Zustand/other stores through supported subscription mechanisms.
