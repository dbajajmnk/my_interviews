# Nuxt Mental Model

## What / Why

Nuxt is the full-stack Vue framework for routing, data, SSR/SSG, server APIs and deployment.

## Mental Model

```text
Vue + file routing + Nitro + data fetching
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Nuxt Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for production apps needing framework capabilities.

## Common Mistake / Interview Trap

Vue and Nuxt versions/features are related but not identical.

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

> **Nuxt Mental Model:** Nuxt is the full-stack Vue framework for routing, data, SSR/SSG, server APIs and deployment.
