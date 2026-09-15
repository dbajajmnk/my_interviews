# computed setter

## What / Why

Computed can expose get/set for derived writable contracts.

## Mental Model

```text
computed({get,set})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed setter
</script>

<template>
  <div>computed setter</div>
</template>
```

## When to Use

Use sparingly for reversible mapping.

## Common Mistake / Interview Trap

Prefer explicit mutation functions when setter semantics become opaque.

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

> **computed setter:** Computed can expose get/set for derived writable contracts.
