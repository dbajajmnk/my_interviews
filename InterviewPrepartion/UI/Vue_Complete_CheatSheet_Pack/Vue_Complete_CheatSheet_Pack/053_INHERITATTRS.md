# inheritAttrs

## What / Why

Controls automatic fallthrough.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: inheritAttrs
</script>

<template>
  <div>inheritAttrs</div>
</template>
```

## When to Use

Use when wrapper must decide where attrs go.

## Common Mistake / Interview Trap

Forgetting to forward attrs can break accessibility.

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

> **inheritAttrs:** Controls automatic fallthrough.
