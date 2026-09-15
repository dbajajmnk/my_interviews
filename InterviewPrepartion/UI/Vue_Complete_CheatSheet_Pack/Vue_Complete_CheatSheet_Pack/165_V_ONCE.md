# v-once

## What / Why

Skips future updates to static runtime subtree.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-once
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only when values truly never change.

## Common Mistake / Interview Trap

Can render stale values.

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

> **v-once:** Skips future updates to static runtime subtree.
