# DevTools

## What / Why

Vue DevTools inspects components, Pinia, events and performance.

## Mental Model

```text
browser devtools
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: DevTools
</script>

<template>
  <div>DevTools</div>
</template>
```

## When to Use

Use for runtime diagnosis.

## Common Mistake / Interview Trap

Production monitoring still needs telemetry.

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

> **DevTools:** Vue DevTools inspects components, Pinia, events and performance.
