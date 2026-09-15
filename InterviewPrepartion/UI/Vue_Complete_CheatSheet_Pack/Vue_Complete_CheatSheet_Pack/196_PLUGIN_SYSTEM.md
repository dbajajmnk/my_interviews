# Plugin System

## What / Why

app.use(plugin) installs cross-cutting capabilities.

## Mental Model

```text
app.use(router/pinia/plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Plugin System
</script>

<template>
  <div>Plugin System</div>
</template>
```

## When to Use

Use for router/store/i18n/library infrastructure.

## Common Mistake / Interview Trap

Plugins can hide global behavior; document them.

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

> **Plugin System:** app.use(plugin) installs cross-cutting capabilities.
