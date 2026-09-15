# Teleport

## What / Why

Renders children into a different DOM location.

## Mental Model

```text
component tree → body/modal root
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for modals/popovers.

## Common Mistake / Interview Trap

Logical Vue parentage remains even when DOM location changes.

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

> **Teleport:** Renders children into a different DOM location.
