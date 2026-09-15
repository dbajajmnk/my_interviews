# Lazy Hydration

## What / Why

Vue 3.5+ async components can hydrate on idle/visible/media/interaction.

## Mental Model

```text
hydrateOnVisible() etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with SSR to reduce initial hydration work.

## Common Mistake / Interview Trap

It applies to SSR hydration strategies, not ordinary CSR loading.

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

> **Lazy Hydration:** Vue 3.5+ async components can hydrate on idle/visible/media/interaction.
