# Pinia SSR

## What / Why

Create Pinia/app state per request and safely hydrate.

## Mental Model

```text
request → fresh app + fresh pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia SSR
</script>

<template>
  <div>Pinia SSR</div>
</template>
```

## When to Use

Use in SSR frameworks.

## Common Mistake / Interview Trap

Never share mutable singleton store across users.

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

> **Pinia SSR:** Create Pinia/app state per request and safely hydrate.
