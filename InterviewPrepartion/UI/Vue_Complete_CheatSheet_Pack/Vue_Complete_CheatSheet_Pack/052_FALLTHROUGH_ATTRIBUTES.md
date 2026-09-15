# Fallthrough Attributes

## What / Why

Unrecognized attrs/listeners can fall through to root element.

## Mental Model

```text
$attrs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Fallthrough Attributes
</script>

<template>
  <div>Fallthrough Attributes</div>
</template>
```

## When to Use

Use wrapper components carefully.

## Common Mistake / Interview Trap

Multi-root components require explicit attribute routing.

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

> **Fallthrough Attributes:** Unrecognized attrs/listeners can fall through to root element.
