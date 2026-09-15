# Upgrade Strategy

## What / Why

Read Vue changelog and ecosystem compatibility before minor/major upgrades.

## Mental Model

```text
pin → test → upgrade
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Upgrade Strategy
</script>

<template>
  <div>Upgrade Strategy</div>
</template>
```

## When to Use

Use SemVer carefully.

## Common Mistake / Interview Trap

Vue notes that TypeScript definition changes may occur in minors.

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

> **Upgrade Strategy:** Read Vue changelog and ecosystem compatibility before minor/major upgrades.
