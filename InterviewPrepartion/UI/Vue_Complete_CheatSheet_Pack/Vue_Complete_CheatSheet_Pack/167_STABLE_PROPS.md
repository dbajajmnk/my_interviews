# Stable Props

## What / Why

Pass primitive/stable derived props to reduce child updates.

## Mental Model

```text
active boolean instead of activeId
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Stable Props
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in large lists/hot trees.

## Common Mistake / Interview Trap

Avoid recreating unnecessary object props.

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

> **Stable Props:** Pass primitive/stable derived props to reduce child updates.
