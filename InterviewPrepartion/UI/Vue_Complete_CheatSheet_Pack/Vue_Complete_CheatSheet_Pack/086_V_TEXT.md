# v-text

## What / Why

Sets textContent.

## Mental Model

```text
v-text='msg'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-text
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely; interpolation is often clearer.

## Common Mistake / Interview Trap

Escapes content.

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

> **v-text:** Sets textContent.
