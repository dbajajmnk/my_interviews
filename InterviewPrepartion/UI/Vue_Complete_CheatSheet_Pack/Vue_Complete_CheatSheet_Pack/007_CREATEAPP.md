# createApp

## What / Why

Creates a Vue application instance and mounts the root component.

## Mental Model

```text
createApp(App).mount('#app')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: createApp
</script>

<template>
  <div>createApp</div>
</template>
```

## When to Use

Use for SPA/client application bootstrap.

## Common Mistake / Interview Trap

Create one app instance per independently mounted Vue app.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **createApp:** Creates a Vue application instance and mounts the root component.
