# Global Properties

## What / Why

app.config.globalProperties exposes app globals.

## Mental Model

```text
$api/$t etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Global Properties
</script>

<template>
  <div>Global Properties</div>
</template>
```

## When to Use

Use sparingly for framework-style APIs.

## Common Mistake / Interview Trap

Prefer imports/provide-inject/composables for testability.

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

> **Global Properties:** app.config.globalProperties exposes app globals.
