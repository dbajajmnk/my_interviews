# Fetch API Pattern

## What / Why

Vue has no mandatory HTTP client; use fetch/axios/framework tools.

## Mental Model

```text
fetch → ref state
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Fetch API Pattern
</script>

<template>
  <div>Fetch API Pattern</div>
</template>
```

## When to Use

Use plain fetch for simple needs.

## Common Mistake / Interview Trap

Handle abort/error/loading explicitly.

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

> **Fetch API Pattern:** Vue has no mandatory HTTP client; use fetch/axios/framework tools.
