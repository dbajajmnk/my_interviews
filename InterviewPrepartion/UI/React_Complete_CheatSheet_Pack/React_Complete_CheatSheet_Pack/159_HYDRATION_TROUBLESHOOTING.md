# Hydration Troubleshooting

## What / Why

Compare server/client output and browser-only data sources.

## Mental Model / Visual

```text
time/random/window/localStorage
```

## Example

```jsx
// Minimal recall example for Hydration Troubleshooting
function Example() {
  return <div>Hydration Troubleshooting</div>;
}
```

## When to Use

Use deterministic server render or browser() boundary.

## Common Mistake / Interview Trap

Suppress warning only for intentional mismatch.

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

> **Hydration Troubleshooting:** Compare server/client output and browser-only data sources.
