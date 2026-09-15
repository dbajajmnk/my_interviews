# Microfrontend Integration

## What / Why

Vue can participate via route composition, Module Federation, single-spa, Web Components, iframe, etc.

## Mental Model

```text
shell → Vue MFE
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Microfrontend Integration
</script>

<template>
  <div>Microfrontend Integration</div>
</template>
```

## When to Use

Use only when team/deployment autonomy requires.

## Common Mistake / Interview Trap

Do not use MFEs for ordinary component modularity.

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

> **Microfrontend Integration:** Vue can participate via route composition, Module Federation, single-spa, Web Components, iframe, etc.
