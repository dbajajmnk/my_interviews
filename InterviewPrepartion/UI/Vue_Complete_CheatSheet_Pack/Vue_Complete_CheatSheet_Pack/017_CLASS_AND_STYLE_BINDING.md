# Class and Style Binding

## What / Why

Binds class/style declaratively.

## Mental Model

```text
 :class='{active:isActive}' 
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Class and Style Binding
</script>

<template>
  <div>Class and Style Binding</div>
</template>
```

## When to Use

Use object/array syntax for conditional styling.

## Common Mistake / Interview Trap

Keep design logic readable.

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

> **Class and Style Binding:** Binds class/style declaratively.
