# Data Fetching

## What / Why

Prefer framework/router/server-cache patterns over effect-only fetching in large apps.

## Mental Model / Visual

```text
loader/query/RSC
```

## Example

```jsx
// Minimal recall example for Data Fetching
function Example() {
  return <div>Data Fetching</div>;
}
```

## When to Use

Use effects for imperative integrations, not default app data architecture.

## Common Mistake / Interview Trap

Effect fetches can create waterfalls and race conditions.

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

> **Data Fetching:** Prefer framework/router/server-cache patterns over effect-only fetching in large apps.
