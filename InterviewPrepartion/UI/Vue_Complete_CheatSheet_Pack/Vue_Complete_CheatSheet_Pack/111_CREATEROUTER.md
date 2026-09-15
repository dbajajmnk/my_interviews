# createRouter

## What / Why

Creates router with history and routes.

## Mental Model

```text
createRouter({history,routes})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: createRouter
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in app bootstrap.

## Common Mistake / Interview Trap

Choose correct history strategy for hosting environment.

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

> **createRouter:** Creates router with history and routes.
