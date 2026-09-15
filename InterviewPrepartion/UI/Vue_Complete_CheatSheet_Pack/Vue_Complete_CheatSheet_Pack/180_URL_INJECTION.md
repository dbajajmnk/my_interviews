# URL Injection

## What / Why

Untrusted URLs can create dangerous navigation/resource behavior.

## Mental Model

```text
href/src
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: URL Injection
</script>

<template>
  <div>URL Injection</div>
</template>
```

## When to Use

Validate/normalize URL on trusted backend/client boundary.

## Common Mistake / Interview Trap

Do not bind arbitrary user-controlled javascript-like URLs.

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

> **URL Injection:** Untrusted URLs can create dangerous navigation/resource behavior.
