# Dynamic Params

## What / Why

Path variables such as `/users/:id`.

## Mental Model

```text
route.params.id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Params
</script>

<template>
  <div>Dynamic Params</div>
</template>
```

## When to Use

Use for resource identity.

## Common Mistake / Interview Trap

Component can be reused when param changes; watch it rather than assume remount.

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

> **Dynamic Params:** Path variables such as `/users/:id`.
