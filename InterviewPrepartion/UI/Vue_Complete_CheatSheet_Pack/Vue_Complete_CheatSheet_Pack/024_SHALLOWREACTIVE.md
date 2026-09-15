# shallowReactive

## What / Why

Creates a proxy reactive only at root level.

## Mental Model

```text
shallowReactive({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowReactive
</script>

<template>
  <div>shallowReactive</div>
</template>
```

## When to Use

Use for controlled performance/integration scenarios.

## Common Mistake / Interview Trap

Avoid mixing shallow and deep reactivity casually.

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

> **shallowReactive:** Creates a proxy reactive only at root level.
