# onDeactivated

## What / Why

Runs when KeepAlive component becomes inactive.

## Mental Model

```text
onDeactivated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onDeactivated
</script>

<template>
  <div>onDeactivated</div>
</template>
```

## When to Use

Pause resources when cached but hidden.

## Common Mistake / Interview Trap

Component is not destroyed.

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

> **onDeactivated:** Runs when KeepAlive component becomes inactive.
