# Simple Shared Reactive Store

## What / Why

A module-level reactive object can be a small SPA store.

## Mental Model

```text
export const store=reactive(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Simple Shared Reactive Store
</script>

<template>
  <div>Simple Shared Reactive Store</div>
</template>
```

## When to Use

Use only for simple client-only applications.

## Common Mistake / Interview Trap

SSR singleton state can leak between requests.

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

> **Simple Shared Reactive Store:** A module-level reactive object can be a small SPA store.
