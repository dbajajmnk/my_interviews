# ARIA

## What / Why

Add ARIA only when semantics need supplementation.

## Mental Model

```text
aria-expanded etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: ARIA
</script>

<template>
  <div>ARIA</div>
</template>
```

## When to Use

Use according to WAI-ARIA patterns.

## Common Mistake / Interview Trap

Bad ARIA can be worse than none.

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

> **ARIA:** Add ARIA only when semantics need supplementation.
