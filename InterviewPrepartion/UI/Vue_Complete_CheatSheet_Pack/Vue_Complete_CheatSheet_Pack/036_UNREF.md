# unref

## What / Why

Returns ref.value or plain value.

## Mental Model

```text
unref(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: unref
</script>

<template>
  <div>unref</div>
</template>
```

## When to Use

Use for simple normalization.

## Common Mistake / Interview Trap

toValue also supports getters.

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

> **unref:** Returns ref.value or plain value.
