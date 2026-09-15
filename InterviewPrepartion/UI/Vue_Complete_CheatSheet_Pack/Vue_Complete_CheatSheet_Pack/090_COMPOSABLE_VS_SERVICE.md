# Composable vs Service

## What / Why

Vue composables often replace framework-service style abstractions for UI concerns.

## Mental Model

```text
useApi/useFeature
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable vs Service
</script>

<template>
  <div>Composable vs Service</div>
</template>
```

## When to Use

Use plain classes/modules when reactivity isn't needed.

## Common Mistake / Interview Trap

Do not force every utility through Vue APIs.

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

> **Composable vs Service:** Vue composables often replace framework-service style abstractions for UI concerns.
