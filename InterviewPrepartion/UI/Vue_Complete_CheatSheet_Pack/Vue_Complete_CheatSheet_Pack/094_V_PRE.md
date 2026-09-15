# v-pre

## What / Why

Skips compilation for subtree.

## Mental Model

```text
v-pre
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-pre
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for literal mustache/template demos.

## Common Mistake / Interview Trap

Rare in normal apps.

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

> **v-pre:** Skips compilation for subtree.
