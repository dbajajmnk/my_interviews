# Nested Routes

## What / Why

Child routes render inside parent view.

## Mental Model

```text
/users/:id/profile
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Nested Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for hierarchical layouts.

## Common Mistake / Interview Trap

Avoid overly deep route trees.

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

> **Nested Routes:** Child routes render inside parent view.
