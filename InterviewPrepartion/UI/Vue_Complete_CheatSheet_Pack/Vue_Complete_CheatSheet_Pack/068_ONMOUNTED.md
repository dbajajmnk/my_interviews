# onMounted

## What / Why

Runs after component DOM is mounted.

## Mental Model

```text
mount → onMounted
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onMounted
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM APIs/third-party widgets.

## Common Mistake / Interview Trap

Not called during server-side rendering.

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

> **onMounted:** Runs after component DOM is mounted.
