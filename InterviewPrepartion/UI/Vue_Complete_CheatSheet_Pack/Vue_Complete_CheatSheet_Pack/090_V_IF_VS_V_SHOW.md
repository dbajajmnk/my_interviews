# v-if vs v-show

## What / Why

v-if mounts/unmounts; v-show toggles CSS display.

## Mental Model

```text
branch creation vs visibility toggle
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-if vs v-show
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose based on toggle frequency and mount cost.

## Common Mistake / Interview Trap

Do not optimize prematurely.

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

> **v-if vs v-show:** v-if mounts/unmounts; v-show toggles CSS display.
