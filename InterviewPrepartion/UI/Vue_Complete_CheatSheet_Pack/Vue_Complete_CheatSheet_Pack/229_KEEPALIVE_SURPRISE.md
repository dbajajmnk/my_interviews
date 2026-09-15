# KeepAlive Surprise

## What / Why

Cached component does not unmount.

## Mental Model

```text
activated/deactivated lifecycle
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive Surprise
</script>

<template>
  <div>KeepAlive Surprise</div>
</template>
```

## When to Use

Pause/restart resources correctly.

## Common Mistake / Interview Trap

Do not rely on onUnmounted for cached inactivity.

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

> **KeepAlive Surprise:** Cached component does not unmount.
