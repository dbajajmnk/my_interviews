# script setup

## What / Why

`<script setup>` is compile-time syntax sugar for Composition API in SFCs.

## Mental Model

```text
top-level bindings → template exposure
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: script setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for concise modern components.

## Common Mistake / Interview Trap

Compiler macros such as defineProps do not need imports.

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

> **script setup:** `<script setup>` is compile-time syntax sugar for Composition API in SFCs.
