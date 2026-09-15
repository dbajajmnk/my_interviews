# State Ownership

## What / Why

Every state value should have one owner/source of truth.

## Mental Model

```text
local ref / URL / server / Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: State Ownership
</script>

<template>
  <div>State Ownership</div>
</template>
```

## When to Use

Decide ownership before selecting a library.

## Common Mistake / Interview Trap

Duplicated state creates synchronization bugs.

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

> **State Ownership:** Every state value should have one owner/source of truth.
