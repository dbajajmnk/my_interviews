# i18n Awareness

## What / Why

Vue I18n ecosystem handles locale/messages/formatting.

## Mental Model

```text
locale → messages → template
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: i18n Awareness
</script>

<template>
  <div>i18n Awareness</div>
</template>
```

## When to Use

Use for international apps.

## Common Mistake / Interview Trap

Locale state should have one clear owner.

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

> **i18n Awareness:** Vue I18n ecosystem handles locale/messages/formatting.
