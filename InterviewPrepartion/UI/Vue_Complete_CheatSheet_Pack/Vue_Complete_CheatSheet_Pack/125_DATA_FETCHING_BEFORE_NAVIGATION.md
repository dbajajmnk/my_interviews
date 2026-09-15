# Data Fetching Before Navigation

## What / Why

Fetch/resolve before completing navigation.

## Mental Model

```text
route → fetch → render
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Fetching Before Navigation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when data is required before page display.

## Common Mistake / Interview Trap

Navigation can feel blocked without progress indication.

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

> **Data Fetching Before Navigation:** Fetch/resolve before completing navigation.
