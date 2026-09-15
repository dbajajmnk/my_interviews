# Secrets

## What / Why

Anything shipped to browser is inspectable.

## Mental Model

```text
VITE_* config ≠ secret
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Secrets
</script>

<template>
  <div>Secrets</div>
</template>
```

## When to Use

Keep secrets server-side.

## Common Mistake / Interview Trap

Vite environment variables embedded client-side are public.

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

> **Secrets:** Anything shipped to browser is inspectable.
