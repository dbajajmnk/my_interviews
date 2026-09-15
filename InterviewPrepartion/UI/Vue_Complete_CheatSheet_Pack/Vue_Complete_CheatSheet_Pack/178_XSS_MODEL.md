# XSS Model

## What / Why

Vue escapes interpolation/attribute strings, but raw HTML and unsafe URLs remain dangerous.

## Mental Model

```text
escaped bindings vs v-html
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: XSS Model
</script>

<template>
  <div>XSS Model</div>
</template>
```

## When to Use

Prefer normal bindings.

## Common Mistake / Interview Trap

Vue is not a sanitizer for arbitrary HTML.

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

> **XSS Model:** Vue escapes interpolation/attribute strings, but raw HTML and unsafe URLs remain dangerous.
