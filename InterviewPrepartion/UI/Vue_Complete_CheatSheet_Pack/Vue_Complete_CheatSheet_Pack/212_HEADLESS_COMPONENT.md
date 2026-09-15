# Headless Component

## What / Why

Expose behavior/state via composable or scoped slot without enforcing styles.

## Mental Model

```text
behavior → consumer template
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Headless Component
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use design systems.

## Common Mistake / Interview Trap

Public contract must remain small.

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

> **Headless Component:** Expose behavior/state via composable or scoped slot without enforcing styles.
