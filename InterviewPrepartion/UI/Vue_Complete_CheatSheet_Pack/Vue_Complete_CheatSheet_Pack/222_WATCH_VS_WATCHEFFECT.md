# watch vs watchEffect

## What / Why

watch has explicit sources; watchEffect auto-tracks dependencies.

## Mental Model

```text
explicit vs implicit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watch vs watchEffect
</script>

<template>
  <div>watch vs watchEffect</div>
</template>
```

## When to Use

Use based on clarity/control.

## Common Mistake / Interview Trap

Async watchEffect only tracks dependencies accessed before first await.

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

> **watch vs watchEffect:** watch has explicit sources; watchEffect auto-tracks dependencies.
