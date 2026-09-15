# Web Vitals

## What / Why

Measure LCP, INP and CLS in field data.

## Mental Model

```text
real user metrics
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Web Vitals
</script>

<template>
  <div>Web Vitals</div>
</template>
```

## When to Use

Use by route/release/device.

## Common Mistake / Interview Trap

Lab benchmarks alone are incomplete.

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

> **Web Vitals:** Measure LCP, INP and CLS in field data.
