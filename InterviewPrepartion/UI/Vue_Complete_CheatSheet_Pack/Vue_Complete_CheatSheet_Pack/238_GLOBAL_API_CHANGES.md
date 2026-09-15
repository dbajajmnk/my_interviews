# Global API Changes

## What / Why

Vue 3 scopes app configuration to createApp instance.

## Mental Model

```text
Vue.createApp / app.use
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Global API Changes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use per-app plugins/config.

## Common Mistake / Interview Trap

Reduces global test pollution.

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

> **Global API Changes:** Vue 3 scopes app configuration to createApp instance.
