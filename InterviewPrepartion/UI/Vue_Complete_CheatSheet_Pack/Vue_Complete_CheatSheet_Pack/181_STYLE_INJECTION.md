# Style Injection

## What / Why

User-controlled style values can enable UI redressing or unsafe CSS behavior.

## Mental Model

```text
style binding
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Style Injection
</script>

<template>
  <div>Style Injection</div>
</template>
```

## When to Use

Allowlist style fields.

## Common Mistake / Interview Trap

Avoid binding raw style objects from untrusted users.

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

> **Style Injection:** User-controlled style values can enable UI redressing or unsafe CSS behavior.
