# API Adapter

## What / Why

Map backend DTO/protocol into UI/domain models.

## Mental Model

```text
API → adapter → feature
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: API Adapter
</script>

<template>
  <div>API Adapter</div>
</template>
```

## When to Use

Use when contracts differ.

## Common Mistake / Interview Trap

Do not spread raw DTOs everywhere.

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

> **API Adapter:** Map backend DTO/protocol into UI/domain models.
