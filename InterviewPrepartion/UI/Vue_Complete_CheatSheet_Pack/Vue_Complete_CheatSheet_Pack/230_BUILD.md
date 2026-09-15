# Build

## What / Why

Vite builds optimized production assets.

## Mental Model

```text
npm run build
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use production mode.

## Common Mistake / Interview Trap

Deploy server fallback correctly for history routing.

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

> **Build:** Vite builds optimized production assets.
