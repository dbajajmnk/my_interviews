# Filters Removed

## What / Why

Vue 3 removed template filters from core.

## Mental Model

```text
Vue2 filters → methods/computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Filters Removed
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know migration point.

## Common Mistake / Interview Trap

Use computed/functions for formatting.

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

> **Filters Removed:** Vue 3 removed template filters from core.
