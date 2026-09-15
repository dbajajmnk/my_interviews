# Vue vs Nuxt Decision

## What / Why

Use plain Vue for custom SPA/library control; Nuxt for full-stack routing/data/SSR conventions.

## Mental Model

```text
Vue stack vs Nuxt framework
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue vs Nuxt Decision
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose from product requirements.

## Common Mistake / Interview Trap

Framework adoption adds conventions and server runtime responsibilities.

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

> **Vue vs Nuxt Decision:** Use plain Vue for custom SPA/library control; Nuxt for full-stack routing/data/SSR conventions.
