# Query Libraries

## What / Why

Tools such as TanStack Query for Vue manage server-state cache/revalidation.

## Mental Model

```text
query key → cache → request
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Query Libraries
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for sophisticated client server-state.

## Common Mistake / Interview Trap

Do not duplicate cache in Pinia without reason.

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

> **Query Libraries:** Tools such as TanStack Query for Vue manage server-state cache/revalidation.
