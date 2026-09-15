# Composable Error Handling

## What / Why

Expose error/status/retry instead of swallowing failures.

## Mental Model

```text
{data,error,pending,retry}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Error Handling
</script>

<template>
  <div>Composable Error Handling</div>
</template>
```

## When to Use

Use predictable async contracts.

## Common Mistake / Interview Trap

Silent catches make UI impossible to reason about.

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

> **Composable Error Handling:** Expose error/status/retry instead of swallowing failures.
