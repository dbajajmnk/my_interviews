# SSR Context

## What / Why

Passes per-render context such as teleports/modules.

## Mental Model

```text
renderToString(app,ctx)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR Context
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in custom SSR infrastructure.

## Common Mistake / Interview Trap

Frameworks like Nuxt handle much of this.

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

> **SSR Context:** Passes per-render context such as teleports/modules.
