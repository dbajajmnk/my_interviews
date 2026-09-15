# v-html

## What / Why

Injects raw HTML.

## Mental Model

```text
<div v-html='trustedHtml'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-html
</script>

<template>
  <div>v-html</div>
</template>
```

## When to Use

Use only with trusted/sanitized content.

## Common Mistake / Interview Trap

Major XSS risk.

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

> **v-html:** Injects raw HTML.
