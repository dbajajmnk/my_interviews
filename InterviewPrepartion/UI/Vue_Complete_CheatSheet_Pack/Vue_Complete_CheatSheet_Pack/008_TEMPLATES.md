# Templates

## What / Why

Templates declaratively describe UI and bindings.

## Mental Model

```text
state → template → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Templates
</script>

<template>
  <div>Templates</div>
</template>
```

## When to Use

Use templates for most Vue applications.

## Common Mistake / Interview Trap

Avoid complex side effects or heavy computation in templates.

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

> **Templates:** Templates declaratively describe UI and bindings.
