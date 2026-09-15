# onServerPrefetch

## What / Why

Fetches async data during SSR before component rendered.

## Mental Model

```text
onServerPrefetch(async()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onServerPrefetch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in low-level SSR or libraries.

## Common Mistake / Interview Trap

Framework data APIs are often better at app scale.

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

> **onServerPrefetch:** Fetches async data during SSR before component rendered.
