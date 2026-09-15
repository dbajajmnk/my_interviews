# You Might Not Need an Effect

## What / Why

Prefer render calculations and event handlers over synchronization effects.

## Mental Model / Visual

```text
derive in render; mutate on event
```

## Example

```jsx
// Minimal recall example for You Might Not Need an Effect
function Example() {
  return <div>You Might Not Need an Effect</div>;
}
```

## When to Use

Use effect only for external synchronization.

## Common Mistake / Interview Trap

Effect chains are a common React anti-pattern.

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

> **You Might Not Need an Effect:** Prefer render calculations and event handlers over synchronization effects.
