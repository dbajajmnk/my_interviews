# Hydration

## What / Why

Client attaches Vue behavior to server-rendered HTML.

## Mental Model

```text
SSR HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Hydration
</script>

<template>
  <div>Hydration</div>
</template>
```

## When to Use

Use deterministic initial output.

## Common Mistake / Interview Trap

Server/client mismatches cause hydration warnings/repair.

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

> **Hydration:** Client attaches Vue behavior to server-rendered HTML.
