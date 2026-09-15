# Version Check

## What / Why

Inspect package.json/npm.

## Mental Model

```text
npm view vue version
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Version Check
</script>

<template>
  <div>Version Check</div>
</template>
```

## When to Use

Use before upgrades.

## Common Mistake / Interview Trap

Stable and prerelease tags differ.

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

> **Version Check:** Inspect package.json/npm.
