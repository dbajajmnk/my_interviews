# Retry Strategy

## What / Why

Retry only transient safe operations with limits/backoff.

## Mental Model

```text
attempt → backoff → retry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Retry Strategy
</script>

<template>
  <div>Retry Strategy</div>
</template>
```

## When to Use

Use deliberately.

## Common Mistake / Interview Trap

Blind retries can duplicate mutations or overload services.

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

> **Retry Strategy:** Retry only transient safe operations with limits/backoff.
