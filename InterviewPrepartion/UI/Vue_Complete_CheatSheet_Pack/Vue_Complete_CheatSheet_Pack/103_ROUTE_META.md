# Route Meta

## What / Why

Attach metadata to routes.

## Mental Model

```text
meta:{requiresAuth:true}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Route Meta
</script>

<template>
  <div>Route Meta</div>
</template>
```

## When to Use

Use for layout/auth/breadcrumb policy.

## Common Mistake / Interview Trap

Keep domain state out of meta.

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

> **Route Meta:** Attach metadata to routes.
