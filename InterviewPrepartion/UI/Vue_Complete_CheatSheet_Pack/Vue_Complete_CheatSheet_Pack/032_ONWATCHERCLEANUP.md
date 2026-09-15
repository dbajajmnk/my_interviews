# onWatcherCleanup

## What / Why

Registers cleanup for a watcher before re-run/stop.

## Mental Model

```text
onWatcherCleanup(()=>controller.abort())
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onWatcherCleanup
</script>

<template>
  <div>onWatcherCleanup</div>
</template>
```

## When to Use

Use for aborting stale requests/resources in Vue 3.5+.

## Common Mistake / Interview Trap

Must be called synchronously during watcher callback/effect execution.

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

> **onWatcherCleanup:** Registers cleanup for a watcher before re-run/stop.
