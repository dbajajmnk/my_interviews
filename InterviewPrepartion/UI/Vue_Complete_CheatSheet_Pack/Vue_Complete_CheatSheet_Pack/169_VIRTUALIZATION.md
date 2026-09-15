# Virtualization

## What / Why

Render visible subset of huge list/table.

## Mental Model

```text
windowed rows
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Virtualization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for thousands of DOM nodes.

## Common Mistake / Interview Trap

Vue diff optimization cannot make enormous DOM free.

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

> **Virtualization:** Render visible subset of huge list/table.
