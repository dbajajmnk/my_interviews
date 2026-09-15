# Reactive Props Destructure

## What / Why

Vue 3.5 makes destructured props reactive in script setup.

## Mental Model

```text
const {foo='default'}=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Reactive Props Destructure
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use concise typed destructuring.

## Common Mistake / Interview Trap

Compiler transforms accesses; understand behavior when passing values to watchers/functions.

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

> **Reactive Props Destructure:** Vue 3.5 makes destructured props reactive in script setup.
