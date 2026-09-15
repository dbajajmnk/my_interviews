# Vue SSR

## What / Why

Vue can render components to HTML on the server.

## Mental Model

```text
createSSRApp → renderToString
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue SSR
</script>

<template>
  <div>Vue SSR</div>
</template>
```

## When to Use

Use through a framework for full applications when practical.

## Common Mistake / Interview Trap

SSR adds request isolation and hydration constraints.

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

> **Vue SSR:** Vue can render components to HTML on the server.
