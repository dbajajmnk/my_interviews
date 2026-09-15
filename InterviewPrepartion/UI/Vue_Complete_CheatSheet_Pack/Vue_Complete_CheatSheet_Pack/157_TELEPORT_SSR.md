# Teleport SSR

## What / Why

Teleported content needs special SSR placement/handling.

## Mental Model

```text
ctx.teleports
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use dedicated target containers.

## Common Mistake / Interview Trap

Avoid targeting body in custom SSR hydration scenarios.

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

> **Teleport SSR:** Teleported content needs special SSR placement/handling.
