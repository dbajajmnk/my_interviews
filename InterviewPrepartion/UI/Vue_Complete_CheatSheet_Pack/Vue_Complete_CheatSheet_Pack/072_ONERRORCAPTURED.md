# onErrorCaptured

## What / Why

Captures descendant rendering/lifecycle errors.

## Mental Model

```text
onErrorCaptured((err)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onErrorCaptured
</script>

<template>
  <div>onErrorCaptured</div>
</template>
```

## When to Use

Use for component-tree error handling.

## Common Mistake / Interview Trap

It does not replace global monitoring.

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

> **onErrorCaptured:** Captures descendant rendering/lifecycle errors.
