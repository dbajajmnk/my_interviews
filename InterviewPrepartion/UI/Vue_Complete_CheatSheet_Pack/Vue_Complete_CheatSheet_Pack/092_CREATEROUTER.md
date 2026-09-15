# createRouter

## What / Why

Creates router instance.

## Mental Model

```text
createRouter({history,routes})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: createRouter
</script>

<template>
  <div>createRouter</div>
</template>
```

## When to Use

Use one router per app.

## Common Mistake / Interview Trap

Router must be installed with app.use(router).

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

> **createRouter:** Creates router instance.
