# ref vs reactive

## What / Why

ref wraps a value; reactive proxies an object.

## Mental Model

```text
ref.value vs proxy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: ref vs reactive
</script>

<template>
  <div>ref vs reactive</div>
</template>
```

## When to Use

Use based on replacement/destructuring needs.

## Common Mistake / Interview Trap

Destructuring reactive object can lose reactivity.

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

> **ref vs reactive:** ref wraps a value; reactive proxies an object.
