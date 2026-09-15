# Teleport Modal Bug

## What / Why

CSS/SSR target/focus differs after teleport.

## Mental Model

```text
target container + focus trap
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport Modal Bug
// Use the concrete API described above in real code.
</script>
```

## When to Use

Test DOM context.

## Common Mistake / Interview Trap

Teleport changes DOM position but not component ownership.

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

> **Teleport Modal Bug:** CSS/SSR target/focus differs after teleport.
