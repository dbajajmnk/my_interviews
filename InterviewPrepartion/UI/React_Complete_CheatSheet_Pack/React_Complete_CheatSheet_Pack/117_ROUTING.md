# Routing

## What / Why

React core does not prescribe routing; use a framework/router.

## Mental Model / Visual

```text
route tree → UI/data
```

## Example

```jsx
// Minimal recall example for Routing
function Example() {
  return <div>Routing</div>;
}
```

## When to Use

Use React Router/framework routing.

## Common Mistake / Interview Trap

Do not hand-roll complex production routing unnecessarily.

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

> **Routing:** React core does not prescribe routing; use a framework/router.
