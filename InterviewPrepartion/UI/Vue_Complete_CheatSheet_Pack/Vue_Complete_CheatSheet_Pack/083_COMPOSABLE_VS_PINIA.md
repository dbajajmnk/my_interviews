# Composable vs Pinia

## What / Why

Composables can share logic/state; Pinia adds formal store identity, devtools, plugins, SSR patterns.

## Mental Model

```text
useX vs defineStore
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable vs Pinia
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use Pinia for app-scale shared state.

## Common Mistake / Interview Trap

Do not add a store for every tiny local concern.

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

> **Composable vs Pinia:** Composables can share logic/state; Pinia adds formal store identity, devtools, plugins, SSR patterns.
