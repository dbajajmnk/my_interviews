# onBeforeMount

## What / Why

Runs before initial mount.

## Mental Model

```text
onBeforeMount(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeMount
</script>

<template>
  <div>onBeforeMount</div>
</template>
```

## When to Use

Use rarely for pre-mount side effects.

## Common Mistake / Interview Trap

DOM is not mounted yet.

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

> **onBeforeMount:** Runs before initial mount.
