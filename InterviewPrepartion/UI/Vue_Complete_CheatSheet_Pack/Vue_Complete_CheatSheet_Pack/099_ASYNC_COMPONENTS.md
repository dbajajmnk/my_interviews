# Async Components

## What / Why

Lazy-load component definition.

## Mental Model

```text
defineAsyncComponent(()=>import(...))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for feature/widget code splitting.

## Common Mistake / Interview Trap

Handle loading/error/timeout when user-visible.

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

> **Async Components:** Lazy-load component definition.
