# KeepAlive Include Exclude

## What / Why

Cache selected dynamic components.

## Mental Model

```text
include/exclude/max
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive Include Exclude
</script>

<template>
  <div>KeepAlive Include Exclude</div>
</template>
```

## When to Use

Use for tab/route caches.

## Common Mistake / Interview Trap

Unbounded caching consumes memory.

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

> **KeepAlive Include Exclude:** Cache selected dynamic components.
