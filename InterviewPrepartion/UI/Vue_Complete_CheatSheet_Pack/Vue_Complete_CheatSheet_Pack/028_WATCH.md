# watch

## What / Why

Runs callback when explicit reactive source changes.

## Mental Model

```text
watch(id, async newId => ...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watch
</script>

<template>
  <div>watch</div>
</template>
```

## When to Use

Use for side effects tied to specific source.

## Common Mistake / Interview Trap

Do not use watch for values that should be computed.

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

> **watch:** Runs callback when explicit reactive source changes.
