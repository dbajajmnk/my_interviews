# KeepAlive

## What / Why

Caches dynamic component instances instead of destroying them.

## Mental Model

```text
<KeepAlive><component :is='view'/></KeepAlive>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive
</script>

<template>
  <div>KeepAlive</div>
</template>
```

## When to Use

Use for expensive tab/page state preservation.

## Common Mistake / Interview Trap

Cached components still consume memory/resources.

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

> **KeepAlive:** Caches dynamic component instances instead of destroying them.
