# onUnmounted

## What / Why

Runs after component unmount.

## Mental Model

```text
onUnmounted(cleanup)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onUnmounted
</script>

<template>
  <div>onUnmounted</div>
</template>
```

## When to Use

Use to clean external subscriptions/listeners/timers.

## Common Mistake / Interview Trap

Vue cleans its own reactive effects, not every external resource.

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

> **onUnmounted:** Runs after component unmount.
