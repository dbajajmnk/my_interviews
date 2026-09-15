# watchSyncEffect

## What / Why

Runs synchronously on dependency mutation.

## Mental Model

```text
watchSyncEffect(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchSyncEffect
</script>

<template>
  <div>watchSyncEffect</div>
</template>
```

## When to Use

Use only for narrow low-cost cases.

## Common Mistake / Interview Trap

Can run many times and bypass batching benefits.

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

> **watchSyncEffect:** Runs synchronously on dependency mutation.
