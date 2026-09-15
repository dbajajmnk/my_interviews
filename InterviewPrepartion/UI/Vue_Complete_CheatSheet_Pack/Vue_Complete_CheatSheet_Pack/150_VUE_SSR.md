# Vue SSR

## What / Why

Server renders Vue app to HTML, then client hydrates.

## Mental Model

```text
request → renderToString → HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for SEO/first-load needs.

## Common Mistake / Interview Trap

State must be request-scoped.

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

> **Vue SSR:** Server renders Vue app to HTML, then client hydrates.
