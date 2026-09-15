# Pinia Plugins

## What / Why

Extend stores with cross-cutting behavior.

## Mental Model

```text
pinia.use(plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Plugins
</script>

<template>
  <div>Pinia Plugins</div>
</template>
```

## When to Use

Use for persistence/telemetry carefully.

## Common Mistake / Interview Trap

Plugins run across stores and can create hidden behavior.

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

> **Pinia Plugins:** Extend stores with cross-cutting behavior.
