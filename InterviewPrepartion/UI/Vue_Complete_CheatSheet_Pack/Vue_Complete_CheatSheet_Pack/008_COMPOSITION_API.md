# Composition API

## What / Why

Composition API organizes reusable logic by capability rather than Options sections.

## Mental Model

```text
ref/reactive/computed/watch/onMounted
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composition API
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use as the primary modern Vue 3 style.

## Common Mistake / Interview Trap

Composition API does not remove Options API; both remain supported.

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

> **Composition API:** Composition API organizes reusable logic by capability rather than Options sections.
