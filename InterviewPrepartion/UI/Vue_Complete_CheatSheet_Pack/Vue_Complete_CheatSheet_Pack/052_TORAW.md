# toRaw

## What / Why

Returns original object behind proxy.

## Mental Model

```text
toRaw(proxy)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRaw
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for diagnostics/interop.

## Common Mistake / Interview Trap

Do not hold raw reference long-term and mutate behind Vue.

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

> **toRaw:** Returns original object behind proxy.
