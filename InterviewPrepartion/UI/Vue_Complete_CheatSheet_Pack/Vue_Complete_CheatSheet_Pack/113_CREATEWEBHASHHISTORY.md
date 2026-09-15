# createWebHashHistory

## What / Why

Uses URL hash.

## Mental Model

```text
/#/users
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: createWebHashHistory
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when server rewrite control is unavailable.

## Common Mistake / Interview Trap

Less clean URLs.

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

> **createWebHashHistory:** Uses URL hash.
