# $patch

## What / Why

Applies multiple state changes.

## Mental Model

```text
store.$patch({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: $patch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for grouped updates/devtools clarity.

## Common Mistake / Interview Trap

Actions are often clearer for domain intent.

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

> **$patch:** Applies multiple state changes.
