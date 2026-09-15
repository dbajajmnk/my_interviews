# Template Refs

## What / Why

Reference DOM elements or child component instances.

## Mental Model

```text
const input=useTemplateRef('input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Template Refs
</script>

<template>
  <div>Template Refs</div>
</template>
```

## When to Use

Use for imperative DOM/component APIs.

## Common Mistake / Interview Trap

Avoid reaching into child internals.

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

> **Template Refs:** Reference DOM elements or child component instances.
