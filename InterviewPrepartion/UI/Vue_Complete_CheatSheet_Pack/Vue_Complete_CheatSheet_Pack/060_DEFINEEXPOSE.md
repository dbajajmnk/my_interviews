# defineExpose

## What / Why

Controls what parent template ref can access from script setup component.

## Mental Model

```text
defineExpose({focus})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineExpose
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for small imperative public APIs.

## Common Mistake / Interview Trap

Do not expose internal state broadly.

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

> **defineExpose:** Controls what parent template ref can access from script setup component.
