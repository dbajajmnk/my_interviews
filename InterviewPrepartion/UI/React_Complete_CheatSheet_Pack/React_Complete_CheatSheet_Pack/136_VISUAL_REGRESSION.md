# Visual Regression

## What / Why

Capture critical component/page visuals.

## Mental Model / Visual

```text
storybook/screenshot pipeline
```

## Example

```jsx
// Minimal recall example for Visual Regression
function Example() {
  return <div>Visual Regression</div>;
}
```

## When to Use

Use for design systems and layout regressions.

## Common Mistake / Interview Trap

Avoid noisy pixel-perfect suites without governance.

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

> **Visual Regression:** Capture critical component/page visuals.
