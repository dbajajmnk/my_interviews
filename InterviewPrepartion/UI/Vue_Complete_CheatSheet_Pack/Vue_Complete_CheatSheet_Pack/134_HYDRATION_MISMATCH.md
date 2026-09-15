# Hydration Mismatch

## What / Why

Server and client first render differ.

## Mental Model

```text
time/random/browser state mismatch
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

Make first render deterministic.

## Common Mistake / Interview Trap

Do not suppress warnings instead of fixing architecture.

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

> **Hydration Mismatch:** Server and client first render differ.
