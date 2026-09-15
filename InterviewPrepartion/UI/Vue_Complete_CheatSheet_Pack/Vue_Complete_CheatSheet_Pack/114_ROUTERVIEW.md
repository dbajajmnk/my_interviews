# RouterView

## What / Why

Renders matched route component.

## Mental Model

```text
<RouterView/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: RouterView
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use layouts/nested routes.

## Common Mistake / Interview Trap

Nested views need clear route record structure.

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

> **RouterView:** Renders matched route component.
