# Vue Router Mental Model

## What / Why

URL matches route records, guards/loaders run, route components render in RouterView.

## Mental Model

```text
URL → route match → guards/data → view
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Router Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use Vue Router for SPA routing.

## Common Mistake / Interview Trap

Do not manually reimplement history/navigation.

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

> **Vue Router Mental Model:** URL matches route records, guards/loaders run, route components render in RouterView.
