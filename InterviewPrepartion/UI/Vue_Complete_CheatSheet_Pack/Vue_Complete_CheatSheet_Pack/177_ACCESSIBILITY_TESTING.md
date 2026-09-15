# Accessibility Testing

## What / Why

Use semantic DOM + automated and manual checks.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Accessibility Testing
</script>

<template>
  <div>Accessibility Testing</div>
</template>
```

## When to Use

Use in component/design-system testing.

## Common Mistake / Interview Trap

Automated tools miss many issues.

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

> **Accessibility Testing:** Use semantic DOM + automated and manual checks.
