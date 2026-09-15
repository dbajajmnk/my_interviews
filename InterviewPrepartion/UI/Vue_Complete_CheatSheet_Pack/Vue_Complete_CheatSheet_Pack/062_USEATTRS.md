# useAttrs

## What / Why

Accesses fallthrough attributes.

## Mental Model

```text
useAttrs()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useAttrs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for wrappers/advanced forwarding.

## Common Mistake / Interview Trap

Attrs object is not fully reactive for watcher use.

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

> **useAttrs:** Accesses fallthrough attributes.
