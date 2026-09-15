# Shared Composable State

## What / Why

State at module scope creates shared singleton state.

## Mental Model

```text
const global = ref(0) outside useX
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Shared Composable State
</script>

<template>
  <div>Shared Composable State</div>
</template>
```

## When to Use

Use intentionally for SPA-global state.

## Common Mistake / Interview Trap

Unsafe across SSR requests unless instantiated per request.

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

> **Shared Composable State:** State at module scope creates shared singleton state.
