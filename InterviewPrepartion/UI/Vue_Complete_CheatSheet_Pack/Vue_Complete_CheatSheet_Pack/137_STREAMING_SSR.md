# Streaming SSR

## What / Why

Server may stream HTML progressively in framework/advanced setups.

## Mental Model

```text
server stream → browser
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Streaming SSR
</script>

<template>
  <div>Streaming SSR</div>
</template>
```

## When to Use

Use through framework infrastructure.

## Common Mistake / Interview Trap

Do not build custom SSR streaming unless needed.

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

> **Streaming SSR:** Server may stream HTML progressively in framework/advanced setups.
