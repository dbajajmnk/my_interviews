# Purity

## What / Why

Components should be pure during render.

## Mental Model / Visual

```text
same inputs → same JSX
```

## Example

```jsx
// Minimal recall example for Purity
function Example() {
  return <div>Purity</div>;
}
```

## When to Use

Keep side effects in events/effects, not render.

## Common Mistake / Interview Trap

Mutating external data during render can break concurrent rendering.

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

> **Purity:** Components should be pure during render.
