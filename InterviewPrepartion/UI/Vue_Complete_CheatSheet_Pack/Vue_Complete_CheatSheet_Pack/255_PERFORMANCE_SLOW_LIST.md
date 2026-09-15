# Performance Slow List

## What / Why

Too many DOM nodes/unstable props/heavy cells.

## Mental Model

```text
virtualize + stable data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Performance Slow List
// Use the concrete API described above in real code.
</script>
```

## When to Use

Profile first.

## Common Mistake / Interview Trap

v-memo is not a substitute for virtualization.

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

> **Performance Slow List:** Too many DOM nodes/unstable props/heavy cells.
