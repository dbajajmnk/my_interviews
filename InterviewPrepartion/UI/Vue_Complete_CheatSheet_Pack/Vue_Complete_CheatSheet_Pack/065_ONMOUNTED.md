# onMounted

## What / Why

Runs after component mounts in client.

## Mental Model

```text
onMounted(()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onMounted
</script>

<template>
  <div>onMounted</div>
</template>
```

## When to Use

Use for DOM/browser/third-party initialization.

## Common Mistake / Interview Trap

Does not run during SSR.

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

> **onMounted:** Runs after component mounts in client.
