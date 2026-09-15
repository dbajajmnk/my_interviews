# Router Refresh 404

## What / Why

History mode server lacks SPA fallback.

## Mental Model

```text
server rewrite
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Router Refresh 404
// Use the concrete API described above in real code.
</script>
```

## When to Use

Configure hosting.

## Common Mistake / Interview Trap

Hash history avoids server rewrite but changes URL.

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

> **Router Refresh 404:** History mode server lacks SPA fallback.
