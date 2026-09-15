# List Rendering

## What / Why

`v-for` renders repeated content.

## Mental Model

```text
items → keyed children
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: List Rendering
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Do not use array indexes as keys for reordered stateful lists unless identity truly is position.

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

> **List Rendering:** `v-for` renders repeated content.
