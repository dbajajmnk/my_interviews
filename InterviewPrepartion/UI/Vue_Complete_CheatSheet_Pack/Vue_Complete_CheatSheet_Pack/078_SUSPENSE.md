# Suspense

## What / Why

Coordinates async dependencies/fallback UI.

## Mental Model

```text
<Suspense><AsyncPage/></Suspense>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Suspense
</script>

<template>
  <div>Suspense</div>
</template>
```

## When to Use

Use carefully for async components/setup.

## Common Mistake / Interview Trap

Vue Suspense remains an advanced feature; verify exact stability/support requirements.

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

> **Suspense:** Coordinates async dependencies/fallback UI.
