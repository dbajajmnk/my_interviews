# onBeforeUpdate

## What / Why

Runs before component DOM update.

## Mental Model

```text
onBeforeUpdate(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeUpdate
</script>

<template>
  <div>onBeforeUpdate</div>
</template>
```

## When to Use

Use for specialized pre-update observations.

## Common Mistake / Interview Trap

Avoid routine business logic.

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

> **onBeforeUpdate:** Runs before component DOM update.
