# Mocking Strategy

## What / Why

Mock unstable external boundaries, not everything.

## Mental Model / Visual

```text
API boundary/mock server
```

## Example

```jsx
// Minimal recall example for Mocking Strategy
function Example() {
  return <div>Mocking Strategy</div>;
}
```

## When to Use

Use realistic integration where practical.

## Common Mistake / Interview Trap

Excessive mocks make tests lie.

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

> **Mocking Strategy:** Mock unstable external boundaries, not everything.
