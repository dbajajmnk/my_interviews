# Headless Component Pattern

## What / Why

Expose behavior/state through slots/composables without fixed styling.

## Mental Model

```text
headless primitive → styled wrapper
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Headless Component Pattern
</script>

<template>
  <div>Headless Component Pattern</div>
</template>
```

## When to Use

Use for design systems.

## Common Mistake / Interview Trap

Accessibility behavior must be part of contract.

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

> **Headless Component Pattern:** Expose behavior/state through slots/composables without fixed styling.
