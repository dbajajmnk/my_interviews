# Vue 2 vs Vue 3

## What / Why

Vue 3 uses createApp, Proxy-based reactivity, Composition API, improved TS/tree-shaking/fragments/teleport etc.

## Mental Model

```text
Vue2 → Vue3
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue 2 vs Vue 3
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know migration differences for enterprise interviews.

## Common Mistake / Interview Trap

Do not use Vue 2 patterns as default for new code.

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

> **Vue 2 vs Vue 3:** Vue 3 uses createApp, Proxy-based reactivity, Composition API, improved TS/tree-shaking/fragments/teleport etc.
