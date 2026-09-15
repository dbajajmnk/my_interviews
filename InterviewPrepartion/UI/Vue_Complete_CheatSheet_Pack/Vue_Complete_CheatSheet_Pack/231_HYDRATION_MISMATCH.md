# Hydration Mismatch

## What / Why

SSR and client initial output differ.

## Mental Model

```text
random/time/browser-only data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Hydration Mismatch
</script>

<template>
  <div>Hydration Mismatch</div>
</template>
```

## When to Use

Make deterministic.

## Common Mistake / Interview Trap

Fix mismatch rather than ignoring warnings.

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

> **Hydration Mismatch:** SSR and client initial output differ.
