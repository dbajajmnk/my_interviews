# Single File Components

## What / Why

SFCs combine template, script, and style in `.vue` files.

## Mental Model

```text
<template> + <script setup> + <style>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Single File Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use SFCs as the normal component format in build-tool apps.

## Common Mistake / Interview Trap

SFCs require a build step or framework tooling.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **Single File Components:** SFCs combine template, script, and style in `.vue` files.
