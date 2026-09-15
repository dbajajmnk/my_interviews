# Observability

## What / Why

Correlate route, component errors, API calls and backend traces.

## Mental Model / Visual

```text
browser traceId → API
```

## Example

```jsx
// Minimal recall example for Observability
function Example() {
  return <div>Observability</div>;
}
```

## When to Use

Use modern telemetry/OpenTelemetry integration.

## Common Mistake / Interview Trap

Do not log sensitive inputs.

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

> **Observability:** Correlate route, component errors, API calls and backend traces.
