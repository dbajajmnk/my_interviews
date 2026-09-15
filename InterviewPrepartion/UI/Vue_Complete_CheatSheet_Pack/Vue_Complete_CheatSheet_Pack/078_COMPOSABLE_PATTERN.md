# Composable Pattern

## What / Why

Functions named `useX` encapsulate reusable reactive logic.

## Mental Model

```text
useMouse/useAuth/useOrders
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Pattern
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to reuse stateful logic.

## Common Mistake / Interview Trap

Each composable call can create its own state unless state is intentionally external/shared.

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

> **Composable Pattern:** Functions named `useX` encapsulate reusable reactive logic.
