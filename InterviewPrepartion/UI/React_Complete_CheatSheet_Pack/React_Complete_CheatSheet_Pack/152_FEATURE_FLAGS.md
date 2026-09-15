# Feature Flags

## What / Why

Separate code deployment from feature release.

## Mental Model / Visual

```text
flag → cohort
```

## Example

```jsx
// Minimal recall example for Feature Flags
function Example() {
  return <div>Feature Flags</div>;
}
```

## When to Use

Use for progressive rollout.

## Common Mistake / Interview Trap

Remove stale flags.

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

> **Feature Flags:** Separate code deployment from feature release.
