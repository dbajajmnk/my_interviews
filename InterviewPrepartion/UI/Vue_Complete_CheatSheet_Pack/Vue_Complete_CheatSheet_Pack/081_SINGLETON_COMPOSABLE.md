# Singleton Composable

## What / Why

Module-scope reactive state is shared across component instances.

## Mental Model

```text
const state=ref(...) outside useX
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Singleton Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use intentionally for lightweight shared state.

## Common Mistake / Interview Trap

Can break SSR due to cross-request state leakage.

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

> **Singleton Composable:** Module-scope reactive state is shared across component instances.
