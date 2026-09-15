# Accessibility Testing

## What / Why

Use semantic queries/automated checks/manual keyboard review.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Accessibility Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in CI and design system tests.

## Common Mistake / Interview Trap

Automated a11y tools do not catch everything.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **Accessibility Testing:** Use semantic queries/automated checks/manual keyboard review.
