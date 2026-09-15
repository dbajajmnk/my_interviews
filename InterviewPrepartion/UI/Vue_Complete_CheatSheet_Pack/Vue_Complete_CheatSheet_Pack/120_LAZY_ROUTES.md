# Lazy Routes

## What / Why

Dynamic import route components.

## Mental Model

```text
component:()=>import('./User.vue')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to split route code.

## Common Mistake / Interview Trap

Chunk strategy matters for many tiny routes.

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

> **Lazy Routes:** Dynamic import route components.
