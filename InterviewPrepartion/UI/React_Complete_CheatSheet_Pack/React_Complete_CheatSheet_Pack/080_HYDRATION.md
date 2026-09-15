# Hydration

## What / Why

Attaches React behavior to server-rendered HTML.

## Mental Model / Visual

```text
hydrateRoot(container,<App/>)
```

## Example

```jsx
// Minimal recall example for Hydration
function Example() {
  return <div>Hydration</div>;
}
```

## When to Use

Use for SSR apps.

## Common Mistake / Interview Trap

Server/client initial output must match.

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

> **Hydration:** Attaches React behavior to server-rendered HTML.
