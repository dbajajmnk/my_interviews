# shallowRef Performance

## What / Why

Avoid deep proxy overhead for large immutable structures.

## Mental Model

```text
shallowRef(bigData)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowRef Performance
</script>

<template>
  <div>shallowRef Performance</div>
</template>
```

## When to Use

Use immutable replacement style.

## Common Mistake / Interview Trap

Nested mutation won't trigger render.

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

> **shallowRef Performance:** Avoid deep proxy overhead for large immutable structures.
