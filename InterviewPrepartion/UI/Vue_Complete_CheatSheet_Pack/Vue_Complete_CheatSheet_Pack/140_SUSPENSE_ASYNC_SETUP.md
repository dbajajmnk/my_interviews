# Suspense Async Setup

## What / Why

Async setup/components can suspend under Suspense.

## Mental Model

```text
async setup → fallback → resolve
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Suspense Async Setup
</script>

<template>
  <div>Suspense Async Setup</div>
</template>
```

## When to Use

Use for coordinated async boundaries where supported.

## Common Mistake / Interview Trap

Treat Suspense as advanced and test SSR/router interactions.

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

> **Suspense Async Setup:** Async setup/components can suspend under Suspense.
