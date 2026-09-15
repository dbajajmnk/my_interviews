# Single-File Components

## What / Why

A `.vue` Single-File Component groups template, script, and style.

## Mental Model

```text
<template> + <script setup> + <style>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Single-File Components
</script>

<template>
  <div>Single-File Components</div>
</template>
```

## When to Use

Use SFCs as the normal production component format.

## Common Mistake / Interview Trap

SFCs require a build setup and are not plain browser-native files.

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

> **Single-File Components:** A `.vue` Single-File Component groups template, script, and style.
